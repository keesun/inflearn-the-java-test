package me.whiteship.inflearnthejavatest.member;

import me.whiteship.inflearnthejavatest.domain.Member;

public interface MemberService {
    void validate(Long memberId) throws InvalidMemberException;

    Member findById(Long memberId) throws MemberNotFoundException;
}
