package nyc.c4q.huilin.a12_21_16_exam.model;

import java.util.List;

/**
 * Created by huilin on 12/21/16.
 */

public class AnimalResponse {
    private boolean success;
    private List<Animals> animals;

    public boolean isSuccess() {
        return success;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }
}
