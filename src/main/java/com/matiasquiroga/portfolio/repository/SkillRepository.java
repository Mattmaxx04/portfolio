package com.matiasquiroga.portfolio.repository;

import com.matiasquiroga.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
