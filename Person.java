public class Person{
    private String name;
    private int age;

    public Person(String n, int a){
    String name = n;
    age = a;
    }
    public String getName() {
      return this.name;
    }
    public void setName(String value) {
      this.name = value;
    }

    public int getAge() {
      return this.age;
    }
    public void setAge(int value) {
      this.age = value;
    }
   
    public void print(){
        System.out.println("name = "+this.name);
        System.out.println("Age  = "+this.age);
    }

}