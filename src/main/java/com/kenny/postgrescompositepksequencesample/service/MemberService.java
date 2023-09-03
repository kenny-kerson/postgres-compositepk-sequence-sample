package com.kenny.postgrescompositepksequencesample.service;

import com.kenny.postgrescompositepksequencesample.domain.MemberHistory;
import com.kenny.postgrescompositepksequencesample.domain.MemberHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberHistoryRepository memberHistoryRepository;

    public void saveMemberHistory() {
        log.warn( "# save() 메서드 시작!!");
        memberHistoryRepository.save(
                MemberHistory.builder()
                        .memberId("test")
                        .contents("test 1변경이력")
                        .build()
        );
        log.warn( "# save() 메서드 종료!!");
    }
}

