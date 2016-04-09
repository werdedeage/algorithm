import java.util.Arrays;

/**
 * 堆排序
 * @since 2016-04-09
 * @author werdedeage
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] a = {21, 2, 9, 72, 28, 90, 52, 8, 9, 3};
		System.out.println("排序前：\n" + Arrays.toString(a));
		heapSort(a);
		System.out.println("排序后：\n" + Arrays.toString(a));
	}
	
	//堆排序
	private static void heapSort(int[] a) {
		buildMaxHeap(a);
		for (int i = a.length; i > 1; i--) {
			int temp = a[0];
			a[0] = a[i-1];
			a[i-1] = temp;
			maxHeap(a, i-1, 0);
		}
	}
	
	//创建最大堆
	private static void buildMaxHeap(int[] a) {
		int index = (a.length+1)/2 -1; //最后一个结点下标
		for (int i = index; i >= 0; i--) {
			maxHeap(a, a.length, i);
		}
	}

	//部分堆排序
	private static void maxHeap(int[] a, int heapSize, int index) {
		int maxIndex = index; //最大数的下标
		int leftIndex = index*2 + 1;
		int rightIndex = index*2 + 2;
		// 如果有左子结点
		if(leftIndex < heapSize){
			maxIndex = leftIndex;
		}
		// 如果有右子结点
		if(rightIndex < heapSize && a[leftIndex] < a[rightIndex]){
			maxIndex = rightIndex;
		}
				
		if(a[index] < a[maxIndex]){
			int temp = a[index];
			a[index] = a[maxIndex];
			a[maxIndex] = temp;
			maxHeap(a, heapSize, maxIndex);
		}
	}
}
