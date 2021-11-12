package moodTesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void moodAnalysis_Sad() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalysis_Happy() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Happy Message");
        Assert.assertEquals("HAPPY",mood);
    }
}
