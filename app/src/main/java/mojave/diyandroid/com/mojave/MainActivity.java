package mojave.diyandroid.com.mojave;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<music> words = new ArrayList<>();

        //Adding music to the array list
        words.add(new music("Pain Of A Different Kind", "1:23"));
        words.add(new music("Hold Onto Humour", "6:09"));
        words.add(new music("Token Rythmn", "3:30"));
        words.add(new music("3D Mercy", "1:10"));
        words.add(new music("Pieces Of Stash", "1:40"));
        words.add(new music("Dawn Of The Fight", "2:00"));
        words.add(new music("God Damn Weakness", "2:00"));
        words.add(new music("Eternal Madman", "2:20"));
        words.add(new music("Humility Is On Its Way", "4:20"));
        words.add(new music("Hospitality Is Your Friend", "3:10"));
        words.add(new music("Let There Be Addiction", "9:30"));
        words.add(new music("Pacific Kiss", "1:20"));
        words.add(new music("Hateful Reason", "5:40"));

        //calling the adapter to set to the views
        customAdapter adapter = new customAdapter(this, R.layout.list_adapter, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //music play list view listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                music playing = (music) adapterView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, playingActivity.class);
                intent.putExtra("INTENT_PNAME", playing.getName());
                intent.putExtra("INTENT_DNAME", playing.getDuration());
                startActivity(intent);
            }
        });

    }
}
