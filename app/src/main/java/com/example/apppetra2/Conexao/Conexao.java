package com.example.apppetra2.Conexao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String name="banco.db";
    private static final int version=1;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table funcionario (id integer PRIMARY KEY autoincrement, " +
                " nome varchar(50), " +
                " cpf varchar(50), " +
                " dataNasc varchar(50), " +
                " telefone varchar(50), " +
                " matricula varchar(50), " +
                " endereco varchar(50), " +
                " senha varchar(50) ) ");



        db.execSQL("create table us36 (id integer PRIMARY KEY autoincrement, " +
                " motorista varchar(50), " +
                " data varchar(50), " +
                " horaInicial varchar(50), " +
                " horaFinal varchar(50), " +
                " kmInicial varchar(50), " +
                " kmFinal varchar(50), " +
                " servicos varchar (50), " +
                " observacoes varchar(200), " +
                " lanternagem varchar(20), " +
                " pneus varchar(20) ) ");



        db.execSQL("create table mn01(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "banco varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "Lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "observacoes varchar(200))");



        db.execSQL("create table us06(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetrofinal varchar(50)," +
                "acudeInterno varchar(50)," +
                "acudeRestaurante varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "Lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "observacoes varchar(200))");


        db.execSQL("create table ut07(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "condicaoPistaObservacoes varchar(200),"+
                "condicaoPista varchar(20),"+
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +


                "numViagens78078 varchar(20),"+
                "numViagens78089 varchar(20),"+
                "numViagens780910 varchar(20),"+
                "numViagens7801011 varchar(20),"+
                "numViagens7801112 varchar(20),"+
                "numViagens7801213 varchar(20),"+
                "numViagens7801314 varchar(20),"+
                "numViagens7801415 varchar(20),"+
                "numViagens7801516 varchar(20),"+
                "numViagens7801617 varchar(20),"+
                "numViagens7801718 varchar(20),"+

                "obs78 varchar(200),"+
                "obs89 varchar(200),"+
                "obs910 varchar(200),"+
                "obs1011 varchar(200),"+
                "obs1112 varchar(200),"+
                "obs1213 varchar(200),"+
                "obs1314 varchar(200),"+
                "obs1415 varchar(200),"+
                "obs1516 varchar(200),"+
                "obs1617 varchar(200),"+
                "obs1718 varchar(200),"+

                "numViagensSoma780 varchar(20),"+
                "numViagensAm varchar(20),"+
                "numViagensBicaCont varchar(20),"+
                "numViagensAf varchar(20),"+
                "numViagensPedrisco varchar(20),"+
                "numViagensBicaPr varchar(20),"+
                "numViagensBica790 varchar(20),"+
                "numViagensBicaUm varchar(20),"+
                "numViagensBr1Pr varchar(20),"+
                "numViagensBr119 varchar(20),"+
                "numViagensBr0Pr varchar(20),"+
                "numViagensBr0Um varchar(20),"+
                "numViagensBicaForro varchar(20),"+
                "numViagensB0 varchar(20),"+
                "numViagensB1 varchar(20),"+
                "numViagensB2 varchar(20),"+
                "numViagensAim varchar(20),"+
                "numViagensFundo varchar(20),"+
                "numViagens780 varchar(20),"+
                "numViagens790 varchar(20),"+
                "numViagens800 varchar(20),"+
                "numViagens810 varchar(20),"+

                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20)," +
                "observacoes varchar(200))");





        db.execSQL("create table ut08(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "condicaoPistaObservacoes varchar(200),"+
                "condicaoPista varchar(20),"+
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +


                "numViagens78078 varchar(20),"+
                "numViagens78089 varchar(20),"+
                "numViagens780910 varchar(20),"+
                "numViagens7801011 varchar(20),"+
                "numViagens7801112 varchar(20),"+
                "numViagens7801213 varchar(20),"+
                "numViagens7801314 varchar(20),"+
                "numViagens7801415 varchar(20),"+
                "numViagens7801516 varchar(20),"+
                "numViagens7801617 varchar(20),"+
                "numViagens7801718 varchar(20),"+


                "obs78 varchar(200),"+
                "obs89 varchar(200),"+
                "obs910 varchar(200),"+
                "obs1011 varchar(200),"+
                "obs1112 varchar(200),"+
                "obs1213 varchar(200),"+
                "obs1314 varchar(200),"+
                "obs1415 varchar(200),"+
                "obs1516 varchar(200),"+
                "obs1617 varchar(200),"+
                "obs1718 varchar(200),"+

                "numViagensSoma780 varchar(20),"+
                "numViagensAm varchar(20),"+
                "numViagensBicaCont varchar(20),"+
                "numViagensAf varchar(20),"+
                "numViagensPedrisco varchar(20),"+
                "numViagensBicaPr varchar(20),"+
                "numViagensBica790 varchar(20),"+
                "numViagensBicaUm varchar(20),"+
                "numViagensBr1Pr varchar(20),"+
                "numViagensBr119 varchar(20),"+
                "numViagensBr0Pr varchar(20),"+
                "numViagensBr0Um varchar(20),"+
                "numViagensBicaForro varchar(20),"+
                "numViagensB0 varchar(20),"+
                "numViagensB1 varchar(20),"+
                "numViagensB2 varchar(20),"+
                "numViagensAim varchar(20),"+
                "numViagensFundo varchar(20),"+
                "numViagens780 varchar(20),"+
                "numViagens790 varchar(20),"+
                "numViagens800 varchar(20),"+
                "numViagens810 varchar(20),"+

                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20)," +
                "observacoes varchar(200))");




        db.execSQL("create table ut37(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "condicaoPistaObservacoes varchar(200),"+
                "condicaoPista varchar(20),"+
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +


                "numViagens78078 varchar(20),"+
                "numViagens78089 varchar(20),"+
                "numViagens780910 varchar(20),"+
                "numViagens7801011 varchar(20),"+
                "numViagens7801112 varchar(20),"+
                "numViagens7801213 varchar(20),"+
                "numViagens7801314 varchar(20),"+
                "numViagens7801415 varchar(20),"+
                "numViagens7801516 varchar(20),"+
                "numViagens7801617 varchar(20),"+
                "numViagens7801718 varchar(20),"+


                "obs78 varchar(200),"+
                "obs89 varchar(200),"+
                "obs910 varchar(200),"+
                "obs1011 varchar(200),"+
                "obs1112 varchar(200),"+
                "obs1213 varchar(200),"+
                "obs1314 varchar(200),"+
                "obs1415 varchar(200),"+
                "obs1516 varchar(200),"+
                "obs1617 varchar(200),"+
                "obs1718 varchar(200),"+

                "numViagensSoma780 varchar(20),"+
                "numViagensAm varchar(20),"+
                "numViagensBicaCont varchar(20),"+
                "numViagensAf varchar(20),"+
                "numViagensPedrisco varchar(20),"+
                "numViagensBicaPr varchar(20),"+
                "numViagensBica790 varchar(20),"+
                "numViagensBicaUm varchar(20),"+
                "numViagensBr1Pr varchar(20),"+
                "numViagensBr119 varchar(20),"+
                "numViagensBr0Pr varchar(20),"+
                "numViagensBr0Um varchar(20),"+
                "numViagensBicaForro varchar(20),"+
                "numViagensB0 varchar(20),"+
                "numViagensB1 varchar(20),"+
                "numViagensB2 varchar(20),"+
                "numViagensAim varchar(20),"+
                "numViagensFundo varchar(20),"+
                "numViagens780 varchar(20),"+
                "numViagens790 varchar(20),"+
                "numViagens800 varchar(20),"+
                "numViagens810 varchar(20),"+

                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20)," +
                "observacoes varchar(200))");




        db.execSQL("create table up0506(id integer PRIMARY KEY autoincrement, " +
                "turno varchar(50),"+
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetrofinal varchar(50)," +
                "banco varchar(20),"+
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "furo1 varchar(50)," +
                "furo2 varchar(50)," +
                "furo3 varchar(50)," +
                "furo4 varchar(50)," +
                "furo5 varchar(50)," +
                "furo6 varchar(50)," +
                "furo7 varchar(50)," +
                "furo8 varchar(50)," +
                "furo9 varchar(50)," +
                "furo10 varchar(50)," +
                "furo11 varchar(50)," +
                "furo12 varchar(50)," +
                "furo13 varchar(50)," +
                "furo14 varchar(50)," +
                "furo15 varchar(50)," +
                "furo16 varchar(50)," +
                "furo17 varchar(50)," +
                "furo18 varchar(50)," +
                "furo19 varchar(50)," +
                "furo20 varchar(50)," +
                "furo21 varchar(50)," +
                "furo22 varchar(50)," +
                "furo23 varchar(50)," +
                "furo24 varchar(50)," +
                "furo25 varchar(50)," +
                "furo26 varchar(50)," +
                "furo27 varchar(50)," +
                "furo28 varchar(50)," +
                "furo29 varchar(50)," +
                "furo30 varchar(50)," +
                "furo31 varchar(50)," +
                "furo32 varchar(50)," +
                "furo33 varchar(50)," +
                "furo34 varchar(50)," +
                "furo35 varchar(50)," +
                "furo36 varchar(50)," +
                "furo37 varchar(50)," +
                "furo38 varchar(50)," +
                "furo39 varchar(50)," +
                "furo40 varchar(50)," +
                "profundidade1 varchar(50)," +
                "profundidade2 varchar(50)," +
                "profundidade3 varchar(50)," +
                "profundidade4 varchar(50)," +
                "profundidade5 varchar(50)," +
                "profundidade6 varchar(50)," +
                "profundidade7 varchar(50)," +
                "profundidade8 varchar(50)," +
                "profundidade9 varchar(50)," +
                "profundidade10 varchar(50)," +
                "profundidade11 varchar(50)," +
                "profundidade12 varchar(50)," +
                "profundidade13 varchar(50)," +
                "profundidade14 varchar(50)," +
                "profundidade15 varchar(50)," +
                "profundidade16 varchar(50)," +
                "profundidade17 varchar(50)," +
                "profundidade18 varchar(50)," +
                "profundidade19 varchar(50)," +
                "profundidade20 varchar(50)," +
                "profundidade21 varchar(50)," +
                "profundidade22 varchar(50)," +
                "profundidade23 varchar(50)," +
                "profundidade24 varchar(50)," +
                "profundidade25 varchar(50)," +
                "profundidade26 varchar(50)," +
                "profundidade27 varchar(50)," +
                "profundidade28 varchar(50)," +
                "profundidade29 varchar(50)," +
                "profundidade30 varchar(50)," +
                "profundidade31 varchar(50)," +
                "profundidade32 varchar(50)," +
                "profundidade33 varchar(50)," +
                "profundidade34 varchar(50)," +
                "profundidade35 varchar(50)," +
                "profundidade36 varchar(50)," +
                "profundidade37 varchar(50)," +
                "profundidade38 varchar(50)," +
                "profundidade39 varchar(50)," +
                "profundidade40 varchar(50)," +
                "bit1 varchar(50)," +
                "bit2 varchar(50)," +
                "bit3 varchar(50)," +
                "bit4 varchar(50)," +
                "bit5 varchar(50)," +
                "bit6 varchar(50)," +
                "bit7 varchar(50)," +
                "bit8 varchar(50)," +
                "bit9 varchar(50)," +
                "bit10 varchar(50)," +
                "bit11 varchar(50)," +
                "bit12 varchar(50)," +
                "bit13 varchar(50)," +
                "bit14 varchar(50)," +
                "bit15 varchar(50)," +
                "bit16 varchar(50)," +
                "bit17 varchar(50)," +
                "bit18 varchar(50)," +
                "bit19 varchar(50)," +
                "bit20 varchar(50)," +
                "bit21 varchar(50)," +
                "bit22 varchar(50)," +
                "bit23 varchar(50)," +
                "bit24 varchar(50)," +
                "bit25 varchar(50)," +
                "bit26 varchar(50)," +
                "bit27 varchar(50)," +
                "bit28 varchar(50)," +
                "bit29 varchar(50)," +
                "bit30 varchar(50)," +
                "bit31 varchar(50)," +
                "bit32 varchar(50)," +
                "bit33 varchar(50)," +
                "bit34 varchar(50)," +
                "bit35 varchar(50)," +
                "bit36 varchar(50)," +
                "bit37 varchar(50)," +
                "bit38 varchar(50)," +
                "bit39 varchar(50)," +
                "bit40 varchar(50),"+
                "somaprofundidade varchar(50),"+
                "lanternagem varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "observacoes varchar(200))");



        db.execSQL("create table uc06(id integer PRIMARY KEY autoincrement, " +

                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "b0Volume varchar(20),"+
                "b0NumeroDeViagens varchar(20),"+
                "b0Motorista varchar(20),"+
                "b1Volume varchar(20),"+
                "b1NumeroDeViagens varchar(20),"+
                "b1Motorista varchar(20),"+
                "b2Volume varchar(20),"+
                "b2NumeroDeViagens varchar(20),"+
                "b2Motorista varchar(20),"+
                "b4Volume varchar(20),"+
                "b4NumeroDeViagens varchar(20),"+
                "b4Motorista varchar(20),"+
                "aimVolume varchar(20),"+
                "aimNumeroDeViagens varchar(20),"+
                "aimMotorista varchar(20),"+
                "aifVolume varchar(20),"+
                "aifNumeroDeViagens varchar(20),"+
                "aifMotorista varchar(20),"+
                "bicaVolume varchar(20),"+
                "bicaNumeroDeViagens varchar(20),"+
                "bicaMotorista varchar(20),"+
                "areiaMediaPracaToco varchar(20),"+
                "areiaMediaPracaTruck varchar(20),"+
                "areiaMediaPracaCarreta varchar(20),"+
                "areiaMediaPracaAxor varchar(20),"+
                "areiaMediaPracaObs varchar(20),"+
                "areiaMediaUmToco varchar(20),"+
                "areiaMediaUmTruck varchar(20),"+
                "areiaMediaUmCarreta varchar(20),"+
                "areiaMediaUmAxor varchar(20),"+
                "areiaMediaUmObs varchar(20),"+
                "areiaFinaToco varchar(20),"+
                "areiaFinaTruck varchar(20),"+
                "areiaFinaCarreta varchar(20),"+
                "areiaFinaAxor varchar(20),"+
                "areiaFinaObs varchar(20),"+
                "pedriscoToco varchar(20),"+
                "pedriscoTruck varchar(20),"+
                "pedriscoCarreta varchar(20),"+
                "pedriscoAxor varchar(20),"+
                "pedriscoObs varchar(20),"+
                "bicaPracaToco varchar(20),"+
                "bicaPracaTruck varchar(20),"+
                "bicaPracaCarreta varchar(20),"+
                "bicaPracaAxor varchar(20),"+
                "bicaPracaObs varchar(20),"+
                "bica790Toco varchar(20),"+
                "bica790Truck varchar(20),"+
                "bica790Carreta varchar(20),"+
                "bica790Axor varchar(20),"+
                "bica790Obs varchar(20),"+
                "bicaUmToco varchar(20),"+
                "bicaUmTruck varchar(20),"+
                "bicaUmCarreta varchar(20),"+
                "bicaUmAxor varchar(20),"+
                "bicaUmObs varchar(20),"+
                "brita1PracaToco varchar(20),"+
                "brita1PracaTruck varchar(20),"+
                "brita1PracaCarreta varchar(20),"+
                "brita1PracaAxor varchar(20),"+
                "brita1PracaObs varchar(20),"+
                "brita119Toco varchar(20),"+
                "brita119Truck varchar(20),"+
                "brita119Carreta varchar(20),"+
                "brita119Axor varchar(20),"+
                "brita119Obs varchar(20),"+
                "brita0PracaToco varchar(20),"+
                "brita0PracaTruck varchar(20),"+
                "brita0PracaCarreta varchar(20),"+
                "brita0PracaAxor varchar(20),"+
                "brita0PracaObs varchar(20),"+
                "brita0UmToco varchar(20),"+
                "brita0UmTruck varchar(20),"+
                "brita0UmCarreta varchar(20),"+
                "brita0UmAxor varchar(20),"+
                "brita0UmObs varchar(20),"+
                "somaToco varchar(20),"+
                "somaTruck varchar(20),"+
                "somaCarreta varchar(20),"+
                "somaAxor varchar(20),"+
                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20),"+
                "observacoes varchar(200))");




        db.execSQL("create table uc14(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "b0Volume varchar(20),"+
                "b0NumeroDeViagens varchar(20),"+
                "b0Motorista varchar(20),"+
                "b1Volume varchar(20),"+
                "b1NumeroDeViagens varchar(20),"+
                "b1Motorista varchar(20),"+
                "b2Volume varchar(20),"+
                "b2NumeroDeViagens varchar(20),"+
                "b2Motorista varchar(20),"+
                "b4Volume varchar(20),"+
                "b4NumeroDeViagens varchar(20),"+
                "b4Motorista varchar(20),"+
                "aimVolume varchar(20),"+
                "aimNumeroDeViagens varchar(20),"+
                "aimMotorista varchar(20),"+
                "aifVolume varchar(20),"+
                "aifNumeroDeViagens varchar(20),"+
                "aifMotorista varchar(20),"+
                "bicaVolume varchar(20),"+
                "bicaNumeroDeViagens varchar(20),"+
                "bicaMotorista varchar(20),"+
                "areiaMediaPracaToco varchar(20),"+
                "areiaMediaPracaTruck varchar(20),"+
                "areiaMediaPracaCarreta varchar(20),"+
                "areiaMediaPracaAxor varchar(20),"+
                "areiaMediaPracaObs varchar(20),"+
                "areiaMediaUmToco varchar(20),"+
                "areiaMediaUmTruck varchar(20),"+
                "areiaMediaUmCarreta varchar(20),"+
                "areiaMediaUmAxor varchar(20),"+
                "areiaMediaUmObs varchar(20),"+
                "areiaFinaToco varchar(20),"+
                "areiaFinaTruck varchar(20),"+
                "areiaFinaCarreta varchar(20),"+
                "areiaFinaAxor varchar(20),"+
                "areiaFinaObs varchar(20),"+
                "pedriscoToco varchar(20),"+
                "pedriscoTruck varchar(20),"+
                "pedriscoCarreta varchar(20),"+
                "pedriscoAxor varchar(20),"+
                "pedriscoObs varchar(20),"+
                "bicaPracaToco varchar(20),"+
                "bicaPracaTruck varchar(20),"+
                "bicaPracaCarreta varchar(20),"+
                "bicaPracaAxor varchar(20),"+
                "bicaPracaObs varchar(20),"+
                "bica790Toco varchar(20),"+
                "bica790Truck varchar(20),"+
                "bica790Carreta varchar(20),"+
                "bica790Axor varchar(20),"+
                "bica790Obs varchar(20),"+
                "bicaUmToco varchar(20),"+
                "bicaUmTruck varchar(20),"+
                "bicaUmCarreta varchar(20),"+
                "bicaUmAxor varchar(20),"+
                "bicaUmObs varchar(20),"+
                "brita1PracaToco varchar(20),"+
                "brita1PracaTruck varchar(20),"+
                "brita1PracaCarreta varchar(20),"+
                "brita1PracaAxor varchar(20),"+
                "brita1PracaObs varchar(20),"+
                "brita119Toco varchar(20),"+
                "brita119Truck varchar(20),"+
                "brita119Carreta varchar(20),"+
                "brita119Axor varchar(20),"+
                "brita119Obs varchar(20),"+
                "brita0PracaToco varchar(20),"+
                "brita0PracaTruck varchar(20),"+
                "brita0PracaCarreta varchar(20),"+
                "brita0PracaAxor varchar(20),"+
                "brita0PracaObs varchar(20),"+
                "brita0UmToco varchar(20),"+
                "brita0UmTruck varchar(20),"+
                "brita0UmCarreta varchar(20),"+
                "brita0UmAxor varchar(20),"+
                "brita0UmObs varchar(20),"+
                "somaToco varchar(20),"+
                "somaTruck varchar(20),"+
                "somaCarreta varchar(20),"+
                "somaAxor varchar(20),"+
                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20),"+
                "observacoes varchar(200))");



        db.execSQL("create table uc07(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "b0Volume varchar(20),"+
                "b0NumeroDeViagens varchar(20),"+
                "b0Motorista varchar(20),"+
                "b1Volume varchar(20),"+
                "b1NumeroDeViagens varchar(20),"+
                "b1Motorista varchar(20),"+
                "b2Volume varchar(20),"+
                "b2NumeroDeViagens varchar(20),"+
                "b2Motorista varchar(20),"+
                "b4Volume varchar(20),"+
                "b4NumeroDeViagens varchar(20),"+
                "b4Motorista varchar(20),"+
                "aimVolume varchar(20),"+
                "aimNumeroDeViagens varchar(20),"+
                "aimMotorista varchar(20),"+
                "aifVolume varchar(20),"+
                "aifNumeroDeViagens varchar(20),"+
                "aifMotorista varchar(20),"+
                "bicaVolume varchar(20),"+
                "bicaNumeroDeViagens varchar(20),"+
                "bicaMotorista varchar(20),"+
                "areiaMediaPracaToco varchar(20),"+
                "areiaMediaPracaTruck varchar(20),"+
                "areiaMediaPracaCarreta varchar(20),"+
                "areiaMediaPracaAxor varchar(20),"+
                "areiaMediaPracaObs varchar(20),"+
                "areiaMediaUmToco varchar(20),"+
                "areiaMediaUmTruck varchar(20),"+
                "areiaMediaUmCarreta varchar(20),"+
                "areiaMediaUmAxor varchar(20),"+
                "areiaMediaUmObs varchar(20),"+
                "areiaFinaToco varchar(20),"+
                "areiaFinaTruck varchar(20),"+
                "areiaFinaCarreta varchar(20),"+
                "areiaFinaAxor varchar(20),"+
                "areiaFinaObs varchar(20),"+
                "pedriscoToco varchar(20),"+
                "pedriscoTruck varchar(20),"+
                "pedriscoCarreta varchar(20),"+
                "pedriscoAxor varchar(20),"+
                "pedriscoObs varchar(20),"+
                "bicaPracaToco varchar(20),"+
                "bicaPracaTruck varchar(20),"+
                "bicaPracaCarreta varchar(20),"+
                "bicaPracaAxor varchar(20),"+
                "bicaPracaObs varchar(20),"+
                "bica790Toco varchar(20),"+
                "bica790Truck varchar(20),"+
                "bica790Carreta varchar(20),"+
                "bica790Axor varchar(20),"+
                "bica790Obs varchar(20),"+
                "bicaUmToco varchar(20),"+
                "bicaUmTruck varchar(20),"+
                "bicaUmCarreta varchar(20),"+
                "bicaUmAxor varchar(20),"+
                "bicaUmObs varchar(20),"+
                "brita1PracaToco varchar(20),"+
                "brita1PracaTruck varchar(20),"+
                "brita1PracaCarreta varchar(20),"+
                "brita1PracaAxor varchar(20),"+
                "brita1PracaObs varchar(20),"+
                "brita119Toco varchar(20),"+
                "brita119Truck varchar(20),"+
                "brita119Carreta varchar(20),"+
                "brita119Axor varchar(20),"+
                "brita119Obs varchar(20),"+
                "brita0PracaToco varchar(20),"+
                "brita0PracaTruck varchar(20),"+
                "brita0PracaCarreta varchar(20),"+
                "brita0PracaAxor varchar(20),"+
                "brita0PracaObs varchar(20),"+
                "brita0UmToco varchar(20),"+
                "brita0UmTruck varchar(20),"+
                "brita0UmCarreta varchar(20),"+
                "brita0UmAxor varchar(20),"+
                "brita0UmObs varchar(20),"+
                "somaToco varchar(20),"+
                "somaTruck varchar(20),"+
                "somaCarreta varchar(20),"+
                "somaAxor varchar(20),"+
                "lanternagem varchar(20)," +
                "pneus varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "direcao varchar(20)," +
                "freios varchar(20)," +
                "parteEletrica varchar(20),"+
                "observacoes varchar(200))");



        db.execSQL("create table uc11(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "lanternagem varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "hidraulico varchar(20)," +
                "observacoes varchar(200))");


        db.execSQL("create table uc13(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "lanternagem varchar(20)," +
                "h2o varchar(20)," +
                "oleo varchar(20)," +
                "hidraulico varchar(20)," +
                "observacoes varchar(200))");


        db.execSQL("create table ub02(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "pedraBritador varchar(20)," +
                "tremonha varchar(20)," +
                "balançaInicial varchar(20)," +
                "balançaFInal varchar(20)," +
                "bandeja varchar(20)," +
                "utc01 varchar(20)," +
                "observacoes varchar(200))");



        db.execSQL("create table usina(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicial varchar(50)," +
                "horimetroFinal varchar(50)," +
                "paradaInicial1 varchar(50)," +
                "paradaFinal1 varchar(50)," +
                "descricao1 varchar(50)," +
                "paradaInicial2 varchar(50)," +
                "paradaFinal2 varchar(50)," +
                "descricao2 varchar(50)," +
                "paradaInicial3 varchar(50)," +
                "paradaFinal3 varchar(50)," +
                "descricao3 varchar(50)," +
                "paradaInicial4 varchar(50)," +
                "paradaFinal4 varchar(50)," +
                "descricao4 varchar(50)," +
                "paradaInicial5 varchar(50)," +
                "paradaFinal5 varchar(50)," +
                "descricao5 varchar(50)," +
                "paradaInicial6 varchar(50)," +
                "paradaFinal6 varchar(50)," +
                "descricao6 varchar(50)," +
                "paradaInicial7 varchar(50)," +
                "paradaFinal7 varchar(50)," +
                "descricao7 varchar(50)," +
                "paradaInicial8 varchar(50)," +
                "paradaFinal8 varchar(50)," +
                "descricao8 varchar(50)," +
                "paradaInicial9 varchar(50)," +
                "paradaFinal9 varchar(50)," +
                "descricao9 varchar(50)," +
                "paradaInicial10 varchar(50)," +
                "paradaFinal10 varchar(50)," +
                "descricao10 varchar(50)," +
                "motorista1 varchar(50)," +
                "tracoFacil1 varchar(50)," +
                "areiaMedia1 varchar(50)," +
                "brita01 varchar(50)," +
                "brita11 varchar(50)," +
                "somaMotorista1 varchar(50)," +
                "motorista2 varchar(50)," +
                "tracoFacil2 varchar(50)," +
                "areiaMedia2 varchar(50)," +
                "brita02 varchar(50)," +
                "brita12 varchar(50)," +
                "somaMotorista2 varchar(50)," +
                "motorista3 varchar(50)," +
                "tracoFacil3 varchar(50)," +
                "areiaMedia3 varchar(50)," +
                "brita03 varchar(50)," +
                "brita13 varchar(50)," +
                "somaMotorista3 varchar(50)," +
                "motorista4 varchar(50)," +
                "tracoFacil4 varchar(50)," +
                "areiaMedia4 varchar(50)," +
                "brita04 varchar(50)," +
                "brita14 varchar(50)," +
                "somaMotorista4 varchar(50)," +
                "motorista5 varchar(50)," +
                "tracoFacil5 varchar(50)," +
                "areiaMedia5 varchar(50)," +
                "brita05 varchar(50)," +
                "brita15 varchar(50)," +
                "somaMotorista5 varchar(50)," +
                "motorista6 varchar(50)," +
                "tracoFacil6 varchar(50)," +
                "areiaMedia6 varchar(50)," +
                "brita06 varchar(50)," +
                "brita16 varchar(50)," +
                "somaMotorista6 varchar(50)," +
                "bandeja varchar(20)," +
                "rolo varchar(20)," +
                "rolete varchar(20)," +
                "alinhamento varchar(20)," +
                "pedraEngaiolada varchar(20)," +
                "observacoes varchar(200))");







        db.execSQL("create table rebritagem(id integer PRIMARY KEY autoincrement, " +
                "motorista varchar(50)," +
                "data varchar(50)," +
                "horaInicial varchar(50)," +
                "horaFinal varchar(50)," +
                "horimetroInicialUa02 varchar(50)," +
                "horimetroFinalUa02 varchar(50)," +
                "horimetroInicialUa03 varchar(50)," +
                "horimetroFinalUa03 varchar(50)," +
                "horimetroInicialUa04 varchar(50)," +
                "horimetroFinalUa04 varchar(50)," +
                "horimetroInicialS3000 varchar(50)," +
                "horimetroFinalS3000 varchar(50)," +
                "horimetroInicialH4000 varchar(50)," +
                "horimetroFinalH4000 varchar(50)," +
                "horimetroInicialRemco varchar(50)," +
                "horimetroFinalRemco varchar(50)," +

                "balancaUtc04 varchar(50)," +
                "balancaUtc05 varchar(50)," +

                "paradaInicial1Ur01 varchar(50)," +
                "paradaFinal1Ur01 varchar(50)," +
                "equipamento1Ur01 varchar(50)," +
                "descricao1Ur01 varchar(50)," +

                "paradaInicial2Ur01 varchar(50)," +
                "paradaFinal2Ur01 varchar(50)," +
                "equipamento2Ur01 varchar(50)," +
                "descricao2Ur01 varchar(50)," +

                "paradaInicial3Ur01 varchar(50)," +
                "paradaFinal3Ur01 varchar(50)," +
                "equipamento3Ur01 varchar(50)," +
                "descricao3Ur01 varchar(50)," +

                "paradaInicial4Ur01 varchar(50)," +
                "paradaFinal4Ur01 varchar(50)," +
                "equipamento4Ur01 varchar(50)," +
                "descricao4Ur01 varchar(50)," +

                "paradaInicial5Ur01 varchar(50)," +
                "paradaFinal5Ur01 varchar(50)," +
                "equipamento5Ur01 varchar(50)," +
                "descricao5Ur01 varchar(50)," +

                "paradaInicial6Ur01 varchar(50)," +
                "paradaFinal6Ur01 varchar(50)," +
                "equipamento6Ur01 varchar(50)," +
                "descricao6Ur01 varchar(50)," +

                "paradaInicial7Ur01 varchar(50)," +
                "paradaFinal7Ur01 varchar(50)," +
                "equipamento7Ur01 varchar(50)," +
                "descricao7Ur01 varchar(50)," +

                "paradaInicial8Ur01 varchar(50)," +
                "paradaFinal8Ur01 varchar(50)," +
                "equipamento8Ur01 varchar(50)," +
                "descricao8Ur01 varchar(50)," +

                "paradaInicial9Ur01 varchar(50)," +
                "paradaFinal9Ur01 varchar(50)," +
                "equipamento9Ur01 varchar(50)," +
                "descricao9Ur01 varchar(50)," +

                "paradaInicial10Ur01 varchar(50)," +
                "paradaFinal10Ur01 varchar(50)," +
                "equipamento10Ur01 varchar(50)," +
                "descricao10Ur01 varchar(50)," +

                "paradaInicial11Ur01 varchar(50)," +
                "paradaFinal11Ur01 varchar(50)," +
                "equipamento11Ur01 varchar(50)," +
                "descricao11Ur01 varchar(50)," +

                "paradaInicial12Ur01 varchar(50)," +
                "paradaFinal12Ur01 varchar(50)," +
                "equipamento12Ur01 varchar(50)," +
                "descricao12Ur01 varchar(50)," +

                "paradaInicial13Ur01 varchar(50)," +
                "paradaFinal13Ur01 varchar(50)," +
                "equipamento13Ur01 varchar(50)," +
                "descricao13Ur01 varchar(50)," +

                "paradaInicial14Ur01 varchar(50)," +
                "paradaFinal14Ur01 varchar(50)," +
                "equipamento14Ur01 varchar(50)," +
                "descricao14Ur01 varchar(50)," +

                "paradaInicial15Ur01 varchar(50)," +
                "paradaFinal15Ur01 varchar(50)," +
                "equipamento15Ur01 varchar(50)," +
                "descricao15Ur01 varchar(50)," +

                "metalUtc02 varchar(50)," +
                "engaiolamentoUa02 varchar(50)," +
                "engaiolamentoUr01 varchar(50)," +

                "paradaInicial1Ur02 varchar(50)," +
                "paradaFinal1Ur02 varchar(50)," +
                "equipamento1Ur02 varchar(50)," +
                "descricao1Ur02 varchar(50)," +

                "paradaInicial2Ur02 varchar(50)," +
                "paradaFinal2Ur02 varchar(50)," +
                "equipamento2Ur02 varchar(50)," +
                "descricao2Ur02 varchar(50)," +

                "paradaInicial3Ur02 varchar(50)," +
                "paradaFinal3Ur02 varchar(50)," +
                "equipamento3Ur02 varchar(50)," +
                "descricao3Ur02 varchar(50)," +

                "paradaInicial4Ur02 varchar(50)," +
                "paradaFinal4Ur02 varchar(50)," +
                "equipamento4Ur02 varchar(50)," +
                "descricao4Ur02 varchar(50)," +

                "paradaInicial5Ur02 varchar(50)," +
                "paradaFinal5Ur02 varchar(50)," +
                "equipamento5Ur02 varchar(50)," +
                "descricao5Ur02 varchar(50)," +

                "paradaInicial6Ur02 varchar(50)," +
                "paradaFinal6Ur02 varchar(50)," +
                "equipamento6Ur02 varchar(50)," +
                "descricao6Ur02 varchar(50)," +

                "paradaInicial7Ur02 varchar(50)," +
                "paradaFinal7Ur02 varchar(50)," +
                "equipamento7Ur02 varchar(50)," +
                "descricao7Ur02 varchar(50)," +

                "paradaInicial8Ur02 varchar(50)," +
                "paradaFinal8Ur02 varchar(50)," +
                "equipamento8Ur02 varchar(50)," +
                "descricao8Ur02 varchar(50)," +

                "paradaInicial9Ur02 varchar(50)," +
                "paradaFinal9Ur02 varchar(50)," +
                "equipamento9Ur02 varchar(50)," +
                "descricao9Ur02 varchar(50)," +

                "paradaInicial10Ur02 varchar(50)," +
                "paradaFinal10Ur02 varchar(50)," +
                "equipamento10Ur02 varchar(50)," +
                "descricao10Ur02 varchar(50)," +

                "paradaInicial11Ur02 varchar(50)," +
                "paradaFinal11Ur02 varchar(50)," +
                "equipamento11Ur02 varchar(50)," +
                "descricao11Ur02 varchar(50)," +

                "paradaInicial12Ur02 varchar(50)," +
                "paradaFinal12Ur02 varchar(50)," +
                "equipamento12Ur02 varchar(50)," +
                "descricao12Ur02 varchar(50)," +

                "paradaInicial13Ur02 varchar(50)," +
                "paradaFinal13Ur02 varchar(50)," +
                "equipamento13Ur02 varchar(50)," +
                "descricao13Ur02 varchar(50)," +

                "paradaInicial14Ur02 varchar(50)," +
                "paradaFinal14Ur02 varchar(50)," +
                "equipamento14Ur02 varchar(50)," +
                "descricao14Ur02 varchar(50)," +

                "paradaInicial15Ur02 varchar(50)," +
                "paradaFinal15Ur02 varchar(50)," +
                "equipamento15Ur02 varchar(50)," +
                "descricao15Ur02 varchar(50)," +


                "metalUtc11 varchar(50)," +
                "engaiolamentoUr02 varchar(50)," +

                "paradaInicial1Ur03 varchar(50)," +
                "paradaFinal1Ur03 varchar(50)," +
                "equipamento1Ur03 varchar(50)," +
                "descricao1Ur03 varchar(50)," +

                "paradaInicial2Ur03 varchar(50)," +
                "paradaFinal2Ur03 varchar(50)," +
                "equipamento2Ur03 varchar(50)," +
                "descricao2Ur03 varchar(50)," +

                "paradaInicial3Ur03 varchar(50)," +
                "paradaFinal3Ur03 varchar(50)," +
                "equipamento3Ur03 varchar(50)," +
                "descricao3Ur03 varchar(50)," +

                "paradaInicial4Ur03 varchar(50)," +
                "paradaFinal4Ur03 varchar(50)," +
                "equipamento4Ur03 varchar(50)," +
                "descricao4Ur03 varchar(50)," +

                "paradaInicial5Ur03 varchar(50)," +
                "paradaFinal5Ur03 varchar(50)," +
                "equipamento5Ur03 varchar(50)," +
                "descricao5Ur03 varchar(50)," +

                "paradaInicial6Ur03 varchar(50)," +
                "paradaFinal6Ur03 varchar(50)," +
                "equipamento6Ur03 varchar(50)," +
                "descricao6Ur03 varchar(50)," +

                "paradaInicial7Ur03 varchar(50)," +
                "paradaFinal7Ur03 varchar(50)," +
                "equipamento7Ur03 varchar(50)," +
                "descricao7Ur03 varchar(50)," +

                "paradaInicial8Ur03 varchar(50)," +
                "paradaFinal8Ur03 varchar(50)," +
                "equipamento8Ur03 varchar(50)," +
                "descricao8Ur03 varchar(50)," +

                "paradaInicial9Ur03 varchar(50)," +
                "paradaFinal9Ur03 varchar(50)," +
                "equipamento9Ur03 varchar(50)," +
                "descricao9Ur03 varchar(50)," +

                "paradaInicial10Ur03 varchar(50)," +
                "paradaFinal10Ur03 varchar(50)," +
                "equipamento10Ur03 varchar(50)," +
                "descricao10Ur03 varchar(50)," +

                "paradaInicial11Ur03 varchar(50)," +
                "paradaFinal11Ur03 varchar(50)," +
                "equipamento11Ur03 varchar(50)," +
                "descricao11Ur03 varchar(50)," +

                "paradaInicial12Ur03 varchar(50)," +
                "paradaFinal12Ur03 varchar(50)," +
                "equipamento12Ur03 varchar(50)," +
                "descricao12Ur03 varchar(50)," +

                "paradaInicial13Ur03 varchar(50)," +
                "paradaFinal13Ur03 varchar(50)," +
                "equipamento13Ur03 varchar(50)," +
                "descricao13Ur03 varchar(50)," +

                "paradaInicial14Ur03 varchar(50)," +
                "paradaFinal14Ur03 varchar(50)," +
                "equipamento14Ur03 varchar(50)," +
                "descricao14Ur03 varchar(50)," +

                "paradaInicial15Ur03 varchar(50)," +
                "paradaFinal15Ur03 varchar(50)," +
                "equipamento15Ur03 varchar(50)," +
                "descricao15Ur03 varchar(50)," +

                "metalUtc09 varchar(50)," +


                "oleoS3000 varchar(50)," +
                "oleoH4000 varchar(50)," +
                "bandejas varchar(50)," +
                "rolosDePe varchar(50)," +
                "skides varchar(50)," +
                "temperaturaCartuchoRemco varchar(50)," +
                "temperaturaMotorRemco varchar(50)," +
                "vibracaoRemco varchar(50)," +
                "pressaoH4000 varchar(50)," +
                "pressaoS3000 varchar(50)," +
                "amperimetros varchar(50)," +

                "volumeRachao varchar(50)," +
                "volumeB4 varchar(50)," +
                "volumeB2 varchar(50)," +
                "retorno varchar(50)," +
                "retornoBicaPorcent varchar(50)," +
                "retornoBicaHorario varchar(50)," +
                "retornoB0Porcent varchar(50)," +
                "retornoB0Horario varchar(50)," +
                "retornoB1Porcent varchar(50)," +
                "retornoB1Horario varchar(50)," +
                "retornoPedriscoPorcent varchar(50)," +
                "retornoPedriscoHorario varchar(50),"+
                "observacoes varchar(200))");


    }






    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
