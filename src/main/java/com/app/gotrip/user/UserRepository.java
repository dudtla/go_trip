package com.app.gotrip.user;

import com.app.gotrip.common.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findByUserId(String userId); // 사용자 ID로 조회하는 메서드
}

