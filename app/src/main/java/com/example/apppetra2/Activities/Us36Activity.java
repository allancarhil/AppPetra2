package com.example.apppetra2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apppetra2.Classes.Us36;
import com.example.apppetra2.DAO.us36DAO;
import com.example.apppetra2.DAO.us36DAOSync;
import com.example.apppetra2.Interfaces.Us36Service;
import com.example.apppetra2.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Us36Activity extends AppCompatActivity {

    public Button btnUs36Cancelar;
    public Button btnUs36Salvar;
    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText kmInicial;
    private EditText kmFinal;
    private EditText servicos;
    private EditText observacoes;
    private CheckBox lanternagem;
    private CheckBox pneus;
    private us36DAO dao;
    private us36DAOSync dao2;
    private Retrofit retrofit;
    private Button btnsincronizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us36);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUs36Mot);
                motorista.setText(name);

            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();

        }


        data = findViewById(R.id.txtUs36Data);
        horaInicial = findViewById(R.id.txtUs36HI);
        horaFinal = findViewById(R.id.txtUs36HF);
        kmInicial = findViewById(R.id.txtUs36KI);
        kmFinal = findViewById(R.id.txtUs36KF);
        servicos = findViewById(R.id.txtUs36Servicos);
        observacoes = findViewById(R.id.txtUs36Obs);
        lanternagem = findViewById(R.id.chkUs36Lant);
        pneus = findViewById(R.id.chkUs36Pn);
        dao = new us36DAO(this);
        dao2 = new us36DAOSync(this);
        btnsincronizar = findViewById(R.id.btnUs36Sinc);
        btnUs36Salvar= findViewById(R.id.btnUs36Save);
        btnsincronizar.setVisibility(View.INVISIBLE);
        String pneus2 = pneus.getText().toString();
        String lant = lanternagem.getText().toString();

        TextView Us36HI = (TextView) findViewById(R.id.txtUs36HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        Us36HI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUs36Data);
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentData = sdf.format(d);
        data.setText(currentData);


        btnUs36Cancelar = findViewById(R.id.btnUs36Cancel);
        btnUs36Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Us36Activity.this);
                View view = LayoutInflater.from(Us36Activity.this).inflate(R.layout.alert_dialog, null);
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

        btnsincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Us36Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                     //Closing all the Activities, clear the back stack.
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                       startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Us36Activity.this);
                    View view = LayoutInflater.from(Us36Activity.this).inflate(R.layout.sinc_dialog, null);
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
        CharSequence str = kmFinal.getText().toString();
        return TextUtils.isEmpty(str);
    }


    public void salvar(View view) {


        if (isEmpty(kmFinal) || kmFinal.getText().toString().trim().length() == 0) {
            kmFinal.setError("CAMPO OBRIGATÓRIO");
            kmFinal.requestFocus();
        } else {

            btnUs36Salvar.setVisibility(View.INVISIBLE);

            btnsincronizar.setVisibility(View.VISIBLE);
            Us36 u36 = new Us36(
                    motorista.getText().toString(),
                    data.getText().toString(),
                    horaInicial.getText().toString(),
                    horaFinal.getText().toString(),
                    kmInicial.getText().toString(),
                    kmFinal.getText().toString(),
                    servicos.getText().toString(),
                    observacoes.getText().toString(),
                    lanternagem.getText().toString(),
                    pneus.getText().toString());


            u36.setMotorista(motorista.getText().toString());
            u36.setData(data.getText().toString());
            u36.setHoraInicial(horaInicial.getText().toString());

            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            u36.setHoraFinal(horaFinal.getText().toString());
            u36.setkmInicial(kmInicial.getText().toString());
            u36.setkmFinal(kmFinal.getText().toString());
            u36.setServicos(servicos.getText().toString());
            u36.setObservacoes(observacoes.getText().toString());
            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                u36.setLanternagem(lanternagem.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                lanternagem.setText("Sim");
                u36.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                u36.setPneus(pneus.getText().toString());
            } else {
                pneus.setText("Sim");
                u36.setPneus(pneus.getText().toString());
            }
            long id = dao.inserir(u36);
            Toast.makeText(this, "us36 inserido com id: " + id, Toast.LENGTH_SHORT).show();

            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);

            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // startActivity(intent);

        }


    }





    public void sincronizar(View view) {

        Us36 u36 = new Us36(
                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                kmInicial.getText().toString(),
                kmFinal.getText().toString(),
                servicos.getText().toString(),
                observacoes.getText().toString(),
                lanternagem.getText().toString(),
                pneus.getText().toString());

        long id = dao2.sincronizar(u36);
        Us36Service apiService = retrofit.create(Us36Service.class);
        Call<Us36> call = apiService.salvarInfoUs36(u36);

        call.enqueue(new Callback<Us36>() {
            @Override
            public void onResponse(Call<Us36> call, Response<Us36> response) {
                if (response.isSuccessful()) {
                    Us36 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Us36> call, Throwable t) {

            }
        });
    }






    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Us36Activity.this);
        View view = LayoutInflater.from(Us36Activity.this).inflate(R.layout.alert_dialog, null);
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

