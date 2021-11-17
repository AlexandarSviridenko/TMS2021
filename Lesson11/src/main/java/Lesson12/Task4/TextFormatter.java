//package Lesson12.Task4;
//
//import java.util.StringTokenizer;
//
//public class TextFormatter2 {
//    public static int textFormatter(String[] args) {
//        String text = new String("Маша мыла раму. Казак шел по улице насвистывая песню с детства. Сегодня однако был погожий денек для прогулок");
//        int cnt = 0;
//        StringTokenizer ins = new StringTokenizer(text, ".");
//        while (ins.hasMoreTokens()) cnt++;
//        return cnt;
//    }
//
//    public class TextFormatter1{
//
////нужно финальное решение 3 примера, без него не закончу задачу.
//
//    }
//}


//        int counter = 0;
//
//        String text = "Маша мыла раму. Казак шел по улице насвистывая песню с детства. Сегодня однако был погожий денек для прогулок";
//        Matcher matcher = Pattern.compile("(\\\\s+)?\\\\S+(\\\\s*)?").matcher(text);
//
//        while (matcher.find()) {
//            counter++;
//        }
//    }
//}
