package pe.edu.sise.actcontrolentradacine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActMainActivity extends AppCompatActivity {

    EditText editNombres, editApellidos, editEdad ;
    CheckBox chkDocAutorizacion, chkDni;
    RadioGroup rbtnBoleto;
    Button btnValidarIngreso, btnResetear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_activity_main);

        editNombres = (EditText) findViewById(R.id.editNombres);
        editApellidos = (EditText) findViewById(R.id.editApellidos);
        editEdad = (EditText) findViewById(R.id.editEdad);
        chkDocAutorizacion = (CheckBox) findViewById(R.id.chkDocAutorizacion);
        chkDni = (CheckBox) findViewById(R.id.chkDni);
        btnValidarIngreso = (Button) findViewById(R.id.btnValidarIngreso);
        btnResetear = (Button) findViewById(R.id.btnResetear);

    }

    public void validarIngreso(View view){

        String nombres = editNombres.getText().toString();
        String apellidos = editApellidos.getText().toString();
        int edad = Integer.parseInt(editEdad.getText().toString());

        if(edad<18){

            if(chkDocAutorizacion.isChecked()){
                Toast.makeText(this, "Puede ingresar", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Requiere un documento de autorizción.", Toast.LENGTH_SHORT).show();
            }
        }else{
            if(chkDni.isChecked()){
                Toast.makeText(this, "Puede ingresar", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Necesitas DNI", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
