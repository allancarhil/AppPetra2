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

import com.example.apppetra2.Classes.Uc14;
import com.example.apppetra2.Classes.Uc14;
import com.example.apppetra2.Classes.Uc14;
import com.example.apppetra2.Classes.Uc14;
import com.example.apppetra2.DAO.Uc14DAO;
import com.example.apppetra2.DAO.Uc14DAOSync;
import com.example.apppetra2.DAO.Uc14DAO;
import com.example.apppetra2.DAO.Uc14DAO;
import com.example.apppetra2.DAO.Uc14DAO;
import com.example.apppetra2.Interfaces.Uc14Service;
import com.example.apppetra2.Interfaces.Uc14Service;
import com.example.apppetra2.Interfaces.Uc14Service;
import com.example.apppetra2.Interfaces.Uc14Service;
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

public class Uc14Activity extends AppCompatActivity {

    private Button btnUc14Salvar;
    private Button btnUc14Sincronizar;
    private TextView nomeEquipamento;

    int numeroUc14B0Viagens=0;
    int numeroUc14B1Viagens=0;
    int numeroUc14B2Viagens=0;
    int numeroUc14B4Viagens=0;
    int numeroUc14AIMViagens=0;
    int numeroUc14AIFViagens=0;
    int numeroUc14BicaViagens=0;

    int numeroUc14AMPrToco=0;
    int numeroUc14AMPrTruck=0;
    int numeroUc14AMPrCarreta=0;
    int numeroUc14AMPrAxor=0;

    int numeroUc14AMUMToco=0;
    int numeroUc14AMUMTruck=0;
    int numeroUc14AMUMCarreta=0;
    int numeroUc14AMUMAxor=0;

    int numeroUc14AFToco=0;
    int numeroUc14AFTruck=0;
    int numeroUc14AFCarreta=0;
    int numeroUc14AFAxor=0;

    int numeroUc14PedToco=0;
    int numeroUc14PedTruck=0;
    int numeroUc14PedCarreta=0;
    int numeroUc14PedAxor=0;

    int numeroUc14BicaPrToco=0;
    int numeroUc14BicaPrTruck=0;
    int numeroUc14BicaPrCarreta=0;
    int numeroUc14BicaPrAxor=0;

    int numeroUc14Bica790Toco=0;
    int numeroUc14Bica790Truck=0;
    int numeroUc14Bica790Carreta=0;
    int numeroUc14Bica790Axor=0;

    int numeroUc14BicaUMToco=0;
    int numeroUc14BicaUMTruck=0;
    int numeroUc14BicaUMCarreta=0;
    int numeroUc14BicaUMAxor=0;

    int numeroUc14Br1PrToco=0;
    int numeroUc14Br1PrTruck=0;
    int numeroUc14Br1PrCarreta=0;
    int numeroUc14Br1PrAxor=0;

    int numeroUc14Br119Toco=0;
    int numeroUc14Br119Truck=0;
    int numeroUc14Br119Carreta=0;
    int numeroUc14Br119Axor=0;

    int numeroUc14Br0PrToco=0;
    int numeroUc14Br0PrTruck=0;
    int numeroUc14Br0PrCarreta=0;
    int numeroUc14Br0PrAxor=0;

    int numeroUc14Br0UMToco=0;
    int numeroUc14Br0UMTruck=0;
    int numeroUc14Br0UMCarreta=0;
    int numeroUc14Br0UMAxor=0;

    int numeroUc14SomaToco=0;
    int numeroUc14SomaTruck=0;
    int numeroUc14SomaCarreta=0;
    int numeroUc14SomaAxor=0;







    public Button btnUc14B0ViagensMais;
    public Button btnUc14B0ViagensMenos;
    public Button btnUc14B1ViagensMais;
    public Button btnUc14B1ViagensMenos;
    public Button btnUc14B2ViagensMais;
    public Button btnUc14B2ViagensMenos;
    public Button btnUc14B4ViagensMais;
    public Button btnUc14B4ViagensMenos;
    public Button btnUc14AIMViagensMais;
    public Button btnUc14AIMViagensMenos;
    public Button btnUc14AIFViagensMais;
    public Button btnUc14AIFViagensMenos;
    public Button btnUc14BicaViagensMais;
    public Button btnUc14BicaViagensMenos;


    public Button btnUc14AMPrTocoMais;
    public Button btnUc14AMPrTocoMenos;
    public Button btnUc14AMPrTruckMais;
    public Button btnUc14AMPrTruckMenos;
    public Button btnUc14AMPrCarretaMais;
    public Button btnUc14AMPrCarretaMenos;
    public Button btnUc14AMPrAxorMais;
    public Button btnUc14AMPrAxorMenos;

    public Button btnUc14AMUMTocoMais;
    public Button btnUc14AMUMTocoMenos;
    public Button btnUc14AMUMTruckMais;
    public Button btnUc14AMUMTruckMenos;
    public Button btnUc14AMUMCarretaMais;
    public Button btnUc14AMUMCarretaMenos;
    public Button btnUc14AMUMAxorMais;
    public Button btnUc14AMUMAxorMenos;

    public Button btnUc14AFTocoMais;
    public Button btnUc14AFTocoMenos;
    public Button btnUc14AFTruckMais;
    public Button btnUc14AFTruckMenos;
    public Button btnUc14AFCarretaMais;
    public Button btnUc14AFCarretaMenos;
    public Button btnUc14AFAxorMais;
    public Button btnUc14AFAxorMenos;

    public Button btnUc14PedTocoMais;
    public Button btnUc14PedTocoMenos;
    public Button btnUc14PedTruckMais;
    public Button btnUc14PedTruckMenos;
    public Button btnUc14PedCarretaMais;
    public Button btnUc14PedCarretaMenos;
    public Button btnUc14PedAxorMais;
    public Button btnUc14PedAxorMenos;

    public Button btnUc14BicaPrTocoMais;
    public Button btnUc14BicaPrTocoMenos;
    public Button btnUc14BicaPrTruckMais;
    public Button btnUc14BicaPrTruckMenos;
    public Button btnUc14BicaPrCarretaMais;
    public Button btnUc14BicaPrCarretaMenos;
    public Button btnUc14BicaPrAxorMais;
    public Button btnUc14BicaPrAxorMenos;

    public Button btnUc14Bica790TocoMais;
    public Button btnUc14Bica790TocoMenos;
    public Button btnUc14Bica790TruckMais;
    public Button btnUc14Bica790TruckMenos;
    public Button btnUc14Bica790CarretaMais;
    public Button btnUc14Bica790CarretaMenos;
    public Button btnUc14Bica790AxorMais;
    public Button btnUc14Bica790AxorMenos;

    public Button btnUc14BicaUMTocoMais;
    public Button btnUc14BicaUMTocoMenos;
    public Button btnUc14BicaUMTruckMais;
    public Button btnUc14BicaUMTruckMenos;
    public Button btnUc14BicaUMCarretaMais;
    public Button btnUc14BicaUMCarretaMenos;
    public Button btnUc14BicaUMAxorMais;
    public Button btnUc14BicaUMAxorMenos;

    public Button btnUc14Br1PrTocoMais;
    public Button btnUc14Br1PrTocoMenos;
    public Button btnUc14Br1PrTruckMais;
    public Button btnUc14Br1PrTruckMenos;
    public Button btnUc14Br1PrCarretaMais;
    public Button btnUc14Br1PrCarretaMenos;
    public Button btnUc14Br1PrAxorMais;
    public Button btnUc14Br1PrAxorMenos;

    public Button btnUc14Br119TocoMais;
    public Button btnUc14Br119TocoMenos;
    public Button btnUc14Br119TruckMais;
    public Button btnUc14Br119TruckMenos;
    public Button btnUc14Br119CarretaMais;
    public Button btnUc14Br119CarretaMenos;
    public Button btnUc14Br119AxorMais;
    public Button btnUc14Br119AxorMenos;

    public Button btnUc14Br0PrTocoMais;
    public Button btnUc14Br0PrTocoMenos;
    public Button btnUc14Br0PrTruckMais;
    public Button btnUc14Br0PrTruckMenos;
    public Button btnUc14Br0PrCarretaMais;
    public Button btnUc14Br0PrCarretaMenos;
    public Button btnUc14Br0PrAxorMais;
    public Button btnUc14Br0PrAxorMenos;

    public Button btnUc14Br0UMTocoMais;
    public Button btnUc14Br0UMTocoMenos;
    public Button btnUc14Br0UMTruckMais;
    public Button btnUc14Br0UMTruckMenos;
    public Button btnUc14Br0UMCarretaMais;
    public Button btnUc14Br0UMCarretaMenos;
    public Button btnUc14Br0UMAxorMais;
    public Button btnUc14Br0UMAxorMenos;




    public Button btnUc14Cancelar;



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

