package myapplication.whatisthis.com.student_teacher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import static myapplication.whatisthis.com.student_teacher.R.layout.activity_calendar;
import static myapplication.whatisthis.com.student_teacher.R.layout.activity_course_documents;
import static myapplication.whatisthis.com.student_teacher.R.layout.activity_course_landing;
import static myapplication.whatisthis.com.student_teacher.R.layout.activity_grades;

public class Calendar extends AppCompatActivity {

    Spinner spinner;
    String[] SPINNERVALUES = {"Announcements", "Course Documents", "Grades", "Calendar", "Messaging"};
    String SpinnerValue;
    Intent intent;
    Button GOTO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_calendar);

        spinner = (Spinner)findViewById(R.id.spinner);
        GOTO = (Button)findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Calendar.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String)spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){

                    case "Announcements":
                        intent = new Intent(Calendar.this, CourseLanding.class);
                        startActivity(intent);
                        break;

                    case "Course Documents":
                        intent = new Intent(Calendar.this, CourseDocuments.class);
                        startActivity(intent);
                        break;

                    case "Grades":
                        intent = new Intent(Calendar.this, Grades.class);
                        startActivity(intent);
                        break;

                    case "Calendar":
                        intent = new Intent(Calendar.this, Calendar.class);
                        startActivity(intent);
                        break;

                    case "Messaging":
                        intent = new Intent(Calendar.this, Messaging.class);
                        startActivity(intent);
                        break;


                }
            }
        });

    }
}
