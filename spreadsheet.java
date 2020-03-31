/**
 * Jordan Marshall          18256716
 * Rioghan Lowry            18226531
 * Alannah Ryan             18232132
 * Oran O'Connell McGrath   18256678
 */

public class spreadsheet {
    public String[] sheet;
    public int nextPosition;
    public int nextSheet = 4;
    public String preferredAlphabet = "abcdefghijklmnopqrstuvwxyz" +
                                   "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                                   "0123456789";

    public spreadsheet(){
        // Creates an array with a capacity of 256. It starts with 3 default sheets.
        sheet = new String[256];
        sheet[0] = "Sheet 1";
        nextPosition++;
        sheet[1] = "Sheet 2";
        nextPosition++;
        sheet[2] = "Sheet 3";
        nextPosition++;
    }
    
    // Adds sheet to array in last position SheetN
    public boolean add() {
        if(nextPosition < sheet.length) {
            sheet[nextPosition] = new String("Sheet " + nextSheet);
            nextSheet++;
            nextPosition++;
            return true;
        } else {                                    
            return false;
        }
    }
    
    // Remove sheet using string
    public int remove(String sheetName){
        int removeIndex = index(sheetName);
        if(removeIndex == -1) {
            return -1;
        }
        remove(removeIndex);
        return removeIndex;
    }
    
    // Remove sheet using index
    public String remove(int index){
        if(index > nextPosition || index < 0) {
            return null;
        }
        for(int i = 0; i <= nextPosition; i++) {
            if(i > index) { 
                sheet[i - 1] = sheet[i];
            }
        }
        nextPosition--;
        return sheet[index];
    }
    
    //Moves a sheet
    public int move(String from, String to, boolean before) {
        int total = nextPosition;
        int intTo = index(to);
        int intFrom = index(from);
         
       if(intFrom < 0 || intTo < 0 || intFrom == intTo || intFrom >= total || intTo >= total) {
           return -1;
        } else {
            String temp = sheet[intFrom];
            int Y = intFrom;
            int Z = intTo;
            
            if(intFrom < intTo) {
                if(before == true) {
                    Z--;
                }
                while(Y < Z) {
                    sheet[Y] = sheet[Y + 1];
                    Y++;
                }
                sheet[Z] = temp;
                return 1;
            } else {
                if(before == false) {
                    Z++;
                }
                while(Y > Z) {
                    sheet[Y] = sheet[Y - 1];
                    Y--;
                }
                sheet[Z] = temp;
                return 1;
            }
       }    
    }
    
    //Moves a sheet
    public String move(int from, int to, boolean before) {
       int total = nextPosition;
       if(from < 0 || to < 0 || from == to || from >= total || to >= total) {
           return "No sheet moved";
        } else {
            String temp = sheet[from];
            int Y = from;
            int Z = to;
            
            if(from < to) {
                if(before == true) {
                    Z--;
                }
                while(Y < Z) {
                    sheet[Y] = sheet[Y + 1];
                    Y++;
                }
                sheet[Z] = temp;
                return "Sheet moved";
            } else {
                if(before == false) {
                    Z++;
                }
                while(Y > Z) {
                    sheet[Y] = sheet[Y - 1];
                    Y--;
                }
                sheet[Z] = temp;
                return "Sheet moved";
            }
       }    
    }
    
    //Move to end using index
    public String moveToEnd(int from) {
        if(from < 0 || from > nextPosition) {
            return null;
        }
        String sheetName = sheet[from];
        remove(from);
        sheet[nextPosition] = sheetName;
        nextPosition++;
        return sheetName;
    }  
    
    //Move sheet to end using string
    public int moveToEnd(String from) {
        int index = index(from);
        if(index == -1) {
            return -1;
        }
        remove(from);
        sheet[nextPosition] = from;
        nextPosition++;
        return index;
     }
     
    //Rename sheet
    public int rename(String currentName, String newName) {
        int i;
        for(i = 0; i < nextPosition; i++) {
           if(currentName == newName){
               return -1;
               }else if(sheet[i].compareToIgnoreCase(currentName) == 0){
                    sheet[i] = newName;
                    return i;
           }
        }
           return -1;
    }
    
    // Index position
    public int index(String sheetName) {
        int i ;
        for(i = 0; i < nextPosition; i++) {
            if(sheet[i].compareToIgnoreCase(sheetName) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Index position
    public int index2(String sheetName) {
        int i ;
        for(i = 0; i < nextPosition; i++) {
            if(sheet[i].compareToIgnoreCase(sheetName) == 0) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    
    // Finds sheetName
    public String sheetName(int index) {
        System.out.println(sheet[index]);
        if (sheet[index] == null){
            return null;
        } else{
            return sheet[index];
        }
    }
    
    // Displays array
    public void display() {
        int i ;
        for(i = 0; i < nextPosition; i++) {
            System.out.println(sheet[i]);
        }
    }
    
    //Shows length of spreadsheet
    public int length(){
        System.out.println(nextPosition);
        return nextPosition;
    }
}
   