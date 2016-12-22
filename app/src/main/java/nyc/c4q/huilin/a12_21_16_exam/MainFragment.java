package nyc.c4q.huilin.a12_21_16_exam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.huilin.a12_21_16_exam.model.AnimalResponse;
import nyc.c4q.huilin.a12_21_16_exam.model.Animals;
import nyc.c4q.huilin.a12_21_16_exam.model.backend.AnimalApi;
import nyc.c4q.huilin.a12_21_16_exam.view.recyclerview.AnimalAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huilin on 12/21/16.
 */
public class MainFragment extends Fragment {

    private List<Animals> animalList;
    private RecyclerView rv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animals, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRVwithAnimaList(view);
    }

    private void initRv(View view) {
        rv = (RecyclerView) view.findViewById(R.id.fragment_rv);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new AnimalAdapter(animalList, view));

    }

    private void initRVwithAnimaList(final View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsjrobotics.nyc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimalApi service = retrofit.create(AnimalApi.class);
        Call<AnimalResponse> call = service.getAnimalResponse();
        call.enqueue(new Callback<AnimalResponse>() {
            @Override
            public void onResponse(Call<AnimalResponse> call, Response<AnimalResponse> response) {
                AnimalResponse animalResponse = response.body();
                animalList = animalResponse.getAnimals();
                initRv(view);
            }

            @Override
            public void onFailure(Call<AnimalResponse> call, Throwable t) {

            }
        });
    }
}
