package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
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
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: HorizontalSausageView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/withings/design/view/HorizontalSausageView;", "Landroid/view/View;", "", "Lcom/withings/design/view/a;", "getSausages", "()Ljava/util/List;", "", "sausages", "Lnm0/y;", "setValues", "(Ljava/util/List;)V", "", "getBallCount", "()I", "ballCount", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HorizontalSausageView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f36251a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f36252b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f36253c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f36254d;

    /* renamed from: e  reason: collision with root package name */
    private float f36255e;

    /* renamed from: f  reason: collision with root package name */
    private float f36256f;

    /* renamed from: g  reason: collision with root package name */
    private float f36257g;

    public HorizontalSausageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int getBallCount() {
        ArrayList arrayList = this.f36251a;
        Iterator it = arrayList.iterator();
        float f11 = 0.0f;
        int i11 = 0;
        while (it.hasNext()) {
            float b10 = ((a) it.next()).b();
            float measuredWidth = ((b10 / this.f36257g) * (getMeasuredWidth() - ((arrayList.size() - 1) * this.f36256f))) + f11;
            if (measuredWidth - f11 < getMeasuredHeight()) {
                i11++;
            }
            f11 = this.f36256f + measuredWidth;
        }
        return i11;
    }

    public final List<a> getSausages() {
        return this.f36251a;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f11;
        float f12;
        u.k(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            ArrayList arrayList = this.f36251a;
            b0.j(arrayList, b.f36459a);
            int measuredWidth = getMeasuredWidth();
            Paint paint = this.f36252b;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            float f13 = this.f36255e;
            paint.setStrokeWidth(f13);
            int ballCount = getBallCount();
            int size = arrayList.size() - ballCount;
            float measuredHeight = (getMeasuredHeight() * ballCount) / 2;
            Iterator it = arrayList.iterator();
            float f14 = 0.0f;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                int color = androidx.core.content.a.getColor(getContext(), aVar.a());
                paint.setColor(color);
                float b10 = ((aVar.b() / this.f36257g) * (measuredWidth - ((arrayList.size() - 1) * this.f36256f))) + f14;
                int i11 = ((b10 - f14) > getMeasuredHeight() ? 1 : ((b10 - f14) == getMeasuredHeight() ? 0 : -1));
                Paint paint2 = this.f36254d;
                float f15 = this.f36256f;
                if (i11 <= 0) {
                    Paint paint3 = this.f36253c;
                    paint3.setColor(color);
                    if (aVar.c()) {
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
                    if (aVar.c()) {
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
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec((int) this.f36255e, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
    }

    public final void setValues(List<a> sausages) {
        u.k(sausages, "sausages");
        ArrayList arrayList = this.f36251a;
        arrayList.clear();
        arrayList.addAll(sausages);
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (a aVar : sausages) {
            d11 += aVar.b();
        }
        this.f36257g = (float) d11;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSausageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f36251a = arrayList;
        Paint paint = new Paint();
        this.f36252b = paint;
        Paint paint2 = new Paint();
        this.f36253c = paint2;
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, in.a.f72609k);
        u.f(typedArray, "typedArray");
        float dimensionPixelSize = typedArray.getDimensionPixelSize(1, ah.g.j(context.getResources(), 8));
        this.f36255e = dimensionPixelSize;
        int i12 = 0;
        this.f36256f = typedArray.getDimensionPixelSize(0, ah.g.j(context.getResources(), 2));
        int color = androidx.core.content.a.getColor(context, C1987R.color.themeD1);
        int i13 = ((int) dimensionPixelSize) / 2;
        Canvas canvas = new Canvas();
        Paint paint3 = new Paint(1);
        paint3.setColor(color);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setStrokeWidth(2);
        Bitmap bitmap = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
        float f11 = i13;
        canvas.drawLine(0.0f, 0.0f, f11, f11, paint3);
        float f12 = 1;
        float f13 = -f12;
        float f14 = f11 - f12;
        float f15 = f11 + f12;
        canvas.drawLine(f13, f14, f12, f15, paint3);
        canvas.drawLine(f14, f13, f15, f12, paint3);
        u.f(bitmap, "bitmap");
        Paint paint4 = new Paint(2);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint4.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.f36254d = paint4;
        y yVar = y.f85009a;
        typedArray.recycle();
        if (isInEditMode()) {
            ArrayList c02 = l.c0(new float[]{60.0f, 20.0f, 15.0f, 5.0f});
            ArrayList d02 = l.d0(new int[]{C1987R.color.good, C1987R.color.f111260ok, C1987R.color.bad, C1987R.color.veryBad});
            if (d02.size() == arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c02.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i12 + 1;
                    if (i12 >= 0) {
                        arrayList2.add(new a(((Number) next).floatValue(), ((Number) d02.get(i12)).intValue()));
                        i12 = i14;
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
