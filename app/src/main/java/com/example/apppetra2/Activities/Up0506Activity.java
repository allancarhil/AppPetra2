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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.apppetra2.Classes.Up0506;
import com.example.apppetra2.DAO.Up0506DAO;
import com.example.apppetra2.DAO.Up0506DAOSync;
import com.example.apppetra2.Interfaces.Up0506Service;
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

public class Up0506Activity extends AppCompatActivity {
    private TextView nomeEquipamento;

    public Button btnUp0506Cancelar;
    public Button btnSomaProf;
    private Button btnUp0506Salvar;
    private Button btnUp0506Sincronizar;
    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText horimetroInicial;
    private EditText horimetroFinal;
    private Spinner  turno;
    private Spinner  banco;
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
    private EditText furo1;
    private EditText furo2;
    private EditText furo3;
    private EditText furo4;
    private EditText furo5;
    private EditText furo6;
    private EditText furo7;
    private EditText furo8;
    private EditText furo9;
    private EditText furo10;
    private EditText furo11;
    private EditText furo12;
    private EditText furo13;
    private EditText furo14;
    private EditText furo15;
    private EditText furo16;
    private EditText furo17;
    private EditText furo18;
    private EditText furo19;
    private EditText furo20;
    private EditText furo21;
    private EditText furo22;
    private EditText furo23;
    private EditText furo24;
    private EditText furo25;
    private EditText furo26;
    private EditText furo27;
    private EditText furo28;
    private EditText furo29;
    private EditText furo30;
    private EditText furo31;
    private EditText furo32;
    private EditText furo33;
    private EditText furo34;
    private EditText furo35;
    private EditText furo36;
    private EditText furo37;
    private EditText furo38;
    private EditText furo39;
    private EditText furo40;
    private EditText profundidade1;
    private EditText profundidade2;
    private EditText profundidade3;
    private EditText profundidade4;
    private EditText profundidade5;
    private EditText profundidade6;
    private EditText profundidade7;
    private EditText profundidade8;
    private EditText profundidade9;
    private EditText profundidade10;
    private EditText profundidade11;
    private EditText profundidade12;
    private EditText profundidade13;
    private EditText profundidade14;
    private EditText profundidade15;
    private EditText profundidade16;
    private EditText profundidade17;
    private EditText profundidade18;
    private EditText profundidade19;
    private EditText profundidade20;
    private EditText profundidade21;
    private EditText profundidade22;
    private EditText profundidade23;
    private EditText profundidade24;
    private EditText profundidade25;
    private EditText profundidade26;
    private EditText profundidade27;
    private EditText profundidade28;
    private EditText profundidade29;
    private EditText profundidade30;
    private EditText profundidade31;
    private EditText profundidade32;
    private EditText profundidade33;
    private EditText profundidade34;
    private EditText profundidade35;
    private EditText profundidade36;
    private EditText profundidade37;
    private EditText profundidade38;
    private EditText profundidade39;
    private EditText profundidade40;
    private EditText bit1;
    private EditText bit2;
    private EditText bit3;
    private EditText bit4;
    private EditText bit5;
    private EditText bit6;
    private EditText bit7;
    private EditText bit8;
    private EditText bit9;
    private EditText bit10;
    private EditText bit11;
    private EditText bit12;
    private EditText bit13;
    private EditText bit14;
    private EditText bit15;
    private EditText bit16;
    private EditText bit17;
    private EditText bit18;
    private EditText bit19;
    private EditText bit20;
    private EditText bit21;
    private EditText bit22;
    private EditText bit23;
    private EditText bit24;
    private EditText bit25;
    private EditText bit26;
    private EditText bit27;
    private EditText bit28;
    private EditText bit29;
    private EditText bit30;
    private EditText bit31;
    private EditText bit32;
    private EditText bit33;
    private EditText bit34;
    private EditText bit35;
    private EditText bit36;
    private EditText bit37;
    private EditText bit38;
    private EditText bit39;
    private EditText bit40;
    private EditText somaprofundidade;
    private CheckBox lanternagem;
    private CheckBox h2o;
    private CheckBox oleo;
    private EditText observacoes;
    private Up0506DAO dao;
    private Up0506DAOSync dao2;
    private Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up0506);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUp0506Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        data = findViewById(R.id.txtUp0506Data);
        horaInicial = findViewById(R.id.txtUp0506HI);
        horaFinal = findViewById(R.id.txtUp0506HF);
        horimetroInicial = findViewById(R.id.txtUp0506HoriI);
        horimetroFinal = findViewById(R.id.txtUp0506HoriF);
        turno=findViewById(R.id.spUp0506Turno);
        banco=findViewById(R.id.spUp0506Banco);
        paradaInicial1 = findViewById(R.id.txtPEUp0506HI1);
        paradaFinal1 = findViewById(R.id.txtPEUp0506HF1);
        descricao1 = findViewById(R.id.spPEUp0506Desc1);
        paradaInicial2 = findViewById(R.id.txtPEUp0506HI2);
        paradaFinal2 = findViewById(R.id.txtPEUp0506HF2);
        descricao2 = findViewById(R.id.spPEUp0506Desc2);
        paradaInicial3 = findViewById(R.id.txtPEUp0506HI3);
        paradaFinal3 = findViewById(R.id.txtPEUp0506HF3);
        descricao3 = findViewById(R.id.spPEUp0506Desc3);
        paradaInicial4 = findViewById(R.id.txtPEUp0506HI4);
        paradaFinal4 = findViewById(R.id.txtPEUp0506HF4);
        descricao4 = findViewById(R.id.spPEUp0506Desc4);
        paradaInicial5 = findViewById(R.id.txtPEUp0506HI5);
        paradaFinal5 = findViewById(R.id.txtPEUp0506HF5);
        descricao5 = findViewById(R.id.spPEUp0506Desc5);
        paradaInicial6 = findViewById(R.id.txtPEUp0506HI6);
        paradaFinal6 = findViewById(R.id.txtPEUp0506HF6);
        descricao6 = findViewById(R.id.spPEUp0506Desc6);
        paradaInicial7 = findViewById(R.id.txtPEUp0506HI7);
        paradaFinal7 = findViewById(R.id.txtPEUp0506HF7);
        descricao7 = findViewById(R.id.spPEUp0506Desc7);
        paradaInicial8 = findViewById(R.id.txtPEUp0506HI8);
        paradaFinal8 = findViewById(R.id.txtPEUp0506HF8);
        descricao8 = findViewById(R.id.spPEUp0506Desc8);
        paradaInicial9 = findViewById(R.id.txtPEUp0506HI9);
        paradaFinal9 = findViewById(R.id.txtPEUp0506HF9);
        descricao9 = findViewById(R.id.spPEUp0506Desc9);
        paradaInicial10 = findViewById(R.id.txtPEUp0506HI10);
        paradaFinal10 = findViewById(R.id.txtPEUp0506HF10);
        descricao10 = findViewById(R.id.spPEUp0506Desc10);
        furo1=findViewById(R.id.txtUp0506Furo1);
        furo2=findViewById(R.id.txtUp0506Furo2);
        furo3=findViewById(R.id.txtUp0506Furo3);
        furo4=findViewById(R.id.txtUp0506Furo4);
        furo5=findViewById(R.id.txtUp0506Furo5);
        furo6=findViewById(R.id.txtUp0506Furo6);
        furo7=findViewById(R.id.txtUp0506Furo7);
        furo8=findViewById(R.id.txtUp0506Furo8);
        furo9=findViewById(R.id.txtUp0506Furo9);
        furo10=findViewById(R.id.txtUp0506Furo10);
        furo11=findViewById(R.id.txtUp0506Furo11);
        furo12=findViewById(R.id.txtUp0506Furo12);
        furo13=findViewById(R.id.txtUp0506Furo13);
        furo14=findViewById(R.id.txtUp0506Furo14);
        furo15=findViewById(R.id.txtUp0506Furo15);
        furo16=findViewById(R.id.txtUp0506Furo16);
        furo17=findViewById(R.id.txtUp0506Furo17);
        furo18=findViewById(R.id.txtUp0506Furo18);
        furo19=findViewById(R.id.txtUp0506Furo19);
        furo20=findViewById(R.id.txtUp0506Furo20);
        furo21=findViewById(R.id.txtUp0506Furo21);
        furo22=findViewById(R.id.txtUp0506Furo22);
        furo23=findViewById(R.id.txtUp0506Furo23);
        furo24=findViewById(R.id.txtUp0506Furo24);
        furo25=findViewById(R.id.txtUp0506Furo25);
        furo26=findViewById(R.id.txtUp0506Furo26);
        furo27=findViewById(R.id.txtUp0506Furo27);
        furo28=findViewById(R.id.txtUp0506Furo28);
        furo29=findViewById(R.id.txtUp0506Furo29);
        furo30=findViewById(R.id.txtUp0506Furo30);
        furo31=findViewById(R.id.txtUp0506Furo31);
        furo32=findViewById(R.id.txtUp0506Furo32);
        furo33=findViewById(R.id.txtUp0506Furo33);
        furo34=findViewById(R.id.txtUp0506Furo34);
        furo35=findViewById(R.id.txtUp0506Furo35);
        furo36=findViewById(R.id.txtUp0506Furo36);
        furo37=findViewById(R.id.txtUp0506Furo37);
        furo38=findViewById(R.id.txtUp0506Furo38);
        furo39=findViewById(R.id.txtUp0506Furo39);
        furo40=findViewById(R.id.txtUp0506Furo40);
        profundidade1=findViewById(R.id.txtUp0506Prof1);
        profundidade2=findViewById(R.id.txtUp0506Prof2);
        profundidade3=findViewById(R.id.txtUp0506Prof3);
        profundidade4=findViewById(R.id.txtUp0506Prof4);
        profundidade5=findViewById(R.id.txtUp0506Prof5);
        profundidade6=findViewById(R.id.txtUp0506Prof6);
        profundidade7=findViewById(R.id.txtUp0506Prof7);
        profundidade8=findViewById(R.id.txtUp0506Prof8);
        profundidade9=findViewById(R.id.txtUp0506Prof9);
        profundidade10=findViewById(R.id.txtUp0506Prof10);
        profundidade11=findViewById(R.id.txtUp0506Prof11);
        profundidade12=findViewById(R.id.txtUp0506Prof12);
        profundidade13=findViewById(R.id.txtUp0506Prof13);
        profundidade14=findViewById(R.id.txtUp0506Prof14);
        profundidade15=findViewById(R.id.txtUp0506Prof15);
        profundidade16=findViewById(R.id.txtUp0506Prof16);
        profundidade17=findViewById(R.id.txtUp0506Prof17);
        profundidade18=findViewById(R.id.txtUp0506Prof18);
        profundidade19=findViewById(R.id.txtUp0506Prof19);
        profundidade20=findViewById(R.id.txtUp0506Prof20);
        profundidade21=findViewById(R.id.txtUp0506Prof21);
        profundidade22=findViewById(R.id.txtUp0506Prof22);
        profundidade23=findViewById(R.id.txtUp0506Prof23);
        profundidade24=findViewById(R.id.txtUp0506Prof24);
        profundidade25=findViewById(R.id.txtUp0506Prof25);
        profundidade26=findViewById(R.id.txtUp0506Prof26);
        profundidade27=findViewById(R.id.txtUp0506Prof27);
        profundidade28=findViewById(R.id.txtUp0506Prof28);
        profundidade29=findViewById(R.id.txtUp0506Prof29);
        profundidade30=findViewById(R.id.txtUp0506Prof30);
        profundidade31=findViewById(R.id.txtUp0506Prof31);
        profundidade32=findViewById(R.id.txtUp0506Prof32);
        profundidade33=findViewById(R.id.txtUp0506Prof33);
        profundidade34=findViewById(R.id.txtUp0506Prof34);
        profundidade35=findViewById(R.id.txtUp0506Prof35);
        profundidade36=findViewById(R.id.txtUp0506Prof36);
        profundidade37=findViewById(R.id.txtUp0506Prof37);
        profundidade38=findViewById(R.id.txtUp0506Prof38);
        profundidade39=findViewById(R.id.txtUp0506Prof39);
        profundidade40=findViewById(R.id.txtUp0506Prof40);
        bit1=findViewById(R.id.txtUp0506Bit1);
        bit2=findViewById(R.id.txtUp0506Bit2);
        bit3=findViewById(R.id.txtUp0506Bit3);
        bit4=findViewById(R.id.txtUp0506Bit4);
        bit5=findViewById(R.id.txtUp0506Bit5);
        bit6=findViewById(R.id.txtUp0506Bit6);
        bit7=findViewById(R.id.txtUp0506Bit7);
        bit8=findViewById(R.id.txtUp0506Bit8);
        bit9=findViewById(R.id.txtUp0506Bit9);
        bit10=findViewById(R.id.txtUp0506Bit10);
        bit11=findViewById(R.id.txtUp0506Bit11);
        bit12=findViewById(R.id.txtUp0506Bit12);
        bit13=findViewById(R.id.txtUp0506Bit13);
        bit14=findViewById(R.id.txtUp0506Bit14);
        bit15=findViewById(R.id.txtUp0506Bit15);
        bit16=findViewById(R.id.txtUp0506Bit16);
        bit17=findViewById(R.id.txtUp0506Bit17);
        bit18=findViewById(R.id.txtUp0506Bit18);
        bit19=findViewById(R.id.txtUp0506Bit19);
        bit20=findViewById(R.id.txtUp0506Bit20);
        bit21=findViewById(R.id.txtUp0506Bit21);
        bit22=findViewById(R.id.txtUp0506Bit22);
        bit23=findViewById(R.id.txtUp0506Bit23);
        bit24=findViewById(R.id.txtUp0506Bit24);
        bit25=findViewById(R.id.txtUp0506Bit25);
        bit26=findViewById(R.id.txtUp0506Bit26);
        bit27=findViewById(R.id.txtUp0506Bit27);
        bit28=findViewById(R.id.txtUp0506Bit28);
        bit29=findViewById(R.id.txtUp0506Bit29);
        bit30=findViewById(R.id.txtUp0506Bit30);
        bit31=findViewById(R.id.txtUp0506Bit31);
        bit32=findViewById(R.id.txtUp0506Bit32);
        bit33=findViewById(R.id.txtUp0506Bit33);
        bit34=findViewById(R.id.txtUp0506Bit34);
        bit35=findViewById(R.id.txtUp0506Bit35);
        bit36=findViewById(R.id.txtUp0506Bit36);
        bit37=findViewById(R.id.txtUp0506Bit37);
        bit38=findViewById(R.id.txtUp0506Bit38);
        bit39=findViewById(R.id.txtUp0506Bit39);
        bit40=findViewById(R.id.txtUp0506Bit40);
        somaprofundidade=findViewById(R.id.txtUp0506SomaProf);  
        lanternagem = findViewById(R.id.chkUp0506Lant);
        h2o = findViewById(R.id.chkUp0506h2o);
        oleo = findViewById(R.id.chkUp0506oleo);
        observacoes=findViewById(R.id.txtUp0506Obs);
        dao = new Up0506DAO(this);
        dao2 = new Up0506DAOSync(this);
        btnUp0506Salvar=findViewById(R.id.btnUp0506Save);
        btnUp0506Sincronizar=findViewById(R.id.btnUp0506Sincronizar);
        btnUp0506Sincronizar.setVisibility(View.INVISIBLE);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUp0507);




        TextView horaI = (TextView) findViewById(R.id.txtUp0506HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);



        TextView data = (TextView) findViewById(R.id.txtUp0506Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);

        Spinner spPEUp0506Desc1 = findViewById(R.id.spPEUp0506Desc1);
        ArrayAdapter<CharSequence> adapterDesc = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc1.setAdapter(adapterDesc);


        Spinner spPEUp0506Desc2 = findViewById(R.id.spPEUp0506Desc2);
        ArrayAdapter<CharSequence> adapterDesc2 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc2.setAdapter(adapterDesc2);


        Spinner spPEUp0506Desc3 = findViewById(R.id.spPEUp0506Desc3);
        ArrayAdapter<CharSequence> adapterDesc3 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc3.setAdapter(adapterDesc3);


        Spinner spPEUp0506Desc4 = findViewById(R.id.spPEUp0506Desc4);
        ArrayAdapter<CharSequence> adapterDesc4 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc4.setAdapter(adapterDesc4);


        Spinner spPEUp0506Desc5 = findViewById(R.id.spPEUp0506Desc5);
        ArrayAdapter<CharSequence> adapterDesc5 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc5.setAdapter(adapterDesc5);


        Spinner spPEUp0506Desc6 = findViewById(R.id.spPEUp0506Desc6);
        ArrayAdapter<CharSequence> adapterDesc6 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc6.setAdapter(adapterDesc6);


        Spinner spPEUp0506Desc7 = findViewById(R.id.spPEUp0506Desc7);
        ArrayAdapter<CharSequence> adapterDesc7 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc7.setAdapter(adapterDesc7);


        Spinner spPEUp0506Desc8 = findViewById(R.id.spPEUp0506Desc8);
        ArrayAdapter<CharSequence> adapterDesc8 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc8.setAdapter(adapterDesc8);


        Spinner spPEUp0506Desc9 = findViewById(R.id.spPEUp0506Desc9);
        ArrayAdapter<CharSequence> adapterDesc9 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc9.setAdapter(adapterDesc9);


        Spinner spPEUp0506Desc10 = findViewById(R.id.spPEUp0506Desc10);
        ArrayAdapter<CharSequence> adapterDesc10 = ArrayAdapter.createFromResource(this, R.array.descricaoUp0507, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUp0506Desc10.setAdapter(adapterDesc10);

        Spinner spUp0506Banco = findViewById(R.id.spUp0506Banco);
        ArrayAdapter<CharSequence> adapterBanco = ArrayAdapter.createFromResource(this, R.array.banco, android.R.layout.simple_spinner_item);
        adapterBanco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spUp0506Banco.setAdapter(adapterBanco);

        final Spinner spUp0506Turno = findViewById(R.id.spUp0506Turno);
        ArrayAdapter<CharSequence> adapterTurno = ArrayAdapter.createFromResource(this, R.array.turno, android.R.layout.simple_spinner_item);
        adapterTurno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spUp0506Turno.setAdapter(adapterTurno);


        spUp0506Turno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                TextView txtUp0506Checktitle =findViewById(R.id.txtUp0506Checktitle);
                txtUp0506Checktitle.setText(spUp0506Turno.getSelectedItem().toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btnUp0506Cancelar= findViewById(R.id.btnUp0506Cancel);
        btnUp0506Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Up0506Activity.this);
                View view= LayoutInflater.from(Up0506Activity.this).inflate(R.layout.alert_dialog,null);
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



        btnSomaProf=findViewById(R.id.btnSomaProf);
        btnSomaProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somaProf();
            }
        });


        //===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUp0506HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUp0506HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUp0506HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUp0506HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUp0506HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUp0506HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUp0506HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUp0506HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUp0506HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUp0506HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUp0506HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUp0506HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUp0506HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUp0506HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUp0506HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUp0506HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUp0506HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUp0506HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUp0506HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUp0506HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Up0506Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });




        btnUp0506Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Up0506Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Up0506Activity.this);
                    View view = LayoutInflater.from(Up0506Activity.this).inflate(R.layout.sinc_dialog, null);
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
        CharSequence str = horimetroFinal.getText().toString();
        return TextUtils.isEmpty(str);
    }

    public void somaProf(){
        final TextView txtSomaProfundidade = findViewById(R.id.txtUp0506SomaProf);
        TextView p01 = findViewById(R.id.txtUp0506Prof1);
        TextView p02 = findViewById(R.id.txtUp0506Prof2);
        TextView p03 = findViewById(R.id.txtUp0506Prof3);
        TextView p04 = findViewById(R.id.txtUp0506Prof4);
        TextView p05 = findViewById(R.id.txtUp0506Prof5);
        TextView p06 = findViewById(R.id.txtUp0506Prof6);
        TextView p07 = findViewById(R.id.txtUp0506Prof7);
        TextView p08 = findViewById(R.id.txtUp0506Prof8);
        TextView p09 = findViewById(R.id.txtUp0506Prof9);
        TextView p10 = findViewById(R.id.txtUp0506Prof10);
        TextView p11 = findViewById(R.id.txtUp0506Prof11);
        TextView p12 = findViewById(R.id.txtUp0506Prof12);
        TextView p13 = findViewById(R.id.txtUp0506Prof13);
        TextView p14 = findViewById(R.id.txtUp0506Prof14);
        TextView p15 = findViewById(R.id.txtUp0506Prof15);
        TextView p16 = findViewById(R.id.txtUp0506Prof16);
        TextView p17 = findViewById(R.id.txtUp0506Prof17);
        TextView p18 = findViewById(R.id.txtUp0506Prof18);
        TextView p19 = findViewById(R.id.txtUp0506Prof19);
        TextView p20 = findViewById(R.id.txtUp0506Prof20);
        TextView p21 = findViewById(R.id.txtUp0506Prof21);
        TextView p22 = findViewById(R.id.txtUp0506Prof22);
        TextView p23 = findViewById(R.id.txtUp0506Prof23);
        TextView p24 = findViewById(R.id.txtUp0506Prof24);
        TextView p25 = findViewById(R.id.txtUp0506Prof25);
        TextView p26 = findViewById(R.id.txtUp0506Prof26);
        TextView p27 = findViewById(R.id.txtUp0506Prof27);
        TextView p28 = findViewById(R.id.txtUp0506Prof28);
        TextView p29 = findViewById(R.id.txtUp0506Prof29);
        TextView p30 = findViewById(R.id.txtUp0506Prof30);
        TextView p31 = findViewById(R.id.txtUp0506Prof31);
        TextView p32 = findViewById(R.id.txtUp0506Prof32);
        TextView p33 = findViewById(R.id.txtUp0506Prof33);
        TextView p34 = findViewById(R.id.txtUp0506Prof34);
        TextView p35 = findViewById(R.id.txtUp0506Prof35);
        TextView p36 = findViewById(R.id.txtUp0506Prof36);
        TextView p37 = findViewById(R.id.txtUp0506Prof37);
        TextView p38 = findViewById(R.id.txtUp0506Prof38);
        TextView p39 = findViewById(R.id.txtUp0506Prof39);
        TextView p40 = findViewById(R.id.txtUp0506Prof40);

        float p001 = Float.parseFloat(p01.getText().toString());
        float p002 = Float.parseFloat(p02.getText().toString());
        float p003 = Float.parseFloat(p03.getText().toString());
        float p004 = Float.parseFloat(p04.getText().toString());
        float p005 = Float.parseFloat(p05.getText().toString());
        float p006 = Float.parseFloat(p06.getText().toString());
        float p007 = Float.parseFloat(p07.getText().toString());
        float p008 = Float.parseFloat(p08.getText().toString());
        float p009 = Float.parseFloat(p09.getText().toString());
        float p0010 = Float.parseFloat(p10.getText().toString());
        float p0011 = Float.parseFloat(p11.getText().toString());
        float p0012 = Float.parseFloat(p12.getText().toString());
        float p0013 = Float.parseFloat(p13.getText().toString());
        float p0014 = Float.parseFloat(p14.getText().toString());
        float p0015= Float.parseFloat(p15.getText().toString());
        float p0016 = Float.parseFloat(p16.getText().toString());
        float p0017 = Float.parseFloat(p17.getText().toString());
        float p0018 = Float.parseFloat(p18.getText().toString());
        float p0019 = Float.parseFloat(p19.getText().toString());
        float p0020 = Float.parseFloat(p20.getText().toString());
        float p0021 = Float.parseFloat(p21.getText().toString());
        float p0022 = Float.parseFloat(p22.getText().toString());
        float p0023 = Float.parseFloat(p23.getText().toString());
        float p0024 = Float.parseFloat(p24.getText().toString());
        float p0025 = Float.parseFloat(p25.getText().toString());
        float p0026 = Float.parseFloat(p26.getText().toString());
        float p0027 = Float.parseFloat(p27.getText().toString());
        float p0028 = Float.parseFloat(p28.getText().toString());
        float p0029 = Float.parseFloat(p29.getText().toString());
        float p0030 = Float.parseFloat(p30.getText().toString());
        float p0031 = Float.parseFloat(p31.getText().toString());
        float p0032 = Float.parseFloat(p32.getText().toString());
        float p0033 = Float.parseFloat(p33.getText().toString());
        float p0034 = Float.parseFloat(p34.getText().toString());
        float p0035 = Float.parseFloat(p35.getText().toString());
        float p0036 = Float.parseFloat(p36.getText().toString());
        float p0037 = Float.parseFloat(p37.getText().toString());
        float p0038 = Float.parseFloat(p38.getText().toString());
        float p0039 = Float.parseFloat(p39.getText().toString());
        float p0040 = Float.parseFloat(p40.getText().toString());
        
        
        
        
        float somaProfn = p001 + p002 + p003 + p004 + p005 + p006 + p007 + p008 + p009 + p0010 + p0011 + p0012 + p0013 + p0014 + p0015 + p0016 + p0017 + p0018 + p0019 + p0020 + p0021 + p0022 + p0023 + p0024 + p0025 + p0026 + p0027 + p0028 + p0029 + p0030 + p0031 + p0032 + p0033 + p0034 + p0035 + p0036 + p0037 + p0038 + p0039 + p0040;
        String somaprof = Float.toString(somaProfn);
        txtSomaProfundidade.setText(somaprof);
    }



    public void salvar(View view) {

        if(isEmpty(horimetroFinal)||horimetroFinal.getText().toString().trim().length()==0){
            horimetroFinal.setError("CAMPO OBRIGATÓRIO");
            horimetroFinal.requestFocus();
        }
        else {
            btnUp0506Salvar.setVisibility(View.INVISIBLE);
            btnUp0506Sincronizar.setVisibility(View.VISIBLE);
            Up0506 p0506 = new Up0506(
                    nomeEquipamento.getText().toString(),

                    motorista.getText().toString(),
             data.getText().toString(),
             horaInicial.getText().toString(),
             horaFinal.getText().toString(),
             horimetroInicial.getText().toString(),
             horimetroFinal.getText().toString(),
              turno.getSelectedItem().toString(),
              banco.getSelectedItem().toString(),
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
             furo1.getText().toString(),
             furo2.getText().toString(),
             furo3.getText().toString(),
             furo4.getText().toString(),
             furo5.getText().toString(),
             furo6.getText().toString(),
             furo7.getText().toString(),
             furo8.getText().toString(),
             furo9.getText().toString(),
             furo10.getText().toString(),
             furo11.getText().toString(),
             furo12.getText().toString(),
             furo13.getText().toString(),
             furo14.getText().toString(),
             furo15.getText().toString(),
             furo16.getText().toString(),
             furo17.getText().toString(),
             furo18.getText().toString(),
             furo19.getText().toString(),
             furo20.getText().toString(),
             furo21.getText().toString(),
             furo22.getText().toString(),
             furo23.getText().toString(),
             furo24.getText().toString(),
             furo25.getText().toString(),
             furo26.getText().toString(),
             furo27.getText().toString(),
             furo28.getText().toString(),
             furo29.getText().toString(),
             furo30.getText().toString(),
             furo31.getText().toString(),
             furo32.getText().toString(),
             furo33.getText().toString(),
             furo34.getText().toString(),
             furo35.getText().toString(),
             furo36.getText().toString(),
             furo37.getText().toString(),
             furo38.getText().toString(),
             furo39.getText().toString(),
             furo40.getText().toString(),
             profundidade1.getText().toString(),
             profundidade2.getText().toString(),
             profundidade3.getText().toString(),
             profundidade4.getText().toString(),
             profundidade5.getText().toString(),
             profundidade6.getText().toString(),
             profundidade7.getText().toString(),
             profundidade8.getText().toString(),
             profundidade9.getText().toString(),
             profundidade10.getText().toString(),
             profundidade11.getText().toString(),
             profundidade12.getText().toString(),
             profundidade13.getText().toString(),
             profundidade14.getText().toString(),
             profundidade15.getText().toString(),
             profundidade16.getText().toString(),
             profundidade17.getText().toString(),
             profundidade18.getText().toString(),
             profundidade19.getText().toString(),
             profundidade20.getText().toString(),
             profundidade21.getText().toString(),
             profundidade22.getText().toString(),
             profundidade23.getText().toString(),
             profundidade24.getText().toString(),
             profundidade25.getText().toString(),
             profundidade26.getText().toString(),
             profundidade27.getText().toString(),
             profundidade28.getText().toString(),
             profundidade29.getText().toString(),
             profundidade30.getText().toString(),
             profundidade31.getText().toString(),
             profundidade32.getText().toString(),
             profundidade33.getText().toString(),
             profundidade34.getText().toString(),
             profundidade35.getText().toString(),
             profundidade36.getText().toString(),
             profundidade37.getText().toString(),
             profundidade38.getText().toString(),
             profundidade39.getText().toString(),
             profundidade40.getText().toString(),
             bit1.getText().toString(),
             bit2.getText().toString(),
             bit3.getText().toString(),
             bit4.getText().toString(),
             bit5.getText().toString(),
             bit6.getText().toString(),
             bit7.getText().toString(),
             bit8.getText().toString(),
             bit9.getText().toString(),
             bit10.getText().toString(),
             bit11.getText().toString(),
             bit12.getText().toString(),
             bit13.getText().toString(),
             bit14.getText().toString(),
             bit15.getText().toString(),
             bit16.getText().toString(),
             bit17.getText().toString(),
             bit18.getText().toString(),
             bit19.getText().toString(),
             bit20.getText().toString(),
             bit21.getText().toString(),
             bit22.getText().toString(),
             bit23.getText().toString(),
             bit24.getText().toString(),
             bit25.getText().toString(),
             bit26.getText().toString(),
             bit27.getText().toString(),
             bit28.getText().toString(),
             bit29.getText().toString(),
             bit30.getText().toString(),
             bit31.getText().toString(),
             bit32.getText().toString(),
             bit33.getText().toString(),
             bit34.getText().toString(),
             bit35.getText().toString(),
             bit36.getText().toString(),
             bit37.getText().toString(),
             bit38.getText().toString(),
             bit39.getText().toString(),
             bit40.getText().toString(),
             somaprofundidade.getText().toString(),
             lanternagem.getText().toString(),
             h2o.getText().toString(),
             oleo.getText().toString(),
             observacoes.getText().toString()
            );
            p0506.setTurno(turno.getSelectedItem().toString());
            p0506.setMotorista(motorista.getText().toString());
            p0506.setData(data.getText().toString());
            p0506.setHoraInicial(horaInicial.getText().toString());

            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            p0506.setHoraFinal(horaFinal.getText().toString());
            p0506.setNomeEquipamento(nomeEquipamento.getText().toString());
            p0506.setHorimetroInicial(horimetroInicial.getText().toString());
            p0506.setHorimetroFinal(horimetroFinal.getText().toString());
            p0506.setBanco(banco.getSelectedItem().toString());
            p0506.setParadaInicial1(paradaInicial1.getText().toString());
            p0506.setParadaFinal1(paradaFinal1.getText().toString());
            p0506.setDescricao1(descricao1.getSelectedItem().toString());
            p0506.setDescricao1(descricao1.getSelectedItem().toString());
            p0506.setParadaInicial2(paradaInicial2.getText().toString());
            p0506.setParadaFinal2(paradaFinal2.getText().toString());
            p0506.setDescricao2(descricao2.getSelectedItem().toString());
            p0506.setParadaInicial3(paradaInicial3.getText().toString());
            p0506.setParadaFinal3(paradaFinal3.getText().toString());
            p0506.setDescricao3(descricao3.getSelectedItem().toString());
            p0506.setParadaInicial4(paradaInicial4.getText().toString());
            p0506.setParadaFinal4(paradaFinal4.getText().toString());
            p0506.setDescricao4(descricao4.getSelectedItem().toString());
            p0506.setParadaInicial5(paradaInicial5.getText().toString());
            p0506.setParadaFinal5(paradaFinal5.getText().toString());
            p0506.setDescricao5(descricao5.getSelectedItem().toString());
            p0506.setParadaInicial6(paradaInicial6.getText().toString());
            p0506.setParadaFinal6(paradaFinal6.getText().toString());
            p0506.setDescricao6(descricao6.getSelectedItem().toString());
            p0506.setParadaInicial7(paradaInicial7.getText().toString());
            p0506.setParadaFinal7(paradaFinal7.getText().toString());
            p0506.setDescricao7(descricao7.getSelectedItem().toString());
            p0506.setParadaInicial8(paradaInicial8.getText().toString());
            p0506.setParadaFinal8(paradaFinal8.getText().toString());
            p0506.setDescricao8(descricao8.getSelectedItem().toString());
            p0506.setParadaInicial9(paradaInicial9.getText().toString());
            p0506.setParadaFinal9(paradaFinal9.getText().toString());
            p0506.setDescricao9(descricao9.getSelectedItem().toString());
            p0506.setParadaInicial10(paradaInicial10.getText().toString());
            p0506.setParadaFinal10(paradaFinal10.getText().toString());
            p0506.setDescricao10(descricao10.getSelectedItem().toString());
            p0506.setFuro1(furo1.getText().toString());
            p0506.setFuro2(furo2.getText().toString());
            p0506.setFuro3(furo3.getText().toString());
            p0506.setFuro4(furo4.getText().toString());
            p0506.setFuro5(furo5.getText().toString());
            p0506.setFuro6(furo6.getText().toString());
            p0506.setFuro7(furo7.getText().toString());
            p0506.setFuro8(furo8.getText().toString());
            p0506.setFuro9(furo9.getText().toString());
            p0506.setFuro10(furo10.getText().toString());
            p0506.setFuro11(furo11.getText().toString());
            p0506.setFuro12(furo12.getText().toString());
            p0506.setFuro13(furo13.getText().toString());
            p0506.setFuro14(furo14.getText().toString());
            p0506.setFuro15(furo15.getText().toString());
            p0506.setFuro16(furo16.getText().toString());
            p0506.setFuro17(furo17.getText().toString());
            p0506.setFuro18(furo18.getText().toString());
            p0506.setFuro19(furo19.getText().toString());
            p0506.setFuro20(furo20.getText().toString());
            p0506.setFuro21(furo21.getText().toString());
            p0506.setFuro22(furo22.getText().toString());
            p0506.setFuro23(furo23.getText().toString());
            p0506.setFuro24(furo24.getText().toString());
            p0506.setFuro25(furo25.getText().toString());
            p0506.setFuro26(furo26.getText().toString());
            p0506.setFuro27(furo27.getText().toString());
            p0506.setFuro28(furo28.getText().toString());
            p0506.setFuro29(furo29.getText().toString());
            p0506.setFuro30(furo30.getText().toString());
            p0506.setFuro31(furo31.getText().toString());
            p0506.setFuro32(furo32.getText().toString());
            p0506.setFuro33(furo33.getText().toString());
            p0506.setFuro34(furo34.getText().toString());
            p0506.setFuro35(furo35.getText().toString());
            p0506.setFuro36(furo36.getText().toString());
            p0506.setFuro37(furo37.getText().toString());
            p0506.setFuro38(furo38.getText().toString());
            p0506.setFuro39(furo39.getText().toString());
            p0506.setFuro40(furo40.getText().toString());
            p0506.setProfundidade1(profundidade1.getText().toString());
            p0506.setProfundidade2(profundidade2.getText().toString());
            p0506.setProfundidade3(profundidade3.getText().toString());
            p0506.setProfundidade4(profundidade4.getText().toString());
            p0506.setProfundidade5(profundidade5.getText().toString());
            p0506.setProfundidade6(profundidade6.getText().toString());
            p0506.setProfundidade7(profundidade7.getText().toString());
            p0506.setProfundidade8(profundidade8.getText().toString());
            p0506.setProfundidade9(profundidade9.getText().toString());
            p0506.setProfundidade10(profundidade10.getText().toString());
            p0506.setProfundidade11(profundidade11.getText().toString());
            p0506.setProfundidade12(profundidade12.getText().toString());
            p0506.setProfundidade13(profundidade13.getText().toString());
            p0506.setProfundidade14(profundidade14.getText().toString());
            p0506.setProfundidade15(profundidade15.getText().toString());
            p0506.setProfundidade16(profundidade16.getText().toString());
            p0506.setProfundidade17(profundidade17.getText().toString());
            p0506.setProfundidade18(profundidade18.getText().toString());
            p0506.setProfundidade19(profundidade19.getText().toString());
            p0506.setProfundidade20(profundidade20.getText().toString());
            p0506.setProfundidade21(profundidade21.getText().toString());
            p0506.setProfundidade22(profundidade22.getText().toString());
            p0506.setProfundidade23(profundidade23.getText().toString());
            p0506.setProfundidade24(profundidade24.getText().toString());
            p0506.setProfundidade25(profundidade25.getText().toString());
            p0506.setProfundidade26(profundidade26.getText().toString());
            p0506.setProfundidade27(profundidade27.getText().toString());
            p0506.setProfundidade28(profundidade28.getText().toString());
            p0506.setProfundidade29(profundidade29.getText().toString());
            p0506.setProfundidade30(profundidade30.getText().toString());
            p0506.setProfundidade31(profundidade31.getText().toString());
            p0506.setProfundidade32(profundidade32.getText().toString());
            p0506.setProfundidade33(profundidade33.getText().toString());
            p0506.setProfundidade34(profundidade34.getText().toString());
            p0506.setProfundidade35(profundidade35.getText().toString());
            p0506.setProfundidade36(profundidade36.getText().toString());
            p0506.setProfundidade37(profundidade37.getText().toString());
            p0506.setProfundidade38(profundidade38.getText().toString());
            p0506.setProfundidade39(profundidade39.getText().toString());
            p0506.setProfundidade40(profundidade40.getText().toString());
            p0506.setBit1(bit1.getText().toString());
            p0506.setBit2(bit2.getText().toString());
            p0506.setBit3(bit3.getText().toString());
            p0506.setBit4(bit4.getText().toString());
            p0506.setBit5(bit5.getText().toString());
            p0506.setBit6(bit6.getText().toString());
            p0506.setBit7(bit7.getText().toString());
            p0506.setBit8(bit8.getText().toString());
            p0506.setBit9(bit9.getText().toString());
            p0506.setBit10(bit10.getText().toString());
            p0506.setBit11(bit11.getText().toString());
            p0506.setBit12(bit12.getText().toString());
            p0506.setBit13(bit13.getText().toString());
            p0506.setBit14(bit14.getText().toString());
            p0506.setBit15(bit15.getText().toString());
            p0506.setBit16(bit16.getText().toString());
            p0506.setBit17(bit17.getText().toString());
            p0506.setBit18(bit18.getText().toString());
            p0506.setBit19(bit19.getText().toString());
            p0506.setBit20(bit20.getText().toString());
            p0506.setBit21(bit21.getText().toString());
            p0506.setBit22(bit22.getText().toString());
            p0506.setBit23(bit23.getText().toString());
            p0506.setBit24(bit24.getText().toString());
            p0506.setBit25(bit25.getText().toString());
            p0506.setBit26(bit26.getText().toString());
            p0506.setBit27(bit27.getText().toString());
            p0506.setBit28(bit28.getText().toString());
            p0506.setBit29(bit29.getText().toString());
            p0506.setBit30(bit30.getText().toString());
            p0506.setBit31(bit31.getText().toString());
            p0506.setBit32(bit32.getText().toString());
            p0506.setBit33(bit33.getText().toString());
            p0506.setBit34(bit34.getText().toString());
            p0506.setBit35(bit35.getText().toString());
            p0506.setBit36(bit36.getText().toString());
            p0506.setBit37(bit37.getText().toString());
            p0506.setBit38(bit38.getText().toString());
            p0506.setBit39(bit39.getText().toString());
            p0506.setBit40(bit40.getText().toString());
            p0506.setSomaprodundidade(somaprofundidade.getText().toString());

            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                p0506.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                p0506.setLanternagem(lanternagem.getText().toString());
            }

            if (h2o.isChecked()) {
                h2o.setText("Não");
                p0506.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                p0506.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                p0506.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                p0506.setOleo(oleo.getText().toString());
            }
            p0506.setObservacoes(observacoes.getText().toString());
            long id = dao.inserir(p0506);
            Toast.makeText(this, "up0506 inserido com id: " + id, Toast.LENGTH_SHORT).show();


            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //startActivity(intent);


        }

    }


    public void sincronizar(View view){


        Up0506 p0506 = new Up0506(
                nomeEquipamento.getText().toString(),
                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                horimetroInicial.getText().toString(),
                horimetroFinal.getText().toString(),
                turno.getSelectedItem().toString(),
                banco.getSelectedItem().toString(),
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
                furo1.getText().toString(),
                furo2.getText().toString(),
                furo3.getText().toString(),
                furo4.getText().toString(),
                furo5.getText().toString(),
                furo6.getText().toString(),
                furo7.getText().toString(),
                furo8.getText().toString(),
                furo9.getText().toString(),
                furo10.getText().toString(),
                furo11.getText().toString(),
                furo12.getText().toString(),
                furo13.getText().toString(),
                furo14.getText().toString(),
                furo15.getText().toString(),
                furo16.getText().toString(),
                furo17.getText().toString(),
                furo18.getText().toString(),
                furo19.getText().toString(),
                furo20.getText().toString(),
                furo21.getText().toString(),
                furo22.getText().toString(),
                furo23.getText().toString(),
                furo24.getText().toString(),
                furo25.getText().toString(),
                furo26.getText().toString(),
                furo27.getText().toString(),
                furo28.getText().toString(),
                furo29.getText().toString(),
                furo30.getText().toString(),
                furo31.getText().toString(),
                furo32.getText().toString(),
                furo33.getText().toString(),
                furo34.getText().toString(),
                furo35.getText().toString(),
                furo36.getText().toString(),
                furo37.getText().toString(),
                furo38.getText().toString(),
                furo39.getText().toString(),
                furo40.getText().toString(),
                profundidade1.getText().toString(),
                profundidade2.getText().toString(),
                profundidade3.getText().toString(),
                profundidade4.getText().toString(),
                profundidade5.getText().toString(),
                profundidade6.getText().toString(),
                profundidade7.getText().toString(),
                profundidade8.getText().toString(),
                profundidade9.getText().toString(),
                profundidade10.getText().toString(),
                profundidade11.getText().toString(),
                profundidade12.getText().toString(),
                profundidade13.getText().toString(),
                profundidade14.getText().toString(),
                profundidade15.getText().toString(),
                profundidade16.getText().toString(),
                profundidade17.getText().toString(),
                profundidade18.getText().toString(),
                profundidade19.getText().toString(),
                profundidade20.getText().toString(),
                profundidade21.getText().toString(),
                profundidade22.getText().toString(),
                profundidade23.getText().toString(),
                profundidade24.getText().toString(),
                profundidade25.getText().toString(),
                profundidade26.getText().toString(),
                profundidade27.getText().toString(),
                profundidade28.getText().toString(),
                profundidade29.getText().toString(),
                profundidade30.getText().toString(),
                profundidade31.getText().toString(),
                profundidade32.getText().toString(),
                profundidade33.getText().toString(),
                profundidade34.getText().toString(),
                profundidade35.getText().toString(),
                profundidade36.getText().toString(),
                profundidade37.getText().toString(),
                profundidade38.getText().toString(),
                profundidade39.getText().toString(),
                profundidade40.getText().toString(),
                bit1.getText().toString(),
                bit2.getText().toString(),
                bit3.getText().toString(),
                bit4.getText().toString(),
                bit5.getText().toString(),
                bit6.getText().toString(),
                bit7.getText().toString(),
                bit8.getText().toString(),
                bit9.getText().toString(),
                bit10.getText().toString(),
                bit11.getText().toString(),
                bit12.getText().toString(),
                bit13.getText().toString(),
                bit14.getText().toString(),
                bit15.getText().toString(),
                bit16.getText().toString(),
                bit17.getText().toString(),
                bit18.getText().toString(),
                bit19.getText().toString(),
                bit20.getText().toString(),
                bit21.getText().toString(),
                bit22.getText().toString(),
                bit23.getText().toString(),
                bit24.getText().toString(),
                bit25.getText().toString(),
                bit26.getText().toString(),
                bit27.getText().toString(),
                bit28.getText().toString(),
                bit29.getText().toString(),
                bit30.getText().toString(),
                bit31.getText().toString(),
                bit32.getText().toString(),
                bit33.getText().toString(),
                bit34.getText().toString(),
                bit35.getText().toString(),
                bit36.getText().toString(),
                bit37.getText().toString(),
                bit38.getText().toString(),
                bit39.getText().toString(),
                bit40.getText().toString(),
                somaprofundidade.getText().toString(),
                lanternagem.getText().toString(),
                h2o.getText().toString(),
                oleo.getText().toString(),
                observacoes.getText().toString()
        );
        long id = dao2.inserir(p0506);
        Up0506Service apiService = retrofit.create(Up0506Service.class);
        Call<Up0506> call = apiService.salvarInfoUp0506(p0506);

        call.enqueue(new Callback<Up0506>(){
            @Override
            public void onResponse(Call<Up0506> call, Response<Up0506> response) {
                if (response.isSuccessful()){
                    Up0506 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Up0506> call, Throwable t) {

            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Up0506Activity.this);
        View view= LayoutInflater.from(Up0506Activity.this).inflate(R.layout.alert_dialog,null);
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

}

