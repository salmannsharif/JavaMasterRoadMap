package com.training.serializeanddeserialize;

import java.io.IOException;

public class SerializeAndDeserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
         🔐 Serialization:
         - The process of converting a Java object into a byte stream.
         - Useful when you want to save the object state to a file, send over a network, or store in a database as binary.

         🔓 Deserialization:
         - The process of converting the byte stream back into a Java object (reconstructing the original object).
        */

        /*
         ✅ Real-world use cases:
         - Saving user sessions to disk in desktop applications.
         - Sending objects between services in distributed systems.
         - Caching complex objects in a binary format.
         - Storing objects to resume later (e.g., game states, form states).
        */

        String filePath = "E:\\filestream\\test.dat";

        // Create an Employee object to be stored
        Employee employee = new Employee("John", 30);

        ObjectStorage objectStorage = new ObjectStorage();

        try {
            // ✅ Serialization: Writing the object to file
            objectStorage.saveObject(filePath, employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // ✅ Deserialization: Reading the object back from file
        Object o = objectStorage.loadObject(filePath);
        Employee employee1 = (Employee) o;

        // Output the deserialized object
        System.out.println(employee1);

        /*
         ⚠️ Important Note:
         - The class of the object being serialized must implement `java.io.Serializable`.
         - If you forget to implement Serializable:
           ➤ You'll get a `java.io.NotSerializableException` at runtime during serialization.
         - Serializable is a marker interface (no methods), used to flag the JVM that this object can be safely serialized.
        */
    }
}
