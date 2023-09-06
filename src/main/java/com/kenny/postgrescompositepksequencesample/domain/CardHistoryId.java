package com.kenny.postgrescompositepksequencesample.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
@Embeddable
public class CardHistoryId implements Serializable {
    public static final String SEQUENCE_NAME = "sq_card_history_01";

    private String cardNo;
    @SequenceGenerator(name = CardHistoryId.SEQUENCE_NAME, sequenceName = CardHistoryId.SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    private Long cardSequence;

    protected CardHistoryId() {
    }
}