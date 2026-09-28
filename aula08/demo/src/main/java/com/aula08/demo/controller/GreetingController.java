package com.aula08.demo.controller;

import com.aula08.demo.model.Greeting;
// Importa AtomicLong pra manter um contador thread-safe, que é mais seguro que um int normal
import java.util.concurrent.atomic.AtomicLong;
// Annotation que indica que essa classe é um controller REST, ou seja, responde requisições HTTP
import org.springframework.web.bind.annotation.GetMapping;
// Captura o parâmetro "name" que vem na URL da requisição
import org.springframework.web.bind.annotation.RequestParam;
// Marca a classe como um @RestController, juntando @Controller e @ResponseBody
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Template da mensagem que vai ser retornada, o %s é o placeholder do nome
    private static final String template = "67 farma aura professor, %s!";
    // Contador atomico pra ir incrementando o id de cada requisição, thread-safe então não trava
    private final AtomicLong counter = new AtomicLong();

    // Mapeia requisições GET para a rota "/apiteste"
    @GetMapping("/apiteste")
    // O método recebe o parâmetro "name" da query string, e se não tiver nada usa o valor default
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Eu odeio Java") String name) {
        // Incrementa o contador e pega o próximo id, depois formata a mensagem com o nome e retorna como JSON
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
