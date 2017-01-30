package com.allstate.services;

import com.allstate.repositories.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.allstate.entities.Class;

@Service
public class ClassService {
    private IClassRepository classRepository;

    @Autowired
    public void setclassRepository(IClassRepository klassRepository) {
        this.classRepository = classRepository;
    }

    public Class create(Class aClass){
        return this.classRepository.save(aClass);
    }

    public Class findById(int id){
        return this.classRepository.findOne(id);
    }

    public Class findByName(String name){
        return this.classRepository.findByName(name);
    }
}