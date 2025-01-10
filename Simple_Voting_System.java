import java.util.ArrayList;
import java.util.Scanner;

class candidates{
    String Name;
    String Vote;
    public candidates(String name,String vote){
        this.Name=name;
        this.Vote=vote;
    }
    public String toString(){
        return "Candidates Name is : "+Name + ",  Candidates Vote is : "+Vote;
    }
}
class AllDataStored{
    ArrayList<candidates> candidate = new ArrayList<>(10);
    public void AddCandidates(candidates NameVote){
        candidate.add(NameVote);
    }
    public void DisplayAllVote(){
        if(candidate.isEmpty()){
            System.out.println("Vote has been Starting Soon...");
        }for (candidates var:candidate){
            System.out.println(var);
            System.out.println("---------------------");
        }
    }
}
public class Simple_Voting_System {
    public static void main(String[] args) {
        AllDataStored dataAccess = new AllDataStored();
        Scanner scanner = new Scanner(System.in);
        int choices;
        do {
            System.out.println("Welcome to Voting System All Party Here!");
            System.out.println("Party Name And Number : 1.BJP, 2.BSP 3.INP, 4.BSP  5.CPI, 6.RLD  7.SP, 8.AIFB");
            System.out.println("1.Add a Vote");
            System.out.println("2.Show all Vote");
            System.out.println("3.Exit");
            do {
                System.out.print("Places Select The Valid Option : ");
                choices =scanner.nextInt();
            }while(choices >3);
                scanner.nextLine();
                switch (choices) {
                    case 1:
                        System.out.print("Enter VoterName : ");
                        String Name = scanner.nextLine();
                        System.out.print("Enter Party Number You Want to Vote: ");
                        String Vote = scanner.nextLine();
                        dataAccess.AddCandidates(new candidates(Name, Vote));
                        System.out.println("Add Vote Successful");
                        continue;
                    case 2:
                        System.out.println("Total Vote and Member");
                        dataAccess.DisplayAllVote();
                        continue;
                    case 3:
                        System.out.println("Exit The Voting System ThankYou For Voting.");
                        break;
                    default:System.out.println("Invalid Input try Again");

                }
        }while (choices != 3) ;
            scanner.close();

    }
}