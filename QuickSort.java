import java.util.Arrays;

/**
 * 快速排序
 * @since 2016-04-08
 * @author werdedeage
 */
public class QuickSort {
  public static void main(String[] args) {
		int[] a = {21, 2, 9, 72, 28, 90, 52, 8, 9, 3};
		System.out.println("排序前：\n" + Arrays.toString(a));
		quickSort(a);
		System.out.println("排序后：\n" + Arrays.toString(a));
	}

  	//快速排序
	private static void quickSort(int[] a) {
		quickSortPart(a, 0, a.length-1);
	}
	
	//部分快速排序
	private static void quickSortPart(int[] a, int low, int high) {
		if(low < high){
			int middle = split(a, low, high);
			quickSortPart(a, low, middle - 1);
			quickSortPart(a, middle + 1, high);
		}
	}
	
	//折成两半
	private static int split(int[] a, int low, int high) {
		int temp = a[low];
		while (low < high) {
			if(a[high] >= temp && low < high){
				high--;
			}
			a[low] = a[high];
			if(a[low] <= temp && low < high){
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}
}
