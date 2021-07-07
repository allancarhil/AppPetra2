package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Mn01;
import com.example.apppetra2.Conexao.Conexao;

public class Mn01DAOSync {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public Mn01DAOSync(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Mn01 mn01) {
        ContentValues values=new ContentValues();
        values.put("motorista",mn01.getMotorista());
        values.put("data",mn01.getData());
        values.put("horaInicial",mn01.getHoraInicial());
        values.put("horaFinal", mn01.getHoraFinal());
        values.put("horimetroInicial",mn01.getHorimetroInicial());
        values.put("horimetroFinal",mn01.getHorimetroFinal());
        values.put("banco",mn01.getBanco());
        values.put("paradaInicial1",mn01.getParadaInicial1());
        values.put("paradaFinal1",mn01.getParadaFinal1());
        values.put("descricao1",mn01.getDescricao1());
        values.put("paradaInicial2",mn01.getParadaInicial2());
        values.put("paradaFinal2",mn01.getParadaFinal2());
        values.put("descricao2",mn01.getDescricao2());
        values.put("paradaInicial3",mn01.getParadaInicial3());
        values.put("paradaFinal3",mn01.getParadaFinal3());
        values.put("descricao3",mn01.getDescricao3());
        values.put("paradaInicial4",mn01.getParadaInicial4());
        values.put("paradaFinal4",mn01.getParadaFinal4());
        values.put("descricao4",mn01.getDescricao4());
        values.put("paradaInicial5",mn01.getParadaInicial5());
        values.put("paradaFinal5",mn01.getParadaFinal5());
        values.put("descricao5",mn01.getDescricao5());
        values.put("paradaInicial6",mn01.getParadaInicial6());
        values.put("paradaFinal6",mn01.getParadaFinal6());
        values.put("descricao6",mn01.getDescricao6());
        values.put("lanternagem",mn01.getLanternagem());
        values.put("pneus",mn01.getPneus());
        values.put("h2o",mn01.getH2o());
        values.put("oleo",mn01.getOleo());
        values.put("direcao",mn01.getDirecao());
        values.put("freios",mn01.getFreios());
        values.put("observacoes",mn01.getObservacoes());

        return banco.insert("mn01",null, values);    }
}