    private Uc14DAO dao;
    private Uc14DAOSync dao2;
    private Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc14);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUc14Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUc14Data);
        horaInicial=findViewById(R.id.txtUc14HI);
        horaFinal=findViewById(R.id.txtUc14HF);
        horimetroInicial=findViewById(R.id.txtUc14HoriI);
        horimetroFinal=findViewById(R.id.txtUc14HoriF);
        paradaInicial1=findViewById(R.id.txtPEUc14HI1);
        paradaFinal1=findViewById(R.id.txtPEUc14HF1);
        descricao1=findViewById(R.id.spPEUc14Desc1);
        paradaInicial2=findViewById(R.id.txtPEUc14HI2);
        paradaFinal2=findViewById(R.id.txtPEUc14HF2);
        descricao2=findViewById(R.id.spPEUc14Desc2);
        paradaInicial3=findViewById(R.id.txtPEUc14HI3);
        paradaFinal3=findViewById(R.id.txtPEUc14HF3);
        descricao3=findViewById(R.id.spPEUc14Desc3);
        paradaInicial4=findViewById(R.id.txtPEUc14HI4);
        paradaFinal4=findViewById(R.id.txtPEUc14HF4);
        descricao4=findViewById(R.id.spPEUc14Desc4);
        paradaInicial5=findViewById(R.id.txtPEUc14HI5);
        paradaFinal5=findViewById(R.id.txtPEUc14HF5);
        descricao5=findViewById(R.id.spPEUc14Desc5);
        paradaInicial6=findViewById(R.id.txtPEUc14HI6);
        paradaFinal6=findViewById(R.id.txtPEUc14HF6);
        descricao6=findViewById(R.id.spPEUc14Desc6);
        paradaInicial7=findViewById(R.id.txtPEUc14HI7);
        paradaFinal7=findViewById(R.id.txtPEUc14HF7);
        descricao7=findViewById(R.id.spPEUc14Desc7);
        paradaInicial8=findViewById(R.id.txtPEUc14HI8);
        paradaFinal8=findViewById(R.id.txtPEUc14HF8);
        descricao8=findViewById(R.id.spPEUc14Desc8);
        paradaInicial9=findViewById(R.id.txtPEUc14HI9);
        paradaFinal9=findViewById(R.id.txtPEUc14HF9);
        descricao9=findViewById(R.id.spPEUc14Desc9);
        paradaInicial10=findViewById(R.id.txtPEUc14HI10);
        paradaFinal10=findViewById(R.id.txtPEUc14HF10);
        descricao10=findViewById(R.id.spPEUc14Desc10);

        b0Vol=findViewById(R.id.txtUc14B0IntVol);
        b0NumViagens=findViewById(R.id.txtUc14B0IntNumViagens);
        b0Mot=findViewById(R.id.txtUc14B0IntMot);
        b1Vol=findViewById(R.id.txtUc14B1IntVol);
        b1NumViagens=findViewById(R.id.txtUc14B1IntNumViagens);
        b1Mot=findViewById(R.id.txtUc14B1IntMot);
        b2Vol=findViewById(R.id.txtUc14B2IntVol);
        b2NumViagens=findViewById(R.id.txtUc14B2IntNumViagens);
        b2Mot=findViewById(R.id.txtUc14B2IntMot);
        b4Vol=findViewById(R.id.txtUc14B4IntVol);
        b4NumViagens=findViewById(R.id.txtUc14B4IntNumViagens);
        b4Mot=findViewById(R.id.txtUc14B4IntMot);
        aimVol=findViewById(R.id.txtUc14AIMIntVol);
        aimNumViagens=findViewById(R.id.txtUc14AIMIntNumViagens);
        aimMot=findViewById(R.id.txtUc14AIMIntMot);
        aifVol=findViewById(R.id.txtUc14AIFIntVol);
        aifNumViagens=findViewById(R.id.txtUc14AIFIntNumViagens);
        aifMot=findViewById(R.id.txtUc14AIFIntMot);
        bicaVol=findViewById(R.id.txtUc14BicaIntVol);
        bicaNumViagens=findViewById(R.id.txtUc14BicaIntNumViagens);
        bicaMot=findViewById(R.id.txtUc14BicaIntMot);



        amprToco=findViewById(R.id.txtUc14AMPrToco);
        amprTruck=findViewById(R.id.txtUc14AMPrTruck);
        amprCarreta=findViewById(R.id.txtUc14AMPrCarreta);
        amprAxor=findViewById(R.id.txtUc14AMPrAxor);
        amprObs=findViewById(R.id.txtUc14AMPrObs);

        amumToco=findViewById(R.id.txtUc14AMUMToco);
        amumTruck=findViewById(R.id.txtUc14AMUMTruck);
        amumCarreta=findViewById(R.id.txtUc14AMUMCarreta);
        amumAxor=findViewById(R.id.txtUc14AMUMAxor);
        amumObs=findViewById(R.id.txtUc14AMUMObs);

        afToco=findViewById(R.id.txtUc14AFToco);
        afTruck=findViewById(R.id.txtUc14AFTruck);
        afCarreta=findViewById(R.id.txtUc14AFCarreta);
        afAxor=findViewById(R.id.txtUc14AFAxor);
        afObs=findViewById(R.id.txtUc14AFObs);

        pedToco=findViewById(R.id.txtUc14PedToco);
        pedTruck=findViewById(R.id.txtUc14PedTruck);
        pedCarreta=findViewById(R.id.txtUc14PedCarreta);
        pedAxor=findViewById(R.id.txtUc14PedAxor);
        pedObs=findViewById(R.id.txtUc14PedObs);

        bicaPrToco=findViewById(R.id.txtUc14BicaPrToco);
        bicaPrTruck=findViewById(R.id.txtUc14BicaPrTruck);
        bicaPrCarreta=findViewById(R.id.txtUc14BicaPrCarreta);
        bicaPrAxor=findViewById(R.id.txtUc14BicaPrAxor);
        bicaPrObs=findViewById(R.id.txtUc14BicaPrObs);

        bica790Toco=findViewById(R.id.txtUc14Bica790Toco);
        bica790Truck=findViewById(R.id.txtUc14Bica790Truck);
        bica790Carreta=findViewById(R.id.txtUc14Bica790Carreta);
        bica790Axor=findViewById(R.id.txtUc14Bica790Axor);
        bica790Obs=findViewById(R.id.txtUc14Bica790Obs);

        bicaUmToco=findViewById(R.id.txtUc14BicaUMToco);
        bicaUmTruck=findViewById(R.id.txtUc14BicaUMTruck);
        bicaUmCarreta=findViewById(R.id.txtUc14BicaUMCarreta);
        bicaUmAxor=findViewById(R.id.txtUc14BicaUMAxor);
        bicaUmObs=findViewById(R.id.txtUc14BicaUMObs);

        br1PrToco=findViewById(R.id.txtUc14Br1PrToco);
        br1PrTruck=findViewById(R.id.txtUc14Br1PrTruck);
        br1PrCarreta=findViewById(R.id.txtUc14Br1PrCarreta);
        br1PrAxor=findViewById(R.id.txtUc14Br1PrAxor);
        br1PrObs=findViewById(R.id.txtUc14Br1PrObs);

        br119Toco=findViewById(R.id.txtUc14Br119Toco);
        br119Truck=findViewById(R.id.txtUc14Br119Truck);
        br119Carreta=findViewById(R.id.txtUc14Br119Carreta);
        br119Axor=findViewById(R.id.txtUc14Br119Axor);
        br119Obs=findViewById(R.id.txtUc14Br119Obs);

        br0PrToco=findViewById(R.id.txtUc14Br0PrToco);
        br0PrTruck=findViewById(R.id.txtUc14Br0PrTruck);
        br0PrCarreta=findViewById(R.id.txtUc14Br0PrCarreta);
        br0PrAxor=findViewById(R.id.txtUc14Br0PrAxor);
        br0PrObs=findViewById(R.id.txtUc14Br0PrObs);

        br0UmToco=findViewById(R.id.txtUc14Br0UMToco);
        br0UmTruck=findViewById(R.id.txtUc14Br0UMTruck);
        br0UmCarreta=findViewById(R.id.txtUc14Br0UMCarreta);
        br0UmAxor=findViewById(R.id.txtUc14Br0UMAxor);
        br0UmObs=findViewById(R.id.txtUc14Br0UMObs);


        somaToco=findViewById(R.id.txtUc14SomaToco);
        somaTruck=findViewById(R.id.txtUc14SomaTruck);
        somaCarreta=findViewById(R.id.txtUc14SomaCarreta);
        somaAxor=findViewById(R.id.txtUc14SomaAxor);


        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUc14);

        lanternagem=findViewById(R.id.chkUc14Lant);
        pneus=findViewById(R.id.chkUc14Pn);
        h2o=findViewById(R.id.chkUc14H2O);
        oleo=findViewById(R.id.chkUc14Ol);
        direcao=findViewById(R.id.chkUc14Dir);
        freios=findViewById(R.id.chkUc14Fr);
        parteEletrica=findViewById(R.id.chkUc14PtElet);

        observacoes=findViewById(R.id.txtUc14Obs);

        dao=new Uc14DAO(this);
        dao2= new Uc14DAOSync(this);
        btnUc14Salvar=findViewById(R.id.btnUc14Save);
        btnUc14Sincronizar=findViewById(R.id.btnUc14Sincronizar);
        btnUc14Sincronizar.setVisibility(View.INVISIBLE);


        Spinner spPEUc14Desc1= findViewById(R.id.spPEUc14Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc1.setAdapter(adapterDesc);

        Spinner spPEUc14Desc2= findViewById(R.id.spPEUc14Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc2.setAdapter(adapterDesc2);


        Spinner spPEUc14Desc3= findViewById(R.id.spPEUc14Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc3.setAdapter(adapterDesc3);


        Spinner spPEUc14Desc4= findViewById(R.id.spPEUc14Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc4.setAdapter(adapterDesc4);




        Spinner spPEUc14Desc5= findViewById(R.id.spPEUc14Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc5.setAdapter(adapterDesc5);




        Spinner spPEUc14Desc6= findViewById(R.id.spPEUc14Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc6.setAdapter(adapterDesc6);



        Spinner spPEUc14Desc7= findViewById(R.id.spPEUc14Desc7);
        ArrayAdapter<CharSequence> adapterDesc7=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc7.setAdapter(adapterDesc7);



        Spinner spPEUc14Desc8= findViewById(R.id.spPEUc14Desc8);
        ArrayAdapter<CharSequence> adapterDesc8=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc8.setAdapter(adapterDesc8);




        Spinner spPEUc14Desc9= findViewById(R.id.spPEUc14Desc9);
        ArrayAdapter<CharSequence> adapterDesc9=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc9.setAdapter(adapterDesc9);



        Spinner spPEUc14Desc10= findViewById(R.id.spPEUc14Desc10);
        ArrayAdapter<CharSequence> adapterDesc10=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc14Desc10.setAdapter(adapterDesc10);






        TextView horaI=(TextView)findViewById(R.id.txtUc14HI);
        horaI = (TextView) findViewById(R.id.txtUc14HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUc14Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);


        btnUc14Cancelar= findViewById(R.id.btnUc14Cancel);
        btnUc14Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Uc14Activity.this);
                View view= LayoutInflater.from(Uc14Activity.this).inflate(R.layout.alert_dialog,null);
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







        btnUc14B0ViagensMais = (Button) findViewById(R.id.btnUc14B0IntViagensMais);
        btnUc14B0ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B0IntNumViagens = (TextView) findViewById(R.id.txtUc14B0IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14B0Viagens += 1;
                txtUc14B0IntNumViagens.setText(String.valueOf(numeroUc14B0Viagens));
            }
        });
        btnUc14B0ViagensMenos = (Button) findViewById(R.id.btnUc14B0IntViagensMenos);
        btnUc14B0ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B0IntNumViagens = (TextView) findViewById(R.id.txtUc14B0IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14B0Viagens > 0) {
                    numeroUc14B0Viagens -= 1;
                    txtUc14B0IntNumViagens.setText(String.valueOf(numeroUc14B0Viagens));
                } else {
                    numeroUc14B0Viagens = 0;
                }
            }
        });





        btnUc14B1ViagensMais = (Button) findViewById(R.id.btnUc14B1IntViagensMais);
        btnUc14B1ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B1IntNumViagens = (TextView) findViewById(R.id.txtUc14B1IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14B1Viagens += 1;
                txtUc14B1IntNumViagens.setText(String.valueOf(numeroUc14B1Viagens));
            }
        });
        btnUc14B1ViagensMenos = (Button) findViewById(R.id.btnUc14B1IntViagensMenos);
        btnUc14B1ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B1IntNumViagens = (TextView) findViewById(R.id.txtUc14B1IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14B1Viagens > 0) {
                    numeroUc14B1Viagens -= 1;
                    txtUc14B1IntNumViagens.setText(String.valueOf(numeroUc14B1Viagens));
                } else {
                    numeroUc14B1Viagens = 0;
                }
            }
        });



        btnUc14B2ViagensMais = (Button) findViewById(R.id.btnUc14B2IntViagensMais);
        btnUc14B2ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B2IntNumViagens = (TextView) findViewById(R.id.txtUc14B2IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14B2Viagens += 1;
                txtUc14B2IntNumViagens.setText(String.valueOf(numeroUc14B2Viagens));
            }
        });
        btnUc14B2ViagensMenos = (Button) findViewById(R.id.btnUc14B2IntViagensMenos);
        btnUc14B2ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B2IntNumViagens = (TextView) findViewById(R.id.txtUc14B2IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14B2Viagens > 0) {
                    numeroUc14B2Viagens -= 1;
                    txtUc14B2IntNumViagens.setText(String.valueOf(numeroUc14B2Viagens));
                } else {
                    numeroUc14B2Viagens = 0;
                }
            }
        });



        btnUc14B4ViagensMais = (Button) findViewById(R.id.btnUc14B4IntViagensMais);
        btnUc14B4ViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B4IntNumViagens = (TextView) findViewById(R.id.txtUc14B4IntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14B4Viagens += 1;
                txtUc14B4IntNumViagens.setText(String.valueOf(numeroUc14B4Viagens));
            }
        });
        btnUc14B4ViagensMenos = (Button) findViewById(R.id.btnUc14B4IntViagensMenos);
        btnUc14B4ViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14B4IntNumViagens = (TextView) findViewById(R.id.txtUc14B4IntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14B4Viagens > 0) {
                    numeroUc14B4Viagens -= 1;
                    txtUc14B4IntNumViagens.setText(String.valueOf(numeroUc14B4Viagens));
                } else {
                    numeroUc14B4Viagens = 0;
                }
            }
        });



        btnUc14AIMViagensMais = (Button) findViewById(R.id.btnUc14AIMIntViagensMais);
        btnUc14AIMViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AIMIntNumViagens = (TextView) findViewById(R.id.txtUc14AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14AIMViagens += 1;
                txtUc14AIMIntNumViagens.setText(String.valueOf(numeroUc14AIMViagens));
            }
        });
        btnUc14AIMViagensMenos = (Button) findViewById(R.id.btnUc14AIMIntViagensMenos);
        btnUc14AIMViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AIMIntNumViagens = (TextView) findViewById(R.id.txtUc14AIMIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14AIMViagens > 0) {
                    numeroUc14AIMViagens -= 1;
                    txtUc14AIMIntNumViagens.setText(String.valueOf(numeroUc14AIMViagens));
                } else {
                    numeroUc14AIMViagens = 0;
                }
            }
        });





        btnUc14AIFViagensMais = (Button) findViewById(R.id.btnUc14AIFIntViagensMais);
        btnUc14AIFViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AIFIntNumViagens = (TextView) findViewById(R.id.txtUc14AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14AIFViagens += 1;
                txtUc14AIFIntNumViagens.setText(String.valueOf(numeroUc14AIFViagens));
            }
        });
        btnUc14AIFViagensMenos = (Button) findViewById(R.id.btnUc14AIFIntViagensMenos);
        btnUc14AIFViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AIFIntNumViagens = (TextView) findViewById(R.id.txtUc14AIFIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14AIFViagens > 0) {
                    numeroUc14AIFViagens -= 1;
                    txtUc14AIFIntNumViagens.setText(String.valueOf(numeroUc14AIFViagens));
                } else {
                    numeroUc14AIFViagens = 0;
                }
            }
        });




        btnUc14BicaViagensMais = (Button) findViewById(R.id.btnUc14BicaIntViagensMais);
        btnUc14BicaViagensMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaIntNumViagens = (TextView) findViewById(R.id.txtUc14BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                numeroUc14BicaViagens += 1;
                txtUc14BicaIntNumViagens.setText(String.valueOf(numeroUc14BicaViagens));
            }
        });
        btnUc14BicaViagensMenos = (Button) findViewById(R.id.btnUc14BicaIntViagensMenos);
        btnUc14BicaViagensMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaIntNumViagens = (TextView) findViewById(R.id.txtUc14BicaIntNumViagens);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaViagens > 0) {
                    numeroUc14BicaViagens -= 1;
                    txtUc14BicaIntNumViagens.setText(String.valueOf(numeroUc14BicaViagens));
                } else {
                    numeroUc14BicaViagens = 0;
                }
            }
        });









        btnUc14AMPrTocoMais = (Button) findViewById(R.id.btnUc14AMPrTocoMais);
        btnUc14AMPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrToco = (TextView) findViewById(R.id.txtUc14AMPrToco);

            @Override
            public void onClick(View v) {
                numeroUc14AMPrToco += 1;
                txtUc14AMPrToco.setText(String.valueOf(numeroUc14AMPrToco));
            }
        });
        btnUc14AMPrTocoMenos = (Button) findViewById(R.id.btnUc14AMPrTocoMenos);
        btnUc14AMPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrToco = (TextView) findViewById(R.id.txtUc14AMPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMPrToco > 0) {
                    numeroUc14AMPrToco -= 1;
                    txtUc14AMPrToco.setText(String.valueOf(numeroUc14AMPrToco));
                } else {
                    numeroUc14AMPrToco = 0;
                }
            }
        });


        btnUc14AMPrTruckMais = (Button) findViewById(R.id.btnUc14AMPrTruckMais);
        btnUc14AMPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrTruck = (TextView) findViewById(R.id.txtUc14AMPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc14AMPrTruck += 1;
                txtUc14AMPrTruck.setText(String.valueOf(numeroUc14AMPrTruck));
            }
        });
        btnUc14AMPrTruckMenos = (Button) findViewById(R.id.btnUc14AMPrTruckMenos);
        btnUc14AMPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrTruck = (TextView) findViewById(R.id.txtUc14AMPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMPrTruck > 0) {
                    numeroUc14AMPrTruck -= 1;
                    txtUc14AMPrTruck.setText(String.valueOf(numeroUc14AMPrTruck));
                } else {
                    numeroUc14AMPrTruck = 0;
                }
            }
        });


        btnUc14AMPrCarretaMais = (Button) findViewById(R.id.btnUc14AMPrCarretaMais);
        btnUc14AMPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrCarreta = (TextView) findViewById(R.id.txtUc14AMPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14AMPrCarreta += 1;
                txtUc14AMPrCarreta.setText(String.valueOf(numeroUc14AMPrCarreta));
            }
        });
        btnUc14AMPrCarretaMenos = (Button) findViewById(R.id.btnUc14AMPrCarretaMenos);
        btnUc14AMPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrCarreta = (TextView) findViewById(R.id.txtUc14AMPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMPrCarreta > 0) {
                    numeroUc14AMPrCarreta -= 1;
                    txtUc14AMPrCarreta.setText(String.valueOf(numeroUc14AMPrCarreta));
                } else {
                    numeroUc14AMPrCarreta = 0;
                }
            }
        });


        btnUc14AMPrAxorMais = (Button) findViewById(R.id.btnUc14AMPrAxorMais);
        btnUc14AMPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrAxor = (TextView) findViewById(R.id.txtUc14AMPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc14AMPrAxor += 1;
                txtUc14AMPrAxor.setText(String.valueOf(numeroUc14AMPrAxor));
            }
        });
        btnUc14AMPrAxorMenos = (Button) findViewById(R.id.btnUc14AMPrAxorMenos);
        btnUc14AMPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMPrAxor = (TextView) findViewById(R.id.txtUc14AMPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMPrAxor > 0) {
                    numeroUc14AMPrAxor -= 1;
                    txtUc14AMPrAxor.setText(String.valueOf(numeroUc14AMPrAxor));
                } else {
                    numeroUc14AMPrAxor = 0;
                }
            }
        });











        btnUc14AMUMTocoMais = (Button) findViewById(R.id.btnUc14AMUMTocoMais);
        btnUc14AMUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMToco = (TextView) findViewById(R.id.txtUc14AMUMToco);

            @Override
            public void onClick(View v) {
                numeroUc14AMUMToco += 1;
                txtUc14AMUMToco.setText(String.valueOf(numeroUc14AMUMToco));
            }
        });
        btnUc14AMUMTocoMenos = (Button) findViewById(R.id.btnUc14AMUMTocoMenos);
        btnUc14AMUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMToco = (TextView) findViewById(R.id.txtUc14AMUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMUMToco > 0) {
                    numeroUc14AMUMToco -= 1;
                    txtUc14AMUMToco.setText(String.valueOf(numeroUc14AMUMToco));
                } else {
                    numeroUc14AMUMToco = 0;
                }
            }
        });


        btnUc14AMUMTruckMais = (Button) findViewById(R.id.btnUc14AMUMTruckMais);
        btnUc14AMUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMTruck = (TextView) findViewById(R.id.txtUc14AMUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc14AMUMTruck += 1;
                txtUc14AMUMTruck.setText(String.valueOf(numeroUc14AMUMTruck));
            }
        });
        btnUc14AMUMTruckMenos = (Button) findViewById(R.id.btnUc14AMUMTruckMenos);
        btnUc14AMUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMTruck = (TextView) findViewById(R.id.txtUc14AMUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMUMTruck > 0) {
                    numeroUc14AMUMTruck -= 1;
                    txtUc14AMUMTruck.setText(String.valueOf(numeroUc14AMUMTruck));
                } else {
                    numeroUc14AMUMTruck = 0;
                }
            }
        });


        btnUc14AMUMCarretaMais = (Button) findViewById(R.id.btnUc14AMUMCarretaMais);
        btnUc14AMUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMCarreta = (TextView) findViewById(R.id.txtUc14AMUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14AMUMCarreta += 1;
                txtUc14AMUMCarreta.setText(String.valueOf(numeroUc14AMUMCarreta));
            }
        });
        btnUc14AMUMCarretaMenos = (Button) findViewById(R.id.btnUc14AMUMCarretaMenos);
        btnUc14AMUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMCarreta = (TextView) findViewById(R.id.txtUc14AMUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMUMCarreta > 0) {
                    numeroUc14AMUMCarreta -= 1;
                    txtUc14AMUMCarreta.setText(String.valueOf(numeroUc14AMUMCarreta));
                } else {
                    numeroUc14AMUMCarreta = 0;
                }
            }
        });


        btnUc14AMUMAxorMais = (Button) findViewById(R.id.btnUc14AMUMAxorMais);
        btnUc14AMUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMAxor = (TextView) findViewById(R.id.txtUc14AMUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc14AMUMAxor += 1;
                txtUc14AMUMAxor.setText(String.valueOf(numeroUc14AMUMAxor));
            }
        });
        btnUc14AMUMAxorMenos = (Button) findViewById(R.id.btnUc14AMUMAxorMenos);
        btnUc14AMUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AMUMAxor = (TextView) findViewById(R.id.txtUc14AMUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14AMUMAxor > 0) {
                    numeroUc14AMUMAxor -= 1;
                    txtUc14AMUMAxor.setText(String.valueOf(numeroUc14AMUMAxor));
                } else {
                    numeroUc14AMUMAxor = 0;
                }
            }
        });








        btnUc14AFTocoMais = (Button) findViewById(R.id.btnUc14AFTocoMais);
        btnUc14AFTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFToco = (TextView) findViewById(R.id.txtUc14AFToco);

            @Override
            public void onClick(View v) {
                numeroUc14AFToco += 1;
                txtUc14AFToco.setText(String.valueOf(numeroUc14AFToco));
            }
        });
        btnUc14AFTocoMenos = (Button) findViewById(R.id.btnUc14AFTocoMenos);
        btnUc14AFTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFToco = (TextView) findViewById(R.id.txtUc14AFToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14AFToco > 0) {
                    numeroUc14AFToco -= 1;
                    txtUc14AFToco.setText(String.valueOf(numeroUc14AFToco));
                } else {
                    numeroUc14AFToco = 0;
                }
            }
        });


        btnUc14AFTruckMais = (Button) findViewById(R.id.btnUc14AFTruckMais);
        btnUc14AFTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFTruck = (TextView) findViewById(R.id.txtUc14AFTruck);

            @Override
            public void onClick(View v) {
                numeroUc14AFTruck += 1;
                txtUc14AFTruck.setText(String.valueOf(numeroUc14AFTruck));
            }
        });
        btnUc14AFTruckMenos = (Button) findViewById(R.id.btnUc14AFTruckMenos);
        btnUc14AFTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFTruck = (TextView) findViewById(R.id.txtUc14AFTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14AFTruck > 0) {
                    numeroUc14AFTruck -= 1;
                    txtUc14AFTruck.setText(String.valueOf(numeroUc14AFTruck));
                } else {
                    numeroUc14AFTruck = 0;
                }
            }
        });


        btnUc14AFCarretaMais = (Button) findViewById(R.id.btnUc14AFCarretaMais);
        btnUc14AFCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFCarreta = (TextView) findViewById(R.id.txtUc14AFCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14AFCarreta += 1;
                txtUc14AFCarreta.setText(String.valueOf(numeroUc14AFCarreta));
            }
        });
        btnUc14AFCarretaMenos = (Button) findViewById(R.id.btnUc14AFCarretaMenos);
        btnUc14AFCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFCarreta = (TextView) findViewById(R.id.txtUc14AFCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14AFCarreta > 0) {
                    numeroUc14AFCarreta -= 1;
                    txtUc14AFCarreta.setText(String.valueOf(numeroUc14AFCarreta));
                } else {
                    numeroUc14AFCarreta = 0;
                }
            }
        });


        btnUc14AFAxorMais = (Button) findViewById(R.id.btnUc14AFAxorMais);
        btnUc14AFAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFAxor = (TextView) findViewById(R.id.txtUc14AFAxor);

            @Override
            public void onClick(View v) {
                numeroUc14AFAxor += 1;
                txtUc14AFAxor.setText(String.valueOf(numeroUc14AFAxor));
            }
        });
        btnUc14AFAxorMenos = (Button) findViewById(R.id.btnUc14AFAxorMenos);
        btnUc14AFAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14AFAxor = (TextView) findViewById(R.id.txtUc14AFAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14AFAxor > 0) {
                    numeroUc14AFAxor -= 1;
                    txtUc14AFAxor.setText(String.valueOf(numeroUc14AFAxor));
                } else {
                    numeroUc14AFAxor = 0;
                }
            }
        });









        btnUc14PedTocoMais = (Button) findViewById(R.id.btnUc14PedTocoMais);
        btnUc14PedTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedToco = (TextView) findViewById(R.id.txtUc14PedToco);

            @Override
            public void onClick(View v) {
                numeroUc14PedToco += 1;
                txtUc14PedToco.setText(String.valueOf(numeroUc14PedToco));
            }
        });
        btnUc14PedTocoMenos = (Button) findViewById(R.id.btnUc14PedTocoMenos);
        btnUc14PedTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedToco = (TextView) findViewById(R.id.txtUc14PedToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14PedToco > 0) {
                    numeroUc14PedToco -= 1;
                    txtUc14PedToco.setText(String.valueOf(numeroUc14PedToco));
                } else {
                    numeroUc14PedToco = 0;
                }
            }
        });


        btnUc14PedTruckMais = (Button) findViewById(R.id.btnUc14PedTruckMais);
        btnUc14PedTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedTruck = (TextView) findViewById(R.id.txtUc14PedTruck);

            @Override
            public void onClick(View v) {
                numeroUc14PedTruck += 1;
                txtUc14PedTruck.setText(String.valueOf(numeroUc14PedTruck));
            }
        });
        btnUc14PedTruckMenos = (Button) findViewById(R.id.btnUc14PedTruckMenos);
        btnUc14PedTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedTruck = (TextView) findViewById(R.id.txtUc14PedTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14PedTruck > 0) {
                    numeroUc14PedTruck -= 1;
                    txtUc14PedTruck.setText(String.valueOf(numeroUc14PedTruck));
                } else {
                    numeroUc14PedTruck = 0;
                }
            }
        });


        btnUc14PedCarretaMais = (Button) findViewById(R.id.btnUc14PedCarretaMais);
        btnUc14PedCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedCarreta = (TextView) findViewById(R.id.txtUc14PedCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14PedCarreta += 1;
                txtUc14PedCarreta.setText(String.valueOf(numeroUc14PedCarreta));
            }
        });
        btnUc14PedCarretaMenos = (Button) findViewById(R.id.btnUc14PedCarretaMenos);
        btnUc14PedCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedCarreta = (TextView) findViewById(R.id.txtUc14PedCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14PedCarreta > 0) {
                    numeroUc14PedCarreta -= 1;
                    txtUc14PedCarreta.setText(String.valueOf(numeroUc14PedCarreta));
                } else {
                    numeroUc14PedCarreta = 0;
                }
            }
        });


        btnUc14PedAxorMais = (Button) findViewById(R.id.btnUc14PedAxorMais);
        btnUc14PedAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedAxor = (TextView) findViewById(R.id.txtUc14PedAxor);

            @Override
            public void onClick(View v) {
                numeroUc14PedAxor += 1;
                txtUc14PedAxor.setText(String.valueOf(numeroUc14PedAxor));
            }
        });
        btnUc14PedAxorMenos = (Button) findViewById(R.id.btnUc14PedAxorMenos);
        btnUc14PedAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14PedAxor = (TextView) findViewById(R.id.txtUc14PedAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14PedAxor > 0) {
                    numeroUc14PedAxor -= 1;
                    txtUc14PedAxor.setText(String.valueOf(numeroUc14PedAxor));
                } else {
                    numeroUc14PedAxor = 0;
                }
            }
        });




        btnUc14BicaPrTocoMais = (Button) findViewById(R.id.btnUc14BicaPrTocoMais);
        btnUc14BicaPrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrToco = (TextView) findViewById(R.id.txtUc14BicaPrToco);

            @Override
            public void onClick(View v) {
                numeroUc14BicaPrToco += 1;
                txtUc14BicaPrToco.setText(String.valueOf(numeroUc14BicaPrToco));
            }
        });
        btnUc14BicaPrTocoMenos = (Button) findViewById(R.id.btnUc14BicaPrTocoMenos);
        btnUc14BicaPrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrToco = (TextView) findViewById(R.id.txtUc14BicaPrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaPrToco > 0) {
                    numeroUc14BicaPrToco -= 1;
                    txtUc14BicaPrToco.setText(String.valueOf(numeroUc14BicaPrToco));
                } else {
                    numeroUc14BicaPrToco = 0;
                }
            }
        });


        btnUc14BicaPrTruckMais = (Button) findViewById(R.id.btnUc14BicaPrTruckMais);
        btnUc14BicaPrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrTruck = (TextView) findViewById(R.id.txtUc14BicaPrTruck);

            @Override
            public void onClick(View v) {
                numeroUc14BicaPrTruck += 1;
                txtUc14BicaPrTruck.setText(String.valueOf(numeroUc14BicaPrTruck));
            }
        });
        btnUc14BicaPrTruckMenos = (Button) findViewById(R.id.btnUc14BicaPrTruckMenos);
        btnUc14BicaPrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrTruck = (TextView) findViewById(R.id.txtUc14BicaPrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaPrTruck > 0) {
                    numeroUc14BicaPrTruck -= 1;
                    txtUc14BicaPrTruck.setText(String.valueOf(numeroUc14BicaPrTruck));
                } else {
                    numeroUc14BicaPrTruck = 0;
                }
            }
        });


        btnUc14BicaPrCarretaMais = (Button) findViewById(R.id.btnUc14BicaPrCarretaMais);
        btnUc14BicaPrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrCarreta = (TextView) findViewById(R.id.txtUc14BicaPrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14BicaPrCarreta += 1;
                txtUc14BicaPrCarreta.setText(String.valueOf(numeroUc14BicaPrCarreta));
            }
        });
        btnUc14BicaPrCarretaMenos = (Button) findViewById(R.id.btnUc14BicaPrCarretaMenos);
        btnUc14BicaPrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrCarreta = (TextView) findViewById(R.id.txtUc14BicaPrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaPrCarreta > 0) {
                    numeroUc14BicaPrCarreta -= 1;
                    txtUc14BicaPrCarreta.setText(String.valueOf(numeroUc14BicaPrCarreta));
                } else {
                    numeroUc14BicaPrCarreta = 0;
                }
            }
        });


        btnUc14BicaPrAxorMais = (Button) findViewById(R.id.btnUc14BicaPrAxorMais);
        btnUc14BicaPrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrAxor = (TextView) findViewById(R.id.txtUc14BicaPrAxor);

            @Override
            public void onClick(View v) {
                numeroUc14BicaPrAxor += 1;
                txtUc14BicaPrAxor.setText(String.valueOf(numeroUc14BicaPrAxor));
            }
        });
        btnUc14BicaPrAxorMenos = (Button) findViewById(R.id.btnUc14BicaPrAxorMenos);
        btnUc14BicaPrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaPrAxor = (TextView) findViewById(R.id.txtUc14BicaPrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaPrAxor > 0) {
                    numeroUc14BicaPrAxor -= 1;
                    txtUc14BicaPrAxor.setText(String.valueOf(numeroUc14BicaPrAxor));
                } else {
                    numeroUc14BicaPrAxor = 0;
                }
            }
        });










        btnUc14Bica790TocoMais = (Button) findViewById(R.id.btnUc14Bica790TocoMais);
        btnUc14Bica790TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Toco = (TextView) findViewById(R.id.txtUc14Bica790Toco);

            @Override
            public void onClick(View v) {
                numeroUc14Bica790Toco += 1;
                txtUc14Bica790Toco.setText(String.valueOf(numeroUc14Bica790Toco));
            }
        });
        btnUc14Bica790TocoMenos = (Button) findViewById(R.id.btnUc14Bica790TocoMenos);
        btnUc14Bica790TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Toco = (TextView) findViewById(R.id.txtUc14Bica790Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc14Bica790Toco > 0) {
                    numeroUc14Bica790Toco -= 1;
                    txtUc14Bica790Toco.setText(String.valueOf(numeroUc14Bica790Toco));
                } else {
                    numeroUc14Bica790Toco = 0;
                }
            }
        });


        btnUc14Bica790TruckMais = (Button) findViewById(R.id.btnUc14Bica790TruckMais);
        btnUc14Bica790TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Truck = (TextView) findViewById(R.id.txtUc14Bica790Truck);

            @Override
            public void onClick(View v) {
                numeroUc14Bica790Truck += 1;
                txtUc14Bica790Truck.setText(String.valueOf(numeroUc14Bica790Truck));
            }
        });
        btnUc14Bica790TruckMenos = (Button) findViewById(R.id.btnUc14Bica790TruckMenos);
        btnUc14Bica790TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Truck = (TextView) findViewById(R.id.txtUc14Bica790Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc14Bica790Truck > 0) {
                    numeroUc14Bica790Truck -= 1;
                    txtUc14Bica790Truck.setText(String.valueOf(numeroUc14Bica790Truck));
                } else {
                    numeroUc14Bica790Truck = 0;
                }
            }
        });


        btnUc14Bica790CarretaMais = (Button) findViewById(R.id.btnUc14Bica790CarretaMais);
        btnUc14Bica790CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Carreta = (TextView) findViewById(R.id.txtUc14Bica790Carreta);

            @Override
            public void onClick(View v) {
                numeroUc14Bica790Carreta += 1;
                txtUc14Bica790Carreta.setText(String.valueOf(numeroUc14Bica790Carreta));
            }
        });
        btnUc14Bica790CarretaMenos = (Button) findViewById(R.id.btnUc14Bica790CarretaMenos);
        btnUc14Bica790CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Carreta = (TextView) findViewById(R.id.txtUc14Bica790Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14Bica790Carreta > 0) {
                    numeroUc14Bica790Carreta -= 1;
                    txtUc14Bica790Carreta.setText(String.valueOf(numeroUc14Bica790Carreta));
                } else {
                    numeroUc14Bica790Carreta = 0;
                }
            }
        });


        btnUc14Bica790AxorMais = (Button) findViewById(R.id.btnUc14Bica790AxorMais);
        btnUc14Bica790AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Axor = (TextView) findViewById(R.id.txtUc14Bica790Axor);

            @Override
            public void onClick(View v) {
                numeroUc14Bica790Axor += 1;
                txtUc14Bica790Axor.setText(String.valueOf(numeroUc14Bica790Axor));
            }
        });
        btnUc14Bica790AxorMenos = (Button) findViewById(R.id.btnUc14Bica790AxorMenos);
        btnUc14Bica790AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Bica790Axor = (TextView) findViewById(R.id.txtUc14Bica790Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc14Bica790Axor > 0) {
                    numeroUc14Bica790Axor -= 1;
                    txtUc14Bica790Axor.setText(String.valueOf(numeroUc14Bica790Axor));
                } else {
                    numeroUc14Bica790Axor = 0;
                }
            }
        });






        btnUc14BicaUMTocoMais = (Button) findViewById(R.id.btnUc14BicaUMTocoMais);
        btnUc14BicaUMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMToco = (TextView) findViewById(R.id.txtUc14BicaUMToco);

            @Override
            public void onClick(View v) {
                numeroUc14BicaUMToco += 1;
                txtUc14BicaUMToco.setText(String.valueOf(numeroUc14BicaUMToco));
            }
        });
        btnUc14BicaUMTocoMenos = (Button) findViewById(R.id.btnUc14BicaUMTocoMenos);
        btnUc14BicaUMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMToco = (TextView) findViewById(R.id.txtUc14BicaUMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaUMToco > 0) {
                    numeroUc14BicaUMToco -= 1;
                    txtUc14BicaUMToco.setText(String.valueOf(numeroUc14BicaUMToco));
                } else {
                    numeroUc14BicaUMToco = 0;
                }
            }
        });


        btnUc14BicaUMTruckMais = (Button) findViewById(R.id.btnUc14BicaUMTruckMais);
        btnUc14BicaUMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMTruck = (TextView) findViewById(R.id.txtUc14BicaUMTruck);

            @Override
            public void onClick(View v) {
                numeroUc14BicaUMTruck += 1;
                txtUc14BicaUMTruck.setText(String.valueOf(numeroUc14BicaUMTruck));
            }
        });
        btnUc14BicaUMTruckMenos = (Button) findViewById(R.id.btnUc14BicaUMTruckMenos);
        btnUc14BicaUMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMTruck = (TextView) findViewById(R.id.txtUc14BicaUMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaUMTruck > 0) {
                    numeroUc14BicaUMTruck -= 1;
                    txtUc14BicaUMTruck.setText(String.valueOf(numeroUc14BicaUMTruck));
                } else {
                    numeroUc14BicaUMTruck = 0;
                }
            }
        });


        btnUc14BicaUMCarretaMais = (Button) findViewById(R.id.btnUc14BicaUMCarretaMais);
        btnUc14BicaUMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMCarreta = (TextView) findViewById(R.id.txtUc14BicaUMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14BicaUMCarreta += 1;
                txtUc14BicaUMCarreta.setText(String.valueOf(numeroUc14BicaUMCarreta));
            }
        });
        btnUc14BicaUMCarretaMenos = (Button) findViewById(R.id.btnUc14BicaUMCarretaMenos);
        btnUc14BicaUMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMCarreta = (TextView) findViewById(R.id.txtUc14BicaUMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaUMCarreta > 0) {
                    numeroUc14BicaUMCarreta -= 1;
                    txtUc14BicaUMCarreta.setText(String.valueOf(numeroUc14BicaUMCarreta));
                } else {
                    numeroUc14BicaUMCarreta = 0;
                }
            }
        });


        btnUc14BicaUMAxorMais = (Button) findViewById(R.id.btnUc14BicaUMAxorMais);
        btnUc14BicaUMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMAxor = (TextView) findViewById(R.id.txtUc14BicaUMAxor);

            @Override
            public void onClick(View v) {
                numeroUc14BicaUMAxor += 1;
                txtUc14BicaUMAxor.setText(String.valueOf(numeroUc14BicaUMAxor));
            }
        });
        btnUc14BicaUMAxorMenos = (Button) findViewById(R.id.btnUc14BicaUMAxorMenos);
        btnUc14BicaUMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14BicaUMAxor = (TextView) findViewById(R.id.txtUc14BicaUMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14BicaUMAxor > 0) {
                    numeroUc14BicaUMAxor -= 1;
                    txtUc14BicaUMAxor.setText(String.valueOf(numeroUc14BicaUMAxor));
                } else {
                    numeroUc14BicaUMAxor = 0;
                }
            }
        });











        btnUc14Br1PrTocoMais = (Button) findViewById(R.id.btnUc14Br1PrTocoMais);
        btnUc14Br1PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrToco = (TextView) findViewById(R.id.txtUc14Br1PrToco);

            @Override
            public void onClick(View v) {
                numeroUc14Br1PrToco += 1;
                txtUc14Br1PrToco.setText(String.valueOf(numeroUc14Br1PrToco));
            }
        });
        btnUc14Br1PrTocoMenos = (Button) findViewById(R.id.btnUc14Br1PrTocoMenos);
        btnUc14Br1PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrToco = (TextView) findViewById(R.id.txtUc14Br1PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br1PrToco > 0) {
                    numeroUc14Br1PrToco -= 1;
                    txtUc14Br1PrToco.setText(String.valueOf(numeroUc14Br1PrToco));
                } else {
                    numeroUc14Br1PrToco = 0;
                }
            }
        });


        btnUc14Br1PrTruckMais = (Button) findViewById(R.id.btnUc14Br1PrTruckMais);
        btnUc14Br1PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrTruck = (TextView) findViewById(R.id.txtUc14Br1PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc14Br1PrTruck += 1;
                txtUc14Br1PrTruck.setText(String.valueOf(numeroUc14Br1PrTruck));
            }
        });
        btnUc14Br1PrTruckMenos = (Button) findViewById(R.id.btnUc14Br1PrTruckMenos);
        btnUc14Br1PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrTruck = (TextView) findViewById(R.id.txtUc14Br1PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br1PrTruck > 0) {
                    numeroUc14Br1PrTruck -= 1;
                    txtUc14Br1PrTruck.setText(String.valueOf(numeroUc14Br1PrTruck));
                } else {
                    numeroUc14Br1PrTruck = 0;
                }
            }
        });


        btnUc14Br1PrCarretaMais = (Button) findViewById(R.id.btnUc14Br1PrCarretaMais);
        btnUc14Br1PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrCarreta = (TextView) findViewById(R.id.txtUc14Br1PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14Br1PrCarreta += 1;
                txtUc14Br1PrCarreta.setText(String.valueOf(numeroUc14Br1PrCarreta));
            }
        });
        btnUc14Br1PrCarretaMenos = (Button) findViewById(R.id.btnUc14Br1PrCarretaMenos);
        btnUc14Br1PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrCarreta = (TextView) findViewById(R.id.txtUc14Br1PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br1PrCarreta > 0) {
                    numeroUc14Br1PrCarreta -= 1;
                    txtUc14Br1PrCarreta.setText(String.valueOf(numeroUc14Br1PrCarreta));
                } else {
                    numeroUc14Br1PrCarreta = 0;
                }
            }
        });


        btnUc14Br1PrAxorMais = (Button) findViewById(R.id.btnUc14Br1PrAxorMais);
        btnUc14Br1PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrAxor = (TextView) findViewById(R.id.txtUc14Br1PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc14Br1PrAxor += 1;
                txtUc14Br1PrAxor.setText(String.valueOf(numeroUc14Br1PrAxor));
            }
        });
        btnUc14Br1PrAxorMenos = (Button) findViewById(R.id.btnUc14Br1PrAxorMenos);
        btnUc14Br1PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br1PrAxor = (TextView) findViewById(R.id.txtUc14Br1PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br1PrAxor > 0) {
                    numeroUc14Br1PrAxor -= 1;
                    txtUc14Br1PrAxor.setText(String.valueOf(numeroUc14Br1PrAxor));
                } else {
                    numeroUc14Br1PrAxor = 0;
                }
            }
        });










        btnUc14Br119TocoMais = (Button) findViewById(R.id.btnUc14Br119TocoMais);
        btnUc14Br119TocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Toco = (TextView) findViewById(R.id.txtUc14Br119Toco);

            @Override
            public void onClick(View v) {
                numeroUc14Br119Toco += 1;
                txtUc14Br119Toco.setText(String.valueOf(numeroUc14Br119Toco));
            }
        });
        btnUc14Br119TocoMenos = (Button) findViewById(R.id.btnUc14Br119TocoMenos);
        btnUc14Br119TocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Toco = (TextView) findViewById(R.id.txtUc14Br119Toco);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br119Toco > 0) {
                    numeroUc14Br119Toco -= 1;
                    txtUc14Br119Toco.setText(String.valueOf(numeroUc14Br119Toco));
                } else {
                    numeroUc14Br119Toco = 0;
                }
            }
        });


        btnUc14Br119TruckMais = (Button) findViewById(R.id.btnUc14Br119TruckMais);
        btnUc14Br119TruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Truck = (TextView) findViewById(R.id.txtUc14Br119Truck);

            @Override
            public void onClick(View v) {
                numeroUc14Br119Truck += 1;
                txtUc14Br119Truck.setText(String.valueOf(numeroUc14Br119Truck));
            }
        });
        btnUc14Br119TruckMenos = (Button) findViewById(R.id.btnUc14Br119TruckMenos);
        btnUc14Br119TruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Truck = (TextView) findViewById(R.id.txtUc14Br119Truck);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br119Truck > 0) {
                    numeroUc14Br119Truck -= 1;
                    txtUc14Br119Truck.setText(String.valueOf(numeroUc14Br119Truck));
                } else {
                    numeroUc14Br119Truck = 0;
                }
            }
        });


        btnUc14Br119CarretaMais = (Button) findViewById(R.id.btnUc14Br119CarretaMais);
        btnUc14Br119CarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Carreta = (TextView) findViewById(R.id.txtUc14Br119Carreta);

            @Override
            public void onClick(View v) {
                numeroUc14Br119Carreta += 1;
                txtUc14Br119Carreta.setText(String.valueOf(numeroUc14Br119Carreta));
            }
        });
        btnUc14Br119CarretaMenos = (Button) findViewById(R.id.btnUc14Br119CarretaMenos);
        btnUc14Br119CarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Carreta = (TextView) findViewById(R.id.txtUc14Br119Carreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br119Carreta > 0) {
                    numeroUc14Br119Carreta -= 1;
                    txtUc14Br119Carreta.setText(String.valueOf(numeroUc14Br119Carreta));
                } else {
                    numeroUc14Br119Carreta = 0;
                }
            }
        });


        btnUc14Br119AxorMais = (Button) findViewById(R.id.btnUc14Br119AxorMais);
        btnUc14Br119AxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Axor = (TextView) findViewById(R.id.txtUc14Br119Axor);

            @Override
            public void onClick(View v) {
                numeroUc14Br119Axor += 1;
                txtUc14Br119Axor.setText(String.valueOf(numeroUc14Br119Axor));
            }
        });
        btnUc14Br119AxorMenos = (Button) findViewById(R.id.btnUc14Br119AxorMenos);
        btnUc14Br119AxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br119Axor = (TextView) findViewById(R.id.txtUc14Br119Axor);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br119Axor > 0) {
                    numeroUc14Br119Axor -= 1;
                    txtUc14Br119Axor.setText(String.valueOf(numeroUc14Br119Axor));
                } else {
                    numeroUc14Br119Axor = 0;
                }
            }
        });












        btnUc14Br0PrTocoMais = (Button) findViewById(R.id.btnUc14Br0PrTocoMais);
        btnUc14Br0PrTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrToco = (TextView) findViewById(R.id.txtUc14Br0PrToco);

            @Override
            public void onClick(View v) {
                numeroUc14Br0PrToco += 1;
                txtUc14Br0PrToco.setText(String.valueOf(numeroUc14Br0PrToco));
            }
        });
        btnUc14Br0PrTocoMenos = (Button) findViewById(R.id.btnUc14Br0PrTocoMenos);
        btnUc14Br0PrTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrToco = (TextView) findViewById(R.id.txtUc14Br0PrToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0PrToco > 0) {
                    numeroUc14Br0PrToco -= 1;
                    txtUc14Br0PrToco.setText(String.valueOf(numeroUc14Br0PrToco));
                } else {
                    numeroUc14Br0PrToco = 0;
                }
            }
        });


        btnUc14Br0PrTruckMais = (Button) findViewById(R.id.btnUc14Br0PrTruckMais);
        btnUc14Br0PrTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrTruck = (TextView) findViewById(R.id.txtUc14Br0PrTruck);

            @Override
            public void onClick(View v) {
                numeroUc14Br0PrTruck += 1;
                txtUc14Br0PrTruck.setText(String.valueOf(numeroUc14Br0PrTruck));
            }
        });
        btnUc14Br0PrTruckMenos = (Button) findViewById(R.id.btnUc14Br0PrTruckMenos);
        btnUc14Br0PrTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrTruck = (TextView) findViewById(R.id.txtUc14Br0PrTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0PrTruck > 0) {
                    numeroUc14Br0PrTruck -= 1;
                    txtUc14Br0PrTruck.setText(String.valueOf(numeroUc14Br0PrTruck));
                } else {
                    numeroUc14Br0PrTruck = 0;
                }
            }
        });


        btnUc14Br0PrCarretaMais = (Button) findViewById(R.id.btnUc14Br0PrCarretaMais);
        btnUc14Br0PrCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrCarreta = (TextView) findViewById(R.id.txtUc14Br0PrCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14Br0PrCarreta += 1;
                txtUc14Br0PrCarreta.setText(String.valueOf(numeroUc14Br0PrCarreta));
            }
        });
        btnUc14Br0PrCarretaMenos = (Button) findViewById(R.id.btnUc14Br0PrCarretaMenos);
        btnUc14Br0PrCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrCarreta = (TextView) findViewById(R.id.txtUc14Br0PrCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0PrCarreta > 0) {
                    numeroUc14Br0PrCarreta -= 1;
                    txtUc14Br0PrCarreta.setText(String.valueOf(numeroUc14Br0PrCarreta));
                } else {
                    numeroUc14Br0PrCarreta = 0;
                }
            }
        });


        btnUc14Br0PrAxorMais = (Button) findViewById(R.id.btnUc14Br0PrAxorMais);
        btnUc14Br0PrAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrAxor = (TextView) findViewById(R.id.txtUc14Br0PrAxor);

            @Override
            public void onClick(View v) {
                numeroUc14Br0PrAxor += 1;
                txtUc14Br0PrAxor.setText(String.valueOf(numeroUc14Br0PrAxor));
            }
        });
        btnUc14Br0PrAxorMenos = (Button) findViewById(R.id.btnUc14Br0PrAxorMenos);
        btnUc14Br0PrAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0PrAxor = (TextView) findViewById(R.id.txtUc14Br0PrAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0PrAxor > 0) {
                    numeroUc14Br0PrAxor -= 1;
                    txtUc14Br0PrAxor.setText(String.valueOf(numeroUc14Br0PrAxor));
                } else {
                    numeroUc14Br0PrAxor = 0;
                }
            }
        });









        btnUc14Br0UMTocoMais = (Button) findViewById(R.id.btnUc14Br0UMTocoMais);
        btnUc14Br0UMTocoMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMToco = (TextView) findViewById(R.id.txtUc14Br0UMToco);

            @Override
            public void onClick(View v) {
                numeroUc14Br0UMToco += 1;
                txtUc14Br0UMToco.setText(String.valueOf(numeroUc14Br0UMToco));
            }
        });
        btnUc14Br0UMTocoMenos = (Button) findViewById(R.id.btnUc14Br0UMTocoMenos);
        btnUc14Br0UMTocoMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMToco = (TextView) findViewById(R.id.txtUc14Br0UMToco);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0UMToco > 0) {
                    numeroUc14Br0UMToco -= 1;
                    txtUc14Br0UMToco.setText(String.valueOf(numeroUc14Br0UMToco));
                } else {
                    numeroUc14Br0UMToco = 0;
                }
            }
        });


        btnUc14Br0UMTruckMais = (Button) findViewById(R.id.btnUc14Br0UMTruckMais);
        btnUc14Br0UMTruckMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMTruck = (TextView) findViewById(R.id.txtUc14Br0UMTruck);

            @Override
            public void onClick(View v) {
                numeroUc14Br0UMTruck += 1;
                txtUc14Br0UMTruck.setText(String.valueOf(numeroUc14Br0UMTruck));
            }
        });
        btnUc14Br0UMTruckMenos = (Button) findViewById(R.id.btnUc14Br0UMTruckMenos);
        btnUc14Br0UMTruckMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMTruck = (TextView) findViewById(R.id.txtUc14Br0UMTruck);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0UMTruck > 0) {
                    numeroUc14Br0UMTruck -= 1;
                    txtUc14Br0UMTruck.setText(String.valueOf(numeroUc14Br0UMTruck));
                } else {
                    numeroUc14Br0UMTruck = 0;
                }
            }
        });


        btnUc14Br0UMCarretaMais = (Button) findViewById(R.id.btnUc14Br0UMCarretaMais);
        btnUc14Br0UMCarretaMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMCarreta = (TextView) findViewById(R.id.txtUc14Br0UMCarreta);

            @Override
            public void onClick(View v) {
                numeroUc14Br0UMCarreta += 1;
                txtUc14Br0UMCarreta.setText(String.valueOf(numeroUc14Br0UMCarreta));
            }
        });
        btnUc14Br0UMCarretaMenos = (Button) findViewById(R.id.btnUc14Br0UMCarretaMenos);
        btnUc14Br0UMCarretaMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMCarreta = (TextView) findViewById(R.id.txtUc14Br0UMCarreta);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0UMCarreta > 0) {
                    numeroUc14Br0UMCarreta -= 1;
                    txtUc14Br0UMCarreta.setText(String.valueOf(numeroUc14Br0UMCarreta));
                } else {
                    numeroUc14Br0UMCarreta = 0;
                }
            }
        });


        btnUc14Br0UMAxorMais = (Button) findViewById(R.id.btnUc14Br0UMAxorMais);
        btnUc14Br0UMAxorMais.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMAxor = (TextView) findViewById(R.id.txtUc14Br0UMAxor);

            @Override
            public void onClick(View v) {
                numeroUc14Br0UMAxor += 1;
                txtUc14Br0UMAxor.setText(String.valueOf(numeroUc14Br0UMAxor));
            }
        });
        btnUc14Br0UMAxorMenos = (Button) findViewById(R.id.btnUc14Br0UMAxorMenos);
        btnUc14Br0UMAxorMenos.setOnClickListener(new View.OnClickListener() {
            TextView txtUc14Br0UMAxor = (TextView) findViewById(R.id.txtUc14Br0UMAxor);

            @Override
            public void onClick(View v) {
                if (numeroUc14Br0UMAxor > 0) {
                    numeroUc14Br0UMAxor -= 1;
                    txtUc14Br0UMAxor.setText(String.valueOf(numeroUc14Br0UMAxor));
                } else {
                    numeroUc14Br0UMAxor = 0;
                }
            }
        });
















        //===================================================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUc14HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUc14HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUc14HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUc14HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUc14HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUc14HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUc14HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUc14HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUc14HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUc14HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUc14HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUc14HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUc14HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUc14HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUc14HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUc14HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUc14HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUc14HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUc14HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUc14HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc14Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnUc14Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Uc14Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Uc14Activity.this);
                    View view = LayoutInflater.from(Uc14Activity.this).inflate(R.layout.sinc_dialog, null);
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

            btnUc14Salvar.setVisibility(View.INVISIBLE);
            btnUc14Sincronizar.setVisibility(View.VISIBLE);
            Uc14 c14 = new Uc14(
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
            c14.setNomeEquipamento(nomeEquipamento.getText().toString());
            c14.setMotorista(motorista.getText().toString());
            c14.setData(data.getText().toString());
            c14.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            c14.setHoraFinal(horaFinal.getText().toString());
            c14.setHorimetroInicial(horimetroInicial.getText().toString());
            c14.setHorimetroFinal(horimetroFinal.getText().toString());
            c14.setParadaInicial1(paradaInicial1.getText().toString());
            c14.setParadaFinal1(paradaFinal1.getText().toString());
            c14.setDescricao1(descricao1.getSelectedItem().toString());
            c14.setParadaInicial2(paradaInicial2.getText().toString());
            c14.setParadaFinal2(paradaFinal2.getText().toString());
            c14.setDescricao2(descricao2.getSelectedItem().toString());
            c14.setParadaInicial3(paradaInicial3.getText().toString());
            c14.setParadaFinal3(paradaFinal3.getText().toString());
            c14.setDescricao3(descricao3.getSelectedItem().toString());
            c14.setParadaInicial4(paradaInicial4.getText().toString());
            c14.setParadaFinal4(paradaFinal4.getText().toString());
            c14.setDescricao4(descricao4.getSelectedItem().toString());
            c14.setParadaInicial5(paradaInicial5.getText().toString());
            c14.setParadaFinal5(paradaFinal5.getText().toString());
            c14.setDescricao5(descricao5.getSelectedItem().toString());
            c14.setParadaInicial6(paradaInicial6.getText().toString());
            c14.setParadaFinal6(paradaFinal6.getText().toString());
            c14.setDescricao6(descricao6.getSelectedItem().toString());
            c14.setParadaInicial7(paradaInicial7.getText().toString());
            c14.setParadaFinal7(paradaFinal7.getText().toString());
            c14.setDescricao7(descricao7.getSelectedItem().toString());
            c14.setParadaInicial8(paradaInicial8.getText().toString());
            c14.setParadaFinal8(paradaFinal8.getText().toString());
            c14.setDescricao8(descricao8.getSelectedItem().toString());
            c14.setParadaInicial9(paradaInicial9.getText().toString());
            c14.setParadaFinal9(paradaFinal9.getText().toString());
            c14.setDescricao9(descricao9.getSelectedItem().toString());
            c14.setParadaInicial10(paradaInicial10.getText().toString());
            c14.setParadaFinal10(paradaFinal10.getText().toString());
            c14.setDescricao10(descricao10.getSelectedItem().toString());
            c14.setB0Vol(b0Vol.getText().toString());
            c14.setB0NumViagens(b0NumViagens.getText().toString());
            c14.setB0Mot(b0Mot.getText().toString());
            c14.setB1Vol(b1Vol.getText().toString());
            c14.setB1NumViagens(b1NumViagens.getText().toString());
            c14.setB1Mot(b1Mot.getText().toString());
            c14.setB2Vol(b2Vol.getText().toString());
            c14.setB2NumViagens(b2NumViagens.getText().toString());
            c14.setB2Mot(b2Mot.getText().toString());
            c14.setB4Vol(b4Vol.getText().toString());
            c14.setB4NumViagens(b4NumViagens.getText().toString());
            c14.setB4Mot(b4Mot.getText().toString());
            c14.setAimVol(aimVol.getText().toString());
            c14.setAimNumViagens(aimNumViagens.getText().toString());
            c14.setAimMot(aimMot.getText().toString());
            c14.setAifVol(aifVol.getText().toString());
            c14.setAifNumViagens(aifNumViagens.getText().toString());
            c14.setAifMot(aifMot.getText().toString());
            c14.setBicaVol(bicaVol.getText().toString());
            c14.setBicaNumViagens(bicaNumViagens.getText().toString());
            c14.setBicaMot(bicaMot.getText().toString());


            c14.setAmprToco(amprToco.getText().toString());
            c14.setAmprTruck(amprTruck.getText().toString());
            c14.setAmprCarreta(amprCarreta.getText().toString());
            c14.setAmprAxor(amprAxor.getText().toString());
            c14.setAmprObs(amprObs.getText().toString());
            c14.setAmumToco(amumToco.getText().toString());
            c14.setAmumTruck(amumTruck.getText().toString());
            c14.setAmumCarreta(amumCarreta.getText().toString());
            c14.setAmumAxor(amumAxor.getText().toString());
            c14.setAmumObs(amumObs.getText().toString());
            c14.setAfToco(afToco.getText().toString());
            c14.setAfTruck(afTruck.getText().toString());
            c14.setAfCarreta(afCarreta.getText().toString());
            c14.setAfAxor(afAxor.getText().toString());
            c14.setPedObs(pedObs.getText().toString());
            c14.setPedToco(pedToco.getText().toString());
            c14.setPedTruck(pedTruck.getText().toString());
            c14.setPedCarreta(pedCarreta.getText().toString());
            c14.setPedAxor(pedAxor.getText().toString());
            c14.setPedObs(pedObs.getText().toString());
            c14.setBicaPrToco(bicaPrToco.getText().toString());
            c14.setBicaPrTruck(bicaPrTruck.getText().toString());
            c14.setBicaPrCarreta(bicaPrCarreta.getText().toString());
            c14.setBicaPrAxor(bicaPrAxor.getText().toString());
            c14.setBicaPrObs(bicaPrObs.getText().toString());
            c14.setBica790Toco(bica790Toco.getText().toString());
            c14.setBica790Truck(bica790Truck.getText().toString());
            c14.setBica790Carreta(bica790Carreta.getText().toString());
            c14.setBica790Axor(bica790Axor.getText().toString());
            c14.setBica790Obs(bica790Obs.getText().toString());
            c14.setBicaUmToco(bicaUmToco.getText().toString());
            c14.setBicaUmTruck(bicaUmTruck.getText().toString());
            c14.setBicaUmCarreta(bicaUmCarreta.getText().toString());
            c14.setBicaUmAxor(bicaUmAxor.getText().toString());
            c14.setBicaUmObs(bicaUmObs.getText().toString());
            c14.setBr1PrToco(br1PrToco.getText().toString());
            c14.setBr1PrTruck(br1PrTruck.getText().toString());
            c14.setBr1PrCarreta(br1PrCarreta.getText().toString());
            c14.setBr1PrAxor(br1PrAxor.getText().toString());
            c14.setBr1PrObs(br1PrObs.getText().toString());
            c14.setBr119Toco(br119Toco.getText().toString());
            c14.setBr119Truck(br119Truck.getText().toString());
            c14.setBr119Carreta(br119Carreta.getText().toString());
            c14.setBr119Axor(br119Axor.getText().toString());
            c14.setBr119Obs(br119Obs.getText().toString());
            c14.setBr0PrToco(br0PrToco.getText().toString());
            c14.setBr0PrTruck(br0PrTruck.getText().toString());
            c14.setBr0PrCarreta(br0PrCarreta.getText().toString());
            c14.setBr0PrAxor(br0PrAxor.getText().toString());
            c14.setBr0PrObs(br0PrObs.getText().toString());
            c14.setBr0UmToco(br0UmToco.getText().toString());
            c14.setBr0UmTruck(br0UmTruck.getText().toString());
            c14.setBr0UmCarreta(br0UmCarreta.getText().toString());
            c14.setBr0UmAxor(br0UmAxor.getText().toString());
            c14.setBr0UmObs(br0UmObs.getText().toString());


            final TextView txtsomaToco = findViewById(R.id.txtUc14SomaToco);
            TextView t1Toco = findViewById(R.id.txtUc14AMPrToco);
            TextView t2Toco = findViewById(R.id.txtUc14AMUMToco);
            TextView t3Toco = findViewById(R.id.txtUc14AFToco);
            TextView t4Toco = findViewById(R.id.txtUc14PedToco);
            TextView t5Toco = findViewById(R.id.txtUc14BicaPrToco);
            TextView t6Toco = findViewById(R.id.txtUc14Bica790Toco);
            TextView t7Toco = findViewById(R.id.txtUc14BicaUMToco);
            TextView t8Toco = findViewById(R.id.txtUc14Br1PrToco);
            TextView t9Toco = findViewById(R.id.txtUc14Br119Toco);
            TextView t10Toco = findViewById(R.id.txtUc14Br0PrToco);
            TextView t11Toco = findViewById(R.id.txtUc14Br0UMToco);
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





            final TextView txtsomaTruck = findViewById(R.id.txtUc14SomaTruck);
            TextView t1Truck = findViewById(R.id.txtUc14AMPrTruck);
            TextView t2Truck = findViewById(R.id.txtUc14AMUMTruck);
            TextView t3Truck = findViewById(R.id.txtUc14AFTruck);
            TextView t4Truck = findViewById(R.id.txtUc14PedTruck);
            TextView t5Truck = findViewById(R.id.txtUc14BicaPrTruck);
            TextView t6Truck = findViewById(R.id.txtUc14Bica790Truck);
            TextView t7Truck = findViewById(R.id.txtUc14BicaUMTruck);
            TextView t8Truck = findViewById(R.id.txtUc14Br1PrTruck);
            TextView t9Truck = findViewById(R.id.txtUc14Br119Truck);
            TextView t10Truck = findViewById(R.id.txtUc14Br0PrTruck);
            TextView t11Truck = findViewById(R.id.txtUc14Br0UMTruck);
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



            final TextView txtsomaCarreta = findViewById(R.id.txtUc14SomaCarreta);
            TextView t1Carreta = findViewById(R.id.txtUc14AMPrCarreta);
            TextView t2Carreta = findViewById(R.id.txtUc14AMUMCarreta);
            TextView t3Carreta = findViewById(R.id.txtUc14AFCarreta);
            TextView t4Carreta = findViewById(R.id.txtUc14PedCarreta);
            TextView t5Carreta = findViewById(R.id.txtUc14BicaPrCarreta);
            TextView t6Carreta = findViewById(R.id.txtUc14Bica790Carreta);
            TextView t7Carreta = findViewById(R.id.txtUc14BicaUMCarreta);
            TextView t8Carreta = findViewById(R.id.txtUc14Br1PrCarreta);
            TextView t9Carreta = findViewById(R.id.txtUc14Br119Carreta);
            TextView t10Carreta = findViewById(R.id.txtUc14Br0PrCarreta);
            TextView t11Carreta = findViewById(R.id.txtUc14Br0UMCarreta);
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





            final TextView txtsomaAxor = findViewById(R.id.txtUc14SomaAxor);
            TextView t1Axor = findViewById(R.id.txtUc14AMPrAxor);
            TextView t2Axor = findViewById(R.id.txtUc14AMUMAxor);
            TextView t3Axor = findViewById(R.id.txtUc14AFAxor);
            TextView t4Axor = findViewById(R.id.txtUc14PedAxor);
            TextView t5Axor = findViewById(R.id.txtUc14BicaPrAxor);
            TextView t6Axor = findViewById(R.id.txtUc14Bica790Axor);
            TextView t7Axor = findViewById(R.id.txtUc14BicaUMAxor);
            TextView t8Axor = findViewById(R.id.txtUc14Br1PrAxor);
            TextView t9Axor = findViewById(R.id.txtUc14Br119Axor);
            TextView t10Axor = findViewById(R.id.txtUc14Br0PrAxor);
            TextView t11Axor = findViewById(R.id.txtUc14Br0UMAxor);
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




            c14.setSomaToco(txtsomaToco.getText().toString());
            c14.setSomaTruck(txtsomaTruck.getText().toString());
            c14.setSomaCarreta(txtsomaCarreta.getText().toString());
            c14.setSomaAxor(txtsomaAxor.getText().toString());



            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                c14.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                c14.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                c14.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                c14.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                c14.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                c14.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                c14.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                c14.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                c14.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                c14.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                c14.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                freios.setText("Sim");
                c14.setFreios(freios.getText().toString());
            }
            if (parteEletrica.isChecked()) {
                parteEletrica.setText("Não");
                c14.setParteEletrica(parteEletrica.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                parteEletrica.setText("Sim");
                c14.setParteEletrica(parteEletrica.getText().toString());
            }

            // c14.setProdInt(prodInt.getSelectedItem().toString());
            //c14.setVol(vol.getText().toString());
            //c14.setNumViagensInt(numViagensInt.getText().toString());
            //c14.setMotProd(MotProd.getText().toString());
            //c14.setProdEstoque(prodEstoque.getSelectedItem().toString());
            //c14.setVeiculoEstoque(veiculoEstoque.getSelectedItem().toString());
            //c14.setNumViagensEstoque(numViagensEstoque.getText().toString());




            c14.setObservacoes(observacoes.getText().toString());
            long id = dao.inserir(c14);
            Toast.makeText(this, "uc14 inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // startActivity(intent);





        }
    }


    public void sincronizar(View view){

        Uc14 c14 = new Uc14(
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
        long id = dao2.inserir(c14);

        Uc14Service apiService = retrofit.create(Uc14Service.class);
        Call<Uc14> call = apiService.salvarInfoUc14(c14);

        call.enqueue(new Callback<Uc14>(){
            @Override
            public void onResponse(Call<Uc14> call, Response<Uc14> response) {
                if (response.isSuccessful()){
                    Uc14 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Uc14> call, Throwable t) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Uc14Activity.this);
        View view= LayoutInflater.from(Uc14Activity.this).inflate(R.layout.alert_dialog,null);
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
