package com.allstate;

import com.allstate.services.KlassServiceTest;
import com.allstate.services.StudentServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(Suite.class)
@SpringBootTest
@Suite.SuiteClasses({
        StudentServiceTest.class,
        KlassServiceTest.class
})
public class SchoolApplicationTests {

    @Test
    public void contextLoads() {
    }

}