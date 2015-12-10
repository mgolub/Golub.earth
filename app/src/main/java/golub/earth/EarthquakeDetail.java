package golub.earth;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Hindy on 12/10/2015.
 */
public class EarthquakeDetail extends AppCompatActivity {
    protected void onCreate(Bundle instances){
        super.onCreate(instances);

        setContentView(R.layout.earthquake);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        Feature features[] = (Feature[]) getIntent().getSerializableExtra("FEATURE");
        int position = getIntent().getIntExtra("POSITION", 0);
        EPageAdapter adapter = new EPageAdapter(features, position);

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);

    }
}

