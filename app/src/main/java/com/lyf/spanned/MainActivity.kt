package com.lyf.spanned

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();
    }

    private fun initViews() {
        //设置初始内容
        val str = "一二三四五六七八九十"
        //1:构造SpannableString实例
        val spannableStringEE = SpannableString(str)
        val spannableStringII = SpannableString(str)
        val spannableStringEI = SpannableString(str)
        val spannableStringIE = SpannableString(str)
        //2:构造指定类型的Span，这里使用 AbsoluteSizeSpan,ForegroundColorSpan
        val sizeSpan = AbsoluteSizeSpan(24, true)
        val colorSpan = ForegroundColorSpan(Color.RED)
        //3:将构造的AbsoluteSizeSpan实例,ForegroundColorSpan实例应用于SpannableString实例，只有 flags 有区别
        /**
         * [SpannableString.setSpan]
         */
        spannableStringEE.setSpan(sizeSpan, 2, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringII.setSpan(sizeSpan, 2, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
        spannableStringEI.setSpan(sizeSpan, 2, 4, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        spannableStringIE.setSpan(sizeSpan, 2, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        spannableStringEE.setSpan(colorSpan, 2, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringII.setSpan(colorSpan, 2, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
        spannableStringEI.setSpan(colorSpan, 2, 4, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        spannableStringIE.setSpan(colorSpan, 2, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        //4:将SpannableString实例应用于对应的EditText实例
        tv_span_exclusive_exclusive.setText(spannableStringEE);
        tv_span_inclusive_inclusive.setText(spannableStringII);
        tv_span_exclusive_inclusive.setText(spannableStringEI);
        tv_span_inclusive_exclusive.setText(spannableStringIE);

        val spannableStringPMM =
            SpannableString("一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十")
        spannableStringPMM.setSpan(sizeSpan, 11, 33, Spanned.SPAN_POINT_MARK_MASK)
        spannableStringPMM.setSpan(colorSpan, 11, 33, Spanned.SPAN_POINT_MARK_MASK)
        tv_span_point_mark_mask.setText(spannableStringPMM)

        val spannableStringMM = SpannableString(str)
        spannableStringMM.setSpan(sizeSpan, 2, 4, Spanned.SPAN_MARK_MARK)
        spannableStringMM.setSpan(colorSpan, 2, 4, Spanned.SPAN_MARK_MARK)
        tv_span_mark_mark.setText(spannableStringMM);

        val spannableStringMP = SpannableString(str)
        spannableStringMP.setSpan(sizeSpan, 2, 4, Spanned.SPAN_MARK_POINT)
        spannableStringMP.setSpan(colorSpan, 2, 4, Spanned.SPAN_MARK_POINT)
        tv_span_mark_point.setText(spannableStringMP);

        val spannableStringPM = SpannableString(str)
        spannableStringPM.setSpan(sizeSpan, 2, 4, Spanned.SPAN_POINT_MARK)
        spannableStringPM.setSpan(colorSpan, 2, 4, Spanned.SPAN_POINT_MARK)
        tv_span_point_mark.setText(spannableStringPM);

        val spannableStringPP = SpannableString(str)
        spannableStringPP.setSpan(sizeSpan, 2, 4, Spanned.SPAN_POINT_POINT)
        spannableStringPP.setSpan(colorSpan, 2, 4, Spanned.SPAN_POINT_POINT)
        tv_span_point_point.setText(spannableStringPP);

        val spannableStringParagraph =
            SpannableString("一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十\n一二三四五六七八九十")
        spannableStringParagraph.setSpan(sizeSpan, 11, 33, Spanned.SPAN_PARAGRAPH)
        spannableStringParagraph.setSpan(colorSpan, 11, 33, Spanned.SPAN_PARAGRAPH)
        tv_span_paragraph.setText(spannableStringParagraph)

        val spannableStringComposing = SpannableString(str)
        spannableStringComposing.setSpan(sizeSpan, 2, 4, Spanned.SPAN_COMPOSING)
        spannableStringComposing.setSpan(colorSpan, 2, 4, Spanned.SPAN_COMPOSING)
        tv_span_composing.setText(spannableStringComposing);

        val spannableStringIntermediate = SpannableString(str)
        spannableStringIntermediate.setSpan(sizeSpan, 2, 4, Spanned.SPAN_INTERMEDIATE)
        spannableStringIntermediate.setSpan(colorSpan, 2, 4, Spanned.SPAN_INTERMEDIATE)
        tv_span_intermediate.setText(spannableStringIntermediate);

        val spannableStringUserShift = SpannableString(str)
        spannableStringUserShift.setSpan(sizeSpan, 2, 4, Spanned.SPAN_USER_SHIFT)
        spannableStringUserShift.setSpan(colorSpan, 2, 4, Spanned.SPAN_USER_SHIFT)
        tv_span_user_shift.setText(spannableStringUserShift);

        val spannableStringUser = SpannableString(str)
        spannableStringUser.setSpan(sizeSpan, 2, 4, Spanned.SPAN_USER)
        spannableStringUser.setSpan(colorSpan, 2, 4, Spanned.SPAN_USER)
        tv_span_user.setText(spannableStringUser);

        val spannableStringPriorityShift = SpannableString(str)
        spannableStringPriorityShift.setSpan(sizeSpan, 2, 4, Spanned.SPAN_PRIORITY_SHIFT)
        spannableStringPriorityShift.setSpan(colorSpan, 2, 4, Spanned.SPAN_PRIORITY_SHIFT)
        tv_span_priority_shift.setText(spannableStringPriorityShift);

        val spannableStringPriority = SpannableString(str)
        spannableStringPriority.setSpan(sizeSpan, 2, 4, Spanned.SPAN_PRIORITY)
        spannableStringPriority.setSpan(colorSpan, 2, 4, Spanned.SPAN_PRIORITY)
        tv_span_priority.setText(spannableStringPriority);
    }
}
