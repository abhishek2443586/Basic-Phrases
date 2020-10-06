package com.abhipatil.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void buttonTapped(View view) {
        //MediaPlayer mplayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
        //mplayer.start();

        switch(view.getId())
        {
            case R.id.hello:
                MediaPlayer mplayer = MediaPlayer.create(this,R.raw.hello);
                mplayer.start();
                break;

            case R.id.howareyou:
                mplayer = MediaPlayer.create( this, R.raw.howareyou );
                mplayer.start();
                break;

            case R.id.goodevening:
                mplayer = MediaPlayer.create(this,R.raw.goodevening);
                mplayer.start();
                break;

            case R.id.please:
                mplayer = MediaPlayer.create(this,R.raw.please);
                mplayer.start();
                break;

            case R.id.mynameis:
                mplayer = MediaPlayer.create(this,R.raw.mynameis);
                mplayer.start();
                break;

            case R.id.doyouspeakenglish:
                mplayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
                mplayer.start();
                break;

            case R.id.welcome:
                mplayer = MediaPlayer.create(this,R.raw.welcome);
                mplayer.start();
                break;
            case R.id.ilivein:
                mplayer = MediaPlayer.create(this,R.raw.ilivein);
                mplayer.start();
                break;
            default:break;
        }

    }
}
