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

import com.example.apppetra2.Classes.Ub02;
import com.example.apppetra2.DAO.Ub02DAO;
import com.example.apppetra2.DAO.Ub02DAOSync;
import com.example.apppetra2.Interfaces.Ub02Service;
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


public class Ub02Activity extends AppCompatActivity {

   private Button btnUb02Salvar;
   private Button btnUb02Sincronizar;
    public Button btnUb02Cancelar;
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
    private CheckBox pedraBritador;
    private CheckBox tremonha;
    private CheckBox bandeja;
    private CheckBox utc01;
    private EditText observacoes;
    private EditText balancaInicial;
    private EditText balancaFinal;
    private Ub02DAO dao;
    private Ub02DAOSync dao2;
    private Retrofit retrofit;
    private TextView nomeEquipamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ub02);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUb02Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUb02Data);
        horaInicial=findViewById(R.id.txtUb02HI);
        horaFinal=findViewById(R.id.txtUb02HF);
        horimetroInicial=findViewById(R.id.txtUb02HoriI);
        horimetroFinal=findViewById(R.id.txtUb02HoriF);
        paradaInicial1=findViewById(R.id.txtPEUb02HI1);
        paradaFinal1=findViewById(R.id.txtPEUb02HF1);
        descricao1=findViewById(R.id.spPEUb02Desc1);
        paradaInicial2=findViewById(R.id.txtPEUb02HI2);
        paradaFinal2=findViewById(R.id.txtPEUb02HF2);
        descricao2=findViewById(R.id.spPEUb02Desc2);
        paradaInicial3=findViewById(R.id.txtPEUb02HI3);
        paradaFinal3=findViewById(R.id.txtPEUb02HF3);
        descricao3=findViewById(R.id.spPEUb02Desc3);
        paradaInicial4=findViewById(R.id.txtPEUb02HI4);
        paradaFinal4=findViewById(R.id.txtPEUb02HF4);
        descricao4=findViewById(R.id.spPEUb02Desc4);
        paradaInicial5=findViewById(R.id.txtPEUb02HI5);
        paradaFinal5=findViewById(R.id.txtPEUb02HF5);
        descricao5=findViewById(R.id.spPEUb02Desc5);
        paradaInicial6=findViewById(R.id.txtPEUb02HI6);
        paradaFinal6=findViewById(R.id.txtPEUb02HF6);
        descricao6=findViewById(R.id.spPEUb02Desc6);
        paradaInicial7=findViewById(R.id.txtPEUb02HI7);
        paradaFinal7=findViewById(R.id.txtPEUb02HF7);
        descricao7=findViewById(R.id.spPEUb02Desc7);
        paradaInicial8=findViewById(R.id.txtPEUb02HI8);
        paradaFinal8=findViewById(R.id.txtPEUb02HF8);
        descricao8=findViewById(R.id.spPEUb02Desc8);
        paradaInicial9=findViewById(R.id.txtPEUb02HI9);
        paradaFinal9=findViewById(R.id.txtPEUb02HF9);
        descricao9=findViewById(R.id.spPEUb02Desc9);
        paradaInicial10=findViewById(R.id.txtPEUb02HI10);
        paradaFinal10=findViewById(R.id.txtPEUb02HF10);
        descricao10=findViewById(R.id.spPEUb02Desc10);
        pedraBritador=findViewById(R.id.chkUb02PedraBritador);
        tremonha=findViewById(R.id.chkUb02Tremonha);
        bandeja=findViewById(R.id.chkUb02Bandeja);
        utc01=findViewById(R.id.chkUb02UTC01);
        observacoes=findViewById(R.id.txtUb02Obs);
        balancaInicial=findViewById(R.id.txtUb02BalIni);
        balancaFinal=findViewById(R.id.txtUb02BalFin);
        dao=new Ub02DAO(this);
        dao2=new Ub02DAOSync(this);
        btnUb02Salvar=findViewById(R.id.btnUb02Save);
        btnUb02Sincronizar=findViewById(R.id.btnUb02Sincronizar);
        btnUb02Sincronizar.setVisibility(View.INVISIBLE);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUb02);


        Spinner spPEUb02Desc1= findViewById(R.id.spPEUb02Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc1.setAdapter(adapterDesc);

        Spinner spPEUb02Desc2= findViewById(R.id.spPEUb02Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc2.setAdapter(adapterDesc2);


        Spinner spPEUb02Desc3= findViewById(R.id.spPEUb02Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc3.setAdapter(adapterDesc3);


        Spinner spPEUb02Desc4= findViewById(R.id.spPEUb02Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc4.setAdapter(adapterDesc4);




        Spinner spPEUb02Desc5= findViewById(R.id.spPEUb02Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc5.setAdapter(adapterDesc5);




        Spinner spPEUb02Desc6= findViewById(R.id.spPEUb02Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc6.setAdapter(adapterDesc6);



        Spinner spPEUb02Desc7= findViewById(R.id.spPEUb02Desc7);
        ArrayAdapter<CharSequence> adapterDesc7=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc7.setAdapter(adapterDesc7);



        Spinner spPEUb02Desc8= findViewById(R.id.spPEUb02Desc8);
        ArrayAdapter<CharSequence> adapterDesc8=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc8.setAdapter(adapterDesc8);




        Spinner spPEUb02Desc9= findViewById(R.id.spPEUb02Desc9);
        ArrayAdapter<CharSequence> adapterDesc9=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc9.setAdapter(adapterDesc9);



        Spinner spPEUb02Desc10= findViewById(R.id.spPEUb02Desc10);
        ArrayAdapter<CharSequence> adapterDesc10=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUb02Desc10.setAdapter(adapterDesc10);


        TextView  horaI = (TextView) findViewById(R.id.txtUb02HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUb02Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);




        btnUb02Cancelar= findViewById(R.id.btnUb02Cancel);
        btnUb02Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Ub02Activity.this);
                View view= LayoutInflater.from(Ub02Activity.this).inflate(R.layout.alert_dialog,null);
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

        paradaInicial1 = findViewById(R.id.txtPEUb02HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUb02HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUb02HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUb02HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUb02HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUb02HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUb02HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUb02HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUb02HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUb02HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUb02HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUb02HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUb02HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUb02HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUb02HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUb02HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUb02HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUb02HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUb02HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUb02HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Ub02Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        btnUb02Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Ub02Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Ub02Activity.this);
                    View view = LayoutInflater.from(Ub02Activity.this).inflate(R.layout.sinc_dialog, null);
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
            btnUb02Salvar.setVisibility(View.INVISIBLE);
            btnUb02Sincronizar.setVisibility(View.VISIBLE);
            Ub02 b02 = new Ub02(
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
            pedraBritador.getText().toString(),
            tremonha.getText().toString(),
            bandeja.getText().toString(),
            utc01.getText().toString(),
            observacoes.getText().toString(),
            balancaInicial.getText().toString(),
            balancaFinal.getText().toString()
            );
            b02.setNomeEquipamento(nomeEquipamento.getText().toString());
            b02.setMotorista(motorista.getText().toString());
            b02.setData(data.getText().toString());
            b02.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            b02.setHoraFinal(horaFinal.getText().toString());
            b02.setHorimetroInicial(horimetroInicial.getText().toString());
            b02.setHorimetroFinal(horimetroFinal.getText().toString());
            b02.setParadaInicial1(paradaInicial1.getText().toString());
            b02.setParadaFinal1(paradaFinal1.getText().toString());
            b02.setDescricao1(descricao1.getSelectedItem().toString());
            b02.setParadaInicial2(paradaInicial2.getText().toString());
            b02.setParadaFinal2(paradaFinal2.getText().toString());
            b02.setDescricao2(descricao2.getSelectedItem().toString());
            b02.setParadaInicial3(paradaInicial3.getText().toString());
            b02.setParadaFinal3(paradaFinal3.getText().toString());
            b02.setDescricao3(descricao3.getSelectedItem().toString());
            b02.setParadaInicial4(paradaInicial4.getText().toString());
            b02.setParadaFinal4(paradaFinal4.getText().toString());
            b02.setDescricao4(descricao4.getSelectedItem().toString());
            b02.setParadaInicial5(paradaInicial5.getText().toString());
            b02.setParadaFinal5(paradaFinal5.getText().toString());
            b02.setDescricao5(descricao5.getSelectedItem().toString());
            b02.setParadaInicial6(paradaInicial6.getText().toString());
            b02.setParadaFinal6(paradaFinal6.getText().toString());
            b02.setDescricao6(descricao6.getSelectedItem().toString());
            b02.setParadaInicial7(paradaInicial7.getText().toString());
            b02.setParadaFinal7(paradaFinal7.getText().toString());
            b02.setDescricao7(descricao7.getSelectedItem().toString());
            b02.setParadaInicial8(paradaInicial8.getText().toString());
            b02.setParadaFinal8(paradaFinal8.getText().toString());
            b02.setDescricao8(descricao8.getSelectedItem().toString());
            b02.setParadaInicial9(paradaInicial9.getText().toString());
            b02.setParadaFinal9(paradaFinal9.getText().toString());
            b02.setDescricao9(descricao9.getSelectedItem().toString());
            b02.setParadaInicial10(paradaInicial10.getText().toString());
            b02.setParadaFinal10(paradaFinal10.getText().toString());
            if (pedraBritador.isChecked()) {
                pedraBritador.setText("Não");
                b02.setPedraBritador(pedraBritador.getText().toString());
            } else {
                pedraBritador.setText("Sim");
                b02.setPedraBritador(pedraBritador.getText().toString());
            }

            if (tremonha.isChecked()) {
                tremonha.setText("Não");
                b02.setTremonha(tremonha.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                tremonha.setText("Sim");
                b02.setTremonha(tremonha.getText().toString());
            }
            if (bandeja.isChecked()) {
                bandeja.setText("Não");
                b02.setBandeja(bandeja.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                bandeja.setText("Sim");
                b02.setBandeja(bandeja.getText().toString());
            }
            if (utc01.isChecked()) {
                utc01.setText("Não");
                b02.setUtc01(utc01.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                utc01.setText("Sim");
                b02.setUtc01(utc01.getText().toString());
            }
            b02.setBalancaInicial(balancaInicial.getText().toString());
            b02.setBalancaFinal(balancaFinal.getText().toString());
            b02.setObservacoes(observacoes.getText().toString());

            long id = dao.inserir(b02);
            Toast.makeText(this, "ub02 inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
// Closing all the Activities, clear the back stack.
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //startActivity(intent);



        }
    }


    public void sincronizar(View view){
        Ub02 b02 = new Ub02(
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
                pedraBritador.getText().toString(),
                tremonha.getText().toString(),
                bandeja.getText().toString(),
                utc01.getText().toString(),
                observacoes.getText().toString(),
                balancaInicial.getText().toString(),
                balancaFinal.getText().toString()
        );
        long id = dao2.inserir(b02);
        Ub02Service apiService = retrofit.create(Ub02Service.class);
        Call<Ub02> call = apiService.salvarInfoUb02(b02);

        call.enqueue(new Callback<Ub02>(){
            @Override
            public void onResponse(Call<Ub02> call, Response<Ub02> response) {
                if (response.isSuccessful()){
                    Ub02 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Ub02> call, Throwable t) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Ub02Activity.this);
        View view= LayoutInflater.from(Ub02Activity.this).inflate(R.layout.alert_dialog,null);
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
