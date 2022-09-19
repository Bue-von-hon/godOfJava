import java.io.File;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "/somePath";
        long sum = sample.printFileSize(path);
        System.out.println(path+" size = "+sum);
    }

    private long printFileSize(String path) {
        File dir = new File("path");
        int sum = 0;
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    System.out.println(tempFileName + "=" + fileLength);
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    sum += fileLength;
                }
            }
        }
        return sum;
    }
}
