package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class MapSorter {
    public static Map<String, Integer> sortByValueDescending(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new
                ));
    }
}
