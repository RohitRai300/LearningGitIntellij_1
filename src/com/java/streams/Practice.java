package src.com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        List<String> abc = Arrays.asList("a","b","c");
//        abc.stream().map(x->x+x).forEach(m->System.out.println(m+","+m));

        List number = Arrays.asList(2,3,4,5);
//        int even = number.stream().filter(x->(x%2)==0).reduce(0,(ans,i)->ans*i);
        String[] array = { "Geeks", "for", "Geeks" };

        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);
        System.out.println(String_combine);

    }
}
