package com.innerType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class utils {
	/*
	 * List������ʹ�ñȽ���
	 */
	public static <T>void sortFinal(List<T> list,Comparator<T> com){
				//��ת��������
				Object[] arr = list.toArray();
				sortFinal(arr,com);
				//Ȼ��ı������ж�Ӧ��ֵ
				for(int i=0;i<arr.length;i++){
					list.set(i,(T)(arr[i]));
				}
		
		
		
	}
	
	
	
	
	/*
	 * ��������	(����)+Comparator�ӿ�
	 */
	public static <T>void sortFinal(Object[] arr��Comparator<T> com){
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
	 * ��������
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		//��ת��������
		Object[] arr = list.toArray();
		sortFinal(arr);
		//Ȼ��ı������ж�Ӧ��ֵ
		for(int i=0;i<arr.length;i++){
			list.set(i,(T)(arr[i]));
		}
	}
	
	
	
	/*
	 * ʹ�÷��ͷ�����������
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
	 * ��������	(����)
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
