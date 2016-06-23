package org.nthree.bacardibikes;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ropeFont= "fonts/Duckgrl.ttf";
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), ropeFont);
        TextView myTextView = (TextView)findViewById(R.id.BacardiBikes);
        myTextView.setTypeface(myTypeface);
    }
}
