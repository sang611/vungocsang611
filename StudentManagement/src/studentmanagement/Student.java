/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author MyPC
 */
public class Student {
    private
            String name;
            String id;
            String group;
            String email;
public String getName()
{
    return name;    
                    
}
public void setName(String n)
{
    this.name = n;
}

public String getId()
{
    return id;    
                    
}
public void setId(String n)
{
    this.id = n;
}

public String getGroup()
{
    return this.group;    
                    
}
public void setGroup(String n)
{
    this.group = n;
}

public String getEmail()
{
    return email;    
                    
}
public void setEmail(String n)
{
    this.email = n;
}


public String getInfo()
{
    System.out.println(this.name);
    System.out.println(this.id);
    System.out.println(this.group);
    System.out.println(this.email);
    return "";
    
}
public Student()
{
    name = "Student";
    id = "000";
    group = "INT22041";
    email = "uet@vnu.edu.vn";

}
Student(String n, String sid, String em)
{
    name = n;
    id = sid;
    email = em;
    group = "INT22041";
}
 Student(Student s)
 {
     name = s.name;
     id = s.id;
     group = s.group;
     email = s.email;
 }
}
