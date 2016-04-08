import java.util.Arrays;

/**
 * 简单选择排序
 * @since 2016-04-08
 * @author werdedeage
 */
public class SimpleSelectSort {
	public static void main(String[] args) {
		int[] a = {21, 2, 9, 72, 28, 90, 52, 8, 9, 3};
		System.out.println("排序前：\n" + Arrays.toString(a));
		simpleSelectSort(a);
		System.out.println("排序后：\n" + Arrays.toString(a));
	}

	//简单选择排序
	private static void simpleSelectSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}
