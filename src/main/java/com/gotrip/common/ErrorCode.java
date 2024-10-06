package com.gotrip.common;

//클래스 : 각 인스턴스는 고유한 속성을 가짐
//Enum : 미리 값을 정하고 각 값에 추가 정보 부여 가능 기본적으로 public static final로 선언 =>생략가능
//enum은 여러 관련 값을 그룹화해서 상수로 선언하고, 생성자를 통해 이 값들을 초기화한 후, 필요한 경우 해당 값을 반환하는 구조
public enum ErrorCode {

    //1000~1099번대로 작성 user는 1000부터 시작
    USER_ID_EMPTY("1001", "아이디 입력은 필수입니다."),
    USER_ID_SIZE("1002", "아이디는 4자 이상 20자 이하로 입력해야 합니다."),
    USER_ID_PATTERN("1003", "아이디는 알파벳과 숫자로만 구성되어야 합니다."),

    USER_PWD_EMPTY("1004", "비밀번호 입력은 필수입니다."),
    USER_PWD_SIZE("1005", "비밀번호는 8자 이상 20자 이하로 입력해야 합니다."),
    USER_PWD_PATTERN("1006", "비밀번호는 대문자, 소문자, 숫자, 특수문자를 포함해야 합니다."),

    EMAIL_EMPTY("1007", "이메일 입력은 필수입니다."),
    EMAIL_EMPTY_DOMAIN("1008", "이메일 도메인은 필수입니다."),
    EMAIL_PATTERN("1009", "이메일 형식이 올바르지 않습니다."),

    PHONE_NO_EMPTY("1010", "전화번호 입력은 필수입니다."),
    PHONE_NO_PATTERN("1011", "전화번호는 10~11자리 숫자로 입력해야 합니다."),

    UNKNOWN_ERROR("9999", "알 수 없는 오류가 발생했습니다.");

    private final String code; // 에러 코드
    private final String message; //


    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    // 코드와 메시지를 가져오는 메서드
    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }// 에러 메시지
}
