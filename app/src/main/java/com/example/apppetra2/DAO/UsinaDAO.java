package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Usina;
import com.example.apppetra2.Conexao.Conexao;

public class UsinaDAO {
    private SQLiteDatabase banco;
    private Conexao conexao;

    public UsinaDAO(Context context){
        conexao=new Conexao(context);
        banco=conexao.getWritableDatabase();

    }

    public long inserir(Usina usina){
        ContentValues values=new ContentValues();
        values.put("nomeEquipamento",usina.getNomeEquipamento());
        values.put("motorista",usina.getMotorista());
        values.put("data",usina.getData());
        values.put("horaInicial",usina.getHoraInicial());
        values.put("horaFinal", usina.getHoraFinal());
        values.put("horimetroInicial",usina.getHorimetroInicial());
        values.put("horimetroFinal",usina.getHorimetroFinal());
        values.put("paradaInicial1",usina.getParadaInicial1());
        values.put("paradaFinal1",usina.getParadaFinal1());
        values.put("descricao1",usina.getDescricao1());
        values.put("paradaInicial2",usina.getParadaInicial2());
        values.put("paradaFinal2",usina.getParadaFinal2());
        values.put("descricao2",usina.getDescricao2());
        values.put("paradaInicial3",usina.getParadaInicial3());
        values.put("paradaFinal3",usina.getParadaFinal3());
        values.put("descricao3",usina.getDescricao3());
        values.put("paradaInicial4",usina.getParadaInicial4());
        values.put("paradaFinal4",usina.getParadaFinal4());
        values.put("descricao4",usina.getDescricao4());
        values.put("paradaInicial5",usina.getParadaInicial5());
        values.put("paradaFinal5",usina.getParadaFinal5());
        values.put("descricao5",usina.getDescricao5());
        values.put("paradaInicial6",usina.getParadaInicial6());
        values.put("paradaFinal6",usina.getParadaFinal6());
        values.put("descricao6",usina.getDescricao6());
        values.put("paradaInicial7",usina.getParadaInicial7());
        values.put("paradaFinal7",usina.getParadaFinal7());
        values.put("descricao7",usina.getDescricao7());
        values.put("paradaInicial8",usina.getParadaInicial8());
        values.put("paradaFinal8",usina.getParadaFinal8());
        values.put("descricao8",usina.getDescricao8());
        values.put("paradaInicial9",usina.getParadaInicial9());
        values.put("paradaFinal9",usina.getParadaFinal9());
        values.put("descricao9",usina.getDescricao9());
        values.put("paradaInicial10",usina.getParadaInicial10());
        values.put("paradaFinal10",usina.getParadaFinal10());
        values.put("descricao10",usina.getDescricao10());
        values.put("motorista1",usina.getMotorista1());
        values.put("tracoFacil1",usina.getTf1());
        values.put("areiaMedia1",usina.getAm1());
        values.put("brita01",usina.getB01());
        values.put("brita11",usina.getB11());
        values.put("somaMotorista1",usina.getMot1Soma());
        values.put("motorista2",usina.getMotorista2());
        values.put("tracoFacil2",usina.getTf2());
        values.put("areiaMedia2",usina.getAm2());
        values.put("brita02",usina.getB02());
        values.put("brita12",usina.getB12());
        values.put("somaMotorista2",usina.getMot2Soma());
        values.put("motorista3",usina.getMotorista3());
        values.put("tracoFacil3",usina.getTf3());
        values.put("areiaMedia3",usina.getAm3());
        values.put("brita03",usina.getB03());
        values.put("brita13",usina.getB13());
        values.put("somaMotorista3",usina.getMot3Soma());
        values.put("motorista4",usina.getMotorista4());
        values.put("tracoFacil4",usina.getTf4());
        values.put("areiaMedia4",usina.getAm4());
        values.put("brita04",usina.getB04());
        values.put("brita14",usina.getB14());
        values.put("somaMotorista4",usina.getMot4Soma());
        values.put("motorista5",usina.getMotorista5());
        values.put("tracoFacil5",usina.getTf5());
        values.put("areiaMedia5",usina.getAm5());
        values.put("brita05",usina.getB05());
        values.put("brita15",usina.getB15());
        values.put("somaMotorista5",usina.getMot5Soma());
        values.put("motorista6",usina.getMotorista6());
        values.put("tracoFacil6",usina.getTf6());
        values.put("areiaMedia6",usina.getAm6());
        values.put("brita06",usina.getB06());
        values.put("brita16",usina.getB16());
        values.put("somaMotorista6",usina.getMot6Soma());
        values.put("bandeja",usina.getBandeja());
        values.put("rolo",usina.getRolo());
        values.put("rolete",usina.getRolete());
        values.put("alinhamento",usina.getAlinha());
        values.put("pedraEngaiolada",usina.getEgaiolada());
        values.put("observacoes",usina.getObservacoes());
        return banco.insert("usina",null, values);
    }
}
