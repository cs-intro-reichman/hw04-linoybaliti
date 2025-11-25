public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
       // char [] arraystr = new char[str.length()]; // יצירת מערך של תווים שלשם נכניס את התווים בסטרינג
           String s = "";
       for (int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            int unicodecheck = (int) c;
            if (unicodecheck >= 65 && unicodecheck <=90){ // זה אומר שהוא לוור קייס
                unicodecheck += 32;
            }
           c = (char) unicodecheck;
         
             s += c;
         //  arraystr [i] = c;

        }
        // דוגמה: ניצור מחרוזת מ-arr, החל מהאינדקס 0, באורך arr.length
        //String newStr = new String(arr, 0, arr.length);
        return s;
    }


    public static String arrayToString(char[] arr) {
    // 1. יצירת אובייקט String חדש מהמערך arr
    String newStr = new String(arr); 
    // 2. החזרת המחרוזת
    return newStr;
    }


    
    /** If str1 contains str2, returns true; otherwise returns false. */
   // public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
      //  int x = IndexIfCharExistsInString(str1.charAt(0), str2);
      //  int y = countApperance(str1.charAt(0), str2);
      // if (y!= 0){
      //  boolean flag = true;
       // for (int i =0; i<y; i++){
       //     flag = true;
       //     for (int j=0; j<str1.length(); j++){
         //       if (str1.charAt(j) != str2.charAt(x)){
           //         flag = false;
           //     }
                
         //   }
         //   if (flag == true){
           //         return true;
         //   }
          //  else {
              //  str2 = str2.substring(x, str2.length());
              //  x = IndexIfCharExistsInString(str1.charAt(0), str2);

         //   }

      // }

  //  }
  //   return false;
 //}



   /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    
    // 1. טיפול במקרי קצה עבור str2 (המחרוזת הקטנה/התבנית)
    if (str2.length() == 0) {
        return true;
    }
    // 2. אם המחרוזת הגדולה (str1) קטנה מהתבנית (str2), אין הכלה
    if (str2.length() > str1.length()) {
        return false;
    }

    // הגדרת הגבול של הלולאה החיצונית: רצים על str1 (הגדולה)
    int maxStart = str1.length() - str2.length();

    // לולאה חיצונית (i): עוברת על נקודות ההתחלה האפשריות ב-str1
    for (int i = 0; i <= maxStart; i++) {
        
        // נבדוק האם התו הראשון של str2 תואם ל-str1 במיקום הנוכחי (i)
        if (str2.charAt(0) == str1.charAt(i)) {
            
            boolean match = true;
            
            // לולאה פנימית (j): בודקת התאמה רציפה של str2
            for (int j = 1; j < str2.length(); j++) {
                
                // ההשוואה הקריטית: התו ב-str2[j] מול התו ב-str1[i + j]
                if (str2.charAt(j) != str1.charAt(i + j)) {
                    match = false;
                    break; 
                }
            }
            
            // אם נמצאה התאמה מלאה
            if (match) {
                return true;
            }
        }
    }

    // אם סיימנו את כל הבדיקות ולא מצאנו
    return false;
}

    public static int countApperance (char c, String s){ // פעולה שמחזירה כמה פעמים תו מסויים מופיע בסטרינג
        int counter=0;
        for (int i=0; i<s.length(); i++){
            if (c == s.charAt(i)){
                counter++;
            }
           
        }
        return counter;
    }
   
    public static int IndexIfCharExistsInString (char c, String str){ // פונקציית עזר שמקבלת תו 
    // ומחזירה את האינדקס שהוא נמצא בסטרינג ואם לא נמצא מחזירה -1
        for (int i =0; i< str.length(); i++){
            if (c == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

   


}
