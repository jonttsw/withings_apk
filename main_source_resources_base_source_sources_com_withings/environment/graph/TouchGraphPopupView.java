package com.withings.environment.graph;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public abstract class TouchGraphPopupView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f38938a;

    /* renamed from: b  reason: collision with root package name */
    protected int f38939b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f38940c;

    /* renamed from: d  reason: collision with root package name */
    protected String f38941d;

    /* renamed from: e  reason: collision with root package name */
    protected Rect f38942e;

    /* renamed from: f  reason: collision with root package name */
    protected Drawable f38943f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f38944g;

    /* renamed from: h  reason: collision with root package name */
    private float f38945h;

    /* renamed from: i  reason: collision with root package name */
    private float f38946i;

    /* renamed from: j  reason: collision with root package name */
    protected float f38947j;

    /* renamed from: k  reason: collision with root package name */
    private float f38948k;

    /* renamed from: l  reason: collision with root package name */
    protected float f38949l;

    /* renamed from: m  reason: collision with root package name */
    protected float f38950m;

    /* renamed from: n  reason: collision with root package name */
    protected float f38951n;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public TouchGraphPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38939b = 100;
        this.f38942e = new Rect();
        b();
    }

    public abstract void a(Canvas canvas);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        Paint paint = new Paint();
        this.f38938a = paint;
        paint.setColor(Color.parseColor("#B1DCFE"));
        Paint paint2 = new Paint();
        this.f38940c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f38940c.setColor(-1);
        this.f38940c.setAntiAlias(true);
        if (isInEditMode()) {
            this.f38938a.setStrokeWidth(2.0f);
            this.f38940c.setTextSize(26.0f);
        } else {
            this.f38938a.setStrokeWidth(g.k(1, getContext()));
            this.f38940c.setTextSize(g.k(13, getContext()));
            this.f38946i = g.k(8, getContext());
            this.f38948k = g.k(10, getContext());
            this.f38945h = g.k(5, getContext());
            this.f38949l = g.k(2, getContext());
            this.f38950m = g.k(7, getContext());
            this.f38951n = g.k(7, getContext());
            this.f38947j = g.k(3, getContext());
        }
        this.f38943f = androidx.core.content.a.getDrawable(getContext(), C1987R.drawable.graph_popup_bg);
        this.f38944g = androidx.core.content.a.getDrawable(getContext(), 2131231456);
    }

    public abstract void c();

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f38941d)) {
            return;
        }
        float f11 = this.f38939b;
        canvas.drawLine(f11, 0.0f, f11, getHeight(), this.f38938a);
        c();
        int width = (int) (((this.f38939b - (this.f38942e.width() / 2)) - this.f38950m) - this.f38947j);
        int width2 = (int) (((this.f38950m + this.f38947j) * 2.0f) + this.f38942e.width() + width);
        int i11 = (int) (0.0f - this.f38949l);
        int height = (int) ((this.f38951n * 2.0f) + this.f38942e.height() + i11 + this.f38946i);
        float f12 = this.f38947j;
        if (width <= (-f12)) {
            width = -((int) f12);
            width2 = (int) (((this.f38950m + this.f38947j) * 2.0f) + this.f38942e.width() + width);
        }
        if (width2 >= getWidth()) {
            width2 = (int) (getWidth() + this.f38947j);
            width = (int) ((width2 - this.f38942e.width()) - ((this.f38950m + this.f38947j) * 2.0f));
        }
        this.f38943f.setBounds(width, i11, width2, height);
        this.f38943f.draw(canvas);
        int i12 = (int) (this.f38943f.getBounds().bottom - this.f38946i);
        int i13 = (int) (i12 + this.f38945h);
        float f13 = this.f38948k;
        int i14 = (int) (this.f38939b - (f13 / 2.0f));
        float f14 = i14;
        int i15 = (int) (f14 + f13);
        float f15 = this.f38947j;
        if (f14 <= (-f15)) {
            i14 = -((int) f15);
            i15 = (int) (i14 + f13);
        }
        if (i15 >= getWidth()) {
            float f16 = this.f38939b;
            float f17 = this.f38948k;
            i15 = (int) ((f17 / 3.0f) + f16);
            i14 = (int) (f16 - (f17 / 2.0f));
        }
        this.f38944g.setBounds(i14, i12, i15, i13);
        this.f38944g.draw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setListener(a aVar) {
    }
}
