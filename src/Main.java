import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:/Users/Paul/Documents/GitHub/i4-programming/src/reflection/week7/employees.csv"));
        scanner.useDelimiter(";");
        ArrayList<String> rawList = new ArrayList<String>();
        Person  person  =   new Person();
        List<Person> liste = new ArrayList<>();
        int totalAmountOfMoneyPaid = 0;
        while(scanner.hasNext()){
            rawList.add(scanner.next());
            person.name       = scanner.next();
            rawList.add(scanner.next());
            person.department = scanner.next();
            rawList.add(scanner.next());
            person.salary   =   Integer.parseInt(scanner.next());
            totalAmountOfMoneyPaid = totalAmountOfMoneyPaid + person.salary;
            rawList.add(scanner.next());
            person.accountNumber= scanner.next();
            liste.add(person);
            }
        scanner.close();
        System.out.println("The total amount paid equals: " + totalAmountOfMoneyPaid + "!");

                int     kernel  =   0;
        for (int i = 0; i < liste.size(); i++){
            if (liste.get(i).salary > liste.get(kernel).salary){kernel = i;
            String  nameOfHighestPaidPerson  =   liste.get(0).name;}
        }
        System.out.println("The person with the highest salary is " + liste.get(kernel).name + ", that person makes " + liste.get(kernel).salary + "and for what? For doing nothing!");


        ArrayList<String> listeDerDepartments = new ArrayList<String>();
        for (int i = 0; i < liste.size(); i++){
            if (listeDerDepartments.contains(liste.get(i).department) == false){
                listeDerDepartments.add(liste.get(i).department);
            }
        }
        Map<String,Integer> payoutPerDepartment = new HashMap<>();

        for (String d : listeDerDepartments){
            int totalForDepartment  = 0;
            for (int i = 0; i < liste.size(); i++){
                if (liste.get(i).department == d){
                    totalForDepartment = totalForDepartment + liste.get(i).salary;
                }
            }
            payoutPerDepartment.put(d, totalForDepartment);
        }
        int currentHighestValue =   0;
        int currentWinnersInt   =   0;
        for (int i = 0; i < listeDerDepartments.size(); i++){
            if (payoutPerDepartment.get(listeDerDepartments.get(i)) < currentHighestValue){
                currentWinnersInt = i;
            }
        }
        System.out.println("The department with the highest total payout is " +
                listeDerDepartments.get(currentWinnersInt) + ", they are paying out a total of " +
                payoutPerDepartment.get(listeDerDepartments.get(currentWinnersInt)));




        System.out.println(rawList);
        //System.out.println(liste.get(1).toString());


    }
}
