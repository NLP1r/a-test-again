package cn.handsomefly.bubble;

import java.util.Arrays;

public class testbullble {
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int[] arr = {9,1,2,4,3};
		
		sortFinal(arr);
	}
	//第二版本，减少每一趟的次数
	public static void sortFinal(int[] arr){
			boolean sorted= true;
			int len =arr.length;
			for(int j=0;j<len-1;j++){ //趟数
				sorted =true; //假定有序
				for(int i=0;i<len-1-j;i++){ //次数
					if(arr[i]>arr[i+1]){
						int temp = arr[i];
						arr[i] =arr[i+1];
						arr[i+1] =temp;
						sorted =false; //假定失败
					}
					System.out.println(Arrays.toString(arr));
				}
				if(sorted){ //减少趟数
					break;
				}
			}
		}

	
}
