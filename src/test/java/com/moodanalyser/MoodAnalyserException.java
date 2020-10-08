package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserException {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("this is Happy message");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("this is Sad message");
        Assert.assertEquals("SAD", mood);

    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null ;
        try {
            mood = moodAnalyser.analyserMood("I am in any mood");
        }catch(NullPointerException e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }
}
