import java.util.List;

public class ViewerStatistics {
    public int averageAge(List<Viewer> viewerList){
        int averageAgeViewer = 0;
        for (Viewer v: viewerList
             ) {
            averageAgeViewer += v.age;
        }
        return averageAgeViewer/viewerList.size();
    }
}
