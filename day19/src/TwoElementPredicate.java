/**
 *
 */

@FunctionalInterface
public interface TwoElementPredicate<T> {

    boolean testEntries(T first, T second);

}
