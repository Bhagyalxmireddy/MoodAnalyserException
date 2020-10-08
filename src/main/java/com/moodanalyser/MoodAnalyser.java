package com.moodanalyser;

public class MoodAnalyser {
    public String analyserMood(String message) {
        try {
            if (message.contains("HAPPY")) {
                return "HAAPY";
            } else {
                return "SAD";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
