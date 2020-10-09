package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    enum ExceptionType{
        ENTERED_NULL,ENTERE_EMPTY;
    }
    ExceptionType type;
    public MoodAnalyserException( ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
