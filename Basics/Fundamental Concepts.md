# Introduction to Classes, Objects, Constructors and Keywords

## Classes

- Class is a blueprint of an object.
- It is not a real world entity.
- It is a template of an object, and a logical unit.
- Creation of classes does not occupy space.
- Class is a named group of properties and functions

## Objects

- Object is an instance of class.
- An object is a real world entity.
- Object is a physical entity and creation of objects occupies space.

### Parts of Objects

An object consists of 3 parts: _State_, _Identity_ & _Behaviour_.

1. The state of an object is the value from it's data type.
2. The identity of an object is an information of where is it present, heap memory or stack memory.
3. The behaviour of an object is the effect of the methods, or data type operations.

### Variables

An operation on an object links a reference variable. For eg. If an object std of class Student is defined, it is stored in the stack memory. It creates a referential variable in the heap memory of the attributes & their values. In simpler words, variable that defines an object is called a **Referential Variable**.

### Why primitive data types are not initialized using the new keyword?

This is because the primitive data types are not objects. Whereas those data types that are objects require the new keyword during their instantiation. An example of this is the object being created of an Integer class. However, the values inside the object cannot be referenced using the new keyword, as they are initialized using a primitive data type only. But the object as a whole is initialized using new keyword. 

Primitive data types point to the Stack memory whereas the objects point to the Heap memory.

### Wrapper class

It is a class that wraps integer data within itself. For eg. Integer class is a Wrapper class and has several pre defined methods in Java, one such being compare, used commonly in Lambda expressions. A wrapper class has two parts: **Autoboxing** and **Unboxing**. Autoboxing is converting a primitive data type to a Wrapper class, whereas Unboxing is converting a Wrapper class data type to a primitive data type.

**Important:** Primitive data types can be changed by their values but not Wrapper classes, as Wrapper classes are immutable. They are objects that are passed by reference through means of value. This means that the value passed is a copy of the reference. 

**_Note: Java does not have pass by reference. It passes references by values only._**

### final keyword

**final** keyword cannot be changed. It is immutable. The final method cannot be overridden and final classes cannot be subclassed, or inherited.