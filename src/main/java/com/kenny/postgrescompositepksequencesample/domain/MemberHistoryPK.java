package com.kenny.postgrescompositepksequencesample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
public class MemberHistoryPK implements Serializable {

    private String memberId;
    private Long memberSequence;
}
