package comm.examplee.kiitenactus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.enactus_kiit.R;
import com.google.firebase.database.DatabaseReference;

public class Main3Activity extends AppCompatActivity {
EditText E1,E2,E3,E4,E5,E6;

    private DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        E1=findViewById(R.id.e1);
        E2=findViewById(R.id.e2);
        E3=findViewById(R.id.e3);
        E4=findViewById(R.id.e4);
        E5=findViewById(R.id.e5);
        E6=findViewById(R.id.e6);
        Toast.makeText(this, "WELCOME TO PROJECT SIDDHI", Toast.LENGTH_LONG).show();
    }

    public void fun10(View v)
    {
        String url="https://www.facebook.com/enactuskiit/photos/a.250082748378759/2115957455124603/?type=3&theater";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    public void fun11(View v)
    {
        String st1= E1.getText().toString();
        String st2= E2.getText().toString();
        String st3= E3.getText().toString();
        String st4= E4.getText().toString();
        String st5= E5.getText().toString();
        String st6= E6.getText().toString();



        if(st1.length() > 0 && st2.length() > 0 && st3.length() > 0 && st4.length() > 0 &&st5.length() > 0 && st6.length() > 0 ) {

            Intent I = new Intent(this, Main3bActivity.class);
            I.putExtra("name", st1);
            I.putExtra("phone", st2);
            I.putExtra("whatsapp", st3);
            I.putExtra("address", st4);
            I.putExtra("email", st5);
            I.putExtra("date", st6);
            startActivity(I);

        }

        else
        {
            Toast.makeText(this,"Something went wrong",Toast.LENGTH_LONG).show();
        }

    }

}
