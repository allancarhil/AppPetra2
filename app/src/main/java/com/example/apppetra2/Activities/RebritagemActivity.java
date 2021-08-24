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

import com.example.apppetra2.Classes.Rebritagem;
import com.example.apppetra2.DAO.RebritagemDAO;
import com.example.apppetra2.DAO.RebritagemDAOSync;
import com.example.apppetra2.Interfaces.RebritagemService;
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

public class RebritagemActivity extends AppCompatActivity {

    int numeroMetalUTC02= 0;
    int numeroEngalUa02= 0;
    int numeroEngalUr01=0;
    int numeroMetalUTC11= 0;
    int numeroEngalUr02= 0;
    int numeroMetalUTC09= 0;


    private Button btnRebSalvar;
    private Button btnRebSincronizar;
    private TextView nomeEquipamento;

    public Button btnRebUTC02Mais;
    public Button btnRebUTC02Menos;
    public Button btnRebUa02Mais;
    public Button btnRebUa02Menos;
    public Button btnRebUTC11Mais;
    public Button btnRebUTC11Menos;
    public Button btnRebUr02Mais;
    public Button btnRebUr02Menos;
    public Button btnRebUTC09Mais;
    public Button btnRebUTC09Menos;
    public Button btnRebUr01Mais;
    public Button btnRebUr01Menos;
    public Button btnRebCandelar;


    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText horimetroInicialUa02;
    private EditText horimetroFinalUa02;
    private EditText horimetroInicialUa03;
    private EditText horimetroFinalUa03;
    private EditText horimetroInicialUa04;
    private EditText horimetroFinalUa04;
    private EditText horimetroInicialS3000;
    private EditText horimetroFinalS3000;
    private EditText horimetroInicialH4000;
    private EditText horimetroFinalH4000;
    private EditText horimetroInicialREMCO;
    private EditText horimetroFinalREMCO;
    private EditText balancaUtc04;
    private EditText balancaUtc05;
    private EditText paradaInicial1Cr1;
    private EditText paradaFinal1Cr1;
    private Spinner equipamento1Cr1;
    private Spinner descricao1Cr1;
    private EditText paradaInicial2Cr1;
    private EditText paradaFinal2Cr1;
    private Spinner equipamento2Cr1;
    private Spinner descricao2Cr1;
    private EditText paradaInicial3Cr1;
    private EditText paradaFinal3Cr1;
    private Spinner equipamento3Cr1;
    private Spinner descricao3Cr1;
    private EditText paradaInicial4Cr1;
    private EditText paradaFinal4Cr1;
    private Spinner equipamento4Cr1;
    private Spinner descricao4Cr1;
    private EditText paradaInicial5Cr1;
    private EditText paradaFinal5Cr1;
    private Spinner equipamento5Cr1;
    private Spinner descricao5Cr1;
    private EditText paradaInicial6Cr1;
    private EditText paradaFinal6Cr1;
    private Spinner equipamento6Cr1;
    private Spinner descricao6Cr1;
    private EditText paradaInicial7Cr1;
    private EditText paradaFinal7Cr1;
    private Spinner equipamento7Cr1;
    private Spinner descricao7Cr1;
    private EditText paradaInicial8Cr1;
    private EditText paradaFinal8Cr1;
    private Spinner equipamento8Cr1;
    private Spinner descricao8Cr1;
    private EditText paradaInicial9Cr1;
    private EditText paradaFinal9Cr1;
    private Spinner equipamento9Cr1;
    private Spinner descricao9Cr1;
    private EditText paradaInicial10Cr1;
    private EditText paradaFinal10Cr1;
    private Spinner equipamento10Cr1;
    private Spinner descricao10Cr1;
    private EditText paradaInicial11Cr1;
    private EditText paradaFinal11Cr1;
    private Spinner equipamento11Cr1;
    private Spinner descricao11Cr1;
    private EditText paradaInicial12Cr1;
    private EditText paradaFinal12Cr1;
    private Spinner equipamento12Cr1;
    private Spinner descricao12Cr1;
    private EditText paradaInicial13Cr1;
    private EditText paradaFinal13Cr1;
    private Spinner equipamento13Cr1;
    private Spinner descricao13Cr1;
    private EditText paradaInicial14Cr1;
    private EditText paradaFinal14Cr1;
    private Spinner equipamento14Cr1;
    private Spinner descricao14Cr1;
    private EditText paradaInicial15Cr1;
    private EditText paradaFinal15Cr1;
    private Spinner equipamento15Cr1;
    private Spinner descricao15Cr1;

    private EditText metalUtc02;
    private EditText engalUa02;
    private EditText engalUr01;

    private EditText paradaInicial1Cr2;
    private EditText paradaFinal1Cr2;
    private Spinner equipamento1Cr2;
    private Spinner descricao1Cr2;
    private EditText paradaInicial2Cr2;
    private EditText paradaFinal2Cr2;
    private Spinner equipamento2Cr2;
    private Spinner descricao2Cr2;
    private EditText paradaInicial3Cr2;
    private EditText paradaFinal3Cr2;
    private Spinner equipamento3Cr2;
    private Spinner descricao3Cr2;
    private EditText paradaInicial4Cr2;
    private EditText paradaFinal4Cr2;
    private Spinner equipamento4Cr2;
    private Spinner descricao4Cr2;
    private EditText paradaInicial5Cr2;
    private EditText paradaFinal5Cr2;
    private Spinner equipamento5Cr2;
    private Spinner descricao5Cr2;
    private EditText paradaInicial6Cr2;
    private EditText paradaFinal6Cr2;
    private Spinner equipamento6Cr2;
    private Spinner descricao6Cr2;
    private EditText paradaInicial7Cr2;
    private EditText paradaFinal7Cr2;
    private Spinner equipamento7Cr2;
    private Spinner descricao7Cr2;
    private EditText paradaInicial8Cr2;
    private EditText paradaFinal8Cr2;
    private Spinner equipamento8Cr2;
    private Spinner descricao8Cr2;
    private EditText paradaInicial9Cr2;
    private EditText paradaFinal9Cr2;
    private Spinner equipamento9Cr2;
    private Spinner descricao9Cr2;
    private EditText paradaInicial10Cr2;
    private EditText paradaFinal10Cr2;
    private Spinner equipamento10Cr2;
    private Spinner descricao10Cr2;
    private EditText paradaInicial11Cr2;
    private EditText paradaFinal11Cr2;
    private Spinner equipamento11Cr2;
    private Spinner descricao11Cr2;
    private EditText paradaInicial12Cr2;
    private EditText paradaFinal12Cr2;
    private Spinner equipamento12Cr2;
    private Spinner descricao12Cr2;
    private EditText paradaInicial13Cr2;
    private EditText paradaFinal13Cr2;
    private Spinner equipamento13Cr2;
    private Spinner descricao13Cr2;
    private EditText paradaInicial14Cr2;
    private EditText paradaFinal14Cr2;
    private Spinner equipamento14Cr2;
    private Spinner descricao14Cr2;
    private EditText paradaInicial15Cr2;
    private EditText paradaFinal15Cr2;
    private Spinner equipamento15Cr2;
    private Spinner descricao15Cr2;

    private EditText metalUtc11;
    private EditText engalUr02;

    private EditText paradaInicial1Cr3;
    private EditText paradaFinal1Cr3;
    private Spinner equipamento1Cr3;
    private Spinner descricao1Cr3;
    private EditText paradaInicial2Cr3;
    private EditText paradaFinal2Cr3;
    private Spinner equipamento2Cr3;
    private Spinner descricao2Cr3;
    private EditText paradaInicial3Cr3;
    private EditText paradaFinal3Cr3;
    private Spinner equipamento3Cr3;
    private Spinner descricao3Cr3;
    private EditText paradaInicial4Cr3;
    private EditText paradaFinal4Cr3;
    private Spinner equipamento4Cr3;
    private Spinner descricao4Cr3;
    private EditText paradaInicial5Cr3;
    private EditText paradaFinal5Cr3;
    private Spinner equipamento5Cr3;
    private Spinner descricao5Cr3;
    private EditText paradaInicial6Cr3;
    private EditText paradaFinal6Cr3;
    private Spinner equipamento6Cr3;
    private Spinner descricao6Cr3;
    private EditText paradaInicial7Cr3;
    private EditText paradaFinal7Cr3;
    private Spinner equipamento7Cr3;
    private Spinner descricao7Cr3;
    private EditText paradaInicial8Cr3;
    private EditText paradaFinal8Cr3;
    private Spinner equipamento8Cr3;
    private Spinner descricao8Cr3;
    private EditText paradaInicial9Cr3;
    private EditText paradaFinal9Cr3;
    private Spinner equipamento9Cr3;
    private Spinner descricao9Cr3;
    private EditText paradaInicial10Cr3;
    private EditText paradaFinal10Cr3;
    private Spinner equipamento10Cr3;
    private Spinner descricao10Cr3;
    private EditText paradaInicial11Cr3;
    private EditText paradaFinal11Cr3;
    private Spinner equipamento11Cr3;
    private Spinner descricao11Cr3;
    private EditText paradaInicial12Cr3;
    private EditText paradaFinal12Cr3;
    private Spinner equipamento12Cr3;
    private Spinner descricao12Cr3;
    private EditText paradaInicial13Cr3;
    private EditText paradaFinal13Cr3;
    private Spinner equipamento13Cr3;
    private Spinner descricao13Cr3;
    private EditText paradaInicial14Cr3;
    private EditText paradaFinal14Cr3;
    private Spinner equipamento14Cr3;
    private Spinner descricao14Cr3;
    private EditText paradaInicial15Cr3;
    private EditText paradaFinal15Cr3;
    private Spinner equipamento15Cr3;
    private Spinner descricao15Cr3;

    private EditText metalUtc09;

    private CheckBox oleoS3000;
    private CheckBox oleoH4000;
    private CheckBox bandejas;
    private CheckBox rolos;
    private CheckBox skides;
    private CheckBox tempCartuchoRemco;
    private CheckBox tempMotorRemco;
    private CheckBox vibraRemco;
    private CheckBox pressaoS3000;
    private CheckBox pressaoH4000;
    private CheckBox amperimetros;



    private EditText inicialRachao;
    private EditText inicialB4;
    private EditText inicialB2;
    private EditText retorno;
    private EditText retornoBicaPorcent;
    private EditText retornoB0Porcent;
    private EditText retornoB1Porcent;
    private EditText retornoPedriscoPorcent;
    private EditText retornoBicaHorario;
    private EditText retornoB0Horario;
    private EditText retornoB1Horario;
    private EditText retornoPedriscoHorario;
    private EditText observacoes;



