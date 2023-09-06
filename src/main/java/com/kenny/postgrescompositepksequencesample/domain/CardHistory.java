package com.kenny.postgrescompositepksequencesample.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "card_history")
public class CardHistory {

    @EmbeddedId
    private CardHistoryId cardHistoryId;
    private String contents;

    protected CardHistory() {
    }
}