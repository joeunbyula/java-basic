package class1.ex;

import class1.Student;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "영화1";
        movieReview1.review = "영화 재미있음";
        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "영화2";
        movieReview2.review =  "영화2 재미있음";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for(MovieReview movieReview : movieReviews) {
            System.out.println("영화 이름 : " + movieReview.title+", 리뷰 : " +movieReview.review);}
    }

}
