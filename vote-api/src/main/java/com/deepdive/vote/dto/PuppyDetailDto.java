package com.deepdive.vote.dto;

import com.deepdive.vote.domain.code.Sex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class PuppyDetailDto {

    private Long id;
    private String name;
    private String photoFileName;
    private String summaryDescription;
    private String detailDescription;
    private Sex sex;
    private Integer voteCount;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public PuppyDetailDto(){
    }

}
