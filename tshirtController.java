import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class tshirtController {
    ArrayList<tshirtModel> tshirtList=new ArrayList<tshirtModel>();
    ArrayList<String> arr;
    tshirtView view=new tshirtView();
   // public void search(String filename,String dept_loc,String arrival_loc,String date) throws FileNotFoundException

    public void search(String brand,String colour,String gender_recommendation,String size) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()) {
            String line = sc.nextLine().toUpperCase().toString();
            if (!line.isEmpty()) {
                StringTokenizer token = new StringTokenizer(line, "|");
                arr = new ArrayList<>(line.length());
                while (token.hasMoreTokens()) {
                    arr.add(token.nextToken());
                }
                if (arr.get(1).equals(colour) && arr.get(2).equals(gender) && arr.get(3).equals(size)) {
                    tshirtModel model = new tshirtModel(arr.get(0), arr.get(1), arr.get(2), arr.get(3), Integer.parseInt(arr.get(4)), Float.parseFloat(arr.get(5)));
                    tshirtList.add(model);
                }
            }
        }
    }

    public void updateView(int choiceCode)
    {
        if(choiceCode==1)
        {
            Collections.sort(tshirtList, new Comparator<tshirtModel>() {
                @Override
                public int compare(tshirtModel o1, tshirtModel o2) {
                    return o1.getPrice() - o2.getPrice();
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