package com.allstate.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import com.allstate.entities.Class;
import com.allstate.enums.Department;

import java.sql.Date;
import java.time.LocalDate;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class ClassServiceTest {
    @Autowired
    private ClassService classService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateNewKlass() throws Exception {
        Class aClass = new Class("Physics 101", Date.valueOf(LocalDate.now()), 4, Department.SCIENCE, 500);
        aClass = this.classService.create(aClass);
        assertEquals(4, aClass.getId());
    }

    @Test
    @Transactional
    public void shouldFindOneKlassById() throws Exception {
        Class aClass = this.classService.findById(1);
        assertEquals(1, aClass.getId());
    }

    @Test
    @Transactional
    public void shouldFindOneKlassByName() throws Exception {
        Class aClass = this.classService.findByName("Physics 101");
        assertEquals(1, aClass.getId());
    }
}
