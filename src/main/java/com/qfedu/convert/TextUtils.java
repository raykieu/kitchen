package com.qfedu.convert;

public class TextUtils {
	
	public static final String validate_code ="vcode";
	
	
	
	public static boolean empty(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
