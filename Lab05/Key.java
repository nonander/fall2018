import java.math.BigDecimal;
public class key{
  public static void main(String[]args){
    double score = 0;
    
    /* QUESTION ONE */
    System.out.println("+---+\n|   |\n+---+"); 
    score += 1;
    
    /* QUESTION TWO */
    BigDecimal one = new BigDecimal("4.35");
    BigDecimal two = new BigDecimal("100");
    System.out.println(one.multiply(two)); //435.00
    score += 1;
    
    /* QUESTION THREE */
    System.out.println(3-4+5); //4
    score += 1;
    
    /* QUESTION FOUR */
    System.out.println(3-4*5); //-17
    //+0
    
    /* QUESTION SIX */
    System.out.println(2*3/4); //1
    score += 1;
    
    /* QUESTION SEVEN */
    System.out.println(3%5); //3
    score += 1;
    
    /* QUESTION EIGHT */
    System.out.println(-3%5); //-3
    score += 1;
    
    /* QUESTION NINE */
    System.out.println(5%3); //2
    score += 1;
    
    /* QUESTION TEN */
    System.out.println(5%-3); //2
    score += .5;
    
    /* QUESTION ELEVEN */
    System.out.println(3%-5); //3
    score += 1;
    
    /* QUESTION TWELVE */
    System.out.println(49/17%5); //2
    //+0
    
    /* QUESTION THIRTEEN */
    System.out.println(49/(17%5)); //24
    score += 1;
    
    /* QUESTION FOURTEEN */
    System.out.println(('a' + 'b')%2); //1
    score += 1;
    
    /* QUESTION FIFTEEN */
    System.out.println(false || true); //true
    score += 1;
    
    /* QUESTION SIXTEEN */
    System.out.println(!true && false); //false
    score += 1;
    
    /* QUESTION SEVENTEEN */
    System.out.println(!(true && false)); //true
    score += 1;
    
    /* -----------------------------------*/
    int n = 3;
    
    /* QUESTION EIGHTEEN */
    System.out.println(n > n++); //false
    score += 1;
    
    /* QUESTION NINETEEN */
    System.out.println(++n - n); //0
    //+0
    
    /* QUESTION TWENTY */
    System.out.println(n++ == n++); //false
    score += 1;
    
    /* QUESTION TWENTY ONE*/
    System.out.println(++n == n++); //true
    //+0
    
    n = 3;
    /* QUESTION TWENTY TWO*/
    System.out.println(n++); //3
    score += 1;
    
    n = 3;
    /* QUESTION TWENTY THREE*/
    System.out.println(++n); //4
    score += 1;
    
    /* QUESTION TWENTY FOUR*/
    n = n++ - ++n;
    System.out.println(n < 0); //true
    score += 1;
    
    /* QUESTION TWENTY FIVE */
    System.out.println(n); //-2
    score += 1;
    
    /* QUESTION TWENTY SIX */
    System.out.println("1" + (2 + 5 ) ); //17
    //+0
    
    /* QUESTION TWENTY SEVEN */
    System.out.println("1" + 2 + 3); //123
    score += 1;
    
    /* QUESTION TWENTY EIGHT */
    System.out.println(1 + "2" + 3); //123
    score +=1 ;
    
    /* QUESTION TWENTY NINE */
    System.out.println(1 + 2 + "3"); //33
    score += 1;
    
    /* QUESTION THIRTY */
    System.out.println("tomato".charAt(2) - "potato".charAt(5)); //-2
    score += 1;
    
    /* QUESTION THIRTY ONE */
    System.out.println("eggplant".length()); //8
    score += 1;
    
    /* QUESTION THIRTY TWO */
    System.out.println("eggplant".substring("kale".length())); // "lant"
    score += 1;
    
    /* QUESTION THIRTY THREE */
    System.out.println("kale".charAt(3)); //'e'
    score += 1;
    
    /* QUESTION THIRTY FOUR */
    System.out.println("eggplant".substring("eggplant".length() - 1) ); //'t'
    score += 1;
    
    /* QUESTION THIRTY FIVE */
    System.out.println("beans".substring(1,4)); //"ean"
    score += 1/2;
    /* -----------------------------------*/
    
    /* QUESTION THIRTY SIX */
    //true
    //+0
    
    /* QUESTION THIRTY SEVEN */
    //true
    //+0
    
    /* QUESTION THIRTY EIGHT */
    //true
    score += 1;
    
    /* QUESTION THIRTY NINE */
    boolean a;
    if ( n == 3 ) { a = true; }
    else { a = false; }
    System.out.println(a);
    
    a = (n == 3);
    System.out.println(a);
    //equity
    score += 1;
    
    /* QUESTION FORTY */
    if ( n != 3 ) {a = false;}
    else { a = true; }
    System.out.println(a);
    
    a = (n == 3);
    System.out.println(a);
    //equity
    score += 1;
    
    /* QUESTION FORTY ONE */
    a = false;
    if( n > 3) if (n < 5 ) a = true;
    System.out.println(a);
    
    a = (n == 4);
    System.out.println(a);
    //equity
    score += 1;
    
    /* QUESTION FORTY TWO */
    if(n < 0) {a = true;}
    else a = (n>1);
    System.out.println(a);
    
    a = (n==2)?(n==4):false;
    
    //a?(n<0:(n>1); ->this was my answer, would have worked if I
    //had realized that a would not be cast to the other two answers.
    //The general idea I had was correct, so I am granting myself half credit.
    System.out.println(a);
    score += .5;
    
    /* QUESTION FORTY THREE */
    //( (n<5) || (n>3 )
    //I put n, becuase for any value of n, the answer will be true.
    score += 1;
    
    /* QUESTION FORTY FOUR */
    System.out.println( (n < 3) && (n > 5) );
    System.out.println(n==4);
    //false
    //+0
    
    
    /* -----------------------------------/*
    
    /* QUESTION FORTY FIVE */
    System.out.println("Can every while loop be expressed as a for loop and if so how?");
    String ans = "YES";
    for(int i = 0; i < 3; i ++){
      System.out.println(i);
    }
    int j = 0;
    while(j < 3){
      System.out.println(j);
      j++;
    }
    score += 1;
    
    /* QUESTION FORTY SIX */
    System.out.println("Can every while loop be expressed as a do-while loop and if so how?");
    String secondAns = "YES"; //
    score += .5;
    
    
    /* QUESTION FORTY SEVEN */
    int m = 18, l = 10;
    if (m > 10) { if ( m > 5 ) n = 1; } else n = 2;
    System.out.println(n); //1
    score += 1;
    
    /* QUESTION FORTY EIGHT */
    int g = 18, h = 10;
    if (g>10) if (g > 5) h = 1; else h = 2;
    System.out.println(h); //1
    score +=1 ;
    
    /* QUESTION FORTY NINE */
    int r = 18, s = 10;
    if(r < 10) {if (r > 5) s = 1; } else s = 2;
    System.out.println(s); //2
    score += 1;
    
    /* QUESTION FIFTY */
    int u = 18, v = 10;
    if ( u < 10 ) if ( u > 5 ) v = 1; else v = 2;
    System.out.println(v); //10
    //+0
    
    /* QUESTION FIFTY ONE */
    System.out.println("tomato" == "tomato");
    score += 1;
    
    /* QUESTION FIFTY TWO */
    score += 1;
    
    System.out.println("Final score out of 100: "+ ( score/.52 ));
    System.out.println("Total wrong: " + (52 - score) );
  }
}
