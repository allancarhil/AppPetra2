package com.example.apppetra2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.apppetra2.Classes.Usina;
import com.example.apppetra2.DAO.UsinaDAO;
import com.example.apppetra2.DAO.UsinaDAOSync;
import com.example.apppetra2.Interfaces.UsinaService;
import com.example.apppetra2.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class UsinaActivity extends AppCompatActivity {

    private Button btnUsinaSalvar;
    private Button btnUsinaSincronizar;
    private TextView nomeEquipamento;

    public int numeroTF1;
    public int numeroAM1;
    public int numeroB01;
    public int numeroB11;
    public int numeroTF2;
    public int numeroAM2;
    public int numeroB02;
    public int numeroB12;
    public int numeroTF3;
    public int numeroAM3;
    public int numeroB03;
    public int numeroB13;
    public int numeroTF4;
    public int numeroAM4;
    public int numeroB04;
    public int numeroB14;
    public int numeroTF5;
    public int numeroAM5;
    public int numeroB05;
    public int numeroB15;
    public int numeroTF6;
    public int numeroAM6;
    public int numeroB06;
    public int numeroB16;


    public Button btnUsinaCancelar;
    public Button btnUsinaTF1Mais;
    public Button btnUsinaTF1Menos;
    public Button btnUsinaAM1Mais;
    public Button btnUsinaAM1Menos;
    public Button btnUsinaB01Mais;
    public Button btnUsinaB01Menos;
    public Button btnUsinaB11Mais;
    public Button btnUsinaB11Menos;
    public Button btnUsinaTF2Mais;
    public Button btnUsinaTF2Menos;
    public Button btnUsinaAM2Mais;
    public Button btnUsinaAM2Menos;
    public Button btnUsinaB02Mais;
    public Button btnUsinaB02Menos;
    public Button btnUsinaB12Mais;
    public Button btnUsinaB12Menos;
    public Button btnUsinaTF3Mais;
    public Button btnUsinaTF3Menos;
    public Button btnUsinaAM3Mais;
    public Button btnUsinaAM3Menos;
    public Button btnUsinaB03Mais;
    public Button btnUsinaB03Menos;
    public Button btnUsinaB13Mais;
    public Button btnUsinaB13Menos;
    public Button btnUsinaTF4Mais;
    public Button btnUsinaTF4Menos;
    public Button btnUsinaAM4Mais;
    public Button btnUsinaAM4Menos;
    public Button btnUsinaB04Mais;
    public Button btnUsinaB04Menos;
    public Button btnUsinaB14Mais;
    public Button btnUsinaB14Menos;
    public Button btnUsinaTF5Mais;
    public Button btnUsinaTF5Menos;
    public Button btnUsinaAM5Mais;
    public Button btnUsinaAM5Menos;
    public Button btnUsinaB05Mais;
    public Button btnUsinaB05Menos;
    public Button btnUsinaB15Mais;
    public Button btnUsinaB15Menos;
    public Button btnUsinaTF6Mais;
    public Button btnUsinaTF6Menos;
    public Button btnUsinaAM6Mais;
    public Button btnUsinaAM6Menos;
    public Button btnUsinaB06Mais;
    public Button btnUsinaB06Menos;
    public Button btnUsinaB16Mais;
    public Button btnUsinaB16Menos;


    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText horiInicial;
    private EditText horiFinal;
    private EditText paradaInicial1;
    private EditText paradaFinal1;
    private Spinner descricao1;
    private EditText paradaInicial2;
    private EditText paradaFinal2;
    private Spinner descricao2;
    private EditText paradaInicial3;
    private EditText paradaFinal3;
    private Spinner descricao3;
    private EditText paradaInicial4;
    private EditText paradaFinal4;
    private Spinner descricao4;
    private EditText paradaInicial5;
    private EditText paradaFinal5;
    private Spinner descricao5;
    private EditText paradaInicial6;
    private EditText paradaFinal6;
    private Spinner descricao6;
    private EditText paradaInicial7;
    private EditText paradaFinal7;
    private Spinner descricao7;
    private EditText paradaInicial8;
    private EditText paradaFinal8;
    private Spinner descricao8;
    private EditText paradaInicial9;
    private EditText paradaFinal9;
    private Spinner descricao9;
    private EditText paradaInicial10;
    private EditText paradaFinal10;
    private Spinner descricao10;
    private TextView mot1;
    private TextView tf1;
    private TextView am1;
    private TextView b01;
    private TextView b11;
    private TextView mot1Soma;
    private TextView mot2;
    private TextView tf2;
    private TextView am2;
    private TextView b02;
    private TextView b12;
    private TextView mot2Soma;
    private TextView mot3;
    private TextView tf3;
    private TextView am3;
    private TextView b03;
    private TextView b13;
    private TextView mot3Soma;
    private TextView mot4;
    private TextView tf4;
    private TextView am4;
    private TextView b04;
    private TextView b14;
    private TextView mot4Soma;
    private TextView mot5;
    private TextView tf5;
    private TextView am5;
    private TextView b05;
    private TextView b15;
    private TextView mot5Soma;
    private TextView mot6;
    private TextView tf6;
    private TextView am6;
    private TextView b06;
    private TextView b16;
    private TextView mot6Soma;
    private CheckBox bandeja;
    private CheckBox rolo;
    private CheckBox rolete;
    private CheckBox alinha;
    private CheckBox egaiolada;
    private EditText obs;
    private UsinaDAO dao;
    private UsinaDAOSync dao2;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usina);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUsinaMot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data = findViewById(R.id.txtUsinaData);
        horaInicial = findViewById(R.id.txtUsinaHI);
        horaFinal = findViewById(R.id.txtUsinaHF);
        horiInicial = findViewById(R.id.txtUsinaHoriI);
        horiFinal = findViewById(R.id.txtUsinaHoriF);
        paradaInicial1 = findViewById(R.id.txtPEUsinaHI1);
        paradaFinal1 = findViewById(R.id.txtPEUsinaHF1);
        descricao1 = findViewById(R.id.spPEUsinaDesc1);
        paradaInicial2 = findViewById(R.id.txtPEUsinaHI2);
        paradaFinal2 = findViewById(R.id.txtPEUsinaHF2);
        descricao2 = findViewById(R.id.spPEUsinaDesc2);
        paradaInicial3 = findViewById(R.id.txtPEUsinaHI3);
        paradaFinal3 = findViewById(R.id.txtPEUsinaHF3);
        descricao3 = findViewById(R.id.spPEUsinaDesc3);
        paradaInicial4 = findViewById(R.id.txtPEUsinaHI4);
        paradaFinal4 = findViewById(R.id.txtPEUsinaHF4);
        descricao4 = findViewById(R.id.spPEUsinaDesc4);
        paradaInicial5 = findViewById(R.id.txtPEUsinaHI5);
        paradaFinal5 = findViewById(R.id.txtPEUsinaHF5);
        descricao5 = findViewById(R.id.spPEUsinaDesc5);
        paradaInicial6 = findViewById(R.id.txtPEUsinaHI6);
        paradaFinal6 = findViewById(R.id.txtPEUsinaHF6);
        descricao6 = findViewById(R.id.spPEUsinaDesc6);
        paradaInicial7 = findViewById(R.id.txtPEUsinaHI7);
        paradaFinal7 = findViewById(R.id.txtPEUsinaHF7);
        descricao7 = findViewById(R.id.spPEUsinaDesc7);
        paradaInicial8 = findViewById(R.id.txtPEUsinaHI8);
        paradaFinal8 = findViewById(R.id.txtPEUsinaHF8);
        descricao8 = findViewById(R.id.spPEUsinaDesc8);
        paradaInicial9 = findViewById(R.id.txtPEUsinaHI9);
        paradaFinal9 = findViewById(R.id.txtPEUsinaHF9);
        descricao9 = findViewById(R.id.spPEUsinaDesc9);
        paradaInicial10 = findViewById(R.id.txtPEUsinaHI10);
        paradaFinal10 = findViewById(R.id.txtPEUsinaHF10);
        descricao10 = findViewById(R.id.spPEUsinaDesc10);
        mot1 = findViewById(R.id.txtUsinaVIMot1);
        tf1 = findViewById(R.id.txtUsinaVITF1);
        am1 = findViewById(R.id.txtUsinaVIAM1);
        b01 = findViewById(R.id.txtUsinaVIB01);
        b11 = findViewById(R.id.txtUsinaVIB11);
        mot1Soma = findViewById(R.id.txtUsinaMot1Soma);
        mot2 = findViewById(R.id.txtUsinaVIMot2);
        tf2 = findViewById(R.id.txtUsinaVITF2);
        am2 = findViewById(R.id.txtUsinaVIAM2);
        b02 = findViewById(R.id.txtUsinaVIB02);
        b12 = findViewById(R.id.txtUsinaVIB12);
        mot2Soma = findViewById(R.id.txtUsinaMot2Soma);
        mot3 = findViewById(R.id.txtUsinaVIMot3);
        tf3 = findViewById(R.id.txtUsinaVITF3);
        am3 = findViewById(R.id.txtUsinaVIAM3);
        b03 = findViewById(R.id.txtUsinaVIB03);
        b13 = findViewById(R.id.txtUsinaVIB13);
        mot3Soma = findViewById(R.id.txtUsinaMot3Soma);
        mot4 = findViewById(R.id.txtUsinaVIMot4);
        tf4 = findViewById(R.id.txtUsinaVITF4);
        am4 = findViewById(R.id.txtUsinaVIAM4);
        b04 = findViewById(R.id.txtUsinaVIB04);
        b14 = findViewById(R.id.txtUsinaVIB14);
        mot4Soma = findViewById(R.id.txtUsinaMot4Soma);
        mot5 = findViewById(R.id.txtUsinaVIMot5);
        tf5 = findViewById(R.id.txtUsinaVITF5);
        am5 = findViewById(R.id.txtUsinaVIAM5);
        b05 = findViewById(R.id.txtUsinaVIB05);
        b15 = findViewById(R.id.txtUsinaVIB15);
        mot5Soma = findViewById(R.id.txtUsinaMot5Soma);
        mot6 = findViewById(R.id.txtUsinaVIMot6);
        tf6 = findViewById(R.id.txtUsinaVITF6);
        am6 = findViewById(R.id.txtUsinaVIAM6);
        b06 = findViewById(R.id.txtUsinaVIB06);
        b16 = findViewById(R.id.txtUsinaVIB16);
        mot6Soma = findViewById(R.id.txtUsinaMot6Soma);
        bandeja = findViewById(R.id.chkUsinaBandeja);
        rolo = findViewById(R.id.chkUsinaRolo);
        rolete = findViewById(R.id.chkUsinaRolete);
        alinha = findViewById(R.id.chkUsinaAlinha);
        egaiolada = findViewById(R.id.chkUsinaEgaiolada);
        obs = findViewById(R.id.txtUsinaObs);
        dao = new UsinaDAO(this);
        dao2=new UsinaDAOSync(this);
        btnUsinaSalvar=findViewById(R.id.btnUsinaSave);
        btnUsinaSincronizar=findViewById(R.id.btnUsinaSincronizar);
        btnUsinaSincronizar.setVisibility(View.INVISIBLE);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUsina);

        Spinner spPEUsinaDesc1 = findViewById(R.id.spPEUsinaDesc1);
        ArrayAdapter<CharSequence> adapterDesc = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc1.setAdapter(adapterDesc);

        Spinner spPEUsinaDesc2 = findViewById(R.id.spPEUsinaDesc2);
        ArrayAdapter<CharSequence> adapterDesc2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc2.setAdapter(adapterDesc2);


        Spinner spPEUsinaDesc3 = findViewById(R.id.spPEUsinaDesc3);
        ArrayAdapter<CharSequence> adapterDesc3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc3.setAdapter(adapterDesc3);


        Spinner spPEUsinaDesc4 = findViewById(R.id.spPEUsinaDesc4);
        ArrayAdapter<CharSequence> adapterDesc4 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc4.setAdapter(adapterDesc4);


        Spinner spPEUsinaDesc5 = findViewById(R.id.spPEUsinaDesc5);
        ArrayAdapter<CharSequence> adapterDesc5 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc5.setAdapter(adapterDesc5);


        Spinner spPEUsinaDesc6 = findViewById(R.id.spPEUsinaDesc6);
        ArrayAdapter<CharSequence> adapterDesc6 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc6.setAdapter(adapterDesc6);


        Spinner spPEUsinaDesc7 = findViewById(R.id.spPEUsinaDesc7);
        ArrayAdapter<CharSequence> adapterDesc7 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc7.setAdapter(adapterDesc7);


        Spinner spPEUsinaDesc8 = findViewById(R.id.spPEUsinaDesc8);
        ArrayAdapter<CharSequence> adapterDesc8 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc8.setAdapter(adapterDesc8);


        Spinner spPEUsinaDesc9 = findViewById(R.id.spPEUsinaDesc9);
        ArrayAdapter<CharSequence> adapterDesc9 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc9.setAdapter(adapterDesc9);


        Spinner spPEUsinaDesc10 = findViewById(R.id.spPEUsinaDesc10);
        ArrayAdapter<CharSequence> adapterDesc10 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUsinaDesc10.setAdapter(adapterDesc10);


        TextView horaI = (TextView) findViewById(R.id.txtUsinaHI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUsinaData);
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentData = sdf.format(d);
        data.setText(currentData);


        btnUsinaTF1Mais = (Button) findViewById(R.id.btnUsinaTF1Mais);
        btnUsinaTF1Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF1 = (TextView) findViewById(R.id.txtUsinaVITF1);

            @Override
            public void onClick(View v) {
                numeroTF1 += 1;
                txtUsinaVITF1.setText(String.valueOf(numeroTF1));
                soma1();
            }
        });
        btnUsinaTF1Menos = (Button) findViewById(R.id.btnUsinaTF1Menos);
        btnUsinaTF1Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF1 = (TextView) findViewById(R.id.txtUsinaVITF1);

            @Override
            public void onClick(View v) {
                if (numeroTF1 > 0) {
                    numeroTF1 -= 1;
                    txtUsinaVITF1.setText(String.valueOf(numeroTF1));
                } else {
                    numeroTF1 = 0;
                }
                soma1();
            }
        });

        btnUsinaAM1Mais = (Button) findViewById(R.id.btnUsinaAM1Mais);
        btnUsinaAM1Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM1 = (TextView) findViewById(R.id.txtUsinaVIAM1);

            @Override
            public void onClick(View v) {
                numeroAM1 += 1;
                txtUsinaVIAM1.setText(String.valueOf(numeroAM1));
                soma1();
            }
        });
        btnUsinaAM1Menos = (Button) findViewById(R.id.btnUsinaAM1Menos);
        btnUsinaAM1Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM1 = (TextView) findViewById(R.id.txtUsinaVIAM1);

            @Override
            public void onClick(View v) {
                if (numeroAM1 > 0) {
                    numeroAM1 -= 1;
                    txtUsinaVIAM1.setText(String.valueOf(numeroAM1));
                } else {
                    numeroAM1 = 0;
                }
                soma1();
            }
        });

        btnUsinaB01Mais = (Button) findViewById(R.id.btnUsinaB01Mais);
        btnUsinaB01Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB01 = (TextView) findViewById(R.id.txtUsinaVIB01);

            @Override
            public void onClick(View v) {
                numeroB01 += 1;
                txtUsinaVIB01.setText(String.valueOf(numeroB01));
                soma1();
            }
        });
        btnUsinaB01Menos = (Button) findViewById(R.id.btnUsinaB01Menos);
        btnUsinaB01Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB01 = (TextView) findViewById(R.id.txtUsinaVIB01);

            @Override
            public void onClick(View v) {
                if (numeroB01 > 0) {
                    numeroB01 -= 1;
                    txtUsinaVIB01.setText(String.valueOf(numeroB01));
                } else {
                    numeroB01 = 0;
                }
                soma1();
            }
        });

        btnUsinaB11Mais = (Button) findViewById(R.id.btnUsinaB11Mais);
        btnUsinaB11Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB11 = (TextView) findViewById(R.id.txtUsinaVIB11);

            @Override
            public void onClick(View v) {
                numeroB11 += 1;
                txtUsinaVIB11.setText(String.valueOf(numeroB11));
                soma1();
            }
        });
        btnUsinaB11Menos = (Button) findViewById(R.id.btnUsinaB11Menos);
        btnUsinaB11Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB11 = (TextView) findViewById(R.id.txtUsinaVIB11);

            @Override
            public void onClick(View v) {
                if (numeroB11 > 0) {
                    numeroB11 -= 1;
                    txtUsinaVIB11.setText(String.valueOf(numeroB11));
                } else {
                    numeroB11 = 0;
                }
                soma1();
            }
        });


        btnUsinaTF2Mais = (Button) findViewById(R.id.btnUsinaTF2Mais);
        btnUsinaTF2Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF2 = (TextView) findViewById(R.id.txtUsinaVITF2);

            @Override
            public void onClick(View v) {
                numeroTF2 += 1;
                txtUsinaVITF2.setText(String.valueOf(numeroTF2));
                soma2();
            }
        });
        btnUsinaTF2Menos = (Button) findViewById(R.id.btnUsinaTF2Menos);
        btnUsinaTF2Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF2 = (TextView) findViewById(R.id.txtUsinaVITF2);

            @Override
            public void onClick(View v) {
                if (numeroTF2 > 0) {
                    numeroTF2 -= 1;
                    txtUsinaVITF2.setText(String.valueOf(numeroTF2));
                } else {
                    numeroTF2 = 0;
                }
                soma2();
            }
        });

        btnUsinaAM2Mais = (Button) findViewById(R.id.btnUsinaAM2Mais);
        btnUsinaAM2Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM2 = (TextView) findViewById(R.id.txtUsinaVIAM2);

            @Override
            public void onClick(View v) {
                numeroAM2 += 1;
                txtUsinaVIAM2.setText(String.valueOf(numeroAM2));
                soma2();
            }
        });
        btnUsinaAM2Menos = (Button) findViewById(R.id.btnUsinaAM2Menos);
        btnUsinaAM2Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM2 = (TextView) findViewById(R.id.txtUsinaVIAM2);

            @Override
            public void onClick(View v) {
                if (numeroAM2 > 0) {
                    numeroAM2 -= 1;
                    txtUsinaVIAM2.setText(String.valueOf(numeroAM2));
                } else {
                    numeroAM2 = 0;
                }
                soma2();
            }
        });

        btnUsinaB02Mais = (Button) findViewById(R.id.btnUsinaB02Mais);
        btnUsinaB02Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB02 = (TextView) findViewById(R.id.txtUsinaVIB02);

            @Override
            public void onClick(View v) {
                numeroB02 += 1;
                txtUsinaVIB02.setText(String.valueOf(numeroB02));
                soma2();
            }
        });
        btnUsinaB02Menos = (Button) findViewById(R.id.btnUsinaB02Menos);
        btnUsinaB02Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB02 = (TextView) findViewById(R.id.txtUsinaVIB02);

            @Override
            public void onClick(View v) {
                if (numeroB02 > 0) {
                    numeroB02 -= 1;
                    txtUsinaVIB02.setText(String.valueOf(numeroB02));
                } else {
                    numeroB02 = 0;
                }
                soma2();
            }
        });

        btnUsinaB12Mais = (Button) findViewById(R.id.btnUsinaB12Mais);
        btnUsinaB12Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB12 = (TextView) findViewById(R.id.txtUsinaVIB12);

            @Override
            public void onClick(View v) {
                numeroB12 += 1;
                txtUsinaVIB12.setText(String.valueOf(numeroB12));
                soma2();
            }
        });
        btnUsinaB12Menos = (Button) findViewById(R.id.btnUsinaB12Menos);
        btnUsinaB12Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB12 = (TextView) findViewById(R.id.txtUsinaVIB12);

            @Override
            public void onClick(View v) {
                if (numeroB12 > 0) {
                    numeroB12 -= 1;
                    txtUsinaVIB12.setText(String.valueOf(numeroB12));
                } else {
                    numeroB12 = 0;
                }
                soma2();
            }
        });


        btnUsinaTF3Mais = (Button) findViewById(R.id.btnUsinaTF3Mais);
        btnUsinaTF3Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF3 = (TextView) findViewById(R.id.txtUsinaVITF3);

            @Override
            public void onClick(View v) {
                numeroTF3 += 1;
                txtUsinaVITF3.setText(String.valueOf(numeroTF3));
                soma3();
            }
        });
        btnUsinaTF3Menos = (Button) findViewById(R.id.btnUsinaTF3Menos);
        btnUsinaTF3Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF3 = (TextView) findViewById(R.id.txtUsinaVITF3);

            @Override
            public void onClick(View v) {
                if (numeroTF3 > 0) {
                    numeroTF3 -= 1;
                    txtUsinaVITF3.setText(String.valueOf(numeroTF3));
                } else {
                    numeroTF3 = 0;
                }
                soma3();
            }
        });

        btnUsinaAM3Mais = (Button) findViewById(R.id.btnUsinaAM3Mais);
        btnUsinaAM3Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM3 = (TextView) findViewById(R.id.txtUsinaVIAM3);

            @Override
            public void onClick(View v) {
                numeroAM3 += 1;
                txtUsinaVIAM3.setText(String.valueOf(numeroAM3));
                soma3();
            }
        });
        btnUsinaAM3Menos = (Button) findViewById(R.id.btnUsinaAM3Menos);
        btnUsinaAM3Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM3 = (TextView) findViewById(R.id.txtUsinaVIAM3);

            @Override
            public void onClick(View v) {
                if (numeroAM3 > 0) {
                    numeroAM3 -= 1;
                    txtUsinaVIAM3.setText(String.valueOf(numeroAM3));
                } else {
                    numeroAM3 = 0;
                }
                soma3();
            }
        });

        btnUsinaB03Mais = (Button) findViewById(R.id.btnUsinaB03Mais);
        btnUsinaB03Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB03 = (TextView) findViewById(R.id.txtUsinaVIB03);

            @Override
            public void onClick(View v) {
                numeroB03 += 1;
                txtUsinaVIB03.setText(String.valueOf(numeroB03));
                soma3();
            }
        });
        btnUsinaB03Menos = (Button) findViewById(R.id.btnUsinaB03Menos);
        btnUsinaB03Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB03 = (TextView) findViewById(R.id.txtUsinaVIB03);

            @Override
            public void onClick(View v) {
                if (numeroB03 > 0) {
                    numeroB03 -= 1;
                    txtUsinaVIB03.setText(String.valueOf(numeroB03));
                } else {
                    numeroB03 = 0;
                }
                soma3();
            }
        });

        btnUsinaB13Mais = (Button) findViewById(R.id.btnUsinaB13Mais);
        btnUsinaB13Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB13 = (TextView) findViewById(R.id.txtUsinaVIB13);

            @Override
            public void onClick(View v) {
                numeroB13 += 1;
                txtUsinaVIB13.setText(String.valueOf(numeroB13));
                soma3();
            }
        });
        btnUsinaB13Menos = (Button) findViewById(R.id.btnUsinaB13Menos);
        btnUsinaB13Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB13 = (TextView) findViewById(R.id.txtUsinaVIB13);

            @Override
            public void onClick(View v) {
                if (numeroB13 > 0) {
                    numeroB13 -= 1;
                    txtUsinaVIB13.setText(String.valueOf(numeroB13));
                } else {
                    numeroB13 = 0;
                }
                soma3();
            }
        });


        btnUsinaTF4Mais = (Button) findViewById(R.id.btnUsinaTF4Mais);
        btnUsinaTF4Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF4 = (TextView) findViewById(R.id.txtUsinaVITF4);

            @Override
            public void onClick(View v) {
                numeroTF4 += 1;
                txtUsinaVITF4.setText(String.valueOf(numeroTF4));
                soma4();
            }
        });
        btnUsinaTF4Menos = (Button) findViewById(R.id.btnUsinaTF4Menos);
        btnUsinaTF4Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF4 = (TextView) findViewById(R.id.txtUsinaVITF4);

            @Override
            public void onClick(View v) {
                if (numeroTF4 > 0) {
                    numeroTF4 -= 1;
                    txtUsinaVITF4.setText(String.valueOf(numeroTF4));
                } else {
                    numeroTF4 = 0;
                }
                soma4();
            }
        });

        btnUsinaAM4Mais = (Button) findViewById(R.id.btnUsinaAM4Mais);
        btnUsinaAM4Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM4 = (TextView) findViewById(R.id.txtUsinaVIAM4);

            @Override
            public void onClick(View v) {
                numeroAM4 += 1;
                txtUsinaVIAM4.setText(String.valueOf(numeroAM4));
                soma4();
            }
        });
        btnUsinaAM4Menos = (Button) findViewById(R.id.btnUsinaAM4Menos);
        btnUsinaAM4Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM4 = (TextView) findViewById(R.id.txtUsinaVIAM4);

            @Override
            public void onClick(View v) {
                if (numeroAM4 > 0) {
                    numeroAM4 -= 1;
                    txtUsinaVIAM4.setText(String.valueOf(numeroAM4));
                } else {
                    numeroAM4 = 0;
                }
                soma4();
            }
        });

        btnUsinaB04Mais = (Button) findViewById(R.id.btnUsinaB04Mais);
        btnUsinaB04Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB04 = (TextView) findViewById(R.id.txtUsinaVIB04);

            @Override
            public void onClick(View v) {
                numeroB04 += 1;
                txtUsinaVIB04.setText(String.valueOf(numeroB04));
                soma4();
            }
        });
        btnUsinaB04Menos = (Button) findViewById(R.id.btnUsinaB04Menos);
        btnUsinaB04Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB04 = (TextView) findViewById(R.id.txtUsinaVIB04);

            @Override
            public void onClick(View v) {
                if (numeroB04 > 0) {
                    numeroB04 -= 1;
                    txtUsinaVIB04.setText(String.valueOf(numeroB04));
                } else {
                    numeroB04 = 0;
                }
                soma4();
            }
        });

        btnUsinaB14Mais = (Button) findViewById(R.id.btnUsinaB14Mais);
        btnUsinaB14Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB14 = (TextView) findViewById(R.id.txtUsinaVIB14);

            @Override
            public void onClick(View v) {
                numeroB14 += 1;
                txtUsinaVIB14.setText(String.valueOf(numeroB14));
                soma4();
            }
        });
        btnUsinaB14Menos = (Button) findViewById(R.id.btnUsinaB14Menos);
        btnUsinaB14Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB14 = (TextView) findViewById(R.id.txtUsinaVIB14);

            @Override
            public void onClick(View v) {
                if (numeroB14 > 0) {
                    numeroB14 -= 1;
                    txtUsinaVIB14.setText(String.valueOf(numeroB14));
                } else {
                    numeroB14 = 0;
                }
                soma4();
            }
        });


        btnUsinaTF5Mais = (Button) findViewById(R.id.btnUsinaTF5Mais);
        btnUsinaTF5Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF5 = (TextView) findViewById(R.id.txtUsinaVITF5);

            @Override
            public void onClick(View v) {
                numeroTF5 += 1;
                txtUsinaVITF5.setText(String.valueOf(numeroTF5));
                soma5();
            }
        });
        btnUsinaTF5Menos = (Button) findViewById(R.id.btnUsinaTF5Menos);
        btnUsinaTF5Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF5 = (TextView) findViewById(R.id.txtUsinaVITF5);

            @Override
            public void onClick(View v) {
                if (numeroTF5 > 0) {
                    numeroTF5 -= 1;
                    txtUsinaVITF5.setText(String.valueOf(numeroTF5));
                } else {
                    numeroTF5 = 0;
                }
                soma5();
            }
        });

        btnUsinaAM5Mais = (Button) findViewById(R.id.btnUsinaAM5Mais);
        btnUsinaAM5Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM5 = (TextView) findViewById(R.id.txtUsinaVIAM5);

            @Override
            public void onClick(View v) {
                numeroAM5 += 1;
                txtUsinaVIAM5.setText(String.valueOf(numeroAM5));
                soma5();
            }
        });
        btnUsinaAM5Menos = (Button) findViewById(R.id.btnUsinaAM5Menos);
        btnUsinaAM5Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM5 = (TextView) findViewById(R.id.txtUsinaVIAM5);

            @Override
            public void onClick(View v) {
                if (numeroAM5 > 0) {
                    numeroAM5 -= 1;
                    txtUsinaVIAM5.setText(String.valueOf(numeroAM5));
                } else {
                    numeroAM5 = 0;
                }
                soma5();
            }
        });

        btnUsinaB05Mais = (Button) findViewById(R.id.btnUsinaB05Mais);
        btnUsinaB05Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB05 = (TextView) findViewById(R.id.txtUsinaVIB05);

            @Override
            public void onClick(View v) {
                numeroB05 += 1;
                txtUsinaVIB05.setText(String.valueOf(numeroB05));
                soma5();
            }
        });
        btnUsinaB05Menos = (Button) findViewById(R.id.btnUsinaB05Menos);
        btnUsinaB05Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB05 = (TextView) findViewById(R.id.txtUsinaVIB05);

            @Override
            public void onClick(View v) {
                if (numeroB05 > 0) {
                    numeroB05 -= 1;
                    txtUsinaVIB05.setText(String.valueOf(numeroB05));
                } else {
                    numeroB05 = 0;
                }
                soma5();
            }
        });

        btnUsinaB15Mais = (Button) findViewById(R.id.btnUsinaB15Mais);
        btnUsinaB15Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB15 = (TextView) findViewById(R.id.txtUsinaVIB15);

            @Override
            public void onClick(View v) {
                numeroB15 += 1;
                txtUsinaVIB15.setText(String.valueOf(numeroB15));
                soma5();
            }
        });
        btnUsinaB15Menos = (Button) findViewById(R.id.btnUsinaB15Menos);
        btnUsinaB15Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB15 = (TextView) findViewById(R.id.txtUsinaVIB15);

            @Override
            public void onClick(View v) {
                if (numeroB15 > 0) {
                    numeroB15 -= 1;
                    txtUsinaVIB15.setText(String.valueOf(numeroB15));
                } else {
                    numeroB15 = 0;
                }
                soma5();
            }
        });


        btnUsinaTF6Mais = (Button) findViewById(R.id.btnUsinaTF6Mais);
        btnUsinaTF6Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF6 = (TextView) findViewById(R.id.txtUsinaVITF6);

            @Override
            public void onClick(View v) {
                numeroTF6 += 1;
                txtUsinaVITF6.setText(String.valueOf(numeroTF6));
                soma6();
            }
        });
        btnUsinaTF6Menos = (Button) findViewById(R.id.btnUsinaTF6Menos);
        btnUsinaTF6Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVITF6 = (TextView) findViewById(R.id.txtUsinaVITF6);

            @Override
            public void onClick(View v) {
                if (numeroTF6 > 0) {
                    numeroTF6 -= 1;
                    txtUsinaVITF6.setText(String.valueOf(numeroTF6));
                } else {
                    numeroTF6 = 0;
                }
                soma6();
            }
        });

        btnUsinaAM6Mais = (Button) findViewById(R.id.btnUsinaAM6Mais);
        btnUsinaAM6Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM6 = (TextView) findViewById(R.id.txtUsinaVIAM6);

            @Override
            public void onClick(View v) {
                numeroAM6 += 1;
                txtUsinaVIAM6.setText(String.valueOf(numeroAM6));
                soma6();
            }
        });
        btnUsinaAM6Menos = (Button) findViewById(R.id.btnUsinaAM6Menos);
        btnUsinaAM6Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIAM6 = (TextView) findViewById(R.id.txtUsinaVIAM6);

            @Override
            public void onClick(View v) {
                if (numeroAM6 > 0) {
                    numeroAM6 -= 1;
                    txtUsinaVIAM6.setText(String.valueOf(numeroAM6));
                } else {
                    numeroAM6 = 0;
                }
                soma6();
            }
        });

        btnUsinaB06Mais = (Button) findViewById(R.id.btnUsinaB06Mais);
        btnUsinaB06Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB06 = (TextView) findViewById(R.id.txtUsinaVIB06);

            @Override
            public void onClick(View v) {
                numeroB06 += 1;
                txtUsinaVIB06.setText(String.valueOf(numeroB06));
                soma6();
            }
        });
        btnUsinaB06Menos = (Button) findViewById(R.id.btnUsinaB06Menos);
        btnUsinaB06Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB06 = (TextView) findViewById(R.id.txtUsinaVIB06);

            @Override
            public void onClick(View v) {
                if (numeroB06 > 0) {
                    numeroB06 -= 1;
                    txtUsinaVIB06.setText(String.valueOf(numeroB06));
                } else {
                    numeroB06 = 0;
                }
                soma6();
            }
        });

        btnUsinaB16Mais = (Button) findViewById(R.id.btnUsinaB16Mais);
        btnUsinaB16Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB16 = (TextView) findViewById(R.id.txtUsinaVIB16);

            @Override
            public void onClick(View v) {
                numeroB16 += 1;
                txtUsinaVIB16.setText(String.valueOf(numeroB16));
                soma6();
            }
        });
        btnUsinaB16Menos = (Button) findViewById(R.id.btnUsinaB16Menos);
        btnUsinaB16Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUsinaVIB16 = (TextView) findViewById(R.id.txtUsinaVIB16);

            @Override
            public void onClick(View v) {
                if (numeroB16 > 0) {
                    numeroB16 -= 1;
                    txtUsinaVIB16.setText(String.valueOf(numeroB16));
                } else {
                    numeroB16 = 0;
                }
                soma6();
            }
        });


        btnUsinaCancelar = findViewById(R.id.btnUsinaCancel);
        btnUsinaCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(UsinaActivity.this);
                View view = LayoutInflater.from(UsinaActivity.this).inflate(R.layout.alert_dialog, null);
                builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //Toast.makeText(Uc14Activity.this,"ok", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        // Closing all the Activities, clear the back stack.
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(Uc14Activity.this,"cancelar", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setView(view);
                builder.show();
            }
        });


        //===================================================================================================================================================================


        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUsinaHI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUsinaHI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUsinaHI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUsinaHI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUsinaHI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUsinaHI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUsinaHI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUsinaHI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUsinaHI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUsinaHI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


