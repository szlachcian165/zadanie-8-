package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(ThreadLocalRandom.current().nextInt(0, 51));
        }

        System.out.println(numbers);

        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));


    }
}
