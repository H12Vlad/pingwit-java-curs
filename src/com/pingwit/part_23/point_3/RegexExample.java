package com.pingwit.part_23.point_3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample {
    public static void main(String[] args) {
        /*
        ^ - starting position within the string
        $ - ending position of the string or the position just before a string-ending newline

        . -  any single character
        [A-Z] - upper case letters
        [a-z] - lower case letters
        [0-9], \\d - numbers

        ? - zero or one
        * - zero or more
        + - one or more

        {n}	The preceding item is matched exactly n times.
        {min,}	The preceding item is matched min or more times.
        {,max}	The preceding item is matched up to max times.
         */

        String color = "color";
        String colour = "colour";

        Pattern compile = Pattern.compile("colou?r");
        Matcher matcher = compile.matcher(color);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("=== Email verifier ===");
        String email = "pingwitpl@gmail.com";

        Pattern compileEmail = Pattern.compile("(.+)@(.+)");
        Matcher matcherEmail = compileEmail.matcher(email);

        if (matcherEmail.find()) {
            System.out.println(matcherEmail.group());
            System.out.println(matcherEmail.group(1));
            System.out.println(matcherEmail.group(2));
        }

        System.out.println("=== Letters verifier ===");
        String name = "Egorka";
        Pattern compileName = Pattern.compile("^E{1}[A-Za-z]+$");
        Matcher matcherName = compileName.matcher(name);

        if (matcherName.find()) {
            System.out.println(matcherName.group());
        }

    }
}
// в поиске браузера написать следующее " regex wiki"  и у википедии можно найти информацыю
