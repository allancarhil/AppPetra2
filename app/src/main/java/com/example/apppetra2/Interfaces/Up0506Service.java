package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Up0506;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Up0506Service {
    Funcionario funcionario=new Funcionario();
    @GET("/up0506")
    Call<Up0506> recuperarInfoUp0506();

    @POST("/up0506")
    Call<Up0506>salvarInfoUp0506(@Body Up0506 up0506);
}
