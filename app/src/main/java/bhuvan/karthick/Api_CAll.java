package bhuvan.karthick;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by nn1android01user on 9/7/17.
 */

public interface Api_CAll {

    @FormUrlEncoded
    @POST("{path1}/{path2}")
    Call<ResponseBody> Call_AsCommon_POST(@Path("path")String path, @FieldMap Map<String,Object> map);
}
