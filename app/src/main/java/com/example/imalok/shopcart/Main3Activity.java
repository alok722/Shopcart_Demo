package com.example.imalok.shopcart;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] Size = {"Select Size", "S", "M", "L", "XL", "XXL"  };


    ImageView yellow1,yellow2,red2,red1,blue2,blue1,green2,green1,purple1,purple2;

    ImageView plus,minus;
    TextView sizeno;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the Recipie list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Size);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        //********SIZE PLUS MINUS*************
        plus = (ImageView)findViewById(R.id.plus);
        minus = (ImageView)findViewById(R.id.minus);
        sizeno = (TextView) findViewById(R.id.sizeno);

        final int[] number = {0};
        sizeno.setText(""+ number[0]);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 0){
                    sizeno.setText("" + number[0]);
                }

                if (number[0] > 0){

                    number[0] = number[0] -1;
                    sizeno.setText(""+ number[0]);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 9) {
                    sizeno.setText("" + number[0]);
                }

                if (number[0] < 9) {

                    number[0] = number[0] + 1;
                    sizeno.setText("" + number[0]);

                }
            }
        });



        //        ***********ratingBar**********
//        ratingbar = (RatingBar) findViewById(R.id.ratingbar);
//        LayerDrawable stars = (LayerDrawable) ratingbar.getProgressDrawable();
//        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.yellow), PorterDuff.Mode.SRC_ATOP);



        //        ***********yellow color**********

        yellow1 = (ImageView)findViewById(R.id.yellow1);
        yellow2 = (ImageView)findViewById(R.id.yellow2);


        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                clickOfColor("1");


            }
        });


        //        ***********redcolor**********

        red1 = (ImageView)findViewById(R.id.red1);
        red2 = (ImageView)findViewById(R.id.red2);


        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                clickOfColor("3");

            }
        });


        //        ***********blue color**********

        blue1 = (ImageView)findViewById(R.id.blue1);
        blue2 = (ImageView)findViewById(R.id.blue2);


        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                clickOfColor("4");

            }
        });


        //        ***********green color**********

        green1 = (ImageView)findViewById(R.id.green1);
        green2 = (ImageView)findViewById(R.id.green2);


        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                clickOfColor("2");

            }
        });


        //                ************purple color********


        purple1 = (ImageView)findViewById(R.id.purple1);
        purple2 = (ImageView)findViewById(R.id.purple2);


        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                clickOfColor("5");

            }
        });



    }

    private void clickOfColor(String s) {

        yellow2.setVisibility(View.GONE);
        green2.setVisibility(View.GONE);
        blue2.setVisibility(View.GONE);
        red2.setVisibility(View.GONE);
        purple2.setVisibility(View.GONE);


        if(s.equalsIgnoreCase("1")){
            yellow2.setVisibility(View.VISIBLE);
        }

        if(s.equalsIgnoreCase("2")){
            green2.setVisibility(View.VISIBLE);
        }

        if(s.equalsIgnoreCase("3")){
            red2.setVisibility(View.VISIBLE);
        }
        if(s.equalsIgnoreCase("4")){
            blue2.setVisibility(View.VISIBLE);
        }
        if(s.equalsIgnoreCase("5")){
            purple2.setVisibility(View.VISIBLE);
        }
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        // Toast.makeText(getApplicationContext(),Size[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
