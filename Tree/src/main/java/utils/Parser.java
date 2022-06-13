package utils;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Scanner;


public class Parser {
	

	public void parse() throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		
        Tree root = new Tree("Welt");
        String[][] array = getArrayFromExcel();


        int rows=20; // rows to scan 
        int cols=3; 
        
        long startTime = System.currentTimeMillis();

        //Main Code


        for(int i=1; i < rows ; i++) { // Note :- We start from the i=1 later       
        	Tree pointer=root;
        	for(int j=cols-1; j >= 0 ; j--) {
        		Tree child= new Tree(array[i][j]);
        		Tree child_present=pointer.searchChildren(child);
        		if (child_present==null) // if child not present then add
        			pointer.addComponent(child);
        		
        		//update the pointer 
        		pointer=pointer.searchChildren(child);
        		
        		
                //keyboard.nextInt();
            }
        	//System.out.println(root);
        	//System.out.println("_____________________________________________");
        }
        System.out.println(root);
        //End of the Main Code
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time Taken in milliseconds: "+ elapsedTime);
        
        keyboard.close();

    }
	
	
	public String[][] getArrayFromExcel() throws Exception {
        XSSFWorkbook excelBook = new XSSFWorkbook(new FileInputStream("./data/Book1.xlsx"));
        XSSFSheet excelSheet = excelBook.getSheet("Sheet1");
        int rowNums = excelSheet.getPhysicalNumberOfRows();
        int colNums = 0;
        for (Row row : excelSheet) {
            if (colNums < row.getLastCellNum()) {
                colNums = row.getLastCellNum();
            }
        }
        String[][] array = new String[rowNums][colNums];
        int i = 0;
        for (Row row : excelSheet) {
            int j = 0;
            for (Cell column : row) {
                j = column.getColumnIndex();
                String text = column.getStringCellValue();
                array[i][j] = text;
//                TreeMap.put("" + i + j, new Tree(text));
                j++;
            }
            i++;
        }
        return array;
    }



}