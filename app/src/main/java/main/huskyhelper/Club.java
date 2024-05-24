package main.huskyhelper;

public class Club {
    private String mName;
    private String mClub;
    public final static String NAME = "name";
    public final static String CLUB = "club";

    public Club(String mName, String mClub) {
        this.mName = mName;
        this.mClub = mClub;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmClub() {
        return mClub;
    }

    public void setmClub(String mClub) {
        this.mClub = mClub;
    }
}
