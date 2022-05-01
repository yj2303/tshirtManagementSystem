import java.util.Collections;
import java.util.Comparator;

public class tshirtModel {

    private String id;
    private String name;
    private String colour;
    private String gender_recommendation;
    private int size;
    private float price;
    private int rating;
    private float availability;

    public FlightModel(){}

    public FlightModel(Integer id, String name, String colour, String gender_recommendation, String size, Integer price, float rating, Boolean availability) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.gender_recommendation = gender_recommendation;
        this.size = size;
        this.price = price;
        this.rating = rating;
        this.availability = availability;
    }

    public String getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getColour()
    {
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }
    public String getGenderRecommendation()
    {
        return gender_recommendation;
    }
    public void setGenderRecommendation(String gender_recommendation)
    {
        this.gender_recommendation=gender_recommendation;
    }

    public int getSize()
    {
        return size;
    }
    public void setSize(String size)
    {
        this.size=size;
    }

    public void getPrice()
    {
        return price;
    }
    public void setPrice(Integer price)
    {
        this.duration=duration;
    }
    public void getRating()
    {
        return rating;
    }
    public void setRating(Float rating)
    {
        this.rating=rating;
    }
    public void getAvailability()
    {
        return availability;
    }
    public void setAvailability(Boolean availability)
    {
        this.availability=availability;
    }


}

