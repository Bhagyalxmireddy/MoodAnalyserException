package com.moodanalyser;

public class MoodAnalyser {
    public String analyserMood(String message) throws MoodAnalyserException {
        try {
            if (message.contains("HAPPY")) {
                return "HAPPY";
            } else {
                return "SAD";
            }
        }catch (NullPointerException e){
            //throw new MoodAnalyserException("please enter proper message");
            return "HAPPY";
        }
    }
}
