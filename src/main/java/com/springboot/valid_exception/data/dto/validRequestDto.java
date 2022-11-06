package com.springboot.valid_exception.data.dto;

import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class validRequestDto {

    /*유효성 검사는 각 계층으로 데이터가 넘어오는 시점에 해당 데이터에 대한 검사를 실시한다.
    * 스프링 부트 프로젝트에서는 계층간 데이터 전송에 Dto 객체를 활용하기에, Dto 객체의
    * 유효성검사를 실시하는게 일반적이다.*/

    @NotBlank
    String name;

    @Email
    String email;

    @Pattern(regexp = "01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$")
    String phoneNumber;

    @Min(value=20) @Max(value=40)
    int age;

    @Size(min=0,max = 40)
    String description;

    @Positive
    int count;

    @AssertTrue
    boolean booleanCheck;
}
