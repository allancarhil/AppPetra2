package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Ut08;
import com.example.apppetra2.Conexao.Conexao;

public class Ut08DAO {

    private SQLiteDatabase banco;
    private Conexao conexao;

    public Ut08DAO(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Ut08 ut08){
        ContentValues values=new ContentValues();
        values.put("nomeEquipamento",ut08.getNomeEquipamento());
        values.put("motorista",ut08.getMotorista());
        values.put("data",ut08.getData());
        values.put("horaInicial",ut08.getHoraInicial());
        values.put("horaFinal", ut08.getHoraFinal());
        values.put("horimetroInicial",ut08.getHorimetroInicial());
        values.put("horimetroFinal",ut08.getHorimetroFinal());
        values.put("condicaoPistaObservacoes",ut08.getCondicaoPistaObservacoes());
        values.put("condicaoPista",ut08.getCondicaoPista());

        values.put("paradaInicial1",ut08.getParadaInicial1());
        values.put("paradaFinal1",ut08.getParadaFinal1());
        values.put("descricao1",ut08.getDescricao1());
        values.put("paradaInicial2",ut08.getParadaInicial2());
        values.put("paradaFinal2",ut08.getParadaFinal2());
        values.put("descricao2",ut08.getDescricao2());
        values.put("paradaInicial3",ut08.getParadaInicial3());
        values.put("paradaFinal3",ut08.getParadaFinal3());
        values.put("descricao3",ut08.getDescricao3());
        values.put("paradaInicial4",ut08.getParadaInicial4());
        values.put("paradaFinal4",ut08.getParadaFinal4());
        values.put("descricao4",ut08.getDescricao4());
        values.put("paradaInicial5",ut08.getParadaInicial5());
        values.put("paradaFinal5",ut08.getParadaFinal5());
        values.put("descricao5",ut08.getDescricao5());
        values.put("paradaInicial6",ut08.getParadaInicial6());
        values.put("paradaFinal6",ut08.getParadaFinal6());
        values.put("descricao6",ut08.getDescricao6());
        values.put("paradaInicial7",ut08.getParadaInicial7());
        values.put("paradaFinal7",ut08.getParadaFinal7());
        values.put("descricao7",ut08.getDescricao7());
        values.put("paradaInicial8",ut08.getParadaInicial8());
        values.put("paradaFinal8",ut08.getParadaFinal8());
        values.put("descricao8",ut08.getDescricao8());
        values.put("paradaInicial9",ut08.getParadaInicial9());
        values.put("paradaFinal9",ut08.getParadaFinal9());
        values.put("descricao9",ut08.getDescricao9());
        values.put("paradaInicial10",ut08.getParadaInicial10());
        values.put("paradaFinal10",ut08.getParadaFinal10());
        values.put("descricao10",ut08.getDescricao10());

        values.put("numViagens78078",ut08.getNumViagens78078());
        values.put("numViagens78089",ut08.getNumViagens78089());
        values.put("numViagens780910",ut08.getNumViagens780910());
        values.put("numViagens7801011",ut08.getNumViagens7801011());
        values.put("numViagens7801112",ut08.getNumViagens7801112());
        values.put("numViagens7801213",ut08.getNumViagens7801213());
        values.put("numViagens7801314",ut08.getNumViagens7801314());
        values.put("numViagens7801415",ut08.getNumViagens7801415());
        values.put("numViagens7801516",ut08.getNumViagens7801516());
        values.put("numViagens7801617",ut08.getNumViagens7801617());
        values.put("numViagens7801718",ut08.getNumViagens7801718());

        values.put("obs78",ut08.getObs78());
        values.put("obs89",ut08.getObs89());
        values.put("obs910",ut08.getObs910());
        values.put("obs1011",ut08.getObs1011());
        values.put("obs1112",ut08.getObs1112());
        values.put("obs1213",ut08.getObs1213());
        values.put("obs1314",ut08.getObs1314());
        values.put("obs1415",ut08.getObs1415());
        values.put("obs1516",ut08.getObs1516());
        values.put("obs1617",ut08.getObs1617());
        values.put("obs1718",ut08.getObs1718());

        values.put("numViagensSoma780",ut08.getSoma780());
        values.put("numViagensAm",ut08.getNumViagensAm());
        values.put("numViagensBicaCont",ut08.getNumViagensBicaCont());
        values.put("numViagensAf",ut08.getNumViagensAf());
        values.put("numViagensPedrisco",ut08.getNumViagensPedrisco());
        values.put("numViagensBicaPr",ut08.getNumViagensBicaPr());
        values.put("numViagensBica790",ut08.getNumViagensBica790());
        values.put("numViagensBicaUm",ut08.getNumViagensBicaUm());
        values.put("numViagensBr1Pr",ut08.getNumViagensBr1Pr());
        values.put("numViagensBr119",ut08.getNumViagensBr119());
        values.put("numViagensBr0Pr",ut08.getNumViagensBr0Pr());
        values.put("numViagensBr0Um",ut08.getNumViagensBr0Um());
        values.put("numViagensBicaForro",ut08.getNumViagensBicaForro());
        values.put("numViagensB0",ut08.getNumViagensB0());
        values.put("numViagensB1",ut08.getNumViagensB1());
        values.put("numViagensB2",ut08.getNumViagensB2());
        values.put("numViagensAim",ut08.getNumViagensAim());
        values.put("numViagensFundo",ut08.getNumViagensFundo());
        values.put("numViagens780",ut08.getNumViagens780());
        values.put("numViagens790",ut08.getNumViagens790());
        values.put("numViagens800",ut08.getNumViagens800());
        values.put("numViagens810",ut08.getNumViagens810());

        values.put("lanternagem",ut08.getLanternagem());
        values.put("pneus",ut08.getPneus());
        values.put("h2o",ut08.getH2o());
        values.put("oleo",ut08.getOleo());
        values.put("direcao",ut08.getDirecao());
        values.put("freios",ut08.getFreios());
        values.put("parteEletrica",ut08.getParteEletrica());
        values.put("observacoes",ut08.getObservacoes());
        return banco.insert("ut08",null, values);    }
}
