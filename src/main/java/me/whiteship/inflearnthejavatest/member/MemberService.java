package me.whiteship.inflearnthejavatest.member;

import me.whiteship.inflearnthejavatest.domain.Member;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);
}
