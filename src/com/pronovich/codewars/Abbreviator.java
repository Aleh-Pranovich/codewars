package com.pronovich.codewars;

    /*The word i18n is a common abbreviation of internationalization the developer community use instead of typing
    the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
    Write a function that takes a string and turns any and all "words" (see below) within that string of length 4
    or greater into an abbreviation following the same rules.
    Notes:
    A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen
    (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
    The abbreviated version of the word should have the first letter, then the number of removed characters, then
    the last letter (eg. "elephant ride" => "e6t r2e").

    Example:
    abbreviate("elephant-rides are really fun!")
      ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
     words (^):   "elephant" "rides" "are" "really" "fun"
                    123456     123     1     1234     1
     ignore short words:               X              X
     abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
     all non-word characters (*) remain in place
                         "-"      " "    " "     " "     "!"
            === "e6t-r3s are r4y fun!"*/

import java.util.HashMap;
import java.util.Map;

public class Abbreviator {

    public String abbreviate(String string) {
        Map<String, String> countMap = new HashMap<>();
        String[] wordsArray = string.split("\\W|_|\'");
        for (String s : wordsArray) {
            if (s.length() > 3) {
                String newString = s.substring(1, s.length() - 1);
                String finalStr = s.replace( newString, String.valueOf( newString.length() ) );
                countMap.put(s, finalStr);
            }
        }
        for (String s : countMap.keySet()) {
            string = string.replaceAll("\\b" + s + "\\b", countMap.get(s));
        }
        return string;
    }
}
