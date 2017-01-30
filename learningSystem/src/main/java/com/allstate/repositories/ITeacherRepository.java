package com.allstate.repositories;


import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepository extends CrudRepository<Teacher, Integer> {
    public Teacher findByAge(int name);
    public  Teacher findAllTeachersByGender(String gender);
}
