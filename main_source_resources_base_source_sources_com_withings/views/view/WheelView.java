package com.withings.views.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
/* loaded from: classes4.dex */
public class WheelView extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f46735a;

    /* renamed from: b  reason: collision with root package name */
    private double f46736b;

    /* renamed from: c  reason: collision with root package name */
    private a f46737c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f46738d;

    /* renamed from: e  reason: collision with root package name */
    private int f46739e;

    /* renamed from: f  reason: collision with root package name */
    private int f46740f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f46741g;

    /* loaded from: classes4.dex */
    public interface a {
        void f0(double d11);

        void u();
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46735a = -2.0f;
    }

    private double a(double d11, double d12) {
        boolean z5;
        double d13 = d11 - (this.f46739e / 2.0d);
        int i11 = this.f46740f;
        double d14 = (i11 - d12) - (i11 / 2.0d);
        double d15 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d13 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d14 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                z5 = true;
            } else {
                z5 = true;
            }
        } else if (d14 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (!z5) {
            if (!z5 && !z5) {
                if (z5) {
                    d15 = 6.283185307179586d + Math.asin(d14 / Math.hypot(d13, d14));
                }
            } else {
                d15 = 3.141592653589793d - Math.asin(d14 / Math.hypot(d13, d14));
            }
        } else {
            d15 = Math.asin(d14 / Math.hypot(d13, d14));
        }
        return (d15 * 180.0d) / 3.141592653589793d;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (this.f46738d == null) {
            boolean z5 = this.f46741g;
            int i12 = this.f46739e;
            if (z5) {
                i12 = (int) (i12 / 1.5f);
            }
            if (z5) {
                i11 = (int) (this.f46740f / 1.5f);
            } else {
                i11 = this.f46740f;
            }
            this.f46738d = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), 2131231189), i12, i11, false);
        }
        canvas.rotate(this.f46735a, getWidth() / 2, getHeight() / 2);
        canvas.drawBitmap(this.f46738d, (getWidth() - this.f46738d.getWidth()) / 2, (getHeight() - this.f46738d.getHeight()) / 2, (Paint) null);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size);
        this.f46739e = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.f46740f = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f46738d = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action == 2) {
                double a11 = a(motionEvent.getX(), motionEvent.getY());
                double d11 = this.f46736b;
                if (d11 - a11 > 180.0d) {
                    a11 += 360.0d;
                } else if (a11 - d11 > 180.0d) {
                    a11 -= 360.0d;
                }
                double d12 = a11 - d11;
                this.f46735a -= (float) d12;
                invalidate();
                a aVar = this.f46737c;
                if (aVar != null) {
                    aVar.f0(d12);
                }
                this.f46736b = a11;
            }
        } else {
            a aVar2 = this.f46737c;
            if (aVar2 != null) {
                aVar2.u();
            }
            this.f46736b = a(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public void setIsWheelSizeSmall(boolean z5) {
        this.f46741g = z5;
    }

    public void setWheelCallback(a aVar) {
        this.f46737c = aVar;
    }
}
