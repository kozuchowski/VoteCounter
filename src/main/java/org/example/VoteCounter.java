package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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
