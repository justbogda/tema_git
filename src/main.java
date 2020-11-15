

public class main {
    public static void main(String[] args)
    {
        games ga= new games("Grand theft auto V", "actiune", 20);
        depozit b = new depozit();
        b.add(ga);

        b.add(new games("Mortal Kombat X", "lupte", 15));
        b.add(new games("CS:GO", "shooter", 0));

    }
   // System.out.println(b);
}
