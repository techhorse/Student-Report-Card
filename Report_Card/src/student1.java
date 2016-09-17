import java.util.Scanner;
public class student1 {
	
	public static void main(String[] args) {
		 int marks[] = new int[5];
		
		 String name;
			int regId;
		 
		 
		 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the name");
         name=sc.nextLine();
         System.out.println("Enter the registration number");
         regId=sc.nextInt();
             
	        
	        for (int i = 0; i < 5;i++) {
	            
	            
	                
	                
	     System.out.println("Enter marks in subject " + (i + 1) + ":");
	              marks[i]=sc.nextInt();
	              
	             

	               
	 }
	       
	        System.out.println("STUDENT DETAILS");
            System.out.println("NAME               : " + name);
            System.out.println("ROLL NUMBER        : " + regId);
            marksheet(marks);
	        }
	        public static void marksheet(int marks[]) {
	            int j;
	            
	           
	           
	            for (j = 0; j < 5; j++){
	                System.out.println("MARKS IN SUBJECT " + (j + 1) + " : " + marks[j]);
	            }
	        


	}

}
