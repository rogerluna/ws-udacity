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

    public void onClickSpotify(View view) {
       toastAppName(getString(R.string.spotify_streamer));
    }

    public void onClickSuperDuo(View view) {
        toastAppName(getString(R.string.super_duo));
    }

    public void onClickBuildIt(View view) {
        toastAppName(getString(R.string.build_it));
    }

    public void onClickXYZReader(View view) {
        toastAppName(getString(R.string.xyz_reader));
    }

    public void onClickCapstone(View view) {
        toastAppName(getString(R.string.capstone));
    }

    private void toastAppName(String appName) {
        Toast.makeText(getApplicationContext(), String.format(getString(R.string.app_toast_msg), appName), Toast.LENGTH_LONG).show();
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
