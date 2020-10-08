package com.moodanalyser;

public class MoodAnalyser {
    public String analyserMood(String message) throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"please enter proper message");
            if (message.contains("Happy")) {
                return "HAPPY";
            } else {
                return "SAD";
            }
        }catch (NullPointerException e){
           // return "HAPPY";
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"please enter proper message");
        }
    }
}
