package io.course.springboot.topic;

public class Topic {

    String description;
    String name;
    String id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Topic(String description, String name, String id) {

        this.description = description;
        this.name = name;
        this.id = id;
    }
}

