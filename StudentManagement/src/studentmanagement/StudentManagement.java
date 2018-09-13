
package studentmanagement;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class StudentManagement {
   
public Boolean sameGroup(Student s1, Student s2)
    {
       String lop1 = s1.getGroup();
       String lop2 = s2.getGroup();
       if(lop1.equals(lop2))
           return true;
       return false;
        
            
    }
public void studentsByGroup(ArrayList<Student>a)
        
{
    Collections.sort(a, new Comparator<Student>()
    {
        @Override
        public int compare(Student sv1, Student sv2)
        {
            return (sv1.getGroup().compareTo(sv2.getGroup()));
        }
    }
    );
    System.out.println("lop so " + a.get(0).getGroup() + "gom co: "+ a.get(0).getName());
    for(int i=1; i<a.size(); i++){
        if(a.get(i).getGroup()!=a.get(i-1).getGroup())
        {
            System.out.println("lop so " + a.get(i).getGroup() + "gom co: " + a.get(i).getName());
        }
        else
        System.out.println(a.get(i).getName());
    }
        
}
public void in_danh_sach(ArrayList<Student>s)
        
{
    for(int i=0; i<s.size(); i++)
        System.out.println(s.get(i).getGroup());
}
public void removeStudent(String id, ArrayList<Student>s)
{
    for(int i=0; i<s.size(); i++)
    {
        if(s.get(i).getId() == id)
            s.remove(i);
    }
}
    public static void main(String[] args) {
        
        Student sinh_vien_1 = new Student();
        Student sinh_vien_2 = new Student();
        Student sinh_vien_3 = new Student();
      
        sinh_vien_1.setName("Vu Ngoc Sang");
        sinh_vien_1.setId("17020997");
        sinh_vien_1.setGroup("1819I_INT2204_2_4");
        sinh_vien_1.setEmail("tuyetdinhyoyo611@gmail.com");
        
       sinh_vien_1.getInfo();
       StudentManagement x = new StudentManagement();
       
       
       Student a = new Student();
       Student b = new Student();
       Student c = new Student();
       a.setGroup("INT22041");
     
       b.setGroup("INT22041");
     
       c.setGroup("INT22042");
       
       System.out.println(x.sameGroup(a, b) + "\n" + x.sameGroup(b, c) + "\n" +x.sameGroup(c,a ));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      ArrayList<Student> s = new ArrayList<Student>();
      
      for(int i=0; i<n; i++)
      {
          Student stu = new Student();
        
          sc=new Scanner(System.in);
          String ten = sc.nextLine();
          String mssv = sc.nextLine();
          String nhomlop = sc.nextLine();
          String thu = sc.nextLine();
          
          stu.setName(ten);
          stu.setId(mssv);
          stu.setGroup(nhomlop);
          stu.setEmail(thu);
          
          s.add(stu);
          
      }
      
      x.studentsByGroup(s); 
     
   
   Scanner cin = new Scanner(System.in);
   String id = cin.nextLine();
   x.removeStudent(id, s);
    
   
}
}

