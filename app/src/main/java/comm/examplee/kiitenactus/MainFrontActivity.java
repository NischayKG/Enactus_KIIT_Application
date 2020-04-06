package comm.examplee.kiitenactus;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.enactus_kiit.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainFrontActivity extends AppCompatActivity
{
    Timer tm;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_front);
        Toast.makeText(this, "Welcome To EnActUs KIIT App", Toast.LENGTH_LONG).show();
        tm=new Timer();
        tm.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent I=new Intent(MainFrontActivity.this,MainActivity.class);
                startActivity(I);
                finish();
            }
        },4000);
    }

}


