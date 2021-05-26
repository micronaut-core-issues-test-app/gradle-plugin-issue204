package gradle.plugin.issue204;

import io.micronaut.context.annotation.Value;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import javax.inject.Singleton;

@Singleton
public class MyBean implements ApplicationEventListener<ServerStartupEvent> {

    @Value("${some.text}")
    String someText;

    @Override
    public void onApplicationEvent(ServerStartupEvent event) {
        System.out.println("-------> someText = " + someText);
    }
}
