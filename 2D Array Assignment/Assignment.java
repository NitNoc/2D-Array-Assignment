public class Assignment    {
    public static void main(String[] args)  {
        int[][] ratings = { {4,6,2,5},
                {7,9,4,8},
                {6,9,3,7} };
        //movieAvgRating(ratings, 0);
        System.out.println("Movie zero's average rating" + ratings);
        System.out.println("Toughest reviewer is " + hardestReviewer2018(ratings));
        System.out.println("Worst movie is " + worstMovie2018(ratings));
    }
    //One
    public static int movieAvgRating(int[][] ratings, int movie)   {
        int sum = 0;
        for(int i = 0; i < ratings.length; i++) {
            sum += ratings[i][movie];
        }
        return (int)sum/ratings.length;
    }
    //Two
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        double sum = 0;
        for (int c = 0; c < ratings[0].length; c++) {
            sum += ratings[reviewer][c];
        }
        return (int)sum/ratings[0].length;
    }
    //Three
    public static int avgRating2018(int[][] ratings) {
        double sum = 0;
        double rating = ratings.length * ratings[0].length;
        for (int r = 0; r < ratings.length; r++) {
            for (int c = 0; c < ratings[0].length; c++) {
                sum += ratings[r][c];
            }
        }

        return (int)(sum/rating);
    }
    //Four
    public static int hardestReviewer2018(int[][] ratings) {
        int index = 0;
        int avg = reviewerAvgRating(ratings, 0);
        for (int r = 1; r < ratings.length; r++) {
            int n =  reviewerAvgRating(ratings, r);
            if (n < avg) {
                index = r;
                avg = n;
            }
        }
        return avg;
    }
    //Five
    public static int worstMovie2018(int[][] ratings) {
        int index = 0;
        int avg   = movieAvgRating(ratings, 0);
        for (int c = 1; c < ratings[0].length; c++) {
            int n = movieAvgRating(ratings, c);
            if (n < avg) {
                index = c;
                avg = n;
            }
        }
        return index;
    }
}
