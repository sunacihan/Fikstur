package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fikstur {
    List<Team> team = new ArrayList<>();
    List<String> tempList = new ArrayList<>();
    List<String> temp2List = new ArrayList<>();
    List<String> geciciList = new ArrayList<>();
    String home;
    String away;
    public int sayac = 0;

    public Fikstur(List<Team> team) {
        this.team = team;
    }

    public void fixture() {
        if (team.size() % 2 == 1)
            team.add(new Team("Bay"));
        int matchNumber = team.size() * (team.size() - 1);
        Random random = new Random();
        int round = 0;

        while (sayac < matchNumber) {
            home = team.get(random.nextInt(team.size())).getName();
            away = team.get(random.nextInt(team.size())).getName();

            if (home != away && !geciciList.contains(home) && !geciciList.contains(away) &&
                    !tempList.contains(home + " vs " + away) && !temp2List.contains(away + " vs " + home)) {
                geciciList.add(home);
                geciciList.add(away);
                tempList.add(home + " vs " + away);
                temp2List.add(away + " vs " + home);
                round++;
                sayac++;
            }
            if (round == team.size() / 2) {
                round = 0;

                geciciList.clear();

            }
        }
    }

    public void printFixstur() {
        int round = 1;
        // tempList=temp2List;
        for (int i = 0; i < tempList.size(); i++) {
            if ((i % (team.size() / 2) == 0)) {

                System.out.println(round + ". Round");
                round++;
            }
            System.out.println(tempList.get(i));
        }
    }
}
