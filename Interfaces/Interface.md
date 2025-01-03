# Interfaces

- Interfaces allow Multiple Inheritance in Java. An interface implicity defines all it's methods as abstract and states only their idea. The child class implements the parent class interface and specifies their implementation.

- Instances in an interface are implicitly declared as final, static and public. Classes are declared implcitly as public and abstract. (Java 8)

- All methods in Interfaces are public by default and unlike Abstraction, here keyword **implements** is used instead of extends. Apart from this, Abstraction does not allow more than one child class of a parent class whereas using Interfaces, we can define more than one child class for a single parent. 

- Two classes that are unrelated to each other and can also implement the same parent using interfaces, unlike abstract classes, where a hierarchical structure is followed due to this: Parent -> Class -> Subclass and etc.

- Interfaces can sometimes cause performance critical codes, such as where due to the reason inheritances objects cannot be instantiated, so it needs to be called through method and this increases overhead.

- If A is an interface and B implements A, and C implements B, then C has to override both methods of A as well as B given the fact that the methods have only been stated in B and not been overridden by it.

- In order to inherit one interface to another, we use **extends** keyword, and when we inherit a class from another interface, we use **implements**.

- Like Abstraction, where you cannot instantiate objects of an abstract class, similarly, interfaces cannot instantiate their objects. However, the interfaces can be used as referential classes and this allows them to access only their own methods. 