package com.mob13.cini.retrofitdemo;

/**
 * Created by logonrm on 19/06/2017.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST

//* interface quer dizer que é um contrato

public interface CarroAPI {

    @POST("/carros")
    Call<Void> salvar(@Body Carro carro);
    @GET
    Call<List<Carro>> listarTodos();


}
