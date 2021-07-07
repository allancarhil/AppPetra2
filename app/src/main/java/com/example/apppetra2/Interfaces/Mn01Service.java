package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Mn01;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface Mn01Service {


    Funcionario funcionario=new Funcionario();
    @GET("/mn01")

    Call<Mn01> recuperarInfoMn01();

    @POST("/mn01")
    Call<Mn01>salvarInfoMn01(@Body Mn01 mn01);
}


