package com.example.academic.system.services;

import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;

import java.util.Optional;

public interface SchoolService {
    School createSchool(SchoolDto dto);
    Optional<School> getSchoolById(Long id);
    School updateSchool(Long id, SchoolDto dto);
    String deleteSchool(Long id);
}
