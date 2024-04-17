package com.withings.environment.graph;

import ah.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTime;
import org.joda.time.Period;
/* loaded from: classes3.dex */
public class TimeLineView extends View {

    /* renamed from: a  reason: collision with root package name */
    private DateTime f38923a;

    /* renamed from: b  reason: collision with root package name */
    private DateTime f38924b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38925c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f38926d;

    /* renamed from: e  reason: collision with root package name */
    private final Path f38927e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f38928f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f38929g;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f38930h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<a> f38931i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f38932j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f38933k;

    public TimeLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38925c = false;
        this.f38927e = new Path();
        this.f38929g = new Path();
        this.f38931i = new ArrayList<>();
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f38926d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f38926d.setColor(getResources().getColor(C1987R.color.background3));
        Paint paint2 = this.f38926d;
        Paint.Join join = Paint.Join.MITER;
        paint2.setStrokeJoin(join);
        Paint paint3 = this.f38926d;
        Paint.Cap cap = Paint.Cap.BUTT;
        paint3.setStrokeCap(cap);
        this.f38926d.setAntiAlias(true);
        this.f38926d.setStrokeWidth(4.0f);
        Paint paint4 = new Paint();
        this.f38928f = paint4;
        paint4.setStyle(style);
        this.f38928f.setColor(-2171945);
        this.f38928f.setStrokeJoin(join);
        this.f38928f.setStrokeCap(cap);
        this.f38928f.setAntiAlias(true);
        this.f38928f.setStrokeWidth(4.0f);
        TextPaint k11 = wq.a.k(C1987R.style.detail1, getContext(), 13);
        this.f38930h = k11;
        k11.setStyle(Paint.Style.FILL);
        this.f38930h.setStrokeJoin(join);
        this.f38930h.setStrokeCap(cap);
        this.f38930h.setAntiAlias(true);
        this.f38930h.setStrokeWidth(3.0f);
        this.f38933k = ((BitmapDrawable) androidx.core.content.a.getDrawable(getContext(), 2131231461)).getBitmap();
        this.f38932j = ((BitmapDrawable) androidx.core.content.a.getDrawable(getContext(), 2131231460)).getBitmap();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        String str;
        String abstractDateTime;
        a aVar;
        if (isInEditMode()) {
            this.f38923a = DateTime.now().withTimeAtStartOfDay();
            this.f38924b = DateTime.now().withTimeAtStartOfDay().plusDays(1);
        }
        Fail.h(this.f38923a, "Start must be specified");
        Fail.h(this.f38924b, "End must be specified");
        if (this.f38923a != null && this.f38924b != null) {
            boolean z5 = this.f38925c;
            ArrayList<a> arrayList = this.f38931i;
            Path path = this.f38929g;
            Path path2 = this.f38927e;
            if (z5 || path2 == null) {
                path2.reset();
                path.reset();
                arrayList.clear();
                Period withHours = new Period().withHours(1);
                for (DateTime dateTime = this.f38923a; dateTime.isBefore(this.f38924b); dateTime = dateTime.plus(withHours)) {
                    float millis = (int) ((dateTime.getMillis() - this.f38923a.getMillis()) * (getWidth() / (this.f38924b.getMillis() - this.f38923a.getMillis())));
                    float height = getHeight() - g.k(20, getContext());
                    if (dateTime.getHourOfDay() % 4 != 0 && dateTime.getHourOfDay() % 4 != 4) {
                        path.moveTo(millis, getHeight() - g.k(2, getContext()));
                        path.lineTo(millis, getHeight() - g.k(6, getContext()));
                    } else {
                        if (dateTime.getHourOfDay() == 0) {
                            aVar = new a(this.f38932j, millis - (this.f38932j.getWidth() / 2), height - (this.f38932j.getHeight() / 2));
                        } else if (dateTime.getHourOfDay() == 12) {
                            aVar = new a(this.f38933k, millis - (this.f38933k.getWidth() / 2), height - (this.f38933k.getHeight() / 2));
                        } else {
                            if (DateFormat.is24HourFormat(getContext())) {
                                str = "HH:mm";
                            } else {
                                str = "hh:mm a";
                            }
                            aVar = new a(dateTime.toString(str), millis - g.k(abstractDateTime.length() * 3, getContext()), height + g.k(5, getContext()));
                        }
                        path2.moveTo(millis, getHeight() - g.k(1, getContext()));
                        path2.lineTo(millis, getHeight() - g.k(8, getContext()));
                        arrayList.add(aVar);
                    }
                }
            }
            canvas.drawPath(path2, this.f38926d);
            canvas.drawPath(path, this.f38928f);
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a() != null) {
                    canvas.drawBitmap(next.a(), next.c(), next.d(), this.f38930h);
                }
                if (next.b() != null) {
                    canvas.drawText(next.b(), next.c(), next.d(), this.f38930h);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        super.onLayout(z5, i11, i12, i13, i14);
        this.f38925c = true;
        invalidate();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f38925c = true;
        invalidate();
    }

    public void setEnd(DateTime dateTime) {
        this.f38924b = dateTime;
    }

    public void setStart(DateTime dateTime) {
        this.f38923a = dateTime;
    }

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f38934a;

        /* renamed from: b  reason: collision with root package name */
        private final float f38935b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38936c;

        /* renamed from: d  reason: collision with root package name */
        private final Bitmap f38937d;

        public a(String str, float f11, float f12) {
            this.f38934a = f11;
            this.f38935b = f12;
            this.f38936c = str;
            this.f38937d = null;
        }

        public final Bitmap a() {
            return this.f38937d;
        }

        public final String b() {
            return this.f38936c;
        }

        public final float c() {
            return this.f38934a;
        }

        public final float d() {
            return this.f38935b;
        }

        public a(Bitmap bitmap, float f11, float f12) {
            this.f38934a = f11;
            this.f38935b = f12;
            this.f38937d = bitmap;
            this.f38936c = null;
        }
    }

    public TimeLineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f38925c = false;
        this.f38927e = new Path();
        this.f38929g = new Path();
        this.f38931i = new ArrayList<>();
        a();
    }
}
