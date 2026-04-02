public class GoodVsEvil
{
    public static String battle(String goodAmounts, String evilAmounts)
    {
        String[] goodArr = goodAmounts.split(" ");
        String[] evilArr = evilAmounts.split(" ");
        int goodWorthTotalCount = 0;
        int evilWorthTotalCount = 0;
        int[] goodWorthCountArr = {1,2,3,3,4,10};
        int[] evilWorthCountArr = {1,2,2,2,3,5,10};
        /*loop to get the good worth count*/
        for(int i = 0; i < goodArr.length; i++)
            goodWorthTotalCount += Integer.parseInt(goodArr[i]) * goodWorthCountArr[i];
        /*loop to get the evil worth count*/
        for(int i = 0; i < evilArr.length; i++)
            evilWorthTotalCount += Integer.parseInt(evilArr[i]) * evilWorthCountArr[i];
        if (goodWorthTotalCount > evilWorthTotalCount)
            return "Battle Result: Good triumphs over Evil";
        else if(goodWorthTotalCount < evilWorthTotalCount)
            return "Battle Result: Evil eradicates all trace of Good";
        else
            return "Battle Result: No victor on this battle field";
    }
}

/*
*
On the side of good we have:
Hobbits: 1
Men: 2
Elves: 3
Dwarves: 3
Eagles: 4
Wizards: 10


On the side of evil we have:
Orcs: 1
Men: 2
Wargs: 2
Goblins: 2
Uruk Hai: 3
Trolls: 5
Wizards: 10*/
