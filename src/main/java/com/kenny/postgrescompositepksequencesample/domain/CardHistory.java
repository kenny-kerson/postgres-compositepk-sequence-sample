package com.kenny.postgrescompositepksequencesample.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "card_history")
public class CardHistory {
}