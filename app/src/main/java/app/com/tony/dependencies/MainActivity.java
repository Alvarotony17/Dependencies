package app.com.tony.dependencies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String HELLO = "hello";


    // private static final String HELLO = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent me = new Intent();

        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();


        Log.i(HELLO, "onCreate: my message");



    }
}
