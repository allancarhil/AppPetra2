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

import com.example.apppetra2.Classes.Uc07;
import com.example.apppetra2.Classes.Uc07;
import com.example.apppetra2.Classes.Uc07;
import com.example.apppetra2.DAO.Uc07DAO;
import com.example.apppetra2.DAO.Uc07DAOSync;
import com.example.apppetra2.DAO.Uc07DAO;
import com.example.apppetra2.DAO.Uc07DAO;
import com.example.apppetra2.Interfaces.Uc07Service;
import com.example.apppetra2.Interfaces.Uc07Service;
import com.example.apppetra2.Interfaces.Uc07Service;
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


public class Uc07Activity extends AppCompatActivity {
    private Button btnUc07Salvar;
    private Button btnUc07Sincronizar;
    private TextView nomeEquipamento;

    int numeroUc07B0Viagens=0;
    int numeroUc07B1Viagens=0;
    int numeroUc07B2Viagens=0;
    int numeroUc07B4Viagens=0;
    int numeroUc07AIMViagens=0;
    int numeroUc07AIFViagens=0;
    int numeroUc07BicaViagens=0;

    int numeroUc07AMPrToco=0;
    int numeroUc07AMPrTruck=0;
    int numeroUc07AMPrCarreta=0;
    int numeroUc07AMPrAxor=0;

    int numeroUc07AMUMToco=0;
    int numeroUc07AMUMTruck=0;
    int numeroUc07AMUMCarreta=0;
    int numeroUc07AMUMAxor=0;

    int numeroUc07AFToco=0;
    int numeroUc07AFTruck=0;
    int numeroUc07AFCarreta=0;
    int numeroUc07AFAxor=0;

    int numeroUc07PedToco=0;
    int numeroUc07PedTruck=0;
    int numeroUc07PedCarreta=0;
    int numeroUc07PedAxor=0;

    int numeroUc07BicaPrToco=0;
    int numeroUc07BicaPrTruck=0;
    int numeroUc07BicaPrCarreta=0;
    int numeroUc07BicaPrAxor=0;

    int numeroUc07Bica790Toco=0;
    int numeroUc07Bica790Truck=0;
    int numeroUc07Bica790Carreta=0;
    int numeroUc07Bica790Axor=0;

    int numeroUc07BicaUMToco=0;
    int numeroUc07BicaUMTruck=0;
    int numeroUc07BicaUMCarreta=0;
    int numeroUc07BicaUMAxor=0;

    int numeroUc07Br1PrToco=0;
    int numeroUc07Br1PrTruck=0;
    int numeroUc07Br1PrCarreta=0;
    int numeroUc07Br1PrAxor=0;

    int numeroUc07Br119Toco=0;
    int numeroUc07Br119Truck=0;
    int numeroUc07Br119Carreta=0;
    int numeroUc07Br119Axor=0;

    int numeroUc07Br0PrToco=0;
    int numeroUc07Br0PrTruck=0;
    int numeroUc07Br0PrCarreta=0;
    int numeroUc07Br0PrAxor=0;

    int numeroUc07Br0UMToco=0;
    int numeroUc07Br0UMTruck=0;
    int numeroUc07Br0UMCarreta=0;
    int numeroUc07Br0UMAxor=0;

    int numeroUc07SomaToco=0;
    int numeroUc07SomaTruck=0;
    int numeroUc07SomaCarreta=0;
    int numeroUc07SomaAxor=0;







    public Button btnUc07B0ViagensMais;
    public Button btnUc07B0ViagensMenos;
    public Button btnUc07B1ViagensMais;
    public Button btnUc07B1ViagensMenos;
    public Button btnUc07B2ViagensMais;
    public Button btnUc07B2ViagensMenos;
    public Button btnUc07B4ViagensMais;
    public Button btnUc07B4ViagensMenos;
    public Button btnUc07AIMViagensMais;
    public Button btnUc07AIMViagensMenos;
    public Button btnUc07AIFViagensMais;
    public Button btnUc07AIFViagensMenos;
    public Button btnUc07BicaViagensMais;
    public Button btnUc07BicaViagensMenos;


    public Button btnUc07AMPrTocoMais;
    public Button btnUc07AMPrTocoMenos;
    public Button btnUc07AMPrTruckMais;
    public Button btnUc07AMPrTruckMenos;
    public Button btnUc07AMPrCarretaMais;
    public Button btnUc07AMPrCarretaMenos;
    public Button btnUc07AMPrAxorMais;
    public Button btnUc07AMPrAxorMenos;

    public Button btnUc07AMUMTocoMais;
    public Button btnUc07AMUMTocoMenos;
    public Button btnUc07AMUMTruckMais;
    public Button btnUc07AMUMTruckMenos;
    public Button btnUc07AMUMCarretaMais;
    public Button btnUc07AMUMCarretaMenos;
    public Button btnUc07AMUMAxorMais;
    public Button btnUc07AMUMAxorMenos;

    public Button btnUc07AFTocoMais;
    public Button btnUc07AFTocoMenos;
    public Button btnUc07AFTruckMais;
    public Button btnUc07AFTruckMenos;
    public Button btnUc07AFCarretaMais;
    public Button btnUc07AFCarretaMenos;
    public Button btnUc07AFAxorMais;
    public Button btnUc07AFAxorMenos;

    public Button btnUc07PedTocoMais;
    public Button btnUc07PedTocoMenos;
    public Button btnUc07PedTruckMais;
    public Button btnUc07PedTruckMenos;
    public Button btnUc07PedCarretaMais;
    public Button btnUc07PedCarretaMenos;
    public Button btnUc07PedAxorMais;
    public Button btnUc07PedAxorMenos;

    public Button btnUc07BicaPrTocoMais;
    public Button btnUc07BicaPrTocoMenos;
    public Button btnUc07BicaPrTruckMais;
    public Button btnUc07BicaPrTruckMenos;
    public Button btnUc07BicaPrCarretaMais;
    public Button btnUc07BicaPrCarretaMenos;
    public Button btnUc07BicaPrAxorMais;
    public Button btnUc07BicaPrAxorMenos;

    public Button btnUc07Bica790TocoMais;
    public Button btnUc07Bica790TocoMenos;
    public Button btnUc07Bica790TruckMais;
    public Button btnUc07Bica790TruckMenos;
    public Button btnUc07Bica790CarretaMais;
    public Button btnUc07Bica790CarretaMenos;
    public Button btnUc07Bica790AxorMais;
    public Button btnUc07Bica790AxorMenos;

    public Button btnUc07BicaUMTocoMais;
    public Button btnUc07BicaUMTocoMenos;
    public Button btnUc07BicaUMTruckMais;
    public Button btnUc07BicaUMTruckMenos;
    public Button btnUc07BicaUMCarretaMais;
    public Button btnUc07BicaUMCarretaMenos;
    public Button btnUc07BicaUMAxorMais;
    public Button btnUc07BicaUMAxorMenos;

    public Button btnUc07Br1PrTocoMais;
    public Button btnUc07Br1PrTocoMenos;
    public Button btnUc07Br1PrTruckMais;
    public Button btnUc07Br1PrTruckMenos;
    public Button btnUc07Br1PrCarretaMais;
    public Button btnUc07Br1PrCarretaMenos;
    public Button btnUc07Br1PrAxorMais;
    public Button btnUc07Br1PrAxorMenos;

    public Button btnUc07Br119TocoMais;
    public Button btnUc07Br119TocoMenos;
    public Button btnUc07Br119TruckMais;
    public Button btnUc07Br119TruckMenos;
    public Button btnUc07Br119CarretaMais;
    public Button btnUc07Br119CarretaMenos;
    public Button btnUc07Br119AxorMais;
    public Button btnUc07Br119AxorMenos;

    public Button btnUc07Br0PrTocoMais;
    public Button btnUc07Br0PrTocoMenos;
    public Button btnUc07Br0PrTruckMais;
    public Button btnUc07Br0PrTruckMenos;
    public Button btnUc07Br0PrCarretaMais;
    public Button btnUc07Br0PrCarretaMenos;
    public Button btnUc07Br0PrAxorMais;
    public Button btnUc07Br0PrAxorMenos;

    public Button btnUc07Br0UMTocoMais;
    public Button btnUc07Br0UMTocoMenos;
    public Button btnUc07Br0UMTruckMais;
    public Button btnUc07Br0UMTruckMenos;
    public Button btnUc07Br0UMCarretaMais;
    public Button btnUc07Br0UMCarretaMenos;
    public Button btnUc07Br0UMAxorMais;
    public Button btnUc07Br0UMAxorMenos;




    public Button btnUc07Cancelar;



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
    private TextView b0Vol;
    private TextView b0NumViagens;
    private TextView b0Mot;
    private TextView b1Vol;
    private TextView b1NumViagens;
    private TextView b1Mot;
    private TextView b2Vol;
    private TextView b2NumViagens;
    private TextView b2Mot;
    private TextView b4Vol;
    private TextView b4NumViagens;
    private TextView b4Mot;
    private TextView aimVol;
    private TextView aimNumViagens;
    private TextView aimMot;
    private TextView aifVol;
    private TextView aifNumViagens;
    private TextView aifMot;
    private TextView bicaVol;
    private TextView bicaNumViagens;
    private TextView bicaMot;

    private TextView amprToco;
    private TextView amprTruck;
    private TextView amprCarreta;
    private TextView amprAxor;
    private TextView amprObs;

    private TextView amumToco;
    private TextView amumTruck;
    private TextView amumCarreta;
    private TextView amumAxor;
    private TextView amumObs;

    private TextView afToco;
    private TextView afTruck;
    private TextView afCarreta;
    private TextView afAxor;
    private TextView afObs;

    private TextView pedToco;
    private TextView pedTruck;
    private TextView pedCarreta;
    private TextView pedAxor;
    private TextView pedObs;

    private TextView bicaPrToco;
    private TextView bicaPrTruck;
    private TextView bicaPrCarreta;
    private TextView bicaPrAxor;
    private TextView bicaPrObs;

    private TextView bica790Toco;
    private TextView bica790Truck;
    private TextView bica790Carreta;
    private TextView bica790Axor;
    private TextView bica790Obs;

    private TextView bicaUmToco;
    private TextView bicaUmTruck;
    private TextView bicaUmCarreta;
    private TextView bicaUmAxor;
    private TextView bicaUmObs;

    private TextView br1PrToco;
    private TextView br1PrTruck;
    private TextView br1PrCarreta;
    private TextView br1PrAxor;
    private TextView br1PrObs;

    private TextView br119Toco;
    private TextView br119Truck;
    private TextView br119Carreta;
    private TextView br119Axor;
    private TextView br119Obs;

    private TextView br0PrToco;
    private TextView br0PrTruck;
    private TextView br0PrCarreta;
    private TextView br0PrAxor;
    private TextView br0PrObs;

    private TextView br0UmToco;
    private TextView br0UmTruck;
    private TextView br0UmCarreta;
    private TextView br0UmAxor;
    private TextView br0UmObs;

    private TextView somaToco;
    private TextView somaTruck;
    private TextView somaCarreta;
    private TextView somaAxor;

