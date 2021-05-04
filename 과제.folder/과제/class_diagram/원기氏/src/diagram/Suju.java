package diagram;

import java.util.Calendar;

public class Suju {

	private int sujuNum;
	private String sujuDay;

	public String getSujuDay() {
		Calendar cd = Calendar.getInstance();

		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH) + 1;
		int day = cd.get(Calendar.DAY_OF_MONTH);

		String date = year + "-" + month + "-" + day;
		sujuDay = date;
		return sujuDay;
	}

	public void setSujuDay(String sujuDay) {
		
		this.sujuDay = sujuDay;
	}

}
