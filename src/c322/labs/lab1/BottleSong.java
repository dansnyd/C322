package c322.labs.lab1;

public class BottleSong {

        public static void main(String[] args){
            greenBottle();
        }

        private static void greenBottle() {
            int bottles = 10;

            while(bottles > 0){
                int temp = bottles -1;
                for(int i = 0; i<2; i++){
                    System.out.println(bottles + " green bottles hanging on the wall,");
                }
                System.out.println("And if one green bottle should accidentally fall,");
                System.out.println("There’ll be " + temp + " green bottles hanging on the wall.");
                System.out.println("");
                bottles--;
            }

        }

}
