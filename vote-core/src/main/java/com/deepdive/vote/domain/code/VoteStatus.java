package com.deepdive.vote.domain.code;

public enum VoteStatus {

    VOTE("V", "투표 완료"),
    CANCEL("C", "투표 취소");

    private String value;
    private String description;

    VoteStatus(String value, String description) {
        this.value = value;
        this.description = description;
    }

}
