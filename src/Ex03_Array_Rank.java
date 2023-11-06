
public class Ex03_Array_Rank {

	public static void main(String[] args) {

		// 다차원 배열 (2차원)
		// [행][열]
		// 엑셀 시트, 영화관 좌속, 지도 촤표값(경도, 위도), 바둑판....
		
		int[][] score = new int[3][2];//3x2행렬
		score[0][0] = 100;//초기화
		
		// 다차원 배열의 친구 중첩 for문
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.printf("score[%d][%d]=[%d]\n",i,j,score[i][j]);
//			}
//		} => 좋지 않은 방법
		
		
		//2차원 배열은 행 배열을 먼저 열 배열을 나중
		//주소값을 가지고 있따.
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {//score[i]의 주소값을 가지고 옴. 이렇게 사용하도록 하자
				System.out.printf("score[%d][%d]=[%d]\n",i,j,score[i][j]);
			}
		}

		System.out.println("============================================");
		
		int[][] score2 = new int[][]{{11,12},{13,14},{15,16}};
		
		//개선된 for문
		for(int[] arr:score2) {//행의 주소를 리턴하므로 배열로 받아야 함
			for(int value:arr) {
				System.out.println(value);
			}
		}
		
		
	}

}
