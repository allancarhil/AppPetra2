package com.example.apppetra2.Classes;

public class Usina {
//    private Integer id;
    private String motorista;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String horimetroInicial;
    private String horimetroFinal;
    private String paradaInicial1;
    private String paradaFinal1;
    private String descricao1;
    private String paradaInicial2;
    private String paradaFinal2;
    private String descricao2;
    private String paradaInicial3;
    private String paradaFinal3;
    private String descricao3;
    private String paradaInicial4;
    private String paradaFinal4;
    private String descricao4;
    private String paradaInicial5;
    private String paradaFinal5;
    private String descricao5;
    private String paradaInicial6;
    private String paradaFinal6;
    private String descricao6;
    private String paradaInicial7;
    private String paradaFinal7;
    private String descricao7;
    private String paradaInicial8;
    private String paradaFinal8;
    private String descricao8;
    private String paradaInicial9;
    private String paradaFinal9;
    private String descricao9;
    private String paradaInicial10;
    private String paradaFinal10;
    private String descricao10;
    private String mot1;
    private String tf1;
    private String am1;
    private String b01;
    private String b11;
    private String mot1Soma;
    private String mot2;
    private String tf2;
    private String am2;
    private String b02;
    private String b12;
    private String mot2Soma;
    private String mot3;
    private String tf3;
    private String am3;
    private String b03;
    private String b13;
    private String mot3Soma;
    private String mot4;
    private String tf4;
    private String am4;
    private String b04;
    private String b14;
    private String mot4Soma;
    private String mot5;
    private String tf5;
    private String am5;
    private String b05;
    private String b15;
    private String mot5Soma;
    private String mot6;
    private String tf6;
    private String am6;
    private String b06;
    private String b16;
    private String mot6Soma;
    private String bandeja;
    private String rolo;
    private String rolete;
    private String alinha;
    private String egaiolada;
    private String observacoes;

    public Usina(String mot, String data, String horaInicial, String horaFinal, String horimetroInicial, String horimetroFinal, String paradaInicial1, String paradaFinal1, String descricao1, String paradaInicial2, String paradaFinal2, String descricao2, String paradaInicial3, String paradaFinal3, String descricao3, String paradaInicial4, String paradaFinal4, String descricao4, String paradaInicial5, String paradaFinal5, String descricao5, String paradaInicial6, String paradaFinal6, String descricao6, String paradaInicial7, String paradaFinal7, String descricao7, String paradaInicial8, String paradaFinal8, String descricao8, String paradaInicial9, String paradaFinal9, String descricao9, String paradaInicial10, String paradaFinal10, String descricao10, String mot1, String tf1, String am1, String b01, String b11, String mot1Soma, String mot2, String tf2, String am2, String b02, String b12, String mot2Soma, String mot3, String tf3, String am3, String b03, String b13, String mot3Soma, String mot4, String tf4, String am4, String b04, String b14, String mot4Soma, String mot5, String tf5, String am5, String b05, String b15, String mot5Soma, String mot6, String tf6, String am6, String b06, String b16, String mot6Soma, String bandeja, String rolo, String rolete, String alinha, String egaiolada, String observacoes) {
        this.motorista = mot;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.horimetroInicial = horimetroInicial;
        this.horimetroFinal = horimetroFinal;
        this.paradaInicial1 = paradaInicial1;
        this.paradaFinal1 = paradaFinal1;
        this.descricao1 = descricao1;
        this.paradaInicial2 = paradaInicial2;
        this.paradaFinal2 = paradaFinal2;
        this.descricao2 = descricao2;
        this.paradaInicial3 = paradaInicial3;
        this.paradaFinal3 = paradaFinal3;
        this.descricao3 = descricao3;
        this.paradaInicial4 = paradaInicial4;
        this.paradaFinal4 = paradaFinal4;
        this.descricao4 = descricao4;
        this.paradaInicial5 = paradaInicial5;
        this.paradaFinal5 = paradaFinal5;
        this.descricao5 = descricao5;
        this.paradaInicial6 = paradaInicial6;
        this.paradaFinal6 = paradaFinal6;
        this.descricao6 = descricao6;
        this.paradaInicial7 = paradaInicial7;
        this.paradaFinal7 = paradaFinal7;
        this.descricao7 = descricao7;
        this.paradaInicial8 = paradaInicial8;
        this.paradaFinal8 = paradaFinal8;
        this.descricao8 = descricao8;
        this.paradaInicial9 = paradaInicial9;
        this.paradaFinal9 = paradaFinal9;
        this.descricao9 = descricao9;
        this.paradaInicial10 = paradaInicial10;
        this.paradaFinal10 = paradaFinal10;
        this.descricao10 = descricao10;
        this.mot1 = mot1;
        this.tf1 = tf1;
        this.am1 = am1;
        this.b01 = b01;
        this.b11 = b11;
        this.mot1Soma = mot1Soma;
        this.mot2 = mot2;
        this.tf2 = tf2;
        this.am2 = am2;
        this.b02 = b02;
        this.b12 = b12;
        this.mot2Soma = mot2Soma;
        this.mot3 = mot3;
        this.tf3 = tf3;
        this.am3 = am3;
        this.b03 = b03;
        this.b13 = b13;
        this.mot3Soma = mot3Soma;
        this.mot4 = mot4;
        this.tf4 = tf4;
        this.am4 = am4;
        this.b04 = b04;
        this.b14 = b14;
        this.mot4Soma = mot4Soma;
        this.mot5 = mot5;
        this.tf5 = tf5;
        this.am5 = am5;
        this.b05 = b05;
        this.b15 = b15;
        this.mot5Soma = mot5Soma;
        this.mot6 = mot6;
        this.tf6 = tf6;
        this.am6 = am6;
        this.b06 = b06;
        this.b16 = b16;
        this.mot6Soma = mot6Soma;
        this.bandeja = bandeja;
        this.rolo = rolo;
        this.rolete = rolete;
        this.alinha = alinha;
        this.egaiolada = egaiolada;
        this.observacoes = observacoes;
    }

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

