package com.nanodegree.rluna.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btnSpotify:
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), getString(R.string.spotify_streamer)), Toast.LENGTH_LONG).show();
                break;

            case R.id.btnSuperDuo:
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), getString(R.string.super_duo)), Toast.LENGTH_LONG).show();
                break;

            case R.id.btnBuildIt:
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), getString(R.string.build_it)), Toast.LENGTH_LONG).show();
                break;

            case R.id.btnXYZ:
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), getString(R.string.xyz_reader)), Toast.LENGTH_LONG).show();
                break;

            case R.id.btnCapstone:
                Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), getString(R.string.capstone)), Toast.LENGTH_LONG).show();
                break;

        }
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
