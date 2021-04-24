public class TennisGame {
    public static final int ZERO_POINT = 0;
    public static final int FIRST_POINT = 1;
    public static final int SECOND_POINT = 2;
    public static final int THIRD_POINT = 3;

    public static String getScore(String namePlayer1, String namePlayer2, int scorePlayer1, int scorePlayer2) {
        String notifyScore = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            notifyScore = scoreEqual(scorePlayer1);
        } else if (scorePlayer1 > THIRD_POINT || scorePlayer2 > THIRD_POINT) {
            notifyScore = scoreAdvantage(scorePlayer1, scorePlayer2);
        } else {
            notifyScore = scoreOfTwoPlayer(scorePlayer1, scorePlayer2);
        }
        return notifyScore;
    }

    public static String scoreEqual(int scorePlayer1) {
        String notifyScore;
        switch (scorePlayer1) {
        case ZERO_POINT:
            notifyScore = "Love - All";
            break;
        case FIRST_POINT:
            notifyScore = "Fifteen - All";
            break;
        case SECOND_POINT:
            notifyScore = "Thirty - All";
            break;
        case THIRD_POINT:
            notifyScore = "Forty - All";
            break;
        default:
            notifyScore = "Deuce";
            break;
        }

        return notifyScore;
    }
    public static String scoreAdvantage(int scorePlayer1, int scorePlayer2) {
        String notifyScore;
        int scoreDifferent = scorePlayer1 - scorePlayer2;
        if (scoreDifferent == 1)
            notifyScore = "Advantage player 1";
        else if (scoreDifferent == -1)
            notifyScore = "Advantage player 2";
        else if (scoreDifferent >= 2)
            notifyScore = "Win for player 1";
        else
            notifyScore = "Win for player 2";
        return notifyScore;
    }
    public static String  scoreOfTwoPlayer(int scorePlayer1, int scorePlayer2) {
        String notifyScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = scorePlayer1;
            } else {
                notifyScore += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
            case ZERO_POINT:
                notifyScore += "Love";
                break;
            case FIRST_POINT:
                notifyScore += "Fifteen";
                break;
            case SECOND_POINT:
                notifyScore += "Thirty";
                break;
            case THIRD_POINT:
                notifyScore += "Forty";
                break;
            }
        }
        return notifyScore;
    }   
}
