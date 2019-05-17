package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AP extends AppCompatActivity {

    TextView APview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap);

        APview = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int AcademicYear = intentReceived.getIntExtra("AcademicYear",2018);
        int Semester = intentReceived.getIntExtra("Semester", 1);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 4);
        String Venue = intentReceived.getStringExtra("Venue");

        APview.setText("Module Code; " + ModuleCode + "\n"+"Module Name; " + ModuleName + "\n"+"Academic Year; " + AcademicYear + "\n" +"Semester; " + Semester + "\n" + "Module Credit: " + ModuleCredit+"\n"+"Venue; " + Venue + "\n");

    }
}
