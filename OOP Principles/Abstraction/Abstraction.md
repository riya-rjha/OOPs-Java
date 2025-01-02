# Abstraction

- Abstraction is defined as hiding the unecessary details and showing only the valuable and relevant information. 

- For eg. When we start a car, we focus on inserting keys and driving. We are unaware of the internal combustion process of IC Engines or whatever goes on internally in car. This is Abstraction.

- For eg. We know the working of *println*, but we do not know how Java is configuring the method internally.

- The main difference between Abstraction and Encapsulation is that abstraction solves the design level issue, which we are able to see whereas Encapsulation solves the implementation level issue because that is what is handled by it.

- Abstraction works on the external visible methods, whereas Encapsulation works on the internal methods.

- We use Abstract classes, interfaces in Abstraction, and these define the structure of the program. We need not dive deep in how they are made and what is their definition. 

# Abstract Classes

- Abstract classes means those classes that show only an idea of the function, with the function name and the implementation of the method is done in the child class.
- Also known as Child Class Responsibility, the child class overrides the abstract methods.
- The class containing abstract method needs to be declared as an abstract class.
- Objects can't be created for an abstract class as to call the method of the abstract class we require a body. And since the body does not exist, due to only idea remaining and no function, Parent class objects can't be instantiated.
- However, Parent classes can be used as referential variables as this way we can use the non-abstract methods through the child class object type. 
- We cannot create abstract Constructors too.
- There remains no use of using abstract static methods as they cannot be overridden in child class. Although, we can call static methods and use them with their implementation in the main function.
- We cannot have final abstract classes as final classes cannot be overridden or inherited. 