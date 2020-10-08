package com.moodanalyser;

public class MoodAnalyser {
    public String analyserMood(String message) {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
    }
}
