package mss.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaPoiUtils {

	
	private static final char EXTENSION_SEPARATOR = '.';
	private static final String EXT_XLS = "xls";
	private static final String EXT_XLSX = "xlsx";
	
	public List<String[]> readExcel (String excelFile) {
		List<String[]> listArrayRows = new ArrayList<String[]>();
		InputStream excelStream = null;
		try {
			excelStream = new FileInputStream(excelFile);
			
			if (isExtension(getExtension(excelFile), EXT_XLS)) {
				listArrayRows = readExcelXLS(excelStream);
			}
			
			if (isExtension(getExtension(excelFile), EXT_XLSX)) {
				listArrayRows = readExcelXLSX(excelStream);
			}
			
			else throw new IOException();
		} catch (FileNotFoundException fileNotFoundException) {
			 System.out.println("No se encontró el fichero: " + fileNotFoundException);
		} catch (IOException ex) {
			System.out.println("Error al procesar el fichero: " + ex);
		}finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println("Error al procesar el fichero después de cerrarlo: " + ex);
            }
        }
		
		return listArrayRows;
	}
	
	
    public static String getExtension(String fullPath) {
        int index = fullPath.lastIndexOf(EXTENSION_SEPARATOR);
        if (index == -1) {
              return "";
        } else {
              return fullPath.substring(index + 1);
        }
    }
	
    
	public static String getFilename(String fullPath) { 
		    int dot = fullPath.lastIndexOf(EXTENSION_SEPARATOR);
		    int sep = fullPath.lastIndexOf(File.separator);
		    return fullPath.substring(sep + 1, dot);
	}
	
	
    private List<String[]> readExcelXLS(InputStream excelStream) throws IOException{
        List<String[]> listArrayRows = new ArrayList<String[]>();
       
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
        HSSFRow hssfRow;

        for (int r = 0; r < hssfSheet.getLastRowNum(); r++) {
            hssfRow = hssfSheet.getRow(r);
            if (hssfRow == null){
                break;
            }else{
            	String[] arrayRows = {};
                for (int c = 0; c < hssfRow.getLastCellNum(); c++) {
                    arrayRows = append(arrayRows, getCellValue(hssfRow.getCell(c)));
                }
                listArrayRows.add(arrayRows);
            }
        }    

        hssfWorkbook.close();
        return listArrayRows;
    }
    
    
    private List<String[]> readExcelXLSX(InputStream excelFileToRead) throws IOException {
    	List<String[]> listArrayRows = new ArrayList<String[]>();

    	XSSFWorkbook  xssWorkbook = new XSSFWorkbook(excelFileToRead);
		XSSFSheet sheet = xssWorkbook.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

		Iterator<Row> rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row=(XSSFRow) rows.next();
			Iterator<Cell> cells = row.cellIterator();
			String[] arrayRows = {};
			while (cells.hasNext()) {
				cell=(XSSFCell) cells.next();
                arrayRows = append(arrayRows, getCellValue(cell));
			}
			listArrayRows.add(arrayRows);
		}
		
		xssWorkbook.close();
		return listArrayRows;
	}
    

    private static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }
    
	private boolean isExtension (String origen, String expected) {
		return origen!=null && expected != null && origen.toLowerCase().equals(expected);
	}
	
    private String getCellValue (Cell cell) {
    	String cellValue;
    	switch (cell.getCellTypeEnum()) {
		case STRING:
			cellValue = cell.getStringCellValue();
			break;
		case NUMERIC:
			cellValue =""+cell.getNumericCellValue();
			break;
		case BOOLEAN:
			cellValue ="" + cell.getBooleanCellValue();
			break;
		default:
			cellValue ="";
			break;
		}
    	return cellValue;
    }
}