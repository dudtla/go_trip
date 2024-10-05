package com.app.gotrip.common;

public class ErrorCode {

    //1000~1099번대로 작성 user는 1000부터 시작
    public static final String USER_REGISTER_ID = "1001"; // 유저 아이디 오류
    public static final String USER_REGISTER_PWD = "1002"; // 유저 비밀번호 오류
    public static final String USER_REGISTER_EMAIL1 = "1003";// 유저 이메일 오류
    public static final String USER_REGISTER_EMAIL2 = "1004";// 유저 이메일 오류
    public static final String USER_REGISTER_PHONE = "1005"; // 유저 전화번호 오류

    public static final String UNKNOWN_ERROR = "9999"; // 알 수 없는 오류
}
