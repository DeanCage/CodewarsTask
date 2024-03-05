package org.example;

public class Solution {
    public static void main(String[] args) {

    }

        public static String updateLight (String current){
             switch (current){
                 case "red":
                     return "green";
                 case "green":
                     return "yellow";
                 case "yellow":
                     return "red";
             }

            return current;
        }
}
