import java.util.HashMap;

class decodemessage {
    public String decodeMessage(String key, String message) {
        String matcher = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < key.length(); i++) {
            if (!map.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                map.put(key.charAt(i), matcher.charAt(index));
                index++;
            }
        }
        for (int i = 0; i < message.length(); i++) {
            if (map.containsKey(message.charAt(i))) {
                sb.append(map.get(message.charAt(i)));
            }
            if (message.charAt(i) == ' ') {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo"; //e->a, l-->b, j->c
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";//
        decodemessage solution = new decodemessage();
        String decodedMessage = solution.decodeMessage(key, message);
        System.out.println(decodedMessage);  // Output: "this is a secret"
    }
}
