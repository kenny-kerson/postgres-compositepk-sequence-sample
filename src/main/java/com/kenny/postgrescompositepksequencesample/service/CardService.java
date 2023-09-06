package com.kenny.postgrescompositepksequencesample.service;

import com.kenny.postgrescompositepksequencesample.domain.CardHistory;
import com.kenny.postgrescompositepksequencesample.domain.CardHistoryId;
import com.kenny.postgrescompositepksequencesample.domain.CardHistoryRepository;
import com.kenny.postgrescompositepksequencesample.domain.MemberHistory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CardService {

    private final CardHistoryRepository cardHistoryRepository;
    public void saveCardHistory() {
        log.warn( "# save() 메서드 시작!!");
        cardHistoryRepository.save(
                CardHistory.builder()
                        .cardHistoryId(
                                CardHistoryId.builder()
                                        .cardNo("12345")
                                        .build()
                        )
                        .contents("12345 변경이력")
                        .build()
        );
        log.warn( "# save() 메서드 종료!!");

    }
}
