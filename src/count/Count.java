package count;

public class Count {
    public static void main(String[] args) {
        String essay = "There were two girls named Alice and Sarah who had been best friends forever since their childhood. They lived in the same neighborhood, attended the same school. However, they both were made of two different character. Alice was joyful and outgoing. In the other hand Sarah was very shy and quiet.\n" +
                "\n" +
                "One day, they both were having conversation about their friendship.\n" +
                "Alice started to talk and asked, “Do you think we will be best friend forever?”\n" +
                "Sarah said, “I think so. Why wouldn 't we?”\n" +
                "“I don 't know, sometimes people become different when they get older.” said Alice.\n" +
                "“You know what, I have an idea. Why don 't we take blood promise.”\n" +
                "Alice surprisingly asked, “A What!”\n" +
                "Sarah replied, “A blood oath” Look we both gonna swear that we will be stay …show more content…\n" +
                "As Sarah stayed in the same city and got a job while Alice moved to another city for college. They both got boyfriends and both friends kept in touch by phone. Alice got a job after her education and she got married and settled in that city. Few years later they had a baby boy. When Alice became busy with her life she completely, lost her touch with Sarah even though the phone all stopped while ago. They had not seen each other after Alice left for college.\n" +
                "\n" +
                "One night, Alice had a terrible nightmare about having a car accident with a truck. She woke up suddenly in seat and scared. Suddenly she heard her doorbell started to ring. She looked at her watch and saw it was 3 a.m in the morning and wondering who it could be in this time. Suddenly, the doorbell ringed again. She got up from her bed and went downstairs to open the door while her husband was fast asleep.";

        String[] words = essay.split(" ");

        int wordCount = 0;
        int wordAlice = 0;
        int wordSarah = 0;

        for (String word: words) {
            if(word.length()>4){
                wordCount += 1;
            }
            if(word.equals("Alice")){
                wordAlice += 1;
            }
            if(word.equals("Sarah")){
                wordSarah += 1;
            }

        }

        System.out.println("The word Alice gets repeated for the "+ wordAlice + " times.");
        System.out.println("The word Alice gets repeated for the "+ wordSarah + " times.");
        System.out.println("The total number of word which has more than 4 letters is: "+ wordCount);


    }
}
