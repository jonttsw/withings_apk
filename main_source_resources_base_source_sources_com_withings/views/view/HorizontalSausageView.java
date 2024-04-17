package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: HorizontalSausageView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/withings/views/view/HorizontalSausageView;", "Landroid/view/View;", "", "Lcom/withings/views/view/c;", "getSausages", "()Ljava/util/List;", "", "sausages", "Lnm0/y;", "setValues", "(Ljava/util/List;)V", "", "getBallCount", "()I", "ballCount", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HorizontalSausageView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f46559a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f46560b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f46561c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f46562d;

    /* renamed from: e  reason: collision with root package name */
    private float f46563e;

    /* renamed from: f  reason: collision with root package name */
    private float f46564f;

    /* renamed from: g  reason: collision with root package name */
    private float f46565g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalSausageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    private final int getBallCount() {
        ArrayList arrayList = this.f46559a;
        Iterator it = arrayList.iterator();
        float f11 = 0.0f;
        int i11 = 0;
        while (it.hasNext()) {
            float b10 = ((c) it.next()).b();
            float measuredWidth = ((b10 / this.f46565g) * (getMeasuredWidth() - ((arrayList.size() - 1) * this.f46564f))) + f11;
            if (measuredWidth - f11 < getMeasuredHeight()) {
                i11++;
            }
            f11 = this.f46564f + measuredWidth;
        }
        return i11;
    }

    public final List<c> getSausages() {
        return this.f46559a;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f11;
        float f12;
        u.j(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            ArrayList arrayList = this.f46559a;
            b0.j(arrayList, d.f46754a);
            int measuredWidth = getMeasuredWidth();
            Paint paint = this.f46560b;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            float f13 = this.f46563e;
            paint.setStrokeWidth(f13);
            int ballCount = getBallCount();
            int size = arrayList.size() - ballCount;
            float measuredHeight = (getMeasuredHeight() * ballCount) / 2;
            Iterator it = arrayList.iterator();
            float f14 = 0.0f;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                int color = androidx.core.content.a.getColor(getContext(), cVar.a());
                paint.setColor(color);
                float b10 = ((cVar.b() / this.f46565g) * (measuredWidth - ((arrayList.size() - 1) * this.f46564f))) + f14;
                int i11 = ((b10 - f14) > getMeasuredHeight() ? 1 : ((b10 - f14) == getMeasuredHeight() ? 0 : -1));
                Paint paint2 = this.f46562d;
                float f15 = this.f46564f;
                if (i11 <= 0) {
                    Paint paint3 = this.f46561c;
                    paint3.setColor(color);
                    if (cVar.c()) {
                        if (paint2 == null) {
                            u.s("hatchedPaint");
                            throw null;
                        }
                    } else {
                        paint2 = paint3;
                    }
                    float f16 = f13 / 2;
                    canvas.drawCircle(f14 + f16, getMeasuredHeight() / 2, f16, paint2);
                    f14 = f16 + b10 + f15;
                    f12 = measuredHeight;
                } else {
                    float f17 = b10 - (measuredHeight / size);
                    if (cVar.c()) {
                        float f18 = f13 / 2;
                        float f19 = f18 + f14;
                        float f21 = f17 - f18;
                        float measuredHeight2 = getMeasuredHeight();
                        float measuredHeight3 = getMeasuredHeight();
                        float measuredHeight4 = getMeasuredHeight();
                        if (paint2 != null) {
                            f11 = f15;
                            f12 = measuredHeight;
                            canvas.drawRoundRect(f19, 0.0f, f21, measuredHeight2, measuredHeight3, measuredHeight4, paint2);
                        } else {
                            u.s("hatchedPaint");
                            throw null;
                        }
                    } else {
                        f11 = f15;
                        f12 = measuredHeight;
                        float f22 = f13 / 2;
                        canvas.drawLine(f22 + f14, getMeasuredHeight() / 2, f17 - f22, getMeasuredHeight() / 2, paint);
                    }
                    f14 = f17 + f11;
                }
                measuredHeight = f12;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec((int) this.f46563e, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
    }

    public final void setValues(List<c> sausages) {
        u.j(sausages, "sausages");
        ArrayList arrayList = this.f46559a;
        arrayList.clear();
        arrayList.addAll(sausages);
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (c cVar : sausages) {
            d11 += cVar.b();
        }
        this.f46565g = (float) d11;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSausageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f46559a = arrayList;
        Paint paint = new Paint();
        this.f46560b = paint;
        Paint paint2 = new Paint();
        this.f46561c = paint2;
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22415k);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, ah.g.k(8, context));
        this.f46563e = dimensionPixelSize;
        this.f46564f = obtainStyledAttributes.getDimensionPixelSize(0, ah.g.k(2, context));
        int i12 = ((int) dimensionPixelSize) / 2;
        this.f46562d = y70.b.a(i12, i12, androidx.core.content.a.getColor(context, C1987R.color.themeD1));
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            ArrayList c02 = kotlin.collections.l.c0(new float[]{60.0f, 20.0f, 15.0f, 5.0f});
            ArrayList d02 = kotlin.collections.l.d0(new int[]{C1987R.color.good, C1987R.color.f111260ok, C1987R.color.bad, C1987R.color.veryBad});
            if (d02.size() == arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c02.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        arrayList2.add(new c(((Number) next).floatValue(), ((Number) d02.get(i13)).intValue(), false));
                        i13 = i14;
                    } else {
                        x.K0();
                        throw null;
                    }
                }
                setValues(arrayList2);
                return;
            }
            throw new IllegalArgumentException("colors.size() != sausages.size(), noob".toString());
        }
    }
}
