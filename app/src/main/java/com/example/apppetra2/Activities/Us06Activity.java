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
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.apppetra2.Classes.Us06;
import com.example.apppetra2.Classes.Us36;
import com.example.apppetra2.DAO.Us06DAO;
import com.example.apppetra2.DAO.Us06DAOSync;
import com.example.apppetra2.DAO.us36DAOSync;
import com.example.apppetra2.Interfaces.Us06Service;
import com.example.apppetra2.Interfaces.Us36Service;
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

public class Us06Activity extends AppCompatActivity {



    public Button btnUs06AcudeIntMais;
    public Button btnUs06AcudeIntMenos;
    public Button btnUs06AcudeRestMais;
    public Button btnUs06AcudeRestMenos;
    public int numero=0;
    public int numero2=0;
    public Button btnUs06Cancelar;
    private EditText motorista;
    private EditText data;
    private EditText horaInicial;
    private EditText horaFinal;
    private EditText horimetroInicial;
    private EditText horimetroFinal;
    private EditText acudeInterno;
    private EditText acudeRestaurante;
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
    private CheckBox lanternagem;
    private CheckBox pneus;
    private CheckBox h2o;
    private CheckBox oleo;
    private CheckBox direcao;
    private CheckBox freios;
    private EditText observacoes;
    private TextView nomeEquipamento;
    private Us06DAO dao;
    private Us06DAOSync dao2;
    private Retrofit retrofit;
    private Button btnsincronizar;
    private Button btnUs06Salvar;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us06);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUs06Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.100.58:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUs06Data);
        horaInicial=findViewById(R.id.txtUs06HI);
        horaFinal=findViewById(R.id.txtUs06HF);
        horimetroInicial=findViewById(R.id.txtUs06HoriInicial);
        horimetroFinal=findViewById(R.id.txtUs06HoriFinal);
        acudeInterno=findViewById(R.id.txtUs06AcudeInt);
        acudeRestaurante=findViewById(R.id.txtUs06AcudeRest);
        paradaInicial1=findViewById(R.id.txtPEUs06HI1);
        paradaFinal1=findViewById(R.id.txtPEUs06HF1);
        descricao1=findViewById(R.id.spPEUs06Desc1);
        paradaInicial2=findViewById(R.id.txtPEUs06HI2);
        paradaFinal2=findViewById(R.id.txtPEUs06HF2);
        descricao2=findViewById(R.id.spPEUs06Desc2);
        paradaInicial3=findViewById(R.id.txtPEUs06HI3);
        paradaFinal3=findViewById(R.id.txtPEUs06HF3);
        descricao3=findViewById(R.id.spPEUs06Desc3);
        paradaInicial4=findViewById(R.id.txtPEUs06HI4);
        paradaFinal4=findViewById(R.id.txtPEUs06HF4);
        descricao4=findViewById(R.id.spPEUs06Desc4);
        paradaInicial5=findViewById(R.id.txtPEUs06HI5);
        paradaFinal5=findViewById(R.id.txtPEUs06HF5);
        descricao5=findViewById(R.id.spPEUs06Desc5);
        paradaInicial6=findViewById(R.id.txtPEUs06HI6);
        paradaFinal6=findViewById(R.id.txtPEUs06HF6);
        descricao6=findViewById(R.id.spPEUs06Desc6);
        lanternagem=findViewById(R.id.chkUs06Lant);
        pneus=findViewById(R.id.chkUs06Pn);
        h2o=findViewById(R.id.chkUs06H2O);
        oleo=findViewById(R.id.chkUs06Ol);
        direcao=findViewById(R.id.chkUs06Dir);
        freios=findViewById(R.id.chkUs06Fr);
        observacoes=findViewById(R.id.txtUs06Obs);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUs06);
        dao=new Us06DAO(this);
        dao2 = new Us06DAOSync(this);
        btnsincronizar = findViewById(R.id.btnUs06Sinc);
        btnUs06Salvar= findViewById(R.id.btnUs06Save);
        btnsincronizar.setVisibility(View.INVISIBLE);


        Spinner spPEUs06Desc1= findViewById(R.id.spPEUs06Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc1.setAdapter(adapterDesc);

        Spinner spPEUs06Desc2= findViewById(R.id.spPEUs06Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc2.setAdapter(adapterDesc2);


        Spinner spPEUs06Desc3= findViewById(R.id.spPEUs06Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc3.setAdapter(adapterDesc3);


        Spinner spPEUs06Desc4= findViewById(R.id.spPEUs06Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc4.setAdapter(adapterDesc4);




        Spinner spPEUs06Desc5= findViewById(R.id.spPEUs06Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc5.setAdapter(adapterDesc5);





        Spinner spPEUs06Desc6= findViewById(R.id.spPEUs06Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUs06Desc6.setAdapter(adapterDesc6);




        TextView Us06HI=(TextView)findViewById(R.id.txtUs06HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        Us06HI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUs06Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);




        btnUs06Cancelar= findViewById(R.id.btnUs06Cancel);
        btnUs06Cancelar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Us06Activity.this);
                View view= LayoutInflater.from(Us06Activity.this).inflate(R.layout.alert_dialog,null);
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





        btnUs06AcudeIntMais = (Button) findViewById(R.id.btnUs06NTanqueIntMais);
        btnUs06AcudeIntMais.setOnClickListener(new OnClickListener() {
            TextView txtUs06AcudeInt = (TextView) findViewById(R.id.txtUs06AcudeInt);

            @Override
            public void onClick(View v) {
                numero += 1;
                txtUs06AcudeInt.setText(String.valueOf(numero));
            }
        });
        btnUs06AcudeIntMenos = (Button) findViewById(R.id.btnUs06NTanqueIntMenos);
        btnUs06AcudeIntMenos.setOnClickListener(new OnClickListener() {
            TextView txtUs06AcudeInt = (TextView) findViewById(R.id.txtUs06AcudeInt);

            @Override
            public void onClick(View v) {
                if (numero > 0) {
                    numero -= 1;
                    txtUs06AcudeInt.setText(String.valueOf(numero));
                } else {
                    numero = 0;
                }
            }
        });



        btnUs06AcudeRestMais = (Button) findViewById(R.id.btnUs06NTanqueRestMais);
        btnUs06AcudeRestMais.setOnClickListener(new OnClickListener() {
            TextView txtUs06AcudeRest = (TextView) findViewById(R.id.txtUs06AcudeRest);

            @Override
            public void onClick(View v) {
                numero2 += 1;
                txtUs06AcudeRest.setText(String.valueOf(numero2));
            }
        });
        btnUs06AcudeRestMenos = (Button) findViewById(R.id.btnUs06NTanqueRestMenos);
        btnUs06AcudeRestMenos.setOnClickListener(new OnClickListener() {
            TextView txtUs06AcudeRest = (TextView) findViewById(R.id.txtUs06AcudeRest);

            @Override
            public void onClick(View v) {
                if (numero2 > 0) {
                    numero2 -= 1;
                    txtUs06AcudeRest.setText(String.valueOf(numero2));
                } else {
                    numero2 = 0;
                }
            }
        });

//===========================================================================================================================================

        //PARADA DE EQUIPAMENTO INÍCIO 01

        paradaInicial1 = findViewById(R.id.txtPEUs06HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUs06HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUs06HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUs06HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUs06HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUs06HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });
//================================================================================================================================================================



        //PARADA DE EQUIPAMENTO FIM 01
        paradaFinal1 = findViewById(R.id.txtPEUs06HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUs06HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUs06HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUs06HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUs06HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUs06HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Us06Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnsincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Us06Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Us06Activity.this);
                    View view = LayoutInflater.from(Us06Activity.this).inflate(R.layout.sinc_dialog, null);
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
            btnUs06Salvar.setVisibility(View.INVISIBLE);
            btnsincronizar.setVisibility(View.VISIBLE);

            Us06 s06 = new Us06(
                    nomeEquipamento.getText().toString(),
                    motorista.getText().toString(),
                    data.getText().toString(),
            horaInicial.getText().toString(),
            horaFinal.getText().toString(),
            horimetroInicial.getText().toString(),
            horimetroFinal.getText().toString(),
            acudeInterno.getText().toString(),
            acudeRestaurante.getText().toString(),
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
            lanternagem.getText().toString(),
            pneus.getText().toString(),
            h2o.getText().toString(),
            oleo.getText().toString(),
            direcao.getText().toString(),
            freios.getText().toString(),
            observacoes.getText().toString()
            );
            s06.setNomeEquipamento(nomeEquipamento.getText().toString());
            s06.setMotorista(motorista.getText().toString());
            s06.setData(data.getText().toString());
            s06.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            s06.setHoraFinal(horaFinal.getText().toString());
            s06.setHorimetroInicial(horimetroInicial.getText().toString());

            s06.setHorimetroFinal(horimetroFinal.getText().toString());
            s06.setAcudeInterno(acudeInterno.getText().toString());
            s06.setAcudeRestaurante(acudeRestaurante.getText().toString());
            s06.setParadaInicial1(paradaInicial1.getText().toString());
            s06.setParadaFinal1(paradaFinal1.getText().toString());
            s06.setDescricao1(descricao1.getSelectedItem().toString());
            s06.setParadaInicial2(paradaInicial2.getText().toString());
            s06.setParadaFinal2(paradaFinal2.getText().toString());
            s06.setDescricao2(descricao2.getSelectedItem().toString());
            s06.setParadaInicial3(paradaInicial3.getText().toString());
            s06.setParadaFinal3(paradaFinal3.getText().toString());
            s06.setDescricao3(descricao3.getSelectedItem().toString());
            s06.setParadaInicial4(paradaInicial4.getText().toString());
            s06.setParadaFinal4(paradaFinal4.getText().toString());
            s06.setDescricao4(descricao4.getSelectedItem().toString());
            s06.setParadaInicial5(paradaInicial5.getText().toString());
            s06.setParadaFinal5(paradaFinal5.getText().toString());
            s06.setDescricao5(descricao5.getSelectedItem().toString());
            s06.setParadaInicial6(paradaInicial6.getText().toString());
            s06.setParadaFinal6(paradaFinal6.getText().toString());
            s06.setDescricao6(descricao6.getSelectedItem().toString());
            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                s06.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                s06.setLanternagem(lanternagem.getText().toString());
            }
            if (pneus.isChecked()) {
                pneus.setText("Não");
                s06.setPneus(pneus.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagemernagem.getText().toString()));
            } else {
                pneus.setText("Sim");
                s06.setPneus(pneus.getText().toString());
            }
            if (h2o.isChecked()) {
                h2o.setText("Não");
                s06.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagemernagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                s06.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                s06.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagemernagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                s06.setOleo(oleo.getText().toString());
            }
            if (direcao.isChecked()) {
                direcao.setText("Não");
                s06.setDirecao(direcao.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagemernagem.getText().toString()));
            } else {
                direcao.setText("Sim");
                s06.setDirecao(direcao.getText().toString());
            }
            if (freios.isChecked()) {
                freios.setText("Não");
                s06.setFreios(freios.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagemernagem.getText().toString()));
            } else {
                freios.setText("Sim");
                s06.setFreios(freios.getText().toString());
            }
            s06.setObservacoes(observacoes.getText().toString());

            long id = dao.inserir(s06);
            Toast.makeText(this, "us06 inserido com id: " + id, Toast.LENGTH_SHORT).show();




        }

    }










    public void sincronizar(View view) {

        Us06 s06 = new Us06(
                nomeEquipamento.getText().toString(),
                motorista.getText().toString(),
                data.getText().toString(),
                horaInicial.getText().toString(),
                horaFinal.getText().toString(),
                horimetroInicial.getText().toString(),
                horimetroFinal.getText().toString(),
                acudeInterno.getText().toString(),
                acudeRestaurante.getText().toString(),
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
                lanternagem.getText().toString(),
                pneus.getText().toString(),
                h2o.getText().toString(),
                oleo.getText().toString(),
                direcao.getText().toString(),
                freios.getText().toString(),
                observacoes.getText().toString()
        );


        long id = dao2.sincronizar(s06);
        Us06Service apiService = retrofit.create(Us06Service.class);
        Call<Us06> call = apiService.salvarInfoUs06(s06);

        call.enqueue(new Callback<Us06>(){
            @Override
            public void onResponse(Call<Us06> call, Response<Us06> response) {
                if (response.isSuccessful()){
                    Us06 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Us06> call, Throwable t) {

            }
        });
    }




    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Us06Activity.this);
        View view= LayoutInflater.from(Us06Activity.this).inflate(R.layout.alert_dialog,null);
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //Toast.makeText(Us06Activity.this,"ok", Toast.LENGTH_SHORT).show();
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
