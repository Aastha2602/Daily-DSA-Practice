class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailsSet = new HashSet<>();
        
        for (String e : emails) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < e.length(); i++) {
                if (e.charAt(i) == '.') {
                    continue;
                } else if (e.charAt(i) == '+') {
                    int idx = e.length() - 1;
                    while (e.charAt(idx) != '@') {
                        idx--;
                    }
                    sb.append(e.substring(idx));
                    break;
                } else if(e.charAt(i) == '@')  {
                    sb.append(e.substring(i));
                    break;
                } else {
                    sb.append(e.charAt(i));
                }
            }
            emailsSet.add(sb.toString());
        }
        return emailsSet.size();
    }
}