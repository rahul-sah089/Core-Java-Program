package findDuplicate;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate1 {
	
	public static void main(String[] args){
		List<Integer> orginalList = new ArrayList<Integer>();
		List<Integer> recordedList = new ArrayList<Integer>();
		orginalList.add(12);
		orginalList.add(1);
		orginalList.add(2);
		orginalList.add(24);
		orginalList.add(32);
		orginalList.add(34);
		orginalList.add(12);
		List<Integer> duplicateList = new ArrayList<Integer>(orginalList);
		
		for(int i = 0; i < orginalList.size();i++){
			for(int j = i+1 ; j < duplicateList.size();j++){
				if(orginalList.get(i).equals(duplicateList.get(j))){
					recordedList.add(orginalList.get(i));
				}
			}
		}
		printArr(recordedList);
	}
	
	public static void printArr(List<Integer> arr){
		for(int i= 0 ; i< arr.size() ;i++){
			System.out.println(""+arr.get(i));
		}
	}
}
