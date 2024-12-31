# Polymorphism

Refer to <a href="Polymorphism.java">Polymorphism</a> for codes.

The literal meaning of Polymorphism is many ways to represent a single entity. Polymorphism means the representation of functions of the parent class and it's inherited class in different ways. For eg. The same function getArea() in the parent class Shape is again defined in the child class Square. This is an example of Runtime Polymorphis.

# Types of Polymorphism

1. **Compile Time Polymorphism** (Static Polymorphism) (Method Overloading)

In compile time polymorphism, the same function is defined in the parent class and sub classes, however, the return type, or the parameters are different. The body might be same. Methods can be overloaded in Java, *Object Overloading is not supported in Java*. Eg. Multiple Constructors formation is an example of Compile Time Polymorphism. **Different order of parameters in function can also create Method Overloading.**


### Why is this called Compile Time Polymorphism?

This is because Java determines at compile time which constructor should be called and is method overloading working here or not. It checks for errors during compile time only and checks for the most specific constructor match available in the class.


2. **Runtime Polymorphism** (Dynamic Polymorphism) (Method Overriding) 

In runtime polymorphism, same function is defined in the parent class and sub class, with the same name, arguments, and return type, only the body of the function is different. An important annotation, **@Override** is used which throws an error if the method is not being overridden. 

In polymorphism, it's true that the methods and classes of Referential class are accessed, but if the Object class has the same method, the latter is given priority. Here, the term **Upcasting** is used. Upcasting means when the referential class is parent and the object class is the child class, and it is used to exhibit the behaviours of Polymorphism.

```
Parent_class par = new Child_class()
```

## How does Java determine which method it has to access?

The Referential class determines which all methods are accessible within the scope whereas the Object class determines which method is supposed to be called at runtime. This is governed by Dynamic Method Dispatch by which is a mechanism in Java that works to call the overidden method at runtime and not compile time. Referential class methods and fields are excessed during compile-time and object class methods and fields are checked during runtime.

## Static and Final Keywords

- **final** keyword is used to prevent overriding and overloading. It can also prevent Inheritance. This enhances performance in Java JDK as one method is defined for a sole purpose and Java knows that it won't have to look for other methods of the same name, or params, and hence, it searches for the method containing final as it's keyword and uses it. 

- **Binding** is the process of associating a method call with a method body. There are two types of Bindings in Java: Late Binding & Early Binding.

- **Late Binding**, also known as the **Dynamic Binding** is the process of compilation, running and then calling the method at runtime, where overriding finally takes place. It applies to _non-static_ and _overridden_ methods.

- **Early Bindng**, also known as the **Static Binding** is the process of calling methods during compile time. It applies to _static_ and _final_ methods. 

- When you declare a class as final, it's methods are implicitly declared as final too.

- **We cannot override static methods in Java.** This is because anyhow the parent class will be executed for the child class, and when the static method is called, it being not dependent on objects executes the parent class static method. In logical terms, **Overriding depends on objects**, as to which ever object will be called, it will execute the method of the Object class type and since **Static methods do not depend on objects**, hence, **Static methods cannot be overridden**.

- Overriding and Overloading do not depend on instance variables, they work ony on methods. This is because instance variables depend on the reference type, whereas methods depend on object class type.