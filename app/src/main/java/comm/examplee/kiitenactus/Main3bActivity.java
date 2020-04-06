package comm.examplee.kiitenactus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.enactus_kiit.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Main3bActivity extends AppCompatActivity {
    private DatabaseReference dbref;
    EditText E1,E2,E3,E4;
    TextView T;
    String st1,st2,st3,st4,st5,st6,st7,st8,st9,st10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3b);
        E1=findViewById(R.id.e1);
        E2=findViewById(R.id.e2);
        E3=findViewById(R.id.e3);
        E4=findViewById(R.id.e4);
        try {
           Intent I = getIntent();
           String str = I.getStringExtra("name");
            st1 = I.getStringExtra("name");
            st2 = I.getStringExtra("phone");
            st3 = I.getStringExtra("whatsapp");
            st4 = I.getStringExtra("address");
            st5 = I.getStringExtra("email");
            st6 = I.getStringExtra("date");
           T = findViewById(R.id.t1);
         T.setText("Welocme " + str + " to place your order");
        }
        catch(Exception e)
       {
            Toast.makeText(this,"Something Went wrong",Toast.LENGTH_LONG).show();
       }
    }

   public void getimage(View v)
    {
       // Intent I=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
       // startActivityForResult(I,1);

        String url="https://forms.gle/D8UCjr1UYXQVuKJz8";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bm=(Bitmap)data.getExtras().get("data");
       ImageView IMG=findViewById(R.id.img);
        IMG.setImageBitmap(bm);

    }

    public void fun12(View v)
    {
        try {
            st7 = E1.getText().toString();
            st8 = E2.getText().toString();
            st9 = E3.getText().toString();
            st10 = E4.getText().toString();
            Toast.makeText(Main3bActivity.this, st7 + st8, Toast.LENGTH_SHORT).show();
            if (st7.length() > 0 && st9.length() > 0 && st8.length() > 0 && st10.length() > 0) {


                dbref = FirebaseDatabase.getInstance().getReference().child("Siddhi Customer").child(st1 + st2);
                HashMap<String, String> user_details = new HashMap<>();

                user_details.put("Name ", st1);
                user_details.put("Phone No ", st2);
                user_details.put("Whatsaap No ", st3);
                user_details.put("Address ", st4);
                user_details.put("E-mail ", st5);
                user_details.put("Date ", st6);
                user_details.put("Length ", st7);
                user_details.put("Breadth ", st8);
                user_details.put("Height ", st9);
                user_details.put("Number of bags ", st10);

                dbref.setValue(user_details);


                Toast.makeText(this, "Your Order Is Places", Toast.LENGTH_LONG).show();
                Intent I = new Intent(this, MainActivity.class);
                startActivity(I);
            }
        }
        catch (Exception e)
        {
            Log.e("Enactus",e.toString());
            //Toast.makeText(this,,Toast.LENGTH_LONG).show();
        }
    }
}
