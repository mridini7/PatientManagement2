package patientinsights;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class PatientManagement
{
    
    public static void main( String[] args ) throws FileNotFoundException
    {
         HashMap<Integer, Patients> newPatients = new HashMap<>();
         String [] arrOfString = new String[6];
         File myObj = new File("/Users/mridinikulkarni/PatientData/PatientData.txt");
         Scanner myReader = new Scanner(myObj);
         int i = 1;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arrOfString = data.split(",", 6);
                newPatients.put(i, new Patients(arrOfString[0], arrOfString[1], arrOfString[2], arrOfString[3], arrOfString[4], arrOfString[5]));
                i++;
            }
            myReader.close();
         
         Scanner input = new Scanner(System.in);
         System.out.println("What would you like to access? 1: One Patient, 2: All Patients, 3: Update User, 4: Delete a User, 5: Search");
         int x = input.nextInt();

        if(x==1){
            Scanner num = new Scanner(System.in);
            System.out.println("Please input your security number, so that information can be retrieved");
            int y = num.nextInt();
            if (newPatients.containsKey(y)); {
                System.out.println(newPatients.get(y).toString()); 
            }
        }
        else if (x == 2){
            for (int z = 1; z<=newPatients.size(); z++){
                System.out.println(newPatients.get(z).toString()); 
            }
        }
        
        else if (x==3){
            Scanner num = new Scanner(System.in);
            System.out.println("Please input your security number, so that information can be retrieved");
            int y = num.nextInt();
            if (newPatients.containsKey(y)); {
                System.out.println("Please choose what you would like to change, 1: First Name, 2: Last Name, 3: DOB, 4: Email, 5: Phone #");
                int f = num.nextInt();
                Scanner change = new Scanner(System.in);
                System.out.println("What would you like to change it to?");
                String l = change.nextLine();

                if(f ==1){
                    newPatients.get(y).setFirstName(" "+l);
                }
                else if(f ==2){
                    newPatients.get(y).setFirstName(" "+l);
                }
                else if(f ==3){
                    newPatients.get(y).setFirstName(" "+l);
                }
                else if(f ==4){
                    newPatients.get(y).setFirstName(" "+l);
                }
                else if(f ==5){
                    newPatients.get(y).setFirstName(" "+l);
                }

                System.out.println(newPatients.get(y).toString());
            }

        }
        
        else if (x==4){
            Scanner recieve = new Scanner(System.in);
            System.out.println("Which patient would you like to delete? (Enter security number)");
            int value = recieve.nextInt();
            System.out.println(newPatients.size());
            if (newPatients.containsKey(value)) {
                newPatients.remove(value); 
                System.out.println("Successfully deleted");
            }
            else{
                System.out.println("Unable to delete");
            }
            System.out.println(newPatients.size());
            for (int z = 1; z<=newPatients.size(); z++){
                System.out.println(newPatients.get(z).toString()); 
            }
        }
        else if (x==5){
            Scanner names = new Scanner(System.in);
            System.out.println("Please input your first name, so that information can be retrieved");
            String y = " " + names.nextLine();
            for (int z = 1; z <= newPatients.size(); z++){
                if (newPatients.get(z).getFirstName().equals(y)){
                    System.out.println(newPatients.get(z).toString());
                }
            }
        }

    }

}
