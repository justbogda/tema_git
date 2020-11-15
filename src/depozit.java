
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;


public class depozit {
    private ArrayList<games> jocuri;

    public depozit() {
        jocuri = new ArrayList<games>();
    }

    public void add(games g)
    {
        jocuri.add(g);
    }
    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append("In depozit avem:\n");

        for (games c : jocuri)
        {
            builder.append(c);
            builder.append("\n");
        }

        return builder.toString();
    }
}
