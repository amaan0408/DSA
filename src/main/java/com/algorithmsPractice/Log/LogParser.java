package com.algorithmsPractice.Log;

import java.util.*;

public class LogParser {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "10.01.01 Exception error XXXX",
                "10.01.02 Exception error XXXX",
                "10.01.02 Exception error XXYX",
                "10.01.01 Exception error XXXX"
        );

        // Map to store: "Timestamp ErrorMessage" -> Count
        Map<String, Integer> counts = new HashMap<>();

        for (String log : logs) {
            // Option A: If "Timestamp + Error" combined is the unique key
            counts.put(log, counts.getOrDefault(log, 0) + 1);
        }

        // Print results
        counts.forEach((logEntry, count) -> {
            // Extract timestamp if needed, or format as "10.01.01 3"
            String timestamp = logEntry.split(" ")[0];
            if (logEntry.contains("XXYX")) {
                System.out.println(timestamp + " " + count);
            }
        });
    }
}