    private  RebritagemDAO dao;
    private  RebritagemDAOSync dao2;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebritagem);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtRebMot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data = findViewById(R.id.txtRebData);
        horaInicial = findViewById(R.id.txtRebHI);
        horaFinal = findViewById(R.id.txtRebHF);
        horimetroInicialUa02 = findViewById(R.id.txtRebUa02HoriI);
        horimetroFinalUa02 = findViewById(R.id.txtRebUa02HoriF);
        horimetroInicialUa03 = findViewById(R.id.txtRebUa03HoriI);
        horimetroFinalUa03 = findViewById(R.id.txtRebUa03HoriF);
        horimetroInicialUa04 = findViewById(R.id.txtRebUa04HoriI);
        horimetroFinalUa04 = findViewById(R.id.txtRebUa04HoriF);
        horimetroInicialS3000 = findViewById(R.id.txtRebS3000HoriI);
        horimetroFinalS3000 = findViewById(R.id.txtRebS3000HoriF);
        horimetroInicialH4000 = findViewById(R.id.txtRebH4000HoriI);
        horimetroFinalH4000 = findViewById(R.id.txtRebH4000HoriF);
        horimetroInicialREMCO = findViewById(R.id.txtRebRemcoHoriI);
        horimetroFinalREMCO = findViewById(R.id.txtRebRemcoHoriF);
        balancaUtc04=findViewById(R.id.txtRebBalancaUTC04);
        balancaUtc05=findViewById(R.id.txtRebBalancaUTC05);

        paradaInicial1Cr1 = findViewById(R.id.txtPERebCR1HI1);
        paradaFinal1Cr1 = findViewById(R.id.txtPERebCR1HF1);
        equipamento1Cr1 = findViewById(R.id.spPERebCR1Eq1);
        descricao1Cr1 = findViewById(R.id.spPERebCR1Desc1);
        paradaInicial2Cr1 = findViewById(R.id.txtPERebCR1HI2);
        paradaFinal2Cr1 = findViewById(R.id.txtPERebCR1HF2);
        equipamento2Cr1 = findViewById(R.id.spPERebCR1Eq2);
        descricao2Cr1 = findViewById(R.id.spPERebCR1Desc2);
        paradaInicial3Cr1 = findViewById(R.id.txtPERebCR1HI3);
        paradaFinal3Cr1 = findViewById(R.id.txtPERebCR1HF3);
        equipamento3Cr1 = findViewById(R.id.spPERebCR1Eq3);
        descricao3Cr1 = findViewById(R.id.spPERebCR1Desc3);
        paradaInicial4Cr1 = findViewById(R.id.txtPERebCR1HI4);
        paradaFinal4Cr1 = findViewById(R.id.txtPERebCR1HF4);
        equipamento4Cr1 = findViewById(R.id.spPERebCR1Eq4);
        descricao4Cr1 = findViewById(R.id.spPERebCR1Desc4);
        paradaInicial5Cr1 = findViewById(R.id.txtPERebCR1HI5);
        paradaFinal5Cr1 = findViewById(R.id.txtPERebCR1HF5);
        equipamento5Cr1 = findViewById(R.id.spPERebCR1Eq5);
        descricao5Cr1 = findViewById(R.id.spPERebCR1Desc5);
        paradaInicial6Cr1 = findViewById(R.id.txtPERebCR1HI6);
        paradaFinal6Cr1 = findViewById(R.id.txtPERebCR1HF6);
        equipamento6Cr1 = findViewById(R.id.spPERebCR1Eq6);
        descricao6Cr1 = findViewById(R.id.spPERebCR1Desc6);
        paradaInicial7Cr1 = findViewById(R.id.txtPERebCR1HI7);
        paradaFinal7Cr1 = findViewById(R.id.txtPERebCR1HF7);
        equipamento7Cr1 = findViewById(R.id.spPERebCR1Eq7);
        descricao7Cr1 = findViewById(R.id.spPERebCR1Desc7);
        paradaInicial8Cr1 = findViewById(R.id.txtPERebCR1HI8);
        paradaFinal8Cr1 = findViewById(R.id.txtPERebCR1HF8);
        equipamento8Cr1 = findViewById(R.id.spPERebCR1Eq8);
        descricao8Cr1 = findViewById(R.id.spPERebCR1Desc8);
        paradaInicial9Cr1 = findViewById(R.id.txtPERebCR1HI9);
        paradaFinal9Cr1 = findViewById(R.id.txtPERebCR1HF9);
        equipamento9Cr1 = findViewById(R.id.spPERebCR1Eq9);
        descricao9Cr1 = findViewById(R.id.spPERebCR1Desc9);
        paradaInicial10Cr1 = findViewById(R.id.txtPERebCR1HI10);
        paradaFinal10Cr1 = findViewById(R.id.txtPERebCR1HF10);
        equipamento10Cr1 = findViewById(R.id.spPERebCR1Eq10);
        descricao10Cr1 = findViewById(R.id.spPERebCR1Desc10);
        paradaInicial11Cr1 = findViewById(R.id.txtPERebCR1HI11);
        paradaFinal11Cr1 = findViewById(R.id.txtPERebCR1HF11);
        equipamento11Cr1 = findViewById(R.id.spPERebCR1Eq11);
        descricao11Cr1 = findViewById(R.id.spPERebCR1Desc11);
        paradaInicial12Cr1 = findViewById(R.id.txtPERebCR1HI12);
        paradaFinal12Cr1 = findViewById(R.id.txtPERebCR1HF12);
        equipamento12Cr1 = findViewById(R.id.spPERebCR1Eq12);
        descricao12Cr1 = findViewById(R.id.spPERebCR1Desc12);
        paradaInicial13Cr1 = findViewById(R.id.txtPERebCR1HI13);
        paradaFinal13Cr1 = findViewById(R.id.txtPERebCR1HF13);
        equipamento13Cr1 = findViewById(R.id.spPERebCR1Eq13);
        descricao13Cr1 = findViewById(R.id.spPERebCR1Desc13);
        paradaInicial14Cr1 = findViewById(R.id.txtPERebCR1HI14);
        paradaFinal14Cr1 = findViewById(R.id.txtPERebCR1HF14);
        equipamento14Cr1 = findViewById(R.id.spPERebCR1Eq14);
        descricao14Cr1 = findViewById(R.id.spPERebCR1Desc14);
        paradaInicial15Cr1 = findViewById(R.id.txtPERebCR1HI15);
        paradaFinal15Cr1 = findViewById(R.id.txtPERebCR1HF15);
        equipamento15Cr1 = findViewById(R.id.spPERebCR1Eq15);
        descricao15Cr1 = findViewById(R.id.spPERebCR1Desc15);

        metalUtc02=findViewById(R.id.txtRebUtc02);
        engalUa02=findViewById(R.id.txtRebUa02);
        engalUr01=findViewById(R.id.txtRebUr01);

        paradaInicial1Cr2 = findViewById(R.id.txtPERebCR2HI1);
        paradaFinal1Cr2 = findViewById(R.id.txtPERebCR2HF1);
        equipamento1Cr2 = findViewById(R.id.spPERebCR2Eq1);
        descricao1Cr2 = findViewById(R.id.spPERebCR2Desc1);
        paradaInicial2Cr2 = findViewById(R.id.txtPERebCR2HI2);
        paradaFinal2Cr2 = findViewById(R.id.txtPERebCR2HF2);
        equipamento2Cr2 = findViewById(R.id.spPERebCR2Eq2);
        descricao2Cr2 = findViewById(R.id.spPERebCR2Desc2);
        paradaInicial3Cr2 = findViewById(R.id.txtPERebCR2HI3);
        paradaFinal3Cr2 = findViewById(R.id.txtPERebCR2HF3);
        equipamento3Cr2 = findViewById(R.id.spPERebCR2Eq3);
        descricao3Cr2 = findViewById(R.id.spPERebCR2Desc3);
        paradaInicial4Cr2 = findViewById(R.id.txtPERebCR2HI4);
        paradaFinal4Cr2 = findViewById(R.id.txtPERebCR2HF4);
        equipamento4Cr2 = findViewById(R.id.spPERebCR2Eq4);
        descricao4Cr2 = findViewById(R.id.spPERebCR2Desc4);
        paradaInicial5Cr2 = findViewById(R.id.txtPERebCR2HI5);
        paradaFinal5Cr2 = findViewById(R.id.txtPERebCR2HF5);
        equipamento5Cr2 = findViewById(R.id.spPERebCR2Eq5);
        descricao5Cr2 = findViewById(R.id.spPERebCR2Desc5);
        paradaInicial6Cr2 = findViewById(R.id.txtPERebCR2HI6);
        paradaFinal6Cr2 = findViewById(R.id.txtPERebCR2HF6);
        equipamento6Cr2 = findViewById(R.id.spPERebCR2Eq6);
        descricao6Cr2 = findViewById(R.id.spPERebCR2Desc6);
        paradaInicial7Cr2 = findViewById(R.id.txtPERebCR2HI7);
        paradaFinal7Cr2 = findViewById(R.id.txtPERebCR2HF7);
        equipamento7Cr2 = findViewById(R.id.spPERebCR2Eq7);
        descricao7Cr2 = findViewById(R.id.spPERebCR2Desc7);
        paradaInicial8Cr2 = findViewById(R.id.txtPERebCR2HI8);
        paradaFinal8Cr2 = findViewById(R.id.txtPERebCR2HF8);
        equipamento8Cr2 = findViewById(R.id.spPERebCR2Eq8);
        descricao8Cr2 = findViewById(R.id.spPERebCR2Desc8);
        paradaInicial9Cr2 = findViewById(R.id.txtPERebCR2HI9);
        paradaFinal9Cr2 = findViewById(R.id.txtPERebCR2HF9);
        equipamento9Cr2 = findViewById(R.id.spPERebCR2Eq9);
        descricao9Cr2 = findViewById(R.id.spPERebCR2Desc9);
        paradaInicial10Cr2 = findViewById(R.id.txtPERebCR2HI10);
        paradaFinal10Cr2 = findViewById(R.id.txtPERebCR2HF10);
        equipamento10Cr2 = findViewById(R.id.spPERebCR2Eq10);
        descricao10Cr2 = findViewById(R.id.spPERebCR2Desc10);
        paradaInicial11Cr2 = findViewById(R.id.txtPERebCR2HI11);
        paradaFinal11Cr2 = findViewById(R.id.txtPERebCR2HF11);
        equipamento11Cr2 = findViewById(R.id.spPERebCR2Eq11);
        descricao11Cr2 = findViewById(R.id.spPERebCR2Desc11);
        paradaInicial12Cr2 = findViewById(R.id.txtPERebCR2HI12);
        paradaFinal12Cr2 = findViewById(R.id.txtPERebCR2HF12);
        equipamento12Cr2 = findViewById(R.id.spPERebCR2Eq12);
        descricao12Cr2 = findViewById(R.id.spPERebCR2Desc12);
        paradaInicial13Cr2 = findViewById(R.id.txtPERebCR2HI13);
        paradaFinal13Cr2 = findViewById(R.id.txtPERebCR2HF13);
        equipamento13Cr2 = findViewById(R.id.spPERebCR2Eq13);
        descricao13Cr2 = findViewById(R.id.spPERebCR2Desc13);
        paradaInicial14Cr2 = findViewById(R.id.txtPERebCR2HI14);
        paradaFinal14Cr2 = findViewById(R.id.txtPERebCR2HF14);
        equipamento14Cr2 = findViewById(R.id.spPERebCR2Eq14);
        descricao14Cr2 = findViewById(R.id.spPERebCR2Desc14);
        paradaInicial15Cr2 = findViewById(R.id.txtPERebCR2HI15);
        paradaFinal15Cr2 = findViewById(R.id.txtPERebCR2HF15);
        equipamento15Cr2 = findViewById(R.id.spPERebCR2Eq15);
        descricao15Cr2 = findViewById(R.id.spPERebCR2Desc15);

        metalUtc11=findViewById(R.id.txtRebUtc11);
        engalUr02=findViewById(R.id.txtRebUr02);

        paradaInicial1Cr3 = findViewById(R.id.txtPERebCR3HI1);
        paradaFinal1Cr3 = findViewById(R.id.txtPERebCR3HF1);
        equipamento1Cr3 = findViewById(R.id.spPERebCR3Eq1);
        descricao1Cr3 = findViewById(R.id.spPERebCR3Desc1);
        paradaInicial2Cr3 = findViewById(R.id.txtPERebCR3HI2);
        paradaFinal2Cr3 = findViewById(R.id.txtPERebCR3HF2);
        equipamento2Cr3 = findViewById(R.id.spPERebCR3Eq2);
        descricao2Cr3 = findViewById(R.id.spPERebCR3Desc2);
        paradaInicial3Cr3 = findViewById(R.id.txtPERebCR3HI3);
        paradaFinal3Cr3 = findViewById(R.id.txtPERebCR3HF3);
        equipamento3Cr3 = findViewById(R.id.spPERebCR3Eq3);
        descricao3Cr3 = findViewById(R.id.spPERebCR3Desc3);
        paradaInicial4Cr3 = findViewById(R.id.txtPERebCR3HI4);
        paradaFinal4Cr3 = findViewById(R.id.txtPERebCR3HF4);
        equipamento4Cr3 = findViewById(R.id.spPERebCR3Eq4);
        descricao4Cr3 = findViewById(R.id.spPERebCR3Desc4);
        paradaInicial5Cr3 = findViewById(R.id.txtPERebCR3HI5);
        paradaFinal5Cr3 = findViewById(R.id.txtPERebCR3HF5);
        equipamento5Cr3 = findViewById(R.id.spPERebCR3Eq5);
        descricao5Cr3 = findViewById(R.id.spPERebCR3Desc5);
        paradaInicial6Cr3 = findViewById(R.id.txtPERebCR3HI6);
        paradaFinal6Cr3 = findViewById(R.id.txtPERebCR3HF6);
        equipamento6Cr3 = findViewById(R.id.spPERebCR3Eq6);
        descricao6Cr3 = findViewById(R.id.spPERebCR3Desc6);
        paradaInicial7Cr3 = findViewById(R.id.txtPERebCR3HI7);
        paradaFinal7Cr3 = findViewById(R.id.txtPERebCR3HF7);
        equipamento7Cr3 = findViewById(R.id.spPERebCR3Eq7);
        descricao7Cr3 = findViewById(R.id.spPERebCR3Desc7);
        paradaInicial8Cr3 = findViewById(R.id.txtPERebCR3HI8);
        paradaFinal8Cr3 = findViewById(R.id.txtPERebCR3HF8);
        equipamento8Cr3 = findViewById(R.id.spPERebCR3Eq8);
        descricao8Cr3 = findViewById(R.id.spPERebCR3Desc8);
        paradaInicial9Cr3 = findViewById(R.id.txtPERebCR3HI9);
        paradaFinal9Cr3 = findViewById(R.id.txtPERebCR3HF9);
        equipamento9Cr3 = findViewById(R.id.spPERebCR3Eq9);
        descricao9Cr3 = findViewById(R.id.spPERebCR3Desc9);
        paradaInicial10Cr3 = findViewById(R.id.txtPERebCR3HI10);
        paradaFinal10Cr3 = findViewById(R.id.txtPERebCR3HF10);
        equipamento10Cr3 = findViewById(R.id.spPERebCR3Eq10);
        descricao10Cr3 = findViewById(R.id.spPERebCR3Desc10);
        paradaInicial11Cr3 = findViewById(R.id.txtPERebCR3HI11);
        paradaFinal11Cr3 = findViewById(R.id.txtPERebCR3HF11);
        equipamento11Cr3 = findViewById(R.id.spPERebCR3Eq11);
        descricao11Cr3 = findViewById(R.id.spPERebCR3Desc11);
        paradaInicial12Cr3 = findViewById(R.id.txtPERebCR3HI12);
        paradaFinal12Cr3 = findViewById(R.id.txtPERebCR3HF12);
        equipamento12Cr3 = findViewById(R.id.spPERebCR3Eq12);
        descricao12Cr3 = findViewById(R.id.spPERebCR3Desc12);
        paradaInicial13Cr3 = findViewById(R.id.txtPERebCR3HI13);
        paradaFinal13Cr3 = findViewById(R.id.txtPERebCR3HF13);
        equipamento13Cr3 = findViewById(R.id.spPERebCR3Eq13);
        descricao13Cr3 = findViewById(R.id.spPERebCR3Desc13);
        paradaInicial14Cr3 = findViewById(R.id.txtPERebCR3HI14);
        paradaFinal14Cr3 = findViewById(R.id.txtPERebCR3HF14);
        equipamento14Cr3 = findViewById(R.id.spPERebCR3Eq14);
        descricao14Cr3 = findViewById(R.id.spPERebCR3Desc14);
        paradaInicial15Cr3 = findViewById(R.id.txtPERebCR3HI15);
        paradaFinal15Cr3 = findViewById(R.id.txtPERebCR3HF15);
        equipamento15Cr3 = findViewById(R.id.spPERebCR3Eq15);
        descricao15Cr3 = findViewById(R.id.spPERebCR3Desc15);

        metalUtc09=findViewById(R.id.txtRebUtc09);

        oleoS3000=findViewById(R.id.chkRebOlS3000);
        oleoH4000=findViewById(R.id.chkRebOlH40000);
        bandejas=findViewById(R.id.chkRebBandejas);
        rolos=findViewById(R.id.chkRebRolos);
        skides=findViewById(R.id.chkRebSkides);
        tempCartuchoRemco=findViewById(R.id.chkRebTempCartuchoRemco);
        tempMotorRemco=findViewById(R.id.chkRebTempMotorRemco);
        vibraRemco=findViewById(R.id.chkRebVibraRemco);
        pressaoH4000=findViewById(R.id.chkRebOlH40000);
        pressaoS3000=findViewById(R.id.chkRebPressaoS3000);
        amperimetros=findViewById(R.id.chkRebAmperimetros);
        inicialRachao=findViewById(R.id.txtRebInicialRachao);
        inicialB4=findViewById(R.id.txtRebInicialB2);
        inicialB2=findViewById(R.id.txtRebInicialB4);
        retorno=findViewById(R.id.txtRebRetorno);
        retornoBicaPorcent=findViewById(R.id.txtRebRetornoBicaPorcent);
        retornoB0Porcent=findViewById(R.id.txtRebRetornoB0Porcent);
        retornoB1Porcent=findViewById(R.id.txtRebRetornoB1Porcent);
        retornoPedriscoPorcent=findViewById(R.id.txtRebRetornoPedriscoPorcent);
        retornoBicaHorario=findViewById(R.id.txtRebRetornoBicaHorarios);
        retornoB0Horario=findViewById(R.id.txtRebRetornoB0Horarios);
        retornoB1Horario=findViewById(R.id.txtRebRetornoB1Horarios);
        retornoPedriscoHorario=findViewById(R.id.txtRebRetornoPedriscoHorarios);
        observacoes=findViewById(R.id.txtRebObs);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoRebritagem);

        dao= new RebritagemDAO(this);
        dao2= new RebritagemDAOSync(this);
        btnRebSalvar=findViewById(R.id.btnRebSave);
        btnRebSincronizar=findViewById(R.id.btnRebSincronizar);
        btnRebSincronizar.setVisibility(View.INVISIBLE);


        TextView horaI = (TextView) findViewById(R.id.txtRebHI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);

        TextView data = (TextView) findViewById(R.id.txtRebData);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        Spinner spPERebCr1Desc1 = findViewById(R.id.spPERebCR1Desc1);
        ArrayAdapter<CharSequence> adapterDesc1Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc1Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc1.setAdapter(adapterDesc1Cr1);

        Spinner spPERebCr1Desc2 = findViewById(R.id.spPERebCR1Desc2);
        ArrayAdapter<CharSequence> adapterDesc2Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc2.setAdapter(adapterDesc2Cr1);

        Spinner spPERebCr1Desc3 = findViewById(R.id.spPERebCR1Desc3);
        ArrayAdapter<CharSequence> adapterDesc3Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc3.setAdapter(adapterDesc3Cr1);

        Spinner spPERebCr1Desc4 = findViewById(R.id.spPERebCR1Desc4);
        ArrayAdapter<CharSequence> adapterDesc4Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc4.setAdapter(adapterDesc4Cr1);

        Spinner spPERebCr1Desc5 = findViewById(R.id.spPERebCR1Desc5);
        ArrayAdapter<CharSequence> adapterDesc5Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc5.setAdapter(adapterDesc5Cr1);

        Spinner spPERebCr1Desc6 = findViewById(R.id.spPERebCR1Desc6);
        ArrayAdapter<CharSequence> adapterDesc6Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc6.setAdapter(adapterDesc6Cr1);

        Spinner spPERebCr1Desc7 = findViewById(R.id.spPERebCR1Desc7);
        ArrayAdapter<CharSequence> adapterDesc7Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc7.setAdapter(adapterDesc7Cr1);

        Spinner spPERebCr1Desc8 = findViewById(R.id.spPERebCR1Desc8);
        ArrayAdapter<CharSequence> adapterDesc8Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc8.setAdapter(adapterDesc8Cr1);

        Spinner spPERebCr1Desc9 = findViewById(R.id.spPERebCR1Desc9);
        ArrayAdapter<CharSequence> adapterDesc9Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc9.setAdapter(adapterDesc9Cr1);

        Spinner spPERebCr1Desc10 = findViewById(R.id.spPERebCR1Desc10);
        ArrayAdapter<CharSequence> adapterDesc10Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc10.setAdapter(adapterDesc10Cr1);

        Spinner spPERebCr1Desc11 = findViewById(R.id.spPERebCR1Desc11);
        ArrayAdapter<CharSequence> adapterDesc11Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc11Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc11.setAdapter(adapterDesc11Cr1);

        Spinner spPERebCr1Desc12 = findViewById(R.id.spPERebCR1Desc12);
        ArrayAdapter<CharSequence> adapterDesc12Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc12Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc12.setAdapter(adapterDesc12Cr1);

        Spinner spPERebCr1Desc13 = findViewById(R.id.spPERebCR1Desc13);
        ArrayAdapter<CharSequence> adapterDesc13Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc13Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc13.setAdapter(adapterDesc13Cr1);

        Spinner spPERebCr1Desc14 = findViewById(R.id.spPERebCR1Desc14);
        ArrayAdapter<CharSequence> adapterDesc14Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc14Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc14.setAdapter(adapterDesc14Cr1);

        Spinner spPERebCr1Desc15 = findViewById(R.id.spPERebCR1Desc15);
        ArrayAdapter<CharSequence> adapterDesc15Cr1 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc15Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Desc15.setAdapter(adapterDesc15Cr1);


        Spinner spPERebCr1Eq1 = findViewById(R.id.spPERebCR1Eq1);
        ArrayAdapter<CharSequence> adapterEq1Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq1Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq1.setAdapter(adapterEq1Cr1);

        Spinner spPERebCr1Eq2 = findViewById(R.id.spPERebCR1Eq2);
        ArrayAdapter<CharSequence> adapterEq2Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq2Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq2.setAdapter(adapterEq2Cr1);

        Spinner spPERebCr1Eq3 = findViewById(R.id.spPERebCR1Eq3);
        ArrayAdapter<CharSequence> adapterEq3Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq3Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq3.setAdapter(adapterEq3Cr1);

        Spinner spPERebCr1Eq4 = findViewById(R.id.spPERebCR1Eq4);
        ArrayAdapter<CharSequence> adapterEq4Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq4Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq4.setAdapter(adapterEq4Cr1);

        Spinner spPERebCr1Eq5 = findViewById(R.id.spPERebCR1Eq5);
        ArrayAdapter<CharSequence> adapterEq5Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq5Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq5.setAdapter(adapterEq5Cr1);

        Spinner spPERebCr1Eq6 = findViewById(R.id.spPERebCR1Eq6);
        ArrayAdapter<CharSequence> adapterEq6Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq6Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq6.setAdapter(adapterEq6Cr1);

        Spinner spPERebCr1Eq7 = findViewById(R.id.spPERebCR1Eq7);
        ArrayAdapter<CharSequence> adapterEq7Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq7Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq7.setAdapter(adapterEq7Cr1);

        Spinner spPERebCr1Eq8 = findViewById(R.id.spPERebCR1Eq8);
        ArrayAdapter<CharSequence> adapterEq8Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq8Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq8.setAdapter(adapterEq8Cr1);

        Spinner spPERebCr1Eq9 = findViewById(R.id.spPERebCR1Eq9);
        ArrayAdapter<CharSequence> adapterEq9Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq9Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq9.setAdapter(adapterEq9Cr1);

        Spinner spPERebCr1Eq10 = findViewById(R.id.spPERebCR1Eq10);
        ArrayAdapter<CharSequence> adapterEq10Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq10Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq10.setAdapter(adapterEq10Cr1);

        Spinner spPERebCr1Eq11 = findViewById(R.id.spPERebCR1Eq11);
        ArrayAdapter<CharSequence> adapterEq11Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq11Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq11.setAdapter(adapterEq11Cr1);

        Spinner spPERebCr1Eq12 = findViewById(R.id.spPERebCR1Eq12);
        ArrayAdapter<CharSequence> adapterEq12Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq12Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq12.setAdapter(adapterEq12Cr1);

        Spinner spPERebCr1Eq13 = findViewById(R.id.spPERebCR1Eq13);
        ArrayAdapter<CharSequence> adapterEq13Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq13Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq13.setAdapter(adapterEq13Cr1);

        Spinner spPERebCr1Eq14 = findViewById(R.id.spPERebCR1Eq14);
        ArrayAdapter<CharSequence> adapterEq14Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq14Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq14.setAdapter(adapterEq14Cr1);

        Spinner spPERebCr1Eq15 = findViewById(R.id.spPERebCR1Eq15);
        ArrayAdapter<CharSequence> adapterEq15Cr1 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq15Cr1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr1Eq15.setAdapter(adapterEq15Cr1);




        Spinner spPERebCr2Desc1 = findViewById(R.id.spPERebCR2Desc1);
        ArrayAdapter<CharSequence> adapterDesc1Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc1Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc1.setAdapter(adapterDesc1Cr2);

        Spinner spPERebCr2Desc2 = findViewById(R.id.spPERebCR2Desc2);
        ArrayAdapter<CharSequence> adapterDesc2Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc2.setAdapter(adapterDesc2Cr2);

        Spinner spPERebCr2Desc3 = findViewById(R.id.spPERebCR2Desc3);
        ArrayAdapter<CharSequence> adapterDesc3Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc3.setAdapter(adapterDesc3Cr2);

        Spinner spPERebCr2Desc4 = findViewById(R.id.spPERebCR2Desc4);
        ArrayAdapter<CharSequence> adapterDesc4Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc4.setAdapter(adapterDesc4Cr2);

        Spinner spPERebCr2Desc5 = findViewById(R.id.spPERebCR2Desc5);
        ArrayAdapter<CharSequence> adapterDesc5Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc5.setAdapter(adapterDesc5Cr2);

        Spinner spPERebCr2Desc6 = findViewById(R.id.spPERebCR2Desc6);
        ArrayAdapter<CharSequence> adapterDesc6Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc6.setAdapter(adapterDesc6Cr2);

        Spinner spPERebCr2Desc7 = findViewById(R.id.spPERebCR2Desc7);
        ArrayAdapter<CharSequence> adapterDesc7Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc7.setAdapter(adapterDesc7Cr2);

        Spinner spPERebCr2Desc8 = findViewById(R.id.spPERebCR2Desc8);
        ArrayAdapter<CharSequence> adapterDesc8Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc8.setAdapter(adapterDesc8Cr2);

        Spinner spPERebCr2Desc9 = findViewById(R.id.spPERebCR2Desc9);
        ArrayAdapter<CharSequence> adapterDesc9Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc9.setAdapter(adapterDesc9Cr2);

        Spinner spPERebCr2Desc10 = findViewById(R.id.spPERebCR2Desc10);
        ArrayAdapter<CharSequence> adapterDesc10Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc10.setAdapter(adapterDesc10Cr2);

        Spinner spPERebCr2Desc11 = findViewById(R.id.spPERebCR2Desc11);
        ArrayAdapter<CharSequence> adapterDesc11Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc11Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc11.setAdapter(adapterDesc11Cr2);

        Spinner spPERebCr2Desc12 = findViewById(R.id.spPERebCR2Desc12);
        ArrayAdapter<CharSequence> adapterDesc12Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc12Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc12.setAdapter(adapterDesc12Cr2);

        Spinner spPERebCr2Desc13 = findViewById(R.id.spPERebCR2Desc13);
        ArrayAdapter<CharSequence> adapterDesc13Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc13Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc13.setAdapter(adapterDesc13Cr2);

        Spinner spPERebCr2Desc14 = findViewById(R.id.spPERebCR2Desc14);
        ArrayAdapter<CharSequence> adapterDesc14Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc14Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc14.setAdapter(adapterDesc14Cr2);

        Spinner spPERebCr2Desc15 = findViewById(R.id.spPERebCR2Desc15);
        ArrayAdapter<CharSequence> adapterDesc15Cr2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc15Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Desc15.setAdapter(adapterDesc15Cr2);


        Spinner spPERebCr2Eq1 = findViewById(R.id.spPERebCR2Eq1);
        ArrayAdapter<CharSequence> adapterEq1Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq1Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq1.setAdapter(adapterEq1Cr2);

        Spinner spPERebCr2Eq2 = findViewById(R.id.spPERebCR2Eq2);
        ArrayAdapter<CharSequence> adapterEq2Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq2Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq2.setAdapter(adapterEq2Cr2);

        Spinner spPERebCr2Eq3 = findViewById(R.id.spPERebCR2Eq3);
        ArrayAdapter<CharSequence> adapterEq3Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq3Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq3.setAdapter(adapterEq3Cr2);

        Spinner spPERebCr2Eq4 = findViewById(R.id.spPERebCR2Eq4);
        ArrayAdapter<CharSequence> adapterEq4Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq4Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq4.setAdapter(adapterEq4Cr2);

        Spinner spPERebCr2Eq5 = findViewById(R.id.spPERebCR2Eq5);
        ArrayAdapter<CharSequence> adapterEq5Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq5Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq5.setAdapter(adapterEq5Cr2);

        Spinner spPERebCr2Eq6 = findViewById(R.id.spPERebCR2Eq6);
        ArrayAdapter<CharSequence> adapterEq6Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq6Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq6.setAdapter(adapterEq6Cr2);

        Spinner spPERebCr2Eq7 = findViewById(R.id.spPERebCR2Eq7);
        ArrayAdapter<CharSequence> adapterEq7Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq7Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq7.setAdapter(adapterEq7Cr2);

        Spinner spPERebCr2Eq8 = findViewById(R.id.spPERebCR2Eq8);
        ArrayAdapter<CharSequence> adapterEq8Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq8Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq8.setAdapter(adapterEq8Cr2);

        Spinner spPERebCr2Eq9 = findViewById(R.id.spPERebCR2Eq9);
        ArrayAdapter<CharSequence> adapterEq9Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq9Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq9.setAdapter(adapterEq9Cr2);

        Spinner spPERebCr2Eq10 = findViewById(R.id.spPERebCR2Eq10);
        ArrayAdapter<CharSequence> adapterEq10Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq10Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq10.setAdapter(adapterEq10Cr2);

        Spinner spPERebCr2Eq11 = findViewById(R.id.spPERebCR2Eq11);
        ArrayAdapter<CharSequence> adapterEq11Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq11Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq11.setAdapter(adapterEq11Cr2);

        Spinner spPERebCr2Eq12 = findViewById(R.id.spPERebCR2Eq12);
        ArrayAdapter<CharSequence> adapterEq12Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq12Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq12.setAdapter(adapterEq12Cr2);

        Spinner spPERebCr2Eq13 = findViewById(R.id.spPERebCR2Eq13);
        ArrayAdapter<CharSequence> adapterEq13Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq13Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq13.setAdapter(adapterEq13Cr2);

        Spinner spPERebCr2Eq14 = findViewById(R.id.spPERebCR2Eq14);
        ArrayAdapter<CharSequence> adapterEq14Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq14Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq14.setAdapter(adapterEq14Cr2);

        Spinner spPERebCr2Eq15 = findViewById(R.id.spPERebCR2Eq15);
        ArrayAdapter<CharSequence> adapterEq15Cr2 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq15Cr2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr2Eq15.setAdapter(adapterEq15Cr2);




        Spinner spPERebCr3Desc1 = findViewById(R.id.spPERebCR3Desc1);
        ArrayAdapter<CharSequence> adapterDesc1Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc1Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc1.setAdapter(adapterDesc1Cr3);

        Spinner spPERebCr3Desc2 = findViewById(R.id.spPERebCR3Desc2);
        ArrayAdapter<CharSequence> adapterDesc2Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc2.setAdapter(adapterDesc2Cr3);

        Spinner spPERebCr3Desc3 = findViewById(R.id.spPERebCR3Desc3);
        ArrayAdapter<CharSequence> adapterDesc3Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc3.setAdapter(adapterDesc3Cr3);

        Spinner spPERebCr3Desc4 = findViewById(R.id.spPERebCR3Desc4);
        ArrayAdapter<CharSequence> adapterDesc4Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc4.setAdapter(adapterDesc4Cr3);

        Spinner spPERebCr3Desc5 = findViewById(R.id.spPERebCR3Desc5);
        ArrayAdapter<CharSequence> adapterDesc5Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc5.setAdapter(adapterDesc5Cr3);

        Spinner spPERebCr3Desc6 = findViewById(R.id.spPERebCR3Desc6);
        ArrayAdapter<CharSequence> adapterDesc6Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc6.setAdapter(adapterDesc6Cr3);

        Spinner spPERebCr3Desc7 = findViewById(R.id.spPERebCR3Desc7);
        ArrayAdapter<CharSequence> adapterDesc7Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc7.setAdapter(adapterDesc7Cr3);

        Spinner spPERebCr3Desc8 = findViewById(R.id.spPERebCR3Desc8);
        ArrayAdapter<CharSequence> adapterDesc8Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc8.setAdapter(adapterDesc8Cr3);

        Spinner spPERebCr3Desc9 = findViewById(R.id.spPERebCR3Desc9);
        ArrayAdapter<CharSequence> adapterDesc9Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc9.setAdapter(adapterDesc9Cr3);

        Spinner spPERebCr3Desc10 = findViewById(R.id.spPERebCR3Desc10);
        ArrayAdapter<CharSequence> adapterDesc10Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc10.setAdapter(adapterDesc10Cr3);

        Spinner spPERebCr3Desc11 = findViewById(R.id.spPERebCR3Desc11);
        ArrayAdapter<CharSequence> adapterDesc11Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc11Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc11.setAdapter(adapterDesc11Cr3);

        Spinner spPERebCr3Desc12 = findViewById(R.id.spPERebCR3Desc12);
        ArrayAdapter<CharSequence> adapterDesc12Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc12Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc12.setAdapter(adapterDesc12Cr3);

        Spinner spPERebCr3Desc13 = findViewById(R.id.spPERebCR3Desc13);
        ArrayAdapter<CharSequence> adapterDesc13Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc13Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc13.setAdapter(adapterDesc13Cr3);

        Spinner spPERebCr3Desc14 = findViewById(R.id.spPERebCR3Desc14);
        ArrayAdapter<CharSequence> adapterDesc14Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc14Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc14.setAdapter(adapterDesc14Cr3);

        Spinner spPERebCr3Desc15 = findViewById(R.id.spPERebCR3Desc15);
        ArrayAdapter<CharSequence> adapterDesc15Cr3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc15Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Desc15.setAdapter(adapterDesc15Cr3);


        Spinner spPERebCr3Eq1 = findViewById(R.id.spPERebCR3Eq1);
        ArrayAdapter<CharSequence> adapterEq1Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq1Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq1.setAdapter(adapterEq1Cr3);

        Spinner spPERebCr3Eq2 = findViewById(R.id.spPERebCR3Eq2);
        ArrayAdapter<CharSequence> adapterEq2Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq2Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq2.setAdapter(adapterEq2Cr3);

        Spinner spPERebCr3Eq3 = findViewById(R.id.spPERebCR3Eq3);
        ArrayAdapter<CharSequence> adapterEq3Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq3Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq3.setAdapter(adapterEq3Cr3);

        Spinner spPERebCr3Eq4 = findViewById(R.id.spPERebCR3Eq4);
        ArrayAdapter<CharSequence> adapterEq4Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq4Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq4.setAdapter(adapterEq4Cr3);

        Spinner spPERebCr3Eq5 = findViewById(R.id.spPERebCR3Eq5);
        ArrayAdapter<CharSequence> adapterEq5Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq5Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq5.setAdapter(adapterEq5Cr3);

        Spinner spPERebCr3Eq6 = findViewById(R.id.spPERebCR3Eq6);
        ArrayAdapter<CharSequence> adapterEq6Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq6Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq6.setAdapter(adapterEq6Cr3);

        Spinner spPERebCr3Eq7 = findViewById(R.id.spPERebCR3Eq7);
        ArrayAdapter<CharSequence> adapterEq7Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq7Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq7.setAdapter(adapterEq7Cr3);

        Spinner spPERebCr3Eq8 = findViewById(R.id.spPERebCR3Eq8);
        ArrayAdapter<CharSequence> adapterEq8Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq8Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq8.setAdapter(adapterEq8Cr3);

        Spinner spPERebCr3Eq9 = findViewById(R.id.spPERebCR3Eq9);
        ArrayAdapter<CharSequence> adapterEq9Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq9Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq9.setAdapter(adapterEq9Cr3);

        Spinner spPERebCr3Eq10 = findViewById(R.id.spPERebCR3Eq10);
        ArrayAdapter<CharSequence> adapterEq10Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq10Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq10.setAdapter(adapterEq10Cr3);

        Spinner spPERebCr3Eq11 = findViewById(R.id.spPERebCR3Eq11);
        ArrayAdapter<CharSequence> adapterEq11Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq11Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq11.setAdapter(adapterEq11Cr3);

        Spinner spPERebCr3Eq12 = findViewById(R.id.spPERebCR3Eq12);
        ArrayAdapter<CharSequence> adapterEq12Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq12Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq12.setAdapter(adapterEq12Cr3);

        Spinner spPERebCr3Eq13 = findViewById(R.id.spPERebCR3Eq13);
        ArrayAdapter<CharSequence> adapterEq13Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq13Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq13.setAdapter(adapterEq13Cr3);

        Spinner spPERebCr3Eq14 = findViewById(R.id.spPERebCR3Eq14);
        ArrayAdapter<CharSequence> adapterEq14Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq14Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq14.setAdapter(adapterEq14Cr3);

        Spinner spPERebCr3Eq15 = findViewById(R.id.spPERebCR3Eq15);
        ArrayAdapter<CharSequence> adapterEq15Cr3 = ArrayAdapter.createFromResource(this, R.array.equipamento, android.R.layout.simple_spinner_item);
        adapterEq15Cr3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPERebCr3Eq15.setAdapter(adapterEq15Cr3);



        btnRebCandelar= findViewById(R.id.btnRebCancel);
        btnRebCandelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(RebritagemActivity.this);
                View view= LayoutInflater.from(RebritagemActivity.this).inflate(R.layout.alert_dialog,null);
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






        btnRebUTC02Mais = (Button) findViewById(R.id.btnRebUTC02Mais);
        btnRebUTC02Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc02 = (TextView) findViewById(R.id.txtRebUtc02);

            @Override
            public void onClick(View v) {
                numeroMetalUTC02 += 1;
                txtRebUtc02.setText(String.valueOf("Metal UTC02:"+numeroMetalUTC02));
            }
        });
        btnRebUTC02Menos = (Button) findViewById(R.id.btnRebUTC02Menos);
        btnRebUTC02Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc02 = (TextView) findViewById(R.id.txtRebUtc02);

            @Override
            public void onClick(View v) {
                if (numeroMetalUTC02 > 0) {
                    numeroMetalUTC02 -= 1;
                    txtRebUtc02.setText(String.valueOf("Metal UTC02:"+numeroMetalUTC02));
                } else {
                    numeroMetalUTC02 = 0;
                }
            }
        });




        btnRebUr01Mais = (Button) findViewById(R.id.btnRebUr01Mais);
        btnRebUr01Mais.setOnClickListener(new View.OnClickListener() {
            TextView engalUr01 = (TextView) findViewById(R.id.txtRebUr01);

            @Override
            public void onClick(View v) {
                numeroEngalUr01 += 1;
                engalUr01.setText(String.valueOf("Engaiolamento UR01:"+numeroEngalUr01));
            }
        });
        btnRebUr01Menos = (Button) findViewById(R.id.btnRebUr01Menos);
        btnRebUr01Menos.setOnClickListener(new View.OnClickListener() {
            TextView engalUr01 = (TextView) findViewById(R.id.txtRebUr01);

            @Override
            public void onClick(View v) {
                if (numeroEngalUr01 > 0) {
                    numeroEngalUr01 -= 1;
                    engalUr01.setText(String.valueOf("Engaiolamento UR01:"+numeroEngalUr01));
                } else {
                    numeroEngalUr01 = 0;
                }
            }
        });



        btnRebUa02Mais = (Button) findViewById(R.id.btnRebUA02Mais);
        btnRebUa02Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUa02 = (TextView) findViewById(R.id.txtRebUa02);

            @Override
            public void onClick(View v) {
                numeroEngalUa02 += 1;
                txtRebUa02.setText(String.valueOf("Engaiolamento Ua02:"+numeroEngalUa02));
            }
        });
        btnRebUa02Menos = (Button) findViewById(R.id.btnRebUA02Menos);
        btnRebUa02Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUa02 = (TextView) findViewById(R.id.txtRebUa02);

            @Override
            public void onClick(View v) {
                if (numeroEngalUa02 > 0) {
                    numeroEngalUa02 -= 1;
                    txtRebUa02.setText(String.valueOf("Engaiolamento Ua02:"+numeroEngalUa02));
                } else {
                    numeroEngalUa02 = 0;
                }
            }
        });








        btnRebUTC11Mais = (Button) findViewById(R.id.btnRebUTC11Mais);
        btnRebUTC11Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc11 = (TextView) findViewById(R.id.txtRebUtc11);

            @Override
            public void onClick(View v) {
                numeroMetalUTC11 += 1;
                txtRebUtc11.setText(String.valueOf("Metal UTC11:"+numeroMetalUTC11));
            }
        });
        btnRebUTC11Menos = (Button) findViewById(R.id.btnRebUTC11Menos);
        btnRebUTC11Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc11 = (TextView) findViewById(R.id.txtRebUtc11);

            @Override
            public void onClick(View v) {
                if (numeroMetalUTC11 > 0) {
                    numeroMetalUTC11 -= 1;
                    txtRebUtc11.setText(String.valueOf("Metal UTC11:"+numeroMetalUTC11));
                } else {
                    numeroMetalUTC11 = 0;
                }
            }
        });







        btnRebUr02Mais = (Button) findViewById(R.id.btnRebUr02Mais);
        btnRebUr02Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUr02 = (TextView) findViewById(R.id.txtRebUr02);

            @Override
            public void onClick(View v) {
                numeroEngalUr02 += 1;
                txtRebUr02.setText(String.valueOf("Engaiolamento Ua03:"+numeroEngalUr02));
            }
        });
        btnRebUr02Menos = (Button) findViewById(R.id.btnRebUr02Menos);
        btnRebUr02Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUr02 = (TextView) findViewById(R.id.txtRebUr02);

            @Override
            public void onClick(View v) {
                if (numeroEngalUr02 > 0) {
                    numeroEngalUr02 -= 1;
                    txtRebUr02.setText(String.valueOf("Engaiolamento Ua03:"+numeroEngalUr02));
                } else {
                    numeroEngalUr02 = 0;
                }
            }
        });










        btnRebUTC09Mais = (Button) findViewById(R.id.btnRebUTC09Mais);
        btnRebUTC09Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc09 = (TextView) findViewById(R.id.txtRebUtc09);

            @Override
            public void onClick(View v) {
                numeroMetalUTC09 += 1;
                txtRebUtc09.setText(String.valueOf("Metal UTC09:"+numeroMetalUTC09));
            }
        });
        btnRebUTC09Menos = (Button) findViewById(R.id.btnRebUTC09Menos);
        btnRebUTC09Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtRebUtc09 = (TextView) findViewById(R.id.txtRebUtc09);

            @Override
            public void onClick(View v) {
                if (numeroMetalUTC09 > 0) {
                    numeroMetalUTC09 -= 1;
                    txtRebUtc09.setText(String.valueOf("Metal UTC09:"+numeroMetalUTC09));
                } else {
                    numeroMetalUTC09 = 0;
                }
            }
        });












        //===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1Cr1 = findViewById(R.id.txtPERebCR1HI1);
        paradaInicial1Cr1.setFocusableInTouchMode(false);
        paradaInicial1Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);

                timePickerDialog.show();
            }
        });


        paradaInicial2Cr1 = findViewById(R.id.txtPERebCR1HI2);
        paradaInicial2Cr1.setFocusableInTouchMode(false);
        paradaInicial2Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial3Cr1 = findViewById(R.id.txtPERebCR1HI3);
        paradaInicial3Cr1.setFocusableInTouchMode(false);
        paradaInicial3Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial4Cr1 = findViewById(R.id.txtPERebCR1HI4);
        paradaInicial4Cr1.setFocusableInTouchMode(false);
        paradaInicial4Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial5Cr1 = findViewById(R.id.txtPERebCR1HI5);
        paradaInicial5Cr1.setFocusableInTouchMode(false);
        paradaInicial5Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial6Cr1 = findViewById(R.id.txtPERebCR1HI6);
        paradaInicial6Cr1.setFocusableInTouchMode(false);
        paradaInicial6Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial7Cr1 = findViewById(R.id.txtPERebCR1HI7);
        paradaInicial7Cr1.setFocusableInTouchMode(false);
        paradaInicial7Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial8Cr1 = findViewById(R.id.txtPERebCR1HI8);
        paradaInicial8Cr1.setFocusableInTouchMode(false);
        paradaInicial8Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial9Cr1 = findViewById(R.id.txtPERebCR1HI9);
        paradaInicial9Cr1.setFocusableInTouchMode(false);
        paradaInicial9Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial10Cr1 = findViewById(R.id.txtPERebCR1HI10);
        paradaInicial10Cr1.setFocusableInTouchMode(false);
        paradaInicial10Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial10Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial11Cr1 = findViewById(R.id.txtPERebCR1HI11);
        paradaInicial11Cr1.setFocusableInTouchMode(false);
        paradaInicial11Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial11Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial12Cr1 = findViewById(R.id.txtPERebCR1HI12);
        paradaInicial12Cr1.setFocusableInTouchMode(false);
        paradaInicial12Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial12Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial13Cr1 = findViewById(R.id.txtPERebCR1HI13);
        paradaInicial13Cr1.setFocusableInTouchMode(false);
        paradaInicial13Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial13Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial14Cr1 = findViewById(R.id.txtPERebCR1HI14);
        paradaInicial14Cr1.setFocusableInTouchMode(false);
        paradaInicial14Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial14Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial15Cr1 = findViewById(R.id.txtPERebCR1HI15);
        paradaInicial15Cr1.setFocusableInTouchMode(false);
        paradaInicial15Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial15Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });





        paradaFinal1Cr1 = findViewById(R.id.txtPERebCR1HF1);
        paradaFinal1Cr1.setFocusableInTouchMode(false);
        paradaFinal1Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal2Cr1 = findViewById(R.id.txtPERebCR1HF2);
        paradaFinal2Cr1.setFocusableInTouchMode(false);
        paradaFinal2Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal3Cr1 = findViewById(R.id.txtPERebCR1HF3);
        paradaFinal3Cr1.setFocusableInTouchMode(false);
        paradaFinal3Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal4Cr1 = findViewById(R.id.txtPERebCR1HF4);
        paradaFinal4Cr1.setFocusableInTouchMode(false);
        paradaFinal4Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal5Cr1 = findViewById(R.id.txtPERebCR1HF5);
        paradaFinal5Cr1.setFocusableInTouchMode(false);
        paradaFinal5Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal6Cr1 = findViewById(R.id.txtPERebCR1HF6);
        paradaFinal6Cr1.setFocusableInTouchMode(false);
        paradaFinal6Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal7Cr1 = findViewById(R.id.txtPERebCR1HF7);
        paradaFinal7Cr1.setFocusableInTouchMode(false);
        paradaFinal7Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal8Cr1 = findViewById(R.id.txtPERebCR1HF8);
        paradaFinal8Cr1.setFocusableInTouchMode(false);
        paradaFinal8Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal9Cr1 = findViewById(R.id.txtPERebCR1HF9);
        paradaFinal9Cr1.setFocusableInTouchMode(false);
        paradaFinal9Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal10Cr1 = findViewById(R.id.txtPERebCR1HF10);
        paradaFinal10Cr1.setFocusableInTouchMode(false);
        paradaFinal10Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal11Cr1 = findViewById(R.id.txtPERebCR1HF11);
        paradaFinal11Cr1.setFocusableInTouchMode(false);
        paradaFinal11Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal11Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal12Cr1 = findViewById(R.id.txtPERebCR1HF12);
        paradaFinal12Cr1.setFocusableInTouchMode(false);
        paradaFinal12Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal12Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal13Cr1 = findViewById(R.id.txtPERebCR1HF13);
        paradaFinal13Cr1.setFocusableInTouchMode(false);
        paradaFinal13Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal13Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal14Cr1 = findViewById(R.id.txtPERebCR1HF14);
        paradaFinal14Cr1.setFocusableInTouchMode(false);
        paradaFinal14Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal14Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal15Cr1 = findViewById(R.id.txtPERebCR1HF15);
        paradaFinal15Cr1.setFocusableInTouchMode(false);
        paradaFinal15Cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal15Cr1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });












        paradaInicial1Cr2 = findViewById(R.id.txtPERebCR2HI1);
        paradaInicial1Cr2.setFocusableInTouchMode(false);
        paradaInicial1Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial2Cr2 = findViewById(R.id.txtPERebCR2HI2);
        paradaInicial2Cr2.setFocusableInTouchMode(false);
        paradaInicial2Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial3Cr2 = findViewById(R.id.txtPERebCR2HI3);
        paradaInicial3Cr2.setFocusableInTouchMode(false);
        paradaInicial3Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial4Cr2 = findViewById(R.id.txtPERebCR2HI4);
        paradaInicial4Cr2.setFocusableInTouchMode(false);
        paradaInicial4Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial5Cr2 = findViewById(R.id.txtPERebCR2HI5);
        paradaInicial5Cr2.setFocusableInTouchMode(false);
        paradaInicial5Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial6Cr2 = findViewById(R.id.txtPERebCR2HI6);
        paradaInicial6Cr2.setFocusableInTouchMode(false);
        paradaInicial6Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial7Cr2 = findViewById(R.id.txtPERebCR2HI7);
        paradaInicial7Cr2.setFocusableInTouchMode(false);
        paradaInicial7Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial8Cr2 = findViewById(R.id.txtPERebCR2HI8);
        paradaInicial8Cr2.setFocusableInTouchMode(false);
        paradaInicial8Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial9Cr2 = findViewById(R.id.txtPERebCR2HI9);
        paradaInicial9Cr2.setFocusableInTouchMode(false);
        paradaInicial9Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial10Cr2 = findViewById(R.id.txtPERebCR2HI10);
        paradaInicial10Cr2.setFocusableInTouchMode(false);
        paradaInicial10Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial10Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial11Cr2 = findViewById(R.id.txtPERebCR2HI11);
        paradaInicial11Cr2.setFocusableInTouchMode(false);
        paradaInicial11Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial11Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial12Cr2 = findViewById(R.id.txtPERebCR2HI12);
        paradaInicial12Cr2.setFocusableInTouchMode(false);
        paradaInicial12Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial12Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial13Cr2 = findViewById(R.id.txtPERebCR2HI13);
        paradaInicial13Cr2.setFocusableInTouchMode(false);
        paradaInicial13Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial13Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial14Cr2 = findViewById(R.id.txtPERebCR2HI14);
        paradaInicial14Cr2.setFocusableInTouchMode(false);
        paradaInicial14Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial14Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial15Cr2 = findViewById(R.id.txtPERebCR2HI15);
        paradaInicial15Cr2.setFocusableInTouchMode(false);
        paradaInicial15Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial15Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });














        paradaFinal1Cr2 = findViewById(R.id.txtPERebCR2HF1);
        paradaFinal1Cr2.setFocusableInTouchMode(false);
        paradaFinal1Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal2Cr2 = findViewById(R.id.txtPERebCR2HF2);
        paradaFinal2Cr2.setFocusableInTouchMode(false);
        paradaFinal2Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal3Cr2 = findViewById(R.id.txtPERebCR2HF3);
        paradaFinal3Cr2.setFocusableInTouchMode(false);
        paradaFinal3Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal4Cr2 = findViewById(R.id.txtPERebCR2HF4);
        paradaFinal4Cr2.setFocusableInTouchMode(false);
        paradaFinal4Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal5Cr2 = findViewById(R.id.txtPERebCR2HF5);
        paradaFinal5Cr2.setFocusableInTouchMode(false);
        paradaFinal5Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal6Cr2 = findViewById(R.id.txtPERebCR2HF6);
        paradaFinal6Cr2.setFocusableInTouchMode(false);
        paradaFinal6Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal7Cr2 = findViewById(R.id.txtPERebCR2HF7);
        paradaFinal7Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal8Cr2 = findViewById(R.id.txtPERebCR2HF8);
        paradaFinal8Cr2.setFocusableInTouchMode(false);
        paradaFinal8Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal9Cr2 = findViewById(R.id.txtPERebCR2HF9);
        paradaFinal9Cr2.setFocusableInTouchMode(false);
        paradaFinal9Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal10Cr2 = findViewById(R.id.txtPERebCR2HF10);
        paradaFinal10Cr2.setFocusableInTouchMode(false);
        paradaFinal10Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal11Cr2 = findViewById(R.id.txtPERebCR2HF11);
        paradaFinal11Cr2.setFocusableInTouchMode(false);
        paradaFinal11Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal11Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal12Cr2 = findViewById(R.id.txtPERebCR2HF12);
        paradaFinal12Cr2.setFocusableInTouchMode(false);
        paradaFinal12Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal12Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal13Cr2 = findViewById(R.id.txtPERebCR2HF13);
        paradaFinal13Cr2.setFocusableInTouchMode(false);
        paradaFinal13Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal13Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal14Cr2 = findViewById(R.id.txtPERebCR2HF14);
        paradaFinal14Cr2.setFocusableInTouchMode(false);
        paradaFinal14Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal14Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal15Cr2 = findViewById(R.id.txtPERebCR2HF15);
        paradaFinal15Cr2.setFocusableInTouchMode(false);
        paradaFinal15Cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal15Cr2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });











        paradaInicial1Cr3 = findViewById(R.id.txtPERebCR3HI1);
        paradaInicial1Cr3.setFocusableInTouchMode(false);
        paradaInicial1Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial2Cr3 = findViewById(R.id.txtPERebCR3HI2);
        paradaInicial2Cr3.setFocusableInTouchMode(false);
        paradaInicial2Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial3Cr3 = findViewById(R.id.txtPERebCR3HI3);
        paradaInicial3Cr3.setFocusableInTouchMode(false);
        paradaInicial3Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaInicial4Cr3 = findViewById(R.id.txtPERebCR3HI4);
        paradaInicial4Cr3.setFocusableInTouchMode(false);
        paradaInicial4Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial5Cr3 = findViewById(R.id.txtPERebCR3HI5);
        paradaInicial5Cr3.setFocusableInTouchMode(false);
        paradaInicial5Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial6Cr3 = findViewById(R.id.txtPERebCR3HI6);
        paradaInicial6Cr3.setFocusableInTouchMode(false);
        paradaInicial6Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial7Cr3 = findViewById(R.id.txtPERebCR3HI7);
        paradaInicial7Cr3.setFocusableInTouchMode(false);
        paradaInicial7Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial8Cr3 = findViewById(R.id.txtPERebCR3HI8);
        paradaInicial8Cr3.setFocusableInTouchMode(false);
        paradaInicial8Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial9Cr3 = findViewById(R.id.txtPERebCR3HI9);
        paradaInicial9Cr3.setFocusableInTouchMode(false);
        paradaInicial9Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial10Cr3 = findViewById(R.id.txtPERebCR3HI10);
        paradaInicial10Cr3.setFocusableInTouchMode(false);
        paradaInicial10Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial10Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial11Cr3 = findViewById(R.id.txtPERebCR3HI11);
        paradaInicial11Cr3.setFocusableInTouchMode(false);
        paradaInicial11Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial11Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial12Cr3 = findViewById(R.id.txtPERebCR3HI12);
        paradaInicial12Cr3.setFocusableInTouchMode(false);
        paradaInicial12Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial12Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial13Cr3 = findViewById(R.id.txtPERebCR3HI13);
        paradaInicial13Cr3.setFocusableInTouchMode(false);
        paradaInicial13Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial13Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial14Cr3 = findViewById(R.id.txtPERebCR3HI14);
        paradaInicial14Cr3.setFocusableInTouchMode(false);
        paradaInicial14Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial14Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaInicial15Cr3 = findViewById(R.id.txtPERebCR3HI15);
        paradaInicial15Cr3.setFocusableInTouchMode(false);
        paradaInicial15Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial15Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });














        paradaFinal1Cr3 = findViewById(R.id.txtPERebCR3HF1);
        paradaFinal1Cr3.setFocusableInTouchMode(false);
        paradaFinal1Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal2Cr3 = findViewById(R.id.txtPERebCR3HF2);
        paradaFinal2Cr3.setFocusableInTouchMode(false);
        paradaFinal2Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal3Cr3 = findViewById(R.id.txtPERebCR3HF3);
        paradaFinal3Cr3.setFocusableInTouchMode(false);
        paradaFinal3Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        paradaFinal4Cr3 = findViewById(R.id.txtPERebCR3HF4);
        paradaFinal4Cr3.setFocusableInTouchMode(false);
        paradaFinal4Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal5Cr3 = findViewById(R.id.txtPERebCR3HF5);
        paradaFinal5Cr3.setFocusableInTouchMode(false);
        paradaFinal5Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal6Cr3 = findViewById(R.id.txtPERebCR3HF6);
        paradaFinal6Cr3.setFocusableInTouchMode(false);
        paradaFinal6Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal7Cr3 = findViewById(R.id.txtPERebCR3HF7);
        paradaFinal7Cr3.setFocusableInTouchMode(false);
        paradaFinal7Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal8Cr3 = findViewById(R.id.txtPERebCR3HF8);
        paradaFinal8Cr3.setFocusableInTouchMode(false);
        paradaFinal8Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal9Cr3 = findViewById(R.id.txtPERebCR3HF9);
        paradaFinal9Cr3.setFocusableInTouchMode(false);
        paradaFinal9Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal10Cr3 = findViewById(R.id.txtPERebCR3HF10);
        paradaFinal10Cr3.setFocusableInTouchMode(false);
        paradaFinal10Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal11Cr3 = findViewById(R.id.txtPERebCR3HF11);
        paradaFinal11Cr3.setFocusableInTouchMode(false);
        paradaFinal11Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal11Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal12Cr3 = findViewById(R.id.txtPERebCR3HF12);
        paradaFinal12Cr3.setFocusableInTouchMode(false);
        paradaFinal12Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal12Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal13Cr3 = findViewById(R.id.txtPERebCR3HF13);
        paradaFinal13Cr3.setFocusableInTouchMode(false);
        paradaFinal13Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal13Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal14Cr3 = findViewById(R.id.txtPERebCR3HF14);
        paradaFinal14Cr3.setFocusableInTouchMode(false);
        paradaFinal14Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal14Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        paradaFinal15Cr3 = findViewById(R.id.txtPERebCR3HF15);
        paradaFinal15Cr3.setFocusableInTouchMode(false);
        paradaFinal15Cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(RebritagemActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal15Cr3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });





        btnRebSincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(RebritagemActivity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(RebritagemActivity.this);
                    View view = LayoutInflater.from(RebritagemActivity.this).inflate(R.layout.sinc_dialog, null);
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

    public void salvar(View view) {
        if (horimetroFinalUa02.getText().toString().equals("")) {
            horimetroFinalUa02.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalUa02.requestFocus();
        } else if (horimetroFinalUa03.getText().toString().equals("")) {
            horimetroFinalUa03.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalUa03.requestFocus();
        } else if (horimetroFinalUa04.getText().toString().equals("")) {
            horimetroFinalUa04.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalUa04.requestFocus();
        } else if (horimetroFinalS3000.getText().toString().equals("")) {
            horimetroFinalS3000.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalS3000.requestFocus();
        } else if (horimetroFinalH4000.getText().toString().equals("")) {
            horimetroFinalH4000.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalH4000.requestFocus();
        } else if (horimetroFinalREMCO.getText().toString().equals("")) {
            horimetroFinalREMCO.setError("CAMPO OBRIGATÓRIO");
            horimetroFinalREMCO.requestFocus();
        } else {


            btnRebSalvar.setVisibility(View.INVISIBLE);
            btnRebSincronizar.setVisibility(View.VISIBLE);
            Rebritagem reb = new Rebritagem(
                    nomeEquipamento.getText().toString(),

                    motorista.getText().toString(),
            data.getText().toString(),
            horaInicial.getText().toString(),
            horaFinal.getText().toString(),
            horimetroInicialUa02.getText().toString(),
            horimetroFinalUa02.getText().toString(),
            horimetroInicialUa03.getText().toString(),
            horimetroFinalUa03.getText().toString(),
            horimetroInicialUa04.getText().toString(),
            horimetroFinalUa04.getText().toString(),
            horimetroInicialS3000.getText().toString(),
            horimetroFinalS3000.getText().toString(),
            horimetroInicialH4000.getText().toString(),
            horimetroFinalH4000.getText().toString(),
            horimetroInicialREMCO.getText().toString(),
            horimetroFinalREMCO.getText().toString(),
            balancaUtc04.getText().toString(),
            balancaUtc05.getText().toString(),

            paradaInicial1Cr1.getText().toString(),
            paradaFinal1Cr1.getText().toString(),
            equipamento1Cr1.getSelectedItem().toString(),
            descricao1Cr1.getSelectedItem().toString(),
            paradaInicial2Cr1.getText().toString(),
            paradaFinal2Cr1.getText().toString(),
            equipamento2Cr1.getSelectedItem().toString(),
            descricao2Cr1.getSelectedItem().toString(),
            paradaInicial3Cr1.getText().toString(),
            paradaFinal3Cr1.getText().toString(),
            equipamento3Cr1.getSelectedItem().toString(),
            descricao3Cr1.getSelectedItem().toString(),
            paradaInicial4Cr1.getText().toString(),
            paradaFinal4Cr1.getText().toString(),
            equipamento4Cr1.getSelectedItem().toString(),
            descricao4Cr1.getSelectedItem().toString(),
            paradaInicial5Cr1.getText().toString(),
            paradaFinal5Cr1.getText().toString(),
            equipamento5Cr1.getSelectedItem().toString(),
            descricao5Cr1.getSelectedItem().toString(),
            paradaInicial6Cr1.getText().toString(),
            paradaFinal6Cr1.getText().toString(),
            equipamento6Cr1.getSelectedItem().toString(),
            descricao6Cr1.getSelectedItem().toString(),
            paradaInicial7Cr1.getText().toString(),
            paradaFinal7Cr1.getText().toString(),
            equipamento7Cr1.getSelectedItem().toString(),
            descricao7Cr1.getSelectedItem().toString(),
            paradaInicial8Cr1.getText().toString(),
            paradaFinal8Cr1.getText().toString(),
            equipamento8Cr1.getSelectedItem().toString(),
            descricao8Cr1.getSelectedItem().toString(),
            paradaInicial9Cr1.getText().toString(),
            paradaFinal9Cr1.getText().toString(),
            equipamento9Cr1.getSelectedItem().toString(),
            descricao9Cr1.getSelectedItem().toString(),
            paradaInicial10Cr1.getText().toString(),
            paradaFinal10Cr1.getText().toString(),
            equipamento10Cr1.getSelectedItem().toString(),
            descricao10Cr1.getSelectedItem().toString(),
            paradaInicial11Cr1.getText().toString(),
            paradaFinal11Cr1.getText().toString(),
            equipamento11Cr1.getSelectedItem().toString(),
            descricao11Cr1.getSelectedItem().toString(),
            paradaInicial12Cr1.getText().toString(),
            paradaFinal12Cr1.getText().toString(),
            equipamento12Cr1.getSelectedItem().toString(),
            descricao12Cr1.getSelectedItem().toString(),
            paradaInicial13Cr1.getText().toString(),
            paradaFinal13Cr1.getText().toString(),
            equipamento13Cr1.getSelectedItem().toString(),
            descricao13Cr1.getSelectedItem().toString(),
            paradaInicial14Cr1.getText().toString(),
            paradaFinal14Cr1.getText().toString(),
            equipamento14Cr1.getSelectedItem().toString(),
            descricao14Cr1.getSelectedItem().toString(),
            paradaInicial15Cr1.getText().toString(),
            paradaFinal15Cr1.getText().toString(),
            equipamento15Cr1.getSelectedItem().toString(),
            descricao15Cr1.getSelectedItem().toString(),

            metalUtc02.getText().toString(),
            engalUa02.getText().toString(),
            engalUr01.getText().toString(),

            paradaInicial1Cr2.getText().toString(),
            paradaFinal1Cr2.getText().toString(),
            equipamento1Cr2.getSelectedItem().toString(),
            descricao1Cr2.getSelectedItem().toString(),
            paradaInicial2Cr2.getText().toString(),
            paradaFinal2Cr2.getText().toString(),
            equipamento2Cr2.getSelectedItem().toString(),
            descricao2Cr2.getSelectedItem().toString(),
            paradaInicial3Cr2.getText().toString(),
            paradaFinal3Cr2.getText().toString(),
            equipamento3Cr2.getSelectedItem().toString(),
            descricao3Cr2.getSelectedItem().toString(),
            paradaInicial4Cr2.getText().toString(),
            paradaFinal4Cr2.getText().toString(),
            equipamento4Cr2.getSelectedItem().toString(),
            descricao4Cr2.getSelectedItem().toString(),
            paradaInicial5Cr2.getText().toString(),
            paradaFinal5Cr2.getText().toString(),
            equipamento5Cr2.getSelectedItem().toString(),
            descricao5Cr2.getSelectedItem().toString(),
            paradaInicial6Cr2.getText().toString(),
            paradaFinal6Cr2.getText().toString(),
            equipamento6Cr2.getSelectedItem().toString(),
            descricao6Cr2.getSelectedItem().toString(),
            paradaInicial7Cr2.getText().toString(),
            paradaFinal7Cr2.getText().toString(),
            equipamento7Cr2.getSelectedItem().toString(),
            descricao7Cr2.getSelectedItem().toString(),
            paradaInicial8Cr2.getText().toString(),
            paradaFinal8Cr2.getText().toString(),
            equipamento8Cr2.getSelectedItem().toString(),
            descricao8Cr2.getSelectedItem().toString(),
            paradaInicial9Cr2.getText().toString(),
            paradaFinal9Cr2.getText().toString(),
            equipamento9Cr2.getSelectedItem().toString(),
            descricao9Cr2.getSelectedItem().toString(),
            paradaInicial10Cr2.getText().toString(),
            paradaFinal10Cr2.getText().toString(),
            equipamento10Cr2.getSelectedItem().toString(),
            descricao10Cr2.getSelectedItem().toString(),
            paradaInicial11Cr2.getText().toString(),
            paradaFinal11Cr2.getText().toString(),
            equipamento11Cr2.getSelectedItem().toString(),
            descricao11Cr2.getSelectedItem().toString(),
            paradaInicial12Cr2.getText().toString(),
            paradaFinal12Cr2.getText().toString(),
            equipamento12Cr2.getSelectedItem().toString(),
            descricao12Cr2.getSelectedItem().toString(),
            paradaInicial13Cr2.getText().toString(),
            paradaFinal13Cr2.getText().toString(),
            equipamento13Cr2.getSelectedItem().toString(),
            descricao13Cr2.getSelectedItem().toString(),
            paradaInicial14Cr2.getText().toString(),
            paradaFinal14Cr2.getText().toString(),
            equipamento14Cr2.getSelectedItem().toString(),
            descricao14Cr2.getSelectedItem().toString(),
            paradaInicial15Cr2.getText().toString(),
            paradaFinal15Cr2.getText().toString(),
            equipamento15Cr2.getSelectedItem().toString(),
            descricao15Cr2.getSelectedItem().toString(),

            metalUtc11.getText().toString(),
            engalUr02.getText().toString(),

            paradaInicial1Cr3.getText().toString(),
            paradaFinal1Cr3.getText().toString(),
            equipamento1Cr3.getSelectedItem().toString(),
            descricao1Cr3.getSelectedItem().toString(),
            paradaInicial2Cr3.getText().toString(),
            paradaFinal2Cr3.getText().toString(),
            equipamento2Cr3.getSelectedItem().toString(),
            descricao2Cr3.getSelectedItem().toString(),
            paradaInicial3Cr3.getText().toString(),
            paradaFinal3Cr3.getText().toString(),
            equipamento3Cr3.getSelectedItem().toString(),
            descricao3Cr3.getSelectedItem().toString(),
            paradaInicial4Cr3.getText().toString(),
            paradaFinal4Cr3.getText().toString(),
            equipamento4Cr3.getSelectedItem().toString(),
            descricao4Cr3.getSelectedItem().toString(),
            paradaInicial5Cr3.getText().toString(),
            paradaFinal5Cr3.getText().toString(),
            equipamento5Cr3.getSelectedItem().toString(),
            descricao5Cr3.getSelectedItem().toString(),
            paradaInicial6Cr3.getText().toString(),
            paradaFinal6Cr3.getText().toString(),
            equipamento6Cr3.getSelectedItem().toString(),
            descricao6Cr3.getSelectedItem().toString(),
            paradaInicial7Cr3.getText().toString(),
            paradaFinal7Cr3.getText().toString(),
            equipamento7Cr3.getSelectedItem().toString(),
            descricao7Cr3.getSelectedItem().toString(),
            paradaInicial8Cr3.getText().toString(),
            paradaFinal8Cr3.getText().toString(),
            equipamento8Cr3.getSelectedItem().toString(),
            descricao8Cr3.getSelectedItem().toString(),
            paradaInicial9Cr3.getText().toString(),
            paradaFinal9Cr3.getText().toString(),
            equipamento9Cr3.getSelectedItem().toString(),
            descricao9Cr3.getSelectedItem().toString(),
            paradaInicial10Cr3.getText().toString(),
            paradaFinal10Cr3.getText().toString(),
            equipamento10Cr3.getSelectedItem().toString(),
            descricao10Cr3.getSelectedItem().toString(),
            paradaInicial11Cr3.getText().toString(),
            paradaFinal11Cr3.getText().toString(),
            equipamento11Cr3.getSelectedItem().toString(),
            descricao11Cr3.getSelectedItem().toString(),
            paradaInicial12Cr3.getText().toString(),
            paradaFinal12Cr3.getText().toString(),
            equipamento12Cr3.getSelectedItem().toString(),
            descricao12Cr3.getSelectedItem().toString(),
            paradaInicial13Cr3.getText().toString(),
            paradaFinal13Cr3.getText().toString(),
            equipamento13Cr3.getSelectedItem().toString(),
            descricao13Cr3.getSelectedItem().toString(),
            paradaInicial14Cr3.getText().toString(),
            paradaFinal14Cr3.getText().toString(),
            equipamento14Cr3.getSelectedItem().toString(),
            descricao14Cr3.getSelectedItem().toString(),
            paradaInicial15Cr3.getText().toString(),
            paradaFinal15Cr3.getText().toString(),
            equipamento15Cr3.getSelectedItem().toString(),
            descricao15Cr3.getSelectedItem().toString(),
            metalUtc09.getText().toString(),


            oleoS3000.getText().toString(),
            oleoH4000.getText().toString(),
            bandejas.getText().toString(),
            rolos.getText().toString(),
            skides.getText().toString(),
            tempCartuchoRemco.getText().toString(),
            tempMotorRemco.getText().toString(),
            vibraRemco.getText().toString(),
            pressaoH4000.getText().toString(),
            pressaoS3000.getText().toString(),
            amperimetros.getText().toString(),


            inicialRachao.getText().toString(),
            inicialB4.getText().toString(),
            inicialB2.getText().toString(),
            retorno.getText().toString(),
            retornoBicaPorcent.getText().toString(),
            retornoBicaHorario.getText().toString(),
            retornoB0Porcent.getText().toString(),
            retornoB0Horario.getText().toString(),
            retornoB1Porcent.getText().toString(),
            retornoB1Horario.getText().toString(),
            retornoPedriscoPorcent.getText().toString(),
            retornoPedriscoHorario.getText().toString(),
            observacoes.getText().toString());

            reb.setMotorista(motorista.getText().toString());
            reb.setData(data.getText().toString());
            reb.setHoraInicial(horaInicial.getText().toString());

            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            reb.setHoraFinal(horaFinal.getText().toString());
            reb.setNomeEquipamento(nomeEquipamento.getText().toString());
            reb.setHorimetroInicialUa02(horimetroInicialUa02.getText().toString());
            reb.setHorimetroFinalUa02(horimetroFinalUa02.getText().toString());
            reb.setHorimetroInicialUa03(horimetroInicialUa03.getText().toString());
            reb.setHorimetroFinalUa03(horimetroFinalUa03.getText().toString());
            reb.setHorimetroInicialUa04(horimetroInicialUa04.getText().toString());
            reb.setHorimetroFinalUa04(horimetroFinalUa04.getText().toString());
            reb.setHorimetroInicialS3000(horimetroInicialS3000.getText().toString());
            reb.setHorimetroFinalS3000(horimetroFinalS3000.getText().toString());
            reb.setHorimetroInicialH4000(horimetroInicialH4000.getText().toString());
            reb.setHorimetroFinalH4000(horimetroFinalH4000.getText().toString());
            reb.setHorimetroInicialRemco(horimetroInicialREMCO.getText().toString());
            reb.setHorimetroFinalRemco(horimetroFinalREMCO.getText().toString());
            reb.setBalancaUtc04(balancaUtc04.getText().toString());
            reb.setBalancaUtc05(balancaUtc05.getText().toString());

            reb.setParadaInicial1Cr1(paradaInicial1Cr1.getText().toString());
            reb.setParadaFinal1Cr1(paradaFinal1Cr1.getText().toString());
            reb.setEquipamento1Cr1(equipamento1Cr1.getSelectedItem().toString());
            reb.setDescricao1Cr1(descricao1Cr1.getSelectedItem().toString());
            reb.setParadaInicial2Cr1(paradaInicial2Cr1.getText().toString());
            reb.setParadaFinal2Cr1(paradaFinal2Cr1.getText().toString());
            reb.setEquipamento2Cr1(equipamento2Cr1.getSelectedItem().toString());
            reb.setDescricao2Cr1(descricao2Cr1.getSelectedItem().toString());
            reb.setParadaInicial3Cr1(paradaInicial3Cr1.getText().toString());
            reb.setParadaFinal3Cr1(paradaFinal3Cr1.getText().toString());
            reb.setEquipamento3Cr1(equipamento3Cr1.getSelectedItem().toString());
            reb.setDescricao3Cr1(descricao3Cr1.getSelectedItem().toString());
            reb.setParadaInicial4Cr1(paradaInicial4Cr1.getText().toString());
            reb.setParadaFinal4Cr1(paradaFinal4Cr1.getText().toString());
            reb.setEquipamento4Cr1(equipamento4Cr1.getSelectedItem().toString());
            reb.setDescricao4Cr1(descricao4Cr1.getSelectedItem().toString());
            reb.setParadaInicial5Cr1(paradaInicial5Cr1.getText().toString());
            reb.setParadaFinal5Cr1(paradaFinal5Cr1.getText().toString());
            reb.setEquipamento5Cr1(equipamento5Cr1.getSelectedItem().toString());
            reb.setDescricao5Cr1(descricao5Cr1.getSelectedItem().toString());
            reb.setParadaInicial6Cr1(paradaInicial6Cr1.getText().toString());
            reb.setParadaFinal6Cr1(paradaFinal6Cr1.getText().toString());
            reb.setEquipamento6Cr1(equipamento6Cr1.getSelectedItem().toString());
            reb.setDescricao6Cr1(descricao6Cr1.getSelectedItem().toString());
            reb.setParadaInicial7Cr1(paradaInicial7Cr1.getText().toString());
            reb.setParadaFinal7Cr1(paradaFinal7Cr1.getText().toString());
            reb.setEquipamento7Cr1(equipamento7Cr1.getSelectedItem().toString());
            reb.setDescricao7Cr1(descricao7Cr1.getSelectedItem().toString());
            reb.setParadaInicial8Cr1(paradaInicial8Cr1.getText().toString());
            reb.setParadaFinal8Cr1(paradaFinal8Cr1.getText().toString());
            reb.setEquipamento8Cr1(equipamento8Cr1.getSelectedItem().toString());
            reb.setDescricao8Cr1(descricao8Cr1.getSelectedItem().toString());
            reb.setParadaInicial9Cr1(paradaInicial9Cr1.getText().toString());
            reb.setParadaFinal9Cr1(paradaFinal9Cr1.getText().toString());
            reb.setEquipamento9Cr1(equipamento9Cr1.getSelectedItem().toString());
            reb.setDescricao9Cr1(descricao9Cr1.getSelectedItem().toString());
            reb.setParadaInicial10Cr1(paradaInicial10Cr1.getText().toString());
            reb.setParadaFinal10Cr1(paradaFinal10Cr1.getText().toString());
            reb.setEquipamento10Cr1(equipamento10Cr1.getSelectedItem().toString());
            reb.setDescricao10Cr1(descricao10Cr1.getSelectedItem().toString());
            reb.setParadaInicial11Cr1(paradaInicial11Cr1.getText().toString());
            reb.setParadaFinal11Cr1(paradaFinal11Cr1.getText().toString());
            reb.setEquipamento11Cr1(equipamento11Cr1.getSelectedItem().toString());
            reb.setDescricao11Cr1(descricao11Cr1.getSelectedItem().toString());
            reb.setParadaInicial12Cr1(paradaInicial12Cr1.getText().toString());
            reb.setParadaFinal12Cr1(paradaFinal12Cr1.getText().toString());
            reb.setEquipamento12Cr1(equipamento12Cr1.getSelectedItem().toString());
            reb.setDescricao12Cr1(descricao12Cr1.getSelectedItem().toString());
            reb.setParadaInicial13Cr1(paradaInicial13Cr1.getText().toString());
            reb.setParadaFinal13Cr1(paradaFinal13Cr1.getText().toString());
            reb.setEquipamento13Cr1(equipamento13Cr1.getSelectedItem().toString());
            reb.setDescricao13Cr1(descricao13Cr1.getSelectedItem().toString());
            reb.setParadaInicial14Cr1(paradaInicial14Cr1.getText().toString());
            reb.setParadaFinal14Cr1(paradaFinal14Cr1.getText().toString());
            reb.setEquipamento14Cr1(equipamento14Cr1.getSelectedItem().toString());
            reb.setDescricao14Cr1(descricao14Cr1.getSelectedItem().toString());
            reb.setParadaInicial15Cr1(paradaInicial15Cr1.getText().toString());
            reb.setParadaFinal15Cr1(paradaFinal15Cr1.getText().toString());
            reb.setEquipamento15Cr1(equipamento15Cr1.getSelectedItem().toString());
            reb.setDescricao15Cr1(descricao15Cr1.getSelectedItem().toString());
            reb.setMetalUtc02(metalUtc02.getText().toString());
            reb.setEngalUa02(engalUa02.getText().toString());
            reb.setEngalUr01(engalUr01.getText().toString());

            reb.setParadaInicial1Cr2(paradaInicial1Cr2.getText().toString());
            reb.setParadaFinal1Cr2(paradaFinal1Cr2.getText().toString());
            reb.setEquipamento1Cr2(equipamento1Cr2.getSelectedItem().toString());
            reb.setDescricao1Cr2(descricao1Cr2.getSelectedItem().toString());
            reb.setParadaInicial2Cr2(paradaInicial2Cr2.getText().toString());
            reb.setParadaFinal2Cr2(paradaFinal2Cr2.getText().toString());
            reb.setEquipamento2Cr2(equipamento2Cr2.getSelectedItem().toString());
            reb.setDescricao2Cr2(descricao2Cr2.getSelectedItem().toString());
            reb.setParadaInicial3Cr2(paradaInicial3Cr2.getText().toString());
            reb.setParadaFinal3Cr2(paradaFinal3Cr2.getText().toString());
            reb.setEquipamento3Cr2(equipamento3Cr2.getSelectedItem().toString());
            reb.setDescricao3Cr2(descricao3Cr2.getSelectedItem().toString());
            reb.setParadaInicial4Cr2(paradaInicial4Cr2.getText().toString());
            reb.setParadaFinal4Cr2(paradaFinal4Cr2.getText().toString());
            reb.setEquipamento4Cr2(equipamento4Cr2.getSelectedItem().toString());
            reb.setDescricao4Cr2(descricao4Cr2.getSelectedItem().toString());
            reb.setParadaInicial5Cr2(paradaInicial5Cr2.getText().toString());
            reb.setParadaFinal5Cr2(paradaFinal5Cr2.getText().toString());
            reb.setEquipamento5Cr2(equipamento5Cr2.getSelectedItem().toString());
            reb.setDescricao5Cr2(descricao5Cr2.getSelectedItem().toString());
            reb.setParadaInicial6Cr2(paradaInicial6Cr2.getText().toString());
            reb.setParadaFinal6Cr2(paradaFinal6Cr2.getText().toString());
            reb.setEquipamento6Cr2(equipamento6Cr2.getSelectedItem().toString());
            reb.setDescricao6Cr2(descricao6Cr2.getSelectedItem().toString());
            reb.setParadaInicial7Cr2(paradaInicial7Cr2.getText().toString());
            reb.setParadaFinal7Cr2(paradaFinal7Cr2.getText().toString());
            reb.setEquipamento7Cr2(equipamento7Cr2.getSelectedItem().toString());
            reb.setDescricao7Cr2(descricao7Cr2.getSelectedItem().toString());
            reb.setParadaInicial8Cr2(paradaInicial8Cr2.getText().toString());
            reb.setParadaFinal8Cr2(paradaFinal8Cr2.getText().toString());
            reb.setEquipamento8Cr2(equipamento8Cr2.getSelectedItem().toString());
            reb.setDescricao8Cr2(descricao8Cr2.getSelectedItem().toString());
            reb.setParadaInicial9Cr2(paradaInicial9Cr2.getText().toString());
            reb.setParadaFinal9Cr2(paradaFinal9Cr2.getText().toString());
            reb.setEquipamento9Cr2(equipamento9Cr2.getSelectedItem().toString());
            reb.setDescricao9Cr2(descricao9Cr2.getSelectedItem().toString());
            reb.setParadaInicial10Cr2(paradaInicial10Cr2.getText().toString());
            reb.setParadaFinal10Cr2(paradaFinal10Cr2.getText().toString());
            reb.setEquipamento10Cr2(equipamento10Cr2.getSelectedItem().toString());
            reb.setDescricao10Cr2(descricao10Cr2.getSelectedItem().toString());
            reb.setParadaInicial11Cr2(paradaInicial11Cr2.getText().toString());
            reb.setParadaFinal11Cr2(paradaFinal11Cr2.getText().toString());
            reb.setEquipamento11Cr2(equipamento11Cr2.getSelectedItem().toString());
            reb.setDescricao11Cr2(descricao11Cr2.getSelectedItem().toString());
            reb.setParadaInicial12Cr2(paradaInicial12Cr2.getText().toString());
            reb.setParadaFinal12Cr2(paradaFinal12Cr2.getText().toString());
            reb.setEquipamento12Cr2(equipamento12Cr2.getSelectedItem().toString());
            reb.setDescricao12Cr2(descricao12Cr2.getSelectedItem().toString());
            reb.setParadaInicial13Cr2(paradaInicial13Cr2.getText().toString());
            reb.setParadaFinal13Cr2(paradaFinal13Cr2.getText().toString());
            reb.setEquipamento13Cr2(equipamento13Cr2.getSelectedItem().toString());
            reb.setDescricao13Cr2(descricao13Cr2.getSelectedItem().toString());
            reb.setParadaInicial14Cr2(paradaInicial14Cr2.getText().toString());
            reb.setParadaFinal14Cr2(paradaFinal14Cr2.getText().toString());
            reb.setEquipamento14Cr2(equipamento14Cr2.getSelectedItem().toString());
            reb.setDescricao14Cr2(descricao14Cr2.getSelectedItem().toString());
            reb.setParadaInicial15Cr2(paradaInicial15Cr2.getText().toString());
            reb.setParadaFinal15Cr2(paradaFinal15Cr2.getText().toString());
            reb.setEquipamento15Cr2(equipamento15Cr2.getSelectedItem().toString());
            reb.setDescricao15Cr2(descricao15Cr2.getSelectedItem().toString());
            reb.setMetalUtc11(metalUtc11.getText().toString());
            reb.setEngalUr02(engalUr02.getText().toString());


            reb.setParadaInicial1Cr3(paradaInicial1Cr3.getText().toString());
            reb.setParadaFinal1Cr3(paradaFinal1Cr3.getText().toString());
            reb.setEquipamento1Cr3(equipamento1Cr3.getSelectedItem().toString());
            reb.setDescricao1Cr3(descricao1Cr3.getSelectedItem().toString());
            reb.setParadaInicial2Cr3(paradaInicial2Cr3.getText().toString());
            reb.setParadaFinal2Cr3(paradaFinal2Cr3.getText().toString());
            reb.setEquipamento2Cr3(equipamento2Cr3.getSelectedItem().toString());
            reb.setDescricao2Cr3(descricao2Cr3.getSelectedItem().toString());
            reb.setParadaInicial3Cr3(paradaInicial3Cr3.getText().toString());
            reb.setParadaFinal3Cr3(paradaFinal3Cr3.getText().toString());
            reb.setEquipamento3Cr3(equipamento3Cr3.getSelectedItem().toString());
            reb.setDescricao3Cr3(descricao3Cr3.getSelectedItem().toString());
            reb.setParadaInicial4Cr3(paradaInicial4Cr3.getText().toString());
            reb.setParadaFinal4Cr3(paradaFinal4Cr3.getText().toString());
            reb.setEquipamento4Cr3(equipamento4Cr3.getSelectedItem().toString());
            reb.setDescricao4Cr3(descricao4Cr3.getSelectedItem().toString());
            reb.setParadaInicial5Cr3(paradaInicial5Cr3.getText().toString());
            reb.setParadaFinal5Cr3(paradaFinal5Cr3.getText().toString());
            reb.setEquipamento5Cr3(equipamento5Cr3.getSelectedItem().toString());
            reb.setDescricao5Cr3(descricao5Cr3.getSelectedItem().toString());
            reb.setParadaInicial6Cr3(paradaInicial6Cr3.getText().toString());
            reb.setParadaFinal6Cr3(paradaFinal6Cr3.getText().toString());
            reb.setEquipamento6Cr3(equipamento6Cr3.getSelectedItem().toString());
            reb.setDescricao6Cr3(descricao6Cr3.getSelectedItem().toString());
            reb.setParadaInicial7Cr3(paradaInicial7Cr3.getText().toString());
            reb.setParadaFinal7Cr3(paradaFinal7Cr3.getText().toString());
            reb.setEquipamento7Cr3(equipamento7Cr3.getSelectedItem().toString());
            reb.setDescricao7Cr3(descricao7Cr3.getSelectedItem().toString());
            reb.setParadaInicial8Cr3(paradaInicial8Cr3.getText().toString());
            reb.setParadaFinal8Cr3(paradaFinal8Cr3.getText().toString());
            reb.setEquipamento8Cr3(equipamento8Cr3.getSelectedItem().toString());
            reb.setDescricao8Cr3(descricao8Cr3.getSelectedItem().toString());
            reb.setParadaInicial9Cr3(paradaInicial9Cr3.getText().toString());
            reb.setParadaFinal9Cr3(paradaFinal9Cr3.getText().toString());
            reb.setEquipamento9Cr3(equipamento9Cr3.getSelectedItem().toString());
            reb.setDescricao9Cr3(descricao9Cr3.getSelectedItem().toString());
            reb.setParadaInicial10Cr3(paradaInicial10Cr3.getText().toString());
            reb.setParadaFinal10Cr3(paradaFinal10Cr3.getText().toString());
            reb.setEquipamento10Cr3(equipamento10Cr3.getSelectedItem().toString());
            reb.setDescricao10Cr3(descricao10Cr3.getSelectedItem().toString());
            reb.setParadaInicial11Cr3(paradaInicial11Cr3.getText().toString());
            reb.setParadaFinal11Cr3(paradaFinal11Cr3.getText().toString());
            reb.setEquipamento11Cr3(equipamento11Cr3.getSelectedItem().toString());
            reb.setDescricao11Cr3(descricao11Cr3.getSelectedItem().toString());
            reb.setParadaInicial12Cr3(paradaInicial12Cr3.getText().toString());
            reb.setParadaFinal12Cr3(paradaFinal12Cr3.getText().toString());
            reb.setEquipamento12Cr3(equipamento12Cr3.getSelectedItem().toString());
            reb.setDescricao12Cr3(descricao12Cr3.getSelectedItem().toString());
            reb.setParadaInicial13Cr3(paradaInicial13Cr3.getText().toString());
            reb.setParadaFinal13Cr3(paradaFinal13Cr3.getText().toString());
            reb.setEquipamento13Cr3(equipamento13Cr3.getSelectedItem().toString());
            reb.setDescricao13Cr3(descricao13Cr3.getSelectedItem().toString());
            reb.setParadaInicial14Cr3(paradaInicial14Cr3.getText().toString());
            reb.setParadaFinal14Cr3(paradaFinal14Cr3.getText().toString());
            reb.setEquipamento14Cr3(equipamento14Cr3.getSelectedItem().toString());
            reb.setDescricao14Cr3(descricao14Cr3.getSelectedItem().toString());
            reb.setParadaInicial15Cr3(paradaInicial15Cr3.getText().toString());
            reb.setParadaFinal15Cr3(paradaFinal15Cr3.getText().toString());
            reb.setEquipamento15Cr3(equipamento15Cr3.getSelectedItem().toString());
            reb.setDescricao15Cr3(descricao15Cr3.getSelectedItem().toString());
            reb.setMetalUtc09(metalUtc09.getText().toString());



            if (oleoS3000.isChecked()) {
                oleoS3000.setText("Não");
                reb.setOleoS3000(oleoS3000.getText().toString());
            } else {
                oleoS3000.setText("Sim");
                reb.setOleoS3000(oleoS3000.getText().toString());
            }

            if (oleoH4000.isChecked()) {
                oleoH4000.setText("Não");
                reb.setOleoH4000(oleoH4000.getText().toString());
            } else {
                oleoH4000.setText("Sim");
                reb.setOleoH4000(oleoH4000.getText().toString());
            }


            if (bandejas.isChecked()) {
                bandejas.setText("Não");
                reb.setBandejas(bandejas.getText().toString());
            } else {
                bandejas.setText("Sim");
                reb.setBandejas(bandejas.getText().toString());
            }
            if (rolos.isChecked()) {
                rolos.setText("Não");
                reb.setRolos(rolos.getText().toString());
            } else {
                rolos.setText("Sim");
                reb.setRolos(rolos.getText().toString());
            }

            if (skides.isChecked()) {
                skides.setText("Não");
                reb.setSkides(skides.getText().toString());
            } else {
                skides.setText("Sim");
                reb.setSkides(skides.getText().toString());
            }

            if (tempCartuchoRemco.isChecked()) {
                tempCartuchoRemco.setText("Não");
                reb.setTempCartuchoRemco(tempCartuchoRemco.getText().toString());
            } else {
                tempCartuchoRemco.setText("Sim");
                reb.setTempCartuchoRemco(tempCartuchoRemco.getText().toString());
            }

            if (tempMotorRemco.isChecked()) {
                tempMotorRemco.setText("Não");
                reb.setTempMotorRemco(tempMotorRemco.getText().toString());
            } else {
                tempMotorRemco.setText("Sim");
                reb.setTempMotorRemco(tempMotorRemco.getText().toString());
            }
            if (vibraRemco.isChecked()) {
                vibraRemco.setText("Não");
                reb.setVibraRemco(vibraRemco.getText().toString());
            } else {
                vibraRemco.setText("Sim");
                reb.setVibraRemco(vibraRemco.getText().toString());
            }
            if (pressaoH4000.isChecked()) {
                pressaoH4000.setText("Não");
                reb.setPressaoH4000(pressaoH4000.getText().toString());
            } else {
                pressaoH4000.setText("Sim");
                reb.setPressaoH4000(pressaoH4000.getText().toString());
            }
            if (pressaoS3000.isChecked()) {
                pressaoS3000.setText("Não");
                reb.setPressaoS3000(pressaoS3000.getText().toString());
            } else {
                pressaoS3000.setText("Sim");
                reb.setPressaoS3000(pressaoS3000.getText().toString());
            }
            if (amperimetros.isChecked()) {
                amperimetros.setText("Não");
                reb.setAmperimetros(amperimetros.getText().toString());
            } else {
                amperimetros.setText("Sim");
                reb.setAmperimetros(amperimetros.getText().toString());
            }

            reb.setInicialRachao(inicialRachao.getText().toString());
            reb.setInicialB4(inicialB4.getText().toString());
            reb.setInicialB2(inicialB2.getText().toString());
            reb.setRetorno(retorno.getText().toString());
            reb.setRetornoBicaPorcent(retornoBicaPorcent.getText().toString());
            reb.setRetornoBicaHorario(retornoBicaHorario.getText().toString());
            reb.setRetornoB0Porcent(retornoB0Porcent.getText().toString());
            reb.setRetornoB0Horario(retornoB0Horario.getText().toString());
            reb.setRetornoB1Porcent(retornoB1Porcent.getText().toString());
            reb.setRetornoB1Horario(retornoB1Horario.getText().toString());
            reb.setRetornoPedriscoPorcent(retornoPedriscoPorcent.getText().toString());
            reb.setRetornoPedriscoHorario(retornoPedriscoHorario.getText().toString());
            reb.setObservacoes(observacoes.getText().toString());



            long id = dao.inserir(reb);
            Toast.makeText(this, "rebritagem inserido com id: " + id, Toast.LENGTH_SHORT).show();


            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //startActivity(intent);



        }
    }



    public void sincronizar(View view){

        Rebritagem reb = new Rebritagem(
                nomeEquipamento.getText().toString(),

                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                horimetroInicialUa02.getText().toString(),
                horimetroFinalUa02.getText().toString(),
                horimetroInicialUa03.getText().toString(),
                horimetroFinalUa03.getText().toString(),
                horimetroInicialUa04.getText().toString(),
                horimetroFinalUa04.getText().toString(),
                horimetroInicialS3000.getText().toString(),
                horimetroFinalS3000.getText().toString(),
                horimetroInicialH4000.getText().toString(),
                horimetroFinalH4000.getText().toString(),
                horimetroInicialREMCO.getText().toString(),
                horimetroFinalREMCO.getText().toString(),
                balancaUtc04.getText().toString(),
                balancaUtc05.getText().toString(),

                paradaInicial1Cr1.getText().toString(),
                paradaFinal1Cr1.getText().toString(),
                equipamento1Cr1.getSelectedItem().toString(),
                descricao1Cr1.getSelectedItem().toString(),
                paradaInicial2Cr1.getText().toString(),
                paradaFinal2Cr1.getText().toString(),
                equipamento2Cr1.getSelectedItem().toString(),
                descricao2Cr1.getSelectedItem().toString(),
                paradaInicial3Cr1.getText().toString(),
                paradaFinal3Cr1.getText().toString(),
                equipamento3Cr1.getSelectedItem().toString(),
                descricao3Cr1.getSelectedItem().toString(),
                paradaInicial4Cr1.getText().toString(),
                paradaFinal4Cr1.getText().toString(),
                equipamento4Cr1.getSelectedItem().toString(),
                descricao4Cr1.getSelectedItem().toString(),
                paradaInicial5Cr1.getText().toString(),
                paradaFinal5Cr1.getText().toString(),
                equipamento5Cr1.getSelectedItem().toString(),
                descricao5Cr1.getSelectedItem().toString(),
                paradaInicial6Cr1.getText().toString(),
                paradaFinal6Cr1.getText().toString(),
                equipamento6Cr1.getSelectedItem().toString(),
                descricao6Cr1.getSelectedItem().toString(),
                paradaInicial7Cr1.getText().toString(),
                paradaFinal7Cr1.getText().toString(),
                equipamento7Cr1.getSelectedItem().toString(),
                descricao7Cr1.getSelectedItem().toString(),
                paradaInicial8Cr1.getText().toString(),
                paradaFinal8Cr1.getText().toString(),
                equipamento8Cr1.getSelectedItem().toString(),
                descricao8Cr1.getSelectedItem().toString(),
                paradaInicial9Cr1.getText().toString(),
                paradaFinal9Cr1.getText().toString(),
                equipamento9Cr1.getSelectedItem().toString(),
                descricao9Cr1.getSelectedItem().toString(),
                paradaInicial10Cr1.getText().toString(),
                paradaFinal10Cr1.getText().toString(),
                equipamento10Cr1.getSelectedItem().toString(),
                descricao10Cr1.getSelectedItem().toString(),
                paradaInicial11Cr1.getText().toString(),
                paradaFinal11Cr1.getText().toString(),
                equipamento11Cr1.getSelectedItem().toString(),
                descricao11Cr1.getSelectedItem().toString(),
                paradaInicial12Cr1.getText().toString(),
                paradaFinal12Cr1.getText().toString(),
                equipamento12Cr1.getSelectedItem().toString(),
                descricao12Cr1.getSelectedItem().toString(),
                paradaInicial13Cr1.getText().toString(),
                paradaFinal13Cr1.getText().toString(),
                equipamento13Cr1.getSelectedItem().toString(),
                descricao13Cr1.getSelectedItem().toString(),
                paradaInicial14Cr1.getText().toString(),
                paradaFinal14Cr1.getText().toString(),
                equipamento14Cr1.getSelectedItem().toString(),
                descricao14Cr1.getSelectedItem().toString(),
                paradaInicial15Cr1.getText().toString(),
                paradaFinal15Cr1.getText().toString(),
                equipamento15Cr1.getSelectedItem().toString(),
                descricao15Cr1.getSelectedItem().toString(),

                metalUtc02.getText().toString(),
                engalUa02.getText().toString(),
                engalUr01.getText().toString(),

                paradaInicial1Cr2.getText().toString(),
                paradaFinal1Cr2.getText().toString(),
                equipamento1Cr2.getSelectedItem().toString(),
                descricao1Cr2.getSelectedItem().toString(),
                paradaInicial2Cr2.getText().toString(),
                paradaFinal2Cr2.getText().toString(),
                equipamento2Cr2.getSelectedItem().toString(),
                descricao2Cr2.getSelectedItem().toString(),
                paradaInicial3Cr2.getText().toString(),
                paradaFinal3Cr2.getText().toString(),
                equipamento3Cr2.getSelectedItem().toString(),
                descricao3Cr2.getSelectedItem().toString(),
                paradaInicial4Cr2.getText().toString(),
                paradaFinal4Cr2.getText().toString(),
                equipamento4Cr2.getSelectedItem().toString(),
                descricao4Cr2.getSelectedItem().toString(),
                paradaInicial5Cr2.getText().toString(),
                paradaFinal5Cr2.getText().toString(),
                equipamento5Cr2.getSelectedItem().toString(),
                descricao5Cr2.getSelectedItem().toString(),
                paradaInicial6Cr2.getText().toString(),
                paradaFinal6Cr2.getText().toString(),
                equipamento6Cr2.getSelectedItem().toString(),
                descricao6Cr2.getSelectedItem().toString(),
                paradaInicial7Cr2.getText().toString(),
                paradaFinal7Cr2.getText().toString(),
                equipamento7Cr2.getSelectedItem().toString(),
                descricao7Cr2.getSelectedItem().toString(),
                paradaInicial8Cr2.getText().toString(),
                paradaFinal8Cr2.getText().toString(),
                equipamento8Cr2.getSelectedItem().toString(),
                descricao8Cr2.getSelectedItem().toString(),
                paradaInicial9Cr2.getText().toString(),
                paradaFinal9Cr2.getText().toString(),
                equipamento9Cr2.getSelectedItem().toString(),
                descricao9Cr2.getSelectedItem().toString(),
                paradaInicial10Cr2.getText().toString(),
                paradaFinal10Cr2.getText().toString(),
                equipamento10Cr2.getSelectedItem().toString(),
                descricao10Cr2.getSelectedItem().toString(),
                paradaInicial11Cr2.getText().toString(),
                paradaFinal11Cr2.getText().toString(),
                equipamento11Cr2.getSelectedItem().toString(),
                descricao11Cr2.getSelectedItem().toString(),
                paradaInicial12Cr2.getText().toString(),
                paradaFinal12Cr2.getText().toString(),
                equipamento12Cr2.getSelectedItem().toString(),
                descricao12Cr2.getSelectedItem().toString(),
                paradaInicial13Cr2.getText().toString(),
                paradaFinal13Cr2.getText().toString(),
                equipamento13Cr2.getSelectedItem().toString(),
                descricao13Cr2.getSelectedItem().toString(),
                paradaInicial14Cr2.getText().toString(),
                paradaFinal14Cr2.getText().toString(),
                equipamento14Cr2.getSelectedItem().toString(),
                descricao14Cr2.getSelectedItem().toString(),
                paradaInicial15Cr2.getText().toString(),
                paradaFinal15Cr2.getText().toString(),
                equipamento15Cr2.getSelectedItem().toString(),
                descricao15Cr2.getSelectedItem().toString(),

                metalUtc11.getText().toString(),
                engalUr02.getText().toString(),

                paradaInicial1Cr3.getText().toString(),
                paradaFinal1Cr3.getText().toString(),
                equipamento1Cr3.getSelectedItem().toString(),
                descricao1Cr3.getSelectedItem().toString(),
                paradaInicial2Cr3.getText().toString(),
                paradaFinal2Cr3.getText().toString(),
                equipamento2Cr3.getSelectedItem().toString(),
                descricao2Cr3.getSelectedItem().toString(),
                paradaInicial3Cr3.getText().toString(),
                paradaFinal3Cr3.getText().toString(),
                equipamento3Cr3.getSelectedItem().toString(),
                descricao3Cr3.getSelectedItem().toString(),
                paradaInicial4Cr3.getText().toString(),
                paradaFinal4Cr3.getText().toString(),
                equipamento4Cr3.getSelectedItem().toString(),
                descricao4Cr3.getSelectedItem().toString(),
                paradaInicial5Cr3.getText().toString(),
                paradaFinal5Cr3.getText().toString(),
                equipamento5Cr3.getSelectedItem().toString(),
                descricao5Cr3.getSelectedItem().toString(),
                paradaInicial6Cr3.getText().toString(),
                paradaFinal6Cr3.getText().toString(),
                equipamento6Cr3.getSelectedItem().toString(),
                descricao6Cr3.getSelectedItem().toString(),
                paradaInicial7Cr3.getText().toString(),
                paradaFinal7Cr3.getText().toString(),
                equipamento7Cr3.getSelectedItem().toString(),
                descricao7Cr3.getSelectedItem().toString(),
                paradaInicial8Cr3.getText().toString(),
                paradaFinal8Cr3.getText().toString(),
                equipamento8Cr3.getSelectedItem().toString(),
                descricao8Cr3.getSelectedItem().toString(),
                paradaInicial9Cr3.getText().toString(),
                paradaFinal9Cr3.getText().toString(),
                equipamento9Cr3.getSelectedItem().toString(),
                descricao9Cr3.getSelectedItem().toString(),
                paradaInicial10Cr3.getText().toString(),
                paradaFinal10Cr3.getText().toString(),
                equipamento10Cr3.getSelectedItem().toString(),
                descricao10Cr3.getSelectedItem().toString(),
                paradaInicial11Cr3.getText().toString(),
                paradaFinal11Cr3.getText().toString(),
                equipamento11Cr3.getSelectedItem().toString(),
                descricao11Cr3.getSelectedItem().toString(),
                paradaInicial12Cr3.getText().toString(),
                paradaFinal12Cr3.getText().toString(),
                equipamento12Cr3.getSelectedItem().toString(),
                descricao12Cr3.getSelectedItem().toString(),
                paradaInicial13Cr3.getText().toString(),
                paradaFinal13Cr3.getText().toString(),
                equipamento13Cr3.getSelectedItem().toString(),
                descricao13Cr3.getSelectedItem().toString(),
                paradaInicial14Cr3.getText().toString(),
                paradaFinal14Cr3.getText().toString(),
                equipamento14Cr3.getSelectedItem().toString(),
                descricao14Cr3.getSelectedItem().toString(),
                paradaInicial15Cr3.getText().toString(),
                paradaFinal15Cr3.getText().toString(),
                equipamento15Cr3.getSelectedItem().toString(),
                descricao15Cr3.getSelectedItem().toString(),
                metalUtc09.getText().toString(),


                oleoS3000.getText().toString(),
                oleoH4000.getText().toString(),
                bandejas.getText().toString(),
                rolos.getText().toString(),
                skides.getText().toString(),
                tempCartuchoRemco.getText().toString(),
                tempMotorRemco.getText().toString(),
                vibraRemco.getText().toString(),
                pressaoH4000.getText().toString(),
                pressaoS3000.getText().toString(),
                amperimetros.getText().toString(),


                inicialRachao.getText().toString(),
                inicialB4.getText().toString(),
                inicialB2.getText().toString(),
                retorno.getText().toString(),
                retornoBicaPorcent.getText().toString(),
                retornoBicaHorario.getText().toString(),
                retornoB0Porcent.getText().toString(),
                retornoB0Horario.getText().toString(),
                retornoB1Porcent.getText().toString(),
                retornoB1Horario.getText().toString(),
                retornoPedriscoPorcent.getText().toString(),
                retornoPedriscoHorario.getText().toString(),
                observacoes.getText().toString());

        long id = dao2.inserir(reb);
        RebritagemService apiService = retrofit.create(RebritagemService.class);
        Call<Rebritagem> call = apiService.salvarInfoRebritagem(reb);

        call.enqueue(new Callback<Rebritagem>(){
            @Override
            public void onResponse(Call<Rebritagem> call, Response<Rebritagem> response) {
                if (response.isSuccessful()){
                    Rebritagem infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Rebritagem> call, Throwable t) {

            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(RebritagemActivity.this);
        View view= LayoutInflater.from(RebritagemActivity.this).inflate(R.layout.alert_dialog,null);
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
