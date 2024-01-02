package students.denis_asipenka.lesson_13.level_7;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class DirectoryTest {

    Storage storage = new Storage();
    Directory rootDirectory = storage.rootDirectory();
    Directory documents = new Directory("documents");
    Directory music = new Directory("Music");


    @Before
    public void addFile() {
        documents.addResource(new File("File1.txt", 30));
        documents.addResource(new File("File2.txt", 3));
        documents.addResource(new File("File3.txt", 2));
        documents.addResource(new File("File4.txt", 5));
        documents.addResource(new File("File5.txt", 10));
        music.addResource(new File("Aria.MP3", 2));
        music.addResource(new File("Inga.WMA", 5));
        music.addResource(new File("Guf.MP3", 10));
        rootDirectory.addResource(documents);
        rootDirectory.addResource(music);
    }

    @Test
    public void weExpectListSize5() {
        List<Resource> actualResult = documents.getResources();
        assertEquals(5, actualResult.size());
    }

    @Test
    public void weExpectTheSizeOfTheMusicListToBe3() {
        List<Resource> actualResult = music.getResources();
        assertEquals(3, actualResult.size());
    }

    @Test
    public void weExpectTheNumberOfDirectoriesToBe2() {
        List<Resource> actualResult = rootDirectory.getResources();
        assertEquals(2, actualResult.size());
    }

    @Test
    public void weExpectListSize6() {
        documents.addResource(new File("Object.java", 15));
        List<Resource> actualResult = documents.getResources();
        assertEquals(6, actualResult.size());
    }

    @Test
    public void weExpectTheSizeOfTheMusicListToBe4() {
        music.addResource(new File("Jon Kari.MP3", 1));
        List<Resource> actualResult = music.getResources();
        assertEquals(4, actualResult.size());
    }

    @Test
    public void weExpectTheNumberOfDirectoriesToBe3() {
        rootDirectory.addResource(new Directory("Films"));
        List<Resource> actualResult = rootDirectory.getResources();
        assertEquals(3, actualResult.size());
    }

    @Test
    public void weExpectListSize4() {
        documents.deleteResource(new File("File3.txt", 2));
        List<Resource> actualResult = documents.getResources();
        assertEquals(4, actualResult.size());
    }

    @Test
    public void weExpectTotalSize67() {
        int actualResult = storage.totalSize();
        assertEquals(67, actualResult);
    }

    @Test
    public void weExpectTheSizeOfTheMusicListToBe2() {
        music.addResource(new File("Choi.mp3", 6));
        int actualResult = storage.totalMP3();
        assertEquals(3, actualResult);
    }
}