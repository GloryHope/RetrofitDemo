package com.glory.yuxueyuan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRemoteData();
    }

    private void getRemoteData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiStore.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Call<JsonDataModel> call = retrofit.create(ApiStore.class).getJsonData(initRequestData());
        call.enqueue(new Callback<JsonDataModel>() {
            @Override
            public void onResponse(Call<JsonDataModel> call, Response<JsonDataModel> response) {
                //后台响应成功
                String str = response.toString();
                Log.e("glz", str);
                JsonDataModel model = response.body();
                Log.e("glz", model.toString());
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<JsonDataModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error!!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private RequestBody initRequestData() {
//        JsonPaser jsonPaser = new JsonPaser();
//        jsonPaser.setUserId(8865247);
//        jsonPaser.setTypeId(1);
//        jsonPaser.setStartMonth(12);
//        jsonPaser.setEndMonth(14);
//        String jsonStr = new Gson().toJson(jsonPaser);
        String jsonStr = "endMonth=14&startMonth=12&typeId=1&userId=8865247";

//        HashMap hashMap = new HashMap();
//        hashMap.put("endMonth", 14);
//        hashMap.put("startMonth", 14);
//        hashMap.put("typeId", 1);
//        hashMap.put("userId", 8865247);
//        String jsonStr = new Gson().toJson(hashMap);
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");

        RequestBody requestBody = RequestBody.create(mediaType, jsonStr);
        return requestBody;
    }

}
