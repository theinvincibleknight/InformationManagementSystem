import java.io.*;
import java.io.IOException;

class Student
    
 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void cls() throws IOException,InterruptedException
     
 {  
       new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
     
  }

 public void addStudent() throws IOException

 {
   
    String name,mail,address,date;
int ch;
long phno;
Double marks;
String s;
boolean addMore = false;

try
  
{
      
     cls();
     
do
       
 {

System.out.print("_________________________________________________________________________________________________________________________\n");
System.out.println("			   		    ENTER STUDENT DETAIL");

System.out.print("_________________________________________________________________________________________________________________________\n\n"); 

 System.out.print("   Enter name                      : ");
  name = br.readLine(); 

 System.out.print("   Enter Marks in percent          : ");
  marks = Double.parseDouble(br.readLine());

 System.out.print("   Enter year of Degree completion : ");
  date = br.readLine();
  
 System.out.print("   Enter your Email Address        : ");
  mail =br.readLine();

 System.out.print("   Enter your Resedential Address  : ");
  address=br.readLine();

 System.out.print("   Contact No.                     : ");
  phno = Long.parseLong(br.readLine());

System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.print(" \nYou want to go for / doing \n");

System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.print("_____________________________________\n");

System.out.print("                                     |\n");

System.out.print("    1 : HIGHER STUDY                 |\n    2 : JOB                          |\n    3 : OWN BUSINESS/UN-EMPLOYED     |\n");

System.out.print("_____________________________________|\n");

System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.print("\n   Please Enter  your choice : ");
  ch=Integer.parseInt(br.readLine());

System.out.print("_________________________________________________________________________________________________________________________\n\n");

 if(ch==1)

  {

PrintWriter ps = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));

PrintWriter pg = new PrintWriter(new BufferedWriter(new FileWriter("PGstudentRecords.txt",true))); 

  System.out.print("   Enter Institution name          : ");
  String iname=br.readLine();

  System.out.print("   Your Course                     : ");
  String course = br.readLine(); 

  System.out.print("   Enter Institute Address         : ");
  String iaddress=br.readLine();

System.out.print("_________________________________________________________________________________________________________________________\n");

 

 ps.println(name);  
 
 ps.println(marks); 
 
 ps.println(date);
 
 ps.println(mail);
  
 ps.println(address);
  
 ps.println(phno);

  
pg.println(name);  
  
pg.println(mail);
  
pg.println(address);
  
pg.println(phno);
  
pg.println(iname);
  
pg.println(course);
  
pg.println(iaddress);

ps.close();

pg.close(); 

} 

else if(ch==2)

{

PrintWriter ps = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));

PrintWriter bs = new PrintWriter(new BufferedWriter(new FileWriter("bStudRecords.txt",true)));

  System.out.print("   Enter Organization name      : ");
  String cname=br.readLine();

  System.out.print("   Your working status          : ");
  String status = br.readLine(); 

  System.out.print("   Enter your Working Address   : ");
  String waddress=br.readLine();

  System.out.print("Thank You!!!\n ");

System.out.print("_________________________________________________________________________________________________________________________\n");

  
bs.println(name);  
  
bs.println(mail);
  
bs.println(address);
  
bs.println(phno);
  
bs.println(cname);
  
bs.println(status);
  
bs.println(waddress);

  
ps.println(name);  
  
ps.println(marks); 
  
ps.println(date);
  
ps.println(mail);
  
ps.println(address);
  
ps.println(phno);

ps.close();

bs.close();

}

else

{

PrintWriter ps = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));

PrintWriter po = new PrintWriter(new BufferedWriter(new FileWriter("OtherstudentRecords.txt",true)));

System.out.print("   Your Occupation     : ");
String occ=br.readLine();

System.out.print("_________________________________________________________________________________________________________________________\n");

  
ps.println(name);  
  
ps.println(marks); 
  
ps.println(date);
  
ps.println(mail);
  
ps.println(address);
  
ps.println(phno);

  
po.println(name);  
  
po.println(date);
  
po.println(mail);
  
po.println(address);
  
po.println(phno);
  
po.println(occ);

ps.close();

po.close();

}

System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : ");
  s = br.readLine();

  if(s.equalsIgnoreCase("y"))

  {

   addMore = true;
  
   System.out.println();

  }

  else

   addMore = false;

 }

 while(addMore);

 showMenu();

 }

catch(InterruptedException i)

{

  //InterruptedException

 }

}

 public void readStudent() throws IOException

 {

 try

   {

cls();

  BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));

  String name;
  int i=1;

  System.out.println("			   			STUDENTS LIST ");

  while((name = file.readLine()) != null)

  {
   System.out.print("_________________________________________________________________________________________________________________________\n");

   System.out.println("S.No. : " +(i++));
   System.out.print("_________________________________________________________________________________________________________________________\n");

   System.out.println("\nName                        : " +name);

   System.out.println("Marks                       : "+Double.parseDouble(file.readLine()));

   System.out.println("Year of Degree completion   : "+file.readLine());

   System.out.println("Email                       : "+file.readLine());

   System.out.println("Residential Address         : "+file.readLine());     

   System.out.println("Contact No.                 : "+Long.parseLong(file.readLine()));

   System.out.println();

  }

  System.out.print("____________________________________________________END LIST____________________________________________________________");

  file.close();

  showMenu();

 }

 catch(FileNotFoundException e)

 {

  System.out.println("\nERROR : File not Found !!!");

 }

