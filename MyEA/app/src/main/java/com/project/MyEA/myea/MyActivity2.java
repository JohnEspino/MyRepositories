package com.project.MyEA.myea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MyActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);


        RadioGroup group1 = (RadioGroup) findViewById(R.id.Radio1);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radio1, int checkedId) {
                Button button = (Button)findViewById(R.id.submit_area);
                switch (checkedId) {
                    case R.id.Fire:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), MyActivity3.class));
                                    }
                                }
                        );

                        break;
                    case R.id.Earth:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), MyActivity4.class));
                                    }
                                }
                        );
                        break;
                    case R.id.Water:
                        button.setOnClickListener(
                                new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), MyActivity5.class));
                                    }
                                }
                        );
                        break;
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;}
        return super.onOptionsItemSelected(item);
    }

    /*public void onCheckedChanged(RadioGroup radio1, int checkedId) {
        Button button = (Button)findViewById(R.id.submit_area);

        switch (checkedId) {
            case R.id.Fire:
                button.setOnClickListener(
                        new Button.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(getApplicationContext(), MyActivity3.class));
                            }
                        }
                );

                break;
            case R.id.Earth:
                button.setOnClickListener(
                        new Button.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(getApplicationContext(), MyActivity4.class));
                            }
                        }
                );
                break;
            case R.id.Water:
                button.setOnClickListener(
                        new Button.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(getApplicationContext(), MyActivity5.class));
                            }
                        }
                );
                break;
        }
    }
*/
}