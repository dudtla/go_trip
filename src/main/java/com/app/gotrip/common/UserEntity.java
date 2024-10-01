package com.app.gotrip.common;


import jakarta.persistence.Column;
import jakarta.persistence.Id;  //id는 프라이머리 키라서 임포트 해줘야함
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@jakarta.persistence.Entity
@Table(name="USER_TB")
@Getter
@Setter
@Builder
//JPA는 엔티티클래스의 필드에 직접 접근하기 보다는 메서드를 통해 값을 읽거나 설정한다 만약 게터세터가 없으면 JPA가 필드에 접근 할 수 없기 때문에 매핑이 제대로 이루러지지 않는다
public class UserEntity {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "LAST_LOGIN_DT")
    private String lastLoginDt;

    @Column(name = "PWD_UPD_DT")
    private String pwdUpdDt;

    @Column(name = "EMAIL1")
    private String email1;

    @Column(name = "EMAIL2")
    private String email2;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "REG_USER")
    private String regUser;

    @Column(name = "REG_DTM")
    private String regDtm;

    @Column(name = "UPDT_USER")
    private String updtUser;

    @Column(name = "UPDT_DTM")
    private String updtDtm;
}
