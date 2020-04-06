package comm.examplee.kiitenactus;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import android.widget.TextView;

import com.example.enactus_kiit.R;

public class Main2bActivity extends AppCompatActivity {
    TextView T;
    Timer TT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2b);
        try
        {
            T = findViewById(R.id.t);
            Intent I = getIntent();
            Integer n1 = I.getIntExtra("number1", 0);
            Integer n2 = I.getIntExtra("number2", 0);
            Integer n3 = I.getIntExtra("number3", 0);
            Integer n4 = I.getIntExtra("number4", 0);
            Integer n5 = I.getIntExtra("number5", 0);
            Integer n6 = (n1 * 50) + (n2 * 70) + (n3 * 150) + (n4 * 160) + (n5 * 180);
            T.setText("Total Service charge will be  Rs." + n6 + "/- only");

        }
        catch(Exception e)
        {
            Toast.makeText(this,"Something went wrong",Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "Service Confirmed.", Toast.LENGTH_LONG).show();
        TT=new Timer();
        TT.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent I=new Intent(Main2bActivity.this,MainActivity.class);
                startActivity(I);
                finish();
            }
        },4500);


    }


}
