package com.matiasquiroga.portfolio.repository;

import com.matiasquiroga.portfolio.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
