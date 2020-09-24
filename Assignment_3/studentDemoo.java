//Question32
class student{

       int rollno;
        String name;

        static int count =0;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
                count++;
            System.out.println("no of stud object ="+count);
            }

}

class studentDemoo {
        public static void main(String args[]){
        
        student s = new student();

        s.setData(101,"Madhuri");
        s.showData();
        s.setData(102,"Trisha");
        s.showData();
        
        }

}