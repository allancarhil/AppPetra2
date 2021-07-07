package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Uc13;
import com.example.apppetra2.Conexao.Conexao;

public class Uc13DAO {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Uc13DAO(Context context){

        conexao=new Conexao(context);
        banco=conexao.getWritableDatabase();

    }
    public long inserir(Uc13 uc13){
        ContentValues values=new ContentValues();
        values.put("motorista",uc13.getMotorista());
        values.put("data",uc13.getData());
        values.put("horaInicial",uc13.getHoraInicial());
        values.put("horaFinal", uc13.getHoraFinal());
        values.put("horimetroInicial",uc13.getHorimetroInicial());
        values.put("horimetroFinal",uc13.getHorimetroFinal());
        values.put("paradaInicial1",uc13.getParadaInicial1());
        values.put("paradaFinal1",uc13.getParadaFinal1());
        values.put("descricao1",uc13.getDescricao1());
        values.put("paradaInicial2",uc13.getParadaInicial2());
        values.put("paradaFinal2",uc13.getParadaFinal2());
        values.put("descricao2",uc13.getDescricao2());
        values.put("paradaInicial3",uc13.getParadaInicial3());
        values.put("paradaFinal3",uc13.getParadaFinal3());
        values.put("descricao3",uc13.getDescricao3());
        values.put("paradaInicial4",uc13.getParadaInicial4());
        values.put("paradaFinal4",uc13.getParadaFinal4());
        values.put("descricao4",uc13.getDescricao4());
        values.put("paradaInicial5",uc13.getParadaInicial5());
        values.put("paradaFinal5",uc13.getParadaFinal5());
        values.put("descricao5",uc13.getDescricao5());
        values.put("paradaInicial6",uc13.getParadaInicial6());
        values.put("paradaFinal6",uc13.getParadaFinal6());
        values.put("descricao6",uc13.getDescricao6());
        values.put("paradaInicial7",uc13.getParadaInicial7());
        values.put("paradaFinal7",uc13.getParadaFinal7());
        values.put("descricao7",uc13.getDescricao7());
        values.put("paradaInicial8",uc13.getParadaInicial8());
        values.put("paradaFinal8",uc13.getParadaFinal8());
        values.put("descricao8",uc13.getDescricao8());
        values.put("paradaInicial9",uc13.getParadaInicial9());
        values.put("paradaFinal9",uc13.getParadaFinal9());
        values.put("descricao9",uc13.getDescricao9());
        values.put("paradaInicial10",uc13.getParadaInicial10());
        values.put("paradaFinal10",uc13.getParadaFinal10());
        values.put("descricao10",uc13.getDescricao10());
        values.put("lanternagem",uc13.getLanternagem());
        values.put("h2o",uc13.getH2o());
        values.put("oleo",uc13.getOleo());
        values.put("hidraulico", uc13.getHidraulico());
        values.put("observacoes",uc13.getObservacoes());
        return banco.insert("uc13",null, values);
    }
}
