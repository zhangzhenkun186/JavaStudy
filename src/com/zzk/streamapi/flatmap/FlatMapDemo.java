package com.zzk.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<KlassGroup> groupList = Arrays.asList(
                new KlassGroup(new Klass(1), new Klass(2), new Klass(3)),
                new KlassGroup(new Klass(4), new Klass(5), new Klass(6)),
                new KlassGroup(new Klass(7), new Klass(8), new Klass(9)),
                new KlassGroup(new Klass(10))
        );
        //需要将每个KlassGroup对象中的那些Klass类取出来，放到一个ArrayList里面，得到一个List<Klass>
        groupList.stream().flatMap(item -> item.getKlassList().stream()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
