package com.board.pra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//롬복의 getter,setter 어노테이션을 통행 set,get 등의 메서드를 궅이 작성하지 않아도
//사용할수 있도록 처리해주고 있다.
// RequiredArgsConstructor : 해당속성을 필요로 하는 생성자가 롬목을 통해 자동 생성
// 							-> 의존성 주입에도 사용한다

@Getter
//@Setter
@RequiredArgsConstructor
public class LombokTest {

	private final String hello;
	private final int lombokint;
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println("hello world");
		LombokTest lombk = new LombokTest("ㅎ o", 2345);
		//lombk.setHello("ㅎ ㅇ");
		//lombk.setLombokint(27272737);
		
		System.out.println(lombk.getHello());
		System.out.println(lombk.getLombokint());	
	}

}
