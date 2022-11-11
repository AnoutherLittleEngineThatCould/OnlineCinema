import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        Viewer v1 = new Viewer("Poll",17,64);
        Viewer v2 = new Viewer("Bill",67,4);
        Viewer v3 = new Viewer("Moll",27,43);
        Viewer v4 = new Viewer("Klar",27,311);
        Viewer v5 = new Viewer("Molly",34,34);

        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(v1);
        viewerList.add(v2);
        viewerList.add(v3);
        viewerList.add(v4);
        viewerList.add(v5);

        ViewerStatistics v = new ViewerStatistics();

        System.out.println(v.averageAge(viewerList));
    }
}
