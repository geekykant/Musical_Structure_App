package mojave.diyandroid.com.mojave;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class playingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Setting the intent music details
        ((TextView) findViewById(R.id.playingName)).setText(getIntent().getStringExtra("INTENT_PNAME"));
        ((TextView) findViewById(R.id.playingDuration)).setText(getIntent().getStringExtra("INTENT_DNAME"));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
