package com.example.apppetra2.Classes;

import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;

public class Us36 implements Serializable {

   // private Integer id;
    private String motorista;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String kmInicial;
    private String kmFinal;
    private String servicos;
    private String observacoes;
    private String lanternagem;
    private String pneus;


   // public Us36() {
    //}

    public Us36(String motorista, String data, String horaInicial, String horaFinal, String kmInicial, String kmFinal, String servicos, String observacoes, String lanternagem, String pneus) {
        //this.id = id;
        this.motorista = motorista;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.servicos = servicos;
        this.observacoes = observacoes;
        this.lanternagem = lanternagem;
        this.pneus = pneus;
    }



    //public Integer getId() {
    //    return id;
    //}
//
    //public void setId(Integer id) {
    //    this.id = id;
   // }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getkmInicial() {
        return kmInicial;
    }

    public void setkmInicial(String horimetroInicial) {
        this.kmInicial = horimetroInicial;
    }

    public String getkmFinal() {
        return kmFinal;
    }

    public void setkmFinal(String horimetroFinal) {
        this.kmFinal = horimetroFinal;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getLanternagem() {
        return lanternagem;
    }

    public void setLanternagem(String lanternagem) {
        this.lanternagem = lanternagem;
    }

    public String getPneus() {
        return pneus;
    }

    public void setPneus(String pneus) {
        this.pneus = pneus;
    }


}
