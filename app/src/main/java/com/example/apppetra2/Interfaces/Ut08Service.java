package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Ut08;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Ut08Service {
    Funcionario funcionario=new Funcionario();
    @GET("/ut08")
    Call<Ut08> recuperarInfoUt08();

    @POST("/ut08")
    Call<Ut08>salvarInfoUt08(@Body Ut08 ut08);
}
