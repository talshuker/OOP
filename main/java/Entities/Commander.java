package Entities;

public class Commander{
    Rank rank;
    String name;

    public Commander(Rank rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
