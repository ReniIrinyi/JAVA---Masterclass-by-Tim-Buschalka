package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType=this.getClass().getSimpleName();
        System.out.println(" * ".repeat(10)+" - ".repeat(5)+" * ".repeat(10));
        System.out.println(title + " is a "+instanceType+ " film");

    }
//Factory method=> return a new instance object
    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A'->new Adventure(title);
            case 'C'->new Comedy(title);
            default -> new Movie(title);
        };

    };
}
