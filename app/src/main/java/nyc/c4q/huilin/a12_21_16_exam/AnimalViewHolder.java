package nyc.c4q.huilin.a12_21_16_exam;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.huilin.a12_21_16_exam.model.Animals;

/**
 * Created by huilin on 12/21/16.
 */
public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private final LinearLayout linearLayout;
    private TextView name;
    private String anmlTextColor;

    public AnimalViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tv_name);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.vh_animal);
    }

    public void bind(final Animals animal) {
        if (animal != null) {
            name.setText(animal.getName());
            anmlTextColor = animal.getTextColor();
            name.setTextColor(Color.parseColor(anmlTextColor));
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String bgColor = animal.getBackground();
                    linearLayout.setBackgroundColor(Color.parseColor(bgColor));
                }
            });
        }

    }
}
