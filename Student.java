public class Student extends Person{
    
    private int studetnumber;
    private int Score;
    private String Major;

    public Student(String n,int a , int b , int c, String k){
        super(n, a);
    }
    public String getMajor() {
      return this.Major;
    }
    public void setMajor(String value) {
      this.Major = value;
    }

    public int getStudetnumber() {
      return this.studetnumber;
    }
    public void setStudetnumber(int value) {
      this.studetnumber = value;
    }

    public int getScore() {
      return this.Score;
    }
    public void setScore(int value) {
      this.Score = value;
    }
    public void print(){
        System.out.println("major = "+this.Major);
        System.out.println("Student number = "+this.studetnumber);
        System.out.println("Score =" +this.Score);
    }
}