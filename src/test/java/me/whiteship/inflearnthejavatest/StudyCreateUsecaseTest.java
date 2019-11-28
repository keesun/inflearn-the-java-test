package me.whiteship.inflearnthejavatest;

import me.whiteship.inflearnthejavatest.domain.Study;
import me.whiteship.inflearnthejavatest.study.StudyStatus;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudyCreateUsecaseTest {

    private Study study;

    @Order(1)
    @Test
    @DisplayName("스터디 만들기")
    public void create_study() {
        study = new Study(10, "자바");
        assertEquals(StudyStatus.DRAFT, study.getStatus());
    }

    @Order(2)
    @Test
    @DisplayName("스터디 공개")
    public void publish_study() {
        study.publish();
        assertEquals(StudyStatus.OPENED, study.getStatus());
        assertNotNull(study.getOpenedDateTime());
    }

}
