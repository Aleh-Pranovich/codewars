package com.pronovich.codewars;

    /*Your friend won't stop texting his girlfriend. It's all he does. All day. Seriously. The texts are so mushy too!
     The whole situation just makes you feel ill. Being the wonderful friend that you are, you hatch an evil plot.
     While he's sleeping, you take his phone and change the autocorrect options so that every time he types "you" or
      "u" it gets changed to "your sister."

    Write a function called autocorrect that takes a string and replaces all instances of "you" or "u" (not case
    sensitive) with "your sister" (always lower case).

    Return the resulting string.
    Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".

    For the purposes of this kata, here's what you need to support:

    "youuuuu" with any number of u characters tacked onto the end
    "u" at the beginning, middle, or end of a string, but NOT part of a word
    "you" but NOT as part of another word like youtube or bayou*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvilAutocorrectPrank {
    public static String autocorrect(String input) {
        StringBuilder sb = new StringBuilder();
        String[] str = input.split(" ");
        for (String s : str) {
            Pattern p = Pattern.compile("^[Uu]$|^[Yy][Oo][Uu]+([!?]|$)");
            Matcher m = p.matcher(s.toLowerCase());
            if (m.find()) {
                s = s.replaceAll("^[Uu]+|^[Yy][Oo][Uu]+", "your sister");
            }
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
