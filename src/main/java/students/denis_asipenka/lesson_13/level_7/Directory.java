package students.denis_asipenka.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Resource {
    private String name;

    private List<Resource> resources;

    public Directory(String name) {
        super(name);
        this.resources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void deleteResource(Resource resource) {
        resources.remove(resource);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (Resource resource : resources) {
            totalSize += resource.getSize();
        }
        return totalSize;
    }
}