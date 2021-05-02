package poc.dani.kotlin.kotlinsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Main

fun main(args: Array<String>) {
	runApplication<Main>(*args)
}
