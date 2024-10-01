package com.app.gotrip.user;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter : 굳이 사용할 필요가 없다. 클라이언트에게 받아온 데이터를 굳이 바꿔줄 필요가 없으니까..!
// //근데 @같은걸 사용자에게 받아오지않고 개발자가 붙여줄때는 필요하지 않을까...?=> 보통의 이메일 저장 형식 알아보기
//사용자에게 입력받는 데이터만 넣어주기
public class UserRegisterDTO {

    @NotBlank(message = "사용자 ID는 필수입니다.")
    @Size(min = 4, max = 20, message = "ID는 4자 이상, 20자 이하여야 합니다.")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "ID는 특수문자 사용이 불가합니다.")
    private String userId;


    @NotBlank(message = "비밀번호는 필수입니다.")
    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상, 20자 이하여야 합니다.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$",
            message = "비밀번호는 최소 하나의 대문자, 소문자, 숫자 및 특수문자를 포함해야 합니다.")
    private String userPwd;


    @NotBlank(message = "이메일은 필수입니다.")
    private String email1;

    @NotBlank(message = "이메일은 필수입니다.")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,}$",
            message = "이메일의 형식이 올바르지 않습니다.")
    private String email2;

    @NotBlank(message = "전화번호는 필수입니다.")
    @Pattern(regexp = "^\\d{10,11}$", message = "전화번호는 10자리 또는 11자리 숫자여야 합니다.(특수문자나 공백 제외)")
    private String phoneNo;

}
