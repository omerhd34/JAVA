package switchcase;

public class Main2 {

    public static void main(String[] args) {
        String language = "Java";
        int level = 2;
        String result = "";
        switch (language) {
            case "Python":
                result = "Python bilginiz var.";
                break;
            case "Java":
                switch (level) {
                    case 1:
                        result = "Java bilginiz çok düşük";
                        break;
                    case 2:
                        result = "Java bilginiz orta";
                        break;
                    case 3:
                        result = "Java bilginiz yüksek";
                        break;
                    default:
                        result = "Geçersiz seviye";
                }
                break;
            default:
                result = "Bilinmeyen dil";
        }
        System.out.println(result);  // Java bilginiz orta
    }
}
