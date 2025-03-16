public class RelatedDsaTopic {

    public static void main(String[] args) {



        String s = "pearl";
        System.out.println(s.substring(2,4));
        // we can use default substring method for 1 string.

        StringBuilder builder = new StringBuilder(" Initial StringBuilder ");

        builder.append(" is great to have.");
        System.out.println(builder);

        builder.insert(0,"Lets do more stuff with string builder.");
        System.out.println(builder);

        builder.replace(0,7, "Welcome to ");
        System.out.println(builder);

        builder.delete(builder.length()-5, builder.length());
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.reverse();
        int capacity = builder.capacity(); // memory capacity.
        System.out.println(capacity);

        builder.ensureCapacity(164);
        System.out.println(builder.capacity());

        int length = builder.length(); // length of builder.
        System.out.println(length);

        char builderChar = builder.charAt(0);
        System.out.println(builderChar);

        builder.setCharAt(0,'V');
        System.out.println(builder);

        String subString = builder.substring(0, 7);
        System.out.println(subString);

        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
        int indexOfWelcome = builder.indexOf("ot");
        System.out.println(indexOfWelcome);

        builder.deleteCharAt(78);
        System.out.println(builder);

        String result = builder.toString();
        System.out.println(result);










    }

}
