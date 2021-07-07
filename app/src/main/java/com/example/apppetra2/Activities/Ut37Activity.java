package com.example.apppetra2.Activities;

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

import androidx.appcompat.app.AppCompatActivity;

import com.example.apppetra2.Classes.Ut37;
import com.example.apppetra2.Classes.Ut37;
import com.example.apppetra2.Classes.Ut37;
import com.example.apppetra2.DAO.Ut37DAO;
import com.example.apppetra2.DAO.Ut37DAOSync;
import com.example.apppetra2.DAO.Ut37DAO;
import com.example.apppetra2.DAO.Ut37DAO;
import com.example.apppetra2.Interfaces.Ut37Service;
import com.example.apppetra2.Interfaces.Ut37Service;
import com.example.apppetra2.Interfaces.Ut37Service;
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


public class Ut37Activity extends AppCompatActivity {


    public Button btnUt37Cancelar;
    private Button btnUt37Salvar;
    private Button btnUt37Sincronizar;


    int numero78078 = 0;
    int numero78089 = 0;
    int numero780910 = 0;
    int numero7801011 = 0;
    int numero7801112 = 0;
    int numero7801213 = 0;
    int numero7801314 = 0;
    int numero7801415 = 0;
    int numero7801516 = 0;
    int numero7801617 = 0;
    int numero7801718 = 0;

    int numeroAMPr = 0;
    int numeroAMUM = 0;
    int numeroAF = 0;
    int numeroPr = 0;
    int numeroBiPr = 0;
    int numeroBi790 = 0;
    int numeroBiUM = 0;
    int numeroBrPr = 0;
    int numeroBr119 = 0;
    int numeroBr0Pr = 0;
    int numeroBr0UM = 0;
    int numeroBiForro = 0;
    int numeroB0 = 0;
    int numeroB1 = 0;
    int numeroB2 = 0;
    int numeroAIM = 0;
    int numeroFundo = 0;
    int Fogacho780 = 0;
    int Fogacho790 = 0;
    int Fogacho800 = 0;
    int Fogacho810 = 0;


    public Button btnUt37Viagens78078Mais;
    public Button btnUt37Viagens78078Menos;
    public Button btnUt37Viagens78089Mais;
    public Button btnUt37Viagens78089Menos;
    public Button btnUt37Viagens780910Mais;
    public Button btnUt37Viagens780910Menos;
    public Button btnUt37Viagens7801011Mais;
    public Button btnUt37Viagens7801011Menos;
    public Button btnUt37Viagens7801112Mais;
    public Button btnUt37Viagens7801112Menos;
    public Button btnUt37Viagens7801213Mais;
    public Button btnUt37Viagens7801213Menos;
    public Button btnUt37Viagens7801314Mais;
    public Button btnUt37Viagens7801314Menos;
    public Button btnUt37Viagens7801415Mais;
    public Button btnUt37Viagens7801415Menos;
    public Button btnUt37Viagens7801516Mais;
    public Button btnUt37Viagens7801516Menos;
    public Button btnUt37Viagens7801617Mais;
    public Button btnUt37Viagens7801617Menos;
    public Button btnUt37Viagens7801718Mais;
    public Button btnUt37Viagens7801718Menos;
    public Button btnUt37VEAMMais;
    public Button btnUt37VEAMMenos;
    public Button btnUt37VEAMUMMais;
    public Button btnUt37VEAMUMMenos;
    public Button btnUt37VEAFMais;
    public Button btnUt37VEAFMenos;
    public Button btnUt37VEPedrMais;
    public Button btnUt37VEPedrMenos;
    public Button btnUt37VEBicaPrMais;
    public Button btnUt37VEBicaPrMenos;
    public Button btnUt37VEBica790Mais;
    public Button btnUt37VEBica790Menos;
    public Button btnUt37VEBicaUMMais;
    public Button btnUt37VEBicaUMMenos;
    public Button btnUt37VEB1PrMais;
    public Button btnUt37VEB1PrMenos;
    public Button btnUt37VEB119Mais;
    public Button btnUt37VEB119Menos;
    public Button btnUt37VEB0PrMais;
    public Button btnUt37VEB0PrMenos;
    public Button btnUt37VEB0UMMais;
    public Button btnUt37VEB0UMMenos;
    public Button btnUt37ViagensDServForroMais;
    public Button btnUt37ViagensDServForroMenos;
    public Button btnUt37ViagensDServB0Mais;
    public Button btnUt37ViagensDServB0Menos;
    public Button btnUt37ViagensDServB1Mais;
    public Button btnUt37ViagensDServB1Menos;
    public Button btnUt37ViagensDServB2Mais;
    public Button btnUt37ViagensDServB2Menos;
    public Button btnUt37ViagensDServAIMMais;
    public Button btnUt37ViagensDServAIMMenos;
    public Button btnUt37ViagensDServFundoMais;
    public Button btnUt37ViagensDServFundoMenos;
    public Button btnUt37ViagensFogacho780Mais;
    public Button btnUt37ViagensFogacho780Menos;
    public Button btnUt37ViagensFogacho790Mais;
    public Button btnUt37ViagensFogacho790Menos;
    public Button btnUt37ViagensFogacho800Mais;
    public Button btnUt37ViagensFogacho800Menos;
    public Button btnUt37ViagensFogacho810Mais;
    public Button btnUt37ViagensFogacho810Menos;


    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText horimetroInicial;
    private EditText horimetroFinal;
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
    private CheckBox lanternagem;
    private CheckBox pneus;
    private CheckBox h2o;
    private CheckBox oleo;
    private CheckBox direcao;
    private CheckBox freios;
    private CheckBox parteEletrica;
    private EditText observacoes;
    private Spinner condicaoPista;


