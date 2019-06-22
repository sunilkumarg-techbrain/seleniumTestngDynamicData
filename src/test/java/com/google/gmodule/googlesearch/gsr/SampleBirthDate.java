package com.google.gmodule.googlesearch.gsr;
import java.util.GregorianCalendar;
public class SampleBirthDate {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		int dayOfYearCount = 0;
		int monthCount = 0;
		int year = randBetween(1990, 2010);
		gc.set(gc.YEAR, year);
		int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
		gc.set(gc.DAY_OF_YEAR, dayOfYear);
		String month = Integer.toString(gc.get(gc.MONTH));
        String dayOfYearString = Integer.toString(gc.get(gc.DAY_OF_MONTH));
        for (int i = 0, len = dayOfYearString.length(); i < len; i++) {
			if (Character.isDigit(dayOfYearString.charAt(i))) {
				dayOfYearCount++;
			}
		}
        for (int i = 0, len = month.length(); i < len; i++) {
			if (Character.isDigit(month.charAt(i))) {
				monthCount++;
			}
		}
		if (monthCount == 1 && dayOfYearCount ==1) {
			System.out.println("0" +(gc.get(gc.MONTH) + 1) + "/" + "0" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
		} 
		else if (monthCount == 1) {
			System.out.println("0" +(gc.get(gc.MONTH) + 1) + "/" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
		} 
		else if (dayOfYearCount ==1) {
			System.out.println((gc.get(gc.MONTH) + 1) + "/" + "0" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
		} 
		else {
			System.out.println((gc.get(gc.MONTH) + 1) + "/" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
		}
	}
	public static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
}