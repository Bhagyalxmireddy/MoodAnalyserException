package com.moodanalyser;

public class MoodAnalyser {

    public String analyserMood(String message) throws MoodAnalyserTest {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserTest(MoodAnalyserTest.ExceptionType.ENTERED_EMPTY, "please enter a proper message");
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch(MoodAnalyserTest e) {
            throw new MoodAnalyserTest(MoodAnalyserTest.ExceptionType.ENTERED_NULL, "please enter a proper message");
        }

    }
}
