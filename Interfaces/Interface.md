# Interfaces

- Interfaces allow Multiple Inheritance in Java. An interface implicity defines all it's methods as abstract and states only their idea. The child class implements the parent class interface and specifies their implementation.

- Instances in an interface are implicitly declared as final, static and public. Classes are declared implcitly as public and abstract. (Java 8)

- All methods in Interfaces are public by default and unlike Abstraction, here keyword implements is used instead of extends. Apart from this, Abstraction does not allow more than one child class of a parent class whereas using Interfaces, we can define more than one child class for a single parent. 

- Two classes that are unrelated to each other and can also implement the same parent using interfaces, unlike abstract classes, where a hierarchical structure is followed due to this: Parent -> Class -> Subclass and etc.

- Interfaces can sometimes cause performance critical codes, such as where due to the reason inheritances objects cannot be instantiated, so it needs to be called through method and this increases overhead.
