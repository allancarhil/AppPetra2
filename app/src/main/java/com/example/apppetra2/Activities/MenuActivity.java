package com.example.apppetra2.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.apppetra2.DAO.FuncionarioDAO;
import com.example.apppetra2.R;




public class MenuActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    public Button btnCadastro;
    private FuncionarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dao=new FuncionarioDAO(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Bundle b=getIntent().getExtras();
        String name=b.getString("NAME");
        final TextView login=findViewById(R.id.txtMenuLogin);
        login.setText(name);
        final String namevalue= login.getText().toString();

        if (namevalue.equals("ADMIN")) {
            btnCadastro=findViewById(R.id.btnCadastro);
            btnCadastro.setVisibility(View.VISIBLE);
        }
        else{
            btnCadastro=findViewById(R.id.btnCadastro);
            btnCadastro.setVisibility(View.INVISIBLE);
        }





        Button botaous36=findViewById(R.id.buttonus36);
        botaous36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itus36=new Intent(MenuActivity.this, Us36Activity.class);
                itus36.putExtra("NAME",namevalue);
                startActivity(itus36);
            }
        });

        Button botaous06=findViewById(R.id.buttonus06);
        botaous06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itus06=new Intent(MenuActivity.this,Us06Activity.class);
                itus06.putExtra("NAME",namevalue);
                startActivity(itus06);
            }
        });
        Button botaomn01=findViewById(R.id.buttonmn01);
        botaomn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
//                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itmn01=new Intent(MenuActivity.this,Mn01Activity.class);
                itmn01.putExtra("NAME",namevalue);
                startActivity(itmn01);
            }
        });
        Button botaout07=findViewById(R.id.buttonut07);
        botaout07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                       android.R.color.transparent
                );
                Intent itut07=new Intent(MenuActivity.this,Ut07Activity.class);
                itut07.putExtra("NAME",namevalue);
                startActivity(itut07);
            }
        });
        Button botaout08=findViewById(R.id.buttonut08);
        botaout08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itut08=new Intent(MenuActivity.this,Ut08Activity.class);
                itut08.putExtra("NAME",namevalue);
                startActivity(itut08);
            }
        });
        Button botaout37=findViewById(R.id.buttonut37);
        botaout37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itut37=new Intent(MenuActivity.this,Ut37Activity.class);
                itut37.putExtra("NAME",namevalue);
                startActivity(itut37);
            }
        });
        Button botaoup0506=findViewById(R.id.buttonup0506);
        botaoup0506.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itup0506=new Intent(MenuActivity.this,Up0506Activity.class);
                itup0506.putExtra("NAME",namevalue);
                startActivity(itup0506);
            }
        });
        Button botaouc06=findViewById(R.id.buttonuc06);
        botaouc06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent ituc06=new Intent(MenuActivity.this,Uc06Activity.class);
                ituc06.putExtra("NAME",namevalue);
                startActivity(ituc06);
            }
        });
        Button botaouc14=findViewById(R.id.buttonuc14);
        botaouc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent ituc14=new Intent(MenuActivity.this,Uc14Activity.class);
                ituc14.putExtra("NAME",namevalue);
                startActivity(ituc14);
            }
        });
        Button botaouc13=findViewById(R.id.buttonuc13);
        botaouc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent ituc13=new Intent(MenuActivity.this,Uc13Activity.class);
                ituc13.putExtra("NAME",namevalue);
                startActivity(ituc13);
            }
        });
        Button botaouc11=findViewById(R.id.buttonuc11);
        botaouc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent ituc11=new Intent(MenuActivity.this,Uc11Activity.class);
                ituc11.putExtra("NAME",namevalue);
                startActivity(ituc11);
            }
        });
        Button botaoub02=findViewById(R.id.buttonub2);
        botaoub02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itub02=new Intent(MenuActivity.this,Ub02Activity.class);
                itub02.putExtra("NAME",namevalue);
                startActivity(itub02);
            }
        });
        Button botaoRebritagem=findViewById(R.id.buttonrebritagem);
        botaoRebritagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itRebritagem=new Intent(MenuActivity.this,RebritagemActivity.class);
                itRebritagem.putExtra("NAME",namevalue);
                startActivity(itRebritagem);
            }
        });
        Button botaounsina=findViewById(R.id.buttonusina);
        botaounsina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent itusina=new Intent(MenuActivity.this,UsinaActivity.class);
                itusina.putExtra("NAME",namevalue);
                startActivity(itusina);
            }
        });


        Button botaouc07=findViewById(R.id.buttonuc07);
        botaouc07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MenuActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Intent ituc07=new Intent(MenuActivity.this,Uc07Activity.class);
                ituc07.putExtra("NAME",namevalue);
                startActivity(ituc07);
            }
        });



        Button btnCadastro=findViewById(R.id.btnCadastro);
        btnCadastro.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent itCadastro=new Intent(MenuActivity.this, CadastroFuncionario.class);
                startActivity(itCadastro);

                //login = findViewById(R.id.txtlogin);
                //String.txtlogin= login.getText();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent itMain=new Intent(MenuActivity.this,MainActivity.class);
        startActivity(itMain);

    }


}
