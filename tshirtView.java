import java.util.ArrayList;


public class tshirtView {

    public void viewTshirts(ArrayList<tshirtModel> tshirtList)
    {
       
        System.out.println("ID|NAME|COLOUR|GENDER_RECOMMENDATION|SIZE|PRICE|RATING|AVAILABILITY");
        for(tshirtModel t:tshirtList)
        {
            System.out.print(" "+t.id());
            System.out.print("\t |\t"+t.getName());
            System.out.print("\t |\t"+t.getColour());
            System.out.print("\t |"+t.getGenderRecommendation());
            System.out.print(" | "+t.getSize());
            System.out.print("\t |"+t.getPrice());
            System.out.print(" | "+t.getRating());
            System.out.println("\t|  "+t.getAvailability()+"\t |");
    }
    if(flightList.isEmpty())
    {
        System.out.println("Flights Not Available.");
    }
    }
}
