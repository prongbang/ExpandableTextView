package com.prongbang.eptv

import android.animation.ObjectAnimator
import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/**
 * Created by prongbang on 2/14/2018 AD.
 */
class ExpandableTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    private var duration: Int = 200
    private var autoDuration: Boolean = false
    private var collapsedMaxLines: Int = 5

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.ExpandableTextView, 0, 0)
        duration = a.getInteger(R.styleable.ExpandableTextView_duration, duration)
        autoDuration = a.getBoolean(R.styleable.ExpandableTextView_autoDuration, autoDuration)
        collapsedMaxLines = a.getInteger(R.styleable.ExpandableTextView_collapsedMaxLines, collapsedMaxLines)
        a.recycle()
    }

    fun expandTextView() {
        val animation = ObjectAnimator.ofInt(this, "maxLines", lineCount)
        animation.setDuration(duration.toLong()).start()
    }

    fun collapseTextView() {
        val animation = ObjectAnimator.ofInt(this, "maxLines", collapsedMaxLines)
        animation.setDuration(duration.toLong()).start()
    }

    fun cycleTextViewExpansion() {
        val animation = ObjectAnimator.ofInt(this, "maxLines", if (maxLines == collapsedMaxLines) lineCount else collapsedMaxLines)
        animation.setDuration(if (autoDuration) ((lineCount - collapsedMaxLines) * 10).toLong() else duration.toLong()).start()
    }

}