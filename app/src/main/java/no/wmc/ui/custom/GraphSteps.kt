package no.wmc.ui.custom

import android.animation.IntEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator
import no.wmc.R

class GraphSteps : View {

    private var progress = 0
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rectF = RectF()
    private val rectF2 = RectF()
    private var animator: ValueAnimator? = null

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

        paint.style = Paint.Style.STROKE

        paint.color = Color.WHITE // Adjust the color as needed
        paint.strokeCap = Paint.Cap.ROUND;
    }

    fun setProgressWithAnimation(targetProgress: Int) {
        animator?.cancel()

        animator = ObjectAnimator.ofInt(this, "progress", 0, targetProgress)
        animator?.duration = 2000
        animator?.interpolator = DecelerateInterpolator()
        animator?.setEvaluator(IntEvaluator())
        animator?.start()
    }

    fun setProgress(progress: Int) {
        this.progress = progress
        invalidate() // Request a redraw
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2f
        val centerY = height / 2f
        val radius = Math.min(width, height) / 2f - paint.strokeWidth / 2f
        paint.strokeWidth = Math.min(height,width)*0.1f
        // Set the bounds of the oval to be drawn
        rectF.set(centerX - radius, centerY - radius, centerX + radius, centerY + radius)

        // Calculate the sweep angle based on the progress
        val sweepAngle = 360f * progress / 100f


        drawOvel(centerX, centerY, canvas)


        drawProgress(canvas, sweepAngle)

        drawPercentageText(canvas)
    }

    private fun drawPercentageText(canvas: Canvas)
    {
        val text = "${progress} %"
        val textWidth = textPaint.measureText(text)
        val x = (width - textWidth) / 2f
        val y = height / 2f - (textPaint.ascent() + textPaint.descent()) / 2f
        canvas.drawText(text, x, y, textPaint)
    }

    private fun drawProgress(canvas: Canvas, sweepAngle: Float)
    {
        val backPaint = Paint(paint)
        backPaint.setColor(Color.parseColor("#7265E3"))
        canvas.drawArc(rectF, 0f, 360f, false, backPaint)


        canvas.drawArc(rectF, -90f, sweepAngle, false, paint)
    }

    private fun drawOvel(centerX: Float, centerY: Float, canvas: Canvas)
    {
        val innerCircleRadius = (Math.min(width, height) / 2f) * 0.75f
        rectF2.set(centerX - innerCircleRadius, centerY - innerCircleRadius, centerX + innerCircleRadius, centerY + innerCircleRadius)
        val ovelPaint = Paint(paint)
        ovelPaint.style = Paint.Style.FILL
        val shader = LinearGradient(0f, 0f, width.toFloat(), height.toFloat(), Color.parseColor("#50ACFF"), Color.parseColor("#9DCEFF"), Shader.TileMode.CLAMP) // Set the shader on the paint object
        ovelPaint.shader = shader
        canvas.drawOval(rectF2, ovelPaint)
    }
}
