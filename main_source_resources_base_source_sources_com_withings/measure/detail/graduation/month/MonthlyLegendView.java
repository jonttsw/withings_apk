package com.withings.measure.detail.graduation.month;

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
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import wq.a;
/* compiled from: MonthlyLegendView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/measure/detail/graduation/month/MonthlyLegendView;", "Landroid/view/View;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MonthlyLegendView extends View {

    /* renamed from: a  reason: collision with root package name */
    private TextPaint f41689a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f41690b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MonthlyLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        Context context;
        u.j(canvas, "canvas");
        super.draw(canvas);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 62.0f;
        int i11 = 1;
        for (int i12 = 0; i12 < 31; i12++) {
            if (i11 < 28 && i11 % 5 == 0) {
                TextPaint textPaint = this.f41689a;
                textPaint.getTextBounds(String.valueOf(i11), 0, 1, this.f41690b);
                String valueOf = String.valueOf(i11);
                float paddingLeft = (((i12 * 2) * width) + (getPaddingLeft() + width)) - (rect.width() / 2);
                float textSize = textPaint.getTextSize();
                u.i(getContext(), "getContext(...)");
                canvas.drawText(valueOf, paddingLeft, textSize + g.k(4, context), textPaint);
            }
            i11++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthlyLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f41690b = new Rect();
        TextPaint k11 = a.k(C1987R.style.detail1, context, 14);
        this.f41689a = k11;
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
