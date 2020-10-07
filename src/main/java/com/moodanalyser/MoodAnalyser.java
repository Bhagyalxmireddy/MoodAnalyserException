package com.moodanalyser;

public class MoodAnalyser {
    public String analyserMood(String message) {
        if(message.contains("Happy")) {
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
}
