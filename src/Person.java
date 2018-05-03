class Person {
    public String name;

    public Person (String userName){
        name = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, " + name + "!!!");
    }

    public static void main(String[] args) {
        Person user = new Person("Uncle Bob");
        user.sayHello();
        user.setName("Lance");
        user.sayHello();
    }
}