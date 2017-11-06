package com.example.alexandersmith.wordcount;

/**
 * Created by alexandersmith on 06/11/2017.
 */

public class Wordcount {

    private String words;

    public Wordcount(String words) {
        this.words = words;
    }

    public int getWordcount(){
        String[] wordArray = words.trim().split("\\s+");
        int wordCount = wordArray.length;
        return wordCount;
    }
}
