package com.example.apppetra2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.DAO.FuncionarioDAO;
import com.example.apppetra2.R;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText senha;
    TextView nome;
    ProgressDialog progressDialog;
    FuncionarioDAO db;


    // Constants
    // The authority for the sync adapter's content provider
    public static final String AUTHORITY = "com.example.android.datasync.provider";
    // An account type, in the form of a domain name
    public static final String ACCOUNT_TYPE = "example.com";
    // The account name
    public static final String ACCOUNT = "dummyaccount";
    // Instance fields
    Account mAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        final FuncionarioDAO func=new FuncionarioDAO(this);
        final Funcionario f=new Funcionario();
        db=new FuncionarioDAO(this);
        login=findViewById(R.id.txtlogin);
        login.requestFocus();
        senha=findViewById(R.id.txtsenha);
        nome=findViewById(R.id.txtnomeLogin);


        Button botao=findViewById(R.id.buttonEntrar);
        botao.setOnClickListener(new View.OnClickListener() {
            boolean isEmpty(EditText text) {
                CharSequence str = login.getText().toString();
                CharSequence pass = senha.getText().toString();
                return TextUtils.isEmpty(str);




            }








            @Override
            public void onClick(View v) {


                nome.setText(f.getNome());


                String matricula = login.getText().toString();
                String cpf = senha.getText().toString();
                String res= db.validaLogin(matricula, cpf);

               if(isEmpty(login)||login.getText().toString().trim().length()==0||isEmpty(senha)||senha.getText().toString().trim().length()==0){
                   if(isEmpty(login)||login.getText().toString().trim().length()==0) {
                       login.setError("Preencha o login");
                       login.requestFocus();
                   }
                   else if (isEmpty(senha)||senha.getText().toString().trim().length()==0){
                       senha.setError("Preencha a senha");
                       senha.requestFocus();
                   }
               }
                if(login.getText().toString().equals("0955")&& senha.getText().toString().equals("110385201")) {
                   String namevalue = "ADMIN";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7094")&& senha.getText().toString().equals("0880")) {
                   String namevalue = "ADRIANO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7062")&& senha.getText().toString().equals("0151")) {
                   String namevalue = "JONATAS";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7165")&& senha.getText().toString().equals("0807")) {
                   String namevalue = "DARIO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("6018")&& senha.getText().toString().equals("0868")) {
                   String namevalue = "LUIS ANTÔNIO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7149")&& senha.getText().toString().equals("9468")) {
                   String namevalue = "PAULO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7189")&& senha.getText().toString().equals("0670")) {
                   String namevalue = "CARLOS HENRIQUE";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("6989")&& senha.getText().toString().equals("6007")) {
                   String namevalue = "WALTENCIR";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7014")&& senha.getText().toString().equals("1026")) {
                   String namevalue = "JACIEL";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("4031")&& senha.getText().toString().equals("1161")) {
                   String namevalue = "DOMINGOS";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7099")&& senha.getText().toString().equals("0380")) {
                   String namevalue = "JEFFERSON";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7081")&& senha.getText().toString().equals("0951")) {
                   String namevalue = "DAVI";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7190")&& senha.getText().toString().equals("1468")) {
                   String namevalue = "IAGO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7107")&& senha.getText().toString().equals("0125")) {
                   String namevalue = "ALEXANDRE";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7104")&& senha.getText().toString().equals("1017")) {
                   String namevalue = "RENATO";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("6004")&& senha.getText().toString().equals("0660")) {
                   String namevalue = "ANTÔNIO CARLOS";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7179")&& senha.getText().toString().equals("1329")) {
                   String namevalue = "RAFAEL";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7103")&& senha.getText().toString().equals("0758")) {
                   String namevalue = "MICHAEL";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7200")&& senha.getText().toString().equals("0631")) {
                   String namevalue = "DARLAN";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
               else if(login.getText().toString().equals("7138")&& senha.getText().toString().equals("6343")) {
                   String namevalue = "HELITON";
                   Intent it = new Intent(MainActivity.this, MenuActivity.class);
                   it.putExtra("NAME", namevalue);
                   entrar();
                   startActivity(it);
               }
                else if(login.getText().toString().equals("7206")&& senha.getText().toString().equals("0964")) {
                    String namevalue = "JOÃO RICARDO";
                    Intent it = new Intent(MainActivity.this, MenuActivity.class);
                    it.putExtra("NAME", namevalue);
                    entrar();
                    startActivity(it);
                }
                else if(login.getText().toString().equals("7209")&& senha.getText().toString().equals("0480")) {
                    String namevalue = "LUCIOMAR";
                    Intent it = new Intent(MainActivity.this, MenuActivity.class);
                    it.putExtra("NAME", namevalue);
                    entrar();
                    startActivity(it);
                }
                if(res.equals("OK")){
                    Toast.makeText(MainActivity.this, "deu bom"+matricula, Toast.LENGTH_SHORT).show();
                    String namevalue ="";
                    Intent it = new Intent(MainActivity.this, MenuActivity.class);
                    it.putExtra("NAME", namevalue);//transporta o nome
                    startActivity(it);
                }

                else{
                    Toast.makeText(MainActivity.this, "bem-vindo", Toast.LENGTH_SHORT).show();
                    //login.setError("login ou senha inválidos");
                   //login.requestFocus();
                }


            }
        });
    }






    public void entrar(){
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(
        android.R.color.transparent
        );
    }







    @Override
    public void onBackPressed() {
    }



}
