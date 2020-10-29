package gpa;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author 
 */
public class Student {
    String fname,sname;
    int yearOfstudy;
    double avg =0;
    double pag=0;
     
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Firstname");
        this.fname = input.nextLine();
        System.out.println("Enter Student Surname");
        this.sname = input.nextLine();
        System.out.println("Enter Student year of study");
        this.yearOfstudy = input.nextInt();
    }
    public void average()
    {
        Scanner average = new Scanner(System.in);
        if(this.yearOfstudy == 2 || this.yearOfstudy == 1)
        {
            double x,y,z;
            System.out.println("Three grades required");
            System.out.println("Enter three grade and press enter after each grade");
            x = average.nextDouble();
            y = average.nextDouble();
            z = average.nextDouble();
            this.avg =((x+y+z)/3);
        }
        else if(this.yearOfstudy == 4 || this.yearOfstudy == 3)
        {
            double x,y;
            System.out.println("Two grades required");
            System.out.println("Enter two grade and press enter after each grade");
            x = average.nextDouble();
            y = average.nextDouble();
            this.avg =((x+y)/2);
        }
        else
        {
            System.out.println("Please enter appropriate year of study");
        }
        //returnavg;
    }     
    
    public double pag()
    {
      double avg =this.avg;
      if(avg <=50)
      {
          this.pag = 0;
      }
      else if(avg <=60)
      {
          this.pag = 2; 
      }
      else if(avg <=70)
      {
          this.pag = 3; 
      }
      else if(avg <=80)
      {
          this.pag = 4; 
      }
      else if(avg<=100)
      {
          this.pag = 5; 
      }
      return this.pag;
    }
    
    public void display()
    {
        System.out.println("--------------Student Details------------------");
        System.out.println("Firstname: "+this.fname);
        System.out.println("Surname: "+this.sname);
        System.out.println("Year of Study: "+this.yearOfstudy);
        System.out.println("Average: "+this.avg);
        System.out.println("GPA: "+this.pag());  
    }
}
