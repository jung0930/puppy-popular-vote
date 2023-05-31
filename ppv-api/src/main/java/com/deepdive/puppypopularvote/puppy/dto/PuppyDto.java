package com.deepdive.puppypopularvote.puppy.dto;


import com.deepdive.puppypopularvote.code.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

public class PuppyDto {


//    @Getter
//    @Setter
//    public static class ListRequest {
//        private int pageNo;
//        private int pageSize;
//        private String sortBy;
//        private String order;
//
//        private ListRequest(int pageNo, int pageSize, String sortBy, String order) {
//            this.pageNo = pageNo;
//            this.pageSize = pageSize;
//            this.sortBy = sortBy;
//            this.order = order;
//        }
//
//        public static PuppyDto.ListRequest of(int pageNo, int pageSize, String sortBy, String order) {
//            return new ListRequest(pageNo, pageSize, sortBy, order);
//        }
//    }


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

        private ListResponse(Page<Detail> puppies) {
            this.puppies = puppies;
        }

        public static ListResponse of(Page<Detail> puppies) {
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

        private Detail(Long id, String name, String photoFileName, String summaryDescription, Sex sex, Integer voteCount) {
            this.id = id;
            this.name = name;
            this.photoFileName = photoFileName;
            this.summaryDescription = summaryDescription;
            this.sex = sex;
            this.voteCount = voteCount;
        }

        public static Detail of(Long id, String name, String photoFileName, String summaryDescription, Sex sex, Integer voteCount) {
            return new Detail(id, name, photoFileName, summaryDescription, sex, voteCount);
        }
    }

}
