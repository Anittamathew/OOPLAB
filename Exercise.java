class Exercise
{
    public static void main(String[] args)
    {
        String s1="Happy";
        String s2="Journey";

        System.out.println("String 1 = "+s1);
        System.out.println("String 2 = "+s2);
        System.out.println("Concatination(s1+s2) = "+s1+s2);
        System.out.println("Length of s1 = "+s1.length());
        System.out.println("Character at 5th of s2 = "+s2.charAt(5));
        System.out.println("Comparison of strings = "+s1.compareTo(s2));
        System.out.println("Index of e in s2 = "+s2.indexOf('e'));
        System.out.println("Last Index of p in s1 = "+s1.lastIndexOf('p'));
        System.out.println("Substring of s2 (1,4) = "+s2.substring(0,4));
        System.out.println("s1 to upprecase = "+s1.toUpperCase());
        System.out.println("s2 to lowercase = "+s2.toLowerCase());
        System.out.println("Is s1 equal to s2 = "+s1.equals(s2));
    }
}