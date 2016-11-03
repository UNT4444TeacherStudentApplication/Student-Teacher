package myapplication.whatisthis.com.student_teacher;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLanding extends AppCompatActivity {

    private Button gotocourselanding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_landing);

        gotocourselanding = (Button) findViewById(R.id.button2);
        gotocourselanding.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

    }

    private void launchActivity(){
        Intent intent = new Intent(this, CourseLanding.class);
        startActivity(intent);
    }
}
