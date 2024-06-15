package com.pingwit.part_14.homework.task_4;

public class WordCounter {
    public static void main(String[] args) {

        String text = "While major gameplay components are already in place and functioning," +
                " players help is needed to add some of the smaller features and content." +
                " Of course polishing the overall experience is important at the same time." +
                " Game has been extensively tested in closed group," +
                " but it is always important to hear fresh suggestions from larger crowd that" +
                " come from various gaming backgrounds." +
                " Plan is to make the game as good as possible but without compromising the core idea.";

        String[] wordsToFind = {"alert", " add ", "good ", "plan "};

        //Оставил на всякий случай:):):)
    /* Давай пока без использования коллекций и решений при помощи гугл. Технически задача решена верно, но не оптимально.
    На данный момент можно создать 4 переменные alert, add и т.д. и считать кол-во слов.
    Либо более сложный вариант - создать новый класс WordWarehouse, в котором 2 поля: word, count.
    Затем сделать WordWarehouse[] = {new WordWarehouse("alert", 0)} и затем считать кол-во совпадений
     */
        WordWarehouse[] wordCounts = countWords(text, wordsToFind);
        for (WordWarehouse ww : wordCounts) {
            System.out.println("Word '" + ww.word + "' meets " + ww.count + " once.");
        }
    }

    public static WordWarehouse[] countWords(String text, String[] wordsToFind) {
        WordWarehouse[] warehouses = new WordWarehouse[wordsToFind.length];
        for (int i = 0; i < wordsToFind.length; i++) {
            warehouses[i] = new WordWarehouse(wordsToFind[i].toLowerCase());
        }

        String[] words = text.toLowerCase().replaceAll("[.,]", "").split("\\s+"); // можно еще немного улучшить, ты можешь искать indexOf для пробела и затем использовать contains у отрезка, вместо equals, но можно оставить как есть

        for (String word : words) {
            for (WordWarehouse ww : warehouses) {
                if (ww.word.equals(word)) {
                    ww.count++;
                }
            }
        }
        return warehouses;
    }
}