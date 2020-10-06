//Question37
class Person

{

      private int age ;

     private  String name;

    Person()

   {

      this. age = 18;

     System.out.println("default age is = "+age);

  }

  Person(int age , String name)

{

  this.age = age ;

  this.name = name ;

}

   void show()
{

   System.out.println("Age of Person is = "+age);
   System.out.println("Age of Person is = "+name);
}

  }


       public class mydata
{

   public static void main(String args[])

{

      Person p1 = new Person();

       Person p2 = new Person(10,"samrat");

        p2.show();

}

  }
