package com.poly.utils;

public class StringUtils {
	public static String upperCaseFirstChar(String value) {
		return value.substring(0, 1).toUpperCase()+value.substring(1);
	}
}
