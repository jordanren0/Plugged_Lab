package com.example.countinglabandroid;
import java.util.ArrayList;

public class topFive {
    private static String text;
    private static String cword;

    public topFive(String text, String cword) {
        this.text = text;
        this.cword = cword;
    }

    public static String[] topFiveWords(){
        Counter counter = new Counter();
        Parallel parallel = counter.count(text, cword);
        ArrayList<String> duplicate = parallel.getWordList();
        ArrayList<Integer> occurences = parallel.getCount();
        int[] topFiveOccurence = new int[5];
        String[] topFiveWord = new String[5];
        for(int i = 0; i < 5; i++){
            int index = 0;
            for(int j = 0; j < occurences.size(); j++){
                if(topFiveOccurence[i] < occurences.get(j)){
                    topFiveOccurence[i] = occurences.get(j);
                    topFiveWord[i] = duplicate.get(j);
                    index = j;
                }
            }
            duplicate.remove(index);
            occurences.remove(index);
        }
        return topFiveWord;
    }

    public static int[] topFiveWordsFrequency(){
        Counter counter = new Counter();
        Parallel parallel = counter.count(text, cword);
        ArrayList<String> duplicate = parallel.getWordList();
        ArrayList<Integer> occurences = parallel.getCount();
        int[] topFiveOccurence = new int[5];
        String[] topFiveWord = new String[5];
        for(int i = 0; i < 5; i++){
            int index = 0;
            for(int j = 0; j < occurences.size(); j++){
                if(topFiveOccurence[i] < occurences.get(j)){
                    topFiveOccurence[i] = occurences.get(j);
                    topFiveWord[i] = duplicate.get(j);
                    index = j;
                }
            }
            duplicate.remove(index);
            occurences.remove(index);
        }
        return topFiveOccurence;
    }
}
