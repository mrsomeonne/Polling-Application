package com.voting.votingapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ElementCollection //Jpa will create a separate table in the database
    private List<OptionVote> options = new ArrayList<>();

//Each Option should have its own vote ie vote must be linked to options not polls

//    @ElementCollection
//    private List<Long> votes = new ArrayList<>();
}
