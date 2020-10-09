package com.moodanalyser;

public class MoodAnalyser {

    public String analyserMood(String message) throws MoodAnalyserException {
        try {
            if(message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERE_EMPTY,"please enter a proper message");
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException e) {
            return "HAPPY";

        }catch (MoodAnalyserException f){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"please enter a proper message");
        }
    }
}
