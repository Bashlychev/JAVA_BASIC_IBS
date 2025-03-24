public class Task_12 {
    public static void main(String[] args) {
        String text = "I like Java!!!";

        // 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean hasJava = text.contains("Java");

        // 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean startsCorrectly = text.startsWith("I like");

        // 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean endsCorrectly = text.endsWith("!!!");

        // 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (hasJava && startsCorrectly && endsCorrectly) {
            System.out.println(text.toUpperCase());
        }

        //  5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String replaced = text.replace('a', 'o'); // "I like Jovo!!!"
        String jovo = replaced.substring(7, 11);  // "Jovo"
        System.out.println(jovo);
    }
}
