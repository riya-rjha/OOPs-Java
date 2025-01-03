# Interfaces

Refer to <a href="Interface.java"> Interfaces </a> for more details.

- Interfaces allow Multiple Inheritance in Java. An interface implicity defines all it's methods as abstract and states only their idea. The child class implements the parent class interface and specifies their implementation.

- Instances in an interface are implicitly declared as final, static and public. Classes are declared implcitly as public and abstract. (Java 8)

- All methods in Interfaces are public by default and unlike Abstraction, here keyword **implements** is used instead of extends. Apart from this, Abstraction does not allow more than one child class of a parent class whereas using Interfaces, we can define more than one child class for a single parent.

- Two classes that are unrelated to each other and can also implement the same parent using interfaces, unlike abstract classes, where a hierarchical structure is followed due to this: Parent -> Class -> Subclass and etc.

- Interfaces can sometimes cause performance critical codes, such as where due to the reason inheritances objects cannot be instantiated, so it needs to be called through method and this increases overhead.

- If A is an interface and B implements A, and C implements B, then C has to override both methods of A as well as B given the fact that the methods have only been stated in B and not been overridden by it.

- In order to inherit one interface to another, we use **extends** keyword, and when we inherit a class from another interface, we use **implements**.

- Like Abstraction, where you cannot instantiate objects of an abstract class, similarly, interfaces cannot instantiate their objects. However, the interfaces can be used as referential classes and this allows them to access only their own methods.

- Static methods in Interfaces require a body, as they can't be overridden.

- **Important:** By default, in Java 8, the _variables_ are declared as _public, static and final_, so we cannot initialize them again in the classes being extended. _Methods_ in interfaces are by default declared as _public and abstract_ with no body being specified. Thus, to create a method of own, one needs to declare it as static.

# Annotations

Annotations are a form of metadata that provide supplementary information about the code and do not affect the program directly. They are helpful in understanding the code. They are written starting with an **@** symbol followed by the name of annotation. For eg. @Override, @SuppressWarnings("unchecked"), @FunctionalInterface

Here's how we can create <a href="Interface.java">*Custom Annotations*</a>
