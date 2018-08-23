package com.github.vedeshkin;

/**
 * Created by vedeshkin on 23.08.2018.
 *
 *
 */
public class TeamMember {
    private String name;
    private boolean isFinished = false;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
