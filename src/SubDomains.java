import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomains {
        public static void main(String[] args) {
            System.out.println(subdomains(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
            // ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
        }

//    -  SUBDOMAIN VISITS:
//A website domain "discuss.leetcode.com" consists of various subdomains. At the top level,
//we have "com", at the next level, we have "leetcode.com" and at the lowest level, "discuss.leetcode.com".
//When we visit a domain like "discuss.leetcode.com", we will also visit the parent
//domains "leetcode.com" and "com" implicitly.
//A count-paired domain is a domain that has one of the two formats "rep d1.d2.d3" or "rep d1.d2" where
// rep is the number of visits to the domain and d1.d2.d3 is the domain itself.

//For example, "9001 discuss.leetcode.com" is a count-paired domain that indicates that
// discuss.leetcode.com was visited 9001 times.

//Given an array of count-paired domains cpdomains, return an array of the count-paired domains of each subdomain
// in the input. You may return the answer in any order.

//Example 2:
//Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
//Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
//Explanation: We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
//For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.

        static List<String> subdomains(String[] cpdomains) {
            //create a list to store the result
            List<String> res = new ArrayList<>();
            //create a map to map the domains
            Map<String, Integer> map = new HashMap<>();
            //iterate through cp domains
            for (var domain : cpdomains) {
                //split the string by space and save the qty in a variable
                var st = domain.split(" ");
                var qty = Integer.parseInt(st[0]);
                //split the rest of the string by .
                var rest = st[1].split("\\.");
                //loop through the strings
                for (int i = 0; i < rest.length; i++) {
                    //create a sublist with the index i to len of the list
                    List<String> s = new ArrayList<>(List.of(rest));
                    var sub = s.subList(i, rest.length);
                    //join the sublist using . as the delimiter
                    var joined = String.join(".", sub);
                    //add joined string to map with the qty as the value
                    if (map.containsKey(joined)) {
                        map.put(joined, map.get(joined) + qty);
                    }
                    if (!map.containsKey(joined)) {
                        map.put(joined, qty);
                    }
                }

            }
            if (!map.isEmpty()) {
                //iterate through map and add value + key to the result
                for (var key : map.keySet()) {
                    var qty = String.valueOf(map.get(key));
                    var s = key;
                    res.add(qty + " " + s);

                }

            }
            //return result
            return res;
        }
    }

