import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 */
public class StringUtils {

    public static int eChecker(String s1, String s2) {
        if(s1.charAt(0)=='e' && s2.charAt(0)!='e') {
            return -1;
        } else if(s1.charAt(0)!='e' && s2.charAt(0)=='e') {
            return 1;
        } else return 0;
    }

    public static String betterString(String s1, String s2, TwoStringPredicate predicate) {
        if(predicate.testStrings(s1, s2)) {
            return s1;
        } else return s2;
    }

    public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> predicate) {
        if(predicate.testEntries(t1, t2)) return t1;
        else return t2;
    }

    public static List<String> allMatches(List<String> list, Predicate<String> predicate) {
        List<String> toReturn = new LinkedList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                toReturn.add(s);
            }
        }
        return toReturn;
    }

    public static <T> List<T> tAllMatches(List<T> list, Predicate<T> predicate) {
        List<T> toReturn = new LinkedList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                toReturn.add(element);
            }
        }
        return toReturn;
    }

    public static List<String> transformedList(List<String> list, Function<String, String> function) {
        List<String> toReturn = new LinkedList<>();
        for(String s : list) {
            toReturn.add(function.apply(s));
        }
        return toReturn;
    }

    public static <T, R> List<R> transformedGenericList(List<T> list, Function<T, R> function) {
        List<R> toReturn = new LinkedList<>();
        for(T element : list) {
            toReturn.add(function.apply(element));
        }
        return toReturn;
    }

}
