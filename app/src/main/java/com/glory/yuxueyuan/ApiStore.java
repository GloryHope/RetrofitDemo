package com.glory.yuxueyuan;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Create by glorizz on 2018/11/27
 * Describe:
 */
public interface ApiStore {
    public static final String BASE_URL = "http://ass2.drcuiyutao.com";

    @Headers({"userid:8865247",
            "Content-Type:application/x-www-form-urlencoded"})
    @POST("/v65/cpUserQuestionResult/findUserQuestionResultByType")
    Call<JsonDataModel> getJsonData(@Body RequestBody requestBody);
}
