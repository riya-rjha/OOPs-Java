# References (Static + Non Static)

## Static Method Reference

There is a common error we come across when creating instances of classes. When we are trying to invoke a non-static method by not referencing an enclosing instance of it's outer class, it shows an error. Non-static methods in Java have an implicit reference to their enclosing class. Static methods are standalone codes and do not require any instance of their enclosing class.

Steps to resolve this error is to first create an enclosing instance of the outer class and then use the outer instance to create an instance of the inner class.

## Packages

Refer to <a href="packages/Packages.java">**_Packages.java_**</a> and <a href="PackagesII.java">**_PackagesII.java_**</a> for code.

When importing a package's class in the file of same directory, we need not add the import statement. We can simply follow the given syntax:

```
Class_Name.method_name(params)
```

Otherwise, the package and it's method that has to be imported is written at the top of the file with the source directoy followed by the complete path and classname.

## Static keyword

Static variables are global variables which are shared by all instances(objects) of the class. They can be accessed even without creating objects of the same class. Both static variables and methods can be created. One such example of a static method is _public static void main_. To learn how to access a static variable refer to **<a href="PackagesII.java">Accessing Static Variables</a>** and **<a href="packages/Greetings.java">Creating Static Variables</a>**.

**Note:** If a class has not been declared using a modifier, it has a default modifier (package-private). 

**public static void main** is the static method created and without this the Java program does not run. It is a static method that runs without creating an object of the class. This is because to create an object, we would first require a main function to do so, since logically, there is no object that can be used to create main function.

Use the following command to access static variables:
```
Class_name.static_variable
```

### Accessing static variables

We cannot access a non-static method or variable in a static context or method. This is because to run the non-static method, an instance or an object of the class is required. And a non-static method is treated as an instance/object, whereas a static method is not dependent on objects. Logically, you can't access non-static methods because a static method would require an instance of class, but the non-static method is itself an instace, and that would further require an instantiation of it's own class. Static methods are loaded first in memory. 