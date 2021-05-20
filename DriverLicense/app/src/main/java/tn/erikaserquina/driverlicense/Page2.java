package tn.erikaserquina.driverlicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
    TextView displayInfo, displayInfo1;
    ImageView defaultImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        displayInfo= findViewById(R.id.displayInfo);
        displayInfo1= findViewById(R.id.displayInfo1);
        defaultImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String add = intent.getStringExtra("ADD");
        String birth = intent.getStringExtra("BIRTH");
        String sex = intent.getStringExtra("SEX");
        String height = intent.getStringExtra("HEIGHT");
        String weight = intent.getStringExtra("WEIGHT");
        String nationality = intent.getStringExtra("NATIONALITY");
        String info = "Name : \n" + name;
        String info1 = "Address : \n" + add + "\nBirthdate : Gender :  HT.(cm)  WT.(kg)  NATIONALITY\n " + birth + "            " + sex + "                  "+
                height+ "          " + weight + "             " + nationality;
        displayInfo.setText(info);
        displayInfo1.setText(info1);
        defaultImage.setImageResource(R.drawable.picture);

    }
}
