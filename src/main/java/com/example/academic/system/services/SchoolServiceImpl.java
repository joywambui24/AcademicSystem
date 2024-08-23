package com.example.academic.system.services;


import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;
import com.example.academic.system.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Optional<School> getSchoolById(Long id) {
        return schoolRepository.findById(id);
    }


    @Override
    public School updateSchool(Long id, SchoolDto dto) {
        Optional<School> school = schoolRepository.findById(id);
        if (school.isPresent()) {
            School data = school.get();
            data.setSchoolName(dto.schoolName);
            data.setAddress(dto.address);
            data.setCity(dto.city);
            data.setCampusType(dto.campusType);
            return schoolRepository.save(data);

        }

        return null;
    }
    @Override
    public String deleteSchool(Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if (school.isPresent()) {
            School data = school.get();
            schoolRepository.deleteById(data.getId());
            return "School name" + data.getSchoolName() + "is deleted!";
        }
        return "";
    }
}


