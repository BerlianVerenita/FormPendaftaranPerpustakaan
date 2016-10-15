package id.sch.smktelkom_mlg.tugas01.xiirpl4008.formpendaftarananggota;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    RadioGroup rgJK;
    CheckBox cbMbb, cbMnl, cbMgg, cbMgr;
    Spinner spKelas;
    Button bOk;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        bOk = (Button) findViewById(R.id.buttonOk);
        rgJK = (RadioGroup) findViewById(R.id.radioGroupJK);
        cbMbb = (CheckBox) findViewById(R.id.checkBoxMbb);
        cbMnl = (CheckBox) findViewById(R.id.checkBoxMnl);
        cbMgg = (CheckBox) findViewById(R.id.checkBoxMgg);
        cbMgr = (CheckBox) findViewById(R.id.checkBoxMgr);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                tvHasil.setText("nama : " + nama);
            }

        });

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        if (isValid()) {
            String nama = etNama.getText().toString();
        }

        String JK = null;
        if (rgJK.getCheckedRadioButtonId() != -1) {
            RadioButton RB = (RadioButton) findViewById(rgJK.getCheckedRadioButtonId());
            JK = RB.getText().toString();
        }

        String hbi = "Hobi Anda : \n";
        int startlen = hbi.length();
        int chk = 0;
        if (cbMgr.isChecked()) {
            hbi += cbMgr.getText() + "\n";
            chk++;
        }
        if (cbMgg.isChecked()) {
            hbi += cbMgg.getText() + "\n";
            chk++;
        }
        if (cbMbb.isChecked()) {
            hbi += cbMbb.getText() + "\n";
            chk++;
        }
        if (cbMnl.isChecked()) {
            hbi += cbMnl.getText() + "\n";
            chk++;
        }

        if (hbi.length() == startlen) hbi += "Tidak ada pada pilihan";

        if (chk >= 1) {
            StringBuilder builder = new StringBuilder();
            builder.append("Selamat Anda Diterima ! \n \n");
            builder.append("Nama : " + etNama.getText().toString() + "\n");
            builder.append("Kelas : " + spKelas.getSelectedItem().toString() + "\n");
            builder.append("Jenis Kelamin : " + JK + "\n");
            builder.append(hbi + "\n");

            tvHasil.setText(builder);
        } else {
            tvHasil.setText("Maaf Anda Tidak diTerima" + "\n" + "Anda Harus memilih Hobi minimal 1");
        }

    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        if (nama.isEmpty()) {
            etNama.setError("Nama anda belum diisi");
            valid = true;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = true;
        } else {
            etNama.setError(null);
        }
        return valid;
    }
}
