package com.training.serializeanddeserialize;

import java.io.*;

public class ObjectStorage {

    public static void saveObject(String filename, Object object) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }

    public static Object loadObject(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

}
