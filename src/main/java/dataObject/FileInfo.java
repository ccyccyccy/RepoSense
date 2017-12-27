package dataObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matanghao1 on 3/6/17.
 */
public class FileInfo {

    String path;
    ArrayList<LineInfo> lines;

    //ArrayList<MethodInfo> methodInfos;

    public FileInfo(String path) {
        this.path = path;
        this.lines = new ArrayList<>();
    }

    public FileInfo(String path,ArrayList<LineInfo> lines) {
        this.path = path;
        this.lines = lines;
    }

    public LineInfo getLineByNumber(int num){
        return lines.get(num - 1);
    }

    public ArrayList<LineInfo> getLines() {
        return lines;
    }

    public void setLines(ArrayList<LineInfo> lines) {
        this.lines = lines;
    }

    public String getPath() {

        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isAllAuthorsIgnored(List<Author> listedAuthors){
        for (LineInfo line: lines) {
            if (listedAuthors.contains(line.getAuthor())){
                return false;
            }
        }
        return true;
    }

}
