package com.github.vedeshkin;

import java.util.List;
import java.util.Random;

/**
 * Created by vedeshkin on 23.08.2018.
 */
public class Course {
   private List<Block> blockerList;

    public Course(List<Block> blockerList) {
        this.blockerList = blockerList;
    }

    public void startCourse(Team t){

        for(TeamMember tm : t.getTeamMembers()){
            int delay = new Random().nextInt(6);
           for (Block b : blockerList)
           {
                delay += b.getDelay();
           }
           if (delay < 10) tm.setFinished(true);
        }

    }
}
