package assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class assign {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        String colour,size,gender;
        int choiceCode;

        System.out.print("Enter Colour  : ");
        colour=sc.nextLine().toUpperCase();
        System.out.print("Enter Csize : ");
        size=sc.nextLine().toUpperCase();
        System.out.print("Enter gender  : ");
        gender=sc.nextLine().toUpperCase();
        System.out.print("Enter Output Preference :   1. Price \t 2. Rating \nEnter Preference Choice Code : ");
        choiceCode=sc.nextInt();

        DataController tc=new DataController();

        tc.searchData("Adidas.csv",colour,size,gender);
        tc.searchData("Nike.csv",colour,size,gender);
        tc.searchData("Puma.csv",colour,size,gender);
        tc.updateView(choiceCode);
    }
}

class DataController {
    ArrayList<Model> tshirtList=new ArrayList<Model>();
    ArrayList<String> arr;
    DataView view=new DataView();

    public void searchData(String ID, String colour, String size, String gender) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(ID));
        while(sc.hasNext()) {
            String line = sc.nextLine().toUpperCase().toString();
            if (!line.isEmpty()) {
                StringTokenizer token = new StringTokenizer(line, "|");
                arr = new ArrayList<>(line.length());
                while (token.hasMoreTokens()) {
                    arr.add(token.nextToken());
                }
                if (arr.get(2).equals(colour) && arr.get(3).equals(size) && arr.get(4).equals(gender)) {
                    Model model = new Model(0, arr.get(2), arr.get(3), arr.get(4), Float.parseFloat(arr.get(5)), Float.parseFloat(arr.get(6)));
                    tshirtList.add(model);
                }
            }
        }
    }

    public void updateView(int choiceCode)
    {
        if(choiceCode==1)
        {
            Collections.sort(tshirtList, new Comparator<Model>() {
                @Override
                public int compare(Model o1, Model o2) {
                    return (int)(o1.getPrice() - o2.getPrice());
                }
            });
        }
        else if(choiceCode==2)
        {
            Collections.sort(tshirtList, new Comparator<Model>() {
                @Override
                public int compare(Model o1, Model o2) {
                    return (int)( o1.getRating() - o2.getRating());
                }
            });
        }
        else
        {
            System.out.println("Wrong Choice.");
            return;
        }
        view.viewTshirts(tshirtList);

    }
}

class Model {

    private int ID;
    private String colour;
    private String size;
    private String gender;
    
    private float price;
    private float rating;

    public Model(int ID, String colour, String size, String gender, float price, float rating) {
        this.ID = ID;
        this.colour = colour;
        this.size = size;
        this.gender = gender;
        this.price = price;
        this.rating = rating;
    }

    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID=ID;
    }

    public String getColour()
    {
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }

    public String getSize()
    {
        return size;
    }
    public void setArrivalLoc(String size)
    {
        this.size=size;
    }
    public String getGender()
    {
        return gender;
    }
    public void setDate(String gender)
    {
        this.gender=gender;
    }

    public float getPrice()
    {
        return price;
    }
    public void setFare(float price)
    {
        this.price=price;
    }

    public float getRating()
    {
        return rating;
    }
    public void setDuration(float rating)
    {
        this.rating= rating;
    }

}

class DataView {

    public void viewTshirts(ArrayList<Model> tshirtList)
    {
        System.out.println("ID|NAME|COLOUR|GENDER_RECOMMENDATION|SIZE|PRICE|RATING|AVAILABILITY");
        for(Model f:tshirtList)
        {
            System.out.print(" "+f.getID());
            System.out.print("\t |\t"+f.getColour());
            System.out.print("\t |\t"+f.getSize());
            System.out.print("\t |"+f.getGender());
            System.out.print(" | "+f.getPrice());
            System.out.println("\t|  "+f.getRating()+"\t |");
        }
        if(tshirtList.isEmpty())
        {
            System.out.println("Tshirts Not Available.");
        }
    }
}
