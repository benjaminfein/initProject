package learning.basic;

import java.util.ArrayList;
import java.util.List;

public class SwitchCase {
    public static List<String> getBankAccount(int seqNumberOfBankAccount) {
        List<String> result = new ArrayList<>();
        switch(seqNumberOfBankAccount) {
            case 45621165: result.add("bankrupt");
                break;
            case 65764852: result.add("1.264.331");
                break;
            case 78646655: result.add("0,1535664");
                break;
            case 11111111: result.add("admin");
                System.out.println(result);
                result.remove("admin");
                break;
            case 12646898: result.add("23.256");
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getBankAccount(65764852));
    }
}
