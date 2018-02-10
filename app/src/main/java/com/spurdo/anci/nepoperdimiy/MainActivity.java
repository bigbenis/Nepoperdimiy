package com.spurdo.anci.nepoperdimiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer fartSoundMP = MediaPlayer.create(this, R.raw.fart);

        Button playFart = (Button) this.findViewById(R.id.playFart);

        playFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fartSoundMP.start();
            }
        });
    }
}
