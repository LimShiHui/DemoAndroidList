package sg.edu.rp.c346.id20032316.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
//    ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.lvAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        alAndroidVersions.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersions.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroidVersions.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroidVersions.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroidVersions.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroidVersions.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroidVersions.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

//        alAndroidVersions.add("Pie - 9.0");
//        alAndroidVersions.add("Oreo - 8.0 - 8.1");
//        alAndroidVersions.add("Nougat - 7.0 - 7.1.2");
//        alAndroidVersions.add("Marshmallow - 6.0 - 6.0.1");
//        alAndroidVersions.add("Lollipop - 5.0 - 5.1.1");
//        alAndroidVersions.add("KitKat - 4.4 - 4.4.4");
//        alAndroidVersions.add("Jelly Bean - 4.1 - 4.3.1");

//        aaAndroidVersions = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alAndroidVersions);
        ca = new CustomAdapter(MainActivity.this, R.layout.row, alAndroidVersions);
        lvAndroidVersions.setAdapter(ca);

        lvAndroidVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}