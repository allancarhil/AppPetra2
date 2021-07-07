package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Usina;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsinaService {

    Funcionario funcionario=new Funcionario();
    @GET("/usina")
    Call<Usina> recuperarInfoUsina();

    @POST("/usina")
    Call<Usina>salvarInfoUsina(@Body Usina usina);
}
