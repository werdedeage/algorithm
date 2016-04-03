/**
 * @since 2016-04-02
 * @author werdedeage
 *
 */
public class BubbleSort{
  
	public static void main(String[] args) {
		int[] a = {8, 10, 99, 78, 2, 29, 77, 6, 15, 13, 34, 41};
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		bubbleSort(a); //冒泡排序
		
		System.out.println("\n排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	/**
	 * 冒泡排序
	 * @param a
	 */
	private static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
