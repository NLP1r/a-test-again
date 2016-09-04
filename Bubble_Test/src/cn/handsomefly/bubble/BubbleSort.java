package cn.handsomefly.bubble;

import java.util.Arrays;

/*
 * 最终版本 考虑存在顺序
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {9,1,2,3,4};
		sort1(arr);
		System.out.println("#######最后############");
		arr = new int[] {9,1,2,3,4};
		sortFinal(arr);
		
	}
	//最终版本
	public static void sortFinal(int[] arr){
		int len = arr.length;
		boolean sorted = true;
		for(int j=0;j<len-1;j++){
			sorted = true;
			
		for(int i = 0;i<len-1;i++){
			
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
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
	
	
	
	
	
	public static void sort1(int[] arr){
		int len = arr.length;
		for(int j=0;j<len-1;j++){
			
		for(int i = 0;i<len-1;i++){
			
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]= temp;
			}
			System.out.println(Arrays.toString(arr));
		}
			
			
		}
	}
}
