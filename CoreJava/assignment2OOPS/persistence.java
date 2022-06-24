package assignment2OOPS;

abstract class persistence{
    abstract void persist();
}

class file_Persistence extends persistence{
    void persist() {
        System.out.println("file persists..");
    }
}

class database_Persistence extends persistence{
    void persist(){
        System.out.println("database persists..");
    }
}