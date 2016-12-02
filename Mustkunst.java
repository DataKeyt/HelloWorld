import java.util.Scanner;

class Mustkunst {
    static void mang(int piir) {
        Scanner sisend = new Scanner(System.in);
        int arvutiArv = (int) Math.ceil(Math.random() * piir);
        //System.out.println(arvutiArv);
        System.out.println("Sisesta arv: ");
        int kasutajaArv = sisend.nextInt();
        int samm = 1;
        while (kasutajaArv != arvutiArv && samm < 10) {
            if(kasutajaArv < arvutiArv){
                System.out.println("Sinu arv on vaiksem");
            } else {
                System.out.println("Sinu arv on suurem");
            }
            System.out.print("Sisesta arv: ");
            kasutajaArv = sisend.nextInt();
            samm++;
            if(kasutajaArv == arvutiArv) {
                System.out.println("Arvasid arvu!");
            }
            if (samm == 10){
                System.out.println("Sammud otsas!");
            }
        }
    }
    public static void main(String args[]){
        mang(10);
    }
}
