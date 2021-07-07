package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Uc07;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Uc07Service {

    Funcionario funcionario=new Funcionario();
    @GET("/uc07")
    Call<Uc07> recuperarInfoUc07();

    @POST("/uc07")
    Call<Uc07>salvarInfoUc07(@Body Uc07 uc07);
}
