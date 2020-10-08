package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserException extends Throwable {

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood("this is Happy message");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("this is Sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood("I am in any mood");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("SAD", mood);
        }
    }

    @Test
    public void givenMessage_WhenHappyMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood =moodAnalyser.analyserMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("HAPPY", mood);
        }

    }

}
