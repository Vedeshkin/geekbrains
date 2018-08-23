package com.github.vedeshkin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TeamMember [] teamMembers = {new TeamMember( "John"),new TeamMember("James"),new TeamMember("Alan"),new TeamMember("Jack")};
        List<Block> blockerList =  new ArrayList<>(Arrays.asList(new Stone(), new Water(),new Log()));

        Course course = new Course(blockerList);
        Team team = new Team("Winners",teamMembers);
        course.startCourse(team);
        team.showWhoIsFinished();



    }
}
