package com.rhjensen.sample.guava.predicates;

/**
 * Created by Richard on 4/14/2014.
 *
 * Iterables and Iterators provide some common methods for applying a predicate to their contents
 * (Iterables version shown)
 *
 * static <T> boolean	all(Iterable<T> iterable, Predicate<? super T> predicate)
 *     Returns true if every element in iterable satisfies the predicate.
 *
 * static <T> boolean	any(Iterable<T> iterable, Predicate<? super T> predicate)
 *     Returns true if any element in iterable satisfies the predicate.
 *
 * static <T> Iterable<T>	filter(Iterable<?> unfiltered, Class<T> type)
 *     Returns all instances of class type in unfiltered.
 *
 * static <T> Iterable<T>	filter(Iterable<T> unfiltered, Predicate<? super T> predicate)
 *     Returns the elements of unfiltered that satisfy a predicate.
 *
 * static <T> T	find(Iterable<? extends T> iterable, Predicate<? super T> predicate, T defaultValue)
 *    Returns the first element in iterable that satisfies the given predicate, or defaultValue if none found.
 *
 * static <T> T	find(Iterable<T> iterable, Predicate<? super T> predicate)
 *    Returns the first element in iterable that satisfies the given predicate; use this method only when such an element is known to exist.
 */
public class IterStarMethodsTakingPredicates {
}
