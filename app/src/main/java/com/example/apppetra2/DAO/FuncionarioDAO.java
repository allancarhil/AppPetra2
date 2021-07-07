package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Conexao.Conexao;
import com.example.apppetra2.Classes.Funcionario;

import butterknife.internal.Utils;


public class FuncionarioDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;
    private SQLiteDatabase banco2;
    private Context context;

    public FuncionarioDAO(Context context){

        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
        banco2=conexao.getReadableDatabase();

    }




    public long inserir(String nome,String cpf,String dataNasc, String telefone, String matricula, String endereco, String senha){
        ContentValues values=new ContentValues();
        values.put("nome",nome);
        values.put("cpf",cpf);
        values.put("dataNasc",dataNasc);
        values.put("telefone",telefone);
        values.put("matricula",matricula);
        values.put("endereco",endereco);
        values.put("senha",senha);
     return banco.insert("funcionario",null, values);
    }



    public long inserir(Funcionario funcionario){
        ContentValues values=new ContentValues();
        values.put("nome",funcionario.getNome());
        values.put("cpf",funcionario.getCpf());
        values.put("dataNasc",funcionario.getDataNasc());
        values.put("telefone",funcionario.getTelefone());
        values.put("matricula",funcionario.getMatricula());
        values.put("endereco",funcionario.getEndereco());
        values.put("senha",funcionario.getSenha());
        return banco.insert("funcionario",null, values);
    }

    public  String validaLogin(String matricula, String cpf){
        Cursor cursor=banco2.rawQuery("SELECT * FROM Funcionario WHERE matricula=? AND cpf=?", new String[]{matricula, cpf});
        if (cursor.getCount()>0){
            return "OK";
        }
            return "ERRO";
    }

    private Funcionario cursorToFuncionario(Cursor cursor) {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(cursor.getInt(0));
        funcionario.setNome(cursor.getString(1));
        return funcionario;
    }

    public Funcionario getByID (Integer id){

        Funcionario funcionario= new Funcionario();
        conexao.getWritableDatabase();
        Cursor cursor = banco2.rawQuery("select * from funcionario where id=?", new String[] {id.toString() });
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            funcionario = cursorToFuncionario(cursor);
            cursor.moveToNext();
        }
        cursor.close();
        conexao.close();
        return funcionario;
    }
}
