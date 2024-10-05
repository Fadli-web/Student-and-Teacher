public class PartTime extends Person{

    
    private int hoursworked;
    private int SetSalary;
    public PartTime(String n , int a , int y ,int r )
    {
        super(n, a);
    }
    public int getHoursworked() {
      return this.hoursworked;
    }
    public void setHoursworked(int value) {
      this.hoursworked = value;
    }

    public int getSetSalary() {
      return this.SetSalary;
    }
    public void setSetSalary(int value) {
      this.SetSalary = value;
    }
    public void print(){
        System.out.println("hoursWorked = "+this.hoursworked);
        System.out.println("Setsalary = "+this.SetSalary);
    }
}

