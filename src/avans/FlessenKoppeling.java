package avans;

import nl.twan.pompflessenactieapi.PublicApi;
import nl.twan.pompflessenactieapi.models.Team;
import nl.twan.pompflessenactieapi.models.TeamStatistics;

import java.util.List;

public class FlessenKoppeling {

    public static void main(String[] args){
        PublicApi pompApi = new PublicApi();

        try {
            List<Team> teams = pompApi.getTeams();
            for(Team team : teams){
                TeamStatistics stats = pompApi.getTeamStatistics(team.teamId);

                System.out.println("Team " + team.teamName + " heeft €" + stats.money + " opgehaald over " + stats.bottle + " flessen");
            }
        }
        catch (Exception ex){

        }

    }

}
