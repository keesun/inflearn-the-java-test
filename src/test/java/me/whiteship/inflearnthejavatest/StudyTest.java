package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ╯°□°）╯")
    void create_new_study() {
        Study actual = new Study(10);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    void create_new_study_again() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

}