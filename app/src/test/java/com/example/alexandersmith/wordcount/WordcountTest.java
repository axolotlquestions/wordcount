package com.example.alexandersmith.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 06/11/2017.
 */
public class WordcountTest {

    Wordcount wordcount;
    Wordcount wordcount1;

    @Before
    public void setUp() throws Exception {
        wordcount = new Wordcount("It was the best of times, it was the blurst of times");
        wordcount1 = new Wordcount("This is a test");
    }

    @Test
    public void testGetWordCount(){
        assertEquals(12, wordcount.getWordcount());
        assertEquals(4, wordcount1.getWordcount());
    }

}