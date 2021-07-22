package sg.edu.rp.c346.id20032316.demoandroidlist;

import android.content.Context;
import android.media.tv.TvContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter (Context context, int resource, ArrayList<AndroidVersion> objects) {
        super (context, resource, objects);

        this.parent_context = context;
        this.layout_id = resource;
        this.versionList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvName);
        TextView tvVersion = rowView.findViewById(R.id.tvVersion);

        AndroidVersion currObj = versionList.get(position);

        tvTitle.setText(currObj.getName());
        tvVersion.setText(currObj.getVersion());

        return rowView;
    }
}
