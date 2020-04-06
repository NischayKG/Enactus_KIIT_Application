package comm.examplee.kiitenactus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.enactus_kiit.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {
EditText E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12;

    private DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "WELCOME TO PROJECT ENWIPE", Toast.LENGTH_LONG).show();
        E1=findViewById(R.id.e1);
        E2=findViewById(R.id.e2);
        E3=findViewById(R.id.e3);
        E4=findViewById(R.id.e4);
        E5=findViewById(R.id.e5);
        E6=findViewById(R.id.e6);
        E7=findViewById(R.id.e7);
        E8=findViewById(R.id.e8);
        E9=findViewById(R.id.e9);
        E10=findViewById(R.id.e10);
        E11=findViewById(R.id.e11);
        E12=findViewById(R.id.e12);
    }

    public void fun8(View v)
    {
        try
        {
            Integer I1 = Integer.parseInt(E1.getText().toString());
            Integer I2=Integer.parseInt(E2.getText().toString());
            Integer I3=Integer.parseInt(E3.getText().toString());
            Integer I4=Integer.parseInt(E4.getText().toString());
            Integer I5=Integer.parseInt(E5.getText().toString());

            String st1=E1.getText().toString();
            String st2=E2.getText().toString();
            String st3=E3.getText().toString();
            String st4=E4.getText().toString();
            String st5=E5.getText().toString();
            String st6=E6.getText().toString().trim();
            String st7=E7.getText().toString().trim();
            String st8=E8.getText().toString().trim();
            String st9=E9.getText().toString().trim();
            String st10=E10.getText().toString().trim();
            String st11=E11.getText().toString().trim();
            String st12=E12.getText().toString().trim();
            if(st6.length() > 0 && st7.length() > 0 && st8.length() > 0 && st10.length() > 0 && st11.length() > 0&& st12.length() > 0)

            {

                dbref = FirebaseDatabase.getInstance().getReference().child("Enwipe Customer").child(E6.getText().toString()+E7.getText().toString());
                HashMap<String, String> user_details = new HashMap<>();
                user_details.put("Scooty",st1);
                user_details.put("Bike",st2);
                user_details.put("Hatch_back",st3);
                user_details.put("Sedan",st4);
                user_details.put("SUV",st5);
                user_details.put("Name",st6);
                user_details.put("Phone_no",st7);
                user_details.put("Whatsaap_no",st8);
                user_details.put("E-mail_id",st9);
                user_details.put("Address",st10);
                user_details.put("Date",st11);
                user_details.put("Time",st12);
                dbref.setValue(user_details);

            }
            else
            {
                Toast.makeText(this,"Please Enter All your details",Toast.LENGTH_LONG).show();
            }

            Intent I = new Intent(this, Main2bActivity.class);
            I.putExtra("number1", I1);
           I.putExtra("number2",I2);
          I.putExtra("number3",I3);
           I.putExtra("number4",I4);
            I.putExtra("number5",I5);

            startActivity(I);
        }
        catch(Exception e)
        {
            Log.e("Enactus",e.toString());
            Toast.makeText(this,"Something went wrong" , Toast.LENGTH_LONG).show();

        }
    }

}


