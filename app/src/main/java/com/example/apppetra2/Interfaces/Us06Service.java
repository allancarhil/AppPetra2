package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Us06;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Us06Service {
    Funcionario funcionario=new Funcionario();
    @GET("/us06")
    Call<Us06> recuperarInfoUs06();

    @POST("/us06")
    Call<Us06>salvarInfoUs06(@Body Us06 us06);


}
