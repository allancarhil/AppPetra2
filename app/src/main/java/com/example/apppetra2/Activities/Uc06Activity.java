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

import com.example.apppetra2.Classes.Uc06;
import com.example.apppetra2.DAO.Uc06DAO;
import com.example.apppetra2.DAO.Uc06DAOSync;
import com.example.apppetra2.Interfaces.Uc06Service;
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

public class Uc06Activity extends AppCompatActivity {

    private Button btnUc06Salvar;
    private Button btnUc06Sincronizar;
    private TextView nomeEquipamento;

    int numeroUc06B0Viagens=0;
    int numeroUc06B1Viagens=0;
    int numeroUc06B2Viagens=0;
    int numeroUc06B4Viagens=0;
    int numeroUc06AIMViagens=0;
    int numeroUc06AIFViagens=0;
    int numeroUc06BicaViagens=0;

    int numeroUc06AMPrToco=0;
    int numeroUc06AMPrTruck=0;
    int numeroUc06AMPrCarreta=0;
    int numeroUc06AMPrAxor=0;

    int numeroUc06AMUMToco=0;
    int numeroUc06AMUMTruck=0;
    int numeroUc06AMUMCarreta=0;
    int numeroUc06AMUMAxor=0;

    int numeroUc06AFToco=0;
    int numeroUc06AFTruck=0;
    int numeroUc06AFCarreta=0;
    int numeroUc06AFAxor=0;

    int numeroUc06PedToco=0;
    int numeroUc06PedTruck=0;
    int numeroUc06PedCarreta=0;
    int numeroUc06PedAxor=0;

    int numeroUc06BicaPrToco=0;
    int numeroUc06BicaPrTruck=0;
    int numeroUc06BicaPrCarreta=0;
    int numeroUc06BicaPrAxor=0;

    int numeroUc06Bica790Toco=0;
    int numeroUc06Bica790Truck=0;
    int numeroUc06Bica790Carreta=0;
    int numeroUc06Bica790Axor=0;

    int numeroUc06BicaUMToco=0;
    int numeroUc06BicaUMTruck=0;
    int numeroUc06BicaUMCarreta=0;
    int numeroUc06BicaUMAxor=0;

    int numeroUc06Br1PrToco=0;
    int numeroUc06Br1PrTruck=0;
    int numeroUc06Br1PrCarreta=0;
    int numeroUc06Br1PrAxor=0;

    int numeroUc06Br119Toco=0;
    int numeroUc06Br119Truck=0;
    int numeroUc06Br119Carreta=0;
    int numeroUc06Br119Axor=0;

    int numeroUc06Br0PrToco=0;
    int numeroUc06Br0PrTruck=0;
    int numeroUc06Br0PrCarreta=0;
    int numeroUc06Br0PrAxor=0;

    int numeroUc06Br0UMToco=0;
    int numeroUc06Br0UMTruck=0;
    int numeroUc06Br0UMCarreta=0;
    int numeroUc06Br0UMAxor=0;

    int numeroUc06SomaToco=0;
    int numeroUc06SomaTruck=0;
    int numeroUc06SomaCarreta=0;
    int numeroUc06SomaAxor=0;







    public Button btnUc06B0ViagensMais;
    public Button btnUc06B0ViagensMenos;
    public Button btnUc06B1ViagensMais;
    public Button btnUc06B1ViagensMenos;
    public Button btnUc06B2ViagensMais;
    public Button btnUc06B2ViagensMenos;
    public Button btnUc06B4ViagensMais;
    public Button btnUc06B4ViagensMenos;
    public Button btnUc06AIMViagensMais;
    public Button btnUc06AIMViagensMenos;
    public Button btnUc06AIFViagensMais;
    public Button btnUc06AIFViagensMenos;
    public Button btnUc06BicaViagensMais;
    public Button btnUc06BicaViagensMenos;


    public Button btnUc06AMPrTocoMais;
    public Button btnUc06AMPrTocoMenos;
    public Button btnUc06AMPrTruckMais;
    public Button btnUc06AMPrTruckMenos;
    public Button btnUc06AMPrCarretaMais;
    public Button btnUc06AMPrCarretaMenos;
    public Button btnUc06AMPrAxorMais;
    public Button btnUc06AMPrAxorMenos;

    public Button btnUc06AMUMTocoMais;
    public Button btnUc06AMUMTocoMenos;
    public Button btnUc06AMUMTruckMais;
    public Button btnUc06AMUMTruckMenos;
    public Button btnUc06AMUMCarretaMais;
    public Button btnUc06AMUMCarretaMenos;
    public Button btnUc06AMUMAxorMais;
    public Button btnUc06AMUMAxorMenos;

    public Button btnUc06AFTocoMais;
    public Button btnUc06AFTocoMenos;
    public Button btnUc06AFTruckMais;
    public Button btnUc06AFTruckMenos;
    public Button btnUc06AFCarretaMais;
    public Button btnUc06AFCarretaMenos;
    public Button btnUc06AFAxorMais;
    public Button btnUc06AFAxorMenos;

    public Button btnUc06PedTocoMais;
    public Button btnUc06PedTocoMenos;
    public Button btnUc06PedTruckMais;
    public Button btnUc06PedTruckMenos;
    public Button btnUc06PedCarretaMais;
    public Button btnUc06PedCarretaMenos;
    public Button btnUc06PedAxorMais;
    public Button btnUc06PedAxorMenos;

    public Button btnUc06BicaPrTocoMais;
    public Button btnUc06BicaPrTocoMenos;
    public Button btnUc06BicaPrTruckMais;
    public Button btnUc06BicaPrTruckMenos;
    public Button btnUc06BicaPrCarretaMais;
    public Button btnUc06BicaPrCarretaMenos;
    public Button btnUc06BicaPrAxorMais;
    public Button btnUc06BicaPrAxorMenos;

    public Button btnUc06Bica790TocoMais;
    public Button btnUc06Bica790TocoMenos;
    public Button btnUc06Bica790TruckMais;
    public Button btnUc06Bica790TruckMenos;
    public Button btnUc06Bica790CarretaMais;
    public Button btnUc06Bica790CarretaMenos;
    public Button btnUc06Bica790AxorMais;
    public Button btnUc06Bica790AxorMenos;

    public Button btnUc06BicaUMTocoMais;
    public Button btnUc06BicaUMTocoMenos;
    public Button btnUc06BicaUMTruckMais;
    public Button btnUc06BicaUMTruckMenos;
    public Button btnUc06BicaUMCarretaMais;
    public Button btnUc06BicaUMCarretaMenos;
    public Button btnUc06BicaUMAxorMais;
    public Button btnUc06BicaUMAxorMenos;

    public Button btnUc06Br1PrTocoMais;
    public Button btnUc06Br1PrTocoMenos;
    public Button btnUc06Br1PrTruckMais;
    public Button btnUc06Br1PrTruckMenos;
    public Button btnUc06Br1PrCarretaMais;
    public Button btnUc06Br1PrCarretaMenos;
    public Button btnUc06Br1PrAxorMais;
    public Button btnUc06Br1PrAxorMenos;

    public Button btnUc06Br119TocoMais;
    public Button btnUc06Br119TocoMenos;
    public Button btnUc06Br119TruckMais;
    public Button btnUc06Br119TruckMenos;
    public Button btnUc06Br119CarretaMais;
    public Button btnUc06Br119CarretaMenos;
    public Button btnUc06Br119AxorMais;
    public Button btnUc06Br119AxorMenos;

    public Button btnUc06Br0PrTocoMais;
    public Button btnUc06Br0PrTocoMenos;
    public Button btnUc06Br0PrTruckMais;
    public Button btnUc06Br0PrTruckMenos;
    public Button btnUc06Br0PrCarretaMais;
    public Button btnUc06Br0PrCarretaMenos;
    public Button btnUc06Br0PrAxorMais;
    public Button btnUc06Br0PrAxorMenos;

    public Button btnUc06Br0UMTocoMais;
    public Button btnUc06Br0UMTocoMenos;
    public Button btnUc06Br0UMTruckMais;
    public Button btnUc06Br0UMTruckMenos;
    public Button btnUc06Br0UMCarretaMais;
    public Button btnUc06Br0UMCarretaMenos;
    public Button btnUc06Br0UMAxorMais;
    public Button btnUc06Br0UMAxorMenos;




    public Button btnUc06Cancelar;



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

