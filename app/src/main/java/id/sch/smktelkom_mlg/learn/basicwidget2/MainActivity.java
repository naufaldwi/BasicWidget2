package id.sch.smktelkom_mlg.learn.basicwidget2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKelas;
    EditText etAbsen;
    EditText etEmail;
    EditText etTelpon;
    EditText etAlamat;
    CheckBox cbapk;
    CheckBox cbroot;
    CheckBox cbcwm;
    CheckBox cbrom;
    CheckBox cbvirus;
    Button bOK;
    TextView tvHasil;
    TextView tvHasil2;
    TextView tvHasil4;
    TextView tvHasil5;
    TextView tvHasil6;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        etAbsen = (EditText) findViewById(R.id.editTextAbsen);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etTelpon = (EditText) findViewById(R.id.editTextTelpon);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        cbapk = (CheckBox) findViewById(R.id.checkBoxAPK);
        cbroot = (CheckBox) findViewById(R.id.checkBoxROOT);
        cbcwm = (CheckBox) findViewById(R.id.checkBoxCWM);
        cbrom = (CheckBox) findViewById(R.id.checkBoxROM);
        cbvirus = (CheckBox) findViewById(R.id.checkBoxVirus);
        bOK = (Button) findViewById(R.id.Daftar);
        tvHasil = (TextView) findViewById(R.id.TextViewHasil);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String email = etEmail.getText().toString();
                int telpon = Integer.parseInt(etTelpon.getText().toString());
                tvHasil.setText("Siswa dengan informasi di bawah ini telah berhasil mendaftar");
                doClick();
            }
        });
    }

    private void doClick() {
        tvHasil5.setText("kelas = " + spKelas.getSelectedItem().toString());

        String hasil = "Materi yang diambil = \n";
        int startlen = hasil.length();
        if (cbapk.isChecked()) hasil += cbapk.getText() + "\n";
        if (cbroot.isChecked()) hasil += cbroot.getText() + "\n";
        if (cbcwm.isChecked()) hasil += cbcwm.getText() + "\n";
        if (cbrom.isChecked()) hasil += cbrom.getText() + "\n";
        if (cbvirus.isChecked()) hasil += cbvirus.getText() + "\n";

        if (hasil.length() == startlen) hasil += "Anda belum memilih materi";
        tvHasil6.setText(hasil);
    }

    public void clickExit(View v) {
        finish();
    }
}
