package sv.edu.udb.relativeconstraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_constraint_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_constraint_layout);
    }
    public void salir(View v)
    {
        finish();
    }
}