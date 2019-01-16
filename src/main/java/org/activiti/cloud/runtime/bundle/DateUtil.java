package org.activiti.cloud.runtime.bundle;

import java.sql.Timestamp;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class DateUtil {
	
	/**
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String getNowDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * @return yyyyMMdd
	 */
	public static String getNowDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * @return HHmmss
	 */
	public static String getNowTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * @param dFormat
	 * @return String
	 */
	public static String getDateFormat(String dFormat) {
		SimpleDateFormat formatter = new SimpleDateFormat(dFormat);
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * <pre>
	 * sDate(yyyyMMdd or yyyy-MM-dd)
	 * </pre>
	 * @param sDate
	 * @return day(String)
	 */
	public static int getLastDayOfMonth(String sDate) {
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return 0;
		} else {
			sDate = sDate.replaceAll("-", "");
			if(sDate.length() != 8) {
				return 0;
			} else {
				Calendar cal = Calendar.getInstance();
				cal.set(Integer.parseInt(sDate.substring(0, 4)), (Integer.parseInt(sDate.substring(4, 6))-1), 1); //년월일셋팅
				return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			}
		}
	}

	/**
	 * <pre>
	 * sDate(yyyyMMdd or yyyy-MM-dd)
	 * </pre>
	 * @param sDate
	 * @return int 
	 */
	public static int getDayOfWeek(String sDate) {
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return 0;
		}
		sDate = sDate.replaceAll("-", "");
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(sDate.substring(0, 4)), (Integer.parseInt(sDate.substring(4, 6))-1), Integer.parseInt(sDate.substring(6, 8)));
		int nTmp = cal.get(Calendar.DAY_OF_WEEK);
		return nTmp;
	}
	
	/**
	 * @param dayOfWeek
	 * @return String (1:SUNDAY,2:MONDAY,3:TUESDAY,4:WEDNESDAY,5:THURSDAY,6:FRIDAY,7:SATURDAY)
	 */
	public static String getDayOfWeekName(int dayOfWeek) {
		String dayStrKOR = "";
		switch(dayOfWeek) {
			case 1 :
				dayStrKOR = "SUNDAY";
				break;
			case 2 :
				dayStrKOR = "MONDAY";
				break;
			case 3 :
				dayStrKOR = "TUESDAY";
				break;
			case 4 :
				dayStrKOR = "WEDNESDAY";
				break;
			case 5 :
				dayStrKOR = "THURSDAY";
				break;
			case 6 :
				dayStrKOR = "FRIDAY";
				break;
			case 7 :
				dayStrKOR = "SATURDAY";
				break;
			default :
				dayStrKOR = "";
			break;
		}
		return dayStrKOR;
	}
	
	/**
	 * @param sDate yyyyMMdd or yyyy-MM-dd
	 * @return int 
	 */
	public static int getWeekOfYear(String sDate) {
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return -1;
		}
		sDate = sDate.replaceAll("-", "");
		String yyyy = sDate.substring(0, 4);
		String MM = sDate.substring(4, 6);
		String dd = sDate.substring(6, 8);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(yyyy), Integer.parseInt(MM), Integer.parseInt(dd)); //년월일셋팅
		
		return cal.get(Calendar.WEEK_OF_YEAR);
	}
	
	/**
	 * @param sDate yyyyMMdd or yyyy-MM-dd
	 * @return int 
	 */
	public static int getWeekOfMonth(String sDate) {
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return -1;
		}
		sDate = sDate.replaceAll("-", "");
		String yyyy = sDate.substring(0, 4);
		String MM = sDate.substring(4, 6);
		String dd = sDate.substring(6, 8);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(yyyy), Integer.parseInt(MM), Integer.parseInt(dd)); //년월일셋팅
		
		return cal.get(Calendar.WEEK_OF_MONTH);
	}
	
	/**
	 * @param sDate yyyyMMdd or yyyy-MM-dd
	 * @return int ( -1)
	 */
	public static int getDayOfYear(String sDate) {
		//yyyyMMdd 이거나 yyyy-MM-dd 가 아니면 0리턴
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return -1;
		}
		sDate = sDate.replaceAll("-", "");
		String yyyy = sDate.substring(0, 4);
		String MM = sDate.substring(4, 6);
		String dd = sDate.substring(6, 8);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(yyyy), Integer.parseInt(MM), Integer.parseInt(dd)); //년월일셋팅
		
		return cal.get(Calendar.DAY_OF_YEAR);
	}
	
	/**
	 * @param sDate yyyyMMdd or yyyy-MM-dd
	 * @param delim ex("-")
	 * @return String delim format
	 */
	public static String getDateFormat(String sDate, String delim) {
		if(sDate == null || (sDate.length() != 8 && sDate.length() != 10) || (sDate.length() == 10 && sDate.indexOf("-") == -1)) {
			return "";
		}
		sDate = sDate.replaceAll("-", "");
		
		String yyyy = sDate.substring(0, 4);
		String MM = sDate.substring(4, 6);
		String dd = sDate.substring(6, 8);
		
		String dateFormat = yyyy + delim + MM + delim + dd;
		
		return dateFormat;
		
	}
	
	/**
	 * @param sTime HHmmss or HH:mm:ss
	 * @return String delim format 
	 */
	public static String getTimeFormat(String sTime, String delim) {
		//hhmmss  hh:mm-ss 
		if(sTime == null || (sTime.length() != 6 && sTime.length() != 8) || (sTime.length() == 8 && sTime.indexOf(":") == -1)) {
			return "";
		}
		sTime = sTime.replaceAll(":", "");
		
		String hh = sTime.substring(0, 2);
		String mm = sTime.substring(2, 4);
		String ss = sTime.substring(4, 6);
		
		String timeFormat = hh + delim + mm + delim + ss;
		
		return timeFormat;
		
	}

	/**
	 * @param dFormat
	 * @return String
	 */
	public static String getDateTimeFormat(String sDateTime, String dFormat) {
		if(sDateTime == null || sDateTime.equals("")) {
			return "";
		}
		
		if(dFormat == null || dFormat.equals("")) {
			dFormat = "yyyy-MM-dd HH:mm:ss";
		}
		
		sDateTime = sDateTime.replaceAll("-", "");
		sDateTime = sDateTime.replaceAll(":", "");
		sDateTime = sDateTime.replaceAll(" ", "");
		if(sDateTime.length() != 14) {
			return "";
		} else {
			String yyyy = sDateTime.substring(0, 4);
			String MM = sDateTime.substring(4, 6);
			String dd = sDateTime.substring(6, 8);
			String hh = sDateTime.substring(8, 10);
			String mm = sDateTime.substring(10, 12);
			String ss = sDateTime.substring(12, 14);
			Calendar cal = Calendar.getInstance();
			cal.set(Integer.parseInt(yyyy), Integer.parseInt(MM)-1, Integer.parseInt(dd), Integer.parseInt(hh), Integer.parseInt(mm), Integer.parseInt(ss)); //년월일시분초셋팅
			SimpleDateFormat formatter = new SimpleDateFormat(dFormat);
			return formatter.format(cal.getTime());
		}
	}
	
	/**
	 * @param sDateTime
	 * @return String
	 */
	public static Date getDate(String sDateTime) {
		if(sDateTime == null || sDateTime.equals("")) {
			return null;
		}
		
		sDateTime = sDateTime.replaceAll("-", "");
		sDateTime = sDateTime.replaceAll(":", "");
		sDateTime = sDateTime.replaceAll(" ", "");
		if(sDateTime.length() != 14) {
			return null;
		} else {
			String yyyy = sDateTime.substring(0, 4);
			String MM = sDateTime.substring(4, 6);
			String dd = sDateTime.substring(6, 8);
			String hh = sDateTime.substring(8, 10);
			String mm = sDateTime.substring(10, 12);
			String ss = sDateTime.substring(12, 14);
			Calendar cal = Calendar.getInstance();
			cal.set(Integer.parseInt(yyyy), Integer.parseInt(MM), Integer.parseInt(dd), Integer.parseInt(hh), Integer.parseInt(mm), Integer.parseInt(ss)); //년월일시분초셋팅
			return cal.getTime();
		}
	}

	/**
	 * @param startDate yyyyMMdd or yyyy-MM-dd
	 * @param endDate yyyyMMdd or yyyy-MM-dd
	 * @param type ("YEAR" , "MONTH", "DAY)
	 * @return int 
	 */
	public static int dateDiff(String startDate, String endDate, String type) {
		if(startDate == null || endDate == null || startDate.equals("") || endDate.equals("")
				|| (startDate.length() != 8 && startDate.length() != 10) || (startDate.length() == 10 && startDate.indexOf("-") == -1)
				|| (endDate.length() != 8 && endDate.length() != 10) || (endDate.length() == 10 && endDate.indexOf("-") == -1)) {
			return -1;
		}
		
		startDate = startDate.replaceAll("-", "");
		endDate = endDate.replaceAll("-", "");
		
		if("YEAR".equals(type.toUpperCase())) {
			return Integer.parseInt(startDate.substring(0, 4)) - Integer.parseInt(endDate.substring(0, 4));
		} else if ("MONTH".equals(type.toUpperCase())) {
			return (Integer.parseInt(startDate.substring(0, 4)) - Integer.parseInt(startDate.substring(0, 4))) * 12 
					+ (Integer.parseInt(endDate.substring(4, 6)) - Integer.parseInt(endDate.substring(4, 6)));
		} else if("DAY".equals(type.toUpperCase())) {
			Calendar cal = Calendar.getInstance();
			Calendar cal2 = Calendar.getInstance();
			cal.set(Integer.parseInt(startDate.substring(0, 4)), Integer.parseInt(startDate.substring(4, 6)) - 1, Integer.parseInt(startDate.substring(6, 8)));
			cal2.set(Integer.parseInt(endDate.substring(0, 4)), Integer.parseInt(endDate.substring(4, 6)) - 1, Integer.parseInt(endDate.substring(6, 8)));
			return (int)Math.floor(Math.abs(cal2.getTime().getTime() - cal.getTime().getTime()) / 0x5265c00L);
		} else {
			return -1;
		}
	}

	/**
	 * @param startTime (HHmmss or HH:mm-ss)
	 * @param endTime (HHmmss or HH:mm-ss)
	 * @return int 
	 */
	public static int timeDiff(String startTime, String endTime) {
		if(startTime == null || endTime == null || startTime.equals("") || endTime.equals("")
				|| (startTime.length() != 6 && startTime.length() != 8) || (startTime.length() == 8 && startTime.indexOf(":") == -1)
				|| (endTime.length() != 6 && endTime.length() != 8) || (endTime.length() == 8 && endTime.indexOf(":") == -1)) {
			return -1;
		}
		
		startTime = startTime.replaceAll(":", "");
		endTime = endTime.replaceAll(":", "");
	
		int st_sec = Integer.parseInt(startTime.substring(0, 2)) * 3600
				+ Integer.parseInt(startTime.substring(2, 4)) * 60
				+ Integer.parseInt(startTime.substring(4, 6));
		int to_sec = Integer.parseInt(endTime.substring(0, 2)) * 3600
				+ Integer.parseInt(endTime.substring(2, 4)) * 60
				+ Integer.parseInt(endTime.substring(4, 6));
		return to_sec - st_sec;
	}
	
	/**
	 * @param startDateTime (yyyy-MM-dd HH:mm:ss)
	 * @param endDateTime (yyyy-MM-dd HH:mm:ss)
	 * @return int 
	 */
	public static int compareTo(String startDateTime, String endDateTime) {
		if(startDateTime == null || endDateTime == null || startDateTime.equals("") || endDateTime.equals("")) {
			return -99;
		}
		
		startDateTime = startDateTime.replaceAll("-", "");
		startDateTime = startDateTime.replaceAll(":", "");
		startDateTime = startDateTime.replaceAll(" ", "");
		
		endDateTime = endDateTime.replaceAll("-", "");
		endDateTime = endDateTime.replaceAll(":", "");
		endDateTime = endDateTime.replaceAll(" ", "");
		
		if(startDateTime.length() != 14 || endDateTime.length() != 14) {
			return -99;
		} else {
			String sYyyy = startDateTime.substring(0, 4);
			String sMM = startDateTime.substring(4, 6);
			String sDd = startDateTime.substring(6, 8);
			String sHh = startDateTime.substring(8, 10);
			String sMm = startDateTime.substring(10, 12);
			String sSs = startDateTime.substring(12, 14);
			
			Calendar sCal = Calendar.getInstance();
			sCal.set(Integer.parseInt(sYyyy), Integer.parseInt(sMM), Integer.parseInt(sDd), Integer.parseInt(sHh), Integer.parseInt(sMm), Integer.parseInt(sSs)); //년월일시분초셋팅
			
			String eYyyy = endDateTime.substring(0, 4);
			String eMM = endDateTime.substring(4, 6);
			String eDd = endDateTime.substring(6, 8);
			String eHh = endDateTime.substring(8, 10);
			String eMm = endDateTime.substring(10, 12);
			String eSs = endDateTime.substring(12, 14);
			
			Calendar eCal = Calendar.getInstance();
			eCal.set(Integer.parseInt(eYyyy), Integer.parseInt(eMM), Integer.parseInt(eDd), Integer.parseInt(eHh), Integer.parseInt(eMm), Integer.parseInt(eSs)); //년월일시분초셋팅
			
			return sCal.compareTo(eCal);
		}
	
	}

	/**
	 * TimeMillis  yyyy-MM-dd HH:mm:ss
	 * @param ltimes
	 */
	public static String milsecTotime(String ltimes) {
		
		String timeStampToString = (new Timestamp(Long.parseLong(ltimes))).toString();
		
		return timeStampToString.substring(0, 19);
	}
	
	
	/**
	 * @return today's date
	 * @throws Exception
	 */
    public static String getToday() throws Exception {
		return getDate(new Date(), "yyyyMMdd");
	}
	
	/**
	 *
	 * @param pDate Date 
	 * @param pFormat SimpleDateFormat
	 * @return String
	 */
	public static String getDate(Date pDate, String pFormat) throws Exception {

        if(pDate == null)
            return "";

		StringBuffer ret = new StringBuffer();
		new SimpleDateFormat(pFormat).format(pDate, ret, new FieldPosition(0));
		return ret.toString();
	}

	/**
	 *  String 
	 *
	 * @param strDate String 
	 * @param pFormat SimpleDateFormat
	 * @return 
	 */
	public static Date getDate(String strDate, String pFormat) throws Exception {
		if( strDate == null )
			return null;

		return new SimpleDateFormat(pFormat).parse(strDate, new ParsePosition(0));
	}


	

	/**
	 * @param offset ( -2147483648 ~ 2147483647 )
	 * @return 
	 */
	public static String getOffsetDate(int offset) throws Exception {
	    Date date = new Date();
	    return getOffsetDate(date, offset, "yyyyMMdd");
	}
	
	/**
	 *
	 * @param offset ( -2147483648 ~ 2147483647 )
	 * @return 
	 */
	public static String getOffsetDate(int offset, String pFormat) throws Exception {
	    Date date = new Date();
	    return getOffsetDate(date, offset, pFormat);
	}
	
	/**
	 * @param strDate (String)
	 * @param offset ( -2147483648 ~ 2147483647 )
	 * @return 
	 */
	public static String getOffsetDate(String strDate, int offset) throws Exception {
	    SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
	    Date date = fmt.parse(strDate);
	    return getOffsetDate(date, offset, "yyyyMMdd");
	}
	
	/**
	 * @param strDate (String)
	 * @param offset ( -2147483648 ~ 2147483647 )
	 * @return 
	 */
	public static String getOffsetDate(String strDate, int offset, String pFormat) throws Exception {
	    SimpleDateFormat fmt = new SimpleDateFormat(pFormat);
	    Date date = fmt.parse(strDate);
	    return getOffsetDate(date, offset, pFormat);
	}
	
	
	/**
	 * @param pDate Date 
	 * @param offset ( -2147483648 ~ 2147483647 )
	 * @param pFormat 
	 * @return
	 */
	public static String getOffsetDate(Date pDate, int offset, String pFormat) throws Exception {
	    SimpleDateFormat fmt = new SimpleDateFormat(pFormat);
	    Calendar c = Calendar.getInstance();
	    String ret = "";

	    try {
	        c.setTime(pDate);
	        c.add(Calendar.DAY_OF_MONTH, offset);
	        ret = fmt.format(c.getTime());
	    }
	    catch(Exception e) {
	    }
	    return ret;
	}

}