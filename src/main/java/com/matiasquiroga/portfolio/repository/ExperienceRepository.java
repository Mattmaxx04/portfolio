package com.matiasquiroga.portfolio.repository;

import com.matiasquiroga.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
