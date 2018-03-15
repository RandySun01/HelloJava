package cn.edu.hnnu.chap05.sec04;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int arr[] = {1,7,3,8,2};
		System.out.println("以字符串形式输出数组："+Arrays.toString(arr));
		Arrays.sort(arr);  // 给数组排序
		System.out.println("排序后的数组："+Arrays.toString(arr));
		//二分法查找
		System.out.println(Arrays.binarySearch(arr, 1));
		Arrays.fill(arr, 1); // 将指定内容填充到数组中
		System.out.println("填充数组后的字符串："+Arrays.toString(arr));
	}
}
