
import java.util.ArrayList;
import java.util.Collections;

public class cos {

    private ArrayList<games>listaGames;

    public cos() {
        listaGames = new ArrayList<games>();
    }

    public void add(games c){listaGames.add(c);}

    public void throw_game(games c)
    {
       listaGames.remove(c);
    }

    public void afisare()
    {
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append("In cos avem:\n");
        for(games i : listaGames)
        {
            builder.append(i.getNume()).append(" ").append(i.getGen()).append(" ").append(i.getPret());
            builder.append("\n");
        }
    }
}
