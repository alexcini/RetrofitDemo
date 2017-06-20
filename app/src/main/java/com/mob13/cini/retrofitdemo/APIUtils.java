package com.mob13.cini.retrofitdemo;

/**
 * Created by logonrm on 19/06/2017.
 */

public class APIUtils {

    public static final String BASE_URL = "http://10.3.1.42:3000";

    public static CarroAPI getCarroAPIService() {

        return RetrofitCliente.getClient(BASE_URL).create(CarroAPI.class);
    }
}
