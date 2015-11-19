package helpers;

import java.util.List;

public class PrintUtils {

	
	public static void printMyRequestModelList(List<MyRequestTableModel> list){
		
		for (MyRequestTableModel myRequestTableModel : list) {
			System.out.println("--- New Entry ---");
			System.out.println("start date: " + myRequestTableModel.getStartDate());
			System.out.println("end date: " + myRequestTableModel.getEndDate());
		}
		
	}
}
