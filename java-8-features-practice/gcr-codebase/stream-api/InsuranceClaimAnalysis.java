package stream_API;
import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 50000),
                new Claim("Health", 30000),
                new Claim("Vehicle", 20000),
                new Claim("Vehicle", 40000)
        );

        Map<String, Double> avgClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              c -> c.type,
                              Collectors.averagingDouble(c -> c.amount)
                      ));

        avgClaimAmount.forEach((k, v) ->
                System.out.println(k + " Average Claim: " + v));
    }
}
