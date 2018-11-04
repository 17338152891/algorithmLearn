package com.learn.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"

 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string s, int numRows);
 Example 1:

 Input: s = "PAYPALISHIRING", numRows = 3
 Output: "PAHNAPLSIIGYIR"
 Example 2:

 Input: s = "PAYPALISHIRING", numRows = 4
 Output: "PINALSIGYAHRPI"
 Explanation:

 P     I    N
 A   L S  I G
 Y A   H R
 P     I
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int length = s.length();
        int step = 1;
        int num = 0;
        Map<Integer, List<Character>> table = new HashMap<Integer, List<Character>>();
        for(int i = 0;i < length;i++){
            if(!table.containsKey(num)){
                table.put(i,new LinkedList<Character>());

            }
            table.get(num).add(s.charAt(i));
            num += step;
            if(num == numRows-1 || num == 0){
                step = -step;
            }
        }
        System.out.println(table);
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<numRows;i++){
            if(table.containsKey(i)){
                for(Character c : table.get(i)){
                    builder.append(c);
                }
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        new ZigZagConversion().convert("123456789abcdefghigk", 4);
    }
}
