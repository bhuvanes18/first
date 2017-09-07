package bhuvan.karthick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bhuvan.mylibrary.BlaBLaBLa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bdfdsftn = (Button) findViewById(R.id.karthcikfirstbtn);

        BlaBLaBLa blueeww = new BlaBLaBLa();
        String ad=blueeww.bluebluew("MGP");

        bdfdsftn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}
