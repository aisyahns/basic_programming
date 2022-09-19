package IterableMap;

public class Iterate {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int n = 10;
        int b = a[2]; // O (1)

        // apakah dia pake for atau looping atau engga, kalau ga pake, berarti dia O (1)
        // kalau pake for atau looping, kita liat kaya gimana atau sebarapa kali loop itu harus dilakukan
        for (int i = 0; i < n; i++){ // O (n) n = 100; 100 second
            System.out.print(i);
        }

        for (int i = 0; i < n/2; i++){ // O (n/2)
            System.out.print(i);
        }

        for (int i = 0; i < n; i++){ // O (n^3) n = 100^3 second
            for (int j = 0; j < n; j ++)
                for (int k = 0; k < n; k ++)
                    System.out.print(i);
        }

    }
}
