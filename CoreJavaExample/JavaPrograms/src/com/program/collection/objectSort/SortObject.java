package com.program.collection.objectSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortObject {
	public static void main(String[] args) {
		WorkOuts workOut1 = new WorkOuts("Monday", "Chest", 5, 5);
		WorkOuts workOut2 = new WorkOuts("Tuesday", "Back", 6, 5);
		WorkOuts workOut3 = new WorkOuts("Wednesday", "Legs", 1, 5);
		WorkOuts workOut4 = new WorkOuts("Friday", "Abs", 13, 5);
		WorkOuts workOut5 = new WorkOuts("Saturday", "Biceps", 15, 5);
		
		List<WorkOuts> workOuts = new ArrayList<>();
		workOuts.add(workOut1);
		workOuts.add(workOut2);
		workOuts.add(workOut3);
		workOuts.add(workOut4);
		workOuts.add(workOut5);
		System.out.println("=============================");
		System.out.println("Before Sort");
		System.out.println("=============================");
		printList(workOuts);
		Arrays.sort(workOuts);
		System.out.println("=============================");
		System.out.println("After Sort");
		System.out.println("=============================");
		printList(workOuts);

	}

	public static void printList(List<WorkOuts> workOuts) {
		for (WorkOuts woOut : workOuts) {
			System.out.println("Days==>" + woOut.getDays() + " WorkOut==>" + woOut.getWorkout() + " Reps==>"
					+ woOut.getReps() + " Sets==>" + woOut.getSets());
		}
	}

}
