package com.app.gotrip.user;

import com.app.gotrip.common.UserEntity;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController // 기본적으로 JSON으로 반환
@RequestMapping("user")
@RequiredArgsConstructor // final 필드에 대한 생성자 자동 생성 ?
//final키워드는 힙메모리에 할당되니까 변경될 수 없어서 @Autowired를 사용하여 주입해주지 않아도 final키워드 생성자를 다 자동으로 생성해주는구나
public class UserController {

    private final UserService userService;

    @PostMapping("/api/register")
    //타입: 문자열타입의 응답을 포함하는 객체 반환해줌
    //@RequestBody Entity user : 클라이언트가 전달한 데이터를 user매개변수에 저장
    //@RequestBody UserRegisterDTO UserRegisterDTO: 엔티티말고 dto로 받아오는 것으로 변경
    //@vaild : 클라이언트로부터 받은 데이터를 자동으로 유효성 검사를 해준다 dto에서 미리 해줌!
    public ResponseEntity<String> userRegister(@Valid @RequestBody UserRegisterDTO userRegisterDTO){
        userService.userRegister(userRegisterDTO);
        return ResponseEntity.ok("회원가입 완료");
    }

}
