public class MovieTestDrive {
    public static void main(String[] args){
        Movie ma = new Movie();
        ma.title = "Gone with the stock";
        ma.genre = "tragic";
        ma.rating = -2;

        Movie mi = new Movie();
        mi.title = "Lost in cubicle space";
        mi.genre = "comedy";
        mi.rating = 5;

        Movie mu = new Movie();
        mu.title = "fast and furiuos";
        mu.genre = "advanture";
        mu.rating = 5;

        ma.playIt();
        mi.playIt();
        mu.playIt();
    }
}
