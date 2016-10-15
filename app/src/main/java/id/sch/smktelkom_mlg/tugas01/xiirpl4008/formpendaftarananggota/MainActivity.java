package id.sch.smktelkom_mlg.tugas01.xiirpl4008.formpendaftarananggota;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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

    }
}