    private Uc07DAO dao;
    private Uc07DAOSync dao2;
    private Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc07);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUc07Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUc07Data);
        horaInicial=findViewById(R.id.txtUc07HI);
        horaFinal=findViewById(R.id.txtUc07HF);
        horimetroInicial=findViewById(R.id.txtUc07HoriI);
        horimetroFinal=findViewById(R.id.txtUc07HoriF);
        paradaInicial1=findViewById(R.id.txtPEUc07HI1);
        paradaFinal1=findViewById(R.id.txtPEUc07HF1);
        descricao1=findViewById(R.id.spPEUc07Desc1);
        paradaInicial2=findViewById(R.id.txtPEUc07HI2);
        paradaFinal2=findViewById(R.id.txtPEUc07HF2);
        descricao2=findViewById(R.id.spPEUc07Desc2);
        paradaInicial3=findViewById(R.id.txtPEUc07HI3);
        paradaFinal3=findViewById(R.id.txtPEUc07HF3);
        descricao3=findViewById(R.id.spPEUc07Desc3);
        paradaInicial4=findViewById(R.id.txtPEUc07HI4);
        paradaFinal4=findViewById(R.id.txtPEUc07HF4);
        descricao4=findViewById(R.id.spPEUc07Desc4);
        paradaInicial5=findViewById(R.id.txtPEUc07HI5);
        paradaFinal5=findViewById(R.id.txtPEUc07HF5);
        descricao5=findViewById(R.id.spPEUc07Desc5);
        paradaInicial6=findViewById(R.id.txtPEUc07HI6);
        paradaFinal6=findViewById(R.id.txtPEUc07HF6);
        descricao6=findViewById(R.id.spPEUc07Desc6);
        paradaInicial7=findViewById(R.id.txtPEUc07HI7);
        paradaFinal7=findViewById(R.id.txtPEUc07HF7);
        descricao7=findViewById(R.id.spPEUc07Desc7);
        paradaInicial8=findViewById(R.id.txtPEUc07HI8);
        paradaFinal8=findViewById(R.id.txtPEUc07HF8);
        descricao8=findViewById(R.id.spPEUc07Desc8);
        paradaInicial9=findViewById(R.id.txtPEUc07HI9);
        paradaFinal9=findViewById(R.id.txtPEUc07HF9);
        descricao9=findViewById(R.id.spPEUc07Desc9);
        paradaInicial10=findViewById(R.id.txtPEUc07HI10);
        paradaFinal10=findViewById(R.id.txtPEUc07HF10);
        descricao10=findViewById(R.id.spPEUc07Desc10);

        b0Vol=findViewById(R.id.txtUc07B0IntVol);
        b0NumViagens=findViewById(R.id.txtUc07B0IntNumViagens);
        b0Mot=findViewById(R.id.txtUc07B0IntMot);
        b1Vol=findViewById(R.id.txtUc07B1IntVol);
        b1NumViagens=findViewById(R.id.txtUc07B1IntNumViagens);
        b1Mot=findViewById(R.id.txtUc07B1IntMot);
        b2Vol=findViewById(R.id.txtUc07B2IntVol);
        b2NumViagens=findViewById(R.id.txtUc07B2IntNumViagens);
        b2Mot=findViewById(R.id.txtUc07B2IntMot);
        b4Vol=findViewById(R.id.txtUc07B4IntVol);
        b4NumViagens=findViewById(R.id.txtUc07B4IntNumViagens);
        b4Mot=findViewById(R.id.txtUc07B4IntMot);
        aimVol=findViewById(R.id.txtUc07AIMIntVol);
        aimNumViagens=findViewById(R.id.txtUc07AIMIntNumViagens);
        aimMot=findViewById(R.id.txtUc07AIMIntMot);
        aifVol=findViewById(R.id.txtUc07AIFIntVol);
        aifNumViagens=findViewById(R.id.txtUc07AIFIntNumViagens);
        aifMot=findViewById(R.id.txtUc07AIFIntMot);
        bicaVol=findViewById(R.id.txtUc07BicaIntVol);
        bicaNumViagens=findViewById(R.id.txtUc07BicaIntNumViagens);
        bicaMot=findViewById(R.id.txtUc07BicaIntMot);



        amprToco=findViewById(R.id.txtUc07AMPrToco);
        amprTruck=findViewById(R.id.txtUc07AMPrTruck);
        amprCarreta=findViewById(R.id.txtUc07AMPrCarreta);
        amprAxor=findViewById(R.id.txtUc07AMPrAxor);
        amprObs=findViewById(R.id.txtUc07AMPrObs);

        amumToco=findViewById(R.id.txtUc07AMUMToco);
        amumTruck=findViewById(R.id.txtUc07AMUMTruck);
        amumCarreta=findViewById(R.id.txtUc07AMUMCarreta);
        amumAxor=findViewById(R.id.txtUc07AMUMAxor);
        amumObs=findViewById(R.id.txtUc07AMUMObs);

        afToco=findViewById(R.id.txtUc07AFToco);
        afTruck=findViewById(R.id.txtUc07AFTruck);
        afCarreta=findViewById(R.id.txtUc07AFCarreta);
        afAxor=findViewById(R.id.txtUc07AFAxor);
        afObs=findViewById(R.id.txtUc07AFObs);

        pedToco=findViewById(R.id.txtUc07PedToco);
        pedTruck=findViewById(R.id.txtUc07PedTruck);
        pedCarreta=findViewById(R.id.txtUc07PedCarreta);
        pedAxor=findViewById(R.id.txtUc07PedAxor);
        pedObs=findViewById(R.id.txtUc07PedObs);

        bicaPrToco=findViewById(R.id.txtUc07BicaPrToco);
        bicaPrTruck=findViewById(R.id.txtUc07BicaPrTruck);
        bicaPrCarreta=findViewById(R.id.txtUc07BicaPrCarreta);
        bicaPrAxor=findViewById(R.id.txtUc07BicaPrAxor);
        bicaPrObs=findViewById(R.id.txtUc07BicaPrObs);

        bica790Toco=findViewById(R.id.txtUc07Bica790Toco);
        bica790Truck=findViewById(R.id.txtUc07Bica790Truck);
        bica790Carreta=findViewById(R.id.txtUc07Bica790Carreta);
        bica790Axor=findViewById(R.id.txtUc07Bica790Axor);
        bica790Obs=findViewById(R.id.txtUc07Bica790Obs);

        bicaUmToco=findViewById(R.id.txtUc07BicaUMToco);
        bicaUmTruck=findViewById(R.id.txtUc07BicaUMTruck);
        bicaUmCarreta=findViewById(R.id.txtUc07BicaUMCarreta);
        bicaUmAxor=findViewById(R.id.txtUc07BicaUMAxor);
        bicaUmObs=findViewById(R.id.txtUc07BicaUMObs);

        br1PrToco=findViewById(R.id.txtUc07Br1PrToco);
        br1PrTruck=findViewById(R.id.txtUc07Br1PrTruck);
        br1PrCarreta=findViewById(R.id.txtUc07Br1PrCarreta);
        br1PrAxor=findViewById(R.id.txtUc07Br1PrAxor);
        br1PrObs=findViewById(R.id.txtUc07Br1PrObs);

        br119Toco=findViewById(R.id.txtUc07Br119Toco);
        br119Truck=findViewById(R.id.txtUc07Br119Truck);
        br119Carreta=findViewById(R.id.txtUc07Br119Carreta);
        br119Axor=findViewById(R.id.txtUc07Br119Axor);
        br119Obs=findViewById(R.id.txtUc07Br119Obs);

        br0PrToco=findViewById(R.id.txtUc07Br0PrToco);
        br0PrTruck=findViewById(R.id.txtUc07Br0PrTruck);
        br0PrCarreta=findViewById(R.id.txtUc07Br0PrCarreta);
        br0PrAxor=findViewById(R.id.txtUc07Br0PrAxor);
        br0PrObs=findViewById(R.id.txtUc07Br0PrObs);

        br0UmToco=findViewById(R.id.txtUc07Br0UMToco);
        br0UmTruck=findViewById(R.id.txtUc07Br0UMTruck);
        br0UmCarreta=findViewById(R.id.txtUc07Br0UMCarreta);
        br0UmAxor=findViewById(R.id.txtUc07Br0UMAxor);
        br0UmObs=findViewById(R.id.txtUc07Br0UMObs);


        somaToco=findViewById(R.id.txtUc07SomaToco);
        somaTruck=findViewById(R.id.txtUc07SomaTruck);
        somaCarreta=findViewById(R.id.txtUc07SomaCarreta);
        somaAxor=findViewById(R.id.txtUc07SomaAxor);



        lanternagem=findViewById(R.id.chkUc07Lant);
        pneus=findViewById(R.id.chkUc07Pn);
        h2o=findViewById(R.id.chkUc07H2O);
        oleo=findViewById(R.id.chkUc07Ol);
        direcao=findViewById(R.id.chkUc07Dir);
        freios=findViewById(R.id.chkUc07Fr);
        parteEletrica=findViewById(R.id.chkUc07PtElet);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUc07);

        observacoes=findViewById(R.id.txtUc07Obs);

        dao=new Uc07DAO(this);
        dao2= new Uc07DAOSync(this);
        btnUc07Salvar=findViewById(R.id.btnUc07Save);
        btnUc07Sincronizar=findViewById(R.id.btnUc07Sincronizar);
        btnUc07Sincronizar.setVisibility(View.INVISIBLE);


        Spinner spPEUc07Desc1= findViewById(R.id.spPEUc07Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc1.setAdapter(adapterDesc);

        Spinner spPEUc07Desc2= findViewById(R.id.spPEUc07Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc2.setAdapter(adapterDesc2);


        Spinner spPEUc07Desc3= findViewById(R.id.spPEUc07Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc3.setAdapter(adapterDesc3);


        Spinner spPEUc07Desc4= findViewById(R.id.spPEUc07Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc4.setAdapter(adapterDesc4);




        Spinner spPEUc07Desc5= findViewById(R.id.spPEUc07Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc5.setAdapter(adapterDesc5);




        Spinner spPEUc07Desc6= findViewById(R.id.spPEUc07Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc6.setAdapter(adapterDesc6);



        Spinner spPEUc07Desc7= findViewById(R.id.spPEUc07Desc7);
        ArrayAdapter<CharSequence> adapterDesc7=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc7.setAdapter(adapterDesc7);



        Spinner spPEUc07Desc8= findViewById(R.id.spPEUc07Desc8);
        ArrayAdapter<CharSequence> adapterDesc8=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc8.setAdapter(adapterDesc8);




        Spinner spPEUc07Desc9= findViewById(R.id.spPEUc07Desc9);
        ArrayAdapter<CharSequence> adapterDesc9=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc9.setAdapter(adapterDesc9);



        Spinner spPEUc07Desc10= findViewById(R.id.spPEUc07Desc10);
        ArrayAdapter<CharSequence> adapterDesc10=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc07Desc10.setAdapter(adapterDesc10);






        TextView horaI=(TextView)findViewById(R.id.txtUc07HI);
        horaI = (TextView) findViewById(R.id.txtUc07HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUc07Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        btnUc07Cancelar= findViewById(R.id.btnUc07Cancel);
        btnUc07Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Uc07Activity.this);
                View view= LayoutInflater.from(Uc07Activity.this).inflate(R.layout.alert_dialog,null);
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







        btnUc07B0ViagensMais = (Button) findViewById(R.id.btnUc07B0IntViagensMais);
        btnUc07B0ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B0IntNumViagens = (TextView) findViewById(R.id.txtUc07B0IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07B0Viagens += 1;
                txtUc07B0IntNumViagens.setText(String.valueOf(numeroUc07B0Viagens));
            }
        });
        btnUc07B0ViagensMenos = (Button) findViewById(R.id.btnUc07B0IntViagensMenos);
        btnUc07B0ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B0IntNumViagens = (TextView) findViewById(R.id.txtUc07B0IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07B0Viagens > 0) {
                    numeroUc07B0Viagens -= 1;
                    txtUc07B0IntNumViagens.setText(String.valueOf(numeroUc07B0Viagens));
                } else {
                    numeroUc07B0Viagens = 0;
                }
            }
        });





        btnUc07B1ViagensMais = (Button) findViewById(R.id.btnUc07B1IntViagensMais);
        btnUc07B1ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B1IntNumViagens = (TextView) findViewById(R.id.txtUc07B1IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07B1Viagens += 1;
                txtUc07B1IntNumViagens.setText(String.valueOf(numeroUc07B1Viagens));
            }
        });
        btnUc07B1ViagensMenos = (Button) findViewById(R.id.btnUc07B1IntViagensMenos);
        btnUc07B1ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B1IntNumViagens = (TextView) findViewById(R.id.txtUc07B1IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07B1Viagens > 0) {
                    numeroUc07B1Viagens -= 1;
                    txtUc07B1IntNumViagens.setText(String.valueOf(numeroUc07B1Viagens));
                } else {
                    numeroUc07B1Viagens = 0;
                }
            }
        });



        btnUc07B2ViagensMais = (Button) findViewById(R.id.btnUc07B2IntViagensMais);
        btnUc07B2ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B2IntNumViagens = (TextView) findViewById(R.id.txtUc07B2IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07B2Viagens += 1;
                txtUc07B2IntNumViagens.setText(String.valueOf(numeroUc07B2Viagens));
            }
        });
        btnUc07B2ViagensMenos = (Button) findViewById(R.id.btnUc07B2IntViagensMenos);
        btnUc07B2ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B2IntNumViagens = (TextView) findViewById(R.id.txtUc07B2IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07B2Viagens > 0) {
                    numeroUc07B2Viagens -= 1;
                    txtUc07B2IntNumViagens.setText(String.valueOf(numeroUc07B2Viagens));
                } else {
                    numeroUc07B2Viagens = 0;
                }
            }
        });



        btnUc07B4ViagensMais = (Button) findViewById(R.id.btnUc07B4IntViagensMais);
        btnUc07B4ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B4IntNumViagens = (TextView) findViewById(R.id.txtUc07B4IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07B4Viagens += 1;
                txtUc07B4IntNumViagens.setText(String.valueOf(numeroUc07B4Viagens));
            }
        });
        btnUc07B4ViagensMenos = (Button) findViewById(R.id.btnUc07B4IntViagensMenos);
        btnUc07B4ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07B4IntNumViagens = (TextView) findViewById(R.id.txtUc07B4IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07B4Viagens > 0) {
                    numeroUc07B4Viagens -= 1;
                    txtUc07B4IntNumViagens.setText(String.valueOf(numeroUc07B4Viagens));
                } else {
                    numeroUc07B4Viagens = 0;
                }
            }
        });



        btnUc07AIMViagensMais = (Button) findViewById(R.id.btnUc07AIMIntViagensMais);
        btnUc07AIMViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AIMIntNumViagens = (TextView) findViewById(R.id.txtUc07AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07AIMViagens += 1;
                txtUc07AIMIntNumViagens.setText(String.valueOf(numeroUc07AIMViagens));
            }
        });
        btnUc07AIMViagensMenos = (Button) findViewById(R.id.btnUc07AIMIntViagensMenos);
        btnUc07AIMViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AIMIntNumViagens = (TextView) findViewById(R.id.txtUc07AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07AIMViagens > 0) {
                    numeroUc07AIMViagens -= 1;
                    txtUc07AIMIntNumViagens.setText(String.valueOf(numeroUc07AIMViagens));
                } else {
                    numeroUc07AIMViagens = 0;
                }
            }
        });





        btnUc07AIFViagensMais = (Button) findViewById(R.id.btnUc07AIFIntViagensMais);
        btnUc07AIFViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AIFIntNumViagens = (TextView) findViewById(R.id.txtUc07AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07AIFViagens += 1;
                txtUc07AIFIntNumViagens.setText(String.valueOf(numeroUc07AIFViagens));
            }
        });
        btnUc07AIFViagensMenos = (Button) findViewById(R.id.btnUc07AIFIntViagensMenos);
        btnUc07AIFViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AIFIntNumViagens = (TextView) findViewById(R.id.txtUc07AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07AIFViagens > 0) {
                    numeroUc07AIFViagens -= 1;
                    txtUc07AIFIntNumViagens.setText(String.valueOf(numeroUc07AIFViagens));
                } else {
                    numeroUc07AIFViagens = 0;
                }
            }
        });




        btnUc07BicaViagensMais = (Button) findViewById(R.id.btnUc07BicaIntViagensMais);
        btnUc07BicaViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaIntNumViagens = (TextView) findViewById(R.id.txtUc07BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc07BicaViagens += 1;
                txtUc07BicaIntNumViagens.setText(String.valueOf(numeroUc07BicaViagens));
            }
        });
        btnUc07BicaViagensMenos = (Button) findViewById(R.id.btnUc07BicaIntViagensMenos);
        btnUc07BicaViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaIntNumViagens = (TextView) findViewById(R.id.txtUc07BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaViagens > 0) {
                    numeroUc07BicaViagens -= 1;
                    txtUc07BicaIntNumViagens.setText(String.valueOf(numeroUc07BicaViagens));
                } else {
                    numeroUc07BicaViagens = 0;
                }
            }
        });









        btnUc07AMPrTocoMais = (Button) findViewById(R.id.btnUc07AMPrTocoMais);
        btnUc07AMPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrToco = (TextView) findViewById(R.id.txtUc07AMPrToco);

            @Override
            public void onClick(View v) {
                numeroUc07AMPrToco += 1;
                txtUc07AMPrToco.setText(String.valueOf(numeroUc07AMPrToco));
            }
        });
        btnUc07AMPrTocoMenos = (Button) findViewById(R.id.btnUc07AMPrTocoMenos);
        btnUc07AMPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrToco = (TextView) findViewById(R.id.txtUc07AMPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMPrToco > 0) {
                    numeroUc07AMPrToco -= 1;
                    txtUc07AMPrToco.setText(String.valueOf(numeroUc07AMPrToco));
                } else {
                    numeroUc07AMPrToco = 0;
                }
            }
        });


        btnUc07AMPrTruckMais = (Button) findViewById(R.id.btnUc07AMPrTruckMais);
        btnUc07AMPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrTruck = (TextView) findViewById(R.id.txtUc07AMPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc07AMPrTruck += 1;
                txtUc07AMPrTruck.setText(String.valueOf(numeroUc07AMPrTruck));
            }
        });
        btnUc07AMPrTruckMenos = (Button) findViewById(R.id.btnUc07AMPrTruckMenos);
        btnUc07AMPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrTruck = (TextView) findViewById(R.id.txtUc07AMPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMPrTruck > 0) {
                    numeroUc07AMPrTruck -= 1;
                    txtUc07AMPrTruck.setText(String.valueOf(numeroUc07AMPrTruck));
                } else {
                    numeroUc07AMPrTruck = 0;
                }
            }
        });


        btnUc07AMPrCarretaMais = (Button) findViewById(R.id.btnUc07AMPrCarretaMais);
        btnUc07AMPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrCarreta = (TextView) findViewById(R.id.txtUc07AMPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07AMPrCarreta += 1;
                txtUc07AMPrCarreta.setText(String.valueOf(numeroUc07AMPrCarreta));
            }
        });
        btnUc07AMPrCarretaMenos = (Button) findViewById(R.id.btnUc07AMPrCarretaMenos);
        btnUc07AMPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrCarreta = (TextView) findViewById(R.id.txtUc07AMPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMPrCarreta > 0) {
                    numeroUc07AMPrCarreta -= 1;
                    txtUc07AMPrCarreta.setText(String.valueOf(numeroUc07AMPrCarreta));
                } else {
                    numeroUc07AMPrCarreta = 0;
                }
            }
        });


        btnUc07AMPrAxorMais = (Button) findViewById(R.id.btnUc07AMPrAxorMais);
        btnUc07AMPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrAxor = (TextView) findViewById(R.id.txtUc07AMPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc07AMPrAxor += 1;
                txtUc07AMPrAxor.setText(String.valueOf(numeroUc07AMPrAxor));
            }
        });
        btnUc07AMPrAxorMenos = (Button) findViewById(R.id.btnUc07AMPrAxorMenos);
        btnUc07AMPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMPrAxor = (TextView) findViewById(R.id.txtUc07AMPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMPrAxor > 0) {
                    numeroUc07AMPrAxor -= 1;
                    txtUc07AMPrAxor.setText(String.valueOf(numeroUc07AMPrAxor));
                } else {
                    numeroUc07AMPrAxor = 0;
                }
            }
        });











        btnUc07AMUMTocoMais = (Button) findViewById(R.id.btnUc07AMUMTocoMais);
        btnUc07AMUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMToco = (TextView) findViewById(R.id.txtUc07AMUMToco);

            @Override
            public void onClick(View v) {
                numeroUc07AMUMToco += 1;
                txtUc07AMUMToco.setText(String.valueOf(numeroUc07AMUMToco));
            }
        });
        btnUc07AMUMTocoMenos = (Button) findViewById(R.id.btnUc07AMUMTocoMenos);
        btnUc07AMUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMToco = (TextView) findViewById(R.id.txtUc07AMUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMUMToco > 0) {
                    numeroUc07AMUMToco -= 1;
                    txtUc07AMUMToco.setText(String.valueOf(numeroUc07AMUMToco));
                } else {
                    numeroUc07AMUMToco = 0;
                }
            }
        });


        btnUc07AMUMTruckMais = (Button) findViewById(R.id.btnUc07AMUMTruckMais);
        btnUc07AMUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMTruck = (TextView) findViewById(R.id.txtUc07AMUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc07AMUMTruck += 1;
                txtUc07AMUMTruck.setText(String.valueOf(numeroUc07AMUMTruck));
            }
        });
        btnUc07AMUMTruckMenos = (Button) findViewById(R.id.btnUc07AMUMTruckMenos);
        btnUc07AMUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMTruck = (TextView) findViewById(R.id.txtUc07AMUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMUMTruck > 0) {
                    numeroUc07AMUMTruck -= 1;
                    txtUc07AMUMTruck.setText(String.valueOf(numeroUc07AMUMTruck));
                } else {
                    numeroUc07AMUMTruck = 0;
                }
            }
        });


        btnUc07AMUMCarretaMais = (Button) findViewById(R.id.btnUc07AMUMCarretaMais);
        btnUc07AMUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMCarreta = (TextView) findViewById(R.id.txtUc07AMUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07AMUMCarreta += 1;
                txtUc07AMUMCarreta.setText(String.valueOf(numeroUc07AMUMCarreta));
            }
        });
        btnUc07AMUMCarretaMenos = (Button) findViewById(R.id.btnUc07AMUMCarretaMenos);
        btnUc07AMUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMCarreta = (TextView) findViewById(R.id.txtUc07AMUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMUMCarreta > 0) {
                    numeroUc07AMUMCarreta -= 1;
                    txtUc07AMUMCarreta.setText(String.valueOf(numeroUc07AMUMCarreta));
                } else {
                    numeroUc07AMUMCarreta = 0;
                }
            }
        });


        btnUc07AMUMAxorMais = (Button) findViewById(R.id.btnUc07AMUMAxorMais);
        btnUc07AMUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMAxor = (TextView) findViewById(R.id.txtUc07AMUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc07AMUMAxor += 1;
                txtUc07AMUMAxor.setText(String.valueOf(numeroUc07AMUMAxor));
            }
        });
        btnUc07AMUMAxorMenos = (Button) findViewById(R.id.btnUc07AMUMAxorMenos);
        btnUc07AMUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AMUMAxor = (TextView) findViewById(R.id.txtUc07AMUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07AMUMAxor > 0) {
                    numeroUc07AMUMAxor -= 1;
                    txtUc07AMUMAxor.setText(String.valueOf(numeroUc07AMUMAxor));
                } else {
                    numeroUc07AMUMAxor = 0;
                }
            }
        });








        btnUc07AFTocoMais = (Button) findViewById(R.id.btnUc07AFTocoMais);
        btnUc07AFTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFToco = (TextView) findViewById(R.id.txtUc07AFToco);

            @Override
            public void onClick(View v) {
                numeroUc07AFToco += 1;
                txtUc07AFToco.setText(String.valueOf(numeroUc07AFToco));
            }
        });
        btnUc07AFTocoMenos = (Button) findViewById(R.id.btnUc07AFTocoMenos);
        btnUc07AFTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFToco = (TextView) findViewById(R.id.txtUc07AFToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07AFToco > 0) {
                    numeroUc07AFToco -= 1;
                    txtUc07AFToco.setText(String.valueOf(numeroUc07AFToco));
                } else {
                    numeroUc07AFToco = 0;
                }
            }
        });


        btnUc07AFTruckMais = (Button) findViewById(R.id.btnUc07AFTruckMais);
        btnUc07AFTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFTruck = (TextView) findViewById(R.id.txtUc07AFTruck);

            @Override
            public void onClick(View v) {
                numeroUc07AFTruck += 1;
                txtUc07AFTruck.setText(String.valueOf(numeroUc07AFTruck));
            }
        });
        btnUc07AFTruckMenos = (Button) findViewById(R.id.btnUc07AFTruckMenos);
        btnUc07AFTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFTruck = (TextView) findViewById(R.id.txtUc07AFTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07AFTruck > 0) {
                    numeroUc07AFTruck -= 1;
                    txtUc07AFTruck.setText(String.valueOf(numeroUc07AFTruck));
                } else {
                    numeroUc07AFTruck = 0;
                }
            }
        });


        btnUc07AFCarretaMais = (Button) findViewById(R.id.btnUc07AFCarretaMais);
        btnUc07AFCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFCarreta = (TextView) findViewById(R.id.txtUc07AFCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07AFCarreta += 1;
                txtUc07AFCarreta.setText(String.valueOf(numeroUc07AFCarreta));
            }
        });
        btnUc07AFCarretaMenos = (Button) findViewById(R.id.btnUc07AFCarretaMenos);
        btnUc07AFCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFCarreta = (TextView) findViewById(R.id.txtUc07AFCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07AFCarreta > 0) {
                    numeroUc07AFCarreta -= 1;
                    txtUc07AFCarreta.setText(String.valueOf(numeroUc07AFCarreta));
                } else {
                    numeroUc07AFCarreta = 0;
                }
            }
        });


        btnUc07AFAxorMais = (Button) findViewById(R.id.btnUc07AFAxorMais);
        btnUc07AFAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFAxor = (TextView) findViewById(R.id.txtUc07AFAxor);

            @Override
            public void onClick(View v) {
                numeroUc07AFAxor += 1;
                txtUc07AFAxor.setText(String.valueOf(numeroUc07AFAxor));
            }
        });
        btnUc07AFAxorMenos = (Button) findViewById(R.id.btnUc07AFAxorMenos);
        btnUc07AFAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07AFAxor = (TextView) findViewById(R.id.txtUc07AFAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07AFAxor > 0) {
                    numeroUc07AFAxor -= 1;
                    txtUc07AFAxor.setText(String.valueOf(numeroUc07AFAxor));
                } else {
                    numeroUc07AFAxor = 0;
                }
            }
        });









        btnUc07PedTocoMais = (Button) findViewById(R.id.btnUc07PedTocoMais);
        btnUc07PedTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedToco = (TextView) findViewById(R.id.txtUc07PedToco);

            @Override
            public void onClick(View v) {
                numeroUc07PedToco += 1;
                txtUc07PedToco.setText(String.valueOf(numeroUc07PedToco));
            }
        });
        btnUc07PedTocoMenos = (Button) findViewById(R.id.btnUc07PedTocoMenos);
        btnUc07PedTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedToco = (TextView) findViewById(R.id.txtUc07PedToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07PedToco > 0) {
                    numeroUc07PedToco -= 1;
                    txtUc07PedToco.setText(String.valueOf(numeroUc07PedToco));
                } else {
                    numeroUc07PedToco = 0;
                }
            }
        });


        btnUc07PedTruckMais = (Button) findViewById(R.id.btnUc07PedTruckMais);
        btnUc07PedTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedTruck = (TextView) findViewById(R.id.txtUc07PedTruck);

            @Override
            public void onClick(View v) {
                numeroUc07PedTruck += 1;
                txtUc07PedTruck.setText(String.valueOf(numeroUc07PedTruck));
            }
        });
        btnUc07PedTruckMenos = (Button) findViewById(R.id.btnUc07PedTruckMenos);
        btnUc07PedTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedTruck = (TextView) findViewById(R.id.txtUc07PedTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07PedTruck > 0) {
                    numeroUc07PedTruck -= 1;
                    txtUc07PedTruck.setText(String.valueOf(numeroUc07PedTruck));
                } else {
                    numeroUc07PedTruck = 0;
                }
            }
        });


        btnUc07PedCarretaMais = (Button) findViewById(R.id.btnUc07PedCarretaMais);
        btnUc07PedCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedCarreta = (TextView) findViewById(R.id.txtUc07PedCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07PedCarreta += 1;
                txtUc07PedCarreta.setText(String.valueOf(numeroUc07PedCarreta));
            }
        });
        btnUc07PedCarretaMenos = (Button) findViewById(R.id.btnUc07PedCarretaMenos);
        btnUc07PedCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedCarreta = (TextView) findViewById(R.id.txtUc07PedCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07PedCarreta > 0) {
                    numeroUc07PedCarreta -= 1;
                    txtUc07PedCarreta.setText(String.valueOf(numeroUc07PedCarreta));
                } else {
                    numeroUc07PedCarreta = 0;
                }
            }
        });


        btnUc07PedAxorMais = (Button) findViewById(R.id.btnUc07PedAxorMais);
        btnUc07PedAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedAxor = (TextView) findViewById(R.id.txtUc07PedAxor);

            @Override
            public void onClick(View v) {
                numeroUc07PedAxor += 1;
                txtUc07PedAxor.setText(String.valueOf(numeroUc07PedAxor));
            }
        });
        btnUc07PedAxorMenos = (Button) findViewById(R.id.btnUc07PedAxorMenos);
        btnUc07PedAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07PedAxor = (TextView) findViewById(R.id.txtUc07PedAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07PedAxor > 0) {
                    numeroUc07PedAxor -= 1;
                    txtUc07PedAxor.setText(String.valueOf(numeroUc07PedAxor));
                } else {
                    numeroUc07PedAxor = 0;
                }
            }
        });




        btnUc07BicaPrTocoMais = (Button) findViewById(R.id.btnUc07BicaPrTocoMais);
        btnUc07BicaPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrToco = (TextView) findViewById(R.id.txtUc07BicaPrToco);

            @Override
            public void onClick(View v) {
                numeroUc07BicaPrToco += 1;
                txtUc07BicaPrToco.setText(String.valueOf(numeroUc07BicaPrToco));
            }
        });
        btnUc07BicaPrTocoMenos = (Button) findViewById(R.id.btnUc07BicaPrTocoMenos);
        btnUc07BicaPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrToco = (TextView) findViewById(R.id.txtUc07BicaPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaPrToco > 0) {
                    numeroUc07BicaPrToco -= 1;
                    txtUc07BicaPrToco.setText(String.valueOf(numeroUc07BicaPrToco));
                } else {
                    numeroUc07BicaPrToco = 0;
                }
            }
        });


        btnUc07BicaPrTruckMais = (Button) findViewById(R.id.btnUc07BicaPrTruckMais);
        btnUc07BicaPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrTruck = (TextView) findViewById(R.id.txtUc07BicaPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc07BicaPrTruck += 1;
                txtUc07BicaPrTruck.setText(String.valueOf(numeroUc07BicaPrTruck));
            }
        });
        btnUc07BicaPrTruckMenos = (Button) findViewById(R.id.btnUc07BicaPrTruckMenos);
        btnUc07BicaPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrTruck = (TextView) findViewById(R.id.txtUc07BicaPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaPrTruck > 0) {
                    numeroUc07BicaPrTruck -= 1;
                    txtUc07BicaPrTruck.setText(String.valueOf(numeroUc07BicaPrTruck));
                } else {
                    numeroUc07BicaPrTruck = 0;
                }
            }
        });


        btnUc07BicaPrCarretaMais = (Button) findViewById(R.id.btnUc07BicaPrCarretaMais);
        btnUc07BicaPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrCarreta = (TextView) findViewById(R.id.txtUc07BicaPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07BicaPrCarreta += 1;
                txtUc07BicaPrCarreta.setText(String.valueOf(numeroUc07BicaPrCarreta));
            }
        });
        btnUc07BicaPrCarretaMenos = (Button) findViewById(R.id.btnUc07BicaPrCarretaMenos);
        btnUc07BicaPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrCarreta = (TextView) findViewById(R.id.txtUc07BicaPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaPrCarreta > 0) {
                    numeroUc07BicaPrCarreta -= 1;
                    txtUc07BicaPrCarreta.setText(String.valueOf(numeroUc07BicaPrCarreta));
                } else {
                    numeroUc07BicaPrCarreta = 0;
                }
            }
        });


        btnUc07BicaPrAxorMais = (Button) findViewById(R.id.btnUc07BicaPrAxorMais);
        btnUc07BicaPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrAxor = (TextView) findViewById(R.id.txtUc07BicaPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc07BicaPrAxor += 1;
                txtUc07BicaPrAxor.setText(String.valueOf(numeroUc07BicaPrAxor));
            }
        });
        btnUc07BicaPrAxorMenos = (Button) findViewById(R.id.btnUc07BicaPrAxorMenos);
        btnUc07BicaPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaPrAxor = (TextView) findViewById(R.id.txtUc07BicaPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaPrAxor > 0) {
                    numeroUc07BicaPrAxor -= 1;
                    txtUc07BicaPrAxor.setText(String.valueOf(numeroUc07BicaPrAxor));
                } else {
                    numeroUc07BicaPrAxor = 0;
                }
            }
        });










        btnUc07Bica790TocoMais = (Button) findViewById(R.id.btnUc07Bica790TocoMais);
        btnUc07Bica790TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Toco = (TextView) findViewById(R.id.txtUc07Bica790Toco);

            @Override
            public void onClick(View v) {
                numeroUc07Bica790Toco += 1;
                txtUc07Bica790Toco.setText(String.valueOf(numeroUc07Bica790Toco));
            }
        });
        btnUc07Bica790TocoMenos = (Button) findViewById(R.id.btnUc07Bica790TocoMenos);
        btnUc07Bica790TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Toco = (TextView) findViewById(R.id.txtUc07Bica790Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc07Bica790Toco > 0) {
                    numeroUc07Bica790Toco -= 1;
                    txtUc07Bica790Toco.setText(String.valueOf(numeroUc07Bica790Toco));
                } else {
                    numeroUc07Bica790Toco = 0;
                }
            }
        });


        btnUc07Bica790TruckMais = (Button) findViewById(R.id.btnUc07Bica790TruckMais);
        btnUc07Bica790TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Truck = (TextView) findViewById(R.id.txtUc07Bica790Truck);

            @Override
            public void onClick(View v) {
                numeroUc07Bica790Truck += 1;
                txtUc07Bica790Truck.setText(String.valueOf(numeroUc07Bica790Truck));
            }
        });
        btnUc07Bica790TruckMenos = (Button) findViewById(R.id.btnUc07Bica790TruckMenos);
        btnUc07Bica790TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Truck = (TextView) findViewById(R.id.txtUc07Bica790Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc07Bica790Truck > 0) {
                    numeroUc07Bica790Truck -= 1;
                    txtUc07Bica790Truck.setText(String.valueOf(numeroUc07Bica790Truck));
                } else {
                    numeroUc07Bica790Truck = 0;
                }
            }
        });


        btnUc07Bica790CarretaMais = (Button) findViewById(R.id.btnUc07Bica790CarretaMais);
        btnUc07Bica790CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Carreta = (TextView) findViewById(R.id.txtUc07Bica790Carreta);

            @Override
            public void onClick(View v) {
                numeroUc07Bica790Carreta += 1;
                txtUc07Bica790Carreta.setText(String.valueOf(numeroUc07Bica790Carreta));
            }
        });
        btnUc07Bica790CarretaMenos = (Button) findViewById(R.id.btnUc07Bica790CarretaMenos);
        btnUc07Bica790CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Carreta = (TextView) findViewById(R.id.txtUc07Bica790Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07Bica790Carreta > 0) {
                    numeroUc07Bica790Carreta -= 1;
                    txtUc07Bica790Carreta.setText(String.valueOf(numeroUc07Bica790Carreta));
                } else {
                    numeroUc07Bica790Carreta = 0;
                }
            }
        });


        btnUc07Bica790AxorMais = (Button) findViewById(R.id.btnUc07Bica790AxorMais);
        btnUc07Bica790AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Axor = (TextView) findViewById(R.id.txtUc07Bica790Axor);

            @Override
            public void onClick(View v) {
                numeroUc07Bica790Axor += 1;
                txtUc07Bica790Axor.setText(String.valueOf(numeroUc07Bica790Axor));
            }
        });
        btnUc07Bica790AxorMenos = (Button) findViewById(R.id.btnUc07Bica790AxorMenos);
        btnUc07Bica790AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Bica790Axor = (TextView) findViewById(R.id.txtUc07Bica790Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc07Bica790Axor > 0) {
                    numeroUc07Bica790Axor -= 1;
                    txtUc07Bica790Axor.setText(String.valueOf(numeroUc07Bica790Axor));
                } else {
                    numeroUc07Bica790Axor = 0;
                }
            }
        });






        btnUc07BicaUMTocoMais = (Button) findViewById(R.id.btnUc07BicaUMTocoMais);
        btnUc07BicaUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMToco = (TextView) findViewById(R.id.txtUc07BicaUMToco);

            @Override
            public void onClick(View v) {
                numeroUc07BicaUMToco += 1;
                txtUc07BicaUMToco.setText(String.valueOf(numeroUc07BicaUMToco));
            }
        });
        btnUc07BicaUMTocoMenos = (Button) findViewById(R.id.btnUc07BicaUMTocoMenos);
        btnUc07BicaUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMToco = (TextView) findViewById(R.id.txtUc07BicaUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaUMToco > 0) {
                    numeroUc07BicaUMToco -= 1;
                    txtUc07BicaUMToco.setText(String.valueOf(numeroUc07BicaUMToco));
                } else {
                    numeroUc07BicaUMToco = 0;
                }
            }
        });


        btnUc07BicaUMTruckMais = (Button) findViewById(R.id.btnUc07BicaUMTruckMais);
        btnUc07BicaUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMTruck = (TextView) findViewById(R.id.txtUc07BicaUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc07BicaUMTruck += 1;
                txtUc07BicaUMTruck.setText(String.valueOf(numeroUc07BicaUMTruck));
            }
        });
        btnUc07BicaUMTruckMenos = (Button) findViewById(R.id.btnUc07BicaUMTruckMenos);
        btnUc07BicaUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMTruck = (TextView) findViewById(R.id.txtUc07BicaUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaUMTruck > 0) {
                    numeroUc07BicaUMTruck -= 1;
                    txtUc07BicaUMTruck.setText(String.valueOf(numeroUc07BicaUMTruck));
                } else {
                    numeroUc07BicaUMTruck = 0;
                }
            }
        });


        btnUc07BicaUMCarretaMais = (Button) findViewById(R.id.btnUc07BicaUMCarretaMais);
        btnUc07BicaUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMCarreta = (TextView) findViewById(R.id.txtUc07BicaUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07BicaUMCarreta += 1;
                txtUc07BicaUMCarreta.setText(String.valueOf(numeroUc07BicaUMCarreta));
            }
        });
        btnUc07BicaUMCarretaMenos = (Button) findViewById(R.id.btnUc07BicaUMCarretaMenos);
        btnUc07BicaUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMCarreta = (TextView) findViewById(R.id.txtUc07BicaUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaUMCarreta > 0) {
                    numeroUc07BicaUMCarreta -= 1;
                    txtUc07BicaUMCarreta.setText(String.valueOf(numeroUc07BicaUMCarreta));
                } else {
                    numeroUc07BicaUMCarreta = 0;
                }
            }
        });


        btnUc07BicaUMAxorMais = (Button) findViewById(R.id.btnUc07BicaUMAxorMais);
        btnUc07BicaUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMAxor = (TextView) findViewById(R.id.txtUc07BicaUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc07BicaUMAxor += 1;
                txtUc07BicaUMAxor.setText(String.valueOf(numeroUc07BicaUMAxor));
            }
        });
        btnUc07BicaUMAxorMenos = (Button) findViewById(R.id.btnUc07BicaUMAxorMenos);
        btnUc07BicaUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07BicaUMAxor = (TextView) findViewById(R.id.txtUc07BicaUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07BicaUMAxor > 0) {
                    numeroUc07BicaUMAxor -= 1;
                    txtUc07BicaUMAxor.setText(String.valueOf(numeroUc07BicaUMAxor));
                } else {
                    numeroUc07BicaUMAxor = 0;
                }
            }
        });











        btnUc07Br1PrTocoMais = (Button) findViewById(R.id.btnUc07Br1PrTocoMais);
        btnUc07Br1PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrToco = (TextView) findViewById(R.id.txtUc07Br1PrToco);

            @Override
            public void onClick(View v) {
                numeroUc07Br1PrToco += 1;
                txtUc07Br1PrToco.setText(String.valueOf(numeroUc07Br1PrToco));
            }
        });
        btnUc07Br1PrTocoMenos = (Button) findViewById(R.id.btnUc07Br1PrTocoMenos);
        btnUc07Br1PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrToco = (TextView) findViewById(R.id.txtUc07Br1PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br1PrToco > 0) {
                    numeroUc07Br1PrToco -= 1;
                    txtUc07Br1PrToco.setText(String.valueOf(numeroUc07Br1PrToco));
                } else {
                    numeroUc07Br1PrToco = 0;
                }
            }
        });


        btnUc07Br1PrTruckMais = (Button) findViewById(R.id.btnUc07Br1PrTruckMais);
        btnUc07Br1PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrTruck = (TextView) findViewById(R.id.txtUc07Br1PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc07Br1PrTruck += 1;
                txtUc07Br1PrTruck.setText(String.valueOf(numeroUc07Br1PrTruck));
            }
        });
        btnUc07Br1PrTruckMenos = (Button) findViewById(R.id.btnUc07Br1PrTruckMenos);
        btnUc07Br1PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrTruck = (TextView) findViewById(R.id.txtUc07Br1PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br1PrTruck > 0) {
                    numeroUc07Br1PrTruck -= 1;
                    txtUc07Br1PrTruck.setText(String.valueOf(numeroUc07Br1PrTruck));
                } else {
                    numeroUc07Br1PrTruck = 0;
                }
            }
        });


        btnUc07Br1PrCarretaMais = (Button) findViewById(R.id.btnUc07Br1PrCarretaMais);
        btnUc07Br1PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrCarreta = (TextView) findViewById(R.id.txtUc07Br1PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07Br1PrCarreta += 1;
                txtUc07Br1PrCarreta.setText(String.valueOf(numeroUc07Br1PrCarreta));
            }
        });
        btnUc07Br1PrCarretaMenos = (Button) findViewById(R.id.btnUc07Br1PrCarretaMenos);
        btnUc07Br1PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrCarreta = (TextView) findViewById(R.id.txtUc07Br1PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br1PrCarreta > 0) {
                    numeroUc07Br1PrCarreta -= 1;
                    txtUc07Br1PrCarreta.setText(String.valueOf(numeroUc07Br1PrCarreta));
                } else {
                    numeroUc07Br1PrCarreta = 0;
                }
            }
        });


        btnUc07Br1PrAxorMais = (Button) findViewById(R.id.btnUc07Br1PrAxorMais);
        btnUc07Br1PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrAxor = (TextView) findViewById(R.id.txtUc07Br1PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc07Br1PrAxor += 1;
                txtUc07Br1PrAxor.setText(String.valueOf(numeroUc07Br1PrAxor));
            }
        });
        btnUc07Br1PrAxorMenos = (Button) findViewById(R.id.btnUc07Br1PrAxorMenos);
        btnUc07Br1PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br1PrAxor = (TextView) findViewById(R.id.txtUc07Br1PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br1PrAxor > 0) {
                    numeroUc07Br1PrAxor -= 1;
                    txtUc07Br1PrAxor.setText(String.valueOf(numeroUc07Br1PrAxor));
                } else {
                    numeroUc07Br1PrAxor = 0;
                }
            }
        });










        btnUc07Br119TocoMais = (Button) findViewById(R.id.btnUc07Br119TocoMais);
        btnUc07Br119TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Toco = (TextView) findViewById(R.id.txtUc07Br119Toco);

            @Override
            public void onClick(View v) {
                numeroUc07Br119Toco += 1;
                txtUc07Br119Toco.setText(String.valueOf(numeroUc07Br119Toco));
            }
        });
        btnUc07Br119TocoMenos = (Button) findViewById(R.id.btnUc07Br119TocoMenos);
        btnUc07Br119TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Toco = (TextView) findViewById(R.id.txtUc07Br119Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br119Toco > 0) {
                    numeroUc07Br119Toco -= 1;
                    txtUc07Br119Toco.setText(String.valueOf(numeroUc07Br119Toco));
                } else {
                    numeroUc07Br119Toco = 0;
                }
            }
        });


        btnUc07Br119TruckMais = (Button) findViewById(R.id.btnUc07Br119TruckMais);
        btnUc07Br119TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Truck = (TextView) findViewById(R.id.txtUc07Br119Truck);

            @Override
            public void onClick(View v) {
                numeroUc07Br119Truck += 1;
                txtUc07Br119Truck.setText(String.valueOf(numeroUc07Br119Truck));
            }
        });
        btnUc07Br119TruckMenos = (Button) findViewById(R.id.btnUc07Br119TruckMenos);
        btnUc07Br119TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Truck = (TextView) findViewById(R.id.txtUc07Br119Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br119Truck > 0) {
                    numeroUc07Br119Truck -= 1;
                    txtUc07Br119Truck.setText(String.valueOf(numeroUc07Br119Truck));
                } else {
                    numeroUc07Br119Truck = 0;
                }
            }
        });


        btnUc07Br119CarretaMais = (Button) findViewById(R.id.btnUc07Br119CarretaMais);
        btnUc07Br119CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Carreta = (TextView) findViewById(R.id.txtUc07Br119Carreta);

            @Override
            public void onClick(View v) {
                numeroUc07Br119Carreta += 1;
                txtUc07Br119Carreta.setText(String.valueOf(numeroUc07Br119Carreta));
            }
        });
        btnUc07Br119CarretaMenos = (Button) findViewById(R.id.btnUc07Br119CarretaMenos);
        btnUc07Br119CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Carreta = (TextView) findViewById(R.id.txtUc07Br119Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br119Carreta > 0) {
                    numeroUc07Br119Carreta -= 1;
                    txtUc07Br119Carreta.setText(String.valueOf(numeroUc07Br119Carreta));
                } else {
                    numeroUc07Br119Carreta = 0;
                }
            }
        });


        btnUc07Br119AxorMais = (Button) findViewById(R.id.btnUc07Br119AxorMais);
        btnUc07Br119AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Axor = (TextView) findViewById(R.id.txtUc07Br119Axor);

            @Override
            public void onClick(View v) {
                numeroUc07Br119Axor += 1;
                txtUc07Br119Axor.setText(String.valueOf(numeroUc07Br119Axor));
            }
        });
        btnUc07Br119AxorMenos = (Button) findViewById(R.id.btnUc07Br119AxorMenos);
        btnUc07Br119AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br119Axor = (TextView) findViewById(R.id.txtUc07Br119Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br119Axor > 0) {
                    numeroUc07Br119Axor -= 1;
                    txtUc07Br119Axor.setText(String.valueOf(numeroUc07Br119Axor));
                } else {
                    numeroUc07Br119Axor = 0;
                }
            }
        });












        btnUc07Br0PrTocoMais = (Button) findViewById(R.id.btnUc07Br0PrTocoMais);
        btnUc07Br0PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrToco = (TextView) findViewById(R.id.txtUc07Br0PrToco);

            @Override
            public void onClick(View v) {
                numeroUc07Br0PrToco += 1;
                txtUc07Br0PrToco.setText(String.valueOf(numeroUc07Br0PrToco));
            }
        });
        btnUc07Br0PrTocoMenos = (Button) findViewById(R.id.btnUc07Br0PrTocoMenos);
        btnUc07Br0PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrToco = (TextView) findViewById(R.id.txtUc07Br0PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0PrToco > 0) {
                    numeroUc07Br0PrToco -= 1;
                    txtUc07Br0PrToco.setText(String.valueOf(numeroUc07Br0PrToco));
                } else {
                    numeroUc07Br0PrToco = 0;
                }
            }
        });


        btnUc07Br0PrTruckMais = (Button) findViewById(R.id.btnUc07Br0PrTruckMais);
        btnUc07Br0PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrTruck = (TextView) findViewById(R.id.txtUc07Br0PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc07Br0PrTruck += 1;
                txtUc07Br0PrTruck.setText(String.valueOf(numeroUc07Br0PrTruck));
            }
        });
        btnUc07Br0PrTruckMenos = (Button) findViewById(R.id.btnUc07Br0PrTruckMenos);
        btnUc07Br0PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrTruck = (TextView) findViewById(R.id.txtUc07Br0PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0PrTruck > 0) {
                    numeroUc07Br0PrTruck -= 1;
                    txtUc07Br0PrTruck.setText(String.valueOf(numeroUc07Br0PrTruck));
                } else {
                    numeroUc07Br0PrTruck = 0;
                }
            }
        });


        btnUc07Br0PrCarretaMais = (Button) findViewById(R.id.btnUc07Br0PrCarretaMais);
        btnUc07Br0PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrCarreta = (TextView) findViewById(R.id.txtUc07Br0PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07Br0PrCarreta += 1;
                txtUc07Br0PrCarreta.setText(String.valueOf(numeroUc07Br0PrCarreta));
            }
        });
        btnUc07Br0PrCarretaMenos = (Button) findViewById(R.id.btnUc07Br0PrCarretaMenos);
        btnUc07Br0PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrCarreta = (TextView) findViewById(R.id.txtUc07Br0PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0PrCarreta > 0) {
                    numeroUc07Br0PrCarreta -= 1;
                    txtUc07Br0PrCarreta.setText(String.valueOf(numeroUc07Br0PrCarreta));
                } else {
                    numeroUc07Br0PrCarreta = 0;
                }
            }
        });


        btnUc07Br0PrAxorMais = (Button) findViewById(R.id.btnUc07Br0PrAxorMais);
        btnUc07Br0PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrAxor = (TextView) findViewById(R.id.txtUc07Br0PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc07Br0PrAxor += 1;
                txtUc07Br0PrAxor.setText(String.valueOf(numeroUc07Br0PrAxor));
            }
        });
        btnUc07Br0PrAxorMenos = (Button) findViewById(R.id.btnUc07Br0PrAxorMenos);
        btnUc07Br0PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0PrAxor = (TextView) findViewById(R.id.txtUc07Br0PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0PrAxor > 0) {
                    numeroUc07Br0PrAxor -= 1;
                    txtUc07Br0PrAxor.setText(String.valueOf(numeroUc07Br0PrAxor));
                } else {
                    numeroUc07Br0PrAxor = 0;
                }
            }
        });









        btnUc07Br0UMTocoMais = (Button) findViewById(R.id.btnUc07Br0UMTocoMais);
        btnUc07Br0UMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMToco = (TextView) findViewById(R.id.txtUc07Br0UMToco);

            @Override
            public void onClick(View v) {
                numeroUc07Br0UMToco += 1;
                txtUc07Br0UMToco.setText(String.valueOf(numeroUc07Br0UMToco));
            }
        });
        btnUc07Br0UMTocoMenos = (Button) findViewById(R.id.btnUc07Br0UMTocoMenos);
        btnUc07Br0UMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMToco = (TextView) findViewById(R.id.txtUc07Br0UMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0UMToco > 0) {
                    numeroUc07Br0UMToco -= 1;
                    txtUc07Br0UMToco.setText(String.valueOf(numeroUc07Br0UMToco));
                } else {
                    numeroUc07Br0UMToco = 0;
                }
            }
        });


        btnUc07Br0UMTruckMais = (Button) findViewById(R.id.btnUc07Br0UMTruckMais);
        btnUc07Br0UMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMTruck = (TextView) findViewById(R.id.txtUc07Br0UMTruck);

            @Override
            public void onClick(View v) {
                numeroUc07Br0UMTruck += 1;
                txtUc07Br0UMTruck.setText(String.valueOf(numeroUc07Br0UMTruck));
            }
        });
        btnUc07Br0UMTruckMenos = (Button) findViewById(R.id.btnUc07Br0UMTruckMenos);
        btnUc07Br0UMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMTruck = (TextView) findViewById(R.id.txtUc07Br0UMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0UMTruck > 0) {
                    numeroUc07Br0UMTruck -= 1;
                    txtUc07Br0UMTruck.setText(String.valueOf(numeroUc07Br0UMTruck));
                } else {
                    numeroUc07Br0UMTruck = 0;
                }
            }
        });


        btnUc07Br0UMCarretaMais = (Button) findViewById(R.id.btnUc07Br0UMCarretaMais);
        btnUc07Br0UMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMCarreta = (TextView) findViewById(R.id.txtUc07Br0UMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc07Br0UMCarreta += 1;
                txtUc07Br0UMCarreta.setText(String.valueOf(numeroUc07Br0UMCarreta));
            }
        });
        btnUc07Br0UMCarretaMenos = (Button) findViewById(R.id.btnUc07Br0UMCarretaMenos);
        btnUc07Br0UMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMCarreta = (TextView) findViewById(R.id.txtUc07Br0UMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0UMCarreta > 0) {
                    numeroUc07Br0UMCarreta -= 1;
                    txtUc07Br0UMCarreta.setText(String.valueOf(numeroUc07Br0UMCarreta));
                } else {
                    numeroUc07Br0UMCarreta = 0;
                }
            }
        });


        btnUc07Br0UMAxorMais = (Button) findViewById(R.id.btnUc07Br0UMAxorMais);
        btnUc07Br0UMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMAxor = (TextView) findViewById(R.id.txtUc07Br0UMAxor);

            @Override
            public void onClick(View v) {
                numeroUc07Br0UMAxor += 1;
                txtUc07Br0UMAxor.setText(String.valueOf(numeroUc07Br0UMAxor));
            }
        });
        btnUc07Br0UMAxorMenos = (Button) findViewById(R.id.btnUc07Br0UMAxorMenos);
        btnUc07Br0UMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc07Br0UMAxor = (TextView) findViewById(R.id.txtUc07Br0UMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc07Br0UMAxor > 0) {
                    numeroUc07Br0UMAxor -= 1;
                    txtUc07Br0UMAxor.setText(String.valueOf(numeroUc07Br0UMAxor));
                } else {
                    numeroUc07Br0UMAxor = 0;
                }
            }
        });
















        //===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUc07HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUc07HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUc07HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUc07HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUc07HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUc07HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUc07HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUc07HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUc07HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUc07HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUc07HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUc07HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUc07HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUc07HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUc07HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUc07HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUc07HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUc07HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUc07HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUc07HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc07Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnUc07Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Uc07Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Uc07Activity.this);
                    View view = LayoutInflater.from(Uc07Activity.this).inflate(R.layout.sinc_dialog, null);
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


    public void salvar(View view) {

        if(isEmpty(horimetroFinal)||horimetroFinal.getText().toString().trim().length()==0){
            horimetroFinal.setError("CAMPO OBRIGATÓRIO");
            horimetroFinal.requestFocus();
        }
        else {

            btnUc07Salvar.setVisibility(View.INVISIBLE);
            btnUc07Sincronizar.setVisibility(View.VISIBLE);
            Uc07 c07 = new Uc07(
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
                    b0Vol.getText().toString(),
                    b0NumViagens.getText().toString(),
                    b0Mot.getText().toString(),
                    b1Vol.getText().toString(),
                    b1NumViagens.getText().toString(),
                    b1Mot.getText().toString(),
                    b2Vol.getText().toString(),
                    b2NumViagens.getText().toString(),
                    b2Mot.getText().toString(),
                    b4Vol.getText().toString(),
                    b4NumViagens.getText().toString(),
                    b4Mot.getText().toString(),
                    aimVol.getText().toString(),
                    aimNumViagens.getText().toString(),
                    aimMot.getText().toString(),
                    aifVol.getText().toString(),
                    aifNumViagens.getText().toString(),
                    aifMot.getText().toString(),
                    bicaVol.getText().toString(),
                    bicaNumViagens.getText().toString(),
                    bicaMot.getText().toString(),



                    amprToco.getText().toString(),
                    amprTruck.getText().toString(),
                    amprCarreta.getText().toString(),
                    amprAxor.getText().toString(),
                    amprObs.getText().toString(),

                    amumToco.getText().toString(),
                    amumTruck.getText().toString(),
                    amumCarreta.getText().toString(),
                    amumAxor.getText().toString(),
                    amumObs.getText().toString(),

                    afToco.getText().toString(),
                    afTruck.getText().toString(),
                    afCarreta.getText().toString(),
                    afAxor.getText().toString(),
                    afObs.getText().toString(),

                    pedToco.getText().toString(),
                    pedTruck.getText().toString(),
                    pedCarreta.getText().toString(),
                    pedAxor.getText().toString(),
                    pedObs.getText().toString(),

                    bicaPrToco.getText().toString(),
                    bicaPrTruck.getText().toString(),
                    bicaPrCarreta.getText().toString(),
                    bicaPrAxor.getText().toString(),
                    bicaPrObs.getText().toString(),

                    bica790Toco.getText().toString(),
                    bica790Truck.getText().toString(),
                    bica790Carreta.getText().toString(),
                    bica790Axor.getText().toString(),
                    bica790Obs.getText().toString(),

                    bicaUmToco.getText().toString(),
                    bicaUmTruck.getText().toString(),
                    bicaUmCarreta.getText().toString(),
                    bicaUmAxor.getText().toString(),
                    bicaUmObs.getText().toString(),

                    br1PrToco.getText().toString(),
                    br1PrTruck.getText().toString(),
                    br1PrCarreta.getText().toString(),
                    br1PrAxor.getText().toString(),
                    br1PrObs.getText().toString(),

                    br119Toco.getText().toString(),
                    br119Truck.getText().toString(),
                    br119Carreta.getText().toString(),
                    br119Axor.getText().toString(),
                    br119Obs.getText().toString(),

                    br0PrToco.getText().toString(),
                    br0PrTruck.getText().toString(),
                    br0PrCarreta.getText().toString(),
                    br0PrAxor.getText().toString(),
                    br0PrObs.getText().toString(),

                    br0UmToco.getText().toString(),
                    br0UmTruck.getText().toString(),
                    br0UmCarreta.getText().toString(),
                    br0UmAxor.getText().toString(),
                    br0UmObs.getText().toString(),


                    somaToco.getText().toString(),
                    somaTruck.getText().toString(),
                    somaCarreta.getText().toString(),
                    somaAxor.getText().toString(),



                    lanternagem.getText().toString(),
                    pneus.getText().toString(),
                    h2o.getText().toString(),
                    oleo.getText().toString(),
                    direcao.getText().toString(),
                    freios.getText().toString(),
                    parteEletrica.getText().toString(),

                    observacoes.getText().toString()


            );
            c07.setNomeEquipamento(nomeEquipamento.getText().toString());
            c07.setMotorista(motorista.getText().toString());
            c07.setData(data.getText().toString());
            c07.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            c07.setHoraFinal(horaFinal.getText().toString());
            c07.setHorimetroInicial(horimetroInicial.getText().toString());
            c07.setHorimetroFinal(horimetroFinal.getText().toString());
            c07.setParadaInicial1(paradaInicial1.getText().toString());
            c07.setParadaFinal1(paradaFinal1.getText().toString());
            c07.setDescricao1(descricao1.getSelectedItem().toString());
            c07.setParadaInicial2(paradaInicial2.getText().toString());
            c07.setParadaFinal2(paradaFinal2.getText().toString());
            c07.setDescricao2(descricao2.getSelectedItem().toString());
            c07.setParadaInicial3(paradaInicial3.getText().toString());
            c07.setParadaFinal3(paradaFinal3.getText().toString());
            c07.setDescricao3(descricao3.getSelectedItem().toString());
            c07.setParadaInicial4(paradaInicial4.getText().toString());
            c07.setParadaFinal4(paradaFinal4.getText().toString());
            c07.setDescricao4(descricao4.getSelectedItem().toString());
            c07.setParadaInicial5(paradaInicial5.getText().toString());
            c07.setParadaFinal5(paradaFinal5.getText().toString());
            c07.setDescricao5(descricao5.getSelectedItem().toString());
            c07.setParadaInicial6(paradaInicial6.getText().toString());
            c07.setParadaFinal6(paradaFinal6.getText().toString());
            c07.setDescricao6(descricao6.getSelectedItem().toString());
            c07.setParadaInicial7(paradaInicial7.getText().toString());
            c07.setParadaFinal7(paradaFinal7.getText().toString());
            c07.setDescricao7(descricao7.getSelectedItem().toString());
            c07.setParadaInicial8(paradaInicial8.getText().toString());
            c07.setParadaFinal8(paradaFinal8.getText().toString());
            c07.setDescricao8(descricao8.getSelectedItem().toString());
            c07.setParadaInicial9(paradaInicial9.getText().toString());
            c07.setParadaFinal9(paradaFinal9.getText().toString());
            c07.setDescricao9(descricao9.getSelectedItem().toString());
            c07.setParadaInicial10(paradaInicial10.getText().toString());
            c07.setParadaFinal10(paradaFinal10.getText().toString());
            c07.setDescricao10(descricao10.getSelectedItem().toString());
            c07.setB0Vol(b0Vol.getText().toString());
            c07.setB0NumViagens(b0NumViagens.getText().toString());
            c07.setB0Mot(b0Mot.getText().toString());
            c07.setB1Vol(b1Vol.getText().toString());
            c07.setB1NumViagens(b1NumViagens.getText().toString());
            c07.setB1Mot(b1Mot.getText().toString());
            c07.setB2Vol(b2Vol.getText().toString());
            c07.setB2NumViagens(b2NumViagens.getText().toString());
            c07.setB2Mot(b2Mot.getText().toString());
            c07.setB4Vol(b4Vol.getText().toString());
            c07.setB4NumViagens(b4NumViagens.getText().toString());
            c07.setB4Mot(b4Mot.getText().toString());
            c07.setAimVol(aimVol.getText().toString());
            c07.setAimNumViagens(aimNumViagens.getText().toString());
            c07.setAimMot(aimMot.getText().toString());
            c07.setAifVol(aifVol.getText().toString());
            c07.setAifNumViagens(aifNumViagens.getText().toString());
            c07.setAifMot(aifMot.getText().toString());
            c07.setBicaVol(bicaVol.getText().toString());
            c07.setBicaNumViagens(bicaNumViagens.getText().toString());
            c07.setBicaMot(bicaMot.getText().toString());


            c07.setAmprToco(amprToco.getText().toString());
            c07.setAmprTruck(amprTruck.getText().toString());
            c07.setAmprCarreta(amprCarreta.getText().toString());
            c07.setAmprAxor(amprAxor.getText().toString());
            c07.setAmprObs(amprObs.getText().toString());
            c07.setAmumToco(amumToco.getText().toString());
            c07.setAmumTruck(amumTruck.getText().toString());
            c07.setAmumCarreta(amumCarreta.getText().toString());
            c07.setAmumAxor(amumAxor.getText().toString());
            c07.setAmumObs(amumObs.getText().toString());
            c07.setAfToco(afToco.getText().toString());
            c07.setAfTruck(afTruck.getText().toString());
            c07.setAfCarreta(afCarreta.getText().toString());
            c07.setAfAxor(afAxor.getText().toString());
            c07.setPedObs(pedObs.getText().toString());
            c07.setPedToco(pedToco.getText().toString());
            c07.setPedTruck(pedTruck.getText().toString());
            c07.setPedCarreta(pedCarreta.getText().toString());
            c07.setPedAxor(pedAxor.getText().toString());
            c07.setPedObs(pedObs.getText().toString());
            c07.setBicaPrToco(bicaPrToco.getText().toString());
            c07.setBicaPrTruck(bicaPrTruck.getText().toString());
            c07.setBicaPrCarreta(bicaPrCarreta.getText().toString());
            c07.setBicaPrAxor(bicaPrAxor.getText().toString());
            c07.setBicaPrObs(bicaPrObs.getText().toString());
            c07.setBica790Toco(bica790Toco.getText().toString());
            c07.setBica790Truck(bica790Truck.getText().toString());
            c07.setBica790Carreta(bica790Carreta.getText().toString());
            c07.setBica790Axor(bica790Axor.getText().toString());
            c07.setBica790Obs(bica790Obs.getText().toString());
            c07.setBicaUmToco(bicaUmToco.getText().toString());
            c07.setBicaUmTruck(bicaUmTruck.getText().toString());
            c07.setBicaUmCarreta(bicaUmCarreta.getText().toString());
            c07.setBicaUmAxor(bicaUmAxor.getText().toString());
            c07.setBicaUmObs(bicaUmObs.getText().toString());
            c07.setBr1PrToco(br1PrToco.getText().toString());
            c07.setBr1PrTruck(br1PrTruck.getText().toString());
            c07.setBr1PrCarreta(br1PrCarreta.getText().toString());
            c07.setBr1PrAxor(br1PrAxor.getText().toString());
            c07.setBr1PrObs(br1PrObs.getText().toString());
            c07.setBr119Toco(br119Toco.getText().toString());
            c07.setBr119Truck(br119Truck.getText().toString());
            c07.setBr119Carreta(br119Carreta.getText().toString());
            c07.setBr119Axor(br119Axor.getText().toString());
            c07.setBr119Obs(br119Obs.getText().toString());
            c07.setBr0PrToco(br0PrToco.getText().toString());
            c07.setBr0PrTruck(br0PrTruck.getText().toString());
            c07.setBr0PrCarreta(br0PrCarreta.getText().toString());
            c07.setBr0PrAxor(br0PrAxor.getText().toString());
            c07.setBr0PrObs(br0PrObs.getText().toString());
            c07.setBr0UmToco(br0UmToco.getText().toString());
            c07.setBr0UmTruck(br0UmTruck.getText().toString());
            c07.setBr0UmCarreta(br0UmCarreta.getText().toString());
            c07.setBr0UmAxor(br0UmAxor.getText().toString());
            c07.setBr0UmObs(br0UmObs.getText().toString());


            final TextView txtsomaToco = findViewById(R.id.txtUc07SomaToco);
            TextView t1Toco = findViewById(R.id.txtUc07AMPrToco);
            TextView t2Toco = findViewById(R.id.txtUc07AMUMToco);
            TextView t3Toco = findViewById(R.id.txtUc07AFToco);
            TextView t4Toco = findViewById(R.id.txtUc07PedToco);
            TextView t5Toco = findViewById(R.id.txtUc07BicaPrToco);
            TextView t6Toco = findViewById(R.id.txtUc07Bica790Toco);
            TextView t7Toco = findViewById(R.id.txtUc07BicaUMToco);
            TextView t8Toco = findViewById(R.id.txtUc07Br1PrToco);
            TextView t9Toco = findViewById(R.id.txtUc07Br119Toco);
            TextView t10Toco = findViewById(R.id.txtUc07Br0PrToco);
            TextView t11Toco = findViewById(R.id.txtUc07Br0UMToco);
            int tToco01 = Integer.parseInt(t1Toco.getText().toString());
            int tToco02 = Integer.parseInt(t2Toco.getText().toString());
            int tToco03 = Integer.parseInt(t3Toco.getText().toString());
            int tToco04 = Integer.parseInt(t4Toco.getText().toString());
            int tToco05 = Integer.parseInt(t5Toco.getText().toString());
            int tToco06 = Integer.parseInt(t6Toco.getText().toString());
            int tToco07 = Integer.parseInt(t7Toco.getText().toString());
            int tToco08 = Integer.parseInt(t8Toco.getText().toString());
            int tToco09 = Integer.parseInt(t9Toco.getText().toString());
            int tToco010 = Integer.parseInt(t10Toco.getText().toString());
            int tToco011 = Integer.parseInt(t11Toco.getText().toString());
            int somaToco = tToco01 + tToco02 + tToco03 + tToco04 + tToco05 + tToco06 + tToco07 + tToco08 + tToco09 + tToco010 + tToco011;
            String somaTococ = Integer.toString(somaToco);
            txtsomaToco.setText(somaTococ);





            final TextView txtsomaTruck = findViewById(R.id.txtUc07SomaTruck);
            TextView t1Truck = findViewById(R.id.txtUc07AMPrTruck);
            TextView t2Truck = findViewById(R.id.txtUc07AMUMTruck);
            TextView t3Truck = findViewById(R.id.txtUc07AFTruck);
            TextView t4Truck = findViewById(R.id.txtUc07PedTruck);
            TextView t5Truck = findViewById(R.id.txtUc07BicaPrTruck);
            TextView t6Truck = findViewById(R.id.txtUc07Bica790Truck);
            TextView t7Truck = findViewById(R.id.txtUc07BicaUMTruck);
            TextView t8Truck = findViewById(R.id.txtUc07Br1PrTruck);
            TextView t9Truck = findViewById(R.id.txtUc07Br119Truck);
            TextView t10Truck = findViewById(R.id.txtUc07Br0PrTruck);
            TextView t11Truck = findViewById(R.id.txtUc07Br0UMTruck);
            int tTruck01 = Integer.parseInt(t1Truck.getText().toString());
            int tTruck02 = Integer.parseInt(t2Truck.getText().toString());
            int tTruck03 = Integer.parseInt(t3Truck.getText().toString());
            int tTruck04 = Integer.parseInt(t4Truck.getText().toString());
            int tTruck05 = Integer.parseInt(t5Truck.getText().toString());
            int tTruck06 = Integer.parseInt(t6Truck.getText().toString());
            int tTruck07 = Integer.parseInt(t7Truck.getText().toString());
            int tTruck08 = Integer.parseInt(t8Truck.getText().toString());
            int tTruck09 = Integer.parseInt(t9Truck.getText().toString());
            int tTruck010 = Integer.parseInt(t10Truck.getText().toString());
            int tTruck011 = Integer.parseInt(t11Truck.getText().toString());
            int somaTruck = tTruck01 + tTruck02 + tTruck03 + tTruck04 + tTruck05 + tTruck06 + tTruck07 + tTruck08 + tTruck09 + tTruck010 + tTruck011;
            String somaTruckc = Integer.toString(somaTruck);
            txtsomaTruck.setText(somaTruckc);



            final TextView txtsomaCarreta = findViewById(R.id.txtUc07SomaCarreta);
            TextView t1Carreta = findViewById(R.id.txtUc07AMPrCarreta);
            TextView t2Carreta = findViewById(R.id.txtUc07AMUMCarreta);
            TextView t3Carreta = findViewById(R.id.txtUc07AFCarreta);
            TextView t4Carreta = findViewById(R.id.txtUc07PedCarreta);
            TextView t5Carreta = findViewById(R.id.txtUc07BicaPrCarreta);
            TextView t6Carreta = findViewById(R.id.txtUc07Bica790Carreta);
            TextView t7Carreta = findViewById(R.id.txtUc07BicaUMCarreta);
            TextView t8Carreta = findViewById(R.id.txtUc07Br1PrCarreta);
            TextView t9Carreta = findViewById(R.id.txtUc07Br119Carreta);
            TextView t10Carreta = findViewById(R.id.txtUc07Br0PrCarreta);
            TextView t11Carreta = findViewById(R.id.txtUc07Br0UMCarreta);
            int tCarreta01 = Integer.parseInt(t1Carreta.getText().toString());
            int tCarreta02 = Integer.parseInt(t2Carreta.getText().toString());
            int tCarreta03 = Integer.parseInt(t3Carreta.getText().toString());
            int tCarreta04 = Integer.parseInt(t4Carreta.getText().toString());
            int tCarreta05 = Integer.parseInt(t5Carreta.getText().toString());
            int tCarreta06 = Integer.parseInt(t6Carreta.getText().toString());
            int tCarreta07 = Integer.parseInt(t7Carreta.getText().toString());
            int tCarreta08 = Integer.parseInt(t8Carreta.getText().toString());
            int tCarreta09 = Integer.parseInt(t9Carreta.getText().toString());
            int tCarreta010 = Integer.parseInt(t10Carreta.getText().toString());
            int tCarreta011 = Integer.parseInt(t11Carreta.getText().toString());
            int somaCarreta = tCarreta01 + tCarreta02 + tCarreta03 + tCarreta04 + tCarreta05 + tCarreta06 + tCarreta07 + tCarreta08 + tCarreta09 + tCarreta010 + tCarreta011;
            String somaCarretac = Integer.toString(somaCarreta);
            txtsomaCarreta.setText(somaCarretac);





            final TextView txtsomaAxor = findViewById(R.id.txtUc07SomaAxor);
            TextView t1Axor = findViewById(R.id.txtUc07AMPrAxor);
            TextView t2Axor = findViewById(R.id.txtUc07AMUMAxor);
            TextView t3Axor = findViewById(R.id.txtUc07AFAxor);
            TextView t4Axor = findViewById(R.id.txtUc07PedAxor);
            TextView t5Axor = findViewById(R.id.txtUc07BicaPrAxor);
            TextView t6Axor = findViewById(R.id.txtUc07Bica790Axor);
            TextView t7Axor = findViewById(R.id.txtUc07BicaUMAxor);
            TextView t8Axor = findViewById(R.id.txtUc07Br1PrAxor);
            TextView t9Axor = findViewById(R.id.txtUc07Br119Axor);
            TextView t10Axor = findViewById(R.id.txtUc07Br0PrAxor);
            TextView t11Axor = findViewById(R.id.txtUc07Br0UMAxor);
            int tAxor01 = Integer.parseInt(t1Axor.getText().toString());
            int tAxor02 = Integer.parseInt(t2Axor.getText().toString());
            int tAxor03 = Integer.parseInt(t3Axor.getText().toString());
            int tAxor04 = Integer.parseInt(t4Axor.getText().toString());
            int tAxor05 = Integer.parseInt(t5Axor.getText().toString());
            int tAxor06 = Integer.parseInt(t6Axor.getText().toString());
            int tAxor07 = Integer.parseInt(t7Axor.getText().toString());
            int tAxor08 = Integer.parseInt(t8Axor.getText().toString());
            int tAxor09 = Integer.parseInt(t9Axor.getText().toString());
            int tAxor010 = Integer.parseInt(t10Axor.getText().toString());
            int tAxor011 = Integer.parseInt(t11Axor.getText().toString());
            int somaAxor = tAxor01 + tAxor02 + tAxor03 + tAxor04 + tAxor05 + tAxor06 + tAxor07 + tAxor08 + tAxor09 + tAxor010 + tAxor011;
            String somaAxorc = Integer.toString(somaAxor);
            txtsomaAxor.setText(somaAxorc);




            c07.setSomaToco(txtsomaToco.getText().toString());
            c07.setSomaTruck(txtsomaTruck.getText().toString());
            c07.setSomaCarreta(txtsomaCarreta.getText().toString());
            c07.setSomaAxor(txtsomaAxor.getText().toString());



            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                c07.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                c07.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                c07.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                c07.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                c07.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                c07.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                c07.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                c07.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                c07.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                c07.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                c07.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                freios.setText("Sim");
                c07.setFreios(freios.getText().toString());
            }
            if (parteEletrica.isChecked()) {
                parteEletrica.setText("Não");
                c07.setParteEletrica(parteEletrica.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                parteEletrica.setText("Sim");
                c07.setParteEletrica(parteEletrica.getText().toString());
            }

            // c07.setProdInt(prodInt.getSelectedItem().toString());
            //c07.setVol(vol.getText().toString());
            //c07.setNumViagensInt(numViagensInt.getText().toString());
            //c07.setMotProd(MotProd.getText().toString());
            //c07.setProdEstoque(prodEstoque.getSelectedItem().toString());
            //c07.setVeiculoEstoque(veiculoEstoque.getSelectedItem().toString());
            //c07.setNumViagensEstoque(numViagensEstoque.getText().toString());




            c07.setObservacoes(observacoes.getText().toString());
            long id = dao.inserir(c07);
            Toast.makeText(this, "uc07 inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // startActivity(intent);





        }
    }


    public void sincronizar(View view){

        Uc07 c07 = new Uc07(
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
                b0Vol.getText().toString(),
                b0NumViagens.getText().toString(),
                b0Mot.getText().toString(),
                b1Vol.getText().toString(),
                b1NumViagens.getText().toString(),
                b1Mot.getText().toString(),
                b2Vol.getText().toString(),
                b2NumViagens.getText().toString(),
                b2Mot.getText().toString(),
                b4Vol.getText().toString(),
                b4NumViagens.getText().toString(),
                b4Mot.getText().toString(),
                aimVol.getText().toString(),
                aimNumViagens.getText().toString(),
                aimMot.getText().toString(),
                aifVol.getText().toString(),
                aifNumViagens.getText().toString(),
                aifMot.getText().toString(),
                bicaVol.getText().toString(),
                bicaNumViagens.getText().toString(),
                bicaMot.getText().toString(),



                amprToco.getText().toString(),
                amprTruck.getText().toString(),
                amprCarreta.getText().toString(),
                amprAxor.getText().toString(),
                amprObs.getText().toString(),

                amumToco.getText().toString(),
                amumTruck.getText().toString(),
                amumCarreta.getText().toString(),
                amumAxor.getText().toString(),
                amumObs.getText().toString(),

                afToco.getText().toString(),
                afTruck.getText().toString(),
                afCarreta.getText().toString(),
                afAxor.getText().toString(),
                afObs.getText().toString(),

                pedToco.getText().toString(),
                pedTruck.getText().toString(),
                pedCarreta.getText().toString(),
                pedAxor.getText().toString(),
                pedObs.getText().toString(),

                bicaPrToco.getText().toString(),
                bicaPrTruck.getText().toString(),
                bicaPrCarreta.getText().toString(),
                bicaPrAxor.getText().toString(),
                bicaPrObs.getText().toString(),

                bica790Toco.getText().toString(),
                bica790Truck.getText().toString(),
                bica790Carreta.getText().toString(),
                bica790Axor.getText().toString(),
                bica790Obs.getText().toString(),

                bicaUmToco.getText().toString(),
                bicaUmTruck.getText().toString(),
                bicaUmCarreta.getText().toString(),
                bicaUmAxor.getText().toString(),
                bicaUmObs.getText().toString(),

                br1PrToco.getText().toString(),
                br1PrTruck.getText().toString(),
                br1PrCarreta.getText().toString(),
                br1PrAxor.getText().toString(),
                br1PrObs.getText().toString(),

                br119Toco.getText().toString(),
                br119Truck.getText().toString(),
                br119Carreta.getText().toString(),
                br119Axor.getText().toString(),
                br119Obs.getText().toString(),

                br0PrToco.getText().toString(),
                br0PrTruck.getText().toString(),
                br0PrCarreta.getText().toString(),
                br0PrAxor.getText().toString(),
                br0PrObs.getText().toString(),

                br0UmToco.getText().toString(),
                br0UmTruck.getText().toString(),
                br0UmCarreta.getText().toString(),
                br0UmAxor.getText().toString(),
                br0UmObs.getText().toString(),


                somaToco.getText().toString(),
                somaTruck.getText().toString(),
                somaCarreta.getText().toString(),
                somaAxor.getText().toString(),



                lanternagem.getText().toString(),
                pneus.getText().toString(),
                h2o.getText().toString(),
                oleo.getText().toString(),
                direcao.getText().toString(),
                freios.getText().toString(),
                parteEletrica.getText().toString(),

                observacoes.getText().toString()


        );
        long id = dao2.inserir(c07);

        Uc07Service apiService = retrofit.create(Uc07Service.class);
        Call<Uc07> call = apiService.salvarInfoUc07(c07);

        call.enqueue(new Callback<Uc07>(){
            @Override
            public void onResponse(Call<Uc07> call, Response<Uc07> response) {
                if (response.isSuccessful()){
                    Uc07 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Uc07> call, Throwable t) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Uc07Activity.this);
        View view= LayoutInflater.from(Uc07Activity.this).inflate(R.layout.alert_dialog,null);
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
