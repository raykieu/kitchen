package com.qfedu.utils;

public class IsEmptyUtil {
	
	public static boolean isEmpty(String name) {
		if(name == null || name.trim().equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
}