catch(InterruptedException i)

 {

//InterruptedException

  }

 }

public void readPGStudent() throws IOException

 {
 try
   {
     cls();

  BufferedReader file = new BufferedReader(new FileReader("PGstudentRecords.txt"));

  String name;
  int i=1;
  
  System.out.println("			                       PG STUDENTS LIST ");

  while((name = file.readLine()) != null)

  {
   System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.println("S.No. : " +(i++));
   System.out.print("_________________________________________________________________________________________________________________________\n");

   System.out.println("\nName                   : " +name);

   System.out.println("Email                  : "+file.readLine());

   System.out.println("Residential Address    : "+file.readLine());     

   System.out.println("Contact No.            : "+Long.parseLong(file.readLine()));

   System.out.println("Institution            : "+file.readLine());

   System.out.println("Course                 : "+file.readLine());

   System.out.println("Institute Location     : "+file.readLine());

   System.out.println();

  }

System.out.print("____________________________________________________ END LIST ____________________________________________________________");

  file.close();
 
  showMenu();

 }

 catch(FileNotFoundException e)

 {

   System.out.println("\nERROR : File not Found !!!");

 }

catch(InterruptedException i)

 {
 
   //InterruptedException

 }

}

public void readBStud() throws IOException

 {

 try

  {
cls();
  
  BufferedReader file = new BufferedReader(new
  FileReader("bStudRecords.txt"));

  String name;
  int i=1;
  
 System.out.println("			                     STUDENTS LIST(EMPLOYEES)");
 
 while((name = file.readLine()) != null)

  {
   System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.println("S.No. : " +(i++));
   System.out.print("_________________________________________________________________________________________________________________________\n");

   System.out.println("\nName                   : " +name);

   System.out.println("Email                  : "+file.readLine());

   System.out.println("Residential Address    : "+file.readLine());     

   System.out.println("Contact No.            : "+Long.parseLong(file.readLine()));

   System.out.println("Organization name      : "+file.readLine());

   System.out.println("Working as             : "+file.readLine());

   System.out.println("Organization Address   : "+file.readLine());

   System.out.println();

  }

  System.out.print("____________________________________________________ END LIST ____________________________________________________________");

  file.close();

  showMenu();

 }

 catch(FileNotFoundException e)

 {

  System.out.println("\nERROR : File not Found !!!");

 }

catch(InterruptedException i)

{
     //InterruptedException
   }

}

 public void readOStudent() throws IOException

 {

 try

   {
     cls();
  
  BufferedReader file = new BufferedReader(new FileReader("OtherstudentRecords.txt"));

  String name;
  int i=1;
  
System.out.println("			                      STUDENTS LIST (OWN BUSINESS/UNEMPLOYED) ");

  while((name = file.readLine()) != null)

  {
   System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.println("S.No. : " +(i++));
   System.out.print("_________________________________________________________________________________________________________________________\n");
  
 System.out.println("\nName                        : " +name);
 
 System.out.println("Year of Degree completion   : "+file.readLine());
   
 System.out.println("Email                       : "+file.readLine());

 System.out.println("Residential Address         : "+file.readLine());     

 System.out.println("Contact No.                 : "+Long.parseLong(file.readLine()));
 
 System.out.println("Occupation                  : "+file.readLine());
 
  System.out.println();

  }

  System.out.print("___________________________________________________ END LIST ____________________________________________________________");

  file.close();

  showMenu();

 }

 catch(FileNotFoundException e)

 {

   System.out.println("\nERROR : File not Found !!!");

 }

catch(InterruptedException i)

{ 
   //InterruptedException

  }

}

public void showMenu() throws IOExceptioncatch,InterruptedException

 {

System.out.print("\n________________________________\n");

System.out.print("                                |\n");

System.out.print("   1 : ADD STUDENT              |\n   2 : ALL STUDENTS LIST        |\n   3 : PG STUDENTS LIST         |\n   4 : STUDENTS LIST(EMPLOYEES) |\n   5 : OTHER STUDENTS LIST      |\n   6 : Exit                     |\n");

System.out.print("________________________________|\n");

System.out.print("_________________________________________________________________________________________________________________________\n");

System.out.print("\n  Please Enter  your choice : ");
 int choice = Integer.parseInt(br.readLine());
System.out.print("_________________________________________________________________________________________________________________________\n");

 switch(choice)

 {

  case 1:
        addStudent();
        break;

  case 2:
        readStudent();
        break;

  case 3:
        readPGStudent();
        break;

  case 4:
        readBStud();
        break;

  case 5:
        readOStudent();
        break;

  case 6:
        System.exit(1);
        break;

  default:
        System.out.println("\nInvalid Choice !");
        break;
  }

}

public static void main(String args[]) throws IOException,InterruptedException

 {

  cls();
  System.out.print("_________________________________________________________________________________________________________________________\n\n");

System.out.print("			                           WELCOME \n");
   System.out.print("_________________________________________________________________________________________________________________________");

 Student call = new Student();

 call.showMenu();

  }

}
