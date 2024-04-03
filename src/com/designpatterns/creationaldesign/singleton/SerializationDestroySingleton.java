package com.designpatterns.creationaldesign.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDestroySingleton {
    public static void main(String[] args) {
        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = null;

        File file = new File("ThreadSafeSingleton.txt");

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(t1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            t2 = (ThreadSafeSingleton) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hash code of t1: " + t1.hashCode());
        System.out.println("Hash code of t2: " + t2.hashCode());

        // clone example
        System.out.println("=====Clone Example=====");
        try {
            t2 = (ThreadSafeSingleton) t1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hash code of t1: " + t1.hashCode());
        System.out.println("Hash code of t2: " + t2.hashCode());
    }
}
