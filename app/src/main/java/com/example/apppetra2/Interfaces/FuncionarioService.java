package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Funcionario;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface FuncionarioService {
    Funcionario funcionario=new Funcionario();
    @GET("/funcionario")
    Call<Funcionario> recuperarInfoFuncionario();

    @POST("/funcionario")
    Call<Funcionario>salvarInfoFuncionario(@Body Funcionario funcionario);
}
