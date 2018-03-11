package com.spring.webflux.code.test.springwebfluxtest.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vdvorak on 11.03.18.
 */
@RestController
public class View {

    @GetMapping("/index")
    public Flux<Integer> index() {
        List<Integer> rt = new ArrayList<Integer>(Arrays.asList(11,2,1,8));
        return Flux.fromIterable(rt).sort();

    }
    

}
