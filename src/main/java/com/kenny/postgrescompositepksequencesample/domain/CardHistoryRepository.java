package com.kenny.postgrescompositepksequencesample.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHistoryRepository extends JpaRepository<CardHistory, CardHistoryId> {
}