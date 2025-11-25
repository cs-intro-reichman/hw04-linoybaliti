public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
  //  public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code

     //   for (int i =0; i< sentences.length; i++){
    //       for (int j=0; j<keywords.length; j++){
      //      if (sentences[i].contains(keywords[j])) {
              //  System.out.println(sentences[i]);
       //     }
            
      //     }


     //   }



   // }


/**
 * מדפיס את כל המשפטים במערך sentences שמכילים 
 * לפחות אחת ממילות המפתח במערך keywords, ללא רגישות לאותיות.
 */
public static void detectAndPrint(String[] sentences, String[] keywords) {
    
    // לולאה חיצונית: עוברת על כל משפט
    for (String sentence : sentences) {
        
        // 1. חובה: המרת המשפט לאותיות קטנות לטיפול ב-Case-Insensitive
        String lowerCaseSentence = sentence.toLowerCase();
        
        // לולאה פנימית: עוברת על כל מילת מפתח
        for (String keyword : keywords) {
            
            // 2. חובה: השוואה ללא רגישות לאותיות
            if (lowerCaseSentence.contains(keyword.toLowerCase())) {
                
                // 3. מדפיס את המשפט המקורי (עם הרישיות שלו)
                System.out.println(sentence); 
                
                // 4. חובה: יציאה מיידית מהלולאה הפנימית
                //   כדי למנוע הדפסה חוזרת של אותו משפט אם הוא מכיל יותר מקלישאה אחת.
                break; 
            }
        }
    }
}







}
