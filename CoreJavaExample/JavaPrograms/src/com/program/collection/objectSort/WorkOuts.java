package com.program.collection.objectSort;

import java.util.Comparator;

public class WorkOuts implements Comparable<WorkOuts> {
	private String days;
	private String workout;
	private Integer reps;
	private Integer sets;

	public WorkOuts(String days, String workout, Integer reps, Integer sets) {
		super();
		this.days = days;
		this.workout = workout;
		this.reps = reps;
		this.sets = sets;
	}
	
	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public Integer getSets() {
		return sets;
	}

	public void setSets(Integer sets) {
		this.sets = sets;
	}

	@Override
	public int compareTo(WorkOuts o) {
		int repsNo = o.getReps();
		// ascending order
		// return this.reps - repsNo;
		// descending order
		return repsNo - this.reps;
	}
	
	public static Comparator<WorkOuts> workOutDaysComparator =  new Comparator<WorkOuts>() {
		@Override
		public int compare(WorkOuts o1, WorkOuts o2) {
			String day1 =  o1.getDays();
			String day2 = o2.getDays();
			return day1.compareTo(day2);
		}
	};
	
	@Override
	public String toString() {
		return "WorkOuts [days=" + days + ", workout=" + workout + ", reps=" + reps + ", sets=" + sets + "]";
	}

}
