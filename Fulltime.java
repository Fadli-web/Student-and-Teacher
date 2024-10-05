public class Fulltime extends Person {


    private int anualSalary;
    private String Unit;
        public Fulltime(String n , int a ,int j , String q)
        {
            super(n, a);
        }
 

    public int getAnualSalary() {
      return this.anualSalary;
    }
    public void setAnualSalary(int value) {
      this.anualSalary = value;
    }

    public String getUnit() {
      return this.Unit;
    }
    public void setUnit(String value) {
      this.Unit = value;

      
    }
    public void print(){
        System.out.println("Anual salary = "+this.anualSalary);
        System.out.println("Unit = "+this.Unit);
    }

    }