    private TextView numViagens78078;
    private TextView numViagens78089;
    private TextView numViagens780910;
    private TextView numViagens7801011;
    private TextView numViagens7801112;
    private TextView numViagens7801213;
    private TextView numViagens7801314;
    private TextView numViagens7801415;
    private TextView numViagens7801516;
    private TextView numViagens7801617;
    private TextView numViagens7801718;
    private TextView obs78;
    private TextView obs89;
    private TextView obs910;
    private TextView obs1011;
    private TextView obs1112;
    private TextView obs1213;
    private TextView obs1314;
    private TextView obs1415;
    private TextView obs1516;
    private TextView obs1617;
    private TextView obs1718;
    private TextView numViagensAm;
    private TextView numViagensBicaCont;
    private TextView numViagensAf;
    private TextView numViagensPedrisco;
    private TextView numViagensBicaPr;
    private TextView numViagensBica790;
    private TextView numViagensBicaUm;
    private TextView numViagensBr1Pr;
    private TextView numViagensBr119;
    private TextView numViagensBr0Pr;
    private TextView numViagensBr0Um;
    private TextView numViagensBicaForro;
    private TextView numViagensB0;
    private TextView numViagensB1;
    private TextView numViagensB2;
    private TextView numViagensAim;
    private TextView numViagensFundo;
    private TextView numViagens780;
    private TextView numViagens790;
    private TextView numViagens800;
    private TextView numViagens810;
    private EditText condicaoPistaObservacoes;
    private TextView soma780;
    private Ut37DAO dao;
    private Ut37DAOSync dao2;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut37);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUt37Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        data = findViewById(R.id.txtUt37Data);
        horaInicial = findViewById(R.id.txtUt37HI);
        horaFinal = findViewById(R.id.txtUt37HF);
        horimetroInicial = findViewById(R.id.txtUt37HoriI);
        horimetroFinal = findViewById(R.id.txtUt37HoriF);
        paradaInicial1 = findViewById(R.id.txtPEUt37HI1);
        paradaFinal1 = findViewById(R.id.txtPEUt37HF1);
        descricao1 = findViewById(R.id.spPEUt37Desc1);
        paradaInicial2 = findViewById(R.id.txtPEUt37HI2);
        paradaFinal2 = findViewById(R.id.txtPEUt37HF2);
        descricao2 = findViewById(R.id.spPEUt37Desc2);
        paradaInicial3 = findViewById(R.id.txtPEUt37HI3);
        paradaFinal3 = findViewById(R.id.txtPEUt37HF3);
        descricao3 = findViewById(R.id.spPEUt37Desc3);
        paradaInicial4 = findViewById(R.id.txtPEUt37HI4);
        paradaFinal4 = findViewById(R.id.txtPEUt37HF4);
        descricao4 = findViewById(R.id.spPEUt37Desc4);
        paradaInicial5 = findViewById(R.id.txtPEUt37HI5);
        paradaFinal5 = findViewById(R.id.txtPEUt37HF5);
        descricao5 = findViewById(R.id.spPEUt37Desc5);
        paradaInicial6 = findViewById(R.id.txtPEUt37HI6);
        paradaFinal6 = findViewById(R.id.txtPEUt37HF6);
        descricao6 = findViewById(R.id.spPEUt37Desc6);
        paradaInicial7 = findViewById(R.id.txtPEUt37HI7);
        paradaFinal7 = findViewById(R.id.txtPEUt37HF7);
        descricao7 = findViewById(R.id.spPEUt37Desc7);
        paradaInicial8 = findViewById(R.id.txtPEUt37HI8);
        paradaFinal8 = findViewById(R.id.txtPEUt37HF8);
        descricao8 = findViewById(R.id.spPEUt37Desc8);
        paradaInicial9 = findViewById(R.id.txtPEUt37HI9);
        paradaFinal9 = findViewById(R.id.txtPEUt37HF9);
        descricao9 = findViewById(R.id.spPEUt37Desc9);
        paradaInicial10 = findViewById(R.id.txtPEUt37HI10);
        paradaFinal10 = findViewById(R.id.txtPEUt37HF10);
        descricao10 = findViewById(R.id.spPEUt37Desc10);
        lanternagem = findViewById(R.id.chkUt37Lant);
        pneus = findViewById(R.id.chkUt37Pn);
        h2o = findViewById(R.id.chkUt37H2O);
        oleo = findViewById(R.id.chkUt37Ol);
        direcao = findViewById(R.id.chkUt37Dir);
        freios = findViewById(R.id.chkUt37Fr);
        parteEletrica = findViewById(R.id.chkUt37PtElet);
        observacoes = findViewById(R.id.txtUt37Obs);
        condicaoPista = findViewById(R.id.spUt37CondPista);
        numViagens78078 = findViewById(R.id.txtUt37NumViagens78078);
        numViagens78089 = findViewById(R.id.txtUt37NumViagens78089);
        numViagens780910 = findViewById(R.id.txtUt37NumViagens780910);
        numViagens7801011 = findViewById(R.id.txtUt37NumViagens7801011);
        numViagens7801112 = findViewById(R.id.txtUt37NumViagens7801112);
        numViagens7801213 = findViewById(R.id.txtUt37NumViagens7801213);
        numViagens7801314 = findViewById(R.id.txtUt37NumViagens7801314);
        numViagens7801415 = findViewById(R.id.txtUt37NumViagens7801415);
        numViagens7801516 = findViewById(R.id.txtUt37NumViagens7801516);
        numViagens7801617 = findViewById(R.id.txtUt37NumViagens7801617);
        numViagens7801718 = findViewById(R.id.txtUt37NumViagens7801718);
        obs78=findViewById(R.id.txtUt37Obs78);
        obs89=findViewById(R.id.txtUt37Obs89);
        obs910=findViewById(R.id.txtUt37Obs910);
        obs1011=findViewById(R.id.txtUt37Obs1011);
        obs1112=findViewById(R.id.txtUt37Obs1112);
        obs1213=findViewById(R.id.txtUt37Obs1213);
        obs1314=findViewById(R.id.txtUt37Obs1314);
        obs1415=findViewById(R.id.txtUt37Obs1415);
        obs1516=findViewById(R.id.txtUt37Obs1516);
        obs1617=findViewById(R.id.txtUt37Obs1617);
        obs1718=findViewById(R.id.txtUt37Obs1718);
        numViagensAm = findViewById(R.id.txtUt37NumViagensEstoqueAM);
        numViagensBicaCont = findViewById(R.id.txtUt37NumViagensEstoqueAMUM);
        numViagensAf = findViewById(R.id.txtUt37NumViagensEstoqueAF);
        numViagensPedrisco = findViewById(R.id.txtUt37NumViagensEstoquePedrisco);
        numViagensBicaPr = findViewById(R.id.txtUt37NumViagensEstoqueBicaPr);
        numViagensBica790 = findViewById(R.id.txtUt37NumViagensEstoque790);
        numViagensBicaUm = findViewById(R.id.txtUt37NumViagensEstoqueBicaUM);
        numViagensBr1Pr = findViewById(R.id.txtUt37NumViagensEstoqueB1Pr);
        numViagensBr119 = findViewById(R.id.txtUt37NumViagensEstoqueB119);
        numViagensBr0Pr = findViewById(R.id.txtUt37NumViagensEstoqueB0Pr);
        numViagensBr0Um = findViewById(R.id.txtUt37NumViagensEstoqueB0UM);
        numViagensBicaForro = findViewById(R.id.txtUt37NumViagensDServForro);
        numViagensB0 = findViewById(R.id.txtUt37NumViagensDServB0);
        numViagensB1 = findViewById(R.id.txtUt37NumViagensDServB1);
        numViagensB2 = findViewById(R.id.txtUt37NumViagensDServB2);
        numViagensAim = findViewById(R.id.txtUt37NumViagensDServAIM);
        numViagensFundo = findViewById(R.id.txtUt37NumViagensDServFundo);
        numViagens780 = findViewById(R.id.txtUt37NumViagensFogacho780);
        numViagens790 = findViewById(R.id.txtUt37NumViagensFogacho790);
        numViagens800 = findViewById(R.id.txtUt37NumViagensFogacho800);
        numViagens810 = findViewById(R.id.txtUt37NumViagensFogacho810);
        soma780 = findViewById(R.id.txtUt37NumViagensSoma780);
        btnUt37Salvar=findViewById(R.id.btnUt37Save);
        btnUt37Sincronizar=findViewById(R.id.btnUt37Sincronizar);
        btnUt37Sincronizar.setVisibility(View.INVISIBLE);
        condicaoPistaObservacoes = findViewById(R.id.txtUt37CondPistaObs);
        dao = new Ut37DAO(this);
        dao2=new Ut37DAOSync(this);


        TextView horaI = (TextView) findViewById(R.id.txtUt37HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUt37Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        Spinner spPEUt37Desc1 = findViewById(R.id.spPEUt37Desc1);
        ArrayAdapter<CharSequence> adapterDesc = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc1.setAdapter(adapterDesc);


        Spinner spPEUt37Desc2 = findViewById(R.id.spPEUt37Desc2);
        ArrayAdapter<CharSequence> adapterDesc2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc2.setAdapter(adapterDesc2);


        Spinner spPEUt37Desc3 = findViewById(R.id.spPEUt37Desc3);
        ArrayAdapter<CharSequence> adapterDesc3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc3.setAdapter(adapterDesc3);


        Spinner spPEUt37Desc4 = findViewById(R.id.spPEUt37Desc4);
        ArrayAdapter<CharSequence> adapterDesc4 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc4.setAdapter(adapterDesc4);


        Spinner spPEUt37Desc5 = findViewById(R.id.spPEUt37Desc5);
        ArrayAdapter<CharSequence> adapterDesc5 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc5.setAdapter(adapterDesc5);


        Spinner spPEUt37Desc6 = findViewById(R.id.spPEUt37Desc6);
        ArrayAdapter<CharSequence> adapterDesc6 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc6.setAdapter(adapterDesc6);


        Spinner spPEUt37Desc7 = findViewById(R.id.spPEUt37Desc7);
        ArrayAdapter<CharSequence> adapterDesc7 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc7.setAdapter(adapterDesc7);


        Spinner spPEUt37Desc8 = findViewById(R.id.spPEUt37Desc8);
        ArrayAdapter<CharSequence> adapterDesc8 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc8.setAdapter(adapterDesc8);


        Spinner spPEUt37Desc9 = findViewById(R.id.spPEUt37Desc9);
        ArrayAdapter<CharSequence> adapterDesc9 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc9.setAdapter(adapterDesc9);


        Spinner spPEUt37Desc10 = findViewById(R.id.spPEUt37Desc10);
        ArrayAdapter<CharSequence> adapterDesc10 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt37Desc10.setAdapter(adapterDesc10);


        Spinner spUt37CondPista = findViewById(R.id.spUt37CondPista);
        ArrayAdapter<CharSequence> adapterCondPista = ArrayAdapter.createFromResource(this, R.array.condPista, android.R.layout.simple_spinner_item);
        adapterCondPista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spUt37CondPista.setAdapter(adapterCondPista);


        btnUt37Cancelar = findViewById(R.id.btnUt37Cancel);
        btnUt37Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Ut37Activity.this);
                View view = LayoutInflater.from(Ut37Activity.this).inflate(R.layout.alert_dialog, null);
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


