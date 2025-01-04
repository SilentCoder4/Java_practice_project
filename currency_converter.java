import netscape.javascript.JSObject;
import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
//json jar addisonal file download "https://github.com/stleary/JSON-java?tab=readme-ov-file"
public class currency_converter {
    public static void main(String args[]) throws IOException {

        HashMap<Integer, String> curencycodes = new HashMap<Integer,String>();

        curencycodes.put(1, "EUR");
        curencycodes.put(2, "INR");

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the currency converter: ");

        System.out.println("Currency converting From? ");
        System.out.println("1 : USD (US Dollar)\t 2 : INR (Indian Rupee)");
        fromCode = curencycodes.get(sc.nextInt());

        System.out.println("Currency converting To? ");
        System.out.println("1 : USD (US Dollar)\t 2 : INR (Indian Rupee)");
        toCode = curencycodes.get(sc.nextInt());

        System.out.println("Amount you wish to convert?");
        amount = sc.nextFloat();

        sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("Thank you for using the currency converter");
    }
    private static void sendHttpGETRequest(String formCode, String toCode, double amount) throws IOException {
        String api = "541a5924a0461aeebfa5cf3c5a240cd4";
        String GET_URL = "https://api.exchangeratesapi.io/v1/latest?access_key=" + api + "&fbase=" + toCode + "&symbols=" + formCode;
        URL url = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }in.close();
            JSONObject obj = new JSONObject(response.toString());
            Double exchangeRate = obj.getJSONObject("rates").getDouble(formCode);
            System.out.println(obj.getJSONObject("rates"));
            System.out.println(exchangeRate);
            System.out.println();
            System.out.println(amount + formCode + " = " + amount/exchangeRate + toCode);
        }
        else{
            System.out.println("GET request Failed!!");
        }
    }
}