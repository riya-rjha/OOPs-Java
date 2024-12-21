# References (Static + Non Static)

## Static Method Reference

There is a common error we come across when creating instances of classes. When we are trying to invoke a non-static method by not referencing an enclosing instance of it's outer class, it shows an error. Non-static methods in Java have an implicit reference to their enclosing class. Static methods are standalone codes and do not require any instance of their enclosing class. 

Steps to resolve this error is to first create an enclosing instance of the outer class and then use the outer instance to create an instance of the inner class. 

