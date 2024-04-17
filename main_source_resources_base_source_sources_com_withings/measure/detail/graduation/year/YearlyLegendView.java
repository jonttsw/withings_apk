package com.withings.measure.detail.graduation.year;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import wq.a;
/* compiled from: YearlyLegendView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/measure/detail/graduation/year/YearlyLegendView;", "Landroid/view/View;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class YearlyLegendView extends View {

    /* renamed from: a  reason: collision with root package name */
    private TextPaint f41695a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f41696b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YearlyLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        Context context;
        u.j(canvas, "canvas");
        super.draw(canvas);
        DateTime withMonthOfYear = DateTime.now().withMonthOfYear(1);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 24.0f;
        for (int i11 = 0; i11 < 12; i11++) {
            String abstractDateTime = withMonthOfYear.toString("MMM");
            u.i(abstractDateTime, "toString(...)");
            String upperCase = abstractDateTime.toUpperCase(Locale.ROOT);
            u.i(upperCase, "toUpperCase(...)");
            String substring = upperCase.substring(0, 1);
            u.i(substring, "substring(...)");
            TextPaint textPaint = this.f41695a;
            textPaint.getTextBounds(substring, 0, 1, this.f41696b);
            float paddingLeft = (((i11 * 2) * width) + (getPaddingLeft() + width)) - (rect.width() / 2);
            float textSize = textPaint.getTextSize();
            u.i(getContext(), "getContext(...)");
            canvas.drawText(substring, paddingLeft, textSize + g.k(4, context), textPaint);
            withMonthOfYear = withMonthOfYear.plusMonths(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearlyLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f41696b = new Rect();
        TextPaint k11 = a.k(C1987R.style.detail1, context, 14);
        this.f41695a = k11;
        k11.setStyle(Paint.Style.FILL);
        k11.setAntiAlias(true);
        k11.setStrokeJoin(Paint.Join.MITER);
        k11.setStrokeCap(Paint.Cap.BUTT);
        k11.setStrokeWidth(3.0f);
        if (isInEditMode()) {
            return;
        }
        Context context2 = getContext();
        u.i(context2, "getContext(...)");
        k11.setTypeface(a.e(context2));
    }
}
