package org.brinkerhoff.sandbox.propertysandbox;

import org.brinkerhoff.sandbox.propertysandbox.models.StateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppComponent {
    private List<StateModel> states;

    @Autowired
    public AppComponent(List<StateModel> states){
        this.states=states;
    }

    public void doStuff(){
        states.stream().forEach(state -> System.out.println(state));
    }

}