    public String getHorimetroInicial() {
        return horimetroInicial;
    }

    public void setHorimetroInicial(String horimetroInicial) {
        this.horimetroInicial = horimetroInicial;
    }

    public String getHorimetroFinal() {
        return horimetroFinal;
    }

    public void setHorimetroFinal(String horimetroFinal) {
        this.horimetroFinal = horimetroFinal;
    }

    public String getParadaInicial1() {
        return paradaInicial1;
    }

    public void setParadaInicial1(String paradaInicial1) {
        this.paradaInicial1 = paradaInicial1;
    }

    public String getParadaFinal1() {
        return paradaFinal1;
    }

    public void setParadaFinal1(String paradaFinal1) {
        this.paradaFinal1 = paradaFinal1;
    }

    public String getDescricao1() {
        return descricao1;
    }

    public void setDescricao1(String descricao1) {
        this.descricao1 = descricao1;
    }

    public String getParadaInicial2() {
        return paradaInicial2;
    }

    public void setParadaInicial2(String paradaInicial2) {
        this.paradaInicial2 = paradaInicial2;
    }

    public String getParadaFinal2() {
        return paradaFinal2;
    }

    public void setParadaFinal2(String paradaFinal2) {
        this.paradaFinal2 = paradaFinal2;
    }

    public String getDescricao2() {
        return descricao2;
    }

    public void setDescricao2(String descricao2) {
        this.descricao2 = descricao2;
    }

    public String getParadaInicial3() {
        return paradaInicial3;
    }

    public void setParadaInicial3(String paradaInicial3) {
        this.paradaInicial3 = paradaInicial3;
    }

    public String getParadaFinal3() {
        return paradaFinal3;
    }

    public void setParadaFinal3(String paradaFinal3) {
        this.paradaFinal3 = paradaFinal3;
    }

    public String getDescricao3() {
        return descricao3;
    }

    public void setDescricao3(String descricao3) {
        this.descricao3 = descricao3;
    }

    public String getParadaInicial4() {
        return paradaInicial4;
    }

    public void setParadaInicial4(String paradaInicial4) {
        this.paradaInicial4 = paradaInicial4;
    }

    public String getParadaFinal4() {
        return paradaFinal4;
    }

    public void setParadaFinal4(String paradaFinal4) {
        this.paradaFinal4 = paradaFinal4;
    }

    public String getDescricao4() {
        return descricao4;
    }

    public void setDescricao4(String descricao4) {
        this.descricao4 = descricao4;
    }

