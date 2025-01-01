# Access Controls

Here is a tabular view for all the 4 Access Modifiers:

## Java Access Modifiers Accessibility

| Modifier    | Same Class | Subclass (Same Package) | Same Package | Different Package |
| ----------- | ---------- | ----------------------- | ------------ | ----------------- |
| `public`    | Yes        | Yes                     | Yes          | Yes               |
| `protected` | Yes        | Yes                     | Yes          | Yes (if subclass) |
| `default`   | Yes        | No                      | Yes          | No                |
| `private`   | Yes        | No                      | No           | No                |

**Note:** You are able to access the protected variable of a class in a different package only in it's subclass, not even it's own class. For eg. If A has a protected variable num, and B extends class B, then in another package, only B can access the variable, not even A. This is because only subclass knows what the parent class holds.

## Inbuilt Packages

1. **lang**: Default import in every code file and uses the Object class. Eg of methods: toString(), equals
2. **io**: Read and write files, uses BufferedReader, file delete
3. **util**: Contains utility functions, data structures
4. **applet**: Creates small programs for web pages, though deprecated in modern Java
5. **awt**: Used for building GUI applications, components like buttons, frames, labels etc
6. **net**: Used for Networking applications, socket applications etc.
