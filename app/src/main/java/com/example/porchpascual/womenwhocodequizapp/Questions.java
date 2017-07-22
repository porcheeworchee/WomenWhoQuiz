package com.example.porchpascual.womenwhocodequizapp;


public class Questions {

    public String mQuestions[] = {
            "When was WWCODEMANILA launched?",
            "Sinong Tech Lead ang mahilig sa Easter Eggs?",
            "Who led the first ever study group?",
            "Which director ang palaging late?",
            "Sinong Tech Lead ang nagsabi na Once you have a Mac you will never go back?",
            "Sinong Tech Lead ang pinaka masarap kumain?",
            "Who does love to create apps? ",
            "Sino ang nagpauso ng GMG (Google mo Girl) vocabulary?",
            "Which Tech Lead has all the same profile pics in social media platforms?",
            "Where was the first general assembly held?",
            "Ano yung game na nacreate ni Joy using Ruby?",
            "Sinong Techlead ang favorite si Aling Nena example?",
            "Sino ang nagpauso ng SMG (Swimming Muna Girl)?",
            "Sinong Techlead ang may pinaka organized na slides?",
            "When ginanap ang WomenTechMakers event?",
            "Ano ang language na ginagamit sa Android Studio?",
            "Ano ang language na ginagamit sa Unity Software?",
            "Anong language ang ginagamit for Front End Development?",
            "Anong language ang partly ginamit sa AIRBNB Site?",
            "Ano ang color ng laptop ni Anj?",
            "Kaninong laptop ang may pinaka madaming stickers?",
            "Sinong Techlead ang taga Cagayan De Oro?",
            "Sinong Techlead ang taga Fairview Quezon City?",
            "Sinong member ang pinaka magulo and makulit?",
            "Which director ang palaging naka jacket?",
            "Which director ang mahilig sa Coke?",
            "Sinong coach ang nag talk about Bio?",
            "Which director ang palaging naka black?",
            "Sinong Techlead ang naka braces?",
            "Sinong Techlead ang mahilig maningil ng utang?",
            "How many times did WWCODEMANILA has been featured on TV?",
            "Anong dialect ang inaaral ni Joy?",
            "Bonus question 1  Ano ang color ng laptop ni Porch?",
            "Bonus question 2 When ang bday ni Porch?"

    };

    private String mChoices [][] = {
            {"Jan 27", "Jan 20", "Jan 17", "Jan 25"},
            {"Nicole", "Christine", "Mars", "Joy"},
            {"Anj", "Joy", "Michie", "Christine"},
            {"Michie", "Anj", "Joy", "None of the Above"},
            {"Mars", "Ciela", "Christine", "Joy"},
            {"Jeykle", "Mars", "Nicole", "Marie"},
            {"Nicole", "Michie", "Ciela", "Joy"},
            {"Joy", "Mars", "Jeykle", "Marie"},
            {"Christine", "Nicole", "Joy", "Marie"},
            {"Atlassian", "VentureSpace", "Launch Garage", "Z.Com"},
            {"Football", "Shooting", "PingPong", "Platform"},
            {"Nicole", "Christine", "Mars", "Joy"},
            {"Mars", "Ciela", "Christine", "Joy"},
            {"Jeykle", "Mars", "Issa", "Marie"},
            {"March 4", "March 25", "Feb 25", "Feb 28"},
            {"Javascript", "CSS", "C#", "Java"},
            {"Java", "HTML", "C#", "Python"},
            {"Javascript", "HTML", "CSS", "All of the above"},
            {"Ruby", "HTML", "C#", "Python"},
            {"Dark Blue", "White", "Dark Grey", "Black"},
            {"Joy", "Mars", "Marie", "Christine"},
            {"Jeykle", "Nicole", "Mars", "Marie"},
            {"Joy", "Mars", "Marie", "Jeykle"},
            {"Nelly", "Tere", "Porch", "Steffi"},
            {"Michie", "Joy", "Anj", "None of the above"},
            {"Anj", "Michie", "Joy", "All of the above"},
            {"Clau", "Marylette", "Mars", "Christine"},
            {"Michie", "Joy", "Anj", "All of the above"},
            {"Joy", "Mars", "Marie", "Christine"},
            {"Nicole", "Mars", "Jeykle", "Joy"},
            {"1x", "3x", "4x", "2x"},
            {"Mandarin", "French", "Nihonggo", "Italian"},
            {"Dark Blue", "White", "Dark Grey", "Black"},
            {"Nov 4", "Sept 24", "Feb 14", "Oct 8"}

    };

    private String mCorrectAnswers [] = {"Jan 27", "Christine", "Michie", "Michie", "Joy", "Nicole", "Michie", "Joy", "Nicole", "Launch Garage", "PingPong", "Nicole", "Mars", "Issa", "March 25", "Java", "C#", "All of the above", "Ruby", "Dark Grey", "Joy", "Marie", "Jeykle", "Porch", "Joy", "Michie", "Marylette", "Michie", "Christine", "Nicole", "2x","Nihonggo","Dark Blue","Nov 4"};

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
        return answer;
    }
}
