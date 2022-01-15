package com.example.Buttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//alt + shift + enter para importar en Android Studio
//seleccionar renglones, apretar Ctrl + "/" para comentar en grupo

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button heretoobtn;
    private TextView mainText;
    private Button tercerboton;

    @Override
    public void onClick(View v){
       mainText.setText("NOOOOO!!!!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MYTAGS", "OnCreate method is called");

        mainText = (TextView) findViewById(R.id.textView); //textView is the id from the textview

       //The following lines are for the second button
        heretoobtn = (Button) findViewById(R.id.heretoobtn);
        heretoobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText("You just pressed the second button!");
            }
        });


        //the following lines are for the third button, along with the OnClick method created at the beginning
        tercerboton = (Button) findViewById(R.id.tercerboton);
        tercerboton.setOnClickListener(this); //"this" refers to this class
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MYTAGS", "onStart Method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MYTAGS", "onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MYTAGS", "onPause method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MYTAGS", "onRestart method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MYTAGS", "onDestroy method is called");
    }
     // i comes from info, (Logcat section) you can put v and its gonna be verbose



    public void buttonIsClicked(View buttonView){ //this method is for the first button
      //  int result = 5*12;
      // Log.i("MYTAGS", result + ""); THIS RETURNS THE RESULT ON THE CONSOLE

     // String textValue = mainText.getText().toString();
      //  Log.i("MYTAGS", textValue); //THIS RETURNS THE GIVEN STRING ON THE CONSOLE

        String newTextValue = "You just pressed the first button!";
        mainText.setText(newTextValue); //THIS CHANGES THE TEXT ON THE TEXT VIEW
    }
}