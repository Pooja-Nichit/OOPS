class AsciiDemo{
    public static void main(String[] args) {
        // Character literal and its ASCII value
        char a = 'A';
        int c = (int) a;
        System.out.println(a + " ASCII value: " + c);

        // String literal and its ASCII values
        String s = "HELLO Pooja";
        System.out.println(s + " ASCII values: ");
        
        // Iterate through the string and print ASCII values of each character
        for (int i = 0; i < s.length(); i++) {
			
            System.out.print((int)(s.charAt(i)) + " ");
        }
    }
}