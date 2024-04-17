package com.withings.graph.popup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.withings.graph.GraphView;
import java.util.List;
import rs.e;
import ys.g;
/* loaded from: classes3.dex */
public class DefaultPopupView extends View implements g {

    /* renamed from: a  reason: collision with root package name */
    private e f39975a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f39976b;

    /* renamed from: c  reason: collision with root package name */
    private Path f39977c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f39978d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f39979e;

    /* renamed from: f  reason: collision with root package name */
    private int f39980f;

    /* renamed from: g  reason: collision with root package name */
    private int f39981g;

    /* renamed from: h  reason: collision with root package name */
    private int f39982h;

    /* renamed from: i  reason: collision with root package name */
    private int f39983i;

    /* renamed from: j  reason: collision with root package name */
    private int f39984j;

    /* renamed from: k  reason: collision with root package name */
    private int f39985k;

    /* renamed from: l  reason: collision with root package name */
    private int f39986l;

    /* renamed from: m  reason: collision with root package name */
    private int f39987m;

    /* renamed from: n  reason: collision with root package name */
    private int f39988n;

    /* renamed from: o  reason: collision with root package name */
    private int f39989o;

    /* renamed from: p  reason: collision with root package name */
    private TextPaint f39990p;

    /* renamed from: q  reason: collision with root package name */
    private int f39991q;

    /* renamed from: r  reason: collision with root package name */
    private int f39992r;

    /* renamed from: s  reason: collision with root package name */
    private int f39993s;

    /* renamed from: t  reason: collision with root package name */
    private int f39994t;

    /* renamed from: u  reason: collision with root package name */
    private String f39995u;

