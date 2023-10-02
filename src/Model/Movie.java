package Model;

public class Movie {
    private String movieName;
    private String YearOfmanufacture;
    private Manufacturer manufacturer;
    private double price;
    private Showdate showdate;

    public Movie(String movieName, String yearOfmanufacture, Manufacturer manufacturer, double price, Showdate showdate) {
        this.movieName = movieName;
        YearOfmanufacture = yearOfmanufacture;
        this.manufacturer = manufacturer;
        this.price = price;
        this.showdate = showdate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYearOfmanufacture() {
        return YearOfmanufacture;
    }

    public void setYearOfmanufacture(String yearOfmanufacture) {
        YearOfmanufacture = yearOfmanufacture;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Showdate getShowdate() {
        return showdate;
    }

    public void setShowdate(Showdate showdate) {
        this.showdate = showdate;
    }
    public boolean checkPrice(Movie movie){
        return this.price < movie.price;
    }
    public void nameMovie(){
        System.out.println(  this.manufacturer.getName_Manufacturer());
    }
    public double updatePrice(double x){
        return this.price*(100-x)/100;
    }

}
