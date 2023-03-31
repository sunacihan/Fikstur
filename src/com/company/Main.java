package com.company;

import java.util.ArrayList;
import java.util.List;

 public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Team> teams=new ArrayList<>();

        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Trabzonspor"));
        teams.add(new Team("Başakşehir"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Ankara Gücü"));

        Fikstur fix=new Fikstur(teams);
        fix.fixture();
        fix.printFixstur();



    }
}
