package com.deepdive.puppypopularvote.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.deepdive.puppypopularvote.domain.code.VoteStatus;
import lombok.ToString;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"puppy"})
@Entity
@Table(name = "vote_info")
public class VoteInfo extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "vote_info_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "puppy_id")
    private Puppy puppy;

    @Column(name = "ip", nullable = false, length = 30)
    private String ip;

    @Enumerated(EnumType.STRING)
    @Column(name = "vote_status")
    private VoteStatus voteStatus;

}
