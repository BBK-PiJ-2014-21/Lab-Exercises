import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class TestStringUtils {

    public static void main(String[] args) {

        String s = (StringUtils.betterString("should print this", "shouldn't print this", (s1, s2) -> true));
        System.out.println(s);
        s = StringUtils.betterString("next should print this", "not this", (s1, s2) -> s1.length() > s2.length());
        System.out.println(s);

        s = StringUtils.betterEntry("should print this", "shouldn't print this", (s1, s2) -> true);
        System.out.println(s);
        s = StringUtils.betterEntry("next should print this", "not this", (s1, s2) -> s1.length() > s2.length());
        System.out.println(s);

        System.out.println();

        List<String> test = new ArrayList<>();
        Collections.addAll(test, "Blah", "Wah", "Bribe", "Soldier", "Wakeup", "Just", "No", "Sod", "Dude");

        List<String> shortWords = StringUtils.allMatches(test, s1 -> s1.length() < 4);
        List<String> wordsWithB = StringUtils.allMatches(test, s1 -> s1.contains("B") || s1.contains("b"));
        List<String> evenLengthyWords = StringUtils.allMatches(test, s1 -> (s1.length() %2) == 0);

        System.out.println(shortWords);
        System.out.println(wordsWithB);
        System.out.println(evenLengthyWords);

        System.out.println();

        List<String> genShortWords = StringUtils.tAllMatches(test, s1 -> s1.length() < 4);
        List<String> genWordsWithB = StringUtils.tAllMatches(test, s1 -> s1.contains("B") || s1.contains("b"));
        List<String> genEvenLengthyWords = StringUtils.tAllMatches(test, s1 -> (s1.length() % 2) == 0);

        System.out.println(genShortWords);
        System.out.println(genWordsWithB);
        System.out.println(genEvenLengthyWords);

        System.out.println();

        List<String> excitingWords = StringUtils.transformedList(test, s1 -> s1 + "!");
        List<String> eyeWords = StringUtils.transformedList(test, s1 -> s1.replace("i", "eye"));
        List<String> upperCaseWords = StringUtils.transformedList(test, String::toUpperCase);

        System.out.println(excitingWords);
        System.out.println(eyeWords);
        System.out.println(upperCaseWords);

        System.out.println();

        List<String> genExcitingWords = StringUtils.transformedGenericList(test, s1 -> s1 + "!");
        List<String> genEyeWords = StringUtils.transformedGenericList(test, s1 -> s1.replace("i", "eye"));
        List<String> genUpperCaseWords = StringUtils.transformedGenericList(test, String::toUpperCase);

        System.out.println(genExcitingWords);
        System.out.println(genEyeWords);
        System.out.println(genUpperCaseWords);

        List<Integer> length = StringUtils.transformedGenericList(test, String::length);

        System.out.println(length);
    }

}
