package mojave.diyandroid.com.mojave;

public class Music {
    private String name;
    private String duration;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }


    public Music(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }
}
