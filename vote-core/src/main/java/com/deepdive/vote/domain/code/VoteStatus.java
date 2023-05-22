package com.deepdive.vote.domain.code;

public enum VoteStatus {

    VOTE("투표 완료"),
    CANCEL("투표 취소");

    private String value;

    VoteStatus(String value) {
        this.value = value;
    }

}
