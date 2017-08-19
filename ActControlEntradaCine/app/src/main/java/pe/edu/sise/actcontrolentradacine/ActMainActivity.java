package pe.edu.sise.actcontrolentradacine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActMainActivity extends AppCompatActivity {

    EditText editNombres,editApellidos,editEdad;
    CheckBox chkDocAutorizacion,chkDni;
    RadioGroup rdbtnBoleto;
    Button btnValidarIngreso,btnReseteo;
    RadioButton rbtSi,rbtNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_activity_main);

        editNombres= (EditText)findViewById(R.id.editNombres);
        editApellidos= (EditText)findViewById(R.id.editApellidos);
        editEdad=(EditText)findViewById(R.id.editEdad);
        chkDni=(CheckBox)findViewById(R.id.chkDni);
        chkDocAutorizacion=(CheckBox)findViewById(R.id.chkDocAutorizacion);
        rdbtnBoleto = (RadioGroup) findViewById(R.id.rdbtnBoleto);
        rbtSi=(RadioButton)findViewById(R.id.rbtSi);
        rbtNo=(RadioButton)findViewById(R.id.rbtNo);
        btnValidarIngreso = (Button) findViewById(R.id.btnValidarIngreso);
        btnReseteo =(Button) findViewById(R.id.btnReseteo);



    }

    public void validarIngreso(View view){

        String nombres=editNombres.getText().toString();
        String apellidos=editApellidos.getText().toString();
        int edad=Integer.parseInt(editEdad.getText().toString());
        String chkautorizacion=chkDocAutorizacion.getText().toString();
        String chkdni=chkDni.getText().toString();


        if(rbtSi.isChecked()) {
            if (edad < 18) {
                if (chkDocAutorizacion.isChecked()) {
                    Toast.makeText(this, "Puede Ingresar", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Requiere un documento de autorizacion", Toast.LENGTH_LONG).show();
                }
            } else {
                if (chkDni.isChecked()) {
                    Toast.makeText(this, "Puede Ingresar", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Necesitas Dni", Toast.LENGTH_LONG).show();
                }
            }
        }
        else
            Toast.makeText(this, "Requiere Boleto", Toast.LENGTH_LONG).show();
    }
    public void Reseteo(View view) {
        editApellidos.setText("");
        editNombres.setText("");
        editEdad.setText("");
        chkDni.setChecked(false);
        chkDocAutorizacion.setChecked(false);

        rdbtnBoleto.clearCheck();
    }
}
