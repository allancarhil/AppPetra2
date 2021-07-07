package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Uc14;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Uc14Service {

    Funcionario funcionario=new Funcionario();
    @GET("/uc14")
    Call<Uc14> recuperarInfoUc14();

    @POST("/uc14")
    Call<Uc14>salvarInfoUc14(@Body Uc14 uc14);
}
