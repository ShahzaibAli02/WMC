package no.wmc.ui.custom

import android.animation.IntEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator
import no.wmc.R

class PieChartView : View {

    private var percentage: Int = 0
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rectF = RectF()
    private val rectF2 = RectF()

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    private fun init() {
        val customTypeface = resources.getFont(R.font.sf_pro_display_bold)
        textPaint.color = Color.WHITE
        textPaint.textSize = 70f
        textPaint.typeface = customTypeface

        setPaintStyle(paint,"#75DDEA")
        setPaintStyle(paint2,"#384570")

    }

    private fun setPaintStyle(paint: Paint,color:String)
    {
        paint.style = Paint.Style.FILL
        paint.color = Color.parseColor(color)
        paint.strokeCap = Paint.Cap.ROUND;
    }
    private var animator: ValueAnimator? = null
    fun setPercentage(progress: Int) {

        animator?.cancel()
        animator = ObjectAnimator.ofInt(this, "progress", 0, progress)
        animator?.duration = 2000
        animator?.interpolator = DecelerateInterpolator()
        animator?.setEvaluator(IntEvaluator())
        animator?.start()
    }
    fun setProgress(progress: Int) {
        this.percentage = progress
        invalidate() // Request a redraw
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2f
        val centerY = height / 2f
        val radius = Math.min(width, height) / 2f

        // Set the bounds of the oval to be drawn
        rectF.set(centerX - radius, centerY - radius, centerX + radius, centerY + radius)

        // Calculate the angle based on the percentage
        val angle = 360f * percentage / 100f

        // Draw the pie chart

        // Calculate the radius for the inner circle (20% smaller)
        val innerCircleRadius = radius * 0.8f
        rectF2.set(centerX - innerCircleRadius, centerY - innerCircleRadius, centerX + innerCircleRadius, centerY + innerCircleRadius)
        canvas.drawOval(rectF2,paint2)


        canvas.drawArc(rectF, -90f, angle, true, paint)
        drawPercentageText(canvas)
    }
    private fun drawPercentageText(canvas: Canvas)
    {
        val text = "${percentage.toInt()} %"
        val x = width/2f
        val y = height / 2f - (textPaint.ascent() + textPaint.descent()) / 2f
        canvas.drawText(text, x, y, textPaint)
    }

}
