package com.example.apppetra2.Interfaces;

import com.example.apppetra2.Classes.Ut37;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Ut37Service {

    @GET("/ut37")
    Call<Ut37> recuperarInfoUt37();

    @POST("/ut37")
    Call<Ut37>salvarInfoUt37(@Body Ut37 ut37);
}
