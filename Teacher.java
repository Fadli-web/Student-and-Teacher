
public class Teacher extends Person {
    private String Subject;

    public Teacher(String n , int a , String h){
        super(n, a);
        String Subject = n;
        
    }

    public String getSubject() {
      return this.Subject;
    }
    public void setSubject(String value) {
      this.Subject = value;
      
    }
    public void print(){
        System.out.println("Subject = "+this.Subject);
    }
}
