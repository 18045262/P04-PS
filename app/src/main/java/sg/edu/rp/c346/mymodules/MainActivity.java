package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnC346,btnC349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC346 = findViewById(R.id.btnC346);
        btnC349 = findViewById(R.id.btnC349);

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),C346.class);
                intent.putExtra("code","C346");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year",2018);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);


            }
        });

        btnC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),C349.class);
                intent.putExtra("code","C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("year",2018);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W65M");
                startActivity(intent);
            }
        });
    }
}
