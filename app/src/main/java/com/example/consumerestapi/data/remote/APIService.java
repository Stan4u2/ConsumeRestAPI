package com.example.consumerestapi.data.remote;

import com.example.consumerestapi.data.model.POST_Area;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<POST_Area> saveArea(
            @Field("nombre") String name,
            @Field("id") Integer id
    );



}
