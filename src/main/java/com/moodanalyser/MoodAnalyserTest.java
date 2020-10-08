package com.moodanalyser;

public class MoodAnalyserTest extends Throwable {
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;
    public MoodAnalyserTest(ExceptionType type,String message)
    {
        super(message);
        this.type = type;
    }
}
