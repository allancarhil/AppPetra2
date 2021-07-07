package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;
import com.example.apppetra2.Classes.Rebritagem;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RebritagemService {

    Funcionario funcionario=new Funcionario();
    @GET("/rebritagem")
    Call<Rebritagem> recuperarInfoRebritagem();

    @POST("/rebritagem")
    Call<Rebritagem>salvarInfoRebritagem(@Body Rebritagem rebritagem);
}
