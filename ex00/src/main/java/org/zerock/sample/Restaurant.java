package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // 해당 클래스는 스프링에서 관리해야 할 대상임을 표시
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)  //자동으로  setChef()를 컴파일 시 생성함, 
	private Chef chef;

}
