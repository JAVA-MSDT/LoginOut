package com.serenitydiver.loginOut.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.serenitydiver.loginOut.model.RefreshToken;
import com.serenitydiver.loginOut.model.User;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

	@Override
	Optional<RefreshToken> findById(Long id);

	Optional<RefreshToken> findByToken(String token);

	@Modifying
	int deleteByUser(User user);
}
