package com.deepdive.puppypopularvote.puppy.dto;


import com.deepdive.puppypopularvote.code.Sex;
import com.deepdive.puppypopularvote.code.VoteStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

public class PuppyDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class VoteRequest {
        private Long id;
        private VoteStatus voteStatus;

        private VoteRequest(final Long id, final VoteStatus voteStatus) {
            this.id = id;
            this.voteStatus = voteStatus;
        }

        public static VoteRequest of (final Long id, final VoteStatus voteStatus) {
            return new VoteRequest(id, voteStatus);
        }

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
    @Setter
    @NoArgsConstructor
    public static class ListResponse {
        private Page<Detail> puppies;

        private ListResponse(final Page<Detail> puppies) {
            this.puppies = puppies;
        }

        public static ListResponse of(final Page<Detail> puppies) {
            return new ListResponse(puppies);
        }
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

        private Detail(final Long id, final String name, final String photoFileName, final String summaryDescription, final Sex sex, final Integer voteCount) {
            this.id = id;
            this.name = name;
            this.photoFileName = photoFileName;
            this.summaryDescription = summaryDescription;
            this.sex = sex;
            this.voteCount = voteCount;
        }

        public static Detail of(final Long id, final String name, final String photoFileName, final String summaryDescription, final Sex sex, final Integer voteCount) {
            return new Detail(id, name, photoFileName, summaryDescription, sex, voteCount);
        }
    }

}
