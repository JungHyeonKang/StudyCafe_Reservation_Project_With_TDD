package com.kang.studyCafe.domain.checkin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
    
}
