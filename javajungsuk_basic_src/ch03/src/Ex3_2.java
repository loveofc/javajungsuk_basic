class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++; // j에 i에 값(5)을 담은 다음에 i의 값을 1+해준다(5+1=6)
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j); //6, 5

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i;//i(5)를 먼저 +1한다음에(5+1=6) j에 i의 값(6)을 담는다
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);//6, 6
	}
}