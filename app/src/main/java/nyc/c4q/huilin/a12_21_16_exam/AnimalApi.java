package nyc.c4q.huilin.a12_21_16_exam;

import nyc.c4q.huilin.a12_21_16_exam.model.AnimalResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by huilin on 12/21/16.
 */
public interface AnimalApi {

    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<AnimalResponse> getAnimalResponse();
}
