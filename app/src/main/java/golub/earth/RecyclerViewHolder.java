package golub.earth;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student1 on 12/3/2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{

    private TextView name;

    public RecyclerViewHolder(View itemView){
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);

    }

    public void bind(Feature feature){
        String place = feature.getProperties().getPlace();
        String[]array = place.split(" ");

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase("of")){
                int count = i+1;
                for(int j = count; j < array.length; j++){
                    builder.append(array[j]);
                    builder.append(" ");
                }
            }

        }
        name.setText(builder.toString());
    }
}

