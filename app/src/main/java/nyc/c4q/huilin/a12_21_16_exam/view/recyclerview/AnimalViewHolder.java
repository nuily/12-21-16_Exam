package nyc.c4q.huilin.a12_21_16_exam.view.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.huilin.a12_21_16_exam.R;
import nyc.c4q.huilin.a12_21_16_exam.model.Animals;

/**
 * Created by huilin on 12/21/16.
 */
public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private String anmlTextColor;

    public AnimalViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tv_name);

    }

    public void bind(final Animals animal, final View fragView) {
        if (animal != null) {
            name.setText(animal.getName());
            anmlTextColor = animal.getTextColor();
            name.setTextColor(Color.parseColor(anmlTextColor));
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String bgColor = animal.getBackground();
                    fragView.setBackgroundColor(Color.parseColor(bgColor));
                }
            });
        }

    }
}