    /* loaded from: classes3.dex */
    final class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                DefaultPopupView defaultPopupView = DefaultPopupView.this;
                if (defaultPopupView.f39978d.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    defaultPopupView.f39975a;
                    throw null;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    public DefaultPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    private void f() {
        setVisibility(8);
        this.f39976b = new PointF();
        this.f39980f = -16777216;
        this.f39991q = -1;
        this.f39992r = ah.g.k(16, getContext());
        this.f39988n = ah.g.k(12, getContext());
        this.f39989o = ah.g.k(6, getContext());
        this.f39981g = ah.g.k(32, getContext());
        this.f39982h = ah.g.k(12, getContext());
        this.f39983i = ah.g.k(8, getContext());
        this.f39984j = ah.g.k(12, getContext());
        this.f39985k = ah.g.k(8, getContext());
        this.f39986l = ah.g.k(40, getContext());
        this.f39995u = "0";
        g();
        h();
    }

    private void g() {
        this.f39978d = new Rect();
        this.f39977c = new Path();
        Paint paint = new Paint();
        this.f39979e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f39979e.setColor(this.f39980f);
        this.f39979e.setAntiAlias(true);
        new Rect(0, 0, 0, 0);
    }

    private void h() {
        TextPaint textPaint = new TextPaint();
        this.f39990p = textPaint;
        textPaint.setTextSize(this.f39992r);
        this.f39990p.setAntiAlias(true);
        this.f39990p.setColor(this.f39991q);
        this.f39990p.setFakeBoldText(true);
        this.f39993s = (int) Math.abs(this.f39990p.getFontMetrics().top);
    }

    @Override // ys.g
    public final void a() {
        Log.d("PopupView2", "hide: ");
        setVisibility(8);
    }

    @Override // ys.g
    public final void b(GraphView graphView, List<? extends e> list, PointF pointF) {
        if (!list.isEmpty() && list.get(0) != null) {
            e eVar = list.get(0);
            this.f39975a = eVar;
            this.f39976b.set(eVar.f95616a, eVar.f95617b);
            PointF pointF2 = this.f39976b;
            graphView.getClass();
            pointF2.set(graphView.q(pointF2.x), graphView.r(pointF2.y));
            String valueOf = String.valueOf(this.f39975a.f95617b);
            this.f39995u = valueOf;
            Rect rect = this.f39978d;
            PointF pointF3 = this.f39976b;
            int i11 = (int) pointF3.x;
            int measureText = ((int) this.f39990p.measureText(valueOf)) / 2;
            int i12 = this.f39994t / 2;
            int i13 = (int) pointF3.y;
            int i14 = this.f39993s;
            int i15 = this.f39986l;
            int i16 = this.f39989o;
            rect.set((i11 - (this.f39982h + measureText)) - i12, ((i13 - (this.f39983i + i14)) - i15) + i16, measureText + this.f39984j + i11 + i12, (((i14 + this.f39985k) + i13) - i15) + i16);
            if (this.f39981g > (this.f39978d.height() - this.f39989o) / 2) {
                this.f39981g = (this.f39978d.height() - this.f39989o) / 2;
            }
            int width = this.f39978d.width() / 2;
            this.f39987m = width;
            int i17 = this.f39981g;
            if (width < i17) {
                this.f39987m = i17 + width;
            }
            if (this.f39987m > this.f39978d.width() - this.f39981g) {
                this.f39987m = (this.f39978d.width() - this.f39981g) - this.f39987m;
            }
            setVisibility(0);
            invalidate();
        }
    }

    public Bitmap getIcon() {
        return null;
    }

    public int getIconPadding() {
        return this.f39994t;
    }

    public b getOnPopupClickListener() {
        return null;
    }

    public int getPopupColor() {
        return this.f39980f;
    }

    public int getPopupPaddingBottom() {
        return this.f39985k;
    }

    public int getPopupPaddingLeft() {
        return this.f39982h;
    }

    public int getPopupPaddingRight() {
        return this.f39984j;
    }

    public int getPopupPaddingTop() {
        return this.f39983i;
    }

    public int getPopupRadius() {
        return this.f39981g;
    }

    public c getPopupTextProvider() {
        return null;
    }

    public int getPopupVerticalOffset() {
        return this.f39986l;
    }

    public int getTextColor() {
        return this.f39991q;
    }

    public int getTextSize() {
        return this.f39992r;
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Log.d("PopupView2", "onDraw: ");
        super.onDraw(canvas);
        Rect rect = this.f39978d;
        this.f39977c.rewind();
        int height = rect.height() - this.f39989o;
        int i11 = this.f39981g;
        int i12 = i11 / 2;
        this.f39977c.moveTo(i11, 0.0f);
        this.f39977c.lineTo(rect.width() - this.f39981g, 0.0f);
        float f11 = i12;
        this.f39977c.cubicTo(rect.width() - i12, 0.0f, rect.width(), f11, rect.width(), this.f39981g);
        this.f39977c.lineTo(rect.width(), height - this.f39981g);
        float f12 = height - i12;
        float f13 = height;
        this.f39977c.cubicTo(rect.width(), f12, rect.width() - i12, f13, rect.width() - this.f39981g, f13);
        this.f39977c.lineTo((this.f39988n / 2) + this.f39987m, f13);
        this.f39977c.lineTo(this.f39987m, rect.height());
        this.f39977c.lineTo(this.f39987m - (this.f39988n / 2), f13);
        this.f39977c.lineTo(this.f39981g, f13);
        this.f39977c.cubicTo(f11, f13, 0.0f, f12, 0.0f, height - this.f39981g);
        this.f39977c.lineTo(0.0f, this.f39981g);
        this.f39977c.cubicTo(0.0f, f11, f11, 0.0f, this.f39981g, 0.0f);
        this.f39977c.offset(rect.left, rect.top);
        canvas.drawPath(this.f39977c, this.f39979e);
        String str = this.f39995u;
        Rect rect2 = this.f39978d;
        canvas.drawText(str, rect2.left + this.f39982h, rect2.top + this.f39983i + (this.f39990p.descent() - this.f39990p.ascent()), this.f39990p);
    }

    public void setIconPadding(int i11) {
        this.f39994t = i11;
    }

    public void setOnPopupClickListener(b bVar) {
        setOnTouchListener(new a());
    }

    public void setPopupColor(int i11) {
        this.f39980f = i11;
        g();
    }

    public void setPopupPadding(int i11) {
        this.f39982h = i11;
        this.f39983i = i11;
        this.f39984j = i11;
        this.f39985k = i11;
    }

    public void setPopupPaddingBottom(int i11) {
        this.f39985k = i11;
    }

    public void setPopupPaddingLeft(int i11) {
        this.f39982h = i11;
    }

    public void setPopupPaddingRight(int i11) {
        this.f39984j = i11;
    }

    public void setPopupPaddingTop(int i11) {
        this.f39983i = i11;
    }

    public void setPopupRadius(int i11) {
        this.f39981g = i11;
    }

    public void setPopupVerticalOffset(int i11) {
        this.f39986l = i11;
    }

    public void setTextColor(int i11) {
        this.f39991q = i11;
        h();
    }

    public void setTextSize(int i11) {
        this.f39992r = i11;
        h();
    }

    public DefaultPopupView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        f();
    }

    public void setPopupTextProvider(c cVar) {
    }
}
