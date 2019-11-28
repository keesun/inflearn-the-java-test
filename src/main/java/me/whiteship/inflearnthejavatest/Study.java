package me.whiteship.inflearnthejavatest;

import java.time.LocalDateTime;

public class Study {

    private StudyStatus status = StudyStatus.DRAFT;

    private int limit;

    private String name;

    private LocalDateTime openedDateTime;

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit은 0보다 커야 한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Study{" +
                "status=" + status +
                ", limit=" + limit +
                ", name='" + name + '\'' +
                '}';
    }

    public void publish() {
        this.openedDateTime = LocalDateTime.now();
        this.status = StudyStatus.OPENED;
    }

    public LocalDateTime getOpenedDateTime() {
        return openedDateTime;
    }
}
