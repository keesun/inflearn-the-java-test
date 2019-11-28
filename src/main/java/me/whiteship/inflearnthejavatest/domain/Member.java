package me.whiteship.inflearnthejavatest.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String email;

}
