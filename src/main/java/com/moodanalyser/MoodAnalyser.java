package com.moodanalyser;

public class MoodAnalyser {

    public String analyserMood(String message) throws MoodAnalyserException {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException e) {
            return "HAPPY";

        }
    }
}
