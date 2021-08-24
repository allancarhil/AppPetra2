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

import com.example.apppetra2.Classes.Ut07;
import com.example.apppetra2.DAO.Ut07DAO;
import com.example.apppetra2.DAO.Ut07DAOSync;
import com.example.apppetra2.Interfaces.Ut07Service;
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


public class Ut07Activity extends AppCompatActivity {



    public Button btnUt07Cancelar;
    private Button btnUt07Salvar;
    private Button btnUt07Sincronizar;

    private TextView nomeEquipamento;

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


    public Button btnUt07Viagens78078Mais;
    public Button btnUt07Viagens78078Menos;
    public Button btnUt07Viagens78089Mais;
    public Button btnUt07Viagens78089Menos;
    public Button btnUt07Viagens780910Mais;
    public Button btnUt07Viagens780910Menos;
    public Button btnUt07Viagens7801011Mais;
    public Button btnUt07Viagens7801011Menos;
    public Button btnUt07Viagens7801112Mais;
    public Button btnUt07Viagens7801112Menos;
    public Button btnUt07Viagens7801213Mais;
    public Button btnUt07Viagens7801213Menos;
    public Button btnUt07Viagens7801314Mais;
    public Button btnUt07Viagens7801314Menos;
    public Button btnUt07Viagens7801415Mais;
    public Button btnUt07Viagens7801415Menos;
    public Button btnUt07Viagens7801516Mais;
    public Button btnUt07Viagens7801516Menos;
    public Button btnUt07Viagens7801617Mais;
    public Button btnUt07Viagens7801617Menos;
    public Button btnUt07Viagens7801718Mais;
    public Button btnUt07Viagens7801718Menos;
    public Button btnUt07VEAMMais;
    public Button btnUt07VEAMMenos;
    public Button btnUt07VEAMUMMais;
    public Button btnUt07VEAMUMMenos;
    public Button btnUt07VEAFMais;
    public Button btnUt07VEAFMenos;
    public Button btnUt07VEPedrMais;
    public Button btnUt07VEPedrMenos;
    public Button btnUt07VEBicaPrMais;
    public Button btnUt07VEBicaPrMenos;
    public Button btnUt07VEBica790Mais;
    public Button btnUt07VEBica790Menos;
    public Button btnUt07VEBicaUMMais;
    public Button btnUt07VEBicaUMMenos;
    public Button btnUt07VEB1PrMais;
    public Button btnUt07VEB1PrMenos;
    public Button btnUt07VEB119Mais;
    public Button btnUt07VEB119Menos;
    public Button btnUt07VEB0PrMais;
    public Button btnUt07VEB0PrMenos;
    public Button btnUt07VEB0UMMais;
    public Button btnUt07VEB0UMMenos;
    public Button btnUt07ViagensDServForroMais;
    public Button btnUt07ViagensDServForroMenos;
    public Button btnUt07ViagensDServB0Mais;
    public Button btnUt07ViagensDServB0Menos;
    public Button btnUt07ViagensDServB1Mais;
    public Button btnUt07ViagensDServB1Menos;
    public Button btnUt07ViagensDServB2Mais;
    public Button btnUt07ViagensDServB2Menos;
    public Button btnUt07ViagensDServAIMMais;
    public Button btnUt07ViagensDServAIMMenos;
    public Button btnUt07ViagensDServFundoMais;
    public Button btnUt07ViagensDServFundoMenos;
    public Button btnUt07ViagensFogacho780Mais;
    public Button btnUt07ViagensFogacho780Menos;
    public Button btnUt07ViagensFogacho790Mais;
    public Button btnUt07ViagensFogacho790Menos;
    public Button btnUt07ViagensFogacho800Mais;
    public Button btnUt07ViagensFogacho800Menos;
    public Button btnUt07ViagensFogacho810Mais;
    public Button btnUt07ViagensFogacho810Menos;


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
    private Ut07DAO dao;
    private Ut07DAOSync dao2;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut07);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUt07Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        data = findViewById(R.id.txtUt07Data);
        horaInicial = findViewById(R.id.txtUt07HI);
        horaFinal = findViewById(R.id.txtUt07HF);
        horimetroInicial = findViewById(R.id.txtUt07HoriI);
        horimetroFinal = findViewById(R.id.txtUt07HoriF);
        paradaInicial1 = findViewById(R.id.txtPEUt07HI1);
        paradaFinal1 = findViewById(R.id.txtPEUt07HF1);
        descricao1 = findViewById(R.id.spPEUt07Desc1);
        paradaInicial2 = findViewById(R.id.txtPEUt07HI2);
        paradaFinal2 = findViewById(R.id.txtPEUt07HF2);
        descricao2 = findViewById(R.id.spPEUt07Desc2);
        paradaInicial3 = findViewById(R.id.txtPEUt07HI3);
        paradaFinal3 = findViewById(R.id.txtPEUt07HF3);
        descricao3 = findViewById(R.id.spPEUt07Desc3);
        paradaInicial4 = findViewById(R.id.txtPEUt07HI4);
        paradaFinal4 = findViewById(R.id.txtPEUt07HF4);
        descricao4 = findViewById(R.id.spPEUt07Desc4);
        paradaInicial5 = findViewById(R.id.txtPEUt07HI5);
        paradaFinal5 = findViewById(R.id.txtPEUt07HF5);
        descricao5 = findViewById(R.id.spPEUt07Desc5);
        paradaInicial6 = findViewById(R.id.txtPEUt07HI6);
        paradaFinal6 = findViewById(R.id.txtPEUt07HF6);
        descricao6 = findViewById(R.id.spPEUt07Desc6);
        paradaInicial7 = findViewById(R.id.txtPEUt07HI7);
        paradaFinal7 = findViewById(R.id.txtPEUt07HF7);
        descricao7 = findViewById(R.id.spPEUt07Desc7);
        paradaInicial8 = findViewById(R.id.txtPEUt07HI8);
        paradaFinal8 = findViewById(R.id.txtPEUt07HF8);
        descricao8 = findViewById(R.id.spPEUt07Desc8);
        paradaInicial9 = findViewById(R.id.txtPEUt07HI9);
        paradaFinal9 = findViewById(R.id.txtPEUt07HF9);
        descricao9 = findViewById(R.id.spPEUt07Desc9);
        paradaInicial10 = findViewById(R.id.txtPEUt07HI10);
        paradaFinal10 = findViewById(R.id.txtPEUt07HF10);
        descricao10 = findViewById(R.id.spPEUt07Desc10);
        lanternagem = findViewById(R.id.chkUt07Lant);
        pneus = findViewById(R.id.chkUt07Pn);
        h2o = findViewById(R.id.chkUt07H2O);
        oleo = findViewById(R.id.chkUt07Ol);
        direcao = findViewById(R.id.chkUt07Dir);
        freios = findViewById(R.id.chkUt07Fr);
        parteEletrica = findViewById(R.id.chkUt07PtElet);
        observacoes = findViewById(R.id.txtUt07Obs);
        condicaoPista = findViewById(R.id.spUt07CondPista);
        numViagens78078 = findViewById(R.id.txtUt07NumViagens78078);
        numViagens78089 = findViewById(R.id.txtUt07NumViagens78089);
        numViagens780910 = findViewById(R.id.txtUt07NumViagens780910);
        numViagens7801011 = findViewById(R.id.txtUt07NumViagens7801011);
        numViagens7801112 = findViewById(R.id.txtUt07NumViagens7801112);
        numViagens7801213 = findViewById(R.id.txtUt07NumViagens7801213);
        numViagens7801314 = findViewById(R.id.txtUt07NumViagens7801314);
        numViagens7801415 = findViewById(R.id.txtUt07NumViagens7801415);
        numViagens7801516 = findViewById(R.id.txtUt07NumViagens7801516);
        numViagens7801617 = findViewById(R.id.txtUt07NumViagens7801617);
        numViagens7801718 = findViewById(R.id.txtUt07NumViagens7801718);
        obs78=findViewById(R.id.txtUt07Obs78);
        obs89=findViewById(R.id.txtUt07Obs89);
        obs910=findViewById(R.id.txtUt07Obs910);
        obs1011=findViewById(R.id.txtUt07Obs1011);
        obs1112=findViewById(R.id.txtUt07Obs1112);
        obs1213=findViewById(R.id.txtUt07Obs1213);
        obs1314=findViewById(R.id.txtUt07Obs1314);
        obs1415=findViewById(R.id.txtUt07Obs1415);
        obs1516=findViewById(R.id.txtUt07Obs1516);
        obs1617=findViewById(R.id.txtUt07Obs1617);
        obs1718=findViewById(R.id.txtUt07Obs1718);
        numViagensAm = findViewById(R.id.txtUt07NumViagensEstoqueAM);
        numViagensBicaCont = findViewById(R.id.txtUt07NumViagensEstoqueAMUM);
        numViagensAf = findViewById(R.id.txtUt07NumViagensEstoqueAF);
        numViagensPedrisco = findViewById(R.id.txtUt07NumViagensEstoquePedrisco);
        numViagensBicaPr = findViewById(R.id.txtUt07NumViagensEstoqueBicaPr);
        numViagensBica790 = findViewById(R.id.txtUt07NumViagensEstoque790);
        numViagensBicaUm = findViewById(R.id.txtUt07NumViagensEstoqueBicaUM);
        numViagensBr1Pr = findViewById(R.id.txtUt07NumViagensEstoqueB1Pr);
        numViagensBr119 = findViewById(R.id.txtUt07NumViagensEstoqueB119);
        numViagensBr0Pr = findViewById(R.id.txtUt07NumViagensEstoqueB0Pr);
        numViagensBr0Um = findViewById(R.id.txtUt07NumViagensEstoqueB0UM);
        numViagensBicaForro = findViewById(R.id.txtUt07NumViagensDServForro);
        numViagensB0 = findViewById(R.id.txtUt07NumViagensDServB0);
        numViagensB1 = findViewById(R.id.txtUt07NumViagensDServB1);
        numViagensB2 = findViewById(R.id.txtUt07NumViagensDServB2);
        numViagensAim = findViewById(R.id.txtUt07NumViagensDServAIM);
        numViagensFundo = findViewById(R.id.txtUt07NumViagensDServFundo);
        numViagens780 = findViewById(R.id.txtUt07NumViagensFogacho780);
        numViagens790 = findViewById(R.id.txtUt07NumViagensFogacho790);
        numViagens800 = findViewById(R.id.txtUt07NumViagensFogacho800);
        numViagens810 = findViewById(R.id.txtUt07NumViagensFogacho810);
        soma780 = findViewById(R.id.txtUt07NumViagensSoma780);
        btnUt07Salvar=findViewById(R.id.btnUt07Save);
        btnUt07Sincronizar=findViewById(R.id.btnUt07Sincronizar);
        btnUt07Sincronizar.setVisibility(View.INVISIBLE);
        condicaoPistaObservacoes = findViewById(R.id.txtUt07CondPistaObs);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUt07);

        dao = new Ut07DAO(this);
        dao2=new Ut07DAOSync(this);


        TextView horaI = (TextView) findViewById(R.id.txtUt07HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUt07Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        Spinner spPEUt07Desc1 = findViewById(R.id.spPEUt07Desc1);
        ArrayAdapter<CharSequence> adapterDesc = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc1.setAdapter(adapterDesc);


        Spinner spPEUt07Desc2 = findViewById(R.id.spPEUt07Desc2);
        ArrayAdapter<CharSequence> adapterDesc2 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc2.setAdapter(adapterDesc2);


        Spinner spPEUt07Desc3 = findViewById(R.id.spPEUt07Desc3);
        ArrayAdapter<CharSequence> adapterDesc3 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc3.setAdapter(adapterDesc3);


        Spinner spPEUt07Desc4 = findViewById(R.id.spPEUt07Desc4);
        ArrayAdapter<CharSequence> adapterDesc4 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc4.setAdapter(adapterDesc4);


        Spinner spPEUt07Desc5 = findViewById(R.id.spPEUt07Desc5);
        ArrayAdapter<CharSequence> adapterDesc5 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc5.setAdapter(adapterDesc5);


        Spinner spPEUt07Desc6 = findViewById(R.id.spPEUt07Desc6);
        ArrayAdapter<CharSequence> adapterDesc6 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc6.setAdapter(adapterDesc6);


        Spinner spPEUt07Desc7 = findViewById(R.id.spPEUt07Desc7);
        ArrayAdapter<CharSequence> adapterDesc7 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc7.setAdapter(adapterDesc7);


        Spinner spPEUt07Desc8 = findViewById(R.id.spPEUt07Desc8);
        ArrayAdapter<CharSequence> adapterDesc8 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc8.setAdapter(adapterDesc8);


        Spinner spPEUt07Desc9 = findViewById(R.id.spPEUt07Desc9);
        ArrayAdapter<CharSequence> adapterDesc9 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc9.setAdapter(adapterDesc9);


        Spinner spPEUt07Desc10 = findViewById(R.id.spPEUt07Desc10);
        ArrayAdapter<CharSequence> adapterDesc10 = ArrayAdapter.createFromResource(this, R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUt07Desc10.setAdapter(adapterDesc10);


        Spinner spUt07CondPista = findViewById(R.id.spUt07CondPista);
        ArrayAdapter<CharSequence> adapterCondPista = ArrayAdapter.createFromResource(this, R.array.condPista, android.R.layout.simple_spinner_item);
        adapterCondPista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spUt07CondPista.setAdapter(adapterCondPista);


        btnUt07Cancelar = findViewById(R.id.btnUt07Cancel);
        btnUt07Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Ut07Activity.this);
                View view = LayoutInflater.from(Ut07Activity.this).inflate(R.layout.alert_dialog, null);
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

        btnUt07Viagens78078Mais = (Button) findViewById(R.id.btnUt07Viagens78078Mais);
        btnUt07Viagens78078Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens78078 = (TextView) findViewById(R.id.txtUt07NumViagens78078);

            @Override
            public void onClick(View v) {
                numero78078 += 1;
                txtUt07NumViagens78078.setText(String.valueOf(numero78078));
                soma780();
            }
        });
        btnUt07Viagens78078Menos = (Button) findViewById(R.id.btnUt07Viagens78078Menos);
        btnUt07Viagens78078Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens78078 = (TextView) findViewById(R.id.txtUt07NumViagens78078);

            @Override
            public void onClick(View v) {
                if (numero78078 > 0) {
                    numero78078 -= 1;
                    txtUt07NumViagens78078.setText(String.valueOf(numero78078));
                } else {
                    numero78078 = 0;
                }
                soma780();
            }
        });

