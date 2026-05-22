class Solution {

    public String encode(List<String> strs) {
        if(strs.size()<0) return "";
        StringBuilder encodedString = new StringBuilder();
        for(String s : strs){
            encodedString = encodedString.
            append(s.length()).append("#").append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> list = new ArrayList<>();
        while(i<str.length()){

            int index = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,index));

            i = index + 1;
            list.add(str.substring(i,i+length));
            i = i + length;
        }
        return list;
    }
}
