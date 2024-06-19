package org.example;

import java.util.List;

public class Vote {
    public Vote(List<String> votes) {
        this.votes = votes;
    }

    public List<String> getVotes() {
        return votes;
    }

    private List<String> votes;
}
