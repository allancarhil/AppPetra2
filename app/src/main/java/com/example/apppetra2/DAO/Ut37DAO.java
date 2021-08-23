package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Ut37;
import com.example.apppetra2.Conexao.Conexao;

public class Ut37DAO {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Ut37DAO(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Ut37 ut37){
        ContentValues values=new ContentValues();
        values.put("nomeEquipamento",ut37.getNomeEquipamento());
        values.put("motorista",ut37.getMotorista());
        values.put("data",ut37.getData());
        values.put("horaInicial",ut37.getHoraInicial());
        values.put("horaFinal", ut37.getHoraFinal());
        values.put("horimetroInicial",ut37.getHorimetroInicial());
        values.put("horimetroFinal",ut37.getHorimetroFinal());
        values.put("condicaoPistaObservacoes",ut37.getCondicaoPistaObservacoes());
        values.put("condicaoPista",ut37.getCondicaoPista());

        values.put("paradaInicial1",ut37.getParadaInicial1());
        values.put("paradaFinal1",ut37.getParadaFinal1());
        values.put("descricao1",ut37.getDescricao1());
        values.put("paradaInicial2",ut37.getParadaInicial2());
        values.put("paradaFinal2",ut37.getParadaFinal2());
        values.put("descricao2",ut37.getDescricao2());
        values.put("paradaInicial3",ut37.getParadaInicial3());
        values.put("paradaFinal3",ut37.getParadaFinal3());
        values.put("descricao3",ut37.getDescricao3());
        values.put("paradaInicial4",ut37.getParadaInicial4());
        values.put("paradaFinal4",ut37.getParadaFinal4());
        values.put("descricao4",ut37.getDescricao4());
        values.put("paradaInicial5",ut37.getParadaInicial5());
        values.put("paradaFinal5",ut37.getParadaFinal5());
        values.put("descricao5",ut37.getDescricao5());
        values.put("paradaInicial6",ut37.getParadaInicial6());
        values.put("paradaFinal6",ut37.getParadaFinal6());
        values.put("descricao6",ut37.getDescricao6());
        values.put("paradaInicial7",ut37.getParadaInicial7());
        values.put("paradaFinal7",ut37.getParadaFinal7());
        values.put("descricao7",ut37.getDescricao7());
        values.put("paradaInicial8",ut37.getParadaInicial8());
        values.put("paradaFinal8",ut37.getParadaFinal8());
        values.put("descricao8",ut37.getDescricao8());
        values.put("paradaInicial9",ut37.getParadaInicial9());
        values.put("paradaFinal9",ut37.getParadaFinal9());
        values.put("descricao9",ut37.getDescricao9());
        values.put("paradaInicial10",ut37.getParadaInicial10());
        values.put("paradaFinal10",ut37.getParadaFinal10());
        values.put("descricao10",ut37.getDescricao10());

        values.put("numViagens78078",ut37.getNumViagens78078());
        values.put("numViagens78089",ut37.getNumViagens78089());
        values.put("numViagens780910",ut37.getNumViagens780910());
        values.put("numViagens7801011",ut37.getNumViagens7801011());
        values.put("numViagens7801112",ut37.getNumViagens7801112());
        values.put("numViagens7801213",ut37.getNumViagens7801213());
        values.put("numViagens7801314",ut37.getNumViagens7801314());
        values.put("numViagens7801415",ut37.getNumViagens7801415());
        values.put("numViagens7801516",ut37.getNumViagens7801516());
        values.put("numViagens7801617",ut37.getNumViagens7801617());
        values.put("numViagens7801718",ut37.getNumViagens7801718());

        values.put("obs78",ut37.getObs78());
        values.put("obs89",ut37.getObs89());
        values.put("obs910",ut37.getObs910());
        values.put("obs1011",ut37.getObs1011());
        values.put("obs1112",ut37.getObs1112());
        values.put("obs1213",ut37.getObs1213());
        values.put("obs1314",ut37.getObs1314());
        values.put("obs1415",ut37.getObs1415());
        values.put("obs1516",ut37.getObs1516());
        values.put("obs1617",ut37.getObs1617());
        values.put("obs1718",ut37.getObs1718());
        values.put("numViagensSoma780",ut37.getSoma780());
        values.put("numViagensAm",ut37.getNumViagensAm());
        values.put("numViagensBicaCont",ut37.getNumViagensBicaCont());
        values.put("numViagensAf",ut37.getNumViagensAf());
        values.put("numViagensPedrisco",ut37.getNumViagensPedrisco());
        values.put("numViagensBicaPr",ut37.getNumViagensBicaPr());
        values.put("numViagensBica790",ut37.getNumViagensBica790());
        values.put("numViagensBicaUm",ut37.getNumViagensBicaUm());
        values.put("numViagensBr1Pr",ut37.getNumViagensBr1Pr());
        values.put("numViagensBr119",ut37.getNumViagensBr119());
        values.put("numViagensBr0Pr",ut37.getNumViagensBr0Pr());
        values.put("numViagensBr0Um",ut37.getNumViagensBr0Um());
        values.put("numViagensBicaForro",ut37.getNumViagensBicaForro());
        values.put("numViagensB0",ut37.getNumViagensB0());
        values.put("numViagensB1",ut37.getNumViagensB1());
        values.put("numViagensB2",ut37.getNumViagensB2());
        values.put("numViagensAim",ut37.getNumViagensAim());
        values.put("numViagensFundo",ut37.getNumViagensFundo());
        values.put("numViagens780",ut37.getNumViagens780());
        values.put("numViagens790",ut37.getNumViagens790());
        values.put("numViagens800",ut37.getNumViagens800());
        values.put("numViagens810",ut37.getNumViagens810());

        values.put("lanternagem",ut37.getLanternagem());
        values.put("pneus",ut37.getPneus());
        values.put("h2o",ut37.getH2o());
        values.put("oleo",ut37.getOleo());
        values.put("direcao",ut37.getDirecao());
        values.put("freios",ut37.getFreios());
        values.put("parteEletrica",ut37.getParteEletrica());
        values.put("observacoes",ut37.getObservacoes());

        return banco.insert("ut37",null, values);    }
}
