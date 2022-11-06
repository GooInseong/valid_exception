package com.springboot.valid_exception.controller;

import com.springboot.valid_exception.data.dto.ValidRequestDto;
import com.springboot.valid_exception.data.dto.ValidatedRequestDto;
import com.springboot.valid_exception.data.group.ValidationGroup1;
import com.springboot.valid_exception.data.group.ValidationGroup2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/validation")
public class ValidationController {

    private final Logger LOGGER= LoggerFactory.getLogger(ValidationController.class);

    @PostMapping("/validated")
    public ResponseEntity<String> checkValidationByValid(
            @Validated @RequestBody ValidatedRequestDto validatedRequestDto){
            LOGGER.info(validatedRequestDto.toString());
            return ResponseEntity.status(HttpStatus.OK).body(validatedRequestDto.toString());
    }
    /*@Validated 어노테이션에 특정 그룹을 지정하지 않은경우, 유효성 검사를 실시하지 않는다.
    * groups 를 설정하지 않은 필드는 유효성 검사 실시.*/

    @PostMapping("/validated/group1")
    public ResponseEntity<String> checkValidationByValid1(
            @Validated(ValidationGroup1.class) @RequestBody ValidatedRequestDto validatedRequestDto){
        LOGGER.info(validatedRequestDto.toString());
        return ResponseEntity.status(HttpStatus.OK).body(validatedRequestDto.toString());
    }
    /*ValidationGroup1 만 설정하였으니, age 에 대한 유효성 검사 실시*/

    @PostMapping("/validated/group2")
    public ResponseEntity<String> checkValidationByValid2(
            @Validated(ValidationGroup2.class) @RequestBody ValidatedRequestDto validatedRequestDto){
        LOGGER.info(validatedRequestDto.toString());
        return ResponseEntity.status(HttpStatus.OK).body(validatedRequestDto.toString());
    }
    /*ValidationGroup2 만 설정하였으니, count 에 대한 유효성 검사 실시*/

    @PostMapping("/validated/all-group")
    public ResponseEntity<String> checkValidationByValid3(
            @Validated({ValidationGroup1.class,ValidationGroup2.class}) @RequestBody ValidatedRequestDto validatedRequestDto){
        LOGGER.info(validatedRequestDto.toString());
        return ResponseEntity.status(HttpStatus.OK).body(validatedRequestDto.toString());
    }
    /*ValidationGroup 1,2 모두 유효성 검사 실시*/

}
