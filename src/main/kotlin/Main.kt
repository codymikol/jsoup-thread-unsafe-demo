import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.parser.Parser

const val document = "<html><body><div>hey</div></body></html>"

val parser: Parser = Parser.htmlParser()

suspend fun main(args: Array<String>): Unit = withContext(Dispatchers.IO) {
    repeat(2) { launch {
        parser.parseInput(document, "")
    } }
}

