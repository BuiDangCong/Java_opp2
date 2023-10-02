import Model.Manufacturer;
import Model.Movie;
import Model.Showdate;


public class Main {
    public static void main(String[] args) {
        Showdate showdate1 = new Showdate(15,5,2009);
        Showdate showdate2 = new Showdate(17,6,2008);
        Showdate showdate3 = new Showdate(18,7,2010);
        Manufacturer manufacturer1 =new Manufacturer("Tosiba1","China1");
        Manufacturer manufacturer2 =new Manufacturer("Tosiba2","China2");
        Manufacturer manufacturer3 =new Manufacturer("Tosiba3","China3");
        Movie movie1 = new Movie("Ma1","2010",manufacturer1,500,showdate1);
        Movie movie2 = new Movie("Ma2","2011",manufacturer2,600,showdate2);
        Movie movie3 = new Movie("Ma3","2012",manufacturer3,700,showdate3);
        // kiểm tra giá vé giữa các bộ phim
        System.out.println(movie1.checkPrice(movie2));
        System.out.println(movie1.checkPrice(movie3));
        System.out.println(movie2.checkPrice(movie3));
//        cho biết tên hãng sản xuất phim
        movie1.nameMovie();
        movie2.nameMovie();
        movie3.nameMovie();

        // cho biết giá vé khi có khuyến mãi
        System.out.println(movie1.updatePrice(23));
        System.out.println( movie2.updatePrice(23));
        System.out.println(     movie3.updatePrice(23));



    }

}