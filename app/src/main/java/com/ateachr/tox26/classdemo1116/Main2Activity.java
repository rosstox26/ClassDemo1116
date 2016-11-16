package com.ateachr.tox26.classdemo1116;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener {

    //declare objects
    private Button buttonGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Link to UI
        buttonGo = (Button) findViewById(R.id.buttonGo);
        //start a listener
        buttonGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //start a DialogBox
        new AlertDialog.Builder(this)
                .setMessage("Where Do You Want to Go?")
                .setPositiveButton("To Start Page",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                                startActivity(intent);
                            }
                        })
                .setNegativeButton("Stay Here",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Main2Activity.this, "We will stay put", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
    }
}