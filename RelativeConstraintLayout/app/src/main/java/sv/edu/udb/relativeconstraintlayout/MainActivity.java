package sv.edu.udb.relativeconstraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void relative(View v)
    {
        Intent llamar = new Intent(this,login_relative_layout.class);
        startActivity(llamar);

    }

    public void constraint(View v)
    {
        Intent llamar = new Intent(this,login_constraint_layout.class);
        startActivity(llamar);

    }
}