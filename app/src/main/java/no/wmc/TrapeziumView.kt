package no.wmc

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class TrapeziumView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val path = Path()

    override fun onDraw(canvas: Canvas) {
        path.reset()
        val width = measuredWidth.toFloat()
        val height = measuredHeight.toFloat()
        path.moveTo(0f, 0f)
        path.lineTo(width, 0f)
        path.lineTo(width * 0.8f, height)
        path.lineTo(width * 0.2f, height)
        path.close()
        canvas.clipPath(path)
        super.onDraw(canvas)
    }
}