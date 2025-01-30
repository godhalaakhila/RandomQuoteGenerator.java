public class RandomQuoteGenerator {
    public static void main(String[] args){
        String[]quotes={
            "Believe you can and you're halfway there",
            "The only way to do great work is to love what you do.",
        };
        String randomQuote=quotes[(int)Math.random()*quotes.length];
        System.out.println("Random Quote:"+randomQuote);
    }
    
}
