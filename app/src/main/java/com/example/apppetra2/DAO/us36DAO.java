package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Us36;
import com.example.apppetra2.Conexao.Conexao;

public class us36DAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public us36DAO(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
}

    public long inserir(Us36 us36) {
    ContentValues values=new ContentValues();
    values.put("nomeEquipamento",us36.getNomeEquipamento());
    values.put("motorista",us36.getMotorista());
    values.put("data",us36.getData());
    values.put("horaInicial",us36.getHoraInicial());
    values.put("horaFinal",us36.getHoraFinal());
    values.put("kmInicial",us36.getkmInicial());
    values.put("kmFinal",us36.getkmFinal());
    values.put("servicos",us36.getServicos());
    values.put("observacoes",us36.getObservacoes());
    values.put("lanternagem",us36.getLanternagem());
    values.put("pneus",us36.getPneus());

    return banco.insert("us36",null, values);
    }
}
