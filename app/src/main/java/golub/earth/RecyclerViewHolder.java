package golub.earth;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student1 on 12/3/2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{

    private TextView place;

    public RecyclerViewHolder(View itemView){
        super(itemView);
        place = (TextView) itemView.findViewById(R.id.place);

    }

}
