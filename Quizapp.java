
import java.util.Scanner;

public class Quizapp {

    // Method to take and validate the user's answer
    static char getAnswer(Scanner input) {
        char ans = input.next().charAt(0);

        while (ans != 'a' && ans != 'b' && ans != 'c' && ans != 'd') {
            System.out.println("Invalid option! Please enter A, B, C, or D.");
            System.out.print("Pick an option: ");
            ans = input.next().charAt(0);
        }

        return ans;
    }

    public static void main(String[] args) {

        questions_answers questions = new questions_answers();
        questions_answers answers = new questions_answers();

        Scanner input = new Scanner(System.in);

        char ans;
        int correct = 0, wrong = 0;

        // Question 1
        questions.question1();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer1) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 2
        questions.question2();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer2) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 3
        questions.question3();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer3) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 4
        questions.question4();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer4) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 5
        questions.question5();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer5) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 6
        questions.question6();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer6) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 7
        questions.question7();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer7) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 8
        questions.question8();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer8) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 9
        questions.question9();
        System.out.print("\nPick an option: ");
        ans = input.next().charAt(0);

        // Q9 has only A and B options
        while (ans != 'a' && ans != 'b') {
            System.out.println("Invalid option! Please enter A or B.");
            System.out.print("Pick an option: ");
            ans = input.next().charAt(0);
        }

        if (ans == answers.answer9) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Question 10
        questions.question10();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input);

        if (ans == answers.answer10) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        // Calculate percentage
        double percentage = ((double) correct / 10) * 100;

        System.out.println("========== RESULT ==========");
        System.out.println("The total marks are : 100");
        System.out.println("Your marks are : " + correct * 10);
        System.out.println("Total questions are : 10");
        System.out.println("Your correct answers are : " + correct);
        System.out.println("Your wrong answers are : " + wrong);
        System.out.println("Your percentage is : " + percentage + "%");

        input.close();
    }
}


class questions_answers {

    void question1() {
        System.out.println(
            "Q1 What is the capital of Australia?\n" +
            "A) Sydney\n" +
            "B) Melbourne\n" +
            "C) Canberra\n" +
            "D) Brisbane"
        );
    }

    void question2() {
        System.out.println(
            "Q2 Which is the largest planet in our Solar System?\n" +
            "A) Earth\n" +
            "B) Saturn\n" +
            "C) Jupiter\n" +
            "D) Uranus"
        );
    }

    void question3() {
        System.out.println(
            "Q3 What is a baby kangaroo called?\n" +
            "A) Cub\n" +
            "B) Pup\n" +
            "C) Joey\n" +
            "D) Calf"
        );
    }

    void question4() {
        System.out.println(
            "Q4 What is the closest planet to the Sun?\n" +
            "A) Venus\n" +
            "B) Mars\n" +
            "C) Mercury\n" +
            "D) Earth"
        );
    }

    void question5() {
        System.out.println(
            "Q5 In which country can you find the Eiffel Tower?\n" +
            "A) Italy\n" +
            "B) Spain\n" +
            "C) France\n" +
            "D) Germany"
        );
    }

    void question6() {
        System.out.println(
            "Q6 How many days are there in a year?\n" +
            "A) 365\n" +
            "B) 366\n" +
            "C) 360\n" +
            "D) 364"
        );
    }

    void question7() {
        System.out.println(
            "Q7 Which is the fastest animal on land?\n" +
            "A) Lion\n" +
            "B) Cheetah\n" +
            "C) Horse\n" +
            "D) Zebra"
        );
    }

    void question8() {
        System.out.println(
            "Q8 Where do polar bears live?\n" +
            "A) Antarctica\n" +
            "B) The Arctic\n" +
            "C) Greenland\n" +
            "D) Iceland"
        );
    }

    void question9() {
        System.out.println(
            "Q9 Who was the fisrt person to walk on the Moon?\n" +
            "A) Neil Armstrong\n" +
            "B) Buzz Aldrin"
        );
    }

    void question10() {
        System.out.println(
            "Q10 Which is the largest desert in the world?\n" +
            "A) Sahara\n" +
            "B) Gobi\n" +
            "C) Arabian\n" +
            "D) Kalahari"
        );
    }


    // Answer Key
    char answer1 = 'a';
    char answer2 = 'b';
    char answer3 = 'c';
    char answer4 = 'c';
    char answer5 = 'c';
    char answer6 = 'a';
    char answer7 = 'b';
    char answer8 = 'b';
    char answer9 = 'a';
    char answer10 = 'c';
}

