package com.moodanalyser;

public class MoodAnalyser {

    public String analyserMood(String message) throws MoodAnalyserTest {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch(NullPointerException e){
            return "HAPPY";
        }

    }
}
