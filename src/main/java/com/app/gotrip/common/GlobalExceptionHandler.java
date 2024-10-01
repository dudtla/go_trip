package com.app.gotrip.common;


import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice //전역에서 발생하는 예외 처리? DTO에서 유효성 검사수행 후 , 서비스에서 비지니스 로직 수행 후 예외 발생하면 여기로 보내지는 건가여..?
@RestControllerAdvice //예외 응답을 JSON형식으로 해준다.
public class GlobalExceptionHandler {

    //for : 인덱스 길이를 사용해 반복
    //향상된 for : 컬렉션의 모든 요소 출력

    //userRegisterDTO 예외처리
    @ExceptionHandler(MethodArgumentNotValidException.class) //DTO에서 유효성 검사시 발생하는 예외를 처리해준다
    @ResponseStatus(HttpStatus.BAD_REQUEST) //HTTP 400을 나타내는 상태코드 클라이언트의 요청이 잘못 되었을때 클라이언트에게 보여줌.
    public ResponseEntity<Map<String,String>>userRegisterValidException(MethodArgumentNotValidException exception){
        //MethodArgumentNotValidException : DTO에서 유효성검사 규칙 위반하면 발생한다

        Map<String,String> userError = new HashMap<>();
        //Map: 키-밸류 저장 HashMap :키-밸류를 해시테이블 방식으로 저장 => 예외가 발생하면 (변수명,오류메세지)가 해쉬맵에 저장

        for(FieldError error : exception.getBindingResult().getFieldErrors()){
            //getBindingResult() : 입력받은 데이터와 유효성 검사 결과 반환,getFieldErrors(): 오류가 발생한 필드이름, 오류메세지, 필드의 잘못된 값 반환
            String fieldName = error.getField(); // 오류 코드를 저장할 변수
            String errorMessage = error.getDefaultMessage();//오류 메세지
            userError.put(fieldName, errorMessage); //변수명과 오류메세지 맵에 추가
        }
        return new ResponseEntity<>(userError, HttpStatus.BAD_REQUEST); //오류맵과 상태코드 클라이언드에게 반환
    }
//필드명이 아니라 DTO에서 설정한 오류메세지랑 클래스로 빼둔 오류코드를 출력하고 싶은데 이게...
}
