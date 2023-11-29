# Example of MC/DC Testing

This repo is an example of MC/DC testing of code over the Periodic Table of elements. The file _pairsandtests.txt_ contains an MC/DC analysis of just one _if_ statement in the _atomicBlock()_ method. The JUnit tests contain the resulting test cases.

Run the JUnit tests by doing the command "ant" (after setting your JUnit and JaCoCo paths in the _build.xml_ file).

To generate a coverage report based on the tests, do the command "ant report"

You can also run the program as "java PeriodicTable 67", which would report the atomic group of element 67.

This code is inherently flawed, because the periodic table cannot be reduced to nice neat mathematical formulas. If your code is getting too complicated, it is probably __bad code__!

The folder _bettercode_ has a better approach to this same problem (reporting the group of an element). 

