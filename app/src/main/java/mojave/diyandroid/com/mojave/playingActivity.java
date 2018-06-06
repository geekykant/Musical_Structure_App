package mojave.diyandroid.com.mojave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class playingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        //Setting the intent music details
        ((TextView) findViewById(R.id.playing_name)).setText(getIntent().getStringExtra("INTENT_PNAME"));
        ((TextView) findViewById(R.id.playing_duration)).setText(getIntent().getStringExtra("INTENT_DNAME"));
    }
}
