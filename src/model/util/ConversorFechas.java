package model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorFechas {

	public static String dateToString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	public static Date stringToDate(String dateString) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = dateFormat.parse(dateString);
			if (!dateToString(date).equals(dateString)) {
				date = null;
			}
		} catch (ParseException e) {
			date = null;
		}
		return date;
	}

}
