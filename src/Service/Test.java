package Service;

import Model.Movie;

public class Test {
    public String getNamemenufacture(@org.jetbrains.annotations.NotNull Movie movie){
        return movie.getManufacturer().getName_Manufacturer().toString();

    }
}
