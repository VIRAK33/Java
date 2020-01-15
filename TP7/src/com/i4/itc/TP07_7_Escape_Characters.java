package com.i4.itc;

import java.util.Scanner;

public class TP07_7_Escape_Characters {

    static void Escape(String word){
        String re_ = word.replace("\\t", "(tab)");
        re_ = re_.replace("\\n", "(new_line)");
        re_ = re_.replace("\\\\", "(slash)");
        re_ = re_.replace("\\/\\/", "(comment_line)");
        re_ = re_.replace("\\)\\:", "(smile)");
        System.out.print("\n" + re_);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String word = sc.nextLine();
        Escape(word);
    }
}
