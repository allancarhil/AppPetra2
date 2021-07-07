package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Uc11;
import com.example.apppetra2.Conexao.Conexao;

public class Uc11DAOSync {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Uc11DAOSync(Context context){
        conexao=new Conexao(context);
        banco=conexao.getWritableDatabase();

    }
    public long inserir(Uc11 uc11){
        ContentValues values=new ContentValues();
        values.put("motorista",uc11.getMotorista());
        values.put("data",uc11.getData());
        values.put("horaInicial",uc11.getHoraInicial());
        values.put("horaFinal", uc11.getHoraFinal());
        values.put("horimetroInicial",uc11.getHorimetroInicial());
        values.put("horimetroFinal",uc11.getHorimetroFinal());
        values.put("paradaInicial1",uc11.getParadaInicial1());
        values.put("paradaFinal1",uc11.getParadaFinal1());
        values.put("descricao1",uc11.getDescricao1());
        values.put("paradaInicial2",uc11.getParadaInicial2());
        values.put("paradaFinal2",uc11.getParadaFinal2());
        values.put("descricao2",uc11.getDescricao2());
        values.put("paradaInicial3",uc11.getParadaInicial3());
        values.put("paradaFinal3",uc11.getParadaFinal3());
        values.put("descricao3",uc11.getDescricao3());
        values.put("paradaInicial4",uc11.getParadaInicial4());
        values.put("paradaFinal4",uc11.getParadaFinal4());
        values.put("descricao4",uc11.getDescricao4());
        values.put("paradaInicial5",uc11.getParadaInicial5());
        values.put("paradaFinal5",uc11.getParadaFinal5());
        values.put("descricao5",uc11.getDescricao5());
        values.put("paradaInicial6",uc11.getParadaInicial6());
        values.put("paradaFinal6",uc11.getParadaFinal6());
        values.put("descricao6",uc11.getDescricao6());
        values.put("paradaInicial7",uc11.getParadaInicial7());
        values.put("paradaFinal7",uc11.getParadaFinal7());
        values.put("descricao7",uc11.getDescricao7());
        values.put("paradaInicial8",uc11.getParadaInicial8());
        values.put("paradaFinal8",uc11.getParadaFinal8());
        values.put("descricao8",uc11.getDescricao8());
        values.put("paradaInicial9",uc11.getParadaInicial9());
        values.put("paradaFinal9",uc11.getParadaFinal9());
        values.put("descricao9",uc11.getDescricao9());
        values.put("paradaInicial10",uc11.getParadaInicial10());
        values.put("paradaFinal10",uc11.getParadaFinal10());
        values.put("descricao10",uc11.getDescricao10());
        values.put("lanternagem",uc11.getLanternagem());
        values.put("h2o",uc11.getH2o());
        values.put("oleo",uc11.getOleo());
        values.put("hidraulico", uc11.getHidraulico());
        values.put("observacoes",uc11.getObservacoes());
        return banco.insert("uc11",null, values);
    }

}
