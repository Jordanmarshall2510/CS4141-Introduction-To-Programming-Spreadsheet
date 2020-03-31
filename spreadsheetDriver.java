/**
 * Jordan Marshall          18256716
 * Rioghan Lowry            18226531
 * Alannah Ryan             18232132
 * Oran O'Connell McGrath   18256678
 */

public class spreadsheetDriver{ 
   public static void main(String[]args){
    spreadsheet workbook;
    workbook = new spreadsheet();
    
    // Prints out List of Sheets
    System.out.println("- - - - - - - - - - Spreadsheet - - - - - - - - - -");
    System.out.println();
    System.out.println("Current List of Sheets");
    workbook.display();
    System.out.println();
    
    // Add new sheet
    System.out.println("Add New Sheet. (5 added for future use)");
    workbook.add();
    workbook.add();
    workbook.add();
    workbook.add();
    workbook.add();
    workbook.display();
    System.out.println();
    
    // Remove a Sheet using String
    System.out.println("Remove a Sheet using String (INPUT = 'Sheet 3')");
    workbook.remove("Sheet 3");
    workbook.display();
    System.out.println();
    
    // Remove a Sheet using Index
    System.out.println("Remove a Sheet using Index (INPUT = '4')");
    workbook.remove(4);
    workbook.display();
    System.out.println();
    
    //Moves sheet using String
    System.out.println("Moves a Sheet using String (INPUT = 'Sheet 2','Sheet 7',true)");
    workbook.move("Sheet 2", "Sheet 7", true);
    workbook.display();
    System.out.println();
       
    //Moves sheet using index     FIX!!!
    System.out.println("Moves a Sheet using index (INPUT = 4, 2, false)");
    workbook.move(4, 2, false);
    workbook.display();
    System.out.println();
    
    // Print moveToEnd using an index
    System.out.println("Move To End using Index (INPUT = 2)");
    workbook.moveToEnd(2);
    workbook.display();
    System.out.println();
    
    // Print moveToEnd using a String
    System.out.println("Move To End using String (INPUT = 'Sheet 2')");
    workbook.moveToEnd("Sheet 2");
    workbook.display();
    System.out.println();
    
    //Rename sheet
    System.out.println("Renames sheet using String (INPUT = 'Sheet 2', 'Renamed Sheet')");
    workbook.rename("Sheet 2", "Renamed Sheet");
    workbook.display();
    System.out.println();
    
    //Find Index using String
    System.out.println("Find Sheet Index using a String (INPUT = 'Sheet 8')");
    workbook.index2("Sheet 8");
    System.out.println();
    
    //Find Sheet Name
    System.out.println("Find Sheet Name using an Index (INPUT = 2)");
    workbook.sheetName(2);
    System.out.println();
    
    // Prints out Current Amount of Sheets
    System.out.println("Current Number of Sheets");
    workbook.length();
    System.out.println();
   }
}
