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

import com.example.apppetra2.Classes.Uc13;
import com.example.apppetra2.Classes.Uc13;
import com.example.apppetra2.DAO.Uc13DAO;
import com.example.apppetra2.DAO.Uc13DAOSync;
import com.example.apppetra2.DAO.Uc13DAO;
import com.example.apppetra2.Interfaces.Uc13Service;
import com.example.apppetra2.Interfaces.Uc13Service;
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


public class Uc13Activity extends AppCompatActivity {

    private Button btnUc13Salvar;
    private Button btnUC11Sincronizar;
    private TextView nomeEquipamento;

    public Button btnUc13Cancelar;
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
    private CheckBox h2o;
    private CheckBox oleo;
    private CheckBox hidraulico;
    private EditText observacoes;
    private Uc13DAO dao;
    private Uc13DAOSync dao2;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc13);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Intent intent2 = getIntent();
        if (intent2.hasExtra("NAME")) {
            Bundle b = getIntent().getExtras();
            if (!b.getString("NAME").equals(null)) {
                String name = b.getString("NAME");
                motorista = findViewById(R.id.txtUc13Mot);
                motorista.setText(name);
            }
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.246:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        data=findViewById(R.id.txtUc13Data);
        horaInicial=findViewById(R.id.txtUc13HI);
        horaFinal=findViewById(R.id.txtUc13HF);
        horimetroInicial=findViewById(R.id.txtUc13HoriI);
        horimetroFinal=findViewById(R.id.txtUc13HoriF);
        paradaInicial1=findViewById(R.id.txtPEUc13HI1);
        paradaFinal1=findViewById(R.id.txtPEUc13HF1);
        descricao1=findViewById(R.id.spPEUc13Desc1);
        paradaInicial2=findViewById(R.id.txtPEUc13HI2);
        paradaFinal2=findViewById(R.id.txtPEUc13HF2);
        descricao2=findViewById(R.id.spPEUc13Desc2);
        paradaInicial3=findViewById(R.id.txtPEUc13HI3);
        paradaFinal3=findViewById(R.id.txtPEUc13HF3);
        descricao3=findViewById(R.id.spPEUc13Desc3);
        paradaInicial4=findViewById(R.id.txtPEUc13HI4);
        paradaFinal4=findViewById(R.id.txtPEUc13HF4);
        descricao4=findViewById(R.id.spPEUc13Desc4);
        paradaInicial5=findViewById(R.id.txtPEUc13HI5);
        paradaFinal5=findViewById(R.id.txtPEUc13HF5);
        descricao5=findViewById(R.id.spPEUc13Desc5);
        paradaInicial6=findViewById(R.id.txtPEUc13HI6);
        paradaFinal6=findViewById(R.id.txtPEUc13HF6);
        descricao6=findViewById(R.id.spPEUc13Desc6);
        paradaInicial7=findViewById(R.id.txtPEUc13HI7);
        paradaFinal7=findViewById(R.id.txtPEUc13HF7);
        descricao7=findViewById(R.id.spPEUc13Desc7);
        paradaInicial8=findViewById(R.id.txtPEUc13HI8);
        paradaFinal8=findViewById(R.id.txtPEUc13HF8);
        descricao8=findViewById(R.id.spPEUc13Desc8);
        paradaInicial9=findViewById(R.id.txtPEUc13HI9);
        paradaFinal9=findViewById(R.id.txtPEUc13HF9);
        descricao9=findViewById(R.id.spPEUc13Desc9);
        paradaInicial10=findViewById(R.id.txtPEUc13HI10);
        paradaFinal10=findViewById(R.id.txtPEUc13HF10);
        descricao10=findViewById(R.id.spPEUc13Desc10);
        lanternagem=findViewById(R.id.chkUc13Lant);
        h2o=findViewById(R.id.chkUc13H2O);
        oleo=findViewById(R.id.chkUc13Ol);
        hidraulico=findViewById(R.id.chkUc13Hidra);
        observacoes=findViewById(R.id.txtUc13Obs);
        nomeEquipamento=findViewById(R.id.txtNomeEquipamentoUc13);

        dao=new Uc13DAO(this);
        dao2=new Uc13DAOSync(this);
        btnUc13Salvar=findViewById(R.id.btnUc13Save);
        btnUC11Sincronizar=findViewById(R.id.btnUc13Sincronizar);
        btnUC11Sincronizar.setVisibility(View.INVISIBLE);

        Spinner spPEUc13Desc1= findViewById(R.id.spPEUc13Desc1);
        ArrayAdapter<CharSequence> adapterDesc=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc1.setAdapter(adapterDesc);

        Spinner spPEUc13Desc2= findViewById(R.id.spPEUc13Desc2);
        ArrayAdapter<CharSequence> adapterDesc2=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc2.setAdapter(adapterDesc2);


        Spinner spPEUc13Desc3= findViewById(R.id.spPEUc13Desc3);
        ArrayAdapter<CharSequence> adapterDesc3=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc3.setAdapter(adapterDesc3);


        Spinner spPEUc13Desc4= findViewById(R.id.spPEUc13Desc4);
        ArrayAdapter<CharSequence> adapterDesc4=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc4.setAdapter(adapterDesc4);




        Spinner spPEUc13Desc5= findViewById(R.id.spPEUc13Desc5);
        ArrayAdapter<CharSequence> adapterDesc5=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc5.setAdapter(adapterDesc5);




        Spinner spPEUc13Desc6= findViewById(R.id.spPEUc13Desc6);
        ArrayAdapter<CharSequence> adapterDesc6=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc6.setAdapter(adapterDesc6);



        Spinner spPEUc13Desc7= findViewById(R.id.spPEUc13Desc7);
        ArrayAdapter<CharSequence> adapterDesc7=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc7.setAdapter(adapterDesc7);



        Spinner spPEUc13Desc8= findViewById(R.id.spPEUc13Desc8);
        ArrayAdapter<CharSequence> adapterDesc8=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc8.setAdapter(adapterDesc8);




        Spinner spPEUc13Desc9= findViewById(R.id.spPEUc13Desc9);
        ArrayAdapter<CharSequence> adapterDesc9=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc9.setAdapter(adapterDesc9);



        Spinner spPEUc13Desc10= findViewById(R.id.spPEUc13Desc10);
        ArrayAdapter<CharSequence> adapterDesc10=ArrayAdapter.createFromResource(this,R.array.descricao, android.R.layout.simple_spinner_item);
        adapterDesc10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPEUc13Desc10.setAdapter(adapterDesc10);


        TextView horaI=(TextView)findViewById(R.id.txtUc13HI);
        horaI = (TextView) findViewById(R.id.txtUc13HI);
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        horaI.setText(currentDateTimeString);


        TextView data = (TextView) findViewById(R.id.txtUc13Data);
        Date d= Calendar.getInstance().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String currentData=sdf.format(d);
        data.setText(currentData);





        btnUc13Cancelar= findViewById(R.id.btnUc13Cancel);
        btnUc13Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Uc13Activity.this);
                View view= LayoutInflater.from(Uc13Activity.this).inflate(R.layout.alert_dialog,null);
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

        paradaInicial1 = findViewById(R.id.txtPEUc13HI1);
        paradaInicial1.setFocusableInTouchMode(false);
        paradaInicial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 02
        paradaInicial2 = findViewById(R.id.txtPEUc13HI2);
        paradaInicial2.setFocusableInTouchMode(false);
        paradaInicial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 03
        paradaInicial3 = findViewById(R.id.txtPEUc13HI3);
        paradaInicial3.setFocusableInTouchMode(false);
        paradaInicial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 04
        paradaInicial4 = findViewById(R.id.txtPEUc13HI4);
        paradaInicial4.setFocusableInTouchMode(false);
        paradaInicial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 05
        paradaInicial5 = findViewById(R.id.txtPEUc13HI5);
        paradaInicial5.setFocusableInTouchMode(false);
        paradaInicial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 06
        paradaInicial6 = findViewById(R.id.txtPEUc13HI6);
        paradaInicial6.setFocusableInTouchMode(false);
        paradaInicial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 07
        paradaInicial7 = findViewById(R.id.txtPEUc13HI7);
        paradaInicial7.setFocusableInTouchMode(false);
        paradaInicial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 08
        paradaInicial8 = findViewById(R.id.txtPEUc13HI8);
        paradaInicial8.setFocusableInTouchMode(false);
        paradaInicial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 09
        paradaInicial9 = findViewById(R.id.txtPEUc13HI9);
        paradaInicial9.setFocusableInTouchMode(false);
        paradaInicial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaInicial9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO INÍCIO 10
        paradaInicial10 = findViewById(R.id.txtPEUc13HI10);
        paradaInicial10.setFocusableInTouchMode(false);
        paradaInicial10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
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
        paradaFinal1 = findViewById(R.id.txtPEUc13HF1);
        paradaFinal1.setFocusableInTouchMode(false);
        paradaFinal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal1.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });

        //PARADA DE EQUIPAMENTO FIM 02
        paradaFinal2 = findViewById(R.id.txtPEUc13HF2);
        paradaFinal2.setFocusableInTouchMode(false);
        paradaFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal2.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 03
        paradaFinal3 = findViewById(R.id.txtPEUc13HF3);
        paradaFinal3.setFocusableInTouchMode(false);
        paradaFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal3.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 04
        paradaFinal4 = findViewById(R.id.txtPEUc13HF4);
        paradaFinal4.setFocusableInTouchMode(false);
        paradaFinal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal4.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 05
        paradaFinal5 = findViewById(R.id.txtPEUc13HF5);
        paradaFinal5.setFocusableInTouchMode(false);
        paradaFinal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal5.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 06
        paradaFinal6 = findViewById(R.id.txtPEUc13HF6);
        paradaFinal6.setFocusableInTouchMode(false);
        paradaFinal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal6.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 07
        paradaFinal7 = findViewById(R.id.txtPEUc13HF7);
        paradaFinal7.setFocusableInTouchMode(false);
        paradaFinal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal7.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 08
        paradaFinal8 = findViewById(R.id.txtPEUc13HF8);
        paradaFinal8.setFocusableInTouchMode(false);
        paradaFinal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal8.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 09
        paradaFinal9 = findViewById(R.id.txtPEUc13HF9);
        paradaFinal9.setFocusableInTouchMode(false);
        paradaFinal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal9.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });


        //PARADA DE EQUIPAMENTO FIM 10
        paradaFinal10 = findViewById(R.id.txtPEUc13HF10);
        paradaFinal10.setFocusableInTouchMode(false);
        paradaFinal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(Uc13Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        paradaFinal10.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }
                }, 00, 00, true);
                timePickerDialog.show();
            }
        });



        btnUC11Sincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netWorkInfo = cm.getActiveNetworkInfo();
                if (netWorkInfo != null && netWorkInfo.isConnectedOrConnecting()) {
                    Toast.makeText(Uc13Activity.this, "Dispositivo conectado", Toast.LENGTH_SHORT).show();



                    sincronizar(v);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //Closing all the Activities, clear the back stack.
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {

                    //Toast.makeText(Us36Activity.this, "Dispositivo Desconectado", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(Uc13Activity.this);
                    View view = LayoutInflater.from(Uc13Activity.this).inflate(R.layout.sinc_dialog, null);
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
            btnUc13Salvar.setVisibility(View.INVISIBLE);
            btnUC11Sincronizar.setVisibility(View.VISIBLE);
            Uc13 c13 = new Uc13(
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
                    h2o.getText().toString(),
                    oleo.getText().toString(),
                    hidraulico.getText().toString(),
                    observacoes.getText().toString()
            );
            c13.setNomeEquipamento(nomeEquipamento.getText().toString());
            c13.setMotorista(motorista.getText().toString());
            c13.setData(data.getText().toString());
            c13.setHoraInicial(horaInicial.getText().toString());
            String currentDateTimeString3 = DateFormat.getTimeInstance().format(new Date());
            horaFinal.setText(currentDateTimeString3);
            c13.setHoraFinal(horaFinal.getText().toString());
            c13.setHorimetroInicial(horimetroInicial.getText().toString());
            c13.setHorimetroFinal(horimetroFinal.getText().toString());
            c13.setParadaInicial1(paradaInicial1.getText().toString());
            c13.setParadaFinal1(paradaFinal1.getText().toString());
            c13.setDescricao1(descricao1.getSelectedItem().toString());
            c13.setParadaInicial2(paradaInicial2.getText().toString());
            c13.setParadaFinal2(paradaFinal2.getText().toString());
            c13.setDescricao2(descricao2.getSelectedItem().toString());
            c13.setParadaInicial3(paradaInicial3.getText().toString());
            c13.setParadaFinal3(paradaFinal3.getText().toString());
            c13.setDescricao3(descricao3.getSelectedItem().toString());
            c13.setParadaInicial4(paradaInicial4.getText().toString());
            c13.setParadaFinal4(paradaFinal4.getText().toString());
            c13.setDescricao4(descricao4.getSelectedItem().toString());
            c13.setParadaInicial5(paradaInicial5.getText().toString());
            c13.setParadaFinal5(paradaFinal5.getText().toString());
            c13.setDescricao5(descricao5.getSelectedItem().toString());
            c13.setParadaInicial6(paradaInicial6.getText().toString());
            c13.setParadaFinal6(paradaFinal6.getText().toString());
            c13.setDescricao6(descricao6.getSelectedItem().toString());
            c13.setParadaInicial7(paradaInicial7.getText().toString());
            c13.setParadaFinal7(paradaFinal7.getText().toString());
            c13.setDescricao7(descricao7.getSelectedItem().toString());
            c13.setParadaInicial8(paradaInicial8.getText().toString());
            c13.setParadaFinal8(paradaFinal8.getText().toString());
            c13.setDescricao8(descricao8.getSelectedItem().toString());
            c13.setParadaInicial9(paradaInicial9.getText().toString());
            c13.setParadaFinal9(paradaFinal9.getText().toString());
            c13.setDescricao9(descricao9.getSelectedItem().toString());
            c13.setParadaInicial10(paradaInicial10.getText().toString());
            c13.setParadaFinal10(paradaFinal10.getText().toString());
            if (lanternagem.isChecked()) {
                lanternagem.setText("Não");
                c13.setLanternagem(lanternagem.getText().toString());
            } else {
                lanternagem.setText("Sim");
                c13.setLanternagem(lanternagem.getText().toString());
            }

            if (h2o.isChecked()) {
                h2o.setText("Não");
                c13.setH2o(h2o.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                h2o.setText("Sim");
                c13.setH2o(h2o.getText().toString());
            }
            if (oleo.isChecked()) {
                oleo.setText("Não");
                c13.setOleo(oleo.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                oleo.setText("Sim");
                c13.setOleo(oleo.getText().toString());
            }
            if (hidraulico.isChecked()) {
                hidraulico.setText("Não");
                c13.setHidraulico(hidraulico.getText().toString());
                //u36.setLanternagem(Boolean.parseBoolean(lanternagem.getText().toString()));
            } else {
                hidraulico.setText("Sim");
                c13.setHidraulico(hidraulico.getText().toString());
            }

            c13.setObservacoes(observacoes.getText().toString());

            long id = dao.inserir(c13);
            Toast.makeText(this, "uc13 inserido com id: " + id, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            // Closing all the Activities, clear the back stack.
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // startActivity(intent);


        }
    }

    public void sincronizar(View view){

        Uc13 c13 = new Uc13(
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
                h2o.getText().toString(),
                oleo.getText().toString(),
                hidraulico.getText().toString(),
                observacoes.getText().toString()
        );

        long id = dao2.inserir(c13);
        Uc13Service apiService = retrofit.create(Uc13Service.class);
        Call<Uc13> call = apiService.salvarInfoUc13(c13);

        call.enqueue(new Callback<Uc13>(){
            @Override
            public void onResponse(Call<Uc13> call, Response<Uc13> response) {
                if (response.isSuccessful()){
                    Uc13 infoResposta = response.body();
                    //  textViewResultado.setText("Código:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Uc13> call, Throwable t) {

            }
        });

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Uc13Activity.this);
        View view= LayoutInflater.from(Uc13Activity.this).inflate(R.layout.alert_dialog,null);
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
