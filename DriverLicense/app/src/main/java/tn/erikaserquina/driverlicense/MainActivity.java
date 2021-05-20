package tn.erikaserquina.driverlicense;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    EditText editName, editAdd, editBirth, editSex, editHeight, editWeight, editNationality;
    private Button btnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertDialog = findViewById(R.id.btnSubmit);

        editName= findViewById(R.id.editName);
        editAdd= findViewById(R.id.editAdd);
        editBirth= findViewById(R.id.editBirth);
        editSex= findViewById(R.id.editSex);
        editHeight= findViewById(R.id.editHeight);
        editWeight= findViewById(R.id.editWeight);
        editNationality= findViewById(R.id.editNationality);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Confirmation");
                builder.setMessage("Do you want to proceed with the changes?");
                builder.setIcon(R.drawable.ic_baseline_account_circle_24);
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String name = editName.getText().toString();
                        String add = editAdd.getText().toString();
                        String birth = editBirth.getText().toString();
                        String sex = editSex.getText().toString();
                        String height = editHeight.getText().toString();
                        String weight  = editWeight.getText().toString();
                        String nationality= editNationality.getText().toString();

                        Intent intent = new Intent(MainActivity.this, Page2.class);
                        intent.putExtra("NAME", name);
                        intent.putExtra("ADD", add);
                        intent.putExtra("BIRTH", birth);
                        intent.putExtra("SEX", sex);
                        intent.putExtra("HEIGHT", height);
                        intent.putExtra("WEIGHT", weight);
                        intent.putExtra("NATIONALITY", nationality);
                        startActivity(intent);
                    }
                });
                Toast.makeText(MainActivity.this, "Saved!", Toast.LENGTH_SHORT).show();
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Not Saved!", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }


}
