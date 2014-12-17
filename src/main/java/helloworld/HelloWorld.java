package helloworld;

import com.couchbase.lite.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {

        try {
            Manager manager = new Manager(new JavaContext("db"), new ManagerOptions());
            System.out.println("manager: " + manager);
            Database database = manager.getDatabase("hello");
            Document document = database.createDocument();

            // write a document
            Map<String, Object> contents = new HashMap();
            contents.put("key","value");
            document.putProperties(contents);

            // fetch document from database
            Document documentFetched = database.getDocument(document.getId());
            System.out.println("documentFetched: " + documentFetched);
            System.out.println("documentFetched props: " + documentFetched.getProperties());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
