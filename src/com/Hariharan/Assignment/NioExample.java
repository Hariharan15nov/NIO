package com.Hariharan.Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioExample {
        Scanner sc = new Scanner(System.in);
        private List<String> result;
        public void ReadLine() throws IOException {
                try (Stream<String> lines = Files.lines(Paths.get("Test.txt"))) {
                        result = lines.collect(Collectors.toList());
                }
                System.out.println(result.size());
                System.out.println("Enter the line number:");
                int lineNum = sc.nextInt();
                System.out.println(LineCharCount(lineNum));
                System.out.println(sortalphabetically());
                System.out.println(totalCount());
        }
        public int LineCharCount(int num){
                return result.get(num).length();
        }
        public List<String> sortalphabetically() {
                List<String> sortedList = result;
                sortedList.sort(Comparator.naturalOrder());
                return sortedList;
        }
        public long totalCount(){
                List<Integer> countLine= new ArrayList<>();
                int count;
                for (int i=1;i< result.size();i++) {
                        count=LineCharCount(i);
                        countLine.add(count);
                }
                int tcount=countLine.stream()
                        .mapToInt(value -> value)
                        .sum();
                return tcount;
        }
}