//===================== VIAGENS 790E -89======================================================================
        btnUt07Viagens78089Mais = (Button) findViewById(R.id.btnUt07Viagens78089Mais);
        btnUt07Viagens78089Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens78089 = (TextView) findViewById(R.id.txtUt07NumViagens78089);

            @Override
            public void onClick(View v) {
                numero78089 += 1;
                txtUt07NumViagens78089.setText(String.valueOf(numero78089));
                soma780();
            }
        });
        btnUt07Viagens78089Menos = (Button) findViewById(R.id.btnUt07Viagens78089Menos);
        btnUt07Viagens78089Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens78089 = (TextView) findViewById(R.id.txtUt07NumViagens78089);

            @Override
            public void onClick(View v) {
                if (numero78089 > 0) {
                    numero78089 -= 1;
                    txtUt07NumViagens78089.setText(String.valueOf(numero78089));
                } else {
                    numero78089 = 0;
                }
                soma780();
            }
        });


//===================== VIAGENS 780 -910======================================================================

        btnUt07Viagens780910Mais = (Button) findViewById(R.id.btnUt07Viagens780910Mais);
        btnUt07Viagens780910Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens780910 = (TextView) findViewById(R.id.txtUt07NumViagens780910);

            @Override
            public void onClick(View v) {
                numero780910 += 1;
                txtUt07NumViagens780910.setText(String.valueOf(numero780910));
                soma780();
            }
        });
        btnUt07Viagens780910Menos = (Button) findViewById(R.id.btnUt07Viagens780910Menos);
        btnUt07Viagens780910Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens780910 = (TextView) findViewById(R.id.txtUt07NumViagens780910);

            @Override
            public void onClick(View v) {
                if (numero780910 > 0) {
                    numero780910 -= 1;
                    txtUt07NumViagens780910.setText(String.valueOf(numero780910));
                } else {
                    numero780910 = 0;
                }
                soma780();
            }
        });

