package com.voting.votingapp.services;

import com.voting.votingapp.model.Poll;
import com.voting.votingapp.repositories.PollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service @RequiredArgsConstructor
public class PollService {

    private final PollRepository pollRepository;

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPoll() {
        return pollRepository.findAll();
    }
}
