package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Ut07;
import com.example.apppetra2.Conexao.Conexao;

public class Ut07DAOSync {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Ut07DAOSync(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Ut07 ut07){
        ContentValues values=new ContentValues();
        values.put("motorista",ut07.getMotorista());
        values.put("data",ut07.getData());
        values.put("horaInicial",ut07.getHoraInicial());
        values.put("horaFinal", ut07.getHoraFinal());
        values.put("horimetroInicial",ut07.getHorimetroInicial());
        values.put("horimetroFinal",ut07.getHorimetroFinal());
        values.put("condicaoPistaObservacoes",ut07.getCondicaoPistaObservacoes());
        values.put("condicaoPista",ut07.getCondicaoPista());

        values.put("paradaInicial1",ut07.getParadaInicial1());
        values.put("paradaFinal1",ut07.getParadaFinal1());
        values.put("descricao1",ut07.getDescricao1());
        values.put("paradaInicial2",ut07.getParadaInicial2());
        values.put("paradaFinal2",ut07.getParadaFinal2());
        values.put("descricao2",ut07.getDescricao2());
        values.put("paradaInicial3",ut07.getParadaInicial3());
        values.put("paradaFinal3",ut07.getParadaFinal3());
        values.put("descricao3",ut07.getDescricao3());
        values.put("paradaInicial4",ut07.getParadaInicial4());
        values.put("paradaFinal4",ut07.getParadaFinal4());
        values.put("descricao4",ut07.getDescricao4());
        values.put("paradaInicial5",ut07.getParadaInicial5());
        values.put("paradaFinal5",ut07.getParadaFinal5());
        values.put("descricao5",ut07.getDescricao5());
        values.put("paradaInicial6",ut07.getParadaInicial6());
        values.put("paradaFinal6",ut07.getParadaFinal6());
        values.put("descricao6",ut07.getDescricao6());
        values.put("paradaInicial7",ut07.getParadaInicial7());
        values.put("paradaFinal7",ut07.getParadaFinal7());
        values.put("descricao7",ut07.getDescricao7());
        values.put("paradaInicial8",ut07.getParadaInicial8());
        values.put("paradaFinal8",ut07.getParadaFinal8());
        values.put("descricao8",ut07.getDescricao8());
        values.put("paradaInicial9",ut07.getParadaInicial9());
        values.put("paradaFinal9",ut07.getParadaFinal9());
        values.put("descricao9",ut07.getDescricao9());
        values.put("paradaInicial10",ut07.getParadaInicial10());
        values.put("paradaFinal10",ut07.getParadaFinal10());
        values.put("descricao10",ut07.getDescricao10());

        values.put("numViagens78078",ut07.getNumViagens78078());
        values.put("numViagens78089",ut07.getNumViagens78089());
        values.put("numViagens780910",ut07.getNumViagens780910());
        values.put("numViagens7801011",ut07.getNumViagens7801011());
        values.put("numViagens7801112",ut07.getNumViagens7801112());
        values.put("numViagens7801213",ut07.getNumViagens7801213());
        values.put("numViagens7801314",ut07.getNumViagens7801314());
        values.put("numViagens7801415",ut07.getNumViagens7801415());
        values.put("numViagens7801516",ut07.getNumViagens7801516());
        values.put("numViagens7801617",ut07.getNumViagens7801617());
        values.put("numViagens7801718",ut07.getNumViagens7801718());

        values.put("obs78",ut07.getObs78());
        values.put("obs89",ut07.getObs89());
        values.put("obs910",ut07.getObs910());
        values.put("obs1011",ut07.getObs1011());
        values.put("obs1112",ut07.getObs1112());
        values.put("obs1213",ut07.getObs1213());
        values.put("obs1314",ut07.getObs1314());
        values.put("obs1415",ut07.getObs1415());
        values.put("obs1516",ut07.getObs1516());
        values.put("obs1617",ut07.getObs1617());
        values.put("obs1718",ut07.getObs1718());

        values.put("numViagensSoma780",ut07.getSoma780());
        values.put("numViagensAm",ut07.getNumViagensAm());
        values.put("numViagensBicaCont",ut07.getNumViagensBicaCont());
        values.put("numViagensAf",ut07.getNumViagensAf());
        values.put("numViagensPedrisco",ut07.getNumViagensPedrisco());
        values.put("numViagensBicaPr",ut07.getNumViagensBicaPr());
        values.put("numViagensBica790",ut07.getNumViagensBica790());
        values.put("numViagensBicaUm",ut07.getNumViagensBicaUm());
        values.put("numViagensBr1Pr",ut07.getNumViagensBr1Pr());
        values.put("numViagensBr119",ut07.getNumViagensBr119());
        values.put("numViagensBr0Pr",ut07.getNumViagensBr0Pr());
        values.put("numViagensBr0Um",ut07.getNumViagensBr0Um());
        values.put("numViagensBicaForro",ut07.getNumViagensBicaForro());
        values.put("numViagensB0",ut07.getNumViagensB0());
        values.put("numViagensB1",ut07.getNumViagensB1());
        values.put("numViagensB2",ut07.getNumViagensB2());
        values.put("numViagensAim",ut07.getNumViagensAim());
        values.put("numViagensFundo",ut07.getNumViagensFundo());
        values.put("numViagens780",ut07.getNumViagens780());
        values.put("numViagens790",ut07.getNumViagens790());
        values.put("numViagens800",ut07.getNumViagens800());
        values.put("numViagens810",ut07.getNumViagens810());

        values.put("lanternagem",ut07.getLanternagem());
        values.put("pneus",ut07.getPneus());
        values.put("h2o",ut07.getH2o());
        values.put("oleo",ut07.getOleo());
        values.put("direcao",ut07.getDirecao());
        values.put("freios",ut07.getFreios());
        values.put("parteEletrica",ut07.getParteEletrica());
        values.put("observacoes",ut07.getObservacoes());
       return banco.insert("ut07",null, values);    }
}
