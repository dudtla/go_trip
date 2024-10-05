package com.gotrip.user;

import com.gotrip.common.Entity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Entity, String> {
    Optional<Entity> findByUserId(String userId); // 사용자 ID로 조회하는 메서드
}

