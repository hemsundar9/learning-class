package com.allstate.repositories;

import org.springframework.data.repository.CrudRepository;
import com.allstate.entities.Class;

public interface IClassRepository extends CrudRepository<Class, Integer> {
    public Class findByName(String name);
}
