package com.example.bozana.patato;

import android.media.Image;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_patato extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_patato);

        cb1 = (CheckBox) findViewById(R.id.NoseCheckbox);
        cb2 = (CheckBox) findViewById(R.id.Glasses);
        cb3 = (CheckBox) findViewById(R.id.Shoes);
        cb4 = (CheckBox) findViewById(R.id.Moustachecb);
        cb5 = (CheckBox) findViewById(R.id.ArmsCheckbox);
        cb6 = (CheckBox) findViewById(R.id.Mouth);
        cb7 = (CheckBox) findViewById(R.id.Ears);
        cb8 = (CheckBox) findViewById(R.id.eyebrowsCheckbox);
        cb9 = (CheckBox) findViewById(R.id.hatCheckBox);
        cb10 = (CheckBox) findViewById(R.id.eyescb);

        img1= (ImageView) findViewById(R.id.nose);
        img2= (ImageView) findViewById(R.id.glasses);
        img3= (ImageView) findViewById(R.id.shoes);
        img4= (ImageView) findViewById(R.id.mustache);
        img5= (ImageView) findViewById(R.id.arms);
        img6= (ImageView) findViewById(R.id.mouth);
        img7= (ImageView) findViewById(R.id.ears);
        img8= (ImageView) findViewById(R.id.eyebrows);
        img9= (ImageView) findViewById(R.id.hat);
        img10= (ImageView) findViewById(R.id.eyes);

    }




    //public List imglist =new ArrayList<ImageView>(img1, img2, img3, img4, img5, img6, img7, img8, img9, img10);


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int image1 = img1.getVisibility();
        if(image1 == View.VISIBLE){
            outState.putString("image1", "VISIBLE");
        }else {
            outState.putString("image1", "INVISIBLE");
        }
            int image2 = img2.getVisibility();
            outState.putInt("image2", image2);
            int image3 = img3.getVisibility();
            outState.putInt("image3", image3);
            int image4 = img4.getVisibility();
            outState.putInt("image4", image4);
            int image5 = img5.getVisibility();
            outState.putInt("image5", image5);
            int image6 = img6.getVisibility();
            outState.putInt("image6", image6);
            int image7 = img7.getVisibility();
            outState.putInt("image7", image7);
            int image8 = img8.getVisibility();
            outState.putInt("image8", image8);
            int image9 = img9.getVisibility();
            outState.putInt("image9", image9);
            int image10 = img10.getVisibility();
            outState.putInt("image10", image10);

    }

    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        String CheckboxValuerestored=inState.getString("image1");


        if(CheckboxValuerestored == "VISIBLE"){
            Log.d("inside if", CheckboxValuerestored);
            img1.setVisibility(View.VISIBLE);
        }else{
            img1.setVisibility(View.INVISIBLE);
        }

        int CheckboxValuerestored2=inState.getInt("image2");
        img2.setVisibility(CheckboxValuerestored2);
        int CheckboxValuerestored3=inState.getInt("image3");
        img3.setVisibility(CheckboxValuerestored3);
        int CheckboxValuerestored4=inState.getInt("image4");
        img4.setVisibility(CheckboxValuerestored4);
        int CheckboxValuerestored5=inState.getInt("image5");
        img5.setVisibility(CheckboxValuerestored5);
        int CheckboxValuerestored6=inState.getInt("image6");
        img6.setVisibility(CheckboxValuerestored6);
        int CheckboxValuerestored7=inState.getInt("image7");
        img7.setVisibility(CheckboxValuerestored7);
        int CheckboxValuerestored8=inState.getInt("image8");
        img8.setVisibility(CheckboxValuerestored8);
        int CheckboxValuerestored9=inState.getInt("image9");
        img9.setVisibility(CheckboxValuerestored9);
        int CheckboxValuerestored10=inState.getInt("image10");
        img10.setVisibility(CheckboxValuerestored10);
    }


    public void ClicedNose(View v) {
        if (cb1.isChecked()) {
            img1.setVisibility(View.VISIBLE);
        }else{
            img1.setVisibility(View.INVISIBLE);
        }
    }


    public void ClickedGlasses(View view) {
        if (cb2.isChecked()) {
            img2.setVisibility(View.VISIBLE);
        }else{
            img2.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedShoes(View view) {
        if (cb3.isChecked()) {
            img3.setVisibility(View.VISIBLE);
        }else{
            img3.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedMustache(View view) {
        if (cb4.isChecked()) {
            img4.setVisibility(View.VISIBLE);
        }else{
            img4.setVisibility(View.INVISIBLE);
        }
    }


    public void clickedMouth(View view){
        if (cb6.isChecked()) {
            img6.setVisibility(View.VISIBLE);
        }else{
            img6.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedEars(View view){
        if (cb7.isChecked()) {
            img7.setVisibility(View.VISIBLE);
        }else{
            img7.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedBrows(View view) {
        if( cb8.isChecked() ){
            img8.setVisibility(View.VISIBLE);
        }else{
            img8.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedHat(View view) {
        if (cb9.isChecked()) {
            img9.setVisibility(View.VISIBLE);
        }else{
            img9.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedEyes(View v) {
        if (cb10.isChecked()){
            img10.setVisibility(View.VISIBLE);
        }else{
            img10.setVisibility(View.INVISIBLE);
        }
    }

    public void clickedarms(View view) {
        if (cb5.isChecked()) {
            img5.setVisibility(View.VISIBLE);
        }else{
            img5.setVisibility(View.INVISIBLE);
        }
    }

}
