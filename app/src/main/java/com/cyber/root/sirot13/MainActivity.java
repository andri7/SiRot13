package com.cyber.root.sirot13;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.gc.materialdesign.views.LayoutRipple;
import com.nineoldandroids.view.ViewHelper;

public class MainActivity extends AppCompatActivity {
    private void setOriginRiple(final LayoutRipple paramLayoutRipple)
    {
        paramLayoutRipple.post(new Runnable()
        {
            public void run()
            {
                View localView = paramLayoutRipple.getChildAt(0);
                paramLayoutRipple.setxRippleOrigin(Float.valueOf(ViewHelper.getX(localView) + localView.getWidth() / 2));
                paramLayoutRipple.setyRippleOrigin(Float.valueOf(ViewHelper.getY(localView) + localView.getHeight() / 2));
                paramLayoutRipple.setRippleColor(MainActivity.this.getResources().getColor(R.color.colorPrimaryLight));
                paramLayoutRipple.setRippleSpeed(30);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LayoutRipple localLayoutRipple1 = (LayoutRipple) findViewById(R.id.game);
        LayoutRipple localLayoutRipple2 = (LayoutRipple) findViewById(R.id.belajar);
        LayoutRipple localLayoutRipple3 = (LayoutRipple) findViewById(R.id.tentangrot);
        LayoutRipple localLayoutRipple4 = (LayoutRipple) findViewById(R.id.duel);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DevelopActivity.class);
                startActivity(i);
            }
        });

        setOriginRiple(localLayoutRipple1);
        localLayoutRipple1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                Intent localIntent = new Intent(MainActivity.this, GameActivity.class);
                MainActivity.this.startActivity(localIntent);
            }
        });
        localLayoutRipple2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                Intent localIntent = new Intent(MainActivity.this, BelajarActivity.class);
                MainActivity.this.startActivity(localIntent);
            }
        });
        localLayoutRipple3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                Intent localIntent = new Intent(MainActivity.this, TentangRotActivity.class);
                MainActivity.this.startActivity(localIntent);
            }
        });
        localLayoutRipple4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                Intent localIntent = new Intent(MainActivity.this, DuelActivity.class);
                MainActivity.this.startActivity(localIntent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
