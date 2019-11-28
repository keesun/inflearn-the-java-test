package me.whiteship.inflearnthejavatest;

import org.junit.Before;
import org.junit.Test;

public class StudyJUnit4Test {

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public void createTest() {
        System.out.println("test");
    }

    @Test
    public void createTest2() {
        System.out.println("test2");
    }

}
