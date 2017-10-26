// @author John Calderaio

import java.util.Scanner;

class StarWars {
    public static void main(String args[]) {
        StarWarsNameGenerator sw = new StarWarsNameGenerator();
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String fn = scan.next();
        System.out.println("What is your last name?");
        String ln = scan.next();
        System.out.println("What is your mother's maiden name?");
        String mn = scan.next();
        System.out.println("What city were you born in?");
        String cb = scan.next();
        sw.fullName(fn, ln, mn, cb);
    }
}

class StarWarsNameGenerator
{
    private String firstName;
    private String lastName;

    public void fullName(String firstName, String lastName, String maiden, String cityBornIn) {
        this.firstName = lastName.substring(0,3).concat(firstName.substring(0,2));
        this.lastName = maiden.substring(0,2).concat(cityBornIn.substring(0,3));
        System.out.println(this.firstName + " " + this.lastName);
    }
}
