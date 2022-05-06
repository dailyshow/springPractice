package com.cis.springstart2.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
