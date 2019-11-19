package com.example.eai_uts;

import retrofit2.Call;
import retrofit2.http.GET;

public interface interfaceAPI {
    String API_KEY = "291ae0d9b9da40719ab9c6662fab4475";

    //get movies list
    @GET("top-headlines?country=id&apiKey=291ae0d9b9da40719ab9c6662fab4475")
    Call<responseAPI> getMovieData() ;
}
