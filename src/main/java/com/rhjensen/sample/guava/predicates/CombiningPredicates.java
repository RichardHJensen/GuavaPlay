package com.rhjensen.sample.guava.predicates;

/**
 * Created by Richard on 4/14/2014.
 *
 * The Predicates class contains static functions to allow using multiple predicates where one is indicated
 *
 * static <T> Predicate<T>	and(Iterable<? extends Predicate<? super T>> components)
 *     Returns a predicate that evaluates to true if each of its components evaluates to true.
 *
 * static <T> Predicate<T>	and(Predicate<? super T>... components)
 *     Returns a predicate that evaluates to true if each of its components evaluates to true.
 *
 * static <T> Predicate<T>	and(Predicate<? super T> first, Predicate<? super T> second)
 *     Returns a predicate that evaluates to true if both of its components evaluate to true.
 *
 * static <T> Predicate<T>	not(Predicate<T> predicate)
 *     Returns a predicate that evaluates to true if the given predicate evaluates to false.
 *
 * static <T> Predicate<T>	or(Iterable<? extends Predicate<? super T>> components)
 *     Returns a predicate that evaluates to true if any one of its components evaluates to true.
 *
 * static <T> Predicate<T>	or(Predicate<? super T>... components)
 *     Returns a predicate that evaluates to true if any one of its components evaluates to true.
 *
 * static <T> Predicate<T>	or(Predicate<? super T> first, Predicate<? super T> second)
 *     Returns a predicate that evaluates to true if either of its components evaluates to true.
 */
public class CombiningPredicates {
}
