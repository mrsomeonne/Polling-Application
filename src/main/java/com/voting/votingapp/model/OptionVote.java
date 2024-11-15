package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Embeddable
public class OptionVote {

    //Each Option should have its own vote ie vote must be linked to options not polls

    private String voteOption;
    private Long voteCount= 0L;

}