//===================== VIAGENS 780 -78======================================================================

        btnUt37Viagens78078Mais = (Button) findViewById(R.id.btnUt37Viagens78078Mais);
        btnUt37Viagens78078Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens78078 = (TextView) findViewById(R.id.txtUt37NumViagens78078);

            @Override
            public void onClick(View v) {
                numero78078 += 1;
                txtUt37NumViagens78078.setText(String.valueOf(numero78078));
                soma780();
            }
        });
        btnUt37Viagens78078Menos = (Button) findViewById(R.id.btnUt37Viagens78078Menos);
        btnUt37Viagens78078Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens78078 = (TextView) findViewById(R.id.txtUt37NumViagens78078);

            @Override
            public void onClick(View v) {
                if (numero78078 > 0) {
                    numero78078 -= 1;
                    txtUt37NumViagens78078.setText(String.valueOf(numero78078));
                } else {
                    numero78078 = 0;
                }
                soma780();
            }
        });

//===================== VIAGENS 790E -89======================================================================
        btnUt37Viagens78089Mais = (Button) findViewById(R.id.btnUt37Viagens78089Mais);
        btnUt37Viagens78089Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens78089 = (TextView) findViewById(R.id.txtUt37NumViagens78089);

            @Override
            public void onClick(View v) {
                numero78089 += 1;
                txtUt37NumViagens78089.setText(String.valueOf(numero78089));
                soma780();
            }
        });
        btnUt37Viagens78089Menos = (Button) findViewById(R.id.btnUt37Viagens78089Menos);
        btnUt37Viagens78089Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens78089 = (TextView) findViewById(R.id.txtUt37NumViagens78089);

            @Override
            public void onClick(View v) {
                if (numero78089 > 0) {
                    numero78089 -= 1;
                    txtUt37NumViagens78089.setText(String.valueOf(numero78089));
                } else {
                    numero78089 = 0;
                }
                soma780();
            }
        });


//===================== VIAGENS 780 -910======================================================================

        btnUt37Viagens780910Mais = (Button) findViewById(R.id.btnUt37Viagens780910Mais);
        btnUt37Viagens780910Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens780910 = (TextView) findViewById(R.id.txtUt37NumViagens780910);

            @Override
            public void onClick(View v) {
                numero780910 += 1;
                txtUt37NumViagens780910.setText(String.valueOf(numero780910));
                soma780();
            }
        });
        btnUt37Viagens780910Menos = (Button) findViewById(R.id.btnUt37Viagens780910Menos);
        btnUt37Viagens780910Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens780910 = (TextView) findViewById(R.id.txtUt37NumViagens780910);

            @Override
            public void onClick(View v) {
                if (numero780910 > 0) {
                    numero780910 -= 1;
                    txtUt37NumViagens780910.setText(String.valueOf(numero780910));
                } else {
                    numero780910 = 0;
                }
                soma780();
            }
        });

