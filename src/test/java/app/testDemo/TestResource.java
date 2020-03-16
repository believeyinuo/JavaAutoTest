package app.testDemo;

import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestResource {
    public String name;
    public int age;

    @Test
    public void readFile(){
        System.out.println(this.getClass().getResource("/"));

        System.out.println(this.getClass().getResource("/app/TestStock.yaml"));

        new File(this.getClass().getResource("/app/TestStock.yaml").getPath()).toString();


    }

    @Test
    public void writeJson() throws IOException {
       ObjectMapper mapper = new ObjectMapper();
       mapper.writeValue(new File("demo.json"), this);
    }

    @Test
    public void readJson() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        TestResource demo = mapper.readValue(new File("demo.json"), this.getClass());
    }

    @Test
    public void readYaml(){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Object[][] demo = mapper.readValue(this.getClass().getResourceAsStream("/app/testStock.yaml"),
                Object[][].class);
    }
}
