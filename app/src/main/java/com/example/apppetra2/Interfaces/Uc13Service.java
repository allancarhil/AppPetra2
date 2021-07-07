package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Uc13;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Uc13Service {

    Funcionario funcionario=new Funcionario();
    @GET("/uc13")
    Call<Uc13> recuperarInfoUc13();

    @POST("/uc13")
    Call<Uc13>salvarInfoUc13(@Body Uc13 uc13);
}

