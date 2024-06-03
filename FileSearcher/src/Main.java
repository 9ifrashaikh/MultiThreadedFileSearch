import Indexer.IndexManager;
import SearchManager.SearchManager;
import SearchManager.SingleThreadedBFS;
import java.nio.file.Path;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            throw new Exception("Pass proper arguments");
        }

        String searchTerm = args[0];
        IndexManager im = new IndexManager(Path.of("FileSearcher/search").toAbsolutePath().toString());

        List<String> res = SingleThreadedBFS.singleThreadedBFS(im, searchTerm);
        System.out.println(res);

        System.out.println("Single Threaded DFS");
        SearchManager.singleThreadedDFS(im,"hello.txt");
    }

}