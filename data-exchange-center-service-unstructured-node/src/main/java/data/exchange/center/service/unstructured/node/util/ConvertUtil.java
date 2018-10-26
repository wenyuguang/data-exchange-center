package data.exchange.center.service.unstructured.node.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtil {
	
	public static<T> T getValue(Object value,String fieldName,Class<T> clazz){
	
		if (value == null) { // 如果获取参数值为null,则返回null
			return null;
		} else if (!value.equals("")) { // 如果获取参数值不为"",则通过convertGt方法进行类型转换后返回结果
			return convertGt(value, clazz);
		} else if (clazz.getName().equals(String.class.getName())) { // 如果获取参数值为""
			return convertGt(value, clazz);
		} else {// 如果获取参数值为"",并且clazz不是是String类型,则返回null
			return null;
		}
	}
	
	/**
	 * @param <T>
	 * @param value
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertGt(Object value, Class<T> clazz) {
		if (value == null) { // 如果值为null,则返回null
			return null;
		} else if (value.equals("")
				&& !clazz.getName().equals(String.class.getName())) { // 如果value值为"",而且要转为的类型不是string类型，那么就统一返回null，也就是空字符串不能转成任何其他类型的实体，只能返回null
			return null;
		} else if (Date.class.getName().equalsIgnoreCase(clazz.getName())) { // 增加对从String类型到Date
			return (T) convertSTD(value.toString());
		} else if (Integer.class.getName().equalsIgnoreCase(clazz.getName())) {
			return (T) IntconvertSTD(value.toString());
		}else if (Object.class.getName().equalsIgnoreCase(clazz.getName())) {
			return (T) value;
		}
		return (T) value;
	}

	//日期类型的转换
	private static SimpleDateFormat simpleDateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static Date convertSTD(String date){
		try {
			return VeDate.strToDate(VeDate.strDateToDate(String.valueOf(date)));
		} catch (Exception e) {
			return VeDate.strToDate(date);
		}
	}
	
	public static Integer IntconvertSTD(String src){
		try {
			return Integer.valueOf(src);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String convertDTS(Date date){
		return simpleDateFormate.format(date);
	}
	
}
