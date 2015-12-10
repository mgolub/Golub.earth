package golub.earth;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    private Feature[] features;
    private int positions;
    private RecyclerViewHolder h;

    public RecyclerAdapter(Feature[] feature){
        features = feature;
    }
    
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        positions = position;
        h = holder;
        h.bind(features[position]);

        h.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = h.itemView.getContext();
                Intent intent = new Intent(context, EarthquakeDetail.class);
                intent.putExtra("FEATURES" ,features);
                intent.putExtra("POSITION", positions);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return features.length;
    }
}
