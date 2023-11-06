package kr.or.kosa;

import java.util.Random;
import java.util.Scanner;

public class Cinema_main {

	public static void main(String[] args) {

		Scanner in;
		String seat[][] = new String[4][5];
		Random r = new Random();
		String ran = Integer.toString(r.nextInt(8)+1);
		for(int i=0;i<7;i++) {
			ran += Integer.toString(r.nextInt(9));
		}
		//System.out.println("예매번호 : "+ran);
		
		//좌석 초기화
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j]=i+"-"+j;
			}
		}
		
		
		while(true) {
			
			System.out.println("****영화 예매 시스템****");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 예매하기\n2. 예매조회\n3. 예매취소\n4. 나가기");
			
			in = new Scanner(System.in);
			int menu = in.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("********좌석현황********");
				for(int i=0;i<seat.length;i++) {
					for(int j=0;j<seat[i].length;j++) {
						System.out.print(seat[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("-----------------------\n"
						+ "좌석을 선택해주세요. "
						+ "예)1-1\n이미 선택된 자석은 \"예매\"라고 뜹니다.");
				
				String res_seat = in.next(); //예매 좌석 번호
				//System.out.println(res_seat);
				
				String res[] = new String[2];
				res = res_seat.split("-");
				
//				for(int i=0;i<res.length;i++) {
//					System.out.println(res[i]);
//				}
				//seat[Integer.parseInt(res[0])][0]
				
				if(res[0]=="예매") {
					System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택하세요.");
				}else {
					System.out.println("예매 가능합니다. 예매하시겠습니까?");
					System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 선택하세요.");
					int menu2 = in.nextInt();
					if(menu2==1) {
						seat[Integer.parseInt(res[0])][Integer.parseInt(res[1])]="예매";
						System.out.println("예매가 완료되었습니다.\n"
								+ "예매한 좌석번호:["+res_seat+"]/예매번호:["+ran+"]\n"
										+ "감사합니다.");
					}else if(menu2==2) {
						System.out.println("예매를 하지 않으셨습니다.");
					}else if(menu==3) {
						System.out.println("초기화면으로 돌아갑니다.");
					}
				}
				
			case 2:
				
				
				
			}
			
			if(menu==4) break;
			
		}
		
	}

}