    private Uc06DAO dao;
    private Uc06DAOSync dao2;
    private Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc06);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUc06Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUc06Data);
        horaInicial=findViewById(R.id.txtUc06HI);
        horaFinal=findViewById(R.id.txtUc06HF);
        horimetroInicial=findViewById(R.id.txtUc06HoriI);
        horimetroFinal=findViewById(R.id.txtUc06HoriF);
        paradaInicial1=findViewById(R.id.txtPEUc06HI1);
        paradaFinal1=findViewById(R.id.txtPEUc06HF1);
        descricao1=findViewById(R.id.spPEUc06Desc1);
        paradaInicial2=findViewById(R.id.txtPEUc06HI2);
        paradaFinal2=findViewById(R.id.txtPEUc06HF2);
        descricao2=findViewById(R.id.spPEUc06Desc2);
        paradaInicial3=findViewById(R.id.txtPEUc06HI3);
        paradaFinal3=findViewById(R.id.txtPEUc06HF3);
        descricao3=findViewById(R.id.spPEUc06Desc3);
        paradaInicial4=findViewById(R.id.txtPEUc06HI4);
        paradaFinal4=findViewById(R.id.txtPEUc06HF4);
        descricao4=findViewById(R.id.spPEUc06Desc4);
        paradaInicial5=findViewById(R.id.txtPEUc06HI5);
        paradaFinal5=findViewById(R.id.txtPEUc06HF5);
        descricao5=findViewById(R.id.spPEUc06Desc5);
        paradaInicial6=findViewById(R.id.txtPEUc06HI6);
        paradaFinal6=findViewById(R.id.txtPEUc06HF6);
        descricao6=findViewById(R.id.spPEUc06Desc6);
        paradaInicial7=findViewById(R.id.txtPEUc06HI7);
        paradaFinal7=findViewById(R.id.txtPEUc06HF7);
        descricao7=findViewById(R.id.spPEUc06Desc7);
        paradaInicial8=findViewById(R.id.txtPEUc06HI8);
        paradaFinal8=findViewById(R.id.txtPEUc06HF8);
        descricao8=findViewById(R.id.spPEUc06Desc8);
        paradaInicial9=findViewById(R.id.txtPEUc06HI9);
        paradaFinal9=findViewById(R.id.txtPEUc06HF9);
        descricao9=findViewById(R.id.spPEUc06Desc9);
        paradaInicial10=findViewById(R.id.txtPEUc06HI10);
        paradaFinal10=findViewById(R.id.txtPEUc06HF10);
        descricao10=findViewById(R.id.spPEUc06Desc10);

        b0Vol=findViewById(R.id.txtUc06B0IntVol);
        b0NumViagens=findViewById(R.id.txtUc06B0IntNumViagens);
        b0Mot=findViewById(R.id.txtUc06B0IntMot);
        b1Vol=findViewById(R.id.txtUc06B1IntVol);
        b1NumViagens=findViewById(R.id.txtUc06B1IntNumViagens);
        b1Mot=findViewById(R.id.txtUc06B1IntMot);
        b2Vol=findViewById(R.id.txtUc06B2IntVol);
        b2NumViagens=findViewById(R.id.txtUc06B2IntNumViagens);
        b2Mot=findViewById(R.id.txtUc06B2IntMot);
        b4Vol=findViewById(R.id.txtUc06B4IntVol);
        b4NumViagens=findViewById(R.id.txtUc06B4IntNumViagens);
        b4Mot=findViewById(R.id.txtUc06B4IntMot);
        aimVol=findViewById(R.id.txtUc06AIMIntVol);
        aimNumViagens=findViewById(R.id.txtUc06AIMIntNumViagens);
        aimMot=findViewById(R.id.txtUc06AIMIntMot);
        aifVol=findViewById(R.id.txtUc06AIFIntVol);
        aifNumViagens=findViewById(R.id.txtUc06AIFIntNumViagens);
        aifMot=findViewById(R.id.txtUc06AIFIntMot);
        bicaVol=findViewById(R.id.txtUc06BicaIntVol);
        bicaNumViagens=findViewById(R.id.txtUc06BicaIntNumViagens);
        bicaMot=findViewById(R.id.txtUc06BicaIntMot);



        amprToco=findViewById(R.id.txtUc06AMPrToco);
        amprTruck=findViewById(R.id.txtUc06AMPrTruck);
        amprCarreta=findViewById(R.id.txtUc06AMPrCarreta);
        amprAxor=findViewById(R.id.txtUc06AMPrAxor);
        amprObs=findViewById(R.id.txtUc06AMPrObs);

        amumToco=findViewById(R.id.txtUc06AMUMToco);
        amumTruck=findViewById(R.id.txtUc06AMUMTruck);
        amumCarreta=findViewById(R.id.txtUc06AMUMCarreta);
        amumAxor=findViewById(R.id.txtUc06AMUMAxor);
        amumObs=findViewById(R.id.txtUc06AMUMObs);

        afToco=findViewById(R.id.txtUc06AFToco);
        afTruck=findViewById(R.id.txtUc06AFTruck);
        afCarreta=findViewById(R.id.txtUc06AFCarreta);
        afAxor=findViewById(R.id.txtUc06AFAxor);
        afObs=findViewById(R.id.txtUc06AFObs);

        pedToco=findViewById(R.id.txtUc06PedToco);
        pedTruck=findViewById(R.id.txtUc06PedTruck);
        pedCarreta=findViewById(R.id.txtUc06PedCarreta);
        pedAxor=findViewById(R.id.txtUc06PedAxor);
        pedObs=findViewById(R.id.txtUc06PedObs);

        bicaPrToco=findViewById(R.id.txtUc06BicaPrToco);
        bicaPrTruck=findViewById(R.id.txtUc06BicaPrTruck);
        bicaPrCarreta=findViewById(R.id.txtUc06BicaPrCarreta);
        bicaPrAxor=findViewById(R.id.txtUc06BicaPrAxor);
        bicaPrObs=findViewById(R.id.txtUc06BicaPrObs);

        bica790Toco=findViewById(R.id.txtUc06Bica790Toco);
        bica790Truck=findViewById(R.id.txtUc06Bica790Truck);
        bica790Carreta=findViewById(R.id.txtUc06Bica790Carreta);
        bica790Axor=findViewById(R.id.txtUc06Bica790Axor);
        bica790Obs=findViewById(R.id.txtUc06Bica790Obs);

        bicaUmToco=findViewById(R.id.txtUc06BicaUMToco);
        bicaUmTruck=findViewById(R.id.txtUc06BicaUMTruck);
        bicaUmCarreta=findViewById(R.id.txtUc06BicaUMCarreta);
        bicaUmAxor=findViewById(R.id.txtUc06BicaUMAxor);
        bicaUmObs=findViewById(R.id.txtUc06BicaUMObs);

        br1PrToco=findViewById(R.id.txtUc06Br1PrToco);
        br1PrTruck=findViewById(R.id.txtUc06Br1PrTruck);
        br1PrCarreta=findViewById(R.id.txtUc06Br1PrCarreta);
        br1PrAxor=findViewById(R.id.txtUc06Br1PrAxor);
        br1PrObs=findViewById(R.id.txtUc06Br1PrObs);

        br119Toco=findViewById(R.id.txtUc06Br119Toco);
        br119Truck=findViewById(R.id.txtUc06Br119Truck);
        br119Carreta=findViewById(R.id.txtUc06Br119Carreta);
        br119Axor=findViewById(R.id.txtUc06Br119Axor);
        br119Obs=findViewById(R.id.txtUc06Br119Obs);

        br0PrToco=findViewById(R.id.txtUc06Br0PrToco);
        br0PrTruck=findViewById(R.id.txtUc06Br0PrTruck);
        br0PrCarreta=findViewById(R.id.txtUc06Br0PrCarreta);
        br0PrAxor=findViewById(R.id.txtUc06Br0PrAxor);
        br0PrObs=findViewById(R.id.txtUc06Br0PrObs);

        br0UmToco=findViewById(R.id.txtUc06Br0UMToco);
        br0UmTruck=findViewById(R.id.txtUc06Br0UMTruck);
        br0UmCarreta=findViewById(R.id.txtUc06Br0UMCarreta);
        br0UmAxor=findViewById(R.id.txtUc06Br0UMAxor);
        br0UmObs=findViewById(R.id.txtUc06Br0UMObs);


        somaToco=findViewById(R.id.txtUc06SomaToco);
        somaTruck=findViewById(R.id.txtUc06SomaTruck);
        somaCarreta=findViewById(R.id.txtUc06SomaCarreta);
        somaAxor=findViewById(R.id.txtUc06SomaAxor);



        lanternagem=findViewById(R.id.chkUc06Lant);
        pneus=findViewById(R.id.chkUc06Pn);
        h2o=findViewById(R.id.chkUc06H2O);
        oleo=findViewById(R.id.chkUc06Ol);
        direcao=findViewById(R.id.chkUc06Dir);
        freios=findViewById(R.id.chkUc06Fr);
        parteEletrica=findViewById(R.id.chkUc06PtElet);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUc06);

        observacoes=findViewById(R.id.txtUc06Obs);

        dao=new Uc06DAO(this);
        dao2= new Uc06DAOSync(this);
        btnUc06Salvar=findViewById(R.id.btnUc06Save);
        btnUc06Sincronizar=findViewById(R.id.btnUc06Sincronizar);
        btnUc06Sincronizar.setVisibility(View.INVISIBLE);


        Spinner spPEUc06Desc1= findViewById(R.id.spPEUc06Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc1.setAdapter(adapterDesc);

        Spinner spPEUc06Desc2= findViewById(R.id.spPEUc06Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc2.setAdapter(adapterDesc2);


        Spinner spPEUc06Desc3= findViewById(R.id.spPEUc06Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc3.setAdapter(adapterDesc3);


        Spinner spPEUc06Desc4= findViewById(R.id.spPEUc06Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc4.setAdapter(adapterDesc4);




        Spinner spPEUc06Desc5= findViewById(R.id.spPEUc06Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc5.setAdapter(adapterDesc5);




        Spinner spPEUc06Desc6= findViewById(R.id.spPEUc06Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc6.setAdapter(adapterDesc6);



        Spinner spPEUc06Desc7= findViewById(R.id.spPEUc06Desc7);
        ArrayAdapter<CharSequence> adapterDesc7=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc7.setAdapter(adapterDesc7);



        Spinner spPEUc06Desc8= findViewById(R.id.spPEUc06Desc8);
        ArrayAdapter<CharSequence> adapterDesc8=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc8.setAdapter(adapterDesc8);




        Spinner spPEUc06Desc9= findViewById(R.id.spPEUc06Desc9);
        ArrayAdapter<CharSequence> adapterDesc9=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc9.setAdapter(adapterDesc9);



        Spinner spPEUc06Desc10= findViewById(R.id.spPEUc06Desc10);
        ArrayAdapter<CharSequence> adapterDesc10=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc06Desc10.setAdapter(adapterDesc10);






        TextView horaI=(TextView)findViewById(R.id.txtUc06HI);
        horaI = (TextView) findViewById(R.id.txtUc06HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUc06Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        btnUc06Cancelar= findViewById(R.id.btnUc06Cancel);
        btnUc06Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Uc06Activity.this);
                View view= LayoutInflater.from(Uc06Activity.this).inflate(R.layout.alert_dialog,null);
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







        btnUc06B0ViagensMais = (Button) findViewById(R.id.btnUc06B0IntViagensMais);
        btnUc06B0ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B0IntNumViagens = (TextView) findViewById(R.id.txtUc06B0IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06B0Viagens += 1;
                txtUc06B0IntNumViagens.setText(String.valueOf(numeroUc06B0Viagens));
            }
        });
        btnUc06B0ViagensMenos = (Button) findViewById(R.id.btnUc06B0IntViagensMenos);
        btnUc06B0ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B0IntNumViagens = (TextView) findViewById(R.id.txtUc06B0IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06B0Viagens > 0) {
                    numeroUc06B0Viagens -= 1;
                    txtUc06B0IntNumViagens.setText(String.valueOf(numeroUc06B0Viagens));
                } else {
                    numeroUc06B0Viagens = 0;
                }
            }
        });





        btnUc06B1ViagensMais = (Button) findViewById(R.id.btnUc06B1IntViagensMais);
        btnUc06B1ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B1IntNumViagens = (TextView) findViewById(R.id.txtUc06B1IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06B1Viagens += 1;
                txtUc06B1IntNumViagens.setText(String.valueOf(numeroUc06B1Viagens));
            }
        });
        btnUc06B1ViagensMenos = (Button) findViewById(R.id.btnUc06B1IntViagensMenos);
        btnUc06B1ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B1IntNumViagens = (TextView) findViewById(R.id.txtUc06B1IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06B1Viagens > 0) {
                    numeroUc06B1Viagens -= 1;
                    txtUc06B1IntNumViagens.setText(String.valueOf(numeroUc06B1Viagens));
                } else {
                    numeroUc06B1Viagens = 0;
                }
            }
        });



        btnUc06B2ViagensMais = (Button) findViewById(R.id.btnUc06B2IntViagensMais);
        btnUc06B2ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B2IntNumViagens = (TextView) findViewById(R.id.txtUc06B2IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06B2Viagens += 1;
                txtUc06B2IntNumViagens.setText(String.valueOf(numeroUc06B2Viagens));
            }
        });
        btnUc06B2ViagensMenos = (Button) findViewById(R.id.btnUc06B2IntViagensMenos);
        btnUc06B2ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B2IntNumViagens = (TextView) findViewById(R.id.txtUc06B2IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06B2Viagens > 0) {
                    numeroUc06B2Viagens -= 1;
                    txtUc06B2IntNumViagens.setText(String.valueOf(numeroUc06B2Viagens));
                } else {
                    numeroUc06B2Viagens = 0;
                }
            }
        });



        btnUc06B4ViagensMais = (Button) findViewById(R.id.btnUc06B4IntViagensMais);
        btnUc06B4ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B4IntNumViagens = (TextView) findViewById(R.id.txtUc06B4IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06B4Viagens += 1;
                txtUc06B4IntNumViagens.setText(String.valueOf(numeroUc06B4Viagens));
            }
        });
        btnUc06B4ViagensMenos = (Button) findViewById(R.id.btnUc06B4IntViagensMenos);
        btnUc06B4ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06B4IntNumViagens = (TextView) findViewById(R.id.txtUc06B4IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06B4Viagens > 0) {
                    numeroUc06B4Viagens -= 1;
                    txtUc06B4IntNumViagens.setText(String.valueOf(numeroUc06B4Viagens));
                } else {
                    numeroUc06B4Viagens = 0;
                }
            }
        });



        btnUc06AIMViagensMais = (Button) findViewById(R.id.btnUc06AIMIntViagensMais);
        btnUc06AIMViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AIMIntNumViagens = (TextView) findViewById(R.id.txtUc06AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06AIMViagens += 1;
                txtUc06AIMIntNumViagens.setText(String.valueOf(numeroUc06AIMViagens));
            }
        });
        btnUc06AIMViagensMenos = (Button) findViewById(R.id.btnUc06AIMIntViagensMenos);
        btnUc06AIMViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AIMIntNumViagens = (TextView) findViewById(R.id.txtUc06AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06AIMViagens > 0) {
                    numeroUc06AIMViagens -= 1;
                    txtUc06AIMIntNumViagens.setText(String.valueOf(numeroUc06AIMViagens));
                } else {
                    numeroUc06AIMViagens = 0;
                }
            }
        });





        btnUc06AIFViagensMais = (Button) findViewById(R.id.btnUc06AIFIntViagensMais);
        btnUc06AIFViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AIFIntNumViagens = (TextView) findViewById(R.id.txtUc06AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06AIFViagens += 1;
                txtUc06AIFIntNumViagens.setText(String.valueOf(numeroUc06AIFViagens));
            }
        });
        btnUc06AIFViagensMenos = (Button) findViewById(R.id.btnUc06AIFIntViagensMenos);
        btnUc06AIFViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AIFIntNumViagens = (TextView) findViewById(R.id.txtUc06AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06AIFViagens > 0) {
                    numeroUc06AIFViagens -= 1;
                    txtUc06AIFIntNumViagens.setText(String.valueOf(numeroUc06AIFViagens));
                } else {
                    numeroUc06AIFViagens = 0;
                }
            }
        });




        btnUc06BicaViagensMais = (Button) findViewById(R.id.btnUc06BicaIntViagensMais);
        btnUc06BicaViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaIntNumViagens = (TextView) findViewById(R.id.txtUc06BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc06BicaViagens += 1;
                txtUc06BicaIntNumViagens.setText(String.valueOf(numeroUc06BicaViagens));
            }
        });
        btnUc06BicaViagensMenos = (Button) findViewById(R.id.btnUc06BicaIntViagensMenos);
        btnUc06BicaViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaIntNumViagens = (TextView) findViewById(R.id.txtUc06BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaViagens > 0) {
                    numeroUc06BicaViagens -= 1;
                    txtUc06BicaIntNumViagens.setText(String.valueOf(numeroUc06BicaViagens));
                } else {
                    numeroUc06BicaViagens = 0;
                }
            }
        });









        btnUc06AMPrTocoMais = (Button) findViewById(R.id.btnUc06AMPrTocoMais);
        btnUc06AMPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrToco = (TextView) findViewById(R.id.txtUc06AMPrToco);

            @Override
            public void onClick(View v) {
                numeroUc06AMPrToco += 1;
                txtUc06AMPrToco.setText(String.valueOf(numeroUc06AMPrToco));
            }
        });
        btnUc06AMPrTocoMenos = (Button) findViewById(R.id.btnUc06AMPrTocoMenos);
        btnUc06AMPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrToco = (TextView) findViewById(R.id.txtUc06AMPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMPrToco > 0) {
                    numeroUc06AMPrToco -= 1;
                    txtUc06AMPrToco.setText(String.valueOf(numeroUc06AMPrToco));
                } else {
                    numeroUc06AMPrToco = 0;
                }
            }
        });


        btnUc06AMPrTruckMais = (Button) findViewById(R.id.btnUc06AMPrTruckMais);
        btnUc06AMPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrTruck = (TextView) findViewById(R.id.txtUc06AMPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc06AMPrTruck += 1;
                txtUc06AMPrTruck.setText(String.valueOf(numeroUc06AMPrTruck));
            }
        });
        btnUc06AMPrTruckMenos = (Button) findViewById(R.id.btnUc06AMPrTruckMenos);
        btnUc06AMPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrTruck = (TextView) findViewById(R.id.txtUc06AMPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMPrTruck > 0) {
                    numeroUc06AMPrTruck -= 1;
                    txtUc06AMPrTruck.setText(String.valueOf(numeroUc06AMPrTruck));
                } else {
                    numeroUc06AMPrTruck = 0;
                }
            }
        });


        btnUc06AMPrCarretaMais = (Button) findViewById(R.id.btnUc06AMPrCarretaMais);
        btnUc06AMPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrCarreta = (TextView) findViewById(R.id.txtUc06AMPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06AMPrCarreta += 1;
                txtUc06AMPrCarreta.setText(String.valueOf(numeroUc06AMPrCarreta));
            }
        });
        btnUc06AMPrCarretaMenos = (Button) findViewById(R.id.btnUc06AMPrCarretaMenos);
        btnUc06AMPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrCarreta = (TextView) findViewById(R.id.txtUc06AMPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMPrCarreta > 0) {
                    numeroUc06AMPrCarreta -= 1;
                    txtUc06AMPrCarreta.setText(String.valueOf(numeroUc06AMPrCarreta));
                } else {
                    numeroUc06AMPrCarreta = 0;
                }
            }
        });


        btnUc06AMPrAxorMais = (Button) findViewById(R.id.btnUc06AMPrAxorMais);
        btnUc06AMPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrAxor = (TextView) findViewById(R.id.txtUc06AMPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc06AMPrAxor += 1;
                txtUc06AMPrAxor.setText(String.valueOf(numeroUc06AMPrAxor));
            }
        });
        btnUc06AMPrAxorMenos = (Button) findViewById(R.id.btnUc06AMPrAxorMenos);
        btnUc06AMPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMPrAxor = (TextView) findViewById(R.id.txtUc06AMPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMPrAxor > 0) {
                    numeroUc06AMPrAxor -= 1;
                    txtUc06AMPrAxor.setText(String.valueOf(numeroUc06AMPrAxor));
                } else {
                    numeroUc06AMPrAxor = 0;
                }
            }
        });











        btnUc06AMUMTocoMais = (Button) findViewById(R.id.btnUc06AMUMTocoMais);
        btnUc06AMUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMToco = (TextView) findViewById(R.id.txtUc06AMUMToco);

            @Override
            public void onClick(View v) {
                numeroUc06AMUMToco += 1;
                txtUc06AMUMToco.setText(String.valueOf(numeroUc06AMUMToco));
            }
        });
        btnUc06AMUMTocoMenos = (Button) findViewById(R.id.btnUc06AMUMTocoMenos);
        btnUc06AMUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMToco = (TextView) findViewById(R.id.txtUc06AMUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMUMToco > 0) {
                    numeroUc06AMUMToco -= 1;
                    txtUc06AMUMToco.setText(String.valueOf(numeroUc06AMUMToco));
                } else {
                    numeroUc06AMUMToco = 0;
                }
            }
        });


        btnUc06AMUMTruckMais = (Button) findViewById(R.id.btnUc06AMUMTruckMais);
        btnUc06AMUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMTruck = (TextView) findViewById(R.id.txtUc06AMUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc06AMUMTruck += 1;
                txtUc06AMUMTruck.setText(String.valueOf(numeroUc06AMUMTruck));
            }
        });
        btnUc06AMUMTruckMenos = (Button) findViewById(R.id.btnUc06AMUMTruckMenos);
        btnUc06AMUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMTruck = (TextView) findViewById(R.id.txtUc06AMUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMUMTruck > 0) {
                    numeroUc06AMUMTruck -= 1;
                    txtUc06AMUMTruck.setText(String.valueOf(numeroUc06AMUMTruck));
                } else {
                    numeroUc06AMUMTruck = 0;
                }
            }
        });


        btnUc06AMUMCarretaMais = (Button) findViewById(R.id.btnUc06AMUMCarretaMais);
        btnUc06AMUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMCarreta = (TextView) findViewById(R.id.txtUc06AMUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06AMUMCarreta += 1;
                txtUc06AMUMCarreta.setText(String.valueOf(numeroUc06AMUMCarreta));
            }
        });
        btnUc06AMUMCarretaMenos = (Button) findViewById(R.id.btnUc06AMUMCarretaMenos);
        btnUc06AMUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMCarreta = (TextView) findViewById(R.id.txtUc06AMUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMUMCarreta > 0) {
                    numeroUc06AMUMCarreta -= 1;
                    txtUc06AMUMCarreta.setText(String.valueOf(numeroUc06AMUMCarreta));
                } else {
                    numeroUc06AMUMCarreta = 0;
                }
            }
        });


        btnUc06AMUMAxorMais = (Button) findViewById(R.id.btnUc06AMUMAxorMais);
        btnUc06AMUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMAxor = (TextView) findViewById(R.id.txtUc06AMUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc06AMUMAxor += 1;
                txtUc06AMUMAxor.setText(String.valueOf(numeroUc06AMUMAxor));
            }
        });
        btnUc06AMUMAxorMenos = (Button) findViewById(R.id.btnUc06AMUMAxorMenos);
        btnUc06AMUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AMUMAxor = (TextView) findViewById(R.id.txtUc06AMUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06AMUMAxor > 0) {
                    numeroUc06AMUMAxor -= 1;
                    txtUc06AMUMAxor.setText(String.valueOf(numeroUc06AMUMAxor));
                } else {
                    numeroUc06AMUMAxor = 0;
                }
            }
        });








        btnUc06AFTocoMais = (Button) findViewById(R.id.btnUc06AFTocoMais);
        btnUc06AFTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFToco = (TextView) findViewById(R.id.txtUc06AFToco);

            @Override
            public void onClick(View v) {
                numeroUc06AFToco += 1;
                txtUc06AFToco.setText(String.valueOf(numeroUc06AFToco));
            }
        });
        btnUc06AFTocoMenos = (Button) findViewById(R.id.btnUc06AFTocoMenos);
        btnUc06AFTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFToco = (TextView) findViewById(R.id.txtUc06AFToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06AFToco > 0) {
                    numeroUc06AFToco -= 1;
                    txtUc06AFToco.setText(String.valueOf(numeroUc06AFToco));
                } else {
                    numeroUc06AFToco = 0;
                }
            }
        });


        btnUc06AFTruckMais = (Button) findViewById(R.id.btnUc06AFTruckMais);
        btnUc06AFTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFTruck = (TextView) findViewById(R.id.txtUc06AFTruck);

            @Override
            public void onClick(View v) {
                numeroUc06AFTruck += 1;
                txtUc06AFTruck.setText(String.valueOf(numeroUc06AFTruck));
            }
        });
        btnUc06AFTruckMenos = (Button) findViewById(R.id.btnUc06AFTruckMenos);
        btnUc06AFTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFTruck = (TextView) findViewById(R.id.txtUc06AFTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06AFTruck > 0) {
                    numeroUc06AFTruck -= 1;
                    txtUc06AFTruck.setText(String.valueOf(numeroUc06AFTruck));
                } else {
                    numeroUc06AFTruck = 0;
                }
            }
        });


        btnUc06AFCarretaMais = (Button) findViewById(R.id.btnUc06AFCarretaMais);
        btnUc06AFCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFCarreta = (TextView) findViewById(R.id.txtUc06AFCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06AFCarreta += 1;
                txtUc06AFCarreta.setText(String.valueOf(numeroUc06AFCarreta));
            }
        });
        btnUc06AFCarretaMenos = (Button) findViewById(R.id.btnUc06AFCarretaMenos);
        btnUc06AFCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFCarreta = (TextView) findViewById(R.id.txtUc06AFCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06AFCarreta > 0) {
                    numeroUc06AFCarreta -= 1;
                    txtUc06AFCarreta.setText(String.valueOf(numeroUc06AFCarreta));
                } else {
                    numeroUc06AFCarreta = 0;
                }
            }
        });


        btnUc06AFAxorMais = (Button) findViewById(R.id.btnUc06AFAxorMais);
        btnUc06AFAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFAxor = (TextView) findViewById(R.id.txtUc06AFAxor);

            @Override
            public void onClick(View v) {
                numeroUc06AFAxor += 1;
                txtUc06AFAxor.setText(String.valueOf(numeroUc06AFAxor));
            }
        });
        btnUc06AFAxorMenos = (Button) findViewById(R.id.btnUc06AFAxorMenos);
        btnUc06AFAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06AFAxor = (TextView) findViewById(R.id.txtUc06AFAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06AFAxor > 0) {
                    numeroUc06AFAxor -= 1;
                    txtUc06AFAxor.setText(String.valueOf(numeroUc06AFAxor));
                } else {
                    numeroUc06AFAxor = 0;
                }
            }
        });









        btnUc06PedTocoMais = (Button) findViewById(R.id.btnUc06PedTocoMais);
        btnUc06PedTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedToco = (TextView) findViewById(R.id.txtUc06PedToco);

            @Override
            public void onClick(View v) {
                numeroUc06PedToco += 1;
                txtUc06PedToco.setText(String.valueOf(numeroUc06PedToco));
            }
        });
        btnUc06PedTocoMenos = (Button) findViewById(R.id.btnUc06PedTocoMenos);
        btnUc06PedTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedToco = (TextView) findViewById(R.id.txtUc06PedToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06PedToco > 0) {
                    numeroUc06PedToco -= 1;
                    txtUc06PedToco.setText(String.valueOf(numeroUc06PedToco));
                } else {
                    numeroUc06PedToco = 0;
                }
            }
        });


        btnUc06PedTruckMais = (Button) findViewById(R.id.btnUc06PedTruckMais);
        btnUc06PedTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedTruck = (TextView) findViewById(R.id.txtUc06PedTruck);

            @Override
            public void onClick(View v) {
                numeroUc06PedTruck += 1;
                txtUc06PedTruck.setText(String.valueOf(numeroUc06PedTruck));
            }
        });
        btnUc06PedTruckMenos = (Button) findViewById(R.id.btnUc06PedTruckMenos);
        btnUc06PedTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedTruck = (TextView) findViewById(R.id.txtUc06PedTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06PedTruck > 0) {
                    numeroUc06PedTruck -= 1;
                    txtUc06PedTruck.setText(String.valueOf(numeroUc06PedTruck));
                } else {
                    numeroUc06PedTruck = 0;
                }
            }
        });


        btnUc06PedCarretaMais = (Button) findViewById(R.id.btnUc06PedCarretaMais);
        btnUc06PedCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedCarreta = (TextView) findViewById(R.id.txtUc06PedCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06PedCarreta += 1;
                txtUc06PedCarreta.setText(String.valueOf(numeroUc06PedCarreta));
            }
        });
        btnUc06PedCarretaMenos = (Button) findViewById(R.id.btnUc06PedCarretaMenos);
        btnUc06PedCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedCarreta = (TextView) findViewById(R.id.txtUc06PedCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06PedCarreta > 0) {
                    numeroUc06PedCarreta -= 1;
                    txtUc06PedCarreta.setText(String.valueOf(numeroUc06PedCarreta));
                } else {
                    numeroUc06PedCarreta = 0;
                }
            }
        });


        btnUc06PedAxorMais = (Button) findViewById(R.id.btnUc06PedAxorMais);
        btnUc06PedAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedAxor = (TextView) findViewById(R.id.txtUc06PedAxor);

            @Override
            public void onClick(View v) {
                numeroUc06PedAxor += 1;
                txtUc06PedAxor.setText(String.valueOf(numeroUc06PedAxor));
            }
        });
        btnUc06PedAxorMenos = (Button) findViewById(R.id.btnUc06PedAxorMenos);
        btnUc06PedAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06PedAxor = (TextView) findViewById(R.id.txtUc06PedAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06PedAxor > 0) {
                    numeroUc06PedAxor -= 1;
                    txtUc06PedAxor.setText(String.valueOf(numeroUc06PedAxor));
                } else {
                    numeroUc06PedAxor = 0;
                }
            }
        });




        btnUc06BicaPrTocoMais = (Button) findViewById(R.id.btnUc06BicaPrTocoMais);
        btnUc06BicaPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrToco = (TextView) findViewById(R.id.txtUc06BicaPrToco);

            @Override
            public void onClick(View v) {
                numeroUc06BicaPrToco += 1;
                txtUc06BicaPrToco.setText(String.valueOf(numeroUc06BicaPrToco));
            }
        });
        btnUc06BicaPrTocoMenos = (Button) findViewById(R.id.btnUc06BicaPrTocoMenos);
        btnUc06BicaPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrToco = (TextView) findViewById(R.id.txtUc06BicaPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaPrToco > 0) {
                    numeroUc06BicaPrToco -= 1;
                    txtUc06BicaPrToco.setText(String.valueOf(numeroUc06BicaPrToco));
                } else {
                    numeroUc06BicaPrToco = 0;
                }
            }
        });


        btnUc06BicaPrTruckMais = (Button) findViewById(R.id.btnUc06BicaPrTruckMais);
        btnUc06BicaPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrTruck = (TextView) findViewById(R.id.txtUc06BicaPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc06BicaPrTruck += 1;
                txtUc06BicaPrTruck.setText(String.valueOf(numeroUc06BicaPrTruck));
            }
        });
        btnUc06BicaPrTruckMenos = (Button) findViewById(R.id.btnUc06BicaPrTruckMenos);
        btnUc06BicaPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrTruck = (TextView) findViewById(R.id.txtUc06BicaPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaPrTruck > 0) {
                    numeroUc06BicaPrTruck -= 1;
                    txtUc06BicaPrTruck.setText(String.valueOf(numeroUc06BicaPrTruck));
                } else {
                    numeroUc06BicaPrTruck = 0;
                }
            }
        });


        btnUc06BicaPrCarretaMais = (Button) findViewById(R.id.btnUc06BicaPrCarretaMais);
        btnUc06BicaPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrCarreta = (TextView) findViewById(R.id.txtUc06BicaPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06BicaPrCarreta += 1;
                txtUc06BicaPrCarreta.setText(String.valueOf(numeroUc06BicaPrCarreta));
            }
        });
        btnUc06BicaPrCarretaMenos = (Button) findViewById(R.id.btnUc06BicaPrCarretaMenos);
        btnUc06BicaPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrCarreta = (TextView) findViewById(R.id.txtUc06BicaPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaPrCarreta > 0) {
                    numeroUc06BicaPrCarreta -= 1;
                    txtUc06BicaPrCarreta.setText(String.valueOf(numeroUc06BicaPrCarreta));
                } else {
                    numeroUc06BicaPrCarreta = 0;
                }
            }
        });


        btnUc06BicaPrAxorMais = (Button) findViewById(R.id.btnUc06BicaPrAxorMais);
        btnUc06BicaPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrAxor = (TextView) findViewById(R.id.txtUc06BicaPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc06BicaPrAxor += 1;
                txtUc06BicaPrAxor.setText(String.valueOf(numeroUc06BicaPrAxor));
            }
        });
        btnUc06BicaPrAxorMenos = (Button) findViewById(R.id.btnUc06BicaPrAxorMenos);
        btnUc06BicaPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaPrAxor = (TextView) findViewById(R.id.txtUc06BicaPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaPrAxor > 0) {
                    numeroUc06BicaPrAxor -= 1;
                    txtUc06BicaPrAxor.setText(String.valueOf(numeroUc06BicaPrAxor));
                } else {
                    numeroUc06BicaPrAxor = 0;
                }
            }
        });










        btnUc06Bica790TocoMais = (Button) findViewById(R.id.btnUc06Bica790TocoMais);
        btnUc06Bica790TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Toco = (TextView) findViewById(R.id.txtUc06Bica790Toco);

            @Override
            public void onClick(View v) {
                numeroUc06Bica790Toco += 1;
                txtUc06Bica790Toco.setText(String.valueOf(numeroUc06Bica790Toco));
            }
        });
        btnUc06Bica790TocoMenos = (Button) findViewById(R.id.btnUc06Bica790TocoMenos);
        btnUc06Bica790TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Toco = (TextView) findViewById(R.id.txtUc06Bica790Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc06Bica790Toco > 0) {
                    numeroUc06Bica790Toco -= 1;
                    txtUc06Bica790Toco.setText(String.valueOf(numeroUc06Bica790Toco));
                } else {
                    numeroUc06Bica790Toco = 0;
                }
            }
        });


        btnUc06Bica790TruckMais = (Button) findViewById(R.id.btnUc06Bica790TruckMais);
        btnUc06Bica790TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Truck = (TextView) findViewById(R.id.txtUc06Bica790Truck);

            @Override
            public void onClick(View v) {
                numeroUc06Bica790Truck += 1;
                txtUc06Bica790Truck.setText(String.valueOf(numeroUc06Bica790Truck));
            }
        });
        btnUc06Bica790TruckMenos = (Button) findViewById(R.id.btnUc06Bica790TruckMenos);
        btnUc06Bica790TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Truck = (TextView) findViewById(R.id.txtUc06Bica790Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc06Bica790Truck > 0) {
                    numeroUc06Bica790Truck -= 1;
                    txtUc06Bica790Truck.setText(String.valueOf(numeroUc06Bica790Truck));
                } else {
                    numeroUc06Bica790Truck = 0;
                }
            }
        });


        btnUc06Bica790CarretaMais = (Button) findViewById(R.id.btnUc06Bica790CarretaMais);
        btnUc06Bica790CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Carreta = (TextView) findViewById(R.id.txtUc06Bica790Carreta);

            @Override
            public void onClick(View v) {
                numeroUc06Bica790Carreta += 1;
                txtUc06Bica790Carreta.setText(String.valueOf(numeroUc06Bica790Carreta));
            }
        });
        btnUc06Bica790CarretaMenos = (Button) findViewById(R.id.btnUc06Bica790CarretaMenos);
        btnUc06Bica790CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Carreta = (TextView) findViewById(R.id.txtUc06Bica790Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06Bica790Carreta > 0) {
                    numeroUc06Bica790Carreta -= 1;
                    txtUc06Bica790Carreta.setText(String.valueOf(numeroUc06Bica790Carreta));
                } else {
                    numeroUc06Bica790Carreta = 0;
                }
            }
        });


        btnUc06Bica790AxorMais = (Button) findViewById(R.id.btnUc06Bica790AxorMais);
        btnUc06Bica790AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Axor = (TextView) findViewById(R.id.txtUc06Bica790Axor);

            @Override
            public void onClick(View v) {
                numeroUc06Bica790Axor += 1;
                txtUc06Bica790Axor.setText(String.valueOf(numeroUc06Bica790Axor));
            }
        });
        btnUc06Bica790AxorMenos = (Button) findViewById(R.id.btnUc06Bica790AxorMenos);
        btnUc06Bica790AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Bica790Axor = (TextView) findViewById(R.id.txtUc06Bica790Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc06Bica790Axor > 0) {
                    numeroUc06Bica790Axor -= 1;
                    txtUc06Bica790Axor.setText(String.valueOf(numeroUc06Bica790Axor));
                } else {
                    numeroUc06Bica790Axor = 0;
                }
            }
        });






        btnUc06BicaUMTocoMais = (Button) findViewById(R.id.btnUc06BicaUMTocoMais);
        btnUc06BicaUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMToco = (TextView) findViewById(R.id.txtUc06BicaUMToco);

            @Override
            public void onClick(View v) {
                numeroUc06BicaUMToco += 1;
                txtUc06BicaUMToco.setText(String.valueOf(numeroUc06BicaUMToco));
            }
        });
        btnUc06BicaUMTocoMenos = (Button) findViewById(R.id.btnUc06BicaUMTocoMenos);
        btnUc06BicaUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMToco = (TextView) findViewById(R.id.txtUc06BicaUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaUMToco > 0) {
                    numeroUc06BicaUMToco -= 1;
                    txtUc06BicaUMToco.setText(String.valueOf(numeroUc06BicaUMToco));
                } else {
                    numeroUc06BicaUMToco = 0;
                }
            }
        });


        btnUc06BicaUMTruckMais = (Button) findViewById(R.id.btnUc06BicaUMTruckMais);
        btnUc06BicaUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMTruck = (TextView) findViewById(R.id.txtUc06BicaUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc06BicaUMTruck += 1;
                txtUc06BicaUMTruck.setText(String.valueOf(numeroUc06BicaUMTruck));
            }
        });
        btnUc06BicaUMTruckMenos = (Button) findViewById(R.id.btnUc06BicaUMTruckMenos);
        btnUc06BicaUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMTruck = (TextView) findViewById(R.id.txtUc06BicaUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaUMTruck > 0) {
                    numeroUc06BicaUMTruck -= 1;
                    txtUc06BicaUMTruck.setText(String.valueOf(numeroUc06BicaUMTruck));
                } else {
                    numeroUc06BicaUMTruck = 0;
                }
            }
        });


        btnUc06BicaUMCarretaMais = (Button) findViewById(R.id.btnUc06BicaUMCarretaMais);
        btnUc06BicaUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMCarreta = (TextView) findViewById(R.id.txtUc06BicaUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06BicaUMCarreta += 1;
                txtUc06BicaUMCarreta.setText(String.valueOf(numeroUc06BicaUMCarreta));
            }
        });
        btnUc06BicaUMCarretaMenos = (Button) findViewById(R.id.btnUc06BicaUMCarretaMenos);
        btnUc06BicaUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMCarreta = (TextView) findViewById(R.id.txtUc06BicaUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaUMCarreta > 0) {
                    numeroUc06BicaUMCarreta -= 1;
                    txtUc06BicaUMCarreta.setText(String.valueOf(numeroUc06BicaUMCarreta));
                } else {
                    numeroUc06BicaUMCarreta = 0;
                }
            }
        });


        btnUc06BicaUMAxorMais = (Button) findViewById(R.id.btnUc06BicaUMAxorMais);
        btnUc06BicaUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMAxor = (TextView) findViewById(R.id.txtUc06BicaUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc06BicaUMAxor += 1;
                txtUc06BicaUMAxor.setText(String.valueOf(numeroUc06BicaUMAxor));
            }
        });
        btnUc06BicaUMAxorMenos = (Button) findViewById(R.id.btnUc06BicaUMAxorMenos);
        btnUc06BicaUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06BicaUMAxor = (TextView) findViewById(R.id.txtUc06BicaUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06BicaUMAxor > 0) {
                    numeroUc06BicaUMAxor -= 1;
                    txtUc06BicaUMAxor.setText(String.valueOf(numeroUc06BicaUMAxor));
                } else {
                    numeroUc06BicaUMAxor = 0;
                }
            }
        });











        btnUc06Br1PrTocoMais = (Button) findViewById(R.id.btnUc06Br1PrTocoMais);
        btnUc06Br1PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrToco = (TextView) findViewById(R.id.txtUc06Br1PrToco);

            @Override
            public void onClick(View v) {
                numeroUc06Br1PrToco += 1;
                txtUc06Br1PrToco.setText(String.valueOf(numeroUc06Br1PrToco));
            }
        });
        btnUc06Br1PrTocoMenos = (Button) findViewById(R.id.btnUc06Br1PrTocoMenos);
        btnUc06Br1PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrToco = (TextView) findViewById(R.id.txtUc06Br1PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br1PrToco > 0) {
                    numeroUc06Br1PrToco -= 1;
                    txtUc06Br1PrToco.setText(String.valueOf(numeroUc06Br1PrToco));
                } else {
                    numeroUc06Br1PrToco = 0;
                }
            }
        });


        btnUc06Br1PrTruckMais = (Button) findViewById(R.id.btnUc06Br1PrTruckMais);
        btnUc06Br1PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrTruck = (TextView) findViewById(R.id.txtUc06Br1PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc06Br1PrTruck += 1;
                txtUc06Br1PrTruck.setText(String.valueOf(numeroUc06Br1PrTruck));
            }
        });
        btnUc06Br1PrTruckMenos = (Button) findViewById(R.id.btnUc06Br1PrTruckMenos);
        btnUc06Br1PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrTruck = (TextView) findViewById(R.id.txtUc06Br1PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br1PrTruck > 0) {
                    numeroUc06Br1PrTruck -= 1;
                    txtUc06Br1PrTruck.setText(String.valueOf(numeroUc06Br1PrTruck));
                } else {
                    numeroUc06Br1PrTruck = 0;
                }
            }
        });


        btnUc06Br1PrCarretaMais = (Button) findViewById(R.id.btnUc06Br1PrCarretaMais);
        btnUc06Br1PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrCarreta = (TextView) findViewById(R.id.txtUc06Br1PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06Br1PrCarreta += 1;
                txtUc06Br1PrCarreta.setText(String.valueOf(numeroUc06Br1PrCarreta));
            }
        });
        btnUc06Br1PrCarretaMenos = (Button) findViewById(R.id.btnUc06Br1PrCarretaMenos);
        btnUc06Br1PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrCarreta = (TextView) findViewById(R.id.txtUc06Br1PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br1PrCarreta > 0) {
                    numeroUc06Br1PrCarreta -= 1;
                    txtUc06Br1PrCarreta.setText(String.valueOf(numeroUc06Br1PrCarreta));
                } else {
                    numeroUc06Br1PrCarreta = 0;
                }
            }
        });


        btnUc06Br1PrAxorMais = (Button) findViewById(R.id.btnUc06Br1PrAxorMais);
        btnUc06Br1PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrAxor = (TextView) findViewById(R.id.txtUc06Br1PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc06Br1PrAxor += 1;
                txtUc06Br1PrAxor.setText(String.valueOf(numeroUc06Br1PrAxor));
            }
        });
        btnUc06Br1PrAxorMenos = (Button) findViewById(R.id.btnUc06Br1PrAxorMenos);
        btnUc06Br1PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br1PrAxor = (TextView) findViewById(R.id.txtUc06Br1PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br1PrAxor > 0) {
                    numeroUc06Br1PrAxor -= 1;
                    txtUc06Br1PrAxor.setText(String.valueOf(numeroUc06Br1PrAxor));
                } else {
                    numeroUc06Br1PrAxor = 0;
                }
            }
        });










        btnUc06Br119TocoMais = (Button) findViewById(R.id.btnUc06Br119TocoMais);
        btnUc06Br119TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Toco = (TextView) findViewById(R.id.txtUc06Br119Toco);

            @Override
            public void onClick(View v) {
                numeroUc06Br119Toco += 1;
                txtUc06Br119Toco.setText(String.valueOf(numeroUc06Br119Toco));
            }
        });
        btnUc06Br119TocoMenos = (Button) findViewById(R.id.btnUc06Br119TocoMenos);
        btnUc06Br119TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Toco = (TextView) findViewById(R.id.txtUc06Br119Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br119Toco > 0) {
                    numeroUc06Br119Toco -= 1;
                    txtUc06Br119Toco.setText(String.valueOf(numeroUc06Br119Toco));
                } else {
                    numeroUc06Br119Toco = 0;
                }
            }
        });


        btnUc06Br119TruckMais = (Button) findViewById(R.id.btnUc06Br119TruckMais);
        btnUc06Br119TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Truck = (TextView) findViewById(R.id.txtUc06Br119Truck);

            @Override
            public void onClick(View v) {
                numeroUc06Br119Truck += 1;
                txtUc06Br119Truck.setText(String.valueOf(numeroUc06Br119Truck));
            }
        });
        btnUc06Br119TruckMenos = (Button) findViewById(R.id.btnUc06Br119TruckMenos);
        btnUc06Br119TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Truck = (TextView) findViewById(R.id.txtUc06Br119Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br119Truck > 0) {
                    numeroUc06Br119Truck -= 1;
                    txtUc06Br119Truck.setText(String.valueOf(numeroUc06Br119Truck));
                } else {
                    numeroUc06Br119Truck = 0;
                }
            }
        });


        btnUc06Br119CarretaMais = (Button) findViewById(R.id.btnUc06Br119CarretaMais);
        btnUc06Br119CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Carreta = (TextView) findViewById(R.id.txtUc06Br119Carreta);

            @Override
            public void onClick(View v) {
                numeroUc06Br119Carreta += 1;
                txtUc06Br119Carreta.setText(String.valueOf(numeroUc06Br119Carreta));
            }
        });
        btnUc06Br119CarretaMenos = (Button) findViewById(R.id.btnUc06Br119CarretaMenos);
        btnUc06Br119CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Carreta = (TextView) findViewById(R.id.txtUc06Br119Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br119Carreta > 0) {
                    numeroUc06Br119Carreta -= 1;
                    txtUc06Br119Carreta.setText(String.valueOf(numeroUc06Br119Carreta));
                } else {
                    numeroUc06Br119Carreta = 0;
                }
            }
        });


        btnUc06Br119AxorMais = (Button) findViewById(R.id.btnUc06Br119AxorMais);
        btnUc06Br119AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Axor = (TextView) findViewById(R.id.txtUc06Br119Axor);

            @Override
            public void onClick(View v) {
                numeroUc06Br119Axor += 1;
                txtUc06Br119Axor.setText(String.valueOf(numeroUc06Br119Axor));
            }
        });
        btnUc06Br119AxorMenos = (Button) findViewById(R.id.btnUc06Br119AxorMenos);
        btnUc06Br119AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br119Axor = (TextView) findViewById(R.id.txtUc06Br119Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br119Axor > 0) {
                    numeroUc06Br119Axor -= 1;
                    txtUc06Br119Axor.setText(String.valueOf(numeroUc06Br119Axor));
                } else {
                    numeroUc06Br119Axor = 0;
                }
            }
        });












        btnUc06Br0PrTocoMais = (Button) findViewById(R.id.btnUc06Br0PrTocoMais);
        btnUc06Br0PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrToco = (TextView) findViewById(R.id.txtUc06Br0PrToco);

            @Override
            public void onClick(View v) {
                numeroUc06Br0PrToco += 1;
                txtUc06Br0PrToco.setText(String.valueOf(numeroUc06Br0PrToco));
            }
        });
        btnUc06Br0PrTocoMenos = (Button) findViewById(R.id.btnUc06Br0PrTocoMenos);
        btnUc06Br0PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrToco = (TextView) findViewById(R.id.txtUc06Br0PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0PrToco > 0) {
                    numeroUc06Br0PrToco -= 1;
                    txtUc06Br0PrToco.setText(String.valueOf(numeroUc06Br0PrToco));
                } else {
                    numeroUc06Br0PrToco = 0;
                }
            }
        });


        btnUc06Br0PrTruckMais = (Button) findViewById(R.id.btnUc06Br0PrTruckMais);
        btnUc06Br0PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrTruck = (TextView) findViewById(R.id.txtUc06Br0PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc06Br0PrTruck += 1;
                txtUc06Br0PrTruck.setText(String.valueOf(numeroUc06Br0PrTruck));
            }
        });
        btnUc06Br0PrTruckMenos = (Button) findViewById(R.id.btnUc06Br0PrTruckMenos);
        btnUc06Br0PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrTruck = (TextView) findViewById(R.id.txtUc06Br0PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0PrTruck > 0) {
                    numeroUc06Br0PrTruck -= 1;
                    txtUc06Br0PrTruck.setText(String.valueOf(numeroUc06Br0PrTruck));
                } else {
                    numeroUc06Br0PrTruck = 0;
                }
            }
        });


        btnUc06Br0PrCarretaMais = (Button) findViewById(R.id.btnUc06Br0PrCarretaMais);
        btnUc06Br0PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrCarreta = (TextView) findViewById(R.id.txtUc06Br0PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06Br0PrCarreta += 1;
                txtUc06Br0PrCarreta.setText(String.valueOf(numeroUc06Br0PrCarreta));
            }
        });
        btnUc06Br0PrCarretaMenos = (Button) findViewById(R.id.btnUc06Br0PrCarretaMenos);
        btnUc06Br0PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrCarreta = (TextView) findViewById(R.id.txtUc06Br0PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0PrCarreta > 0) {
                    numeroUc06Br0PrCarreta -= 1;
                    txtUc06Br0PrCarreta.setText(String.valueOf(numeroUc06Br0PrCarreta));
                } else {
                    numeroUc06Br0PrCarreta = 0;
                }
            }
        });


        btnUc06Br0PrAxorMais = (Button) findViewById(R.id.btnUc06Br0PrAxorMais);
        btnUc06Br0PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrAxor = (TextView) findViewById(R.id.txtUc06Br0PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc06Br0PrAxor += 1;
                txtUc06Br0PrAxor.setText(String.valueOf(numeroUc06Br0PrAxor));
            }
        });
        btnUc06Br0PrAxorMenos = (Button) findViewById(R.id.btnUc06Br0PrAxorMenos);
        btnUc06Br0PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0PrAxor = (TextView) findViewById(R.id.txtUc06Br0PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0PrAxor > 0) {
                    numeroUc06Br0PrAxor -= 1;
                    txtUc06Br0PrAxor.setText(String.valueOf(numeroUc06Br0PrAxor));
                } else {
                    numeroUc06Br0PrAxor = 0;
                }
            }
        });









        btnUc06Br0UMTocoMais = (Button) findViewById(R.id.btnUc06Br0UMTocoMais);
        btnUc06Br0UMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMToco = (TextView) findViewById(R.id.txtUc06Br0UMToco);

            @Override
            public void onClick(View v) {
                numeroUc06Br0UMToco += 1;
                txtUc06Br0UMToco.setText(String.valueOf(numeroUc06Br0UMToco));
            }
        });
        btnUc06Br0UMTocoMenos = (Button) findViewById(R.id.btnUc06Br0UMTocoMenos);
        btnUc06Br0UMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMToco = (TextView) findViewById(R.id.txtUc06Br0UMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0UMToco > 0) {
                    numeroUc06Br0UMToco -= 1;
                    txtUc06Br0UMToco.setText(String.valueOf(numeroUc06Br0UMToco));
                } else {
                    numeroUc06Br0UMToco = 0;
                }
            }
        });


        btnUc06Br0UMTruckMais = (Button) findViewById(R.id.btnUc06Br0UMTruckMais);
        btnUc06Br0UMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMTruck = (TextView) findViewById(R.id.txtUc06Br0UMTruck);

            @Override
            public void onClick(View v) {
                numeroUc06Br0UMTruck += 1;
                txtUc06Br0UMTruck.setText(String.valueOf(numeroUc06Br0UMTruck));
            }
        });
        btnUc06Br0UMTruckMenos = (Button) findViewById(R.id.btnUc06Br0UMTruckMenos);
        btnUc06Br0UMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMTruck = (TextView) findViewById(R.id.txtUc06Br0UMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0UMTruck > 0) {
                    numeroUc06Br0UMTruck -= 1;
                    txtUc06Br0UMTruck.setText(String.valueOf(numeroUc06Br0UMTruck));
                } else {
                    numeroUc06Br0UMTruck = 0;
                }
            }
        });


        btnUc06Br0UMCarretaMais = (Button) findViewById(R.id.btnUc06Br0UMCarretaMais);
        btnUc06Br0UMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMCarreta = (TextView) findViewById(R.id.txtUc06Br0UMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc06Br0UMCarreta += 1;
                txtUc06Br0UMCarreta.setText(String.valueOf(numeroUc06Br0UMCarreta));
            }
        });
        btnUc06Br0UMCarretaMenos = (Button) findViewById(R.id.btnUc06Br0UMCarretaMenos);
        btnUc06Br0UMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMCarreta = (TextView) findViewById(R.id.txtUc06Br0UMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0UMCarreta > 0) {
                    numeroUc06Br0UMCarreta -= 1;
                    txtUc06Br0UMCarreta.setText(String.valueOf(numeroUc06Br0UMCarreta));
                } else {
                    numeroUc06Br0UMCarreta = 0;
                }
            }
        });


        btnUc06Br0UMAxorMais = (Button) findViewById(R.id.btnUc06Br0UMAxorMais);
        btnUc06Br0UMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMAxor = (TextView) findViewById(R.id.txtUc06Br0UMAxor);

            @Override
            public void onClick(View v) {
                numeroUc06Br0UMAxor += 1;
                txtUc06Br0UMAxor.setText(String.valueOf(numeroUc06Br0UMAxor));
            }
        });
        btnUc06Br0UMAxorMenos = (Button) findViewById(R.id.btnUc06Br0UMAxorMenos);
        btnUc06Br0UMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc06Br0UMAxor = (TextView) findViewById(R.id.txtUc06Br0UMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc06Br0UMAxor > 0) {
                    numeroUc06Br0UMAxor -= 1;
                    txtUc06Br0UMAxor.setText(String.valueOf(numeroUc06Br0UMAxor));
                } else {
                    numeroUc06Br0UMAxor = 0;
                }
            }
        });
















        //===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUc06HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUc06HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUc06HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUc06HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUc06HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUc06HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUc06HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUc06HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUc06HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUc06HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUc06HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUc06HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUc06HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUc06HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUc06HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUc06HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUc06HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUc06HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUc06HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUc06HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnUc06Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Uc06Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Uc06Activity.this);
                    View view = LayoutInflater.from(Uc06Activity.this).inflate(R.layout.sinc_dialog, null);
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

            btnUc06Salvar.setVisibility(View.INVISIBLE);
            btnUc06Sincronizar.setVisibility(View.VISIBLE);
            Uc06 c06 = new Uc06(
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
            c06.setNomeEquipamento(nomeEquipamento.getText().toString());
            c06.setMotorista(motorista.getText().toString());
            c06.setData(data.getText().toString());
            c06.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            c06.setHoraFinal(horaFinal.getText().toString());
            c06.setHorimetroInicial(horimetroInicial.getText().toString());
            c06.setHorimetroFinal(horimetroFinal.getText().toString());
            c06.setParadaInicial1(paradaInicial1.getText().toString());
            c06.setParadaFinal1(paradaFinal1.getText().toString());
            c06.setDescricao1(descricao1.getSelectedItem().toString());
            c06.setParadaInicial2(paradaInicial2.getText().toString());
            c06.setParadaFinal2(paradaFinal2.getText().toString());
            c06.setDescricao2(descricao2.getSelectedItem().toString());
            c06.setParadaInicial3(paradaInicial3.getText().toString());
            c06.setParadaFinal3(paradaFinal3.getText().toString());
            c06.setDescricao3(descricao3.getSelectedItem().toString());
            c06.setParadaInicial4(paradaInicial4.getText().toString());
            c06.setParadaFinal4(paradaFinal4.getText().toString());
            c06.setDescricao4(descricao4.getSelectedItem().toString());
            c06.setParadaInicial5(paradaInicial5.getText().toString());
            c06.setParadaFinal5(paradaFinal5.getText().toString());
            c06.setDescricao5(descricao5.getSelectedItem().toString());
            c06.setParadaInicial6(paradaInicial6.getText().toString());
            c06.setParadaFinal6(paradaFinal6.getText().toString());
            c06.setDescricao6(descricao6.getSelectedItem().toString());
            c06.setParadaInicial7(paradaInicial7.getText().toString());
            c06.setParadaFinal7(paradaFinal7.getText().toString());
            c06.setDescricao7(descricao7.getSelectedItem().toString());
            c06.setParadaInicial8(paradaInicial8.getText().toString());
            c06.setParadaFinal8(paradaFinal8.getText().toString());
            c06.setDescricao8(descricao8.getSelectedItem().toString());
            c06.setParadaInicial9(paradaInicial9.getText().toString());
            c06.setParadaFinal9(paradaFinal9.getText().toString());
            c06.setDescricao9(descricao9.getSelectedItem().toString());
            c06.setParadaInicial10(paradaInicial10.getText().toString());
            c06.setParadaFinal10(paradaFinal10.getText().toString());
            c06.setDescricao10(descricao10.getSelectedItem().toString());
            c06.setB0Vol(b0Vol.getText().toString());
            c06.setB0NumViagens(b0NumViagens.getText().toString());
            c06.setB0Mot(b0Mot.getText().toString());
            c06.setB1Vol(b1Vol.getText().toString());
            c06.setB1NumViagens(b1NumViagens.getText().toString());
            c06.setB1Mot(b1Mot.getText().toString());
            c06.setB2Vol(b2Vol.getText().toString());
            c06.setB2NumViagens(b2NumViagens.getText().toString());
            c06.setB2Mot(b2Mot.getText().toString());
            c06.setB4Vol(b4Vol.getText().toString());
            c06.setB4NumViagens(b4NumViagens.getText().toString());
            c06.setB4Mot(b4Mot.getText().toString());
            c06.setAimVol(aimVol.getText().toString());
            c06.setAimNumViagens(aimNumViagens.getText().toString());
            c06.setAimMot(aimMot.getText().toString());
            c06.setAifVol(aifVol.getText().toString());
            c06.setAifNumViagens(aifNumViagens.getText().toString());
            c06.setAifMot(aifMot.getText().toString());
            c06.setBicaVol(bicaVol.getText().toString());
            c06.setBicaNumViagens(bicaNumViagens.getText().toString());
            c06.setBicaMot(bicaMot.getText().toString());


            c06.setAmprToco(amprToco.getText().toString());
            c06.setAmprTruck(amprTruck.getText().toString());
            c06.setAmprCarreta(amprCarreta.getText().toString());
            c06.setAmprAxor(amprAxor.getText().toString());
            c06.setAmprObs(amprObs.getText().toString());
            c06.setAmumToco(amumToco.getText().toString());
            c06.setAmumTruck(amumTruck.getText().toString());
            c06.setAmumCarreta(amumCarreta.getText().toString());
            c06.setAmumAxor(amumAxor.getText().toString());
            c06.setAmumObs(amumObs.getText().toString());
            c06.setAfToco(afToco.getText().toString());
            c06.setAfTruck(afTruck.getText().toString());
            c06.setAfCarreta(afCarreta.getText().toString());
            c06.setAfAxor(afAxor.getText().toString());
            c06.setPedObs(pedObs.getText().toString());
            c06.setPedToco(pedToco.getText().toString());
            c06.setPedTruck(pedTruck.getText().toString());
            c06.setPedCarreta(pedCarreta.getText().toString());
            c06.setPedAxor(pedAxor.getText().toString());
            c06.setPedObs(pedObs.getText().toString());
            c06.setBicaPrToco(bicaPrToco.getText().toString());
            c06.setBicaPrTruck(bicaPrTruck.getText().toString());
            c06.setBicaPrCarreta(bicaPrCarreta.getText().toString());
            c06.setBicaPrAxor(bicaPrAxor.getText().toString());
            c06.setBicaPrObs(bicaPrObs.getText().toString());
            c06.setBica790Toco(bica790Toco.getText().toString());
            c06.setBica790Truck(bica790Truck.getText().toString());
            c06.setBica790Carreta(bica790Carreta.getText().toString());
            c06.setBica790Axor(bica790Axor.getText().toString());
            c06.setBica790Obs(bica790Obs.getText().toString());
            c06.setBicaUmToco(bicaUmToco.getText().toString());
            c06.setBicaUmTruck(bicaUmTruck.getText().toString());
            c06.setBicaUmCarreta(bicaUmCarreta.getText().toString());
            c06.setBicaUmAxor(bicaUmAxor.getText().toString());
            c06.setBicaUmObs(bicaUmObs.getText().toString());
            c06.setBr1PrToco(br1PrToco.getText().toString());
            c06.setBr1PrTruck(br1PrTruck.getText().toString());
            c06.setBr1PrCarreta(br1PrCarreta.getText().toString());
            c06.setBr1PrAxor(br1PrAxor.getText().toString());
            c06.setBr1PrObs(br1PrObs.getText().toString());
            c06.setBr119Toco(br119Toco.getText().toString());
            c06.setBr119Truck(br119Truck.getText().toString());
            c06.setBr119Carreta(br119Carreta.getText().toString());
            c06.setBr119Axor(br119Axor.getText().toString());
            c06.setBr119Obs(br119Obs.getText().toString());
            c06.setBr0PrToco(br0PrToco.getText().toString());
            c06.setBr0PrTruck(br0PrTruck.getText().toString());
            c06.setBr0PrCarreta(br0PrCarreta.getText().toString());
            c06.setBr0PrAxor(br0PrAxor.getText().toString());
            c06.setBr0PrObs(br0PrObs.getText().toString());
            c06.setBr0UmToco(br0UmToco.getText().toString());
            c06.setBr0UmTruck(br0UmTruck.getText().toString());
            c06.setBr0UmCarreta(br0UmCarreta.getText().toString());
            c06.setBr0UmAxor(br0UmAxor.getText().toString());
            c06.setBr0UmObs(br0UmObs.getText().toString());


            final TextView txtsomaToco = findViewById(R.id.txtUc06SomaToco);
            TextView t1Toco = findViewById(R.id.txtUc06AMPrToco);
            TextView t2Toco = findViewById(R.id.txtUc06AMUMToco);
            TextView t3Toco = findViewById(R.id.txtUc06AFToco);
            TextView t4Toco = findViewById(R.id.txtUc06PedToco);
            TextView t5Toco = findViewById(R.id.txtUc06BicaPrToco);
            TextView t6Toco = findViewById(R.id.txtUc06Bica790Toco);
            TextView t7Toco = findViewById(R.id.txtUc06BicaUMToco);
            TextView t8Toco = findViewById(R.id.txtUc06Br1PrToco);
            TextView t9Toco = findViewById(R.id.txtUc06Br119Toco);
            TextView t10Toco = findViewById(R.id.txtUc06Br0PrToco);
            TextView t11Toco = findViewById(R.id.txtUc06Br0UMToco);
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





            final TextView txtsomaTruck = findViewById(R.id.txtUc06SomaTruck);
            TextView t1Truck = findViewById(R.id.txtUc06AMPrTruck);
            TextView t2Truck = findViewById(R.id.txtUc06AMUMTruck);
            TextView t3Truck = findViewById(R.id.txtUc06AFTruck);
            TextView t4Truck = findViewById(R.id.txtUc06PedTruck);
            TextView t5Truck = findViewById(R.id.txtUc06BicaPrTruck);
            TextView t6Truck = findViewById(R.id.txtUc06Bica790Truck);
            TextView t7Truck = findViewById(R.id.txtUc06BicaUMTruck);
            TextView t8Truck = findViewById(R.id.txtUc06Br1PrTruck);
            TextView t9Truck = findViewById(R.id.txtUc06Br119Truck);
            TextView t10Truck = findViewById(R.id.txtUc06Br0PrTruck);
            TextView t11Truck = findViewById(R.id.txtUc06Br0UMTruck);
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



            final TextView txtsomaCarreta = findViewById(R.id.txtUc06SomaCarreta);
            TextView t1Carreta = findViewById(R.id.txtUc06AMPrCarreta);
            TextView t2Carreta = findViewById(R.id.txtUc06AMUMCarreta);
            TextView t3Carreta = findViewById(R.id.txtUc06AFCarreta);
            TextView t4Carreta = findViewById(R.id.txtUc06PedCarreta);
            TextView t5Carreta = findViewById(R.id.txtUc06BicaPrCarreta);
            TextView t6Carreta = findViewById(R.id.txtUc06Bica790Carreta);
            TextView t7Carreta = findViewById(R.id.txtUc06BicaUMCarreta);
            TextView t8Carreta = findViewById(R.id.txtUc06Br1PrCarreta);
            TextView t9Carreta = findViewById(R.id.txtUc06Br119Carreta);
            TextView t10Carreta = findViewById(R.id.txtUc06Br0PrCarreta);
            TextView t11Carreta = findViewById(R.id.txtUc06Br0UMCarreta);
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





            final TextView txtsomaAxor = findViewById(R.id.txtUc06SomaAxor);
            TextView t1Axor = findViewById(R.id.txtUc06AMPrAxor);
            TextView t2Axor = findViewById(R.id.txtUc06AMUMAxor);
            TextView t3Axor = findViewById(R.id.txtUc06AFAxor);
            TextView t4Axor = findViewById(R.id.txtUc06PedAxor);
            TextView t5Axor = findViewById(R.id.txtUc06BicaPrAxor);
            TextView t6Axor = findViewById(R.id.txtUc06Bica790Axor);
            TextView t7Axor = findViewById(R.id.txtUc06BicaUMAxor);
            TextView t8Axor = findViewById(R.id.txtUc06Br1PrAxor);
            TextView t9Axor = findViewById(R.id.txtUc06Br119Axor);
            TextView t10Axor = findViewById(R.id.txtUc06Br0PrAxor);
            TextView t11Axor = findViewById(R.id.txtUc06Br0UMAxor);
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




            c06.setSomaToco(txtsomaToco.getText().toString());
            c06.setSomaTruck(txtsomaTruck.getText().toString());
            c06.setSomaCarreta(txtsomaCarreta.getText().toString());
            c06.setSomaAxor(txtsomaAxor.getText().toString());



            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                c06.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                c06.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                c06.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                c06.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                c06.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                c06.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                c06.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                c06.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                c06.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                c06.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                c06.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                freios.setText("Sim");
                c06.setFreios(freios.getText().toString());
            }
            if (parteEletrica.isChecked()) {
                parteEletrica.setText("Não");
                c06.setParteEletrica(parteEletrica.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                parteEletrica.setText("Sim");
                c06.setParteEletrica(parteEletrica.getText().toString());
            }

            // c06.setProdInt(prodInt.getSelectedItem().toString());
            //c06.setVol(vol.getText().toString());
            //c06.setNumViagensInt(numViagensInt.getText().toString());
            //c06.setMotProd(MotProd.getText().toString());
            //c06.setProdEstoque(prodEstoque.getSelectedItem().toString());
            //c06.setVeiculoEstoque(veiculoEstoque.getSelectedItem().toString());
            //c06.setNumViagensEstoque(numViagensEstoque.getText().toString());




            c06.setObservacoes(observacoes.getText().toString());
            long id = dao.inserir(c06);
            Toast.makeText(this, "uc06 inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // startActivity(intent);





        }
    }


    public void sincronizar(View view){

        Uc06 c06 = new Uc06(
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
        long id = dao2.inserir(c06);

        Uc06Service apiService = retrofit.create(Uc06Service.class);
        Call<Uc06> call = apiService.salvarInfoUc06(c06);

        call.enqueue(new Callback<Uc06>(){
            @Override
            public void onResponse(Call<Uc06> call, Response<Uc06> response) {
                if (response.isSuccessful()){
                    Uc06 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Uc06> call, Throwable t) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Uc06Activity.this);
        View view= LayoutInflater.from(Uc06Activity.this).inflate(R.layout.alert_dialog,null);
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

