package com.example.academic.system.controller;


import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;
import com.example.academic.system.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping(value = "/createSchool", produces = "/application/json", consumes = "/application/json")
    public School createSchool(@RequestBody @Validated SchoolDto dto) {
    return schoolService.createSchool(dto);
}


}
