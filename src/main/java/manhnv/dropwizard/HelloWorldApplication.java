package manhnv.dropwizard;

import io.dropwizard.setup.Environment;
import manhnv.dropwizard.resource.ApiResource;

public class HelloWorldApplication extends io.dropwizard.Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    public void run(HelloWorldConfiguration helloWorldConfiguration, Environment environment) throws Exception {
        // register providers , resources, etc ...
        environment.jersey().register(ApiResource.class);
    }
}
