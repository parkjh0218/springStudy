package org.zerock.sample;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor 모든 변수를 파라미터로 받는 생성자 생성
@RequiredArgsConstructor
public class SampleHotel {

	@NonNull //특정 변수에 대해 생성자 작성 시
	private Chef chef;
	
}
