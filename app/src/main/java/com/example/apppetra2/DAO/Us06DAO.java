package com.example.apppetra2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.apppetra2.Classes.Us06;
import com.example.apppetra2.Conexao.Conexao;

public class Us06DAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public Us06DAO(Context context){
        conexao= new Conexao(context);
        banco=conexao.getWritableDatabase();
    }
    public long inserir(Us06 us06) {

        ContentValues values=new ContentValues();
        values.put("motorista",us06.getMotorista());
        values.put("data",us06.getData());
        values.put("horaInicial",us06.getHoraInicial());
        values.put("horaFinal", us06.getHoraFinal());
        values.put("horimetroInicial",us06.getHorimetroInicial());
        values.put("horimetroFinal",us06.getHorimetroFinal());
        values.put("acudeInterno",us06.getAcudeInterno());
        values.put("acudeRestaurante",us06.getAcudeRestaurante());
        values.put("paradaInicial1",us06.getParadaInicial1());
        values.put("paradaFinal1",us06.getParadaFinal1());
        values.put("descricao1",us06.getDescricao1());
        values.put("paradaInicial2",us06.getParadaInicial2());
        values.put("paradaFinal2",us06.getParadaFinal2());
        values.put("descricao2",us06.getDescricao2());
        values.put("paradaInicial3",us06.getParadaInicial3());
        values.put("paradaFinal3",us06.getParadaFinal3());
        values.put("descricao3",us06.getDescricao3());
        values.put("paradaInicial4",us06.getParadaInicial4());
        values.put("paradaFinal4",us06.getParadaFinal4());
        values.put("descricao4",us06.getDescricao4());
        values.put("paradaInicial5",us06.getParadaInicial5());
        values.put("paradaFinal5",us06.getParadaFinal5());
        values.put("descricao5",us06.getDescricao5());
        values.put("paradaInicial6",us06.getParadaInicial6());
        values.put("paradaFinal6",us06.getParadaFinal6());
        values.put("descricao6",us06.getDescricao6());
        values.put("lanternagem",us06.getLanternagem());
        values.put("pneus",us06.getPneus());
        values.put("h2o",us06.getH2o());
        values.put("oleo",us06.getOleo());
        values.put("direcao",us06.getDirecao());
        values.put("freios",us06.getFreios());
        values.put("observacoes",us06.getObservacoes());

        return banco.insert("us06",null, values);    }

}
