import kr.or.kosa.Emp;

/*
배열은 객체다
1. new를 통해서 생성(주소값)
2. heap 메모리 생성(관리자원)
3. 정적배열(고정배열)
	배열은 한번 선언하면 변경 불가 <> 동적(Collection : API 클래스)
	Collection도 사실은 내부적으로는 정적 배열을 쓴다.
	4개짜리 방에 list.add를 한다고 해서 5개짜리 방이 되는 게 x
4. 자료구조(알고리즘)
	제어문(결합)
	기초적인 자료구조

 */
class Car{
	
}

class Person{
	String name;
}

public class Ex01_Array {

	public static void main(String[] args) {

		//3가지
		//1. 가장 일반적인 방법
		//배열은 객체다.
		//5개의 방은 heap에 만들어진다.
		int[] arr = new int[5];
		
		//2. 생성과 동시에 초기화하는 방법
		int[] arr2 = new int[]{10,20,30,40,50};
		
		//3. new를 생략하는 방법
		//컴파일러가 자동으로 new를 붙여서 메모리에 올림
		int[] arr3 = {10,20,30};
		
		//Tip) javascript
		//기본적으로 동적 배열이고 stack 자료구조를 가지고 있음
		//즉 1 2 3 4 5를 꺼내면 5 4 3 2 1
		//const arr = [1,2,3,4,5];
		//let arr = [];
		//arr.push(10); arr.pull();
		
		
		//객체 배열
		Car[] cararr = new Car[3]; //방만 만드는 것
		cararr[0] = new Car();//heap에 car객체가 만들어지고 주소값 할당
		
		
		//향상된 for문
		//자바
		//for(Type 변수명 : 배열 or 컬렉션){}
		//C#
		//for(Type 변수명 in 배열 or 컬렉션){}
		//자바스크립트
		//for(Type 변수명 in 배열){}
		
		int[] arr4 = {5,6,7,8,9};
		for(int value : arr4) {
			System.out.println(value);
		}
		
		//Person을 3명 만들어라.
		//Person타입의 사람을 3명 만들어라.
		Person[] person = new Person[3];
		Person[] person2 = {new Person(), new Person()};
		
		//사원 3명을 만들어라 - Array
		//1000번 김씨
		//2000번 박씨
		//3000번 이씨
		//결과를 개선된 for문으로 사원의 사번, 이름을 모두 출력하기
		
		Emp[] elist = {new Emp(1000,"김"),new Emp(2000,"박"),new Emp(3000,"이")};
		for(Emp emp : elist) {
			emp.empInfoPrint();
		}
		
	}

}
