//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Samuel Shadwell
//
// 27 February 2013
// PercolationStats.java
//    Provides a solution to the percolation problem, as part of the algorithms
//    class offered by Princeton University on Coursera.org.
//    More info on this assignment can be found at: 
//    http://coursera.cs.princeton.edu/algs4/assignments/percolation.html
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class PercolationStats {
   public PercolationStats(int N, int T)    // perform T independent computational experiments on an N-by-N grid
   public double mean()                     // sample mean of percolation threshold
   public double stddev()                   // sample standard deviation of percolation threshold
   public double confidenceLo()             // returns lower bound of the 95% confidence interval
   public double confidenceHi()             // returns upper bound of the 95% confidence interval
   public static void main(String[] args)   // test client, described below
}