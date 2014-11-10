package demo_algorithm_sorting_bubble_sort;

public class MainVersionTwo {
	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 6, 3, 7, 5, 10, 9, 8 };
		MainVersionTwo.bubbleSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 改进版的的冒泡排序的实现
	 * 
	 * @param a 需要排序的整型数组
	 */
	public static void bubbleSort(int[] a) {
		int n = a.length;
		int flag = 0;	//flag用于标记是否发生交换
		// 指针i从第一个元素开始，过滤每一个元素
		for (int i = 0; i < n; i++) {
			// 指针j从最后一个元素开始，过滤到i指向的那个元素
			for (int j = n - 1; j > i; j--) {
				// j-1 指向的元素比 j指向的大的话，调换他们两个的位置
				if (a[j - 1] > a[j]) {
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					flag = 1;
				}
			}
			if (flag == 0) {//如果flag是0，则表示数据默认从小到大排序，则不用继续进行排序了
				break;
			} else {
				flag = 0;
			}
		}
	}
}
