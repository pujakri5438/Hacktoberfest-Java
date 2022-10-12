import java.util.Scanner;
class info
    {
        public static void main(String args[])
        {
    int RollNo, Contact, AdmissionFees, SubjectFees;
    String Name, Address, Subject, SubjectCode;
    Scanner SC=new Scanner(System.in);
    System.out.print("Enter the number of student ");
    int n;
    n = SC.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter Roll No :");
        RollNo = SC.nextInt();
        System.out.println("Enter Name of Student :");
        Name = SC.next();
        System.out.println("Enter Contact ");
        Contact = SC.nextInt();
        System.out.println("Enter Address of Student :");
        Address = SC.next();
        System.out.println("Enter Subject :");
        Subject = SC.next();
        System.out.println("Enter Name of Subject Code :");
        SubjectCode = SC.next();
        System.out.println("Enter Admission Fees :");
        AdmissionFees = SC.nextInt();
        System.out.println("Enter  Subject Fees :");
        SubjectFees = SC.nextInt();
        int TotalFees=AdmissionFees+SubjectFees;

   
        System.out.println("Roll No:" + RollNo);
        System.out.println("Name : " + Name);
        System.out.println("Contact :" + Contact);
        System.out.println("Address :" + Address);
        System.out.println("Subject :" + Subject);
        System.out.println("Total Fees :" + TotalFees);
    }
    }

}
