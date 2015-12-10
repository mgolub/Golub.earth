package golub.earth;

import java.io.Serializable;

/**
 * Created by student1 on 12/3/2015.
 */
public class Property implements Serializable{

    private String place;
    private double mag;
    private long time;

    public double getMag() {
       return mag;
    }

    public long getTime(){
        return time;
    }

    public String getPlace() {
        return place;
    }
}
