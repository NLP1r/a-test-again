package com.innerType;

public class StringComp implements java.util.Comparator<String>{
	/*
	 * 按照长度比较大小
	 * 排队规则的业务类
	 */
	public int compare(String o1,String o2){
		int len1 = o1.length();
		int len2 = o2.length();
		return len1-len2;
		
	}	
	
	
	
}

