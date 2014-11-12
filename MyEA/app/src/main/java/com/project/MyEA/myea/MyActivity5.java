package com.project.MyEA.myea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity5);

        Button button = (Button)findViewById(R.id.callMWH);
        Button button1 = (Button)findViewById(R.id.callPCG);
        Button button2 = (Button)findViewById(R.id.callRC2);
        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView = (TextView)findViewById(R.id.MWH);
                        startActivity(new Intent(getApplicationContext(),MyActivity6.class));
                    }
                }
        );
        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView = (TextView)findViewById(R.id.PCG);
                        startActivity(new Intent(getApplicationContext(),MyActivity6.class));
                    }
                }
        );
        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView = (TextView)findViewById(R.id.RCTwo);
                        startActivity(new Intent(getApplicationContext(),MyActivity6.class));
                    }
                }
        );
        /*Button callBtn = (Button)findViewById(R.id.num13);
        callBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+639991600789"));
                startActivity(callIntent);
            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
