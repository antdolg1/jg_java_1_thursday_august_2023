package students.denis_asipenka.lesson_13.level_7;

public class Storage {
    private Directory rootDirectory;

    public Storage() {
        this.rootDirectory = new Directory("/");
    }

    public Directory rootDirectory() {
        return rootDirectory;
    }

    public int totalSize() {
        return sizeAll(rootDirectory);
    }

    private int sizeAll(Directory directory) {
        int count = 0;
        for (Resource resource : directory.getResources()) {
            if (resource instanceof File) {
                count += ((File) resource).getSize();
            } else if (resource instanceof Directory) {
                count += sizeAll((Directory) resource);
            }
        }
        return count;
    }

    public int totalMP3() {
        return countMP3(rootDirectory);
    }

    private int countMP3(Directory directory) {
        int count = 0;
        for (Resource resource : directory.getResources()) {
            if (resource instanceof File) {
                String fileName = ((File) resource).getName();
                if (fileName.toLowerCase().endsWith(".mp3")) {
                    count++;
                }
            } else if (resource instanceof Directory) {
                count += countMP3((Directory) resource);
            }
        }
        return count;
    }
}