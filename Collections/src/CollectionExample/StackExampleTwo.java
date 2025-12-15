package CollectionExample;

import java.util.Stack;

public class StackExampleTwo {

    public static void main(String[] args) {
        Stack movies = new Stack();
        movies.push("durandar");
        movies.push("stranger thing");
        movies.push("bhediya");
        System.out.println(movies);
        movies.pop();
        System.out.println(movies);
    }
}
