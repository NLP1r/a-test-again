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
	//�ڶ��汾������ÿһ�˵Ĵ���
	public static void sortFinal(int[] arr){
			boolean sorted= true;
			int len =arr.length;
			for(int j=0;j<len-1;j++){ //����
				sorted =true; //�ٶ�����
				for(int i=0;i<len-1-j;i++){ //����
					if(arr[i]>arr[i+1]){
						int temp = arr[i];
						arr[i] =arr[i+1];
						arr[i+1] =temp;
						sorted =false; //�ٶ�ʧ��
					}
					System.out.println(Arrays.toString(arr));
				}
				if(sorted){ //��������
					break;
				}
			}
		}

	
}
