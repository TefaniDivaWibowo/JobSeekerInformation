package id.sch.smktelkom_mlg.tugas01.xiirpl1037.jobseekerinformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etPhone, etAlamat, etEmail;
    CheckBox cbFem, cbMa, cbEm, cbEnab;
    Spinner spLokasi;
    Button bSend;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etPhone = (EditText) findViewById(R.id.editTextPhone);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etEmail = (EditText) findViewById(R.id.editTextEmail);

        cbFem = (CheckBox) findViewById(R.id.checkBoxFemale);
        cbMa = (CheckBox) findViewById(R.id.checkBoxMale);
        cbEm = (CheckBox) findViewById(R.id.checkBoxEmail);
        cbEnab = (CheckBox) findViewById(R.id.checkBoxEnable);

        bSend = (Button) findViewById(R.id.buttonSend);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                doProses();

            }
        });

    }

    private void doProses() {
    }
}
