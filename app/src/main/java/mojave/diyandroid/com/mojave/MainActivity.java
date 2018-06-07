package mojave.diyandroid.com.mojave;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Music> songs = new ArrayList<>();

        //Adding music to the array list
        songs.add(new Music("Pain Of A Different Kind", "1:23"));
        songs.add(new Music("Hold Onto Humour", "6:09"));
        songs.add(new Music("Token Rythmn", "3:30"));
        songs.add(new Music("3D Mercy", "1:10"));
        songs.add(new Music("Pieces Of Stash", "1:40"));
        songs.add(new Music("Dawn Of The Fight", "2:00"));
        songs.add(new Music("God Damn Weakness", "2:00"));
        songs.add(new Music("Eternal Madman", "2:20"));
        songs.add(new Music("Humility Is On Its Way", "4:20"));
        songs.add(new Music("Hospitality Is Your Friend", "3:10"));
        songs.add(new Music("Let There Be Addiction", "9:30"));
        songs.add(new Music("Pacific Kiss", "1:20"));
        songs.add(new Music("Hateful Reason", "5:40"));

        //calling the adapter to set to the views
        CustomAdapter adapter = new CustomAdapter(this, R.layout.list_adapter, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        //music play list view listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ((LinearLayout) findViewById(R.id.isPlaying)).setVisibility(View.VISIBLE);
                final Music playing = (Music) adapterView.getItemAtPosition(position);

                ((Button)findViewById(R.id.checkPlaying)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, playingActivity.class);
                        intent.putExtra("INTENT_PNAME", playing.getName());
                        intent.putExtra("INTENT_DNAME", playing.getDuration());
                        startActivity(intent);
                    }
                });
            }
        });



    }
}
