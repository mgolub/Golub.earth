package golub.earth;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by student1 on 12/3/2015.
 */
public class Feature implements Serializable{
    private Property properties;

    public Property getProperties(){
        return this.properties;
    }
}
