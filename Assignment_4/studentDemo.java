//Question33
class studentInfo{
    private int age;
    private String name;
    private long mobile;

    studentInfo()
    {
        System.out.println("No argument constructor");
    }
    studentInfo(int number)
    {
        this();
        System.out.println(number);
    }
    void setData(int age, String name, long mobile)
    {
        this.age = age;
        this.name = name;
        this.mobile = mobile;
    }

    void display()
    {
        System.out.println("Age= "+ age);
        System.out.println("Name= "+ name);
        System.out.println("Mobile= "+ mobile);
    }
    void displayMethod()
    {
        this.display();
    }
}
class studentDemo{
   public static void main(String args[]) {
        
        studentInfo a = new studentInfo();
        a.setData(25,"Tejas",8793);
        a.displayMethod();
    }
}