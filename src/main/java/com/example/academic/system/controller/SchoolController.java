package com.example.academic.system.controller;


import com.example.academic.system.model.Course;
import com.example.academic.system.model.CourseDto;
import com.example.academic.system.model.School;
import com.example.academic.system.model.SchoolDto;
import com.example.academic.system.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping(value = "/createSchool", produces = "application/json", consumes = "application/json")
    public School createSchool(@RequestBody @Validated SchoolDto dto) {
    return schoolService.createSchool(dto);
}
    @GetMapping(value = "/getById", produces = "application/json")
    public Optional<School> getById(@RequestParam Long id) {
        return schoolService.getSchoolById(id);
    }
    @PutMapping(value = "/updateSchool", produces = "application/json", consumes= "application/json")
    public School updateSchool(@RequestParam Long id,  @RequestBody @Validated SchoolDto dto){
        return schoolService.updateSchool(id, dto);
    }
    @DeleteMapping(value = "/delete")
    public String deleteSchool(@RequestParam Long id)
    {
    return schoolService.deleteSchool(id);

    }

}