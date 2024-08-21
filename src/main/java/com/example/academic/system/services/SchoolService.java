package com.example.academic.system.services;

import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;

public interface SchoolService {
    School createSchool(SchoolDto dto);
}
