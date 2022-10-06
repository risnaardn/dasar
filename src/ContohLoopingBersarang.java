public class ContohLoopingBersarang {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {// untuk mencetak bintang haris baru
            System.out.println("Looping ke- " + i);
            for (int j = 0; j < 5; j++) {  // untun mencetak bintang ke samping
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < 5; i++) {// untuk mencetak bintang haris baru
            for (int j = 0; j < 5; j++) {  // untun mencetak bintang ke samping
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {// untuk mencetak bintang haris baru
            for (int j = 0; j < 5; j++) {  // untun mencetak bintang ke samping
                System.out.print("* ");
                if(i+j == 4){
                    break;

                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
