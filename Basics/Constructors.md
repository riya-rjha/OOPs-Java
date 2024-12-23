# Constructor

A constructor is a special type of function that is automaticaly invoked during the time of class creation. By default, a constructor is always initialized, and to create a new constructor, you need to intialize values of the class.

### this keyword

**_this_** keyword is used to refer the current class variable or method. It is a reference to the current object. It is helpful in constructor chaining, where every this points to the current instance of the class. View the code of <a href="Constructors.java">**_Constructors_**</a> to know more about it.

### Constructor Chaining

Constructor Chaining is a process that allows one constructor within a class to invoke the methods and logic of another constructor, that may be within it's parent class or the same class. We use the keywords **then** and **super** to perform the same. The then keyword is used to call the constructor of the same class and the super keyword is used to call the constructor of the parent class.

**_Note:_** Constructor calling within another constructor is always the first statement.

### Constructor Overloading

Constructor Overloading is when more than one constructor has the same but different parameters.

**Note:** Object initialization can take place with the help of another object of the same class. In simple words, if an object is created from that class, another new object that is created can be assigned with the value of the previously created object.

**_super_** keyword is used to call a constructor from it's super class or parent class.

### Destructor

In Java, it is the work of the garbage collector to close objects, keep a check on the memory space and it uses finalize to free up memory as and when required. 