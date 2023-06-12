package commandPatternExpression;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.*;
import commandPatternExpression.command.Command;
import commandPatternExpression.operations.MultiplyOperation;
import commandPatternExpression.operations.SubtractOperation;
import commandPatternExpression.operations.SumOperation;

import java.net.URL;
import java.util.*;

public class Invoker {
        Map<Character,Command> operatorList = new HashMap<>();

    public int takeRequest(int num1, char operator, int num2) throws Exception {
        Command command;
        List<Class<?>> classes = getClasses(ExpressionCalculation.class.getClassLoader(),"commandPatternExpression/operations");
        for (Class<?> oneClass : classes){
            command =(Command) oneClass.newInstance();
            operatorList.put(command.getKey(),command);
        }
        return operatorList.get(operator).execute(num1,num2);
    }
    public static List<Class<?>> getClasses(ClassLoader cl, String pack) throws Exception{

        String dottedPackage = pack.replaceAll("[/]", ".");
        List<Class<?>> classes = new ArrayList<>();
        URL unpackage = cl.getResource(pack);

        DataInputStream dis = new DataInputStream((InputStream) unpackage.getContent());

        String line = null;

        while ((line = dis.readLine()) != null) {

            if(line.endsWith(".class")) {
                classes.add(Class.forName(dottedPackage+"."+line.substring(0,line.lastIndexOf('.'))));
            }

        }
        return classes;
    }
}