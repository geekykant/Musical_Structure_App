package mojave.diyandroid.com.mojave;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Music> {

    private static int mResource;
    private static Context mContext;

    CustomAdapter(@NonNull Context context, int resource, @NonNull List<Music> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;

        if (convertView == null) {
            listview = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        }

        Music newdetails = getItem(position);

        ((TextView) listview.findViewById(R.id.text1)).setText(newdetails.getName());
        ((TextView) listview.findViewById(R.id.text2)).setText(newdetails.getDuration());

        return  listview;
    }
}
