package com.myapp.belajar.classess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "M. Fidyan Fatra Aldino | Direktorat Teknologi Informasi dan Komunikasi";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[t][a-zA-Z]");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }

    }
}
