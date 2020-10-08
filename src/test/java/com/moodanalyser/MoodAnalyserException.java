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
        } catch (MoodAnalyserTest e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood("this is Sad message");
        }catch(MoodAnalyserTest e) {
            Assert.assertEquals("SAD", mood);
        }
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood("I am in any mood");
        } catch (MoodAnalyserTest e) {
            Assert.assertEquals("HAPPY", mood);
        }
    }

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {

            mood = moodAnalyser.analyserMood("");
        } catch (MoodAnalyserTest e) {
            Assert.assertEquals("please enter a proper message",e.getMessage());
        }
    }

    @Test
    public void givenMessage_WhenHappyMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {

          mood = moodAnalyser.analyserMood(null);
        } catch (MoodAnalyserTest e) {
            Assert.assertEquals("please enter a proper message",e.getMessage());
        }
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyserMood(null);
        } catch (MoodAnalyserTest e) {
            Assert.assertEquals("HAPPY", mood);
        }

    }

    @Test
    public void givenMessage_WhenNull_ShouldThrowAnException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserTest.class);
            mood = moodAnalyser.analyserMood(null);
        }catch (MoodAnalyserTest e) {
            Assert.assertEquals(MoodAnalyserTest.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowAnException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyserMood("");
        }catch (MoodAnalyserTest e) {
            Assert.assertEquals(MoodAnalyserTest.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}
