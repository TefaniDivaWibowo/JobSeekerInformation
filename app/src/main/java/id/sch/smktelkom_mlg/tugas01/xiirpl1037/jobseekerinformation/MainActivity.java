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

        spLokasi = (Spinner) findViewById(R.id.spinnerLocation);

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
        if (isValid()) {
            String nama = etNama.getText().toString();
            String phone = etPhone.getText().toString();
            String alamat = etAlamat.getText().toString();
            String email = etEmail.getText().toString();

            String hasilGen = "Gender: ";

            int startlen = hasilGen.length();

            if (cbFem.isChecked()) hasilGen += cbFem.getText() + "\n";
            if (cbMa.isChecked()) hasilGen += cbMa.getText() + "\n";

            if (hasilGen.length() == startlen) hasilGen += "-";

            tvHasil.setText("Your JobSeeker Profile\n\n" +
                    "Name: " + nama + "\n" +
                    hasilGen +
                    "Phone Number: " + phone + "\n" +
                    "Current Location: " + spLokasi.getSelectedItem().toString() +
                    "Address: " + alamat + "\n" +
                    "Email: " + email + "\n");
        }
    }

    private boolean isValid() {

        boolean valid = true;

        String nama = etNama.getText().toString();
        String phone = etPhone.getText().toString();
        String alamat = etAlamat.getText().toString();
        String email = etEmail.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Enter your name");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Al least must be 3 characters");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (phone.isEmpty()) {
            etPhone.setError("Enter your phone number");
            valid = false;
        } else if (phone.length() != 10) {
            etPhone.setError("Phone number format is +(telephon code of your region) yournumber");
            valid = false;
        } else {
            etPhone.setError(null);
        }

        if (alamat.isEmpty()) {
            etAlamat.setError("Enter your address");
            valid = false;
        } else {
            etAlamat.setError(null);
        }

        if (email.isEmpty()) {
            etEmail.setError("Enter your name");
            valid = false;
        } else {
            etEmail.setError(null);
        }

        return valid;
    }
}
