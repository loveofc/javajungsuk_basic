
import java.util.*; 

class Ex11_8 { 
	public static void main(String[] args) { 
		Integer[] arr = { 30, 50, 10, 40, 20 }; 

		Arrays.sort(arr); // 기본 기준 정렬(Comparable)으로 정렬 
		System.out.println(Arrays.toString(arr));

		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp()); // DescComp에 구현된 정렬 기준으로 정렬
		System.out.println(Arrays.toString(arr));
	} // main
}	

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1; // Integer가 아니면, 비교하지 않고 -1 반환

		Integer i  = (Integer)o1;
		Integer i2 = (Integer)o2;

		return i.compareTo(i2) * -1; // 기본 정렬의 역순으로 정렬
	}
}
