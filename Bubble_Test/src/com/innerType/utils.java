package com.innerType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class utils {
	/*
	 * List的排序使用比较器
	 */
	public static <T>void sortFinal(List<T> list,Comparator<T> com){
				//先转换成数组
				Object[] arr = list.toArray();
				sortFinal(arr,com);
				//然后改变容器中对应的值
				for(int i=0;i<arr.length;i++){
					list.set(i,(T)(arr[i]));
				}
		
		
		
	}
	
	
	
	
	/*
	 * 数组排序	(降序)+Comparator接口
	 */
	public static <T>void sortFinal(Object[] arr，Comparator<T> com){
		boolean sorted = true;
		int len = arr.length;
		
		for(int j=0;j<len-1;j++){
			sorted = true;
			
		for(int i = 0;i<len-1;i++){
			
			if(com.compare((T)arr[i], (T)arr[i+1])<0){
				Object temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]= temp;
				sorted = false;
			}
			System.out.println(Arrays.toString(arr));
		}
		if(sorted = true){
			break;
		}
		}
		
		
		
		
		
		
	
		
		
	}
	
	
	
	
	
	
	
	/*
	 * 容器排序
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		//先转换成数组
		Object[] arr = list.toArray();
		sortFinal(arr);
		//然后改变容器中对应的值
		for(int i=0;i<arr.length;i++){
			list.set(i,(T)(arr[i]));
		}
	}
	
	
	
	/*
	 * 使用泛型方法数组排序
	 */
	public static <T extends Comparable<T>> void sort(T[] arr){
		boolean sorted = true;
		int len = arr.length;
		
		for(int j=0;j<len-1;j++){
			sorted = true;
			
		for(int i = 0;i<len-1;i++){
			
			if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
				T temp =  arr[i];
				arr[i]=arr[i+1];
				arr[i+1]= temp;
				sorted = false;
			}
			System.out.println(Arrays.toString(arr));
		}
		if(sorted = true){
			break;
		}
		}
	}
	
	
	
	
	
	
	
	
	
	/*
	 * 数组排序	(降序)
	 */
	public static void sortFinal(Object[] arr){
		boolean sorted = true;
		int len = arr.length;
		
		for(int j=0;j<len-1;j++){
			sorted = true;
			
		for(int i = 0;i<len-1;i++){
			
			if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
				Object temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]= temp;
				sorted = false;
			}
			System.out.println(Arrays.toString(arr));
		}
		if(sorted = true){
			break;
		}
		}
	
	
	
	}
}
