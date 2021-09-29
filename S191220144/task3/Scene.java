package S191220144.task3;
import java.io.*;
import java.util.*;
public class Scene {

    public static void main(String[] args) throws IOException {
        final int SZ=64;
        int[] tmp=new int[768];
        File fl=new File("C:/Users/lenovo/Desktop/jw02-VtopLiver/S191220144/source.txt");
        int cnt=0;
        try(Scanner sc=new Scanner(fl)){
        while (sc.hasNext()) {
            int value=sc.nextInt();
            tmp[cnt++]=value;
            //sc.close();
        }
        }
        Matrix line = new Matrix(SZ);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<SZ;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        cnt=192;
        List<Sub> ml=new ArrayList<>();
        for(var i=1;i<=SZ;i++){
            Sub sd=new Sub(i, tmp[cnt++], tmp[cnt++], tmp[cnt++]);
            ml.add(sd);
            line.put(sd, list.get(i-1));
        }
        


        Geezer theGeezer = Geezer.getTheGeezer();
        Geezer.setSubs(ml);
        Sorter sorter = new QuickSort();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\a1\\1.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
