package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
We would like to implement a function that determines the results of popular vote. The function is going to look something like this:
List<String> processVotes(List<Vote> votes)
A voter is allowed to vote for up to three different candidates.
The order of the votes is important.
The first vote that a voter places is worth three points, the second vote is worth two points, the third vote is worth one point.
The function should return a list of candidates in descending order of the total number of points received by the candidate.
     */

public class VoteCounter {

    public List<String> processVotes(List<Vote> votes) {

        Map<String, Integer> result = new HashMap<>();
        for (Vote vote : votes) {
            int count = 3;
            for (String candidate : vote.getVotes()) {
                result.put(candidate, result.getOrDefault(candidate, 0) + count);
                count--;
            }
        }

        return MapSorter.sortByValueDescending(result)
                .keySet()
                .stream()
                .collect(Collectors.toList());
    }

}
