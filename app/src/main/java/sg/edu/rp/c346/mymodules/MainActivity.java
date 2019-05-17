package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn346;
    Button btn349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn346 = findViewById(R.id.APbtn);
        btn349 = findViewById(R.id.IPbtn);


        btn346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),AP.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicYear",2018);
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66m");
                startActivity(intent);
            }
        });

        btn349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),IP.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("ModuleName","iPad Programming");
                intent.putExtra("AcademicYear",2018);
                intent.putExtra("Semester",2);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66m");
                startActivity(intent);
            }
        });
    }
}
