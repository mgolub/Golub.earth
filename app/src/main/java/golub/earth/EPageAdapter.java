package golub.earth;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;

/**
 * Created by Hindy on 12/10/2015.
 */
public class EPageAdapter extends PagerAdapter {

    private Feature[] features;
    private int position;

    public EPageAdapter(Feature[] features, int position) {
        this.features = features;
        this.position = position;

    }

    @Override
    public int getCount() {
        return features.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.page_item, null);

        TextView place = (TextView) view.findViewById(R.id.place);
        TextView time = (TextView) view.findViewById(R.id.time);
        TextView mag = (TextView) view.findViewById(R.id.mag);

        Property property = features[position].getProperties();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String newDate = formatter.format(property.getTime());

        place.setText("PLACE: ");
        place.append(property.getPlace());

        mag.setText("MAGNITUDE: ");
        mag.append(String.valueOf(property.getMag()));

        time.setText("TIME: ");
        time.append((newDate));

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
