package com.github.vedeshkin;

/**
 * Created by vedeshkin on 23.08.2018.
 *
 */
public class Team {
    private String teamName;
    private TeamMember[] teamMembers;


    public Team (String teamName,TeamMember[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;

}

    public TeamMember[] getTeamMembers() {
        return teamMembers;
    }

    public Team(String teamName, String [] names) {
        this.teamName = teamName;
        teamMembers = new TeamMember[names.length];
        for (int i = 0; i<names.length;i++){
            teamMembers[i] = new TeamMember(names[i]);
        }
    }
    public void showWhoIsFinished(){
        System.out.println("The following members finished the race:");
        for(TeamMember tm :teamMembers){
            if (tm.isFinished()) {
                System.out.println(tm.getName());
            }
        }
    }
    public void showAllMembers(){
        for (TeamMember tm: teamMembers)
        {
            System.out.println(tm.getName());
        }
    }
}
