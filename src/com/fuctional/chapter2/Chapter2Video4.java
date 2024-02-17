package com.fuctional.chapter2;

public class Chapter2Video4 {
    // Functions as data
    protected static class Person {
        private final String name;
        private final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::LoadPersonFake
                    : this::LoadPersonReal;
        }
        private Person LoadPersonReal() {
            System.out.println("Loading Real Person...");
            return new Person("Real Person", 30);
        }

        private Person LoadPersonFake() {
            System.out.println("Loading Fake Person...");
            return new Person("Fake Person", 100);
        }
    }

    public static void main(String[] args) {
        final boolean IS_DEVELOPMENT = true;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
