# Guava Play

## Using common parts of the Google guava library

* Collections
    * Collections can be _filtered_ using __Predicates__
    * Collections can be _transformed_ into a collection of another type using __Functions__
* Predicates
    * Applied to an object of type `<T>` (typically in a `Collection<T>` \[or List ...\]) returns `true` or `false`
    * Predicates can be chained/combined
* Functions
    * Given a collection (iterator/iterable) of a type `<A>`, create a new collection of a (possibly different type) `<B>`
    by passing each element of the original collection into the function and appending the returned object to the result collection
    * Functions can be composed.

[Why NOT functional programming in Java 7 using the guava library?] (https://code.google.com/p/guava-libraries/wiki/FunctionalExplained)