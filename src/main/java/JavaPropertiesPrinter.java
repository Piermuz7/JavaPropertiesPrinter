/**
 * Simple class that prints some information properties about your JRE.
 *
 * @author Piermuz
 * @see System
 * @see java.util.Properties
 * @see java.util.Properties#getProperty(String)
 * @see java.util.Properties#getProperty(String, String)
 * @see System#getProperties()
 */
public class JavaPropertiesPrinter {
    public static void main(String[] args) {
        System.out.println("JRE version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("\nJava vendor : " + System.getProperty("java.vendor"));
        System.out.println("Java URL vendor: " + System.getProperty("java.vendor.url"));
        System.out.println("\nJava installation directory: " + System.getProperty("java.home"));
        System.out.println("\nJVM specifications version: " + System.getProperty("java.vm.specification.version"));
        System.out.println("JVM specifications vendor: " + System.getProperty("java.vm.specification.vendor"));
        System.out.println("JVM specifications name : " + System.getProperty("java.vm.specification.name"));
        System.out.println("\nJVM implementation version : " + System.getProperty("java.vm.version"));
        System.out.println("JVM implementation vendor : " + System.getProperty("java.vm.vendor"));
        System.out.println("JVM implementation name : " + System.getProperty("java.vm.name"));
        System.out.println("\nJRE specifications version : " + System.getProperty("java.specification.version"));
        System.out.println("JRE specifications vendor : " + System.getProperty("java.specification.vendor"));
        System.out.println("JRE specifications name : " + System.getProperty("java.specification.name"));
        System.out.println("\nJava Class Format version number: " + System.getProperty("java.class.version"));
        System.out.println("Java Class path: " + System.getProperty("java.class.path"));
        System.out.println("\nLibrary paths list: ");
        String paths = System.getProperty("java.library.path");
        splittedStringBy(';', paths);
        System.out.println("Java temporary default files path: " + System.getProperty("java.io.tmpdir"));
        System.out.println("JIT Compiler name to use: " + System.getProperty("java.compiler"));
        System.out.println("Path of extension directory or directories: " + System.getProperty("java.ext.dirs"));
        System.out.println("\nOperating System name: " + System.getProperty("os.name"));
        System.out.println("Operating System Architecture: " + System.getProperty("os.arch"));
        System.out.println("Operating System version: " + System.getProperty("os.version"));
        System.out.println("\nFile separator: " + System.getProperty("file.separator"));    // UNIX / WINDOWS \
        System.out.println("Path separator: " + System.getProperty("path.separator"));    // UNIX : WINDOWS ;
        System.out.println("Line separator: " + System.getProperty("line.separator") + "newline");
        System.out.println("\nUser name: " + System.getProperty("user.name"));
        System.out.println("User home directory: " + System.getProperty("user.home"));
        System.out.println("Current user directory: " + System.getProperty("user.dir"));
    }

    private static void splittedStringBy(char separator, String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == separator) {
                System.out.println(str);
                str = new StringBuilder();
            } else
                str.append(s.charAt(i));
        }
    }

}
