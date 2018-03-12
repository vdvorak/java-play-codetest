package com.spring.webflux.code.test.springwebfluxtest.view;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.webflux.code.test.springwebfluxtest.model.Customer;
import org.joda.time.DateTime;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by vdvorak on 11.03.18.
 */
@RestController
public class View {

    private final Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @PostMapping(value = "/sort/customer/by/dueTime", consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_EVENT_STREAM_VALUE})
    public ResponseEntity<?> sortCustomerByDueTime(@RequestBody List<Customer> listCustomer) {
        listCustomer.forEach((s) -> {
            System.out.println(s);
        });
        // sort by duetime
        Comparator<Customer> byDueTime = (Customer o1, Customer o2) -> o1.getDuetime().compareTo(o2.getDuetime());
        return ResponseEntity.ok(Flux.fromIterable(listCustomer).sort(byDueTime));
    }

    @PostMapping(value = "/sort/customer/by/joinTime", produces = {MediaType.TEXT_EVENT_STREAM_VALUE})
    public ResponseEntity<?> sortCustomerByJoinTime(@RequestBody final List<Customer> listCustomer) {
        Comparator<Customer> byJoinTime = (Customer o1, Customer o2) -> o1.getJointime().compareTo(o2.getJointime());
        listCustomer.forEach((s) -> {
            System.out.println(s);
        });
        return ResponseEntity.ok(Flux.fromIterable(listCustomer).sort(byJoinTime));
    }

}
