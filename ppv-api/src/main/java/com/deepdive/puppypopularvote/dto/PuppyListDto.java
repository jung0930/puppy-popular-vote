package com.deepdive.puppypopularvote.dto;

import com.deepdive.puppypopularvote.domain.code.Sex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class PuppyListDto {

    private Long id;
    private String name;
    private String photoFileName;
    private String summaryDescription;
    private Sex sex;
    private Integer voteCount;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public PuppyListDto(){

    }

}
