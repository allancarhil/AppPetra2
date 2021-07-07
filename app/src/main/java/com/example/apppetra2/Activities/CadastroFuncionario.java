package com.example.apppetra2.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.DAO.FuncionarioDAO;
import com.example.apppetra2.R;

public class CadastroFuncionario extends AppCompatActivity {
    private EditText nome;
    private EditText cpf;
    private EditText dataNasc;
    private EditText telefone;
    private EditText matricula;
    private EditText endereco;
    private EditText senha;
    private EditText confirmarSenha;
    private FuncionarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        nome=findViewById(R.id.txtNome);
        cpf=findViewById(R.id.txtCPF);
        dataNasc=findViewById(R.id.txtDataNasc);
        telefone=findViewById(R.id.txtTelefone);
        matricula=findViewById(R.id.txtMatricula);
        endereco=findViewById(R.id.txtEndereco);
        senha=findViewById(R.id.txtSenha);
        confirmarSenha=findViewById(R.id.txtSenha2);
        dao= new FuncionarioDAO(this);




    }




    public void salvar(View view) {

        if(nome.getText().toString().equals("")){
            nome.setError("CAMPO OBRIGATÓRIO");
            nome.requestFocus();
        }
        else if(cpf.getText().toString().equals("")){
            cpf.setError("CAMPO OBRIGATÓRIO");
            cpf.requestFocus();
        }
        else if(dataNasc.getText().toString().equals("")){
            dataNasc.setError("CAMPO OBRIGATÓRIO");
            dataNasc.requestFocus();
        }
        else if(telefone.getText().toString().equals("")){
            telefone.setError("CAMPO OBRIGATÓRIO");
            telefone.requestFocus();
        }
       else if(matricula.getText().toString().equals("")){
            matricula.setError("CAMPO OBRIGATÓRIO");
            matricula.requestFocus();
        }
        else if(endereco.getText().toString().equals("")){
            endereco.setError("CAMPO OBRIGATÓRIO");
            endereco.requestFocus();
        }
        else if(senha.getText().toString().equals("")){
            senha.setError("CAMPO OBRIGATÓRIO");
            senha.requestFocus();
        }
        else if(confirmarSenha.getText().toString().equals("")){
            confirmarSenha.setError("CAMPO OBRIGATÓRIO");
            confirmarSenha.requestFocus();
        }
        else if(!confirmarSenha.getText().toString().equals(senha.getText().toString())){
            confirmarSenha.setError("AS SENHAS NÃO CONFEREM");
            confirmarSenha.requestFocus();
        }

        else {
            Funcionario f = new Funcionario(nome.getText().toString(),cpf.getText().toString(),dataNasc.getText().toString(), telefone.getText().toString(), matricula.getText().toString(), endereco.getText().toString(), senha.getText().toString());

            f.setNome(nome.getText().toString());
            f.setCpf(cpf.getText().toString());
            f.setDataNasc(dataNasc.getText().toString());
            f.setTelefone(telefone.getText().toString());
            f.setMatricula(matricula.getText().toString());
            f.setEndereco(endereco.getText().toString());
            f.setSenha(senha.getText().toString());
            long id = dao.inserir(f);

            Toast.makeText(this, "Funcionario inserido com id: " + id, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            // Closing all the Activities, clear the back stack.
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(CadastroFuncionario.this);
        View view= LayoutInflater.from(CadastroFuncionario.this).inflate(R.layout.alert_dialog,null);
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
