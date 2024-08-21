package com.example.academic.system.repository;

import com.example.academic.system.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository  extends JpaRepository<School, Long> {

}
