package assignment2OOPS;

public class DataBase {
    public static void main(String[] args) {
        persistence p= new persistence() {
            @Override
            void persist() {
                System.out.println("persist override here..");
            }
        };
        p.persist();
        //this class is for persistence class
    }
}