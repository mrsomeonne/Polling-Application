package com.voting.votingapp.controllers;

import com.voting.votingapp.model.Poll;
import com.voting.votingapp.services.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequiredArgsConstructor
@RequestMapping("/api/polls")
public class PollController {

    private final PollService pollService;

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return pollService.createPoll(poll);
    }

    @GetMapping
    public List<Poll> getAllPoll(){
        return pollService.getAllPoll();
    }

}
