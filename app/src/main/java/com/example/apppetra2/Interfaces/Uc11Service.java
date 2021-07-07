package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Uc11;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Uc11Service {

    Funcionario funcionario=new Funcionario();
    @GET("/uc11")
    Call<Uc11> recuperarInfoUc11();

    @POST("/uc11")
    Call<Uc11>salvarInfoUc11(@Body Uc11 uc11);
}
