package com.deepdive.puppypopularvote.domain.kafka;

import com.deepdive.puppypopularvote.code.VoteStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VoteTopic {

    private Long id;
    private VoteStatus voteStatus;

    public VoteTopic(final Long id, final VoteStatus voteStatus) {
        this.id = id;
        this.voteStatus = voteStatus;
    }

    public static VoteTopic of(final Long id, final VoteStatus voteStatus) {
        return new VoteTopic(id, voteStatus);
    }

}
