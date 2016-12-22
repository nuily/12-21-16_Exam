package nyc.c4q.huilin.a12_21_16_exam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.huilin.a12_21_16_exam.R;
import nyc.c4q.huilin.a12_21_16_exam.model.Animals;

/**
 * Created by huilin on 12/21/16.
 */
public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private final View fragView;
    List<Animals> animalsList;

    public AnimalAdapter(List<Animals> animalList, View fragView) {
        this.animalsList = animalList;
        this.fragView = fragView;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vh_animal, parent, false);
        return new AnimalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animals animal = animalsList.get(position);
        holder.bind(animal, fragView);

    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
