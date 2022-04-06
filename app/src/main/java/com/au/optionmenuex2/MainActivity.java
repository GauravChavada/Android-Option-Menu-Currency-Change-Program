package com.au.optionmenuex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
{
    EditText value;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=findViewById(R.id.ed1);
        tv=findViewById(R.id.tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m) 
    {
        getMenuInflater().inflate(R.menu.menu,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) 
    {
      try {
          Double res=Double.parseDouble(value.getText().toString());
          switch (item.getItemId())
          {
              case R.id.rtd:
                  tv.setText("Ruppes To Dollar"+res/74.66);
                  break;
              case R.id.dtr:
                  tv.setText("Dollar TO Ruppes "+res*74.66);
                  break;
              case R.id.rtp:
                  tv.setText("Ruppes To Pound"+res/101.72);
                  break;
              case R.id.ptr:
                  tv.setText("Pound TO Ruppes "+res*101.72);
                  break;
          }

      }
      catch (Exception e)
      {
          tv.setText("Please Enter Number");
      }
        return true;
    }
}
