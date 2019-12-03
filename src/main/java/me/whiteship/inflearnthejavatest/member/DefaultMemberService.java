package me.whiteship.inflearnthejavatest.member;

import me.whiteship.inflearnthejavatest.domain.Member;
import me.whiteship.inflearnthejavatest.domain.Study;
import me.whiteship.inflearnthejavatest.study.StudyService;

import java.util.Optional;

public class DefaultMemberService implements MemberService {

    StudyService studyService;

    @Override
    public Optional<Member> findById(Long memberId) {
        return Optional.empty();
    }

    @Override
    public void validate(Long memberId) {
        studyService.hi();
    }

    @Override
    public void notify(Study newstudy) {
        studyService.hi();
    }

    @Override
    public void notify(Member member) {

    }
}
