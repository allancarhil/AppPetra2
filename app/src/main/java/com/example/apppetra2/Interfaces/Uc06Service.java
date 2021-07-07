package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Uc06;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Uc06Service {
    Funcionario funcionario=new Funcionario();
    @GET("/uc06")
    Call<Uc06> recuperarInfoUc06();

    @POST("/uc06")
    Call<Uc06>salvarInfoUc06(@Body Uc06 uc06);
}