//===================== VIAGENS 780 -1011======================================================================

        btnUt07Viagens7801011Mais = (Button) findViewById(R.id.btnUt07Viagens7801011Mais);
        btnUt07Viagens7801011Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801011 = (TextView) findViewById(R.id.txtUt07NumViagens7801011);

            @Override
            public void onClick(View v) {
                numero7801011 += 1;
                txtUt07NumViagens7801011.setText(String.valueOf(numero7801011));
                soma780();
            }
        });
        btnUt07Viagens7801011Menos = (Button) findViewById(R.id.btnUt07Viagens7801011Menos);
        btnUt07Viagens7801011Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801011 = (TextView) findViewById(R.id.txtUt07NumViagens7801011);

            @Override
            public void onClick(View v) {
                if (numero7801011 > 0) {
                    numero7801011 -= 1;
                    txtUt07NumViagens7801011.setText(String.valueOf(numero7801011));
                } else {
                    numero7801011 = 0;
                }
                soma780();
            }
        });


        //===================== VIAGENS 780 -1112======================================================================

        btnUt07Viagens7801112Mais = (Button) findViewById(R.id.btnUt07Viagens7801112Mais);
        btnUt07Viagens7801112Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801112 = (TextView) findViewById(R.id.txtUt07NumViagens7801112);

            @Override
            public void onClick(View v) {
                numero7801112 += 1;
                txtUt07NumViagens7801112.setText(String.valueOf(numero7801112));
                soma780();
            }
        });
        btnUt07Viagens7801112Menos = (Button) findViewById(R.id.btnUt07Viagens7801112Menos);
        btnUt07Viagens7801112Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801112 = (TextView) findViewById(R.id.txtUt07NumViagens7801112);

            @Override
            public void onClick(View v) {
                if (numero7801112 > 0) {
                    numero7801112 -= 1;
                    txtUt07NumViagens7801112.setText(String.valueOf(numero7801112));
                } else {
                    numero7801112 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1213======================================================================

        btnUt07Viagens7801213Mais = (Button) findViewById(R.id.btnUt07Viagens7801213Mais);
        btnUt07Viagens7801213Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801213 = (TextView) findViewById(R.id.txtUt07NumViagens7801213);

            @Override
            public void onClick(View v) {
                numero7801213 += 1;
                txtUt07NumViagens7801213.setText(String.valueOf(numero7801213));
                soma780();
            }
        });
        btnUt07Viagens7801213Menos = (Button) findViewById(R.id.btnUt07Viagens7801213Menos);
        btnUt07Viagens7801213Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801213 = (TextView) findViewById(R.id.txtUt07NumViagens7801213);

            @Override
            public void onClick(View v) {
                if (numero7801213 > 0) {
                    numero7801213 -= 1;
                    txtUt07NumViagens7801213.setText(String.valueOf(numero7801213));
                } else {
                    numero7801213 = 0;
                }
                soma780();
            }
        });
        //===================== VIAGENS 780 -1314======================================================================

        btnUt07Viagens7801314Mais = (Button) findViewById(R.id.btnUt07Viagens7801314Mais);
        btnUt07Viagens7801314Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801314 = (TextView) findViewById(R.id.txtUt07NumViagens7801314);

            @Override
            public void onClick(View v) {
                numero7801314 += 1;
                txtUt07NumViagens7801314.setText(String.valueOf(numero7801314));
                soma780();
            }
        });
        btnUt07Viagens7801314Menos = (Button) findViewById(R.id.btnUt07Viagens7801314Menos);
        btnUt07Viagens7801314Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801314 = (TextView) findViewById(R.id.txtUt07NumViagens7801314);

            @Override
            public void onClick(View v) {
                if (numero7801314 > 0) {
                    numero7801314 -= 1;
                    txtUt07NumViagens7801314.setText(String.valueOf(numero7801314));
                } else {
                    numero7801314 = 0;
                }
                soma780();
            }
        });



        //===================== VIAGENS 780 -1415======================================================================

        btnUt07Viagens7801415Mais = (Button) findViewById(R.id.btnUt07Viagens7801415Mais);
        btnUt07Viagens7801415Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801415 = (TextView) findViewById(R.id.txtUt07NumViagens7801415);

            @Override
            public void onClick(View v) {
                numero7801415 += 1;
                txtUt07NumViagens7801415.setText(String.valueOf(numero7801415));
                soma780();
            }
        });
        btnUt07Viagens7801415Menos = (Button) findViewById(R.id.btnUt07Viagens7801415Menos);
        btnUt07Viagens7801415Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801415 = (TextView) findViewById(R.id.txtUt07NumViagens7801415);

            @Override
            public void onClick(View v) {
                if (numero7801415 > 0) {
                    numero7801415 -= 1;
                    txtUt07NumViagens7801415.setText(String.valueOf(numero7801415));
                } else {
                    numero7801415 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1516======================================================================

        btnUt07Viagens7801516Mais = (Button) findViewById(R.id.btnUt07Viagens7801516Mais);
        btnUt07Viagens7801516Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801516 = (TextView) findViewById(R.id.txtUt07NumViagens7801516);

            @Override
            public void onClick(View v) {
                numero7801516 += 1;
                txtUt07NumViagens7801516.setText(String.valueOf(numero7801516));
                soma780();
            }
        });
        btnUt07Viagens7801516Menos = (Button) findViewById(R.id.btnUt07Viagens7801516Menos);
        btnUt07Viagens7801516Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801516 = (TextView) findViewById(R.id.txtUt07NumViagens7801516);

            @Override
            public void onClick(View v) {
                if (numero7801516 > 0) {
                    numero7801516 -= 1;
                    txtUt07NumViagens7801516.setText(String.valueOf(numero7801516));
                } else {
                    numero7801516 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1617======================================================================

        btnUt07Viagens7801617Mais = (Button) findViewById(R.id.btnUt07Viagens7801617Mais);
        btnUt07Viagens7801617Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801617 = (TextView) findViewById(R.id.txtUt07NumViagens7801617);

            @Override
            public void onClick(View v) {
                numero7801617 += 1;
                txtUt07NumViagens7801617.setText(String.valueOf(numero7801617));
                soma780();
            }
        });
        btnUt07Viagens7801617Menos = (Button) findViewById(R.id.btnUt07Viagens7801617Menos);
        btnUt07Viagens7801617Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801617 = (TextView) findViewById(R.id.txtUt07NumViagens7801617);

            @Override
            public void onClick(View v) {
                if (numero7801617 > 0) {
                    numero7801617 -= 1;
                    txtUt07NumViagens7801617.setText(String.valueOf(numero7801617));
                } else {
                    numero7801617 = 0;
                }
                soma780();
            }
        });

        //===================== VIAGENS 780 -1718======================================================================

        btnUt07Viagens7801718Mais = (Button) findViewById(R.id.btnUt07Viagens7801718Mais);
        btnUt07Viagens7801718Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801718 = (TextView) findViewById(R.id.txtUt07NumViagens7801718);

            @Override
            public void onClick(View v) {
                numero7801718 += 1;
                txtUt07NumViagens7801718.setText(String.valueOf(numero7801718));
                soma780();
            }
        });
        btnUt07Viagens7801718Menos = (Button) findViewById(R.id.btnUt07Viagens7801718Menos);
        btnUt07Viagens7801718Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801718 = (TextView) findViewById(R.id.txtUt07NumViagens7801718);

            @Override
            public void onClick(View v) {
                if (numero7801718 > 0) {
                    numero7801718 -= 1;
                    txtUt07NumViagens7801718.setText(String.valueOf(numero7801718));
                } else {
                    numero7801718 = 0;
                }
                soma780();
            }
        });







