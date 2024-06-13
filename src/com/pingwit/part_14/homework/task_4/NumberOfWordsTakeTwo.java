package com.pingwit.part_14.homework.task_4;

public class NumberOfWordsTakeTwo {
    public static void main(String[] args) {
        String text = """
                While major gameplay components,
                are already in place and functioning, players help is needed to add some
                of the smaller features and content. Of course polishing the overall experience is important
                at the same time. Game has been extensively tested in closed group, but it is always important
                to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to
                make the game as good as possible but without compromising the core idea.
                """;

        int alertCount = 0;
        int addCount = 0;
        int goodCount = 0;
        int planCount = 0;

        alertCount = countWordOccurrences(text, "alert");
        addCount = countWordOccurrences(text, "add");
        goodCount = countWordOccurrences(text, "good");
        planCount = countWordOccurrences(text, "plan");

        System.out.println("The word 'alert' meets " + alertCount + " times");
        System.out.println("The word 'add' meets " + addCount + " times");
        System.out.println("The word 'good' meets " + goodCount + " times");
        System.out.println("The word 'plan' meets " + planCount + " times");
    }

    public static int countWordOccurrences(String text, String word) {
        int count = 0;
        int fromIndex = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();

        while ((fromIndex = text.indexOf(word, fromIndex)) != -1) {
            if ((fromIndex == 0 || !Character.isLetterOrDigit(text.charAt(fromIndex - 1))) &&
                    (fromIndex + word.length() == text.length() || !Character.isLetterOrDigit(text.charAt(fromIndex + word.length())))) {
                count++;
            }
            fromIndex += word.length();
        }
        return count;
    }
}