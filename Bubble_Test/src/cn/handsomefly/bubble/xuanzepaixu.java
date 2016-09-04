package cn.handsomefly.bubble;

import java.util.Arrays;

public class xuanzepaixu {
	public static void main(String[] args) {
		int[] arr = {1,4,6,2,8,3,0};
		choose(arr);
		System.out.println("||||||||||||||||||||||||||");
		arr = new int[]{1,4,6,2,8,3,0,9};
		insert(arr);
	}

	private static void insert(int[] arr) {
		int len = arr.length;
		for(int i=1;i<len;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

	private static void choose(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len;i++){
			int min = i;
			for(int j =i+1;j<len;j++){
				if(arr[j]<arr[min]){
					min =j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
}
