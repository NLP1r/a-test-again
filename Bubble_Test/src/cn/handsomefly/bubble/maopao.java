package cn.handsomefly.bubble;

import java.util.Arrays;

public class maopao {
	public static void main(String[] args) {
		int[] arr = {4,7,5,6,2,8,3,0,5};
		sort(arr);
	}

	private static void sort(int[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int j=0;j<len-1;j++){
			sorted =true;
			for(int i=0;i<len-1-j;i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted =false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break;
			}
		}
		
	}
}