//===================== VIAGENS 790E -78======================================================================



        //===================== VIAGENS 780 -1516======================================================================

        btnUt07Viagens7801516Mais = (Button) findViewById(R.id.btnUt07Viagens7801516Mais);
        btnUt07Viagens7801516Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801516 = (TextView) findViewById(R.id.txtUt07NumViagens7801516);

            @Override
            public void onClick(View v) {
                numero7801516 += 1;
                txtUt07NumViagens7801516.setText(String.valueOf(numero7801516));
                soma780();
            }
        });
        btnUt07Viagens7801516Menos = (Button) findViewById(R.id.btnUt07Viagens7801516Menos);
        btnUt07Viagens7801516Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagens7801516 = (TextView) findViewById(R.id.txtUt07NumViagens7801516);

            @Override
            public void onClick(View v) {
                if (numero7801516 > 0) {
                    numero7801516 -= 1;
                    txtUt07NumViagens7801516.setText(String.valueOf(numero7801516));
                } else {
                    numero7801516 = 0;
                }
                soma780();
            }
        });



//===================== VIAGENS ESTOQUE Areia Média Praça======================================================================

        btnUt07VEAMMais = (Button) findViewById(R.id.btnUt07VEAMMais);
        btnUt07VEAMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAM);

            @Override
            public void onClick(View v) {
                numeroAMPr += 1;
                txtUt07NumViagensEstoqueAM.setText(String.valueOf(numeroAMPr));

            }
        });
        btnUt07VEAMMenos = (Button) findViewById(R.id.btnUt07VEAMMenos);
        btnUt07VEAMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAM);

            @Override
            public void onClick(View v) {
                if (numeroAMPr > 0) {
                    numeroAMPr -= 1;
                    txtUt07NumViagensEstoqueAM.setText(String.valueOf(numeroAMPr));
                } else {
                    numeroAMPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Areia Média UM======================================================================


        btnUt07VEAMUMMais = (Button) findViewById(R.id.btnUt07VEAMUMMais);
        btnUt07VEAMUMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAMUM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAMUM);

            @Override
            public void onClick(View v) {
                numeroAMUM += 1;
                txtUt07NumViagensEstoqueAMUM.setText(String.valueOf(numeroAMUM));

            }
        });
        btnUt07VEAMUMMenos = (Button) findViewById(R.id.btnUt07VEAMUMMenos);
        btnUt07VEAMUMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAMUM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAMUM);

            @Override
            public void onClick(View v) {
                if (numeroAMUM > 0) {
                    numeroAMUM -= 1;
                    txtUt07NumViagensEstoqueAMUM.setText(String.valueOf(numeroAMUM));
                } else {
                    numeroAMUM = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Areia Fina======================================================================


        btnUt07VEAFMais = (Button) findViewById(R.id.btnUt07VEAFMais);
        btnUt07VEAFMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAF = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAF);

            @Override
            public void onClick(View v) {
                numeroAF += 1;
                txtUt07NumViagensEstoqueAF.setText(String.valueOf(numeroAF));

            }
        });
        btnUt07VEAFMenos = (Button) findViewById(R.id.btnUt07VEAFMenos);
        btnUt07VEAFMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueAF = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueAF);

            @Override
            public void onClick(View v) {
                if (numeroAF > 0) {
                    numeroAF -= 1;
                    txtUt07NumViagensEstoqueAF.setText(String.valueOf(numeroAF));
                } else {
                    numeroAF = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Pedrisco======================================================================


        btnUt07VEPedrMais = (Button) findViewById(R.id.btnUt07VEPedrMais);
        btnUt07VEPedrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoquePedrisco = (TextView) findViewById(R.id.txtUt07NumViagensEstoquePedrisco);

            @Override
            public void onClick(View v) {
                numeroPr += 1;
                txtUt07NumViagensEstoquePedrisco.setText(String.valueOf(numeroPr));

            }
        });
        btnUt07VEPedrMenos = (Button) findViewById(R.id.btnUt07VEPedrMenos);
        btnUt07VEPedrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoquePedrisco = (TextView) findViewById(R.id.txtUt07NumViagensEstoquePedrisco);

            @Override
            public void onClick(View v) {
                if (numeroPr > 0) {
                    numeroPr -= 1;
                    txtUt07NumViagensEstoquePedrisco.setText(String.valueOf(numeroPr));
                } else {
                    numeroPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt07VEBicaPrMais = (Button) findViewById(R.id.btnUt07VEBicaPrMais);
        btnUt07VEBicaPrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueBicaPr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueBicaPr);

            @Override
            public void onClick(View v) {
                numeroBiPr += 1;
                txtUt07NumViagensEstoqueBicaPr.setText(String.valueOf(numeroBiPr));

            }
        });
        btnUt07VEBicaPrMenos = (Button) findViewById(R.id.btnUt07VEBicaPrMenos);
        btnUt07VEBicaPrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueBicaPr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueBicaPr);

            @Override
            public void onClick(View v) {
                if (numeroBiPr > 0) {
                    numeroBiPr -= 1;
                    txtUt07NumViagensEstoqueBicaPr.setText(String.valueOf(numeroBiPr));
                } else {
                    numeroBiPr = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt07VEBica790Mais = (Button) findViewById(R.id.btnUt07VEBica790Mais);
        btnUt07VEBica790Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoque790 = (TextView) findViewById(R.id.txtUt07NumViagensEstoque790);

            @Override
            public void onClick(View v) {
                numeroBi790 += 1;
                txtUt07NumViagensEstoque790.setText(String.valueOf(numeroBi790));

            }
        });
        btnUt07VEBica790Menos = (Button) findViewById(R.id.btnUt07VEBica790Menos);
        btnUt07VEBica790Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoque790 = (TextView) findViewById(R.id.txtUt07NumViagensEstoque790);

            @Override
            public void onClick(View v) {
                if (numeroBi790 > 0) {
                    numeroBi790 -= 1;
                    txtUt07NumViagensEstoque790.setText(String.valueOf(numeroBi790));
                } else {
                    numeroBi790 = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Brita1 Praça======================================================================


        btnUt07VEBicaUMMais = (Button) findViewById(R.id.btnUt07VEBicaUMMais);
        btnUt07VEBicaUMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueBicaUM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueBicaUM);

            @Override
            public void onClick(View v) {
                numeroBiUM += 1;
                txtUt07NumViagensEstoqueBicaUM.setText(String.valueOf(numeroBiUM));

            }
        });
        btnUt07VEBicaUMMenos = (Button) findViewById(R.id.btnUt07VEBicaUMMenos);
        btnUt07VEBicaUMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueBicaUM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueBicaUM);

            @Override
            public void onClick(View v) {
                if (numeroBiUM > 0) {
                    numeroBiUM -= 1;
                    txtUt07NumViagensEstoqueBicaUM.setText(String.valueOf(numeroBiUM));
                } else {
                    numeroBiUM = 0;
                }

            }
        });


