package mojave.diyandroid.com.mojave;

public class music {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void duration(String duration) {
        this.duration = duration;
    }

    public music(String name, String duration) {
        this.name = name;

        this.duration = duration;
    }

    private String name;
    private String duration;
}
