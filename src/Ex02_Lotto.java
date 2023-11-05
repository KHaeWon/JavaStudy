/*
1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안 돼요 (중복값 검증)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요(정렬 : 자리바꿈 : swap)
4. 위 결과를 담고있는 배열을 출력하세요
 */


public class Ex02_Lotto {

	public static void main(String[] args) {

		int arr[] = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			int random = (int)(Math.random()*45)+1;
			arr[i] = random;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--; //중복값이 나오면 위에서 소비한 i값을 복구시켜 준다.
					break;
				}
			}
		}
//		int num = arr[0];
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
