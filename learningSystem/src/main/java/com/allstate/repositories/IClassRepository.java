package com.allstate.repositories;

import org.springframework.data.repository.CrudRepository;
import com.allstate.entities.Klass;

public interface IClassRepository extends CrudRepository<Klass, Integer> {
    public Klass findByName(String name);
}