//===================== VIAGENS 780 -1011======================================================================

        btnUt37Viagens7801011Mais = (Button) findViewById(R.id.btnUt37Viagens7801011Mais);
        btnUt37Viagens7801011Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801011 = (TextView) findViewById(R.id.txtUt37NumViagens7801011);

            @Override
            public void onClick(View v) {
                numero7801011 += 1;
                txtUt37NumViagens7801011.setText(String.valueOf(numero7801011));
                soma780();
            }
        });
        btnUt37Viagens7801011Menos = (Button) findViewById(R.id.btnUt37Viagens7801011Menos);
        btnUt37Viagens7801011Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801011 = (TextView) findViewById(R.id.txtUt37NumViagens7801011);

            @Override
            public void onClick(View v) {
                if (numero7801011 > 0) {
                    numero7801011 -= 1;
                    txtUt37NumViagens7801011.setText(String.valueOf(numero7801011));
                } else {
                    numero7801011 = 0;
                }
                soma780();
            }
        });


        //===================== VIAGENS 780 -1112======================================================================

        btnUt37Viagens7801112Mais = (Button) findViewById(R.id.btnUt37Viagens7801112Mais);
        btnUt37Viagens7801112Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801112 = (TextView) findViewById(R.id.txtUt37NumViagens7801112);

            @Override
            public void onClick(View v) {
                numero7801112 += 1;
                txtUt37NumViagens7801112.setText(String.valueOf(numero7801112));
                soma780();
            }
        });
        btnUt37Viagens7801112Menos = (Button) findViewById(R.id.btnUt37Viagens7801112Menos);
        btnUt37Viagens7801112Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801112 = (TextView) findViewById(R.id.txtUt37NumViagens7801112);

            @Override
            public void onClick(View v) {
                if (numero7801112 > 0) {
                    numero7801112 -= 1;
                    txtUt37NumViagens7801112.setText(String.valueOf(numero7801112));
                } else {
                    numero7801112 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1213======================================================================

        btnUt37Viagens7801213Mais = (Button) findViewById(R.id.btnUt37Viagens7801213Mais);
        btnUt37Viagens7801213Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801213 = (TextView) findViewById(R.id.txtUt37NumViagens7801213);

            @Override
            public void onClick(View v) {
                numero7801213 += 1;
                txtUt37NumViagens7801213.setText(String.valueOf(numero7801213));
                soma780();
            }
        });
        btnUt37Viagens7801213Menos = (Button) findViewById(R.id.btnUt37Viagens7801213Menos);
        btnUt37Viagens7801213Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801213 = (TextView) findViewById(R.id.txtUt37NumViagens7801213);

            @Override
            public void onClick(View v) {
                if (numero7801213 > 0) {
                    numero7801213 -= 1;
                    txtUt37NumViagens7801213.setText(String.valueOf(numero7801213));
                } else {
                    numero7801213 = 0;
                }
                soma780();
            }
        });
        //===================== VIAGENS 780 -1314======================================================================

        btnUt37Viagens7801314Mais = (Button) findViewById(R.id.btnUt37Viagens7801314Mais);
        btnUt37Viagens7801314Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801314 = (TextView) findViewById(R.id.txtUt37NumViagens7801314);

            @Override
            public void onClick(View v) {
                numero7801314 += 1;
                txtUt37NumViagens7801314.setText(String.valueOf(numero7801314));
                soma780();
            }
        });
        btnUt37Viagens7801314Menos = (Button) findViewById(R.id.btnUt37Viagens7801314Menos);
        btnUt37Viagens7801314Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801314 = (TextView) findViewById(R.id.txtUt37NumViagens7801314);

            @Override
            public void onClick(View v) {
                if (numero7801314 > 0) {
                    numero7801314 -= 1;
                    txtUt37NumViagens7801314.setText(String.valueOf(numero7801314));
                } else {
                    numero7801314 = 0;
                }
                soma780();
            }
        });



        //===================== VIAGENS 780 -1415======================================================================

        btnUt37Viagens7801415Mais = (Button) findViewById(R.id.btnUt37Viagens7801415Mais);
        btnUt37Viagens7801415Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801415 = (TextView) findViewById(R.id.txtUt37NumViagens7801415);

            @Override
            public void onClick(View v) {
                numero7801415 += 1;
                txtUt37NumViagens7801415.setText(String.valueOf(numero7801415));
                soma780();
            }
        });
        btnUt37Viagens7801415Menos = (Button) findViewById(R.id.btnUt37Viagens7801415Menos);
        btnUt37Viagens7801415Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801415 = (TextView) findViewById(R.id.txtUt37NumViagens7801415);

            @Override
            public void onClick(View v) {
                if (numero7801415 > 0) {
                    numero7801415 -= 1;
                    txtUt37NumViagens7801415.setText(String.valueOf(numero7801415));
                } else {
                    numero7801415 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1516======================================================================

        btnUt37Viagens7801516Mais = (Button) findViewById(R.id.btnUt37Viagens7801516Mais);
        btnUt37Viagens7801516Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801516 = (TextView) findViewById(R.id.txtUt37NumViagens7801516);

            @Override
            public void onClick(View v) {
                numero7801516 += 1;
                txtUt37NumViagens7801516.setText(String.valueOf(numero7801516));
                soma780();
            }
        });
        btnUt37Viagens7801516Menos = (Button) findViewById(R.id.btnUt37Viagens7801516Menos);
        btnUt37Viagens7801516Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801516 = (TextView) findViewById(R.id.txtUt37NumViagens7801516);

            @Override
            public void onClick(View v) {
                if (numero7801516 > 0) {
                    numero7801516 -= 1;
                    txtUt37NumViagens7801516.setText(String.valueOf(numero7801516));
                } else {
                    numero7801516 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1617======================================================================

        btnUt37Viagens7801617Mais = (Button) findViewById(R.id.btnUt37Viagens7801617Mais);
        btnUt37Viagens7801617Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801617 = (TextView) findViewById(R.id.txtUt37NumViagens7801617);

            @Override
            public void onClick(View v) {
                numero7801617 += 1;
                txtUt37NumViagens7801617.setText(String.valueOf(numero7801617));
                soma780();
            }
        });
        btnUt37Viagens7801617Menos = (Button) findViewById(R.id.btnUt37Viagens7801617Menos);
        btnUt37Viagens7801617Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801617 = (TextView) findViewById(R.id.txtUt37NumViagens7801617);

            @Override
            public void onClick(View v) {
                if (numero7801617 > 0) {
                    numero7801617 -= 1;
                    txtUt37NumViagens7801617.setText(String.valueOf(numero7801617));
                } else {
                    numero7801617 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1718======================================================================

        btnUt37Viagens7801718Mais = (Button) findViewById(R.id.btnUt37Viagens7801718Mais);
        btnUt37Viagens7801718Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801718 = (TextView) findViewById(R.id.txtUt37NumViagens7801718);

            @Override
            public void onClick(View v) {
                numero7801718 += 1;
                txtUt37NumViagens7801718.setText(String.valueOf(numero7801718));
                soma780();
            }
        });
        btnUt37Viagens7801718Menos = (Button) findViewById(R.id.btnUt37Viagens7801718Menos);
        btnUt37Viagens7801718Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801718 = (TextView) findViewById(R.id.txtUt37NumViagens7801718);

            @Override
            public void onClick(View v) {
                if (numero7801718 > 0) {
                    numero7801718 -= 1;
                    txtUt37NumViagens7801718.setText(String.valueOf(numero7801718));
                } else {
                    numero7801718 = 0;
                }
                soma780();
            }
        });







//===================== VIAGENS 790E -78======================================================================



        //===================== VIAGENS 780 -1516======================================================================

        btnUt37Viagens7801516Mais = (Button) findViewById(R.id.btnUt37Viagens7801516Mais);
        btnUt37Viagens7801516Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801516 = (TextView) findViewById(R.id.txtUt37NumViagens7801516);

            @Override
            public void onClick(View v) {
                numero7801516 += 1;
                txtUt37NumViagens7801516.setText(String.valueOf(numero7801516));
                soma780();
            }
        });
        btnUt37Viagens7801516Menos = (Button) findViewById(R.id.btnUt37Viagens7801516Menos);
        btnUt37Viagens7801516Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagens7801516 = (TextView) findViewById(R.id.txtUt37NumViagens7801516);

            @Override
            public void onClick(View v) {
                if (numero7801516 > 0) {
                    numero7801516 -= 1;
                    txtUt37NumViagens7801516.setText(String.valueOf(numero7801516));
                } else {
                    numero7801516 = 0;
                }
                soma780();
            }
        });



