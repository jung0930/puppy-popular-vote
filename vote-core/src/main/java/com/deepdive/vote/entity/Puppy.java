package com.deepdive.vote.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import com.deepdive.vote.domain.code.Sex;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"voteInfo"})
@Entity
@Table(name = "puppy")
public class Puppy extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "puppy_id")
    private Long id;

    @OneToMany(mappedBy = "puppy")
    private List<VoteInfo> voteInfo = new ArrayList<>();

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "photo_file_name", nullable = false, length = 50)
    private String photoFileName;

    @Column(name = "summary_description", nullable = false, length = 100)
    private String summaryDescription;

    @Column(name = "detail_description", nullable = false, length = 500)
    private String detailDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;

    @Column(name = "vote_count", nullable = false)
    @ColumnDefault("0")
    private Integer voteCount;

    @Builder
    public Puppy(Long id, List<VoteInfo> voteInfo, String name, String photoFileName, String summaryDescription, String detailDescription, Sex sex, Integer voteCount) {
        this.id = id;
        this.voteInfo = voteInfo;
        this.name = name;
        this.photoFileName = photoFileName;
        this.summaryDescription = summaryDescription;
        this.detailDescription = detailDescription;
        this.sex = sex;
        this.voteCount = voteCount;
    }

}
