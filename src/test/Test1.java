package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**

 * <p>Title: Test1</p>  

 * <p>Description: ʱ�䷽����ϰ</p>  

 * @author yangshuxin 

 * @date 2018��10��23��
 */
public class Test1 {
	/**
	
	 * <p>Title: main</p>  
	
	 * <p>Description: </p>  
	
	 * @param args
	  
	 * @author yangshuxin
	 */
	public static void main(String[] args) {
		
		Date date1 = new Date();//ʱ��1
		//��ʱ1��
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date2 = new Date();//ʱ��2
		
		//ʱ���ʽ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str1 = sdf.format(date1);
		//long long1 = Integer.parseInt(str1);
		String str2 = sdf.format(date2);
		try {
			String time1 = "2018-08-08 01:05:06";
			String time2 = "2018-08-08 03:51:06";
			String time3 = time1.substring(0, 16);
			String time4 = time2.substring(0, 16);
			Date date3 = sdf2.parse(time3);
			Date date4 = sdf2.parse(time4);
			long b = date3.getTime();//1970-01-01���ĺ�����
			long d = date4.getTime();//1970-01-01���ĺ�����
			long e = (d - b) / (1000 * 60 );
			long f = (d - b) % (1000 * 60 );
			double g = e/60;
			long h = e%60;
			double k = (double)h / 60;
			BigDecimal n = new BigDecimal(g+k);
			BigDecimal m = n.setScale(2, RoundingMode.HALF_DOWN);
	
			System.out.println(m);
			System.out.println("time3	:"+time3);
			System.out.println("time4	:"+time4);
			System.out.println("date3	:"+date3);
			System.out.println("date4	:"+date4);
			System.out.println("b	:"+b);
			System.out.println("d	:"+d);
			System.out.println("e	:"+e);
			System.out.println("f	:"+f);
			String str = time1.substring(5, 9);
			//String []arr = time1.split(" ");
			//System.out.println(arr.length);
			System.out.println(str);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		boolean flag1 = date2.after(date1);
		boolean flag2 = date2.before(date1);
		int a = date1.compareTo(date2);
		
		
		String c = date1.toString();
		System.out.println("date1 	:"+date1);
		System.out.println("date2	:"+date2);
		System.out.println("str1    :"+str1);
		System.out.println("str2	:"+str2);
		System.out.println("flag1	:"+flag1);
		System.out.println("flag2	:"+flag2);
		System.out.println("a    	:"+a);
		//System.out.println("b	:"+b);
		System.out.println("c	:"+c);
		
	}
	
	/**
	 * 
	
	 * <p>Title: a</p>  
	
	 * <p>Description: </p>  
	
	  
	 * @author yangshuxin
	 */
	public void a(){
//		String start_date = "2018-08-08 05:06:04";
//		String time = "2018-08-01 06:08:04";
//		Date startDate;//��Stringת��Ϊdate
//		Date startDate2;//��Stringת��Ϊdate
//		startDate = DateUtil.string2UtilDateYMD(start_date);
//		startDate2 = DateUtil.string2UtilDateYMD(time);
//		Calendar startDate_cal = Calendar.getInstance();//��dateתΪCalendar
//		Calendar startDate_cal2 = Calendar.getInstance();//��dateתΪCalendar
//		startDate_cal.setTime(startDate);               
//		startDate_cal2.setTime(startDate2);               
//		long a = startDate_cal.getTimeInMillis();//��CalendarתΪlong
//		long b = startDate_cal2.getTimeInMillis();//��CalendarתΪlong
//		long c = a - b;
//		int d = (int) (c / (1000 * 60 * 60));
	}

}
