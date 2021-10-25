package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import java.util.Random;

// 1 a)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int parz = 0;
//        int niep = 0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 +999)-999);
//            if(tab[i] % 2 == 0)parz++;
//            if(tab[i] % 2 == 1)niep++;
//        }
//        System.out.print("Liczby parzyste: "+parz+"\nLiczby nieparzyste: "+niep);
//    }
//}

// b)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int dod = 0;
//        int uj = 0;
//        int zero = 0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 + 999))-999;
//            if(tab[i] > 0)
//                dod++;
//            if(tab[i] < 0)
//                uj++;
//            if(tab[i] == 0)
//                zero++;
//        }
//        System.out.print("Liczby dodatnie: "+dod+"\nLiczby ujemne: "+uj+"\nIlość zer: "+zero);
//    }
//}

// c)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int max = 0;
//        int ilosc = 0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 + 999))-999;
//            if(tab[i]>max)
//                max=tab[i];
//        }
//        for(int i=0;i<n;i++)
//        {
//            if(tab[i]==max)
//                ilosc++;
//        }
//        System.out.print("Największa liczba to: "+max+"\n Występuje ona "+ilosc+" razy");
//    }
//}

// d)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int dod = 0;
//        int uj = 0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 + 999))-999;
//            if(tab[i] > 0)
//                dod+=tab[i];
//            if(tab[i] < 0)
//                uj+=tab[i];
//
//
//        }
//        System.out.print("Suma liczb dodatnich: "+dod+"\nSuma liczb ujemnych: "+uj);
//    }
//}

// e)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int ciag = 0;
//        int wynik=0;
//        int max_ciag=0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 + 999))-999;
//            if(tab[i] > 0 )
//            {
//                ciag++;
//                if (ciag>max_ciag)
//                    max_ciag=ciag;
//            }
//            else
//                ciag=0;
//
//
//
//        }
//        System.out.print("Najdluzszy fragment tablicy zawierający tylko dodatnie liczby to: "+max_ciag);
//    }
//}


// f)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//        int ciag = 0;
//
//        int max_ciag=0;
//        int n = 0;
//        int x = 0;
//        while(x!=1){
//
//            System.out.print("Podaj n z przedziału od 1 do 100: ");
//            n = scan.nextInt();
//            if(n >=1 && n <= 100)
//                x = 1;
//        }
//        int tab[] = new int[n];
//        for(int i = 0;i < n;i++){
//            tab[i] = r.nextInt((999 + 999))-999;
//            if(tab[i] < 0)
//            {
//                tab[i]=-1;
//
//            }
//            if(tab[i] > 0)
//            {
//                tab[i]=1;
//            }
//            System.out.print(tab[i]+"\n");
//
//
//        }
//
//    }
//}

// Zadanie 2
public class Main {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        int x = 0;
        while (x != 1) {
            if (n >= 1 && n <= 100)
                x = 1;
        }
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt((maxWartosc + maxWartosc)) + minWartosc;

            System.out.print(tab[i] + "\n");
        }
    }

    public static int ileNieparzystych(int tab[]) {
        int niep = 0;
        for(int i=0;i<tab.length;i++) {
            if (tab[i] % 2 != 0)
                niep++;

        }
        return niep;
    };


    public static int ileParzystych(int tab[])
    {
        int parz = 0;

        for(int i=0;i<tab.length;i++){
            if(tab[i]%2==0)
                parz++;

        }

        return parz;
    };
    public static int ileDodatnich(int tab[])
    {
        int dod=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
                dod++;
        }
        return dod;
    };
    public static int ileUjemnych(int tab[])
    {
        int uj=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
                uj++;
        }
        return uj;
    };
    public static int ileZerowych(int tab[])
    {
        int zera=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==0)
                zera++;
        }
        return zera;
    };
    public static int ileMaksymalnych(int tab[])
    {
        int ilosc=0;
        int max=tab[0];
        for(int i=0;i< tab.length;i++)
        {
            if(tab[i]>max)
                max=tab[i];
        }
        for(int i=0;i< tab.length;i++)
        {
            if(tab[i]==max)
                ilosc++;
        }
        return ilosc;
    }
    public static int sumaDodatnich(int tab[])
    {
        int suma=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
                suma+=tab[i];
        }
        return suma;
    };
    public static int sumaUjemnych(int tab[])
    {
        int suma=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
                suma+=tab[i];
        }
        return suma;
    };
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])
    {
        int ciag=0;
        int max_ciag=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i] > 0 )
            {
                ciag++;
                if (ciag>max_ciag)
                    max_ciag=ciag;
            }
            else
                ciag=0;
        }
            return max_ciag;
    }
    public static void signum(int tab[])
    {
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
                tab[i]=1;
            else if(tab[i]<0)
                tab[i]=-1;

            System.out.print(tab[i]+"\n");
        }

    }

    public static void main(String[] args){
        int n=0;
        int x=0;
        while(x!=1){
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj n z przedziału od 1 do 100: ");
            n = scan.nextInt();
            if(n >=1 && n <= 100)
                x = 1;
        }
        int tab[] = new int[n];
        generuj(tab,n,-999,999);
        System.out.print("Ilość nieparzystych liczb: " + ileNieparzystych(tab)+"\n");
        System.out.print("Ilość parzystych liczb: " + ileParzystych(tab)+"\n");
        System.out.print("Ilość dodatnich liczb: " + ileDodatnich(tab)+"\n");
        System.out.print("Ilość ujemnych liczb: " + ileUjemnych(tab)+"\n");
        System.out.print("Ilość zer: " + ileZerowych(tab)+"\n");
        System.out.print("Ilość maksymalnych liczb: " + ileMaksymalnych(tab)+"\n");
        System.out.print("Suma dodatnich liczb: " + sumaDodatnich(tab)+"\n");
        System.out.print("Suma ujemnych liczb: " + sumaUjemnych(tab)+"\n");
        System.out.print("Najdłuższy ciąg liczb dodatnich miał dlugość: " + dlugoscMaksymalnegoCiaguDodatnich(tab)+"\n");
        signum(tab);


    }
}
