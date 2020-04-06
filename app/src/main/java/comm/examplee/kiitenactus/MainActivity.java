package comm.examplee.kiitenactus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.enactus_kiit.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tm=new Timer();
        tm.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent I=new Intent(MainActivity.this,NewMain.class);
                startActivity(I);
                finish();
            }
        },3200);
    }


}

