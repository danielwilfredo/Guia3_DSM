package sv.edu.udb.guia3_dsm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2ejemplo_table_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2ejemplo_table_layout);
    }    public void finalizarActividad(View v){
        finish();
    }
}