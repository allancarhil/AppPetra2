package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Us36;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Us36Service {

    Funcionario funcionario=new Funcionario();

    @GET("/us36")
    Call<Us36> recuperarInfoUs36();

    @POST("/us36")
    Call<Us36>salvarInfoUs36(@Body Us36 us36);
    }












