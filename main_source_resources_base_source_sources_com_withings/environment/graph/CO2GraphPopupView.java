package com.withings.environment.graph;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
/* loaded from: classes3.dex */
public class CO2GraphPopupView extends TouchGraphPopupView {

    /* renamed from: o  reason: collision with root package name */
    private String f38876o;

    /* renamed from: p  reason: collision with root package name */
    private String f38877p;

    /* renamed from: q  reason: collision with root package name */
    private Rect f38878q;

    /* renamed from: r  reason: collision with root package name */
    protected Paint f38879r;

    public CO2GraphPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.withings.environment.graph.TouchGraphPopupView
    public final void a(Canvas canvas) {
        int i11 = (int) (this.f38943f.getBounds().left + this.f38950m);
        float height = (int) (this.f38943f.getBounds().top + this.f38951n + this.f38942e.height());
        canvas.drawText(this.f38876o, i11, height, this.f38879r);
        canvas.drawText(this.f38877p, this.f38878q.width() + i11, height, this.f38940c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.environment.graph.TouchGraphPopupView
    public final void b() {
        super.b();
        Paint paint = new Paint();
        this.f38879r = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f38879r.setColor(-1);
        this.f38879r.setTextSize(g.k(13, getContext()));
        this.f38879r.setAntiAlias(true);
        this.f38879r.setFakeBoldText(true);
    }

    @Override // com.withings.environment.graph.TouchGraphPopupView
    public final void c() {
        int indexOf = this.f38941d.indexOf(" ");
        this.f38876o = this.f38941d.substring(0, indexOf);
        this.f38877p = " " + this.f38941d.substring(indexOf);
        this.f38878q = new Rect();
        Rect rect = new Rect();
        this.f38879r.getTextBounds(this.f38876o.toCharArray(), 0, this.f38876o.length(), this.f38878q);
        this.f38940c.getTextBounds(this.f38877p.toCharArray(), 0, this.f38877p.length(), rect);
        Rect rect2 = this.f38878q;
        int i11 = rect2.left;
        this.f38942e = new Rect(i11, rect2.top, rect.width() + rect2.width() + i11, this.f38878q.bottom);
    }
}
