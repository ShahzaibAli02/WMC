package no.wmc.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lno/wmc/ui/custom/GraphSteps;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animator", "Landroid/animation/ValueAnimator;", "paint", "Landroid/graphics/Paint;", "progress", "", "rectF", "Landroid/graphics/RectF;", "rectF2", "textPaint", "drawOvel", "", "centerX", "", "centerY", "canvas", "Landroid/graphics/Canvas;", "drawPercentageText", "drawProgress", "sweepAngle", "init", "onDraw", "setProgress", "setProgressWithAnimation", "targetProgress", "wmc-3.1.40-b11_prodRelease"})
public final class GraphSteps extends android.view.View {
    private int progress = 0;
    private final android.graphics.Paint paint = null;
    private final android.graphics.Paint textPaint = null;
    private final android.graphics.RectF rectF = null;
    private final android.graphics.RectF rectF2 = null;
    private android.animation.ValueAnimator animator;
    
    public GraphSteps(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public GraphSteps(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void init() {
    }
    
    public final void setProgressWithAnimation(int targetProgress) {
    }
    
    public final void setProgress(int progress) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void drawPercentageText(android.graphics.Canvas canvas) {
    }
    
    private final void drawProgress(android.graphics.Canvas canvas, float sweepAngle) {
    }
    
    private final void drawOvel(float centerX, float centerY, android.graphics.Canvas canvas) {
    }
}