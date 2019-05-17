package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class C346 extends AppCompatActivity {
    TextView tv1Code,tv1Name,tv1Year,tv1Semester,tv1Credit,tv1Venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        tv1Code = findViewById(R.id.tv1Code);
        tv1Name = findViewById(R.id.tv1Name);
        tv1Year = findViewById(R.id.tv1Year);
        tv1Semester = findViewById(R.id.tv1Semester);
        tv1Credit = findViewById(R.id.tv1Credit);
        tv1Venue = findViewById(R.id.tv1Venue);


        Intent intentReceived1 = getIntent();
        String code = intentReceived1.getStringExtra("code");
        tv1Code.setText("Module code: " + code);

        Intent intentReceived2 = getIntent();
        String name = intentReceived2.getStringExtra("name");
        tv1Name.setText("Module Name: " + name);

        Intent intentReceived3 = getIntent();
        Integer year = intentReceived3.getIntExtra("year",2018);
        tv1Year.setText("Module Academic Year: " + year);

        Intent intentReceived4 = getIntent();
        Integer semester = intentReceived4.getIntExtra("semester",1);
        tv1Semester.setText("Semester: " + code);

        Intent intentReceived5 = getIntent();
        Integer credit = intentReceived5.getIntExtra("credit",4);
        tv1Credit.setText("Module Credit: " + credit);

        Intent intentReceived6 = getIntent();
        String venue = intentReceived6.getStringExtra("venue");
        tv1Venue.setText("Module venue: " + venue);




    }
}
