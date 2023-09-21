import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Entrevista {

    /**
     * Count the number of Duplicates
        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

        Example
        "abcde" -> 0 # no characters repeats more than once
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
        "indivisibility" -> 1 # 'i' occurs six times
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice
    */
    
    public static int duplicateCount(String text) {
        Map<Character, Integer> sorter = new HashMap<Character,Integer>();
        for(char target : text.toLowerCase().toCharArray()) {
            if(sorter.containsKey(target) && (){
                int value = sorter.get(target).intValue();
                sorter.put(target, value + 1);
            }
            else sorter.put(target,1);
        }
        int result = 0;
        for (Integer n : sorter.values()) {
            if(n > 1)
            result += 1;
        }
        return result;
  }

    public static String makeComplement(String dna) {
        return dna.chars().map( c -> {
            switch (c) {
                case 'A':
                    return "T";
                case 'T':
                    return "A";
                case 'C':
                    return "G";
                case 'G':
                    return "C";
                default:
                    return c;
            }
        }).collect(String::valueOf)
        .toString();
    }

    public static String getMiddle(String word) {
        int length = word.length();
        int middle = length/2;
        if(length%2 == 0){
            int index = length/2;
            return String.valueOf(word.charAt(index));
        }
        else {
            return word.substring(middle-1,middle+1);
        }
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                     .collect(Collectors.toList())
                     .stream()
                     .min((s1,s2) -> Integer.compare(s1.length(),s2.length()));
    }

    public static int[] digitize(long n) {
        String number = Long.toString(n);
        int length = number.length();
        int[] digits = new int[length];

        for(int i = 0; i < length; i++){
            digits[length - i - 1] = Character.getNumericValue(number.charAt(i));
        }
        return digits;
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int result = 0;
        while(po < p){
            po = po + ((int) (po * percent/100)) + aug;
            result++;
        }
        return result;
    }

    public static String printerError(String s) {
        int length = s.length();
        int errors = 0;
        for(char c : s.toCharArray()){
            if (c < 'a' || c > 'm'){
                errors++;
            }
        }
        return errors + "/" + length;
    }

    public static int[] sortArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                for(int j = i+1, target = i; j < length; j++) {
                    if(array[j] % 2 != 0 && array[j] < target) {
                        array[i] = array[j];
                        array[j] = target;
                        i = j;
                    }
                }
            }
        }
        return array;
    }

    public static String shorterReverseLonger(String a, String b) {
		int length_a = a.length();
        int length_b = b.length();
        
        if(length_a < length_b) {
            String reversed = new StringBuilder(a).reverse().toString();
            return b + reversed + b;
        }
        else {
            String reversed = new StringBuilder(b).reverse().toString();
            return a + reversed + a; 
        }
	}
    
    public static int mostFrequentItemCount(int[] collection) {
        Map<Integer,Integer> frequency = new HashMap<Integer,Integer>();
        int number = 1;
        for(int i : collection){
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }
        int res = -9999;
        for(Map.Entry<Integer,Integer> i : frequency.entrySet()){
            if(i.getValue() > number)
                res = i.getKey();
        }
        return res;
    }

    public static boolean isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()) {
            if(set.contains(c))
                return false;
            else {
                set.add(c);
            }
        }
        return true;
    }

    public static int getCount(String str) {
        int counter = 0;
        for(char c : str.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter += 1;
            }
        }
        return counter;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int base = 2;
        int bits = binary.size();
        int result = 0;
        for(int i = 0; i < bits ; i++){
            if(binary.get(i) == 1)
                result = result + Math.pow(base, i);
        }
        return result;
    }

    public static long digPow(int n, int p) {
		int left_sum = 0;
        String number = Integer.toString(n);
        int i = 0;
        for(char c : Integer.toString(left_sum).toCharArray()) {
            left_sum += Math.pow(c, (p + i));
            i++;
        }
	}

    public static String fakeBin(String numberString) {
        int i = 0;
        for(char c: numberString.toCharArray()){
            if(c < '5')
                c = '1';
            else
                c = '0';
        }
        return numberString;
        
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for(int x : array)
            sum += x;
        if(sum % 2 == 0)
            return "even";
        else return "odd";
    }

    public static int countSmileys(List<String> arr) {
        int flag = 0,
            res = 0;
        for(String s : arr){
            char[] c = s.toCharArray();
            if(s.length() == 2 && (c[0] == ':') && 
              (c[1] == ')' || c[1] == 'D')
            ){
                res +=1;
            }
            else if(s.length() == 3 && 
                   (c[0] == ':' || c[0] == ';' ) && 
                   (c[1] == '-' || c[1] == '~') &&
                   (c[2] == ')' || c[2] == 'D')
            ){
                res +=1;
            }
        }
        return 0;
    }

    public static int[] solve (int[] arr){  
        int[] response = new int[arr.length];

        int i = 0;
        while(arr.length != 0){
            if (i % 2 == 0)
                response[i] = Arrays.stream(arr).max().getAsInt();
            else
                response[i] = Arrays.stream(arr).min().getAsInt();    
            for(int j = 0,flag = 0; j < arr.length;j++){
                if(arr[j] == response[i]){
                    flag = 1;
                    arr[j] = arr[j+1];
                }
                if(flag == 1)
                    arr[j] = arr[j+1];
            }
            i++; 
        }
        return response;
    }

    public static int[] snail(int[][] array) {
        int size = 0, 
            rows_start = 0,
            rows_end = 0,
            columns_start = 0,
            columns_end = 0,
            index = 0;

        for(int[] i : array){
            rows_end = +1;
            for(int number : i)
                size += 1;
        }
        columns_end = rows_end;
        int[] res = new int[size];
        while(rows_start <= rows_end && columns_start <= columns_end){
            //percorre primeiro array
            for(int i = columns_start; i < columns_end; i++,index++){
                res[index] = array[rows_start][i];
            }
            rows_start += 1;

            for(int i = rows_start; i < rows_end; i++,index++){
                res[index] = array[i][columns_end-1];
            }
            column_end -= 1;

            for(int i = columns_end-1; i > columns_start ; i--,index++){
                res[index] = array[rows_end][i];
            }
            rows_end -= 1;

            for(int i = rows_end; i < rows_start ; i--, index++){
                res[index] = array[i][column_start];
            }
            columns_start += 1;
        }
        return res;
    }

    public String spinWords(String sentence) {
        String[] strings = sentence.split(" ");
        int n = strings.length;
        StringBuilder response = new StringBuilder();
        for(int i = 0; i < n;i++) {
            String s = strings[i];
            int length = s.length();
            if(length >= 5){
                StringBuilder res = new StringBuilder();
                res = res.append(s);
                s = res.reverse().toString();
                
            }
            if(n == 1 || i + 1 == n){
                response.append(s)
            }
            else response.append(s).append(' ');
        }
        return response.toString();
    }

    public double[] tribonacci(double[] s, int n) {
        double[] res = new double[n];
        res = s;
        for(int i = 3; i < n ; i++){
            res[i] = res[i-3] + res[i-2] + res[i-1];
        }
        return res;
    }

    public static String high(String s) {
        String[] strings = s.split(" ");
        int n = strings.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for(char c: strings[i].toLowerCase().toCharArray()){
                res[i] += (c - 96); 
            }
        }
        int max = 0,
        max_index = -1;
        for(int i = 0; i < n; i++) {
            if(max < res[i]){
                max = res[i];
                max_index = i;
            }
        }

        return strings[max_index];
    }

    public static String highAndLow(String numbers) {
        String[] n = numbers.split(" ");
        int max = Integer.parseInt(n[0]), min = Integer.parseInt(n[0]);
        int index_max = 0, index_min = 0;

        for(int i = 1; i < n.length; i++) {
            if(max < Integer.parseInt(n[i])){
                max = Integer.parseInt(n[i]);
                index_max = i;
            }
            if(min >(int) Integer.parseInt(n[i])){
                min = Integer.parseInt(n[i]);
                index_min = i;
            }
        }
        if(min == max){
            return n[index_max];
        }
        else{
            return n[index_max] + " " + n[index_min];
        }
        
    }

    public static String longestConsec(String[] strarr, int k) {
        int length = strarr.length;
        String[] strings = new String[length-1];
        for(int i = 0; i < length - 1 ; i++){
            String s1 = strarr[i];
            String s2 = strarr[i + 1];
            strings[i] = s1 + s2;
        }
        int[] lengths = new int[length-1];
        for(int i = 0; i < strings.length; i++){
            lengths[i] = strings[i].length();
        }
        int max = Arrays.stream(lengths).max().getAsInt();
        for(int i = 0; i < length - 1; i++){
            if(max == strings[i])
                return strings[i];
        }

        return "";
    }

    public static String formatDuration(int seconds) {
        if(seconds == 0)
            return "now";
        
        List<String> resList = new ArrayList<>();

        double to_years = (((seconds/60)/60)/24)/365;
        int years = (int) Math.floor(to_years);
        if(years == 1)
            resList.add("1 year");
        else if(years > 1){
            String str = years + " years"; 
            resList.add(str);
        }

        double to_days = (to_years % 365) * 365;
        int days = (int) Math.floor(to_days);
        if(days == 1)
            resList.add("1 day");
        else if(days > 1){
            String str = days + " days";
            resList.add(str);
        }

        double to_hours = (to_days % 24) * 24;
        int hours = (int) Math.floor(to_hours);
        if(hours == 1)
            resList.add("1 hour");
        else if(hours > 1){
            String str = hours + " hours";
            resList.add(str);
        }

        double to_minutes = (to_hours % 60) * 60;
        int minutes = (int) Math.floor(to_minutes);
        if(minutes == 1)
            resList.add("1 minute");
        else if(minutes > 1){
            String str = minutes + "minutes";
            resList.add(str);
        }

        double to_seconds = (to_minutes % 60) * 60;
        int s = (int) Math.floor(to_seconds);
        if(s == 1)
            resList.add("1 second");
        else if(s > 1){
            String str = s + " seconds";
            resList.add(str);
        }



        StringBuilder res = new StringBuilder();
        int length = resList.size();
        if(length == 1)
            return resList.get(0);

        for(int i = 0; i < length; i++){
            if(i == 0)
                res.append(resList.get(i));
            else if(i == length - 1)
                res.append(" and ").append(resList.get(i));
            else 
                res.append(", ").append(resList.get(i));
        }

        return res.toString();        
    }                   
}