//====================================================================================================================================================


        //PARADA DE EQUIPAMENTO FIM 01
        paradaFinal1 = findViewById(R.id.txtPEUsinaHF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUsinaHF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUsinaHF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUsinaHF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUsinaHF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUsinaHF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUsinaHF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUsinaHF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUsinaHF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUsinaHF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(UsinaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnUsinaSincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(UsinaActivity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(UsinaActivity.this);
                    View view = LayoutInflater.from(UsinaActivity.this).inflate(R.layout.sinc_dialog, null);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //Toast.makeText(Uc14Activity.this,"ok", Toast.LENGTH_SHORT).show();
                            //   Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            // Closing all the Activities, clear the back stack.
                            //    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            //   startActivity(intent);
                        }
                    });
                    // builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    //     @Override
                    //     public void onClick(DialogInterface dialog, int which) {
                    //          //Toast.makeText(Uc14Activity.this,"cancelar", Toast.LENGTH_SHORT).show();
                    //      }
                    //  });
                    builder.setView(view);
                    builder.show();
                }

            }

        });

    }

    boolean isEmpty(EditText text) {
        CharSequence str = horiFinal.getText().toString();
        return TextUtils.isEmpty(str);
    }

    public void soma1() {

        final TextView txtsomaMot1 = findViewById(R.id.txtUsinaMot1Soma);
        TextView TF1 = findViewById(R.id.txtUsinaVITF1);
        TextView AM1 = findViewById(R.id.txtUsinaVIAM1);
        TextView B01 = findViewById(R.id.txtUsinaVIB01);
        TextView B11 = findViewById(R.id.txtUsinaVIB11);
        int TF1n = Integer.parseInt(TF1.getText().toString());
        int AM1n = Integer.parseInt(AM1.getText().toString());
        int B01n = Integer.parseInt(B01.getText().toString());
        int B11n = Integer.parseInt(B11.getText().toString());
        int somaMot1 = TF1n + AM1n + B01n + B11n;
        String somaMot1n = Integer.toString(somaMot1);
        txtsomaMot1.setText(somaMot1n);
    }

    public void soma2() {

        final TextView txtsomaMot2 = findViewById(R.id.txtUsinaMot2Soma);
        TextView TF2 = findViewById(R.id.txtUsinaVITF2);
        TextView AM2 = findViewById(R.id.txtUsinaVIAM2);
        TextView B02 = findViewById(R.id.txtUsinaVIB02);
        TextView B12 = findViewById(R.id.txtUsinaVIB12);
        int TF2n = Integer.parseInt(TF2.getText().toString());
        int AM2n = Integer.parseInt(AM2.getText().toString());
        int B02n = Integer.parseInt(B02.getText().toString());
        int B12n = Integer.parseInt(B12.getText().toString());
        int somaMot2 = TF2n + AM2n + B02n + B12n;
        String somaMot2n = Integer.toString(somaMot2);
        txtsomaMot2.setText(somaMot2n);
    }

    public void soma3() {

        final TextView txtsomaMot3 = findViewById(R.id.txtUsinaMot3Soma);
        TextView TF3 = findViewById(R.id.txtUsinaVITF3);
        TextView AM3 = findViewById(R.id.txtUsinaVIAM3);
        TextView B03 = findViewById(R.id.txtUsinaVIB03);
        TextView B13 = findViewById(R.id.txtUsinaVIB13);
        int TF3n = Integer.parseInt(TF3.getText().toString());
        int AM3n = Integer.parseInt(AM3.getText().toString());
        int B03n = Integer.parseInt(B03.getText().toString());
        int B13n = Integer.parseInt(B13.getText().toString());
        int somaMot3 = TF3n + AM3n + B03n + B13n;
        String somaMot3n = Integer.toString(somaMot3);
        txtsomaMot3.setText(somaMot3n);
    }

    public void soma4() {

        final TextView txtsomaMot4 = findViewById(R.id.txtUsinaMot4Soma);
        TextView TF4 = findViewById(R.id.txtUsinaVITF4);
        TextView AM4 = findViewById(R.id.txtUsinaVIAM4);
        TextView B04 = findViewById(R.id.txtUsinaVIB04);
        TextView B14 = findViewById(R.id.txtUsinaVIB14);
        int TF4n = Integer.parseInt(TF4.getText().toString());
        int AM4n = Integer.parseInt(AM4.getText().toString());
        int B04n = Integer.parseInt(B04.getText().toString());
        int B14n = Integer.parseInt(B14.getText().toString());
        int somaMot4 = TF4n + AM4n + B04n + B14n;
        String somaMot4n = Integer.toString(somaMot4);
        txtsomaMot4.setText(somaMot4n);
    }


    public void soma5() {

        final TextView txtsomaMot5 = findViewById(R.id.txtUsinaMot5Soma);
        TextView TF5 = findViewById(R.id.txtUsinaVITF5);
        TextView AM5 = findViewById(R.id.txtUsinaVIAM5);
        TextView B05 = findViewById(R.id.txtUsinaVIB05);
        TextView B15 = findViewById(R.id.txtUsinaVIB15);
        int TF5n = Integer.parseInt(TF5.getText().toString());
        int AM5n = Integer.parseInt(AM5.getText().toString());
        int B05n = Integer.parseInt(B05.getText().toString());
        int B15n = Integer.parseInt(B15.getText().toString());
        int somaMot5 = TF5n + AM5n + B05n + B15n;
        String somaMot5n = Integer.toString(somaMot5);
        txtsomaMot5.setText(somaMot5n);
    }


    public void soma6() {

        final TextView txtsomaMot6 = findViewById(R.id.txtUsinaMot6Soma);
        TextView TF6 = findViewById(R.id.txtUsinaVITF6);
        TextView AM6 = findViewById(R.id.txtUsinaVIAM6);
        TextView B06 = findViewById(R.id.txtUsinaVIB06);
        TextView B16 = findViewById(R.id.txtUsinaVIB16);
        int TF6n = Integer.parseInt(TF6.getText().toString());
        int AM6n = Integer.parseInt(AM6.getText().toString());
        int B06n = Integer.parseInt(B06.getText().toString());
        int B16n = Integer.parseInt(B16.getText().toString());
        int somaMot6 = TF6n + AM6n + B06n + B16n;
        String somaMot6n = Integer.toString(somaMot6);
        txtsomaMot6.setText(somaMot6n);
    }


    public void salvar(View view) {

        if (isEmpty(horiFinal) || horiFinal.getText().toString().trim().length() == 0) {
            horiFinal.setError("CAMPO OBRIGATÓRIO");
            horiFinal.requestFocus();
        } else {

            btnUsinaSalvar.setVisibility(View.INVISIBLE);
            btnUsinaSincronizar.setVisibility(View.VISIBLE);
            Usina sina = new Usina(
                    nomeEquipamento.getText().toString(),
                    motorista.getText().toString(),
                    data.getText().toString(),
                    horaInicial.getText().toString(),
                    horaFinal.getText().toString(),
                    horiInicial.getText().toString(),
                    horiFinal.getText().toString(),
                    paradaInicial1.getText().toString(),
                    paradaFinal1.getText().toString(),
                    descricao1.getSelectedItem().toString(),
                    paradaInicial2.getText().toString(),
                    paradaFinal2.getText().toString(),
                    descricao2.getSelectedItem().toString(),
                    paradaInicial3.getText().toString(),
                    paradaFinal3.getText().toString(),
                    descricao3.getSelectedItem().toString(),
                    paradaInicial4.getText().toString(),
                    paradaFinal4.getText().toString(),
                    descricao4.getSelectedItem().toString(),
                    paradaInicial5.getText().toString(),
                    paradaFinal5.getText().toString(),
                    descricao5.getSelectedItem().toString(),
                    paradaInicial6.getText().toString(),
                    paradaFinal6.getText().toString(),
                    descricao6.getSelectedItem().toString(),
                    paradaInicial7.getText().toString(),
                    paradaFinal7.getText().toString(),
                    descricao7.getSelectedItem().toString(),
                    paradaInicial8.getText().toString(),
                    paradaFinal8.getText().toString(),
                    descricao8.getSelectedItem().toString(),
                    paradaInicial9.getText().toString(),
                    paradaFinal9.getText().toString(),
                    descricao9.getSelectedItem().toString(),
                    paradaInicial10.getText().toString(),
                    paradaFinal10.getText().toString(),
                    descricao10.getSelectedItem().toString(),
                    mot1.getText().toString(),
                    tf1.getText().toString(),
                    am1.getText().toString(),
                    b01.getText().toString(),
                    b11.getText().toString(),
                    mot1Soma.getText().toString(),
                    mot2.getText().toString(),
                    tf2.getText().toString(),
                    am2.getText().toString(),
                    b02.getText().toString(),
                    b12.getText().toString(),
                    mot2Soma.getText().toString(),
                    mot3.getText().toString(),
                    tf3.getText().toString(),
                    am3.getText().toString(),
                    b03.getText().toString(),
                    b13.getText().toString(),
                    mot3Soma.getText().toString(),
                    mot4.getText().toString(),
                    tf4.getText().toString(),
                    am4.getText().toString(),
                    b04.getText().toString(),
                    b14.getText().toString(),
                    mot4Soma.getText().toString(),
                    mot5.getText().toString(),
                    tf5.getText().toString(),
                    am5.getText().toString(),
                    b05.getText().toString(),
                    b15.getText().toString(),
                    mot5Soma.getText().toString(),
                    mot6.getText().toString(),
                    tf6.getText().toString(),
                    am6.getText().toString(),
                    b06.getText().toString(),
                    b16.getText().toString(),
                    mot6Soma.getText().toString(),
                    bandeja.getText().toString(),
                    rolo.getText().toString(),
                    rolete.getText().toString(),
                    alinha.getText().toString(),
                    egaiolada.getText().toString(),
                    obs.getText().toString()
            );
            sina.setNomeEquipamento(nomeEquipamento.getText().toString());
            sina.setMotorista(motorista.getText().toString());
            sina.setData(data.getText().toString());
            sina.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            sina.setHoraFinal(horaFinal.getText().toString());
            sina.setHorimetroInicial(horiInicial.getText().toString());
            sina.setHorimetroFinal(horiFinal.getText().toString());
            sina.setParadaInicial1(paradaInicial1.getText().toString());
            sina.setParadaFinal1(paradaFinal1.getText().toString());
            sina.setDescricao1(descricao1.getSelectedItem().toString());
            sina.setParadaInicial2(paradaInicial2.getText().toString());
            sina.setParadaFinal2(paradaFinal2.getText().toString());
            sina.setDescricao2(descricao2.getSelectedItem().toString());
            sina.setParadaInicial3(paradaInicial3.getText().toString());
            sina.setParadaFinal3(paradaFinal3.getText().toString());
            sina.setDescricao3(descricao3.getSelectedItem().toString());
            sina.setParadaInicial4(paradaInicial4.getText().toString());
            sina.setParadaFinal4(paradaFinal4.getText().toString());
            sina.setDescricao4(descricao4.getSelectedItem().toString());
            sina.setParadaInicial5(paradaInicial5.getText().toString());
            sina.setParadaFinal5(paradaFinal5.getText().toString());
            sina.setDescricao5(descricao5.getSelectedItem().toString());
            sina.setParadaInicial6(paradaInicial6.getText().toString());
            sina.setParadaFinal6(paradaFinal6.getText().toString());
            sina.setDescricao6(descricao6.getSelectedItem().toString());
            sina.setParadaInicial7(paradaInicial7.getText().toString());
            sina.setParadaFinal7(paradaFinal7.getText().toString());
            sina.setDescricao7(descricao7.getSelectedItem().toString());
            sina.setParadaInicial8(paradaInicial8.getText().toString());
            sina.setParadaFinal8(paradaFinal8.getText().toString());
            sina.setDescricao8(descricao8.getSelectedItem().toString());
            sina.setParadaInicial9(paradaInicial9.getText().toString());
            sina.setParadaFinal9(paradaFinal9.getText().toString());
            sina.setDescricao9(descricao9.getSelectedItem().toString());
            sina.setParadaInicial10(paradaInicial10.getText().toString());
            sina.setParadaFinal10(paradaFinal10.getText().toString());
            sina.setDescricao9(descricao10.getSelectedItem().toString());
            sina.setMotorista1(mot1.getText().toString());

            sina.setTf1(tf1.getText().toString());
            sina.setAm1(am1.getText().toString());
            sina.setB01(b01.getText().toString());
            sina.setB11(b11.getText().toString());
            sina.setMot1Soma(mot1Soma.getText().toString());

            sina.setMotorista2(mot2.getText().toString());
            sina.setTf2(tf2.getText().toString());
            sina.setAm2(am2.getText().toString());
            sina.setB02(b02.getText().toString());
            sina.setB12(b12.getText().toString());
            sina.setMot2Soma(mot2Soma.getText().toString());

            sina.setMotorista3(mot3.getText().toString());
            sina.setTf3(tf3.getText().toString());
            sina.setAm3(am3.getText().toString());
            sina.setB03(b03.getText().toString());
            sina.setB13(b13.getText().toString());
            sina.setMot3Soma(mot3Soma.getText().toString());


            sina.setMotorista4(mot4.getText().toString());
            sina.setTf4(tf4.getText().toString());
            sina.setAm4(am4.getText().toString());
            sina.setB04(b04.getText().toString());
            sina.setB14(b14.getText().toString());
            sina.setMot4Soma(mot4Soma.getText().toString());


            sina.setMotorista5(mot5.getText().toString());
            sina.setTf5(tf5.getText().toString());
            sina.setAm5(am5.getText().toString());
            sina.setB05(b05.getText().toString());
            sina.setB15(b15.getText().toString());
            sina.setMot5Soma(mot5Soma.getText().toString());


            sina.setMotorista6(mot6.getText().toString());
            sina.setTf6(tf6.getText().toString());
            sina.setAm6(am6.getText().toString());
            sina.setB06(b06.getText().toString());
            sina.setB16(b16.getText().toString());
            sina.setMot6Soma(mot6Soma.getText().toString());

            if (bandeja.isChecked()) {
                bandeja.setText("Não");
                sina.setBandeja(bandeja.getText().toString());
            } else {
                bandeja.setText("Sim");
                sina.setBandeja(bandeja.getText().toString());
            }

            if (rolo.isChecked()) {
                rolo.setText("Não");
                sina.setRolo(rolo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                rolo.setText("Sim");
                sina.setRolo(rolo.getText().toString());
            }

            if (rolete.isChecked()) {
                rolete.setText("Não");
                sina.setRolete(rolete.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                rolete.setText("Sim");
                sina.setRolete(rolete.getText().toString());
            }
            if (alinha.isChecked()) {
                alinha.setText("Não");
                sina.setAlinha(alinha.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                alinha.setText("Sim");
                sina.setAlinha(alinha.getText().toString());
            }
            if (egaiolada.isChecked()) {
                egaiolada.setText("Não");
                sina.setEgaiolada(egaiolada.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                egaiolada.setText("Sim");
                sina.setEgaiolada(egaiolada.getText().toString());
            }

            sina.setObservacoes(obs.getText().toString());

            long id = dao.inserir(sina);
            Toast.makeText(this, "usina inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //startActivity(intent);

        }
    }




    public void sincronizar(View view){

        Usina sina = new Usina(
                nomeEquipamento.getText().toString(),
                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                horiInicial.getText().toString(),
                horiFinal.getText().toString(),
                paradaInicial1.getText().toString(),
                paradaFinal1.getText().toString(),
                descricao1.getSelectedItem().toString(),
                paradaInicial2.getText().toString(),
                paradaFinal2.getText().toString(),
                descricao2.getSelectedItem().toString(),
                paradaInicial3.getText().toString(),
                paradaFinal3.getText().toString(),
                descricao3.getSelectedItem().toString(),
                paradaInicial4.getText().toString(),
                paradaFinal4.getText().toString(),
                descricao4.getSelectedItem().toString(),
                paradaInicial5.getText().toString(),
                paradaFinal5.getText().toString(),
                descricao5.getSelectedItem().toString(),
                paradaInicial6.getText().toString(),
                paradaFinal6.getText().toString(),
                descricao6.getSelectedItem().toString(),
                paradaInicial7.getText().toString(),
                paradaFinal7.getText().toString(),
                descricao7.getSelectedItem().toString(),
                paradaInicial8.getText().toString(),
                paradaFinal8.getText().toString(),
                descricao8.getSelectedItem().toString(),
                paradaInicial9.getText().toString(),
                paradaFinal9.getText().toString(),
                descricao9.getSelectedItem().toString(),
                paradaInicial10.getText().toString(),
                paradaFinal10.getText().toString(),
                descricao10.getSelectedItem().toString(),
                mot1.getText().toString(),
                tf1.getText().toString(),
                am1.getText().toString(),
                b01.getText().toString(),
                b11.getText().toString(),
                mot1Soma.getText().toString(),
                mot2.getText().toString(),
                tf2.getText().toString(),
                am2.getText().toString(),
                b02.getText().toString(),
                b12.getText().toString(),
                mot2Soma.getText().toString(),
                mot3.getText().toString(),
                tf3.getText().toString(),
                am3.getText().toString(),
                b03.getText().toString(),
                b13.getText().toString(),
                mot3Soma.getText().toString(),
                mot4.getText().toString(),
                tf4.getText().toString(),
                am4.getText().toString(),
                b04.getText().toString(),
                b14.getText().toString(),
                mot4Soma.getText().toString(),
                mot5.getText().toString(),
                tf5.getText().toString(),
                am5.getText().toString(),
                b05.getText().toString(),
                b15.getText().toString(),
                mot5Soma.getText().toString(),
                mot6.getText().toString(),
                tf6.getText().toString(),
                am6.getText().toString(),
                b06.getText().toString(),
                b16.getText().toString(),
                mot6Soma.getText().toString(),
                bandeja.getText().toString(),
                rolo.getText().toString(),
                rolete.getText().toString(),
                alinha.getText().toString(),
                egaiolada.getText().toString(),
                obs.getText().toString()
        );



        long id = dao2.inserir(sina);
        UsinaService apiService = retrofit.create(UsinaService.class);
        Call<Usina> call = apiService.salvarInfoUsina(sina);

        call.enqueue(new Callback<Usina>() {
            @Override
            public void onResponse(Call<Usina> call, Response<Usina> response) {
                if (response.isSuccessful()) {
                    Usina infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Usina> call, Throwable t) {

            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(UsinaActivity.this);
        View view = LayoutInflater.from(UsinaActivity.this).inflate(R.layout.alert_dialog, null);
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.setView(view);
        builder.show();

    }
}
