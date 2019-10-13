package com.example.game;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class startGame extends Activity {
    GameView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        gv=new GameView(this);
        setContentView(gv);
    }
}