//===================== VIAGENS ESTOQUE Areia Média Praça======================================================================

        btnUt37VEAMMais = (Button) findViewById(R.id.btnUt37VEAMMais);
        btnUt37VEAMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAM);

            @Override
            public void onClick(View v) {
                numeroAMPr += 1;
                txtUt37NumViagensEstoqueAM.setText(String.valueOf(numeroAMPr));

            }
        });
        btnUt37VEAMMenos = (Button) findViewById(R.id.btnUt37VEAMMenos);
        btnUt37VEAMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAM);

            @Override
            public void onClick(View v) {
                if (numeroAMPr > 0) {
                    numeroAMPr -= 1;
                    txtUt37NumViagensEstoqueAM.setText(String.valueOf(numeroAMPr));
                } else {
                    numeroAMPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Areia Média UM======================================================================


        btnUt37VEAMUMMais = (Button) findViewById(R.id.btnUt37VEAMUMMais);
        btnUt37VEAMUMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAMUM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAMUM);

            @Override
            public void onClick(View v) {
                numeroAMUM += 1;
                txtUt37NumViagensEstoqueAMUM.setText(String.valueOf(numeroAMUM));

            }
        });
        btnUt37VEAMUMMenos = (Button) findViewById(R.id.btnUt37VEAMUMMenos);
        btnUt37VEAMUMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAMUM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAMUM);

            @Override
            public void onClick(View v) {
                if (numeroAMUM > 0) {
                    numeroAMUM -= 1;
                    txtUt37NumViagensEstoqueAMUM.setText(String.valueOf(numeroAMUM));
                } else {
                    numeroAMUM = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Areia Fina======================================================================


        btnUt37VEAFMais = (Button) findViewById(R.id.btnUt37VEAFMais);
        btnUt37VEAFMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAF = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAF);

            @Override
            public void onClick(View v) {
                numeroAF += 1;
                txtUt37NumViagensEstoqueAF.setText(String.valueOf(numeroAF));

            }
        });
        btnUt37VEAFMenos = (Button) findViewById(R.id.btnUt37VEAFMenos);
        btnUt37VEAFMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueAF = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueAF);

            @Override
            public void onClick(View v) {
                if (numeroAF > 0) {
                    numeroAF -= 1;
                    txtUt37NumViagensEstoqueAF.setText(String.valueOf(numeroAF));
                } else {
                    numeroAF = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Pedrisco======================================================================


        btnUt37VEPedrMais = (Button) findViewById(R.id.btnUt37VEPedrMais);
        btnUt37VEPedrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoquePedrisco = (TextView) findViewById(R.id.txtUt37NumViagensEstoquePedrisco);

            @Override
            public void onClick(View v) {
                numeroPr += 1;
                txtUt37NumViagensEstoquePedrisco.setText(String.valueOf(numeroPr));

            }
        });
        btnUt37VEPedrMenos = (Button) findViewById(R.id.btnUt37VEPedrMenos);
        btnUt37VEPedrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoquePedrisco = (TextView) findViewById(R.id.txtUt37NumViagensEstoquePedrisco);

            @Override
            public void onClick(View v) {
                if (numeroPr > 0) {
                    numeroPr -= 1;
                    txtUt37NumViagensEstoquePedrisco.setText(String.valueOf(numeroPr));
                } else {
                    numeroPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt37VEBicaPrMais = (Button) findViewById(R.id.btnUt37VEBicaPrMais);
        btnUt37VEBicaPrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueBicaPr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueBicaPr);

            @Override
            public void onClick(View v) {
                numeroBiPr += 1;
                txtUt37NumViagensEstoqueBicaPr.setText(String.valueOf(numeroBiPr));

            }
        });
        btnUt37VEBicaPrMenos = (Button) findViewById(R.id.btnUt37VEBicaPrMenos);
        btnUt37VEBicaPrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueBicaPr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueBicaPr);

            @Override
            public void onClick(View v) {
                if (numeroBiPr > 0) {
                    numeroBiPr -= 1;
                    txtUt37NumViagensEstoqueBicaPr.setText(String.valueOf(numeroBiPr));
                } else {
                    numeroBiPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt37VEBica790Mais = (Button) findViewById(R.id.btnUt37VEBica790Mais);
        btnUt37VEBica790Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoque790 = (TextView) findViewById(R.id.txtUt37NumViagensEstoque790);

            @Override
            public void onClick(View v) {
                numeroBi790 += 1;
                txtUt37NumViagensEstoque790.setText(String.valueOf(numeroBi790));

            }
        });
        btnUt37VEBica790Menos = (Button) findViewById(R.id.btnUt37VEBica790Menos);
        btnUt37VEBica790Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoque790 = (TextView) findViewById(R.id.txtUt37NumViagensEstoque790);

            @Override
            public void onClick(View v) {
                if (numeroBi790 > 0) {
                    numeroBi790 -= 1;
                    txtUt37NumViagensEstoque790.setText(String.valueOf(numeroBi790));
                } else {
                    numeroBi790 = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Brita1 Praça======================================================================


        btnUt37VEBicaUMMais = (Button) findViewById(R.id.btnUt37VEBicaUMMais);
        btnUt37VEBicaUMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueBicaUM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueBicaUM);

            @Override
            public void onClick(View v) {
                numeroBiUM += 1;
                txtUt37NumViagensEstoqueBicaUM.setText(String.valueOf(numeroBiUM));

            }
        });
        btnUt37VEBicaUMMenos = (Button) findViewById(R.id.btnUt37VEBicaUMMenos);
        btnUt37VEBicaUMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueBicaUM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueBicaUM);

            @Override
            public void onClick(View v) {
                if (numeroBiUM > 0) {
                    numeroBiUM -= 1;
                    txtUt37NumViagensEstoqueBicaUM.setText(String.valueOf(numeroBiUM));
                } else {
                    numeroBiUM = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Brita 1 19mm======================================================================


        btnUt37VEB1PrMais = (Button) findViewById(R.id.btnUt37VEB1PrMais);
        btnUt37VEB1PrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB1Pr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB1Pr);

            @Override
            public void onClick(View v) {
                numeroBrPr += 1;
                txtUt37NumViagensEstoqueB1Pr.setText(String.valueOf(numeroBrPr));

            }
        });
        btnUt37VEB1PrMenos = (Button) findViewById(R.id.btnUt37VEB1PrMenos);
        btnUt37VEB1PrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB1Pr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB1Pr);

            @Override
            public void onClick(View v) {
                if (numeroBrPr > 0) {
                    numeroBrPr -= 1;
                    txtUt37NumViagensEstoqueB1Pr.setText(String.valueOf(numeroBrPr));
                } else {
                    numeroBrPr = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 Praça======================================================================


        btnUt37VEB119Mais = (Button) findViewById(R.id.btnUt37VEB119Mais);
        btnUt37VEB119Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB119 = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB119);

            @Override
            public void onClick(View v) {
                numeroBr119 += 1;
                txtUt37NumViagensEstoqueB119.setText(String.valueOf(numeroBr119));
            }
        });
        btnUt37VEB119Menos = (Button) findViewById(R.id.btnUt37VEB119Menos);
        btnUt37VEB119Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB119 = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB119);

            @Override
            public void onClick(View v) {
                if (numeroBr119 > 0) {
                    numeroBr119 -= 1;
                    txtUt37NumViagensEstoqueB119.setText(String.valueOf(numeroBr119));
                } else {
                    numeroBr119 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 UM======================================================================


        btnUt37VEB0PrMais = (Button) findViewById(R.id.btnUt37VEB0PrMais);
        btnUt37VEB0PrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB0Pr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB0Pr);

            @Override
            public void onClick(View v) {
                numeroBr0Pr += 1;
                txtUt37NumViagensEstoqueB0Pr.setText(String.valueOf(numeroBr0Pr));
            }
        });
        btnUt37VEB0PrMenos = (Button) findViewById(R.id.btnUt37VEB0PrMenos);
        btnUt37VEB0PrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB0Pr = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB0Pr);

            @Override
            public void onClick(View v) {
                if (numeroBr0Pr > 0) {
                    numeroBr0Pr -= 1;
                    txtUt37NumViagensEstoqueB0Pr.setText(String.valueOf(numeroBr0Pr));
                } else {
                    numeroBr0Pr = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 UM======================================================================


        btnUt37VEB0UMMais = (Button) findViewById(R.id.btnUt37VEB0UMMais);
        btnUt37VEB0UMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB0UM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB0UM);

            @Override
            public void onClick(View v) {
                numeroBr0UM += 1;
                txtUt37NumViagensEstoqueB0UM.setText(String.valueOf(numeroBr0UM));
            }
        });
        btnUt37VEB0UMMenos = (Button) findViewById(R.id.btnUt37VEB0UMMenos);
        btnUt37VEB0UMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensEstoqueB0UM = (TextView) findViewById(R.id.txtUt37NumViagensEstoqueB0UM);

            @Override
            public void onClick(View v) {
                if (numeroBr0UM > 0) {
                    numeroBr0UM -= 1;
                    txtUt37NumViagensEstoqueB0UM.setText(String.valueOf(numeroBr0UM));
                } else {
                    numeroBr0UM = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Média Praça======================================================================


        btnUt37ViagensDServForroMais = (Button) findViewById(R.id.btnUt37ViagensDServForroMais);
        btnUt37ViagensDServForroMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServForro = (TextView) findViewById(R.id.txtUt37NumViagensDServForro);

            @Override
            public void onClick(View v) {
                numeroBiForro += 1;
                txtUt37NumViagensDServForro.setText(String.valueOf(numeroBiForro));
            }
        });
        btnUt37ViagensDServForroMenos = (Button) findViewById(R.id.btnUt37ViagensDServForroMenos);
        btnUt37ViagensDServForroMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServForro = (TextView) findViewById(R.id.txtUt37NumViagensDServForro);

            @Override
            public void onClick(View v) {
                if (numeroBiForro > 0) {
                    numeroBiForro -= 1;
                    txtUt37NumViagensDServForro.setText(String.valueOf(numeroBiForro));
                } else {
                    numeroBiForro = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Média UM======================================================================


        btnUt37ViagensDServB0Mais = (Button) findViewById(R.id.btnUt37ViagensDServB0Mais);
        btnUt37ViagensDServB0Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB0 = (TextView) findViewById(R.id.txtUt37NumViagensDServB0);

            @Override
            public void onClick(View v) {
                numeroB0 += 1;
                txtUt37NumViagensDServB0.setText(String.valueOf(numeroB0));
            }
        });
        btnUt37ViagensDServB0Menos = (Button) findViewById(R.id.btnUt37ViagensDServB0Menos);
        btnUt37ViagensDServB0Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB0 = (TextView) findViewById(R.id.txtUt37NumViagensDServB0);

            @Override
            public void onClick(View v) {
                if (numeroB0 > 0) {
                    numeroB0 -= 1;
                    txtUt37NumViagensDServB0.setText(String.valueOf(numeroB0));
                } else {
                    numeroB0 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Fina======================================================================

        btnUt37ViagensDServB1Mais = (Button) findViewById(R.id.btnUt37ViagensDServB1Mais);
        btnUt37ViagensDServB1Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB1 = (TextView) findViewById(R.id.txtUt37NumViagensDServB1);

            @Override
            public void onClick(View v) {
                numeroB1 += 1;
                txtUt37NumViagensDServB1.setText(String.valueOf(numeroB1));
            }
        });
        btnUt37ViagensDServB1Menos = (Button) findViewById(R.id.btnUt37ViagensDServB1Menos);
        btnUt37ViagensDServB1Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB1 = (TextView) findViewById(R.id.txtUt37NumViagensDServB1);

            @Override
            public void onClick(View v) {
                if (numeroB1 > 0) {
                    numeroB1 -= 1;
                    txtUt37NumViagensDServB1.setText(String.valueOf(numeroB1));
                } else {
                    numeroB1 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Pedrisco======================================================================


        btnUt37ViagensDServB2Mais = (Button) findViewById(R.id.btnUt37ViagensDServB2Mais);
        btnUt37ViagensDServB2Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB2 = (TextView) findViewById(R.id.txtUt37NumViagensDServB2);

            @Override
            public void onClick(View v) {
                numeroB2 += 1;
                txtUt37NumViagensDServB2.setText(String.valueOf(numeroB2));
            }
        });
        btnUt37ViagensDServB2Menos = (Button) findViewById(R.id.btnUt37ViagensDServB2Menos);
        btnUt37ViagensDServB2Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServB2 = (TextView) findViewById(R.id.txtUt37NumViagensDServB2);

            @Override
            public void onClick(View v) {
                if (numeroB2 > 0) {
                    numeroB2 -= 1;
                    txtUt37NumViagensDServB2.setText(String.valueOf(numeroB2));
                } else {
                    numeroB2 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt37ViagensDServFundoMais = (Button) findViewById(R.id.btnUt37ViagensDServFundoMais);
        btnUt37ViagensDServFundoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServFundo = (TextView) findViewById(R.id.txtUt37NumViagensDServFundo);

            @Override
            public void onClick(View v) {
                numeroFundo += 1;
                txtUt37NumViagensDServFundo.setText(String.valueOf(numeroFundo));
            }
        });
        btnUt37ViagensDServFundoMenos = (Button) findViewById(R.id.btnUt37ViagensDServFundoMenos);
        btnUt37ViagensDServFundoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServFundo = (TextView) findViewById(R.id.txtUt37NumViagensDServFundo);

            @Override
            public void onClick(View v) {
                if (numeroFundo > 0) {
                    numeroFundo -= 1;
                    txtUt37NumViagensDServFundo.setText(String.valueOf(numeroFundo));
                } else {
                    numeroFundo = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt37ViagensDServAIMMais = (Button) findViewById(R.id.btnUt37ViagensDServAIMMais);
        btnUt37ViagensDServAIMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServAIM = (TextView) findViewById(R.id.txtUt37NumViagensDServAIM);

            @Override
            public void onClick(View v) {
                numeroAIM += 1;
                txtUt37NumViagensDServAIM.setText(String.valueOf(numeroAIM));
            }
        });
        btnUt37ViagensDServAIMMenos = (Button) findViewById(R.id.btnUt37ViagensDServAIMMenos);
        btnUt37ViagensDServAIMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensDServAIM = (TextView) findViewById(R.id.txtUt37NumViagensDServAIM);

            @Override
            public void onClick(View v) {
                if (numeroAIM > 0) {
                    numeroAIM -= 1;
                    txtUt37NumViagensDServAIM.setText(String.valueOf(numeroAIM));
                } else {
                    numeroAIM = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt37ViagensFogacho780Mais = (Button) findViewById(R.id.btnUt37ViagensFogacho780Mais);
        btnUt37ViagensFogacho780Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho780 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho780);

            @Override
            public void onClick(View v) {
                Fogacho780 += 1;
                txtUt37NumViagensFogacho780.setText(String.valueOf(Fogacho780));
            }
        });
        btnUt37ViagensFogacho780Menos = (Button) findViewById(R.id.btnUt37ViagensFogacho780Menos);
        btnUt37ViagensFogacho780Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho780 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho780);

            @Override
            public void onClick(View v) {
                if (Fogacho780 > 0) {
                    Fogacho780 -= 1;
                    txtUt37NumViagensFogacho780.setText(String.valueOf(Fogacho780));
                } else {
                    Fogacho780 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt37ViagensFogacho790Mais = (Button) findViewById(R.id.btnUt37ViagensFogacho790Mais);
        btnUt37ViagensFogacho790Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho790 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho790);

            @Override
            public void onClick(View v) {
                Fogacho790 += 1;
                txtUt37NumViagensFogacho790.setText(String.valueOf(Fogacho790));
            }
        });
        btnUt37ViagensFogacho790Menos = (Button) findViewById(R.id.btnUt37ViagensFogacho790Menos);
        btnUt37ViagensFogacho790Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho790 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho790);

            @Override
            public void onClick(View v) {
                if (Fogacho790 > 0) {
                    Fogacho790 -= 1;
                    txtUt37NumViagensFogacho790.setText(String.valueOf(Fogacho790));
                } else {
                    Fogacho790 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt37ViagensFogacho800Mais = (Button) findViewById(R.id.btnUt37ViagensFogacho800Mais);
        btnUt37ViagensFogacho800Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho800 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho800);

            @Override
            public void onClick(View v) {
                Fogacho800 += 1;
                txtUt37NumViagensFogacho800.setText(String.valueOf(Fogacho800));
            }
        });
        btnUt37ViagensFogacho800Menos = (Button) findViewById(R.id.btnUt37ViagensFogacho800Menos);
        btnUt37ViagensFogacho800Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho800 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho800);

            @Override
            public void onClick(View v) {
                if (Fogacho800 > 0) {
                    Fogacho800 -= 1;
                    txtUt37NumViagensFogacho800.setText(String.valueOf(Fogacho800));
                } else {
                    Fogacho800 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt37ViagensFogacho810Mais = (Button) findViewById(R.id.btnUt37ViagensFogacho810Mais);
        btnUt37ViagensFogacho810Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho810 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho810);

            @Override
            public void onClick(View v) {
                Fogacho810 += 1;
                txtUt37NumViagensFogacho810.setText(String.valueOf(Fogacho810));
            }
        });
        btnUt37ViagensFogacho810Menos = (Button) findViewById(R.id.btnUt37ViagensFogacho810Menos);
        btnUt37ViagensFogacho810Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt37NumViagensFogacho810 = (TextView) findViewById(R.id.txtUt37NumViagensFogacho810);

            @Override
            public void onClick(View v) {
                if (Fogacho810 > 0) {
                    Fogacho810 -= 1;
                    txtUt37NumViagensFogacho810.setText(String.valueOf(Fogacho810));
                } else {
                    Fogacho810 = 0;
                }
            }
        });


