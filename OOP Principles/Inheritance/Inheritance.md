# OOPs Principles

<a href="Inheritance.java"><h2>Inheritance</h2></a>

Refer to <a href="Inheritance.java">Inheritance Java Code</a> for more details.

## super keyword

super keyword is used to access methods and pass references to the parent class. Methods and properties of the parent class are inherited in the child class using extends keyword, and thus, to use them we use the **super** keyword. Super class initialization needs to be called first, as the child class is expected to initialize the parent class fields first and then it's own fields. 

**_Note:_** Private class members or fields of the parent class are not accepted or can be referenced in the child class. They are literal private.

## Initializing objects

When we initialize objects, we can do so by two means. First is to initialize the object of the class using the same referential variable and same class. Second is to use a different referential variable and then a different class. Here, we can use the Parent class as the referential variable and the child class as the object class type. But the vice-versa is not possible, that is, **We cannot use the child class as referential variable as the parent class, which becomes the object class is unaware of the initializations of the child class.** However, the child class is aware of it's own and it's class intializations, and hence, it is possible.

We cannot call a child class constructor on an object of the Parent class. This is because the child is itslef initialized by a parent constructor. 

Here, the parameters of only the referential variable can be accessed. It has access to only it's own methods and variables. The referntial variable is stored in the heap memory and this is during **compile time** (Compile Time Polymorphism) , when it is checked for errors that whether there is an attemp to access those variables which are out of the reach of the referential class. The object class type is checked during **runtime** for errors as the actual methods of the parent class are overridden by the child class (Runtime Polymorphism).

**_Note:_**

```
Child_Class cc = new Parent_Class; // Error
Parent_Class pc = new Child_class;
access cc.Child_Class.params // Error
```

Whatever Reference variable is there in the Referential class, the object must initialize all those present in the Referential class. 

## Types of Inheritance

Refer to <a href="Types.java">Types of Inheritances Java</a> for more details.

1. **Single Level Inheritance**: When there exists a single parent class, and a child derived from that parent class and extends it's properties, it is called Single Level Inheritance. For eg. A is a parent class and B is the child class extending properties of A.

2. **Multi Level Inheritance**: When there exists a parent class, and a child class that derives it's properties from it's parent and further, this child class becomes parent of another child class that extends it's properties and so on, it is called Multi Level Inheritance. For eg. A is parent class of B, B is parent class of C, and so on.

3. **Multiple Inheritance**: When one child class has more than one parent, it is called Multiple Inheritance. For eg. A and B are the parent classes of C. However, **Multiple inheritance is not supported in Java.** This is because if both A and B have the same variable n and their values are different, then C would not know which value to inherit. This can be achieved by Interfaces.

4. **Hierarchical Inheritance**: When one parent class has more than one child class, it is called Hierarchical Inheritance. For eg. A is the parent class and B, C, D are the child classes of A.

5. **Hybrid Inheritance**: A combination of Single Level Inheritance + Multiple Level Inheritance is called Hybrid Inheritance. **Hybrid Inheritance is also not supported in Java.** For eg. A is the parent class, B and C are the child classes of A. And D is the child class of both B and C.