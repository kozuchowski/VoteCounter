package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VoteCounter voteCounter = new VoteCounter();
        List<Vote> votes = new ArrayList<>();
        Vote a = new Vote(Arrays.asList("a", "c", "b"));
        Vote b = new Vote(Arrays.asList("a", "b", "c"));
        Vote c = new Vote(Arrays.asList("b", "a", "c"));
        Vote d = new Vote(Arrays.asList("b", "a", "c"));

        votes.add(a);
        votes.add(b);
        votes.add(c);
        votes.add(d);

        System.out.println(voteCounter.processVotes(votes));

    }

}
