package com.allstate.services;

import com.allstate.repositories.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.allstate.entities.Klass;

@Service
public class ClassService {
    private IClassRepository classRepository;

    @Autowired
    public void setclassRepository(IClassRepository klassRepository) {
        this.classRepository = classRepository;
    }

    public Klass create(Klass aClass){
        return this.classRepository.save(aClass);
    }

    public Klass findById(int id){
        return this.classRepository.findOne(id);
    }

    public Klass findByName(String name){
        return this.classRepository.findByName(name);
    }
}