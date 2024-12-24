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

- We cannot access a non-static method or variable in a static context or method. This is because to run the non-static method, an instance or an object of the class is required. And a non-static method is treated as an instance/object, whereas a static method is not dependent on objects. 
- Logically, you can't access non-static methods because a static method would require an instance of class, but the **non-static method is itself an instace**, and that would further require an instantiation of it's own class. 
- Static methods are loaded first in memory. 
- **Static methods can access only static methods** but non-static can accept both. 
- It is important to note that a non-static method or variable can be accessed in a non-static class or method. Logically, the non static method knows that it will get it's object created. It's super class too knows that it will also have it's object created. So, both the classes' objects will be created in the main function which is static. 
- We should not use this keyword with static, because by convention it is accessed through it's className. Also, we can't use non-static variables of the class in that method as it would account to an object being used in the static-method, and objects are non-static. The objects would require creation of an instance of the class.
- A non-static class created in the file would give an error when trying to access the methods without static reference. This is because the class is then dependent on the outer class. But when the class is made static, it becomes independent of the outer class. 
- *Static methods are bound to classes & not objects*. 
- The outermost class is the top level class that is non-static. Non-public classes can be declared within the top level class.
- Top level classes do not require instantitation of another class to be accessed. 
- The static code block is executed first and only once.

## Internal working of statements

**_System.out.println_** - println is a method, out is a variable and System is a class. 

When you try to print the object, internally it is checked whether it is a string or not. And since class is not a string, it first prints the class name followed by the hexadecimal value, and that is the reason why we get an output of absurd values when printing the object.

## Singleton Class

Through singleton class, only one object is created as a global object and it's access is provided throughout the application. Following are the requirements for a singleton class:

- private constructor to prevent instantiation from outside class
- static variable
- public static method to return the instance (only this can be accessed by outside files)

Refer to <a href="">**Singleton Class**</a> for more references.