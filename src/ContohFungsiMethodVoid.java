public class ContohFungsiMethodVoid {
    public static void main(String[] args) {
        // void adalah hampa atau kossng. tipe data kosong, tidak perlu menggunakan return

        System.out.println(simpel());

        fungsiVoid("belajar fungsi");
        selamatPagi("risna");
        selamatPagi("lukman");
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi "+nama);
    }






    //fungsi method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }





    //fungsi atau method dengan kembalian sehingga menggunakan return untuk mengembalikan nilai

    private static float simpel(){
        return 10.0f;
    }
}
