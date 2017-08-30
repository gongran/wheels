package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	public static void main(String[] args) {

	}
	@Test
	public void testGetYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date date = new Date();
		String year = sdf.format(date);
		System.out.println(year);
	}
	
	@Test
	public void testGetYearM(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();//获取当前时间    
		Calendar calendar = Calendar.getInstance();    
		calendar.setTime(date);    
		calendar.add(Calendar.YEAR, -5);//当前时间减去一年，即一年前的时间    
		date=calendar.getTime();
		System.out.println( dateFormat.format(date));
	}
}
