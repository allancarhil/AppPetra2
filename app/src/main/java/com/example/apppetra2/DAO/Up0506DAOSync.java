package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Up0506;
import com.example.apppetra2.Conexao.Conexao;

public class Up0506DAOSync {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Up0506DAOSync(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Up0506 up0506) {
        ContentValues values = new ContentValues();
        values.put("turno",up0506.getTurno());
        values.put("motorista", up0506.getMotorista());
        values.put("data", up0506.getData());
        values.put("horaInicial", up0506.getHoraInicial());
        values.put("horaFinal", up0506.getHoraFinal());
        values.put("horimetroInicial", up0506.getHorimetroInicial());
        values.put("horimetroFinal", up0506.getHorimetroFinal());
        values.put("banco",up0506.getBanco());
        values.put("paradaInicial1",up0506.getParadaInicial1());
        values.put("paradaFinal1",up0506.getParadaFinal1());
        values.put("descricao1",up0506.getDescricao1());
        values.put("paradaInicial2",up0506.getParadaInicial2());
        values.put("paradaFinal2",up0506.getParadaFinal2());
        values.put("descricao2",up0506.getDescricao2());
        values.put("paradaInicial3",up0506.getParadaInicial3());
        values.put("paradaFinal3",up0506.getParadaFinal3());
        values.put("descricao3",up0506.getDescricao3());
        values.put("paradaInicial4",up0506.getParadaInicial4());
        values.put("paradaFinal4",up0506.getParadaFinal4());
        values.put("descricao4",up0506.getDescricao4());
        values.put("paradaInicial5",up0506.getParadaInicial5());
        values.put("paradaFinal5",up0506.getParadaFinal5());
        values.put("descricao5",up0506.getDescricao5());
        values.put("paradaInicial6",up0506.getParadaInicial6());
        values.put("paradaFinal6",up0506.getParadaFinal6());
        values.put("descricao6",up0506.getDescricao6());
        values.put("paradaInicial7",up0506.getParadaInicial7());
        values.put("paradaFinal7",up0506.getParadaFinal7());
        values.put("descricao7",up0506.getDescricao7());
        values.put("paradaInicial8",up0506.getParadaInicial8());
        values.put("paradaFinal8",up0506.getParadaFinal8());
        values.put("descricao8",up0506.getDescricao8());
        values.put("paradaInicial9",up0506.getParadaInicial9());
        values.put("paradaFinal9",up0506.getParadaFinal9());
        values.put("descricao9",up0506.getDescricao9());
        values.put("paradaInicial10",up0506.getParadaInicial10());
        values.put("paradaFinal10",up0506.getParadaFinal10());
        values.put("descricao10",up0506.getDescricao10());
        values.put("furo1",up0506.getFuro1());
        values.put("furo2",up0506.getFuro2());
        values.put("furo3",up0506.getFuro3());
        values.put("furo4",up0506.getFuro4());
        values.put("furo5",up0506.getFuro5());
        values.put("furo6",up0506.getFuro6());
        values.put("furo7",up0506.getFuro7());
        values.put("furo8",up0506.getFuro8());
        values.put("furo9",up0506.getFuro9());
        values.put("furo10",up0506.getFuro10());
        values.put("furo11",up0506.getFuro11());
        values.put("furo12",up0506.getFuro12());
        values.put("furo13",up0506.getFuro13());
        values.put("furo14",up0506.getFuro14());
        values.put("furo15",up0506.getFuro15());
        values.put("furo16",up0506.getFuro16());
        values.put("furo17",up0506.getFuro17());
        values.put("furo18",up0506.getFuro18());
        values.put("furo19",up0506.getFuro19());
        values.put("furo20",up0506.getFuro20());
        values.put("furo21",up0506.getFuro21());
        values.put("furo22",up0506.getFuro22());
        values.put("furo23",up0506.getFuro23());
        values.put("furo24",up0506.getFuro24());
        values.put("furo25",up0506.getFuro25());
        values.put("furo26",up0506.getFuro26());
        values.put("furo27",up0506.getFuro27());
        values.put("furo28",up0506.getFuro28());
        values.put("furo29",up0506.getFuro29());
        values.put("furo30",up0506.getFuro30());
        values.put("furo31",up0506.getFuro31());
        values.put("furo32",up0506.getFuro32());
        values.put("furo33",up0506.getFuro33());
        values.put("furo34",up0506.getFuro34());
        values.put("furo35",up0506.getFuro35());
        values.put("furo36",up0506.getFuro36());
        values.put("furo37",up0506.getFuro37());
        values.put("furo38",up0506.getFuro38());
        values.put("furo39",up0506.getFuro39());
        values.put("furo40",up0506.getFuro40());
        values.put("profundidade1",up0506.getProfundidade1());
        values.put("profundidade2",up0506.getProfundidade2());
        values.put("profundidade3",up0506.getProfundidade3());
        values.put("profundidade4",up0506.getProfundidade4());
        values.put("profundidade5",up0506.getProfundidade5());
        values.put("profundidade6",up0506.getProfundidade6());
        values.put("profundidade7",up0506.getProfundidade7());
        values.put("profundidade8",up0506.getProfundidade8());
        values.put("profundidade9",up0506.getProfundidade9());
        values.put("profundidade10",up0506.getProfundidade10());
        values.put("profundidade11",up0506.getProfundidade11());
        values.put("profundidade12",up0506.getProfundidade12());
        values.put("profundidade13",up0506.getProfundidade13());
        values.put("profundidade14",up0506.getProfundidade14());
        values.put("profundidade15",up0506.getProfundidade15());
        values.put("profundidade16",up0506.getProfundidade16());
        values.put("profundidade17",up0506.getProfundidade17());
        values.put("profundidade18",up0506.getProfundidade18());
        values.put("profundidade19",up0506.getProfundidade19());
        values.put("profundidade20",up0506.getProfundidade20());
        values.put("profundidade21",up0506.getProfundidade21());
        values.put("profundidade22",up0506.getProfundidade22());
        values.put("profundidade23",up0506.getProfundidade23());
        values.put("profundidade24",up0506.getProfundidade24());
        values.put("profundidade25",up0506.getProfundidade25());
        values.put("profundidade26",up0506.getProfundidade26());
        values.put("profundidade27",up0506.getProfundidade27());
        values.put("profundidade28",up0506.getProfundidade28());
        values.put("profundidade29",up0506.getProfundidade29());
        values.put("profundidade30",up0506.getProfundidade30());
        values.put("profundidade31",up0506.getProfundidade31());
        values.put("profundidade32",up0506.getProfundidade32());
        values.put("profundidade33",up0506.getProfundidade33());
        values.put("profundidade34",up0506.getProfundidade34());
        values.put("profundidade35",up0506.getProfundidade35());
        values.put("profundidade36",up0506.getProfundidade36());
        values.put("profundidade37",up0506.getProfundidade37());
        values.put("profundidade38",up0506.getProfundidade38());
        values.put("profundidade39",up0506.getProfundidade39());
        values.put("profundidade40",up0506.getProfundidade40());
        values.put("bit1",up0506.getBit1());
        values.put("bit2",up0506.getBit2());
        values.put("bit3",up0506.getBit3());
        values.put("bit4",up0506.getBit4());
        values.put("bit5",up0506.getBit5());
        values.put("bit6",up0506.getBit6());
        values.put("bit7",up0506.getBit7());
        values.put("bit8",up0506.getBit8());
        values.put("bit9",up0506.getBit9());
        values.put("bit10",up0506.getBit10());
        values.put("bit11",up0506.getBit11());
        values.put("bit12",up0506.getBit12());
        values.put("bit13",up0506.getBit13());
        values.put("bit14",up0506.getBit14());
        values.put("bit15",up0506.getBit15());
        values.put("bit16",up0506.getBit16());
        values.put("bit17",up0506.getBit17());
        values.put("bit18",up0506.getBit18());
        values.put("bit19",up0506.getBit19());
        values.put("bit20",up0506.getBit20());
        values.put("bit21",up0506.getBit21());
        values.put("bit22",up0506.getBit22());
        values.put("bit23",up0506.getBit23());
        values.put("bit24",up0506.getBit24());
        values.put("bit25",up0506.getBit25());
        values.put("bit26",up0506.getBit26());
        values.put("bit27",up0506.getBit27());
        values.put("bit28",up0506.getBit28());
        values.put("bit29",up0506.getBit29());
        values.put("bit30",up0506.getBit30());
        values.put("bit31",up0506.getBit31());
        values.put("bit32",up0506.getBit32());
        values.put("bit33",up0506.getBit33());
        values.put("bit34",up0506.getBit34());
        values.put("bit35",up0506.getBit35());
        values.put("bit36",up0506.getBit36());
        values.put("bit37",up0506.getBit37());
        values.put("bit38",up0506.getBit38());
        values.put("bit39",up0506.getBit39());
        values.put("bit40",up0506.getBit40());
        values.put("somaprofundidade",up0506.getSomaprodundidade());
        values.put("lanternagem",up0506.getLanternagem());
        values.put("h2o",up0506.getH2o());
        values.put("oleo",up0506.getOleo());
        values.put("observacoes",up0506.getObservacoes());
        return banco.insert("up0506",null, values);
    }
}