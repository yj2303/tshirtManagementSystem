import java.io.FileNotFoundException;
import java.util.Scanner;

public class tshirtMain {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner sc=new Scanner(System.in);
        //String dept_loc,arrival_loc,date;
        String brand,colour,gender_recommendation;
        int choiceCode;

        System.out.print("Enter brand name  : ");
        brand=sc.nextLine().toUpperCase();
        System.out.print("Enter colour  : ");
        colour=sc.nextLine().toUpperCase();
        System.out.print("Enter gender   : ");
        gender_recommendation=sc.nextLine().toUpperCase();
        choiceCode=sc.nextInt(1);

        tshirtController tc=new tshirtController();

        tc.searchFlight("src/tshirtInformation/Adidas.csv",brand,colour,gender_recommendation);
        tc.searchFlight("src/tshirtInformation/Nike.csv",brand,colour,gender_recommendation);
        tc.searchFlight("src/tshirtInformation/Puma.csv",brand,colour,gender_recommendation);
        tc.updateView(choiceCode);

    }

}
