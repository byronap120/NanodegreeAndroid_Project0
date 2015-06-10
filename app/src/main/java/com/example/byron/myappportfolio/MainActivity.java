package com.example.byron.myappportfolio;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0288D1")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        String message_toast = "";
        switch (view.getId()) {
            case R.id.button:
                message_toast = "spotify streamer";
                break;
            case R.id.button2:
                message_toast = "scores app";
                break;
            case R.id.button3:
                message_toast = "library app";
                break;
            case R.id.button4:
                message_toast = "build it bigger app";
                break;
            case R.id.button5:
                message_toast = "xyz reader app";
                break;
            case R.id.button6:
                message_toast = "my capstone app";
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch " + message_toast, Toast.LENGTH_SHORT);
        toast.show();
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
