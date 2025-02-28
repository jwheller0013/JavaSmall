person1.name
person1.age
person1.sayHello()
person1.sayHello()
person1.haveBirthday()
person1.age
class Person {
    String name;
    int age;
    
    Person(String n, int a) {
        name = n;
        age = a;
    }
    
    void printDetails() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
    }

boolean isAdult() {
return age >=18;
}
    
    void haveBirthday() {
        age = age + 1;
        System.out.println ("Happy Birthday! " + name + " is now " + age);
    }
}
person1.printDetails()
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);
Person person = new Person("John", 17);
person.printDetails()
System.out.println(person.isAdult())
person.haveBirthday()
System.out.println(person.isAdult())