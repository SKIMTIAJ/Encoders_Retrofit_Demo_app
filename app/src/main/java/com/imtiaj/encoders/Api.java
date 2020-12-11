package com.imtiaj.encoders;

import com.imtiaj.encoders.model.ApiPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("amit/backup/dummeyJson.php")
    Call<ApiPojo> getUserAll();

}
