package com.withings.util.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
/* compiled from: CustomTextAppearanceSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/util/ui/CustomTextAppearanceSpan;", "Landroid/text/style/TextAppearanceSpan;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomTextAppearanceSpan extends TextAppearanceSpan {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f46380a;

    /* renamed from: b  reason: collision with root package name */
    private float f46381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextAppearanceSpan(Context context, int i11) {
        super(context, i11);
        Object a11;
        u.j(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{16843692, 16843958});
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f46381b = obtainStyledAttributes.getFloat(1, 0.0f);
        try {
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            a11 = g.e(obtainStyledAttributes.getResourceId(0, 0), context);
            this.f46380a = (Typeface) (a11 instanceof k.a ? null : a11);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        u.j(paint, "paint");
        super.updateDrawState(paint);
        paint.setTypeface(this.f46380a);
        paint.setLetterSpacing(this.f46381b);
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        u.j(paint, "paint");
        super.updateMeasureState(paint);
        paint.setTypeface(this.f46380a);
        paint.setLetterSpacing(this.f46381b);
    }
}
