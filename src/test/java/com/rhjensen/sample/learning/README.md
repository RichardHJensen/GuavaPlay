## What's a learning test?
I like to write 'a learning test' to help me understand how to use a library with which I'm unfamiliar.
They need to be focused on how I expect to use the library and verified with results (at least by inspection).
They also provide a safety net if the library changes in the future.

## OpenCSVLearningTest
I downloaded some nutrition information and created a .csv file.

How do I get that data into Java objects so I can apply guava features to collections of those items?

* `CSVReader` gives you a `List<String[]>` and I could work with that if I had to.
* `CsvToBean` will give you `List<T>` (Java Beans) based on:
    * The 'header' line in the .csv corresponds to the normal bean getter/setter naming conventions
    * __OR__ you can supply a map of what the heading column name maps to in terms of the Java Bean