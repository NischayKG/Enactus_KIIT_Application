package comm.examplee.kiitenactus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.enactus_kiit.R;

public class NewMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }


    public void fun2(View v)
    {
        Intent I=new Intent(this,Main2Activity.class);
        startActivity(I);
    }

    public void fun3(View v)
    {
        Intent I=new Intent(this,Main3Activity.class);
        startActivity(I);
    }

    public void fun4(View v)
    {
        String url="https://enactus.org/";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    public void fun5(View v)
    {
        String url="https://www.instagram.com/enactuskiit/?hl=en";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    public void fun6(View v)
    {
        String url="https://twitter.com/enactus_kiit?lang=en";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    public void fun7(View v)
    {
        String url="https://www.facebook.com/enactuskiit/";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }

    public void fun8(View v)
    {
        String url="https://www.youtube.com/channel/UCxXrhAcQNHQQ7vcUnd7aAAg";
        Uri U=Uri.parse(url);
        Intent I=new Intent(Intent.ACTION_VIEW,U);
        startActivity(I);

    }
}
