package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Ut07;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Ut07Service {

    @GET("/ut07")
    Call<Ut07> recuperarInfoUt07();

    @POST("/ut07")
    Call<Ut07>salvarInfoUt07(@Body Ut07 ut07);
}
