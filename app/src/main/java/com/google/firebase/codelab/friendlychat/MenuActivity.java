/* Made by Disha Dhawan,Shreya Verma, Sajida Farhana as our 6th sem mini project*/
package com.google.firebase.codelab.friendlychat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choose);
        Button b1 =  findViewById(R.id.translate);
        Button b2 = findViewById(R.id.transport);
        Button b3 =  findViewById(R.id.chatroom);
        Button b4 = findViewById(R.id.eateries);
        Button b5 =  findViewById(R.id.attractions);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.translate:
                startActivity(new Intent(this, TranslateActivity.class));

                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //startActivity(intent);

                break;
            case R.id.transport:

                startActivity(new Intent(this, TransportActivity.class));

                break;
            case R.id.chatroom:
                startActivity(new Intent(MenuActivity.this ,MainActivity.class));
                break;
            case R.id.eateries:
                startActivity(new Intent(MenuActivity.this,EatActivity.class));
                break;
            case R.id.attractions:
                startActivity(new Intent(MenuActivity.this,WebActivity.class));
                break;
            default:
                return;
        }
    }
    @Override
    public void onBackPressed() {
      Intent intent=new Intent(MenuActivity.this,LocationActivity.class);
      startActivity(intent);
    }


}
