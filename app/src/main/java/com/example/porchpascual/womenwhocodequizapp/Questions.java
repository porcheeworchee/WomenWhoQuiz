package com.example.porchpascual.womenwhocodequizapp;


public class Questions {

    // string array
    public String mQuestions[] = {
            "When was WWCODEMANILA launched?",
            "Sinong Tech Lead ang mahilig sa Easter Eggs?",
            "Which director ang palaging late?",
            "Sinong Tech Lead ang pinaka masarap kumain?",
            "Sino ang nagpauso ng GMG (Google mo Girl) vocabulary?",
            "Where was the first general assembly held?",
            "Ano yung game na nacreate ni Joy using Ruby?",
            "Sinong Techlead ang favorite si Aling Nena example?",
            "Sino ang nagpauso ng SMG (Swimming Muna Girl)?",
            "When ginanap ang WomenTechMakers event?",
            "Ano ang language na ginagamit sa Android Studio?",
            "Ano ang language na ginagamit sa Unity Software?",
            "Anong language ang ginagamit for Front End Development?",
            "Anong language ang partly ginamit sa AIRBNB Site?",
            "Sinong ang pinaka magulo and makulit sa badminton court?",
            "Sinong coach ang nag talk about Bio?",
            "Which director ang palaging naka black?",
            "Sinong Techlead ang mahilig maningil ng utang?",
            "How many times did WWCODEMANILA has been featured on TV?",
            "Anong dialect ang inaaral ni Joy?",
            "Bonus question When ang bday ni Porch?"
    };

//    private Drawable mImages[] =  {
//            "R.drawable.bgimage",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",
//            "R.drawable.ic_launcher",

    private String mChoices [][] = {
            {"Jan 27", "Jan 20", "Jan 17", "Jan 25"},
            {"Nicole", "Christine", "Mars", "Joy"},
            {"Anj", "Joy", "Michie", "Steffi"},
            {"Issa", "Marie", "Joy", "Nicole"},
            {"Mars", "Nicole", "Christine", "Joy"},
            {"Atlassian", "VentureSpace", "Launch Garage", "Z.Com"},
            {"Football", "Shooting", "PingPong", "Platform"},
            {"Nicole", "Christine", "Mars", "Joy"},
            {"Mars", "Ciela", "Christine", "Joy"},
            {"March 4", "March 25", "Feb 25", "Feb 28"},
            {"Java", "HTML", "C#", "Python"},
            {"Javascript", "CSS", "C#", "Java"},
            {"Javascript", "HTML", "CSS", "All of the above"},
            {"Ruby", "HTML", "C#", "Python"},
            {"Nicole", "Marie", "Porchee", "Steffi"},
            {"Clau", "Marylette", "Mars", "Christine"},
            {"Michie", "Joy", "Anj", "Steffi"},
            {"Nicole", "Mars", "Jeykle", "Joy"},
            {"1x", "3x", "4x", "2x"},
            {"Mandarin", "French", "Nihonggo", "Italian"},
            {"Nov 4", "Sept 24", "Feb 14", "Oct 8"}

    };

    private String mCorrectAnswers [] = {"Jan 20", "Christine", "Michie", "Nicole", "Nicole", "Launch Garage", "PingPong", "Nicole", "Mars", "March 25", "Java", "C#", "All of the above", "Ruby", "Porchee", "Marylette", "Michie", "Nicole", "2x","Nihonggo","Nov 4"};

    public String getQuestion(int a ){
        String question = mQuestions [a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices [a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices [a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices [a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices [a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
       String answer = mCorrectAnswers [a];
        return mCorrectAnswers[a];
    }

//    public Drawable getImage(int a) {
//        return mImages[a];

}
