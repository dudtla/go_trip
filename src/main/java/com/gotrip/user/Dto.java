package com.gotrip.user;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
//@Setter : 굳이 사용할 필요가 없다. 클라이언트에게 받아온 데이터를 굳이 바꿔줄 필요가 없으니까..!
// //근데 @같은걸 사용자에게 받아오지않고 개발자가 붙여줄때는 필요하지 않을까...?=> 보통의 이메일 저장 형식 알아보기
//사용자에게 입력받는 데이터만 넣어주기
public class Dto {

    @NotBlank(message = "1001")
    @Size(min = 4, max = 20, message = "1002")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "1003")
    private String userId;


    @NotBlank(message = "1004")
    @Size(min = 8, max = 20, message = "1005")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$",
            message = "1006")
    private String userPwd;


    @NotBlank(message = "1007")
    private String email1;

    @NotBlank(message = "1008")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,}$",
            message = "1009")
    private String email2;

    @NotBlank(message = "1010")
    @Pattern(regexp = "^\\d{10,11}$", message = "1011")
    private String phoneNo;

}
