package com.logical;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateAfterDays {
	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar  c = Calendar.getInstance();
		c.add(Calendar.DATE, 1500);
		
		System.out.println(df.format(c.getTime()));
	}
}
