package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Ub02;
import com.example.apppetra2.Conexao.Conexao;

public class Ub02DAOSync {
   private SQLiteDatabase banco;
    private Conexao conexao;

    public Ub02DAOSync(Context contex){
        conexao=new Conexao(contex);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Ub02 ub02){
    ContentValues values=new ContentValues();
        values.put("nomeEquipamento",ub02.getNomeEquipamento());
        values.put("motorista",ub02.getMotorista());
        values.put("data",ub02.getData());
        values.put("horaInicial",ub02.getHoraInicial());
        values.put("horaFinal", ub02.getHoraFinal());
        values.put("horimetroInicial",ub02.getHorimetroInicial());
        values.put("horimetroFinal",ub02.getHorimetroFinal());
        values.put("paradaInicial1",ub02.getParadaInicial1());
        values.put("paradaFinal1",ub02.getParadaFinal1());
        values.put("descricao1",ub02.getDescricao1());
        values.put("paradaInicial2",ub02.getParadaInicial2());
        values.put("paradaFinal2",ub02.getParadaFinal2());
        values.put("descricao2",ub02.getDescricao2());
        values.put("paradaInicial3",ub02.getParadaInicial3());
        values.put("paradaFinal3",ub02.getParadaFinal3());
        values.put("descricao3",ub02.getDescricao3());
        values.put("paradaInicial4",ub02.getParadaInicial4());
        values.put("paradaFinal4",ub02.getParadaFinal4());
        values.put("descricao4",ub02.getDescricao4());
        values.put("paradaInicial5",ub02.getParadaInicial5());
        values.put("paradaFinal5",ub02.getParadaFinal5());
        values.put("descricao5",ub02.getDescricao5());
        values.put("paradaInicial6",ub02.getParadaInicial6());
        values.put("paradaFinal6",ub02.getParadaFinal6());
        values.put("descricao6",ub02.getDescricao6());
        values.put("paradaInicial7",ub02.getParadaInicial7());
        values.put("paradaFinal7",ub02.getParadaFinal7());
        values.put("descricao7",ub02.getDescricao7());
        values.put("paradaInicial8",ub02.getParadaInicial8());
        values.put("paradaFinal8",ub02.getParadaFinal8());
        values.put("descricao8",ub02.getDescricao8());
        values.put("paradaInicial9",ub02.getParadaInicial9());
        values.put("paradaFinal9",ub02.getParadaFinal9());
        values.put("descricao9",ub02.getDescricao9());
        values.put("paradaInicial10",ub02.getParadaInicial10());
        values.put("paradaFinal10",ub02.getParadaFinal10());
        values.put("descricao10",ub02.getDescricao10());
        values.put("pedraBritador",ub02.getPedraBritador());
        values.put("bandeja",ub02.getBandeja());
        values.put("utc01",ub02.getUtc01());
        values.put("tremonha",ub02.getTremonha());
        values.put("balançaInicial",ub02.getBalancaInicial());
        values.put("balançaFinal",ub02.getBalancaFinal());
        values.put("observacoes",ub02.getObservacoes());
        return banco.insert("ub02",null, values);
}
}