//===================== VIAGENS ESTOQUE Brita 1 19mm======================================================================


        btnUt07VEB1PrMais = (Button) findViewById(R.id.btnUt07VEB1PrMais);
        btnUt07VEB1PrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB1Pr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB1Pr);

            @Override
            public void onClick(View v) {
                numeroBrPr += 1;
                txtUt07NumViagensEstoqueB1Pr.setText(String.valueOf(numeroBrPr));

            }
        });
        btnUt07VEB1PrMenos = (Button) findViewById(R.id.btnUt07VEB1PrMenos);
        btnUt07VEB1PrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB1Pr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB1Pr);

            @Override
            public void onClick(View v) {
                if (numeroBrPr > 0) {
                    numeroBrPr -= 1;
                    txtUt07NumViagensEstoqueB1Pr.setText(String.valueOf(numeroBrPr));
                } else {
                    numeroBrPr = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 Praça======================================================================


        btnUt07VEB119Mais = (Button) findViewById(R.id.btnUt07VEB119Mais);
        btnUt07VEB119Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB119 = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB119);

            @Override
            public void onClick(View v) {
                numeroBr119 += 1;
                txtUt07NumViagensEstoqueB119.setText(String.valueOf(numeroBr119));
            }
        });
        btnUt07VEB119Menos = (Button) findViewById(R.id.btnUt07VEB119Menos);
        btnUt07VEB119Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB119 = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB119);

            @Override
            public void onClick(View v) {
                if (numeroBr119 > 0) {
                    numeroBr119 -= 1;
                    txtUt07NumViagensEstoqueB119.setText(String.valueOf(numeroBr119));
                } else {
                    numeroBr119 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 UM======================================================================


        btnUt07VEB0PrMais = (Button) findViewById(R.id.btnUt07VEB0PrMais);
        btnUt07VEB0PrMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB0Pr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB0Pr);

            @Override
            public void onClick(View v) {
                numeroBr0Pr += 1;
                txtUt07NumViagensEstoqueB0Pr.setText(String.valueOf(numeroBr0Pr));
            }
        });
        btnUt07VEB0PrMenos = (Button) findViewById(R.id.btnUt07VEB0PrMenos);
        btnUt07VEB0PrMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB0Pr = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB0Pr);

            @Override
            public void onClick(View v) {
                if (numeroBr0Pr > 0) {
                    numeroBr0Pr -= 1;
                    txtUt07NumViagensEstoqueB0Pr.setText(String.valueOf(numeroBr0Pr));
                } else {
                    numeroBr0Pr = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Brita 0 UM======================================================================


        btnUt07VEB0UMMais = (Button) findViewById(R.id.btnUt07VEB0UMMais);
        btnUt07VEB0UMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB0UM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB0UM);

            @Override
            public void onClick(View v) {
                numeroBr0UM += 1;
                txtUt07NumViagensEstoqueB0UM.setText(String.valueOf(numeroBr0UM));
            }
        });
        btnUt07VEB0UMMenos = (Button) findViewById(R.id.btnUt07VEB0UMMenos);
        btnUt07VEB0UMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensEstoqueB0UM = (TextView) findViewById(R.id.txtUt07NumViagensEstoqueB0UM);

            @Override
            public void onClick(View v) {
                if (numeroBr0UM > 0) {
                    numeroBr0UM -= 1;
                    txtUt07NumViagensEstoqueB0UM.setText(String.valueOf(numeroBr0UM));
                } else {
                    numeroBr0UM = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Média Praça======================================================================


        btnUt07ViagensDServForroMais = (Button) findViewById(R.id.btnUt07ViagensDServForroMais);
        btnUt07ViagensDServForroMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServForro = (TextView) findViewById(R.id.txtUt07NumViagensDServForro);

            @Override
            public void onClick(View v) {
                numeroBiForro += 1;
                txtUt07NumViagensDServForro.setText(String.valueOf(numeroBiForro));
            }
        });
        btnUt07ViagensDServForroMenos = (Button) findViewById(R.id.btnUt07ViagensDServForroMenos);
        btnUt07ViagensDServForroMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServForro = (TextView) findViewById(R.id.txtUt07NumViagensDServForro);

            @Override
            public void onClick(View v) {
                if (numeroBiForro > 0) {
                    numeroBiForro -= 1;
                    txtUt07NumViagensDServForro.setText(String.valueOf(numeroBiForro));
                } else {
                    numeroBiForro = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Média UM======================================================================


        btnUt07ViagensDServB0Mais = (Button) findViewById(R.id.btnUt07ViagensDServB0Mais);
        btnUt07ViagensDServB0Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB0 = (TextView) findViewById(R.id.txtUt07NumViagensDServB0);

            @Override
            public void onClick(View v) {
                numeroB0 += 1;
                txtUt07NumViagensDServB0.setText(String.valueOf(numeroB0));
            }
        });
        btnUt07ViagensDServB0Menos = (Button) findViewById(R.id.btnUt07ViagensDServB0Menos);
        btnUt07ViagensDServB0Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB0 = (TextView) findViewById(R.id.txtUt07NumViagensDServB0);

            @Override
            public void onClick(View v) {
                if (numeroB0 > 0) {
                    numeroB0 -= 1;
                    txtUt07NumViagensDServB0.setText(String.valueOf(numeroB0));
                } else {
                    numeroB0 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Areia Fina======================================================================

        btnUt07ViagensDServB1Mais = (Button) findViewById(R.id.btnUt07ViagensDServB1Mais);
        btnUt07ViagensDServB1Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB1 = (TextView) findViewById(R.id.txtUt07NumViagensDServB1);

            @Override
            public void onClick(View v) {
                numeroB1 += 1;
                txtUt07NumViagensDServB1.setText(String.valueOf(numeroB1));
            }
        });
        btnUt07ViagensDServB1Menos = (Button) findViewById(R.id.btnUt07ViagensDServB1Menos);
        btnUt07ViagensDServB1Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB1 = (TextView) findViewById(R.id.txtUt07NumViagensDServB1);

            @Override
            public void onClick(View v) {
                if (numeroB1 > 0) {
                    numeroB1 -= 1;
                    txtUt07NumViagensDServB1.setText(String.valueOf(numeroB1));
                } else {
                    numeroB1 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Pedrisco======================================================================


        btnUt07ViagensDServB2Mais = (Button) findViewById(R.id.btnUt07ViagensDServB2Mais);
        btnUt07ViagensDServB2Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB2 = (TextView) findViewById(R.id.txtUt07NumViagensDServB2);

            @Override
            public void onClick(View v) {
                numeroB2 += 1;
                txtUt07NumViagensDServB2.setText(String.valueOf(numeroB2));
            }
        });
        btnUt07ViagensDServB2Menos = (Button) findViewById(R.id.btnUt07ViagensDServB2Menos);
        btnUt07ViagensDServB2Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServB2 = (TextView) findViewById(R.id.txtUt07NumViagensDServB2);

            @Override
            public void onClick(View v) {
                if (numeroB2 > 0) {
                    numeroB2 -= 1;
                    txtUt07NumViagensDServB2.setText(String.valueOf(numeroB2));
                } else {
                    numeroB2 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt07ViagensDServFundoMais = (Button) findViewById(R.id.btnUt07ViagensDServFundoMais);
        btnUt07ViagensDServFundoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServFundo = (TextView) findViewById(R.id.txtUt07NumViagensDServFundo);

            @Override
            public void onClick(View v) {
                numeroFundo += 1;
                txtUt07NumViagensDServFundo.setText(String.valueOf(numeroFundo));
            }
        });
        btnUt07ViagensDServFundoMenos = (Button) findViewById(R.id.btnUt07ViagensDServFundoMenos);
        btnUt07ViagensDServFundoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServFundo = (TextView) findViewById(R.id.txtUt07NumViagensDServFundo);

            @Override
            public void onClick(View v) {
                if (numeroFundo > 0) {
                    numeroFundo -= 1;
                    txtUt07NumViagensDServFundo.setText(String.valueOf(numeroFundo));
                } else {
                    numeroFundo = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica Praça======================================================================


        btnUt07ViagensDServAIMMais = (Button) findViewById(R.id.btnUt07ViagensDServAIMMais);
        btnUt07ViagensDServAIMMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServAIM = (TextView) findViewById(R.id.txtUt07NumViagensDServAIM);

            @Override
            public void onClick(View v) {
                numeroAIM += 1;
                txtUt07NumViagensDServAIM.setText(String.valueOf(numeroAIM));
            }
        });
        btnUt07ViagensDServAIMMenos = (Button) findViewById(R.id.btnUt07ViagensDServAIMMenos);
        btnUt07ViagensDServAIMMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensDServAIM = (TextView) findViewById(R.id.txtUt07NumViagensDServAIM);

            @Override
            public void onClick(View v) {
                if (numeroAIM > 0) {
                    numeroAIM -= 1;
                    txtUt07NumViagensDServAIM.setText(String.valueOf(numeroAIM));
                } else {
                    numeroAIM = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt07ViagensFogacho780Mais = (Button) findViewById(R.id.btnUt07ViagensFogacho780Mais);
        btnUt07ViagensFogacho780Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho780 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho780);

            @Override
            public void onClick(View v) {
                Fogacho780 += 1;
                txtUt07NumViagensFogacho780.setText(String.valueOf(Fogacho780));
            }
        });
        btnUt07ViagensFogacho780Menos = (Button) findViewById(R.id.btnUt07ViagensFogacho780Menos);
        btnUt07ViagensFogacho780Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho780 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho780);

            @Override
            public void onClick(View v) {
                if (Fogacho780 > 0) {
                    Fogacho780 -= 1;
                    txtUt07NumViagensFogacho780.setText(String.valueOf(Fogacho780));
                } else {
                    Fogacho780 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt07ViagensFogacho790Mais = (Button) findViewById(R.id.btnUt07ViagensFogacho790Mais);
        btnUt07ViagensFogacho790Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho790 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho790);

            @Override
            public void onClick(View v) {
                Fogacho790 += 1;
                txtUt07NumViagensFogacho790.setText(String.valueOf(Fogacho790));
            }
        });
        btnUt07ViagensFogacho790Menos = (Button) findViewById(R.id.btnUt07ViagensFogacho790Menos);
        btnUt07ViagensFogacho790Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho790 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho790);

            @Override
            public void onClick(View v) {
                if (Fogacho790 > 0) {
                    Fogacho790 -= 1;
                    txtUt07NumViagensFogacho790.setText(String.valueOf(Fogacho790));
                } else {
                    Fogacho790 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt07ViagensFogacho800Mais = (Button) findViewById(R.id.btnUt07ViagensFogacho800Mais);
        btnUt07ViagensFogacho800Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho800 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho800);

            @Override
            public void onClick(View v) {
                Fogacho800 += 1;
                txtUt07NumViagensFogacho800.setText(String.valueOf(Fogacho800));
            }
        });
        btnUt07ViagensFogacho800Menos = (Button) findViewById(R.id.btnUt07ViagensFogacho800Menos);
        btnUt07ViagensFogacho800Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho800 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho800);

            @Override
            public void onClick(View v) {
                if (Fogacho800 > 0) {
                    Fogacho800 -= 1;
                    txtUt07NumViagensFogacho800.setText(String.valueOf(Fogacho800));
                } else {
                    Fogacho800 = 0;
                }
            }
        });


