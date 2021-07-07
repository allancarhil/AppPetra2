package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Uc14;
import com.example.apppetra2.Conexao.Conexao;

public class Uc14DAOSync {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public Uc14DAOSync(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Uc14 uc14){
        ContentValues values=new ContentValues();
        values.put("motorista",uc14.getMotorista());
        values.put("data",uc14.getData());
        values.put("horaInicial",uc14.getHoraInicial());
        values.put("horaFinal", uc14.getHoraFinal());
        values.put("horimetroInicial",uc14.getHorimetroInicial());
        values.put("horimetroFinal",uc14.getHorimetroFinal());
        values.put("paradaInicial1",uc14.getParadaInicial1());
        values.put("paradaFinal1",uc14.getParadaFinal1());
        values.put("descricao1",uc14.getDescricao1());
        values.put("paradaInicial2",uc14.getParadaInicial2());
        values.put("paradaFinal2",uc14.getParadaFinal2());
        values.put("descricao2",uc14.getDescricao2());
        values.put("paradaInicial3",uc14.getParadaInicial3());
        values.put("paradaFinal3",uc14.getParadaFinal3());
        values.put("descricao3",uc14.getDescricao3());
        values.put("paradaInicial4",uc14.getParadaInicial4());
        values.put("paradaFinal4",uc14.getParadaFinal4());
        values.put("descricao4",uc14.getDescricao4());
        values.put("paradaInicial5",uc14.getParadaInicial5());
        values.put("paradaFinal5",uc14.getParadaFinal5());
        values.put("descricao5",uc14.getDescricao5());
        values.put("paradaInicial6",uc14.getParadaInicial6());
        values.put("paradaFinal6",uc14.getParadaFinal6());
        values.put("descricao6",uc14.getDescricao6());
        values.put("paradaInicial7",uc14.getParadaInicial7());
        values.put("paradaFinal7",uc14.getParadaFinal7());
        values.put("descricao7",uc14.getDescricao7());
        values.put("paradaInicial8",uc14.getParadaInicial8());
        values.put("paradaFinal8",uc14.getParadaFinal8());
        values.put("descricao8",uc14.getDescricao8());
        values.put("paradaInicial9",uc14.getParadaInicial9());
        values.put("paradaFinal9",uc14.getParadaFinal9());
        values.put("descricao9",uc14.getDescricao9());
        values.put("paradaInicial10",uc14.getParadaInicial10());
        values.put("paradaFinal10",uc14.getParadaFinal10());
        values.put("descricao10",uc14.getDescricao10());
        values.put("b0Volume",uc14.getB0Vol());
        values.put("b0NumeroDeViagens",uc14.getB0NumViagens());
        values.put("b0Motorista",uc14.getB0Mot());
        values.put("b1Volume",uc14.getB1Vol());
        values.put("b1NumeroDeViagens",uc14.getB1NumViagens());
        values.put("b1Motorista",uc14.getB1Mot());
        values.put("b2Volume",uc14.getB2Vol());
        values.put("b2NumeroDeViagens",uc14.getB2NumViagens());
        values.put("b2Motorista",uc14.getB2Mot());
        values.put("b4Volume",uc14.getB4Vol());
        values.put("b4NumeroDeViagens",uc14.getB4NumViagens());
        values.put("b4Motorista",uc14.getB4Mot());
        values.put("aimVolume",uc14.getAimVol());
        values.put("aimNumeroDeViagens",uc14.getAimNumViagens());
        values.put("aimMotorista",uc14.getAimMot());
        values.put("aifVolume",uc14.getAifVol());
        values.put("aifNumeroDeViagens",uc14.getAifNumViagens());
        values.put("aifMotorista",uc14.getAifMot());
        values.put("bicaVolume",uc14.getBicaVol());
        values.put("bicaNumeroDeViagens",uc14.getBicaNumViagens());
        values.put("bicaMotorista",uc14.getBicaMot());
        values.put("areiaMediaPracaToco",uc14.getAmprToco());
        values.put("areiaMediaPracaTruck",uc14.getAmprTruck());
        values.put("areiaMediaPracaCarreta",uc14.getAmprCarreta());
        values.put("areiaMediaPracaAxor",uc14.getAmprAxor());
        values.put("areiaMediaPracaObs",uc14.getAmprObs());
        values.put("areiaMediaUmToco",uc14.getAmumToco());
        values.put("areiaMediaUmTruck",uc14.getAmumTruck());
        values.put("areiaMediaUmCarreta",uc14.getAmumCarreta());
        values.put("areiaMediaUmAxor",uc14.getAmumAxor());
        values.put("areiaMediaUmObs",uc14.getAmumObs());
        values.put("areiaFinaToco",uc14.getAfToco());
        values.put("areiaFinaTruck",uc14.getAfTruck());
        values.put("areiaFinaCarreta",uc14.getAfCarreta());
        values.put("areiaFinaAxor",uc14.getAfAxor());
        values.put("areiaFinaObs",uc14.getAfObs());
        values.put("pedriscoToco",uc14.getPedToco());
        values.put("pedriscoTruck",uc14.getPedTruck());
        values.put("pedriscoCarreta",uc14.getPedCarreta());
        values.put("pedriscoAxor",uc14.getPedAxor());
        values.put("pedriscoObs",uc14.getPedObs());
        values.put("bicaPracaToco",uc14.getBicaPrToco());
        values.put("bicaPracaTruck",uc14.getBicaPrTruck());
        values.put("bicaPracaCarreta",uc14.getBicaPrCarreta());
        values.put("bicaPracaAxor",uc14.getBicaPrAxor());
        values.put("bicaPracaObs",uc14.getBicaPrObs());
        values.put("bica790Toco",uc14.getBica790Toco());
        values.put("bica790Truck",uc14.getBica790Truck());
        values.put("bica790Carreta",uc14.getBica790Carreta());
        values.put("bica790Axor",uc14.getBica790Axor());
        values.put("bica790Obs",uc14.getBica790Obs());
        values.put("bicaUmToco",uc14.getBicaUmToco());
        values.put("bicaUmTruck",uc14.getBicaUmTruck());
        values.put("bicaUmCarreta",uc14.getBicaUmCarreta());
        values.put("bicaUmAxor",uc14.getBicaUmAxor());
        values.put("bicaUmObs",uc14.getBicaUmObs());
        values.put("brita1PracaToco",uc14.getBr1PrToco());
        values.put("brita1PracaTruck",uc14.getBr1PrTruck());
        values.put("brita1PracaCarreta",uc14.getBr1PrCarreta());
        values.put("brita1PracaAxor",uc14.getBr1PrAxor());
        values.put("brita1PracaObs",uc14.getBr1PrObs());
        values.put("brita119Toco",uc14.getBr119Toco());
        values.put("brita119Truck",uc14.getBr119Truck());
        values.put("brita119Carreta",uc14.getBr119Carreta());
        values.put("brita119Axor",uc14.getBr119Axor());
        values.put("brita119Obs",uc14.getBr119Obs());
        values.put("brita0pracaToco",uc14.getBr0PrToco());
        values.put("brita0pracaTruck",uc14.getBr0PrTruck());
        values.put("brita0pracaCarreta",uc14.getBr0PrCarreta());
        values.put("brita0pracaAxor",uc14.getBr0PrAxor());
        values.put("brita0pracaObs",uc14.getBr0PrObs());
        values.put("brita0UmToco",uc14.getBr0UmToco());
        values.put("brita0UmTruck",uc14.getBr0UmTruck());
        values.put("brita0UmCarreta",uc14.getBr0UmCarreta());
        values.put("brita0UmAxor",uc14.getBr0UmAxor());
        values.put("brita0UmObs",uc14.getBr0UmObs());
        values.put("somaToco",uc14.getSomaToco());
        values.put("somaTruck",uc14.getSomaTruck());
        values.put("somaCarreta",uc14.getSomaCarreta());
        values.put("somaAxor",uc14.getSomaAxor());
        values.put("lanternagem",uc14.getLanternagem());
        values.put("pneus",uc14.getPneus());
        values.put("h2o",uc14.getH2o());
        values.put("oleo",uc14.getOleo());
        values.put("direcao",uc14.getDirecao());
        values.put("freios",uc14.getFreios());
        values.put("parteEletrica",uc14.getParteEletrica());
        values.put("observacoes",uc14.getObservacoes());
        return banco.insert("uc14",null, values);    }



}


