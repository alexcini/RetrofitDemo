package com.mob13.cini.retrofitdemo;

import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by logonrm on 19/06/2017.
 */

public class RetrofitCliente {
        private static Retrofit retrofit = null;
    if (retrofit==null) {
                .baseUrl(baseUrl)
                .addCconvertFactory(GsonConverterFactory.create())
                .build();
    }
    return retrofit;
}
