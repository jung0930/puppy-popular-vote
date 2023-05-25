package com.deepdive.puppypopularvote.puppy.dto;


import com.deepdive.puppypopularvote.code.Sex;
import lombok.*;

import java.util.List;

public class PuppyDto {


    @Getter
    @Setter
    @AllArgsConstructor
    public static class ListRequest {
        private int page;
        private int size;

        // private String sort;
    }

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

        public Detail(Long id, String name, String photoFileName, String summaryDescription, Sex sex, Integer voteCount) {
            this.id = id;
            this.name = name;
            this.photoFileName = photoFileName;
            this.summaryDescription = summaryDescription;
            this.sex = sex;
            this.voteCount = voteCount;
        }
    }

}
