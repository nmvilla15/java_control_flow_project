package com.tts;

public class AsciiChars {
    public static void main(String[] args) {
       printNumbers();
       printUpperCase();
       printLowerCase();
    }
        public static void printNumbers ()
        {
            for (int i = '0'; i <= '9'; i++) {
                System.out.println(i);
            }
        }

        public static void printLowerCase ()
        {
            for (int i = 'a'; i <= 'z'; i++) {
                System.out.println(i);
            }
        }

        public static void printUpperCase ()
        {
            for (int i = 'A'; i <= 'Z'; i++) {
                System.out.println(i);
            }
        }
    }

