//Question31
class student{

       int rollno;
        String name;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
            }
}

class studentDemo {
        public static void main(String args[]){
        
        student s = new student();

        s.setData(101,"Madhuri");
        s.showData();
        s.setData(102,"Trisha");
        s.showData();
        
        }

}