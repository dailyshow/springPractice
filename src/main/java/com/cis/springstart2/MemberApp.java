package com.cis.springstart2;

import com.cis.springstart2.member.Grade;
import com.cis.springstart2.member.Member;
import com.cis.springstart2.member.MemberService;
import com.cis.springstart2.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "cis", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
