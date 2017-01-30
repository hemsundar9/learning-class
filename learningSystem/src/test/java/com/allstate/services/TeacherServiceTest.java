package com.allstate.services;

import com.allstate.entities.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class TeacherServiceTest {
    @Autowired
    private TeacherService teacherService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateNewTeacher() throws Exception {
        Teacher teacher = this.teacherService.create("bob");
        assertEquals(5, teacher.getId());
        assertEquals("bob", teacher.getName());
    }

    @Test
    public void shouldFindTeacherById() throws Exception {
        Teacher teacher = this.teacherService.findById(1);
        assertEquals(1, teacher.getId());
        assertEquals("aaa", teacher.getName());
    }

    @Test
    public void shouldFindTeacherByName() throws Exception {
        Teacher teacher = this.teacherService.findByName("bbb");
        assertEquals(2, teacher.getId());
        assertEquals("bbb", teacher.getName());
    }

    @Test
    public void shouldFindTeachersByGender() throws Exception {
        Teacher teacher = this.teacherService.findAllTeachersByGender('MALE');
        assertEquals(2, teacher.getId());
        assertEquals("MALE", teacher.getGender());
    }

}