    public String getParadaInicial5() {
        return paradaInicial5;
    }

    public void setParadaInicial5(String paradaInicial5) {
        this.paradaInicial5 = paradaInicial5;
    }

    public String getParadaFinal5() {
        return paradaFinal5;
    }

    public void setParadaFinal5(String paradaFinal5) {
        this.paradaFinal5 = paradaFinal5;
    }

    public String getDescricao5() {
        return descricao5;
    }

    public void setDescricao5(String descricao5) {
        this.descricao5 = descricao5;
    }

    public String getParadaInicial6() {
        return paradaInicial6;
    }

    public void setParadaInicial6(String paradaInicial6) {
        this.paradaInicial6 = paradaInicial6;
    }

    public String getParadaFinal6() {
        return paradaFinal6;
    }

    public void setParadaFinal6(String paradaFinal6) {
        this.paradaFinal6 = paradaFinal6;
    }

    public String getDescricao6() {
        return descricao6;
    }

    public void setDescricao6(String descricao6) {
        this.descricao6 = descricao6;
    }

    public String getParadaInicial7() {
        return paradaInicial7;
    }

    public void setParadaInicial7(String paradaInicial7) {
        this.paradaInicial7 = paradaInicial7;
    }

    public String getParadaFinal7() {
        return paradaFinal7;
    }

    public void setParadaFinal7(String paradaFinal7) {
        this.paradaFinal7 = paradaFinal7;
    }

    public String getDescricao7() {
        return descricao7;
    }

    public void setDescricao7(String descricao7) {
        this.descricao7 = descricao7;
    }

    public String getParadaInicial8() {
        return paradaInicial8;
    }

    public void setParadaInicial8(String paradaInicial8) {
        this.paradaInicial8 = paradaInicial8;
    }

    public String getParadaFinal8() {
        return paradaFinal8;
    }

    public void setParadaFinal8(String paradaFinal8) {
        this.paradaFinal8 = paradaFinal8;
    }

    public String getDescricao8() {
        return descricao8;
    }

    public void setDescricao8(String descricao8) {
        this.descricao8 = descricao8;
    }

    public String getParadaInicial9() {
        return paradaInicial9;
    }

    public void setParadaInicial9(String paradaInicial9) {
        this.paradaInicial9 = paradaInicial9;
    }

    public String getParadaFinal9() {
        return paradaFinal9;
    }

    public void setParadaFinal9(String paradaFinal9) {
        this.paradaFinal9 = paradaFinal9;
    }

    public String getDescricao9() {
        return descricao9;
    }

    public void setDescricao9(String descricao9) {
        this.descricao9 = descricao9;
    }

    public String getParadaInicial10() {
        return paradaInicial10;
    }

    public void setParadaInicial10(String paradaInicial10) {
        this.paradaInicial10 = paradaInicial10;
    }

    public String getParadaFinal10() {
        return paradaFinal10;
    }

    public void setParadaFinal10(String paradaFinal10) {
        this.paradaFinal10 = paradaFinal10;
    }

    public String getDescricao10() {
        return descricao10;
    }

    public void setDescricao10(String descricao10) {
        this.descricao10 = descricao10;
    }

    public String getMotorista1() {
        return mot1;
    }

    public void setMotorista1(String mot1) {
        this.mot1 = mot1;
    }

    public String getTf1() {
        return tf1;
    }

    public void setTf1(String tf1) {
        this.tf1 = tf1;
    }

    public String getAm1() {
        return am1;
    }

    public void setAm1(String am1) {
        this.am1 = am1;
    }

    public String getB01() {
        return b01;
    }

    public void setB01(String b01) {
        this.b01 = b01;
    }

    public String getB11() {
        return b11;
    }

    public void setB11(String b11) {
        this.b11 = b11;
    }

    public String getMot1Soma() {
        return mot1Soma;
    }

    public void setMot1Soma(String mot1Soma) {
        this.mot1Soma = mot1Soma;
    }

    public String getMotorista2() {
        return mot2;
    }

    public void setMotorista2(String mot2) {
        this.mot2 = mot2;
    }

    public String getTf2() {
        return tf2;
    }

    public void setTf2(String tf2) {
        this.tf2 = tf2;
    }

    public String getAm2() {
        return am2;
    }

    public void setAm2(String am2) {
        this.am2 = am2;
    }

    public String getB02() {
        return b02;
    }

    public void setB02(String b02) {
        this.b02 = b02;
    }

    public String getB12() {
        return b12;
    }

    public void setB12(String b12) {
        this.b12 = b12;
    }

    public String getMot2Soma() {
        return mot2Soma;
    }

    public void setMot2Soma(String mot2Soma) {
        this.mot2Soma = mot2Soma;
    }

    public String getMotorista3() {
        return mot3;
    }

    public void setMotorista3(String mot3) {
        this.mot3 = mot3;
    }

    public String getTf3() {
        return tf3;
    }

    public void setTf3(String tf3) {
        this.tf3 = tf3;
    }

    public String getAm3() {
        return am3;
    }

    public void setAm3(String am3) {
        this.am3 = am3;
    }

    public String getB03() {
        return b03;
    }

    public void setB03(String b03) {
        this.b03 = b03;
    }

    public String getB13() {
        return b13;
    }

    public void setB13(String b13) {
        this.b13 = b13;
    }

    public String getMot3Soma() {
        return mot3Soma;
    }

    public void setMot3Soma(String mot3Soma) {
        this.mot3Soma = mot3Soma;
    }

    public String getMotorista4() {
        return mot4;
    }

    public void setMotorista4(String mot4) {
        this.mot4 = mot4;
    }

    public String getTf4() {
        return tf4;
    }

    public void setTf4(String tf4) {
        this.tf4 = tf4;
    }

    public String getAm4() {
        return am4;
    }

    public void setAm4(String am4) {
        this.am4 = am4;
    }

    public String getB04() {
        return b04;
    }

    public void setB04(String b04) {
        this.b04 = b04;
    }

    public String getB14() {
        return b14;
    }

    public void setB14(String b14) {
        this.b14 = b14;
    }

    public String getMot4Soma() {
        return mot4Soma;
    }

    public void setMot4Soma(String mot4Soma) {
        this.mot4Soma = mot4Soma;
    }

    public String getMotorista5() {
        return mot5;
    }

    public void setMotorista5(String mot5) {
        this.mot5 = mot5;
    }

    public String getTf5() {
        return tf5;
    }

    public void setTf5(String tf5) {
        this.tf5 = tf5;
    }

    public String getAm5() {
        return am5;
    }

    public void setAm5(String am5) {
        this.am5 = am5;
    }

    public String getB05() {
        return b05;
    }

    public void setB05(String b05) {
        this.b05 = b05;
    }

    public String getB15() {
        return b15;
    }

    public void setB15(String b15) {
        this.b15 = b15;
    }

    public String getMot5Soma() {
        return mot5Soma;
    }

    public void setMot5Soma(String mot5Soma) {
        this.mot5Soma = mot5Soma;
    }

    public String getMotorista6() {
        return mot6;
    }

    public void setMotorista6(String mot6) {
        this.mot6 = mot6;
    }

    public String getTf6() {
        return tf6;
    }

    public void setTf6(String tf6) {
        this.tf6 = tf6;
    }

    public String getAm6() {
        return am6;
    }

    public void setAm6(String am6) {
        this.am6 = am6;
    }

    public String getB06() {
        return b06;
    }

    public void setB06(String b06) {
        this.b06 = b06;
    }

    public String getB16() {
        return b16;
    }

    public void setB16(String b16) {
        this.b16 = b16;
    }

    public String getMot6Soma() {
        return mot6Soma;
    }

    public void setMot6Soma(String mot6Soma) {
        this.mot6Soma = mot6Soma;
    }

    public String getBandeja() {
        return bandeja;
    }

    public void setBandeja(String bandeja) {
        this.bandeja = bandeja;
    }

    public String getRolo() {
        return rolo;
    }

    public void setRolo(String rolo) {
        this.rolo = rolo;
    }

    public String getRolete() {
        return rolete;
    }

    public void setRolete(String rolete) {
        this.rolete = rolete;
    }

    public String getAlinha() {
        return alinha;
    }

    public void setAlinha(String alinha) {
        this.alinha = alinha;
    }

    public String getEgaiolada() {
        return egaiolada;
    }

    public void setEgaiolada(String egaiolada) {
        this.egaiolada = egaiolada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
