package br.com.erudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class greetingControlloer {
    val counter: AtomicLong = AtomicLong()
    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World") name: String?): greeting{
        return greeting(counter.incrementAndGet(), "Hello, $name!")
    }
}