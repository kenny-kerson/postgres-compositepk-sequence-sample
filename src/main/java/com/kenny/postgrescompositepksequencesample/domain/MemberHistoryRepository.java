package com.kenny.postgrescompositepksequencesample.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberHistoryRepository extends JpaRepository<MemberHistory, MemberHistoryPK> {
}