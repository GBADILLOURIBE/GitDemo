package com.in28minutes.ifstatement.example;

public class SwitchExercices {

	public static void main(String[] args) {

		System.out.println(isWeekDay(33));
		System.out.println(determineNameOfMonth(15));
		System.out.println(determineNameOfDay(6));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {

		case 0:
			return true;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return true;
		default:
			return false;
		}

	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {

		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "That Month doesn´t exist";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {

		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Thursday";
		case 3:
			return "Wendesday";
		case 4:
			return "Tusday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "That day doesn´t exist";
		}

	}

}
