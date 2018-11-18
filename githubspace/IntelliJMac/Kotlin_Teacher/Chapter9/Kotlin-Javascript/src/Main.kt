import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.CanvasUserInterface
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.get
import kotlin.browser.document
import kotlin.dom.clear

/**
 * Created by benny on 4/30/17.
 */

fun main(args: Array<String>) {
    document.getElementById("title")?.innerHTML = "Hello World from Kotlin!!"
    val canvas = document.getElementById("myCanvas") as HTMLCanvasElement
    val cxt=canvas.getContext("2d") as CanvasRenderingContext2D
    cxt.fillStyle ="#ffffff"
    cxt.strokeStyle = "#FF0000"
    cxt.moveTo(canvas.width / 2.0, canvas.height / 2.0)
    canvas.onclick = { event ->
        if(event is MouseEvent){
            cxt.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())
            cxt.lineTo(event.offsetX, event.offsetY)
            cxt.stroke()
        }
    }
}