package com.board.pra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayhi() {
		//리턴 문자를 수정했지만 페이지상의 내용은 변경도지 않았음.
		//- 로컬 was 가 벼녁ㅇ된 클래스를 리로딩 하지 않았음
		return "오늘은 수업 2일차ㅋ";
	}
	//롬복
	//자바 클래스의 getter, setter, 생성자 등을 자동으로 만들어 주는 도구
	//깔끔한 소스코드를 만들수 있다.
	
	//포로젝트명 + application 파일
	// 스프링부트의 시작을 담당하는 파일
	// @SpringBootApplication : 스프링부트의 설정을 관리하는 어노테이션
	
	//데이터베이스를 이용하려면?
	//쿼리를 통해 원하는 데이터를 조회하거나 삭제할수 있었음
	//ORM을 통해 자바문법으로 데이터베이스를 다룰수 있다.
	
	//JPA(java persistence API) /인터페이스
	//자바 ORM 기술표준
	
	//제목이 subject고 내용컬럼이 content라 가졍했을떄 쿼리를 이용해서
	//데이터를 추가하려면?
	
	//insert into question(subject, content) value('1','2')
	
	
	
	
	
	
}
