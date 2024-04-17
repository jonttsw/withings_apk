package com.withings.design.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import androidx.core.content.res.g;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
/* compiled from: CustomTextAppearanceSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/design/utils/CustomTextAppearanceSpan;", "Landroid/text/style/TextAppearanceSpan;", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CustomTextAppearanceSpan extends TextAppearanceSpan {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f36153a;

    /* renamed from: b  reason: collision with root package name */
    private float f36154b;

    public CustomTextAppearanceSpan(Context context, int i11) {
        super(context, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, l.W(new Integer[]{16843692, 16843958}));
        this.f36154b = obtainStyledAttributes.getFloat(1, 0.0f);
        this.f36153a = g.e(obtainStyledAttributes.getResourceId(0, C1987R.font.roboto_regular), context);
        obtainStyledAttributes.recycle();
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        u.k(paint, "paint");
        super.updateDrawState(paint);
        paint.setTypeface(this.f36153a);
        paint.setLetterSpacing(this.f36154b);
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        u.k(paint, "paint");
        super.updateMeasureState(paint);
        paint.setTypeface(this.f36153a);
        paint.setLetterSpacing(this.f36154b);
    }
}
