package id.fdl.learnandroid;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void day4(View view){
        Intent intent = new Intent(MainActivity.this, Day4Activity.class);
        startActivity(intent);
    }
}