package com.example.arrayleader;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Solution {

    public int[] solution(int k, int m, int[] a){
        validateRanges(m,k);
        validateContent(m,a);
        Set<Integer> leaders = new TreeSet(getLeaders(k,a));
        return leaders.stream().mapToInt(i->i).toArray();
    }

    private void validateRanges(int m, int k) {
        if (!(m > 0 && m <= 100000)){
            throw new RuntimeException("range error M");
        }

        if (!(k > 0 && k <= 100000)){
            throw new RuntimeException("range error K");
        }
    }

    private void validateContent(int m,int[] a) {
        for (int n:a) {
            if(n > m){
                throw new RuntimeException("error in content ");
            }
        }
    }

    private List<Integer> getLeaders(int k, int[] a){
        List<Integer> leaders = new ArrayList();
        int startLimit = 0;
        int endLimit = k;

        int[] temp;
        while(endLimit <= a.length){
            temp = a.clone();
            for( int index = startLimit; index < (endLimit);index ++){
                temp[index] = a[index] + 1;
            }
            if(calculateNumberLeader(temp).size() > 0){
                leaders.add(calculateNumberLeader(temp).get(0));
            }
            startLimit++;
            endLimit++;
        }
        return leaders;
    }


    private List<Integer> calculateNumberLeader(int[] modifyArray){
        List<Integer> numbers = Arrays.stream(modifyArray)
                .boxed()
                .collect(Collectors.toList());

        return  numbers.stream()
                .filter(t -> Collections.frequency(numbers, t) > (numbers.size()/2))
                .distinct()
                .collect(Collectors.toList());
    }
}
