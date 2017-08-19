package pe.edu.sise.actcontrolentradacine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActMainActivity extends AppCompatActivity {

    EditText editNombres,editApellidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_activity_main);

        editNombres= (EditText)findViewById(R.id.editNombres);
        editApellidos= (EditText)findViewById(R.id.editApellidos);
    }

    public void validarIngreso(View view){
        String nombres=editNombres.getText().toString();
        String apellidos=editApellidos.getText().toString();
        Toast.makeText(this, "Hola "+nombres+" "+apellidos, Toast.LENGTH_SHORT).show();

    }
}
