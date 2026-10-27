
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String name = parts[0].split("\\+")[0].replace(".", "");
            set.add(name + "@" + parts[1]);
        }
        return set.size();
    }
}
