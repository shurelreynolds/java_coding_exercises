    package com.techreturners.exercise001;

    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.util.List;

    public class Exercise001 {
        public String capitalizeWord(String word) {
            // Add your code here
          if(word!=null && word.length()>1)
            return Character.toUpperCase(word.charAt(0))+word.substring(1);
    else if(word.length()==1)
    return word.toUpperCase();

            return "";
        }

        public String generateInitials(String firstName, String lastName) {
            // Add your code here
            return firstName.charAt(0)+"."+lastName.charAt(0);
        }

        public double addVat(double originalPrice, double vatRate) {
            // Add your code here
            double output=originalPrice+((originalPrice*vatRate)/100);
            BigDecimal bd = new BigDecimal(Double.toString(output));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }

        public String reverse(String sentence) {
            // Add your code here
            StringBuilder input = new StringBuilder();
            input.append(sentence);

         return input.reverse().toString();
                }

        public int countLinuxUsers(List<User> users) {
            // Add your code here
            return (int)users.stream().filter(u->u.getType().equals("Linux")).count();
        }
    }
