package com.example.academic.system.services;


import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;
import com.example.academic.system.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School createSchool(SchoolDto dto) {
        School school = new School(
                dto.schoolName, dto.address, dto.city, dto.campusType
        );
        return schoolRepository.save(school);
    }


}
