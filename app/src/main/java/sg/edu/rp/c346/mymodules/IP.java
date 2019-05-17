package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IP extends AppCompatActivity {

    TextView IPview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        IPview = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int AcademicYear = intentReceived.getIntExtra("AcademicYear",2018);
        int Semester = intentReceived.getIntExtra("Semester", 2);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 4);
        String Venue = intentReceived.getStringExtra("Venue");

        IPview.setText("Module Code; " + ModuleCode + "\n"+"Module Name; " + ModuleName + "\n"+"Academic Year; " + AcademicYear + "\n" +"Semester; " + Semester + "\n" + "Module Credit: " + ModuleCredit+"\n"+"Venue; " + Venue + "\n");
    }
}
