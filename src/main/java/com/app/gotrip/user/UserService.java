package com.app.gotrip.user;


import com.app.gotrip.common.UserEntity;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;

    public void userRegister(UserRegisterDTO userRegisterDTO) {

        // 빌더 패턴을 사용하여 DTO를 엔티티로 변환
        // 객체생성(new)가 아닌 빌더패턴을 이용하는 이유?검색해도 모르겠다ㅎㅎ
        //흐름 : 클라이언트가 보낸 데이터 => 컨트롤러가 dto객체로 받아옴
        //=>dto를 서비스로 토스=> 서비스에서 biz수행 => dto를 엔티티로 변환=> 변환된 엔티티를 레포를 통해서 서장
        UserEntity userEntity = UserEntity.builder()
                .userId(userRegisterDTO.getUserId())
                .userPwd(userRegisterDTO.getUserPwd())
                .email1(userRegisterDTO.getEmail1())
                .email2(userRegisterDTO.getEmail2())
                .phoneNo(userRegisterDTO.getPhoneNo())
                .build();

        // 엔티티를 DB에 저장 근데 여기선 데이터를 조회하는 과정이 필요없어 바로 데이터 저장
        //save: 쿼리문 따로 만들필요 없이 받아온 데이터 db에 바로 저장해준다.JPA가 해줌
        userRepo.save(userEntity);

    }
}
