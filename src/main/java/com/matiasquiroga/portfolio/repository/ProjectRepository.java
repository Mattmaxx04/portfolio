package com.matiasquiroga.portfolio.repository;

import com.matiasquiroga.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
