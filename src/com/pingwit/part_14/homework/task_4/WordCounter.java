package com.pingwit.part_14.homework.task_4;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {

        String text = "While major gameplay components are already in place and functioning," +
                " players help is needed to add some of the smaller features and content." +
                " Of course polishing the overall experience is important at the same time." +
                " Game has been extensively tested in closed group," +
                " but it is always important to hear fresh suggestions from larger crowd that" +
                " come from various gaming backgrounds." +
                " Plan is to make the game as good as possible but without compromising the core idea.";

        String[] wordsToFind = {"alert", "add", "good", "plan"};

        Map<String, Integer> wordCounts = countWords(text, wordsToFind);
        for (String word : wordsToFind) {
            System.out.println("Слово '" + word + "' встречается " + wordCounts.getOrDefault(word, 0) + " раз.");
        }
    }

    /* Давай пока без использования коллекций и решений при помощи гугл. Технически задача решена верно, но не оптимально.
    На данный момент можно создать 4 переменные alert, add и т.д. и считать кол-во слов.
    Либо более сложный вариант - создать новый класс WordWarehouse, в котором 2 поля: word, count.
    Затем сделать WordWarehouse[] = {new WordWarehouse("alert", 0)} и затем считать кол-во совпадений
     */
    public static Map<String, Integer> countWords(String text, String[] wordsToFind) {
        String[] words = text.toLowerCase().replaceAll("[.,]", "").split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        Map<String, Integer> result = new HashMap<>();
        for (String wordToFind : wordsToFind) {
            result.put(wordToFind, wordCountMap.getOrDefault(wordToFind.toLowerCase(), 0));
        }
        return result;
    }
}