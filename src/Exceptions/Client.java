package Exceptions;

public class Client {
    public static void main(String[] args){
        Client cc = new Client();
        Student ss= new Student();
        ss.name= "chandu";
        ExcePtion ece = new ExcePtion();
        String str = ece.uppercase(ss);
        System.out.println(str.toUpperCase());
    }

}

