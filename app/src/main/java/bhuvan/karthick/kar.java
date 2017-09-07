package bhuvan.karthick;

import android.app.Activity;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by nn1android01user on 8/23/17.
 */

public class kar  {

    public kar ConnectApi(String baseurl) {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(6000, TimeUnit.SECONDS)
                .connectTimeout(6000, TimeUnit.SECONDS).build();
        Retrofit retrofit = new Retrofit.Builder().client(okHttpClient).baseUrl(baseurl).build();
        return retrofit.create(kar.class);


    }

}
