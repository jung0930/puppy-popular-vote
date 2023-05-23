package com.deepdive.puppypopularvote.domain.puppy.dto;


import com.deepdive.puppypopularvote.code.Sex;
import lombok.*;

import java.util.List;

// @RequiredArgsConstructor
public class PuppyDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class DetailResponse {
        private Long id;
        private String name;
        private String photoFileName;
        private String summaryDescription;
        private String detailDescription;
        private Sex sex;
        private Integer voteCount;
    }

    @Getter
    @AllArgsConstructor
    public static class ListResponse {
        private List<Detail> puppies;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Detail {
        private Long id;
        private String name;
        private String photoFileName;
        private String summaryDescription;
        private Sex sex;
        private Integer voteCount;
    }

}
