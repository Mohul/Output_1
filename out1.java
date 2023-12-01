import java.util.Scanner;
public class out1 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        System.out.println("  |==========================================================================================================|  ");
        System.out.println("  |\t\t\t\t\t" + "PROJECT ON SCHOOL REPORT CARD MANAGEMENT  \t\t\t     |\t\t" + "\t\t\t");
        System.out.println("  |==========================================================================================================|  ");
        System.out.println("  |\t\t\t\t\t" + " ST. MARY’S HIGH SCHOOL, NEW COOCHBEHAR  \t\t\t     |\t\t" + "\t\t\t");
        System.out.println("  |==========================================================================================================|  ");
        System.out.println("  |                                          :- TIAS DAS                               | " );
        System.out.println("  |                                          :- MOHUL CHAKRABORTY                               | " );
        System.out.println("  |                                          :- KOUSHITAKI GOPE                               | " );
        System.out.println("  |                                          :- DEVANG BOSE                               | " );
        System.out.println("  |                                          :- ANIRBAN DUTTA                               | " );
        System.out.println("  |                                          :- DISHA ROY                               | " );
        System.out.println("  |                                          :- AYUSHI BHOWMIK                               | " );
        System.out.println("  |                                          :- OISHIK CHATTERJEE                               | " );
        System.out.println("  |                                          :- FARHIN HAQUE                              | " );
        System.out.println("  |                       " +"CLASS & SECTION"+"       :- X-B                                      | " );
        System.out.println("  |                       " +"DATE OF SUBMISSION"+"    :- 07/12/2024                               | " );
        System.out.println("  |==========================================================================================================|  ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("  |==========================================================================================================|  ");
        System.out.print("  |\t\t\t" + "<<ENTER THE NUMBER OF STUDENTS WHOSE REPORT CARD IS TO BE MADE:>>  \t\t     |\t\t" + "\t\t\t");
        int a = new Scanner(System.in).nextInt();
        System.out.println("  |==========================================================================================================|  ");
        System.out.println();
        System.out.println();
        //Draft
        for(int i = 1;i<=a;i++){
         System.out.print("\t\t\t\t\t\t>>... :" + i);
         System.out.println();
         System.out.println("\t\t\t       ===========================================");
         System.out.print("\t\t\t       Enter the name of the student 1 : ");
         String n = v.nextLine();
         System.out.println();
         System.out.println();
         System.out.println("\t\t\t       ===========================================");
         System.out.print("\t\t\t       Enter the Class               : ");
         String c = x.nextLine();
         System.out.println();
         System.out.println();
         System.out.println("\t\t\t       ===========================================");
         System.out.print("\t\t\t       Enter the Section               : ");
         char t = y.next().charAt(0);
         System.out.println();
         System.out.println();
         System.out.println("\t\t\t       ===========================================");
         System.out.print("\t\t\t       Enter the Roll Number           : ");
         int r = z.nextInt();
         System.out.println();
         System.out.println();
       }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("  |==========================================================================================================|  ");
        System.out.println();
        System.out.println("\t\t     <<DO YOU WANT TO ENTER THE MARKS FOR THE 1ST UNIT TEST:>>           : ");
        System.out.println();
        System.out.println("  |==========================================================================================================|  ");
        System.out.println();
        System.out.print("\t\t\t       Press 1. for YES :           : ");
        System.out.println();
        System.out.print("\t\t\t       Press 2. for NO :           : ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t>>... :");
        int c = y.nextInt();
        System.out.println();
        switch(c){
          case 1:
              //Enter code of Output 2 here.
              break;
          case 2:
              System.exit(0);
              break;
            }
       
    }
}
