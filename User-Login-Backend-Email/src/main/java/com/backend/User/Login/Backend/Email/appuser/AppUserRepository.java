package com.backend.User.Login.Backend.Email.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository // this is not necessary but good for practice and integration with IntelliJ become ovice
@Transactional(readOnly = true)
public interface AppUserRepository
        extends JpaRepository<AppUser, Long> {
    // let have a method bellow
    Optional<AppUser> findByEmail(String email);
}
