package mss.poi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mainExcel {
	
	public static final String EXCEL_XLS = "C:\\CursoSpring\\git\\cursospring\\spring5-di-demo\\src\\main\\resources\\SOTO_Contador.xls";
	public static final String EXCEL_XLSX = "C:\\CursoSpring\\git\\cursospring\\spring5-di-demo\\src\\main\\resources\\SOTO_Contador.xlsx";
	public static final String EXCEL_CSV = "C:\\CursoSpring\\git\\cursospring\\spring5-di-demo\\src\\main\\resources\\SOTO_Contador.csv";
	public static final String EXCEL_NO_EXISTENTE = "C:\\CursoSpring\\git\\cursospring\\spring5-di-demo\\src\\main\\resources\\Sxxxx";
	
	public static void main(String[] args) {
	
		List<String[]> dataOut = new ArrayList<String[]>();
		 JavaPoiUtils javaPoiUtils = new JavaPoiUtils();
		 dataOut = javaPoiUtils.readExcel(EXCEL_XLSX);
		 writeDataOut(dataOut);
		

	}



	public static void writeDataOut (List<String[]> dataOut) {
		
		for (Iterator iterator = dataOut.iterator(); iterator.hasNext();) {
			String[] strings = (String[]) iterator.next();
			for (int i = 0; i < strings.length; i++) {
				String string = strings[i];
				System.out.print(string+", ");
			}
			System.out.println("");
		}
		
	}
	
}