//===================== VIAGENS ESTOQUE Bica UM======================================================================


        btnUt07ViagensFogacho810Mais = (Button) findViewById(R.id.btnUt07ViagensFogacho810Mais);
        btnUt07ViagensFogacho810Mais.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho810 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho810);

            @Override
            public void onClick(View v) {
                Fogacho810 += 1;
                txtUt07NumViagensFogacho810.setText(String.valueOf(Fogacho810));
            }
        });
        btnUt07ViagensFogacho810Menos = (Button) findViewById(R.id.btnUt07ViagensFogacho810Menos);
        btnUt07ViagensFogacho810Menos.setOnClickListener(new View.OnClickListener() {
            TextView txtUt07NumViagensFogacho810 = (TextView) findViewById(R.id.txtUt07NumViagensFogacho810);

            @Override
            public void onClick(View v) {
                if (Fogacho810 > 0) {
                    Fogacho810 -= 1;
                    txtUt07NumViagensFogacho810.setText(String.valueOf(Fogacho810));
                } else {
                    Fogacho810 = 0;
                }
            }
        });


//===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUt07HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUt07HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUt07HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUt07HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUt07HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUt07HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUt07HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUt07HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUt07HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUt07HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUt07HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUt07HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUt07HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUt07HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUt07HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUt07HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUt07HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUt07HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUt07HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUt07HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ut07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });



        btnUt07Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Ut07Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Ut07Activity.this);
                    View view = LayoutInflater.from(Ut07Activity.this).inflate(R.layout.sinc_dialog, null);
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
        final TextView txtsoma780 = findViewById(R.id.txtUt07NumViagensSoma780);
        TextView t1780 = findViewById(R.id.txtUt07NumViagens78078);
        TextView t2780 = findViewById(R.id.txtUt07NumViagens78089);
        TextView t0780 = findViewById(R.id.txtUt07NumViagens780910);
        TextView t4780 = findViewById(R.id.txtUt07NumViagens7801011);
        TextView t5780 = findViewById(R.id.txtUt07NumViagens7801112);
        TextView t6780 = findViewById(R.id.txtUt07NumViagens7801213);
        TextView t7780 = findViewById(R.id.txtUt07NumViagens7801314);
        TextView t8780 = findViewById(R.id.txtUt07NumViagens7801415);
        TextView t9780 = findViewById(R.id.txtUt07NumViagens7801516);
        TextView t10780 = findViewById(R.id.txtUt07NumViagens7801617);
        TextView t11780 = findViewById(R.id.txtUt07NumViagens7801718);
        int t78001 = Integer.parseInt(t1780.getText().toString());
        int t78002 = Integer.parseInt(t2780.getText().toString());
        int t78003 = Integer.parseInt(t0780.getText().toString());
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
            btnUt07Salvar.setVisibility(View.INVISIBLE);
            btnUt07Sincronizar.setVisibility(View.VISIBLE);
            Ut07 t07 = new Ut07(
                    nomeEquipamento.getText().toString(),
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


            t07.setMotorista(motorista.getText().toString());
            t07.setData(data.getText().toString());
            t07.setHoraInicial(horaInicial.getText().toString());

            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            t07.setHoraFinal(horaFinal.getText().toString());
            t07.setNomeEquipamento(nomeEquipamento.getText().toString());
            t07.setHorimetroInicial(horimetroInicial.getText().toString());
            t07.setHorimetroFinal(horimetroFinal.getText().toString());
            t07.setCondicaoPistaObservacoes(condicaoPistaObservacoes.getText().toString());
            t07.setCondicaoPista(condicaoPista.getSelectedItem().toString());

            t07.setParadaInicial1(paradaInicial1.getText().toString());
            t07.setParadaFinal1(paradaFinal1.getText().toString());
            t07.setDescricao1(descricao1.getSelectedItem().toString());
            t07.setDescricao1(descricao1.getSelectedItem().toString());
            t07.setParadaInicial2(paradaInicial2.getText().toString());
            t07.setParadaFinal2(paradaFinal2.getText().toString());
            t07.setDescricao2(descricao2.getSelectedItem().toString());
            t07.setParadaInicial3(paradaInicial3.getText().toString());
            t07.setParadaFinal3(paradaFinal3.getText().toString());
            t07.setDescricao3(descricao3.getSelectedItem().toString());
            t07.setParadaInicial4(paradaInicial4.getText().toString());
            t07.setParadaFinal4(paradaFinal4.getText().toString());
            t07.setDescricao4(descricao4.getSelectedItem().toString());
            t07.setParadaInicial5(paradaInicial5.getText().toString());
            t07.setParadaFinal5(paradaFinal5.getText().toString());
            t07.setDescricao5(descricao5.getSelectedItem().toString());
            t07.setParadaInicial6(paradaInicial6.getText().toString());
            t07.setParadaFinal6(paradaFinal6.getText().toString());
            t07.setDescricao6(descricao6.getSelectedItem().toString());
            t07.setParadaInicial7(paradaInicial7.getText().toString());
            t07.setParadaFinal7(paradaFinal7.getText().toString());
            t07.setDescricao7(descricao7.getSelectedItem().toString());
            t07.setParadaInicial8(paradaInicial8.getText().toString());
            t07.setParadaFinal8(paradaFinal8.getText().toString());
            t07.setDescricao8(descricao8.getSelectedItem().toString());
            t07.setParadaInicial9(paradaInicial9.getText().toString());
            t07.setParadaFinal9(paradaFinal9.getText().toString());
            t07.setDescricao9(descricao9.getSelectedItem().toString());
            t07.setParadaInicial10(paradaInicial10.getText().toString());
            t07.setParadaFinal10(paradaFinal10.getText().toString());
            t07.setDescricao10(descricao10.getSelectedItem().toString());

            t07.setNumViagens78078(numViagens78078.getText().toString());
            t07.setNumViagens78089(numViagens78089.getText().toString());
            t07.setNumViagens780910(numViagens780910.getText().toString());
            t07.setNumViagens7801011(numViagens7801011.getText().toString());
            t07.setNumViagens7801112(numViagens7801112.getText().toString());
            t07.setNumViagens7801213(numViagens7801213.getText().toString());
            t07.setNumViagens7801314(numViagens7801314.getText().toString());
            t07.setNumViagens7801415(numViagens7801415.getText().toString());
            t07.setNumViagens7801516(numViagens7801516.getText().toString());
            t07.setNumViagens7801617(numViagens7801617.getText().toString());
            t07.setNumViagens7801718(numViagens7801718.getText().toString());

            t07.setObs78(obs78.getText().toString());
            t07.setObs89(obs89.getText().toString());
            t07.setObs910(obs910.getText().toString());
            t07.setObs1011(obs1011.getText().toString());
            t07.setObs1112(obs1112.getText().toString());
            t07.setObs1213(obs1213.getText().toString());
            t07.setObs1314(obs1314.getText().toString());
            t07.setObs1415(obs1415.getText().toString());
            t07.setObs1516(obs1516.getText().toString());
            t07.setObs1617(obs1617.getText().toString());
            t07.setObs1718(obs1718.getText().toString());




            t07.setNumViagensAm(numViagensAm.getText().toString());
            t07.setNumViagensBicaCont(numViagensBicaCont.getText().toString());
            t07.setNumViagensAf(numViagensAf.getText().toString());
            t07.setNumViagensPedrisco(numViagensPedrisco.getText().toString());
            t07.setNumViagensBicaPr(numViagensBicaPr.getText().toString());
            t07.setNumViagensBica790(numViagensBica790.getText().toString());
            t07.setNumViagensBicaUm(numViagensBicaUm.getText().toString());
            t07.setNumViagensBr1Pr(numViagensBr1Pr.getText().toString());
            t07.setNumViagensBr119(numViagensBr119.getText().toString());
            t07.setNumViagensBr0Pr(numViagensBr0Pr.getText().toString());
            t07.setNumViagensBr0Um(numViagensBr0Um.getText().toString());

            t07.setNumViagensBicaForro(numViagensBicaForro.getText().toString());
            t07.setNumViagensB0(numViagensB0.getText().toString());
            t07.setNumViagensB1(numViagensB1.getText().toString());
            t07.setNumViagensB2(numViagensB2.getText().toString());
            t07.setNumViagensAim(numViagensAim.getText().toString());
            t07.setNumViagensFundo(numViagensFundo.getText().toString());


            t07.setNumViagens780(numViagens780.getText().toString());
            t07.setNumViagens790(numViagens790.getText().toString());
            t07.setNumViagens800(numViagens800.getText().toString());
            t07.setNumViagens810(numViagens810.getText().toString());





            //t07.setSoma780(txtsoma780.getText().toString());
            //t07.setSoma790e(txtsoma790E.getText().toString());
            //t07.setSoma790d(txtsoma790D.getText().toString());
            //t07.setSoma800(txtsoma800.getText().toString());
            //t07.setSoma810(txtsoma810.getText().toString());
            //  t07.setSomaUm(txtsomaUM.getText().toString());


            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                t07.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                t07.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                t07.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                t07.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                t07.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                t07.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                t07.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                t07.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                t07.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                t07.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                t07.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                freios.setText("Sim");
                t07.setFreios(freios.getText().toString());
            }
            if (parteEletrica.isChecked()) {
                parteEletrica.setText("Não");
                t07.setParteEletrica(parteEletrica.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                parteEletrica.setText("Sim");
                t07.setParteEletrica(parteEletrica.getText().toString());
            }


            t07.setObservacoes(observacoes.getText().toString());

            long id = dao.inserir(t07);
            Toast.makeText(this, "ut07 inserido com id: " + id, Toast.LENGTH_SHORT).show();





        }

    }



    public void sincronizar(View view){

        Ut07 t07 = new Ut07(
                nomeEquipamento.getText().toString(),
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
        long id = dao2.inserir(t07);
        Ut07Service apiService = retrofit.create(Ut07Service.class);
        Call<Ut07> call = apiService.salvarInfoUt07(t07);

        call.enqueue(new Callback<Ut07>(){
            @Override
            public void onResponse(Call<Ut07> call, Response<Ut07> response) {
                if (response.isSuccessful()){
                    Ut07 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Ut07> call, Throwable t) {

            }
        });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Ut07Activity.this);
        View view= LayoutInflater.from(Ut07Activity.this).inflate(R.layout.alert_dialog,null);
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
