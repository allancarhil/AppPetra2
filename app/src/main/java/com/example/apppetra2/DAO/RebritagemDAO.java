package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Rebritagem;
import com.example.apppetra2.Conexao.Conexao;

public class RebritagemDAO {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public  RebritagemDAO(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }

    public long inserir(Rebritagem rebritagem) {
        ContentValues values = new ContentValues();
        values.put("motorista", rebritagem.getMotorista());
        values.put("data", rebritagem.getData());
        values.put("horaInicial", rebritagem.getHoraInicial());
        values.put("horaFinal", rebritagem.getHoraFinal());
        values.put("horimetroInicialUa02", rebritagem.getHorimetroInicialUa02());
        values.put("horimetroFinalUa02", rebritagem.getHorimetroFinalUa02());
        values.put("horimetroInicialUa03", rebritagem.getHorimetroInicialUa03());
        values.put("horimetroFinalUa03", rebritagem.getHorimetroFinalUa03());
        values.put("horimetroInicialUa04", rebritagem.getHorimetroInicialUa04());
        values.put("horimetroFinalUa04", rebritagem.getHorimetroFinalUa04());
        values.put("horimetroInicialS3000", rebritagem.getHorimetroInicialS3000());
        values.put("horimetroFinalS3000", rebritagem.getHorimetroFinalS3000());
        values.put("horimetroInicialH4000", rebritagem.getHorimetroInicialH4000());
        values.put("horimetroFinalH4000", rebritagem.getHorimetroFinalH4000());
        values.put("horimetroInicialRemco", rebritagem.getHorimetroInicialRemco());
        values.put("horimetroFinalRemco", rebritagem.getHorimetroFinalRemco());
        values.put("balancaUtc04", rebritagem.getBalancaUtc04());
        values.put("balancaUtc05", rebritagem.getBalancaUtc05());

        values.put("paradaInicial1Ur01",rebritagem.getParadaInicial1Cr1());
        values.put("paradaFinal1Ur01",rebritagem.getParadaFinal1Cr1());
        values.put("equipamento1Ur01",rebritagem.getEquipamento1Cr1());
        values.put("descricao1Ur01",rebritagem.getDescricao1Cr1());

        values.put("paradaInicial2Ur01",rebritagem.getParadaInicial2Cr1());
        values.put("paradaFinal2Ur01",rebritagem.getParadaFinal2Cr1());
        values.put("equipamento2Ur01",rebritagem.getEquipamento2Cr1());
        values.put("descricao2Ur01",rebritagem.getDescricao2Cr1());

        values.put("paradaInicial3Ur01",rebritagem.getParadaInicial3Cr1());
        values.put("paradaFinal3Ur01",rebritagem.getParadaFinal3Cr1());
        values.put("equipamento3Ur01",rebritagem.getEquipamento3Cr1());
        values.put("descricao3Ur01",rebritagem.getDescricao3Cr1());

        values.put("paradaInicial4Ur01",rebritagem.getParadaInicial4Cr1());
        values.put("paradaFinal4Ur01",rebritagem.getParadaFinal4Cr1());
        values.put("equipamento4Ur01",rebritagem.getEquipamento4Cr1());
        values.put("descricao4Ur01",rebritagem.getDescricao4Cr1());

        values.put("paradaInicial5Ur01",rebritagem.getParadaInicial5Cr1());
        values.put("paradaFinal5Ur01",rebritagem.getParadaFinal5Cr1());
        values.put("equipamento5Ur01",rebritagem.getEquipamento5Cr1());
        values.put("descricao5Ur01",rebritagem.getDescricao5Cr1());

        values.put("paradaInicial6Ur01",rebritagem.getParadaInicial6Cr1());
        values.put("paradaFinal6Ur01",rebritagem.getParadaFinal6Cr1());
        values.put("equipamento6Ur01",rebritagem.getEquipamento6Cr1());
        values.put("descricao6Ur01",rebritagem.getDescricao6Cr1());

        values.put("paradaInicial7Ur01",rebritagem.getParadaInicial7Cr1());
        values.put("paradaFinal7Ur01",rebritagem.getParadaFinal7Cr1());
        values.put("equipamento7Ur01",rebritagem.getEquipamento7Cr1());
        values.put("descricao7Ur01",rebritagem.getDescricao7Cr1());

        values.put("paradaInicial8Ur01",rebritagem.getParadaInicial8Cr1());
        values.put("paradaFinal8Ur01",rebritagem.getParadaFinal8Cr1());
        values.put("equipamento8Ur01",rebritagem.getEquipamento8Cr1());
        values.put("descricao8Ur01",rebritagem.getDescricao8Cr1());


        values.put("paradaInicial9Ur01",rebritagem.getParadaInicial9Cr1());
        values.put("paradaFinal9Ur01",rebritagem.getParadaFinal9Cr1());
        values.put("equipamento9Ur01",rebritagem.getEquipamento9Cr1());
        values.put("descricao9Ur01",rebritagem.getDescricao9Cr1());

        values.put("paradaInicial10Ur01",rebritagem.getParadaInicial10Cr1());
        values.put("paradaFinal10Ur01",rebritagem.getParadaFinal10Cr1());
        values.put("equipamento10Ur01",rebritagem.getEquipamento10Cr1());
        values.put("descricao10Ur01",rebritagem.getDescricao10Cr1());

        values.put("paradaInicial11Ur01",rebritagem.getParadaInicial11Cr1());
        values.put("paradaFinal11Ur01",rebritagem.getParadaFinal11Cr1());
        values.put("equipamento11Ur01",rebritagem.getEquipamento11Cr1());
        values.put("descricao11Ur01",rebritagem.getDescricao11Cr1());

        values.put("paradaInicial12Ur01",rebritagem.getParadaInicial12Cr1());
        values.put("paradaFinal12Ur01",rebritagem.getParadaFinal12Cr1());
        values.put("equipamento12Ur01",rebritagem.getEquipamento12Cr1());
        values.put("descricao12Ur01",rebritagem.getDescricao12Cr1());

        values.put("paradaInicial13Ur01",rebritagem.getParadaInicial13Cr1());
        values.put("paradaFinal13Ur01",rebritagem.getParadaFinal13Cr1());
        values.put("equipamento13Ur01",rebritagem.getEquipamento13Cr1());
        values.put("descricao13Ur01",rebritagem.getDescricao13Cr1());

        values.put("paradaInicial14Ur01",rebritagem.getParadaInicial14Cr1());
        values.put("paradaFinal14Ur01",rebritagem.getParadaFinal14Cr1());
        values.put("equipamento14Ur01",rebritagem.getEquipamento14Cr1());
        values.put("descricao14Ur01",rebritagem.getDescricao14Cr1());

        values.put("paradaInicial15Ur01",rebritagem.getParadaInicial15Cr1());
        values.put("paradaFinal15Ur01",rebritagem.getParadaFinal15Cr1());
        values.put("equipamento15Ur01",rebritagem.getEquipamento15Cr1());
        values.put("descricao15Ur01",rebritagem.getDescricao15Cr1());

        values.put("metalUtc02",rebritagem.getMetalUtc02());
        values.put("engaiolamentoUa02",rebritagem.getEngalUa02());
        values.put("engaiolamentoUr01",rebritagem.getEngalUr01());




        values.put("paradaInicial1Ur02",rebritagem.getParadaInicial1Cr2());
        values.put("paradaFinal1Ur02",rebritagem.getParadaFinal1Cr2());
        values.put("equipamento1Ur02",rebritagem.getEquipamento1Cr2());
        values.put("descricao1Ur02",rebritagem.getDescricao1Cr2());

        values.put("paradaInicial2Ur02",rebritagem.getParadaInicial2Cr2());
        values.put("paradaFinal2Ur02",rebritagem.getParadaFinal2Cr2());
        values.put("equipamento2Ur02",rebritagem.getEquipamento2Cr2());
        values.put("descricao2Ur02",rebritagem.getDescricao2Cr2());

        values.put("paradaInicial3Ur02",rebritagem.getParadaInicial3Cr2());
        values.put("paradaFinal3Ur02",rebritagem.getParadaFinal3Cr2());
        values.put("equipamento3Ur02",rebritagem.getEquipamento3Cr2());
        values.put("descricao3Ur02",rebritagem.getDescricao3Cr2());

        values.put("paradaInicial4Ur02",rebritagem.getParadaInicial4Cr2());
        values.put("paradaFinal4Ur02",rebritagem.getParadaFinal4Cr2());
        values.put("equipamento4Ur02",rebritagem.getEquipamento4Cr2());
        values.put("descricao4Ur02",rebritagem.getDescricao4Cr2());

        values.put("paradaInicial5Ur02",rebritagem.getParadaInicial5Cr2());
        values.put("paradaFinal5Ur02",rebritagem.getParadaFinal5Cr2());
        values.put("equipamento5Ur02",rebritagem.getEquipamento5Cr2());
        values.put("descricao5Ur02",rebritagem.getDescricao5Cr2());

        values.put("paradaInicial6Ur02",rebritagem.getParadaInicial6Cr2());
        values.put("paradaFinal6Ur02",rebritagem.getParadaFinal6Cr2());
        values.put("equipamento6Ur02",rebritagem.getEquipamento6Cr2());
        values.put("descricao6Ur02",rebritagem.getDescricao6Cr2());

        values.put("paradaInicial7Ur02",rebritagem.getParadaInicial7Cr2());
        values.put("paradaFinal7Ur02",rebritagem.getParadaFinal7Cr2());
        values.put("equipamento7Ur02",rebritagem.getEquipamento7Cr2());
        values.put("descricao7Ur02",rebritagem.getDescricao7Cr2());

        values.put("paradaInicial8Ur02",rebritagem.getParadaInicial8Cr2());
        values.put("paradaFinal8Ur02",rebritagem.getParadaFinal8Cr2());
        values.put("equipamento8Ur02",rebritagem.getEquipamento8Cr2());
        values.put("descricao8Ur02",rebritagem.getDescricao8Cr2());


        values.put("paradaInicial9Ur02",rebritagem.getParadaInicial9Cr2());
        values.put("paradaFinal9Ur02",rebritagem.getParadaFinal9Cr2());
        values.put("equipamento9Ur02",rebritagem.getEquipamento9Cr2());
        values.put("descricao9Ur02",rebritagem.getDescricao9Cr2());

        values.put("paradaInicial10Ur02",rebritagem.getParadaInicial10Cr2());
        values.put("paradaFinal10Ur02",rebritagem.getParadaFinal10Cr2());
        values.put("equipamento10Ur02",rebritagem.getEquipamento10Cr2());
        values.put("descricao10Ur02",rebritagem.getDescricao10Cr2());

        values.put("paradaInicial11Ur02",rebritagem.getParadaInicial11Cr2());
        values.put("paradaFinal11Ur02",rebritagem.getParadaFinal11Cr2());
        values.put("equipamento11Ur02",rebritagem.getEquipamento11Cr2());
        values.put("descricao11Ur02",rebritagem.getDescricao11Cr2());

        values.put("paradaInicial12Ur02",rebritagem.getParadaInicial12Cr2());
        values.put("paradaFinal12Ur02",rebritagem.getParadaFinal12Cr2());
        values.put("equipamento12Ur02",rebritagem.getEquipamento12Cr2());
        values.put("descricao12Ur02",rebritagem.getDescricao12Cr2());

        values.put("paradaInicial13Ur02",rebritagem.getParadaInicial13Cr2());
        values.put("paradaFinal13Ur02",rebritagem.getParadaFinal13Cr2());
        values.put("equipamento13Ur02",rebritagem.getEquipamento13Cr2());
        values.put("descricao13Ur02",rebritagem.getDescricao13Cr2());

        values.put("paradaInicial14Ur02",rebritagem.getParadaInicial14Cr2());
        values.put("paradaFinal14Ur02",rebritagem.getParadaFinal14Cr2());
        values.put("equipamento14Ur02",rebritagem.getEquipamento14Cr2());
        values.put("descricao14Ur02",rebritagem.getDescricao14Cr2());

        values.put("paradaInicial15Ur02",rebritagem.getParadaInicial15Cr2());
        values.put("paradaFinal15Ur02",rebritagem.getParadaFinal15Cr2());
        values.put("equipamento15Ur02",rebritagem.getEquipamento15Cr2());
        values.put("descricao15Ur02",rebritagem.getDescricao15Cr2());


        values.put("metalUtc11",rebritagem.getMetalUtc11());
        values.put("engaiolamentoUr02",rebritagem.getEngalUr02());

        values.put("paradaInicial1Ur03",rebritagem.getParadaInicial1Cr3());
        values.put("paradaFinal1Ur03",rebritagem.getParadaFinal1Cr3());
        values.put("equipamento1Ur03",rebritagem.getEquipamento1Cr3());
        values.put("descricao1Ur03",rebritagem.getDescricao1Cr3());

        values.put("paradaInicial2Ur03",rebritagem.getParadaInicial2Cr3());
        values.put("paradaFinal2Ur03",rebritagem.getParadaFinal2Cr3());
        values.put("equipamento2Ur03",rebritagem.getEquipamento2Cr3());
        values.put("descricao2Ur03",rebritagem.getDescricao2Cr3());

        values.put("paradaInicial3Ur03",rebritagem.getParadaInicial3Cr3());
        values.put("paradaFinal3Ur03",rebritagem.getParadaFinal3Cr3());
        values.put("equipamento3Ur03",rebritagem.getEquipamento3Cr3());
        values.put("descricao3Ur03",rebritagem.getDescricao3Cr3());

        values.put("paradaInicial4Ur03",rebritagem.getParadaInicial4Cr3());
        values.put("paradaFinal4Ur03",rebritagem.getParadaFinal4Cr3());
        values.put("equipamento4Ur03",rebritagem.getEquipamento4Cr3());
        values.put("descricao4Ur03",rebritagem.getDescricao4Cr3());

        values.put("paradaInicial5Ur03",rebritagem.getParadaInicial5Cr3());
        values.put("paradaFinal5Ur03",rebritagem.getParadaFinal5Cr3());
        values.put("equipamento5Ur03",rebritagem.getEquipamento5Cr3());
        values.put("descricao5Ur03",rebritagem.getDescricao5Cr3());

        values.put("paradaInicial6Ur03",rebritagem.getParadaInicial6Cr3());
        values.put("paradaFinal6Ur03",rebritagem.getParadaFinal6Cr3());
        values.put("equipamento6Ur03",rebritagem.getEquipamento6Cr3());
        values.put("descricao6Ur03",rebritagem.getDescricao6Cr3());

        values.put("paradaInicial7Ur03",rebritagem.getParadaInicial7Cr3());
        values.put("paradaFinal7Ur03",rebritagem.getParadaFinal7Cr3());
        values.put("equipamento7Ur03",rebritagem.getEquipamento7Cr3());
        values.put("descricao7Ur03",rebritagem.getDescricao7Cr3());

        values.put("paradaInicial8Ur03",rebritagem.getParadaInicial8Cr3());
        values.put("paradaFinal8Ur03",rebritagem.getParadaFinal8Cr3());
        values.put("equipamento8Ur03",rebritagem.getEquipamento8Cr3());
        values.put("descricao8Ur03",rebritagem.getDescricao8Cr3());


        values.put("paradaInicial9Ur03",rebritagem.getParadaInicial9Cr3());
        values.put("paradaFinal9Ur03",rebritagem.getParadaFinal9Cr3());
        values.put("equipamento9Ur03",rebritagem.getEquipamento9Cr3());
        values.put("descricao9Ur03",rebritagem.getDescricao9Cr3());

        values.put("paradaInicial10Ur03",rebritagem.getParadaInicial10Cr3());
        values.put("paradaFinal10Ur03",rebritagem.getParadaFinal10Cr3());
        values.put("equipamento10Ur03",rebritagem.getEquipamento10Cr3());
        values.put("descricao10Ur03",rebritagem.getDescricao10Cr3());

        values.put("paradaInicial11Ur03",rebritagem.getParadaInicial11Cr3());
        values.put("paradaFinal11Ur03",rebritagem.getParadaFinal11Cr3());
        values.put("equipamento11Ur03",rebritagem.getEquipamento11Cr3());
        values.put("descricao11Ur03",rebritagem.getDescricao11Cr3());

        values.put("paradaInicial12Ur03",rebritagem.getParadaInicial12Cr3());
        values.put("paradaFinal12Ur03",rebritagem.getParadaFinal12Cr3());
        values.put("equipamento12Ur03",rebritagem.getEquipamento12Cr3());
        values.put("descricao12Ur03",rebritagem.getDescricao12Cr3());

        values.put("paradaInicial13Ur03",rebritagem.getParadaInicial13Cr3());
        values.put("paradaFinal13Ur03",rebritagem.getParadaFinal13Cr3());
        values.put("equipamento13Ur03",rebritagem.getEquipamento13Cr3());
        values.put("descricao13Ur03",rebritagem.getDescricao13Cr3());

        values.put("paradaInicial14Ur03",rebritagem.getParadaInicial14Cr3());
        values.put("paradaFinal14Ur03",rebritagem.getParadaFinal14Cr3());
        values.put("equipamento14Ur03",rebritagem.getEquipamento14Cr3());
        values.put("descricao14Ur03",rebritagem.getDescricao14Cr3());

        values.put("paradaInicial15Ur03",rebritagem.getParadaInicial15Cr3());
        values.put("paradaFinal15Ur03",rebritagem.getParadaFinal15Cr3());
        values.put("equipamento15Ur03",rebritagem.getEquipamento15Cr3());
        values.put("descricao15Ur03",rebritagem.getDescricao15Cr3());


        values.put("metalUtc09",rebritagem.getMetalUtc09());


        values.put("oleoS3000",rebritagem.getOleoS3000());
        values.put("oleoH4000",rebritagem.getOleoH4000());
        values.put("bandejas",rebritagem.getBandejas());
        values.put("rolosDePe",rebritagem.getRolos());
        values.put("skides",rebritagem.getSkides());
        values.put("temperaturaCartuchoRemco",rebritagem.getTempCartuchoRemco());
        values.put("temperaturaMotorRemco",rebritagem.getTempMotorRemco());
        values.put("vibracaoRemco",rebritagem.getVibraRemco());
        values.put("pressaoH4000",rebritagem.getPressaoH4000());
        values.put("pressaoS3000",rebritagem.getPressaoS3000());
        values.put("amperimetros",rebritagem.getAmperimetros());

        values.put("volumeRachao",rebritagem.getInicialRachao());
        values.put("volumeB4",rebritagem.getInicialB4());
        values.put("volumeB2",rebritagem.getInicialB2());
        values.put("retorno",rebritagem.getRetorno());
        values.put("retornoBicaPorcent",rebritagem.getRetornoBicaPorcent());
        values.put("retornoBicaHorario",rebritagem.getRetornoBicaHorario());
        values.put("retornoB0Porcent",rebritagem.getRetornoB0Porcent());
        values.put("retornoB0Horario",rebritagem.getRetornoB0Horario());
        values.put("retornoB1Porcent",rebritagem.getRetornoB1Porcent());
        values.put("retornoB1Horario",rebritagem.getRetornoB1Horario());
        values.put("retornoPedriscoPorcent",rebritagem.getRetornoPedriscoPorcent());
        values.put("retornoPedriscoHorario",rebritagem.getRetornoPedriscoHorario());

        values.put("observacoes",rebritagem.getObservacoes());


        return banco.insert("rebritagem",null, values);
    }
}
