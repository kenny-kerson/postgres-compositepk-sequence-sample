package com.kenny.postgrescompositepksequencesample.controller;

import com.kenny.postgrescompositepksequencesample.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member_history")
    public void saveMemberHistory() {
        memberService.saveMemberHistory();
    }
}
