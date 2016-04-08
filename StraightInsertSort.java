import java.util.Arrays;

/**
 * 直接插入排序
 * @since 2016-04-08
 * @author werdedeage
 */
public class StraightInsertSort {
	public static void main(String[] args) {
		int[] a = {21, 2, 9, 72, 28, 90, 52, 8, 9, 3};
		System.out.println("排序前：\n" + Arrays.toString(a));
		straightInsertSort(a);
		System.out.println("排序后：\n" + Arrays.toString(a));
	}

	private static void straightInsertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; //要插入的值
			int j;
			for (j = i-1; j >= 0; j--) {
				if(temp < a[j]){ //如果比要插入的值大
					a[j+1] = a[j]; //后移
				} else {
					break;
				}
			}
			a[j+1] = temp;
		}
	}
}
