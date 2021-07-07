package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Ub02;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Ub02Service {

    Funcionario funcionario=new Funcionario();
    @GET("/ub02")
    Call<Ub02> recuperarInfoUb02();

    @POST("/ub02")
    Call<Ub02>salvarInfoUb02(@Body Ub02 ub02);
}