//===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUt37HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUt37HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUt37HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUt37HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUt37HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUt37HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUt37HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUt37HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUt37HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUt37HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUt37HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUt37HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUt37HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUt37HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUt37HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUt37HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUt37HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUt37HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUt37HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUt37HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut37Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });



        btnUt37Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Ut37Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Ut37Activity.this);
                    View view = LayoutInflater.from(Ut37Activity.this).inflate(R.layout.sinc_dialog, null);
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

    public void soma780(){
        final TextView txtsoma780 = findViewById(R.id.txtUt37NumViagensSoma780);
        TextView t1780 = findViewById(R.id.txtUt37NumViagens78078);
        TextView t2780 = findViewById(R.id.txtUt37NumViagens78089);
        TextView t3780 = findViewById(R.id.txtUt37NumViagens780910);
        TextView t4780 = findViewById(R.id.txtUt37NumViagens7801011);
        TextView t5780 = findViewById(R.id.txtUt37NumViagens7801112);
        TextView t6780 = findViewById(R.id.txtUt37NumViagens7801213);
        TextView t7780 = findViewById(R.id.txtUt37NumViagens7801314);
        TextView t8780 = findViewById(R.id.txtUt37NumViagens7801415);
        TextView t9780 = findViewById(R.id.txtUt37NumViagens7801516);
        TextView t10780 = findViewById(R.id.txtUt37NumViagens7801617);
        TextView t11780 = findViewById(R.id.txtUt37NumViagens7801718);
        int t78001 = Integer.parseInt(t1780.getText().toString());
        int t78002 = Integer.parseInt(t2780.getText().toString());
        int t78003 = Integer.parseInt(t3780.getText().toString());
        int t78004 = Integer.parseInt(t4780.getText().toString());
        int t78005 = Integer.parseInt(t5780.getText().toString());
        int t78006 = Integer.parseInt(t6780.getText().toString());
        int t78007 = Integer.parseInt(t7780.getText().toString());
        int t78008 = Integer.parseInt(t8780.getText().toString());
        int t78009 = Integer.parseInt(t9780.getText().toString());
        int t780010 = Integer.parseInt(t10780.getText().toString());
        int t780011 = Integer.parseInt(t11780.getText().toString());
        int soma780n = t78001 + t78002 + t78003 + t78004 + t78005 + t78006 + t78007 + t78008 + t78009 + t780010 + t780011;
        String soma780c = Integer.toString(soma780n);
        txtsoma780.setText(soma780c);
    }




    public void salvar(View view) {

        if(isEmpty(horimetroFinal)||horimetroFinal.getText().toString().trim().length()==0){
            horimetroFinal.setError("CAMPO OBRIGATÓRIO");
            horimetroFinal.requestFocus();
        }
        else {
            btnUt37Salvar.setVisibility(View.INVISIBLE);
            btnUt37Sincronizar.setVisibility(View.VISIBLE);
            Ut37 t37 = new Ut37(
                    motorista.getText().toString(),
                    data.getText().toString(),
                    horaInicial.getText().toString(),
                    horaFinal.getText().toString(),
                    horimetroInicial.getText().toString(),
                    horimetroFinal.getText().toString(),
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
                    lanternagem.getText().toString(),
                    pneus.getText().toString(),
                    h2o.getText().toString(),
                    oleo.getText().toString(),
                    direcao.getText().toString(),
                    freios.getText().toString(),
                    parteEletrica.getText().toString(),
                    observacoes.getText().toString(),
                    condicaoPista.getSelectedItem().toString(),
                    numViagens78078.getText().toString(),
                    numViagens78089.getText().toString(),
                    numViagens780910.getText().toString(),
                    numViagens7801011.getText().toString(),
                    numViagens7801112.getText().toString(),
                    numViagens7801213.getText().toString(),
                    numViagens7801314.getText().toString(),
                    numViagens7801415.getText().toString(),
                    numViagens7801516.getText().toString(),
                    numViagens7801617.getText().toString(),
                    numViagens7801718.getText().toString(),
                    obs78.getText().toString(),
                    obs89.getText().toString(),
                    obs910.getText().toString(),
                    obs1011.getText().toString(),
                    obs1112.getText().toString(),
                    obs1213.getText().toString(),
                    obs1314.getText().toString(),
                    obs1415.getText().toString(),
                    obs1516.getText().toString(),
                    obs1617.getText().toString(),
                    obs1718.getText().toString(),
                    numViagensAm.getText().toString(),
                    numViagensBicaCont.getText().toString(),
                    numViagensAf.getText().toString(),
                    numViagensPedrisco.getText().toString(),
                    numViagensBicaPr.getText().toString(),
                    numViagensBica790.getText().toString(),
                    numViagensBicaUm.getText().toString(),
                    numViagensBr1Pr.getText().toString(),
                    numViagensBr119.getText().toString(),
                    numViagensBr0Pr.getText().toString(),
                    numViagensBr0Um.getText().toString(),
                    numViagensBicaForro.getText().toString(),
                    numViagensB0.getText().toString(),
                    numViagensB1.getText().toString(),
                    numViagensB2.getText().toString(),
                    numViagensAim.getText().toString(),
                    numViagensFundo.getText().toString(),
                    numViagens780.getText().toString(),
                    numViagens790.getText().toString(),
                    numViagens800.getText().toString(),
                    numViagens810.getText().toString(),
                    soma780.getText().toString(),

                    condicaoPistaObservacoes.getText().toString()
            );


            t37.setMotorista(motorista.getText().toString());
            t37.setData(data.getText().toString());
            t37.setHoraInicial(horaInicial.getText().toString());

            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            t37.setHoraFinal(horaFinal.getText().toString());

            t37.setHorimetroInicial(horimetroInicial.getText().toString());
            t37.setHorimetroFinal(horimetroFinal.getText().toString());
            t37.setCondicaoPistaObservacoes(condicaoPistaObservacoes.getText().toString());
            t37.setCondicaoPista(condicaoPista.getSelectedItem().toString());

            t37.setParadaInicial1(paradaInicial1.getText().toString());
            t37.setParadaFinal1(paradaFinal1.getText().toString());
            t37.setDescricao1(descricao1.getSelectedItem().toString());
            t37.setDescricao1(descricao1.getSelectedItem().toString());
            t37.setParadaInicial2(paradaInicial2.getText().toString());
            t37.setParadaFinal2(paradaFinal2.getText().toString());
            t37.setDescricao2(descricao2.getSelectedItem().toString());
            t37.setParadaInicial3(paradaInicial3.getText().toString());
            t37.setParadaFinal3(paradaFinal3.getText().toString());
            t37.setDescricao3(descricao3.getSelectedItem().toString());
            t37.setParadaInicial4(paradaInicial4.getText().toString());
            t37.setParadaFinal4(paradaFinal4.getText().toString());
            t37.setDescricao4(descricao4.getSelectedItem().toString());
            t37.setParadaInicial5(paradaInicial5.getText().toString());
            t37.setParadaFinal5(paradaFinal5.getText().toString());
            t37.setDescricao5(descricao5.getSelectedItem().toString());
            t37.setParadaInicial6(paradaInicial6.getText().toString());
            t37.setParadaFinal6(paradaFinal6.getText().toString());
            t37.setDescricao6(descricao6.getSelectedItem().toString());
            t37.setParadaInicial7(paradaInicial7.getText().toString());
            t37.setParadaFinal7(paradaFinal7.getText().toString());
            t37.setDescricao7(descricao7.getSelectedItem().toString());
            t37.setParadaInicial8(paradaInicial8.getText().toString());
            t37.setParadaFinal8(paradaFinal8.getText().toString());
            t37.setDescricao8(descricao8.getSelectedItem().toString());
            t37.setParadaInicial9(paradaInicial9.getText().toString());
            t37.setParadaFinal9(paradaFinal9.getText().toString());
            t37.setDescricao9(descricao9.getSelectedItem().toString());
            t37.setParadaInicial10(paradaInicial10.getText().toString());
            t37.setParadaFinal10(paradaFinal10.getText().toString());
            t37.setDescricao10(descricao10.getSelectedItem().toString());

            t37.setNumViagens78078(numViagens78078.getText().toString());
            t37.setNumViagens78089(numViagens78089.getText().toString());
            t37.setNumViagens780910(numViagens780910.getText().toString());
            t37.setNumViagens7801011(numViagens7801011.getText().toString());
            t37.setNumViagens7801112(numViagens7801112.getText().toString());
            t37.setNumViagens7801213(numViagens7801213.getText().toString());
            t37.setNumViagens7801314(numViagens7801314.getText().toString());
            t37.setNumViagens7801415(numViagens7801415.getText().toString());
            t37.setNumViagens7801516(numViagens7801516.getText().toString());
            t37.setNumViagens7801617(numViagens7801617.getText().toString());
            t37.setNumViagens7801718(numViagens7801718.getText().toString());

            t37.setObs78(obs78.getText().toString());
            t37.setObs89(obs89.getText().toString());
            t37.setObs910(obs910.getText().toString());
            t37.setObs1011(obs1011.getText().toString());
            t37.setObs1112(obs1112.getText().toString());
            t37.setObs1213(obs1213.getText().toString());
            t37.setObs1314(obs1314.getText().toString());
            t37.setObs1415(obs1415.getText().toString());
            t37.setObs1516(obs1516.getText().toString());
            t37.setObs1617(obs1617.getText().toString());
            t37.setObs1718(obs1718.getText().toString());




            t37.setNumViagensAm(numViagensAm.getText().toString());
            t37.setNumViagensBicaCont(numViagensBicaCont.getText().toString());
            t37.setNumViagensAf(numViagensAf.getText().toString());
            t37.setNumViagensPedrisco(numViagensPedrisco.getText().toString());
            t37.setNumViagensBicaPr(numViagensBicaPr.getText().toString());
            t37.setNumViagensBica790(numViagensBica790.getText().toString());
            t37.setNumViagensBicaUm(numViagensBicaUm.getText().toString());
            t37.setNumViagensBr1Pr(numViagensBr1Pr.getText().toString());
            t37.setNumViagensBr119(numViagensBr119.getText().toString());
            t37.setNumViagensBr0Pr(numViagensBr0Pr.getText().toString());
            t37.setNumViagensBr0Um(numViagensBr0Um.getText().toString());

            t37.setNumViagensBicaForro(numViagensBicaForro.getText().toString());
            t37.setNumViagensB0(numViagensB0.getText().toString());
            t37.setNumViagensB1(numViagensB1.getText().toString());
            t37.setNumViagensB2(numViagensB2.getText().toString());
            t37.setNumViagensAim(numViagensAim.getText().toString());
            t37.setNumViagensFundo(numViagensFundo.getText().toString());


            t37.setNumViagens780(numViagens780.getText().toString());
            t37.setNumViagens790(numViagens790.getText().toString());
            t37.setNumViagens800(numViagens800.getText().toString());
            t37.setNumViagens810(numViagens810.getText().toString());





            //t37.setSoma780(txtsoma780.getText().toString());
            //t37.setSoma790e(txtsoma790E.getText().toString());
            //t37.setSoma790d(txtsoma790D.getText().toString());
            //t37.setSoma800(txtsoma800.getText().toString());
            //t37.setSoma810(txtsoma810.getText().toString());
            //  t37.setSomaUm(txtsomaUM.getText().toString());


            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                t37.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                t37.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                t37.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                t37.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                t37.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                t37.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                t37.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                t37.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                t37.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                t37.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                t37.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                freios.setText("Sim");
                t37.setFreios(freios.getText().toString());
            }
            if (parteEletrica.isChecked()) {
                parteEletrica.setText("Não");
                t37.setParteEletrica(parteEletrica.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                parteEletrica.setText("Sim");
                t37.setParteEletrica(parteEletrica.getText().toString());
            }


            t37.setObservacoes(observacoes.getText().toString());

            long id = dao.inserir(t37);
            Toast.makeText(this, "ut37 inserido com id: " + id, Toast.LENGTH_SHORT).show();





        }

    }



    public void sincronizar(View view){

        Ut37 t37 = new Ut37(
                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                horimetroInicial.getText().toString(),
                horimetroFinal.getText().toString(),
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
                lanternagem.getText().toString(),
                pneus.getText().toString(),
                h2o.getText().toString(),
                oleo.getText().toString(),
                direcao.getText().toString(),
                freios.getText().toString(),
                parteEletrica.getText().toString(),
                observacoes.getText().toString(),
                condicaoPista.getSelectedItem().toString(),
                numViagens78078.getText().toString(),
                numViagens78089.getText().toString(),
                numViagens780910.getText().toString(),
                numViagens7801011.getText().toString(),
                numViagens7801112.getText().toString(),
                numViagens7801213.getText().toString(),
                numViagens7801314.getText().toString(),
                numViagens7801415.getText().toString(),
                numViagens7801516.getText().toString(),
                numViagens7801617.getText().toString(),
                numViagens7801718.getText().toString(),
                obs78.getText().toString(),
                obs89.getText().toString(),
                obs910.getText().toString(),
                obs1011.getText().toString(),
                obs1112.getText().toString(),
                obs1213.getText().toString(),
                obs1314.getText().toString(),
                obs1415.getText().toString(),
                obs1516.getText().toString(),
                obs1617.getText().toString(),
                obs1718.getText().toString(),
                numViagensAm.getText().toString(),
                numViagensBicaCont.getText().toString(),
                numViagensAf.getText().toString(),
                numViagensPedrisco.getText().toString(),
                numViagensBicaPr.getText().toString(),
                numViagensBica790.getText().toString(),
                numViagensBicaUm.getText().toString(),
                numViagensBr1Pr.getText().toString(),
                numViagensBr119.getText().toString(),
                numViagensBr0Pr.getText().toString(),
                numViagensBr0Um.getText().toString(),
                numViagensBicaForro.getText().toString(),
                numViagensB0.getText().toString(),
                numViagensB1.getText().toString(),
                numViagensB2.getText().toString(),
                numViagensAim.getText().toString(),
                numViagensFundo.getText().toString(),
                numViagens780.getText().toString(),
                numViagens790.getText().toString(),
                numViagens800.getText().toString(),
                numViagens810.getText().toString(),
                soma780.getText().toString(),

                condicaoPistaObservacoes.getText().toString()
        );
        long id = dao2.inserir(t37);
        Ut37Service apiService = retrofit.create(Ut37Service.class);
        Call<Ut37> call = apiService.salvarInfoUt37(t37);

        call.enqueue(new Callback<Ut37>(){
            @Override
            public void onResponse(Call<Ut37> call, Response<Ut37> response) {
                if (response.isSuccessful()){
                    Ut37 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Ut37> call, Throwable t) {

            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Ut37Activity.this);
        View view= LayoutInflater.from(Ut37Activity.this).inflate(R.layout.alert_dialog,null);
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
