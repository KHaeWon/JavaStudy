
public class Ex04_Array_Cinema {

	public static void main(String[] args) {

		//영화관의 좌석은 3행 5열로 되어있다.
		String[][] seat = new String[3][5]; 
		
		/*
		 [][][][][]
		 [][][][][]
		 [][][][][]
		 */
		
		//좌석 초기화
		for(int i=0; i<seat.length; i++) {
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j]="__";// 빈 의자 모양 : __
			}
		}
		
		//예매
		seat[2][1] = "홍길동"; //예매자의 이름
		seat[0][0] = "김유신";
		
		//예매 현황
		for(int i=0; i<seat.length; i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "좌석" : seat[i][j]);
			}
			System.out.println();
		}
		
		
		//예매하기
		int row,col;
		row = 1;
		col = 0;
		if(seat[row][col].equals("__")) {
			System.out.println("예매가능");
		}else {
			System.out.println("예매불가능");
		}
		
		
		//예매종료(영화시작)
		for(int i=0; i<seat.length; i++) {
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j]="__";// 빈 의자 모양 : __
			}
		}
		//초기화를 통해 빈 의자를 만듦
		
		
	}

}
