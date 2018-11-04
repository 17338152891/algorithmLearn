package com.learn.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {

    public int myAtoi(String str) {
        String trim = str.trim();
        System.out.println(trim);
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(trim);
        System.out.println(matcher.group());
        return 1;
    }
}
