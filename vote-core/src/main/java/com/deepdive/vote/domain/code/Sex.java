package com.deepdive.vote.domain.code;

public enum Sex {

    MALE("수컷"),
    FEMALE("암컷");

    private String value;

    Sex(String value) {
        this.value = value;
    }

}
