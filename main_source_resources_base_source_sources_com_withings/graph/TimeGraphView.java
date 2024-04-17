package com.withings.graph;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.OverScroller;
import androidx.compose.material.n3;
import androidx.core.view.m;
import androidx.core.view.u0;
import com.withings.graph.GraphView;
import com.withings.graph.axis.HorizontalAxis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class TimeGraphView extends GraphView {
    private int B0;
    public DateTime C0;
    public DateTime D0;
    private ArrayList E0;
    private bt.a F0;
    private RectF G0;
    private RectF H0;
    private int I0;
    private float J0;
    private boolean K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private List<String> O0;
    private boolean P0;
    private Handler Q0;
    private Map<String, List<Float>> R0;
    private Runnable S0;

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TimeGraphView timeGraphView = TimeGraphView.this;
            androidx.core.util.e dataToAdjustVerticalBounds = timeGraphView.getDataToAdjustVerticalBounds();
            timeGraphView.L0 = TimeGraphView.Z(timeGraphView, dataToAdjustVerticalBounds);
            if (timeGraphView.L0) {
                timeGraphView.L0 = false;
                timeGraphView.c0(dataToAdjustVerticalBounds);
            }
            timeGraphView.Q0.removeCallbacks(timeGraphView.S0);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(TimeGraphView timeGraphView);

        void b(TimeGraphView timeGraphView, int i11, int i12, float f11);

        void c(TimeGraphView timeGraphView, int i11);
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    /* loaded from: classes3.dex */
    public class d extends GraphView.b {
        public d() {
            super();
        }

        @Override // com.withings.graph.GraphView.b, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            TimeGraphView timeGraphView = TimeGraphView.this;
            timeGraphView.f39549z0 = true;
            if (!timeGraphView.f39534s) {
                return super.onDoubleTap(motionEvent);
            }
            timeGraphView.t();
            timeGraphView.S.b();
            if (timeGraphView.u(motionEvent.getX(), motionEvent.getY(), timeGraphView.T)) {
                TimeGraphView.V(timeGraphView, timeGraphView.T, true);
            }
            u0.T(timeGraphView);
            return true;
        }

        @Override // com.withings.graph.GraphView.b, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            long eventTime = motionEvent2.getEventTime();
            TimeGraphView timeGraphView = TimeGraphView.this;
            if (eventTime < timeGraphView.S.e() + timeGraphView.S.c()) {
                return false;
            }
            if (!timeGraphView.f39530q) {
                f11 = 0.0f;
            }
            if (!timeGraphView.f39532r) {
                f12 = 0.0f;
            }
            if (timeGraphView.B0 == 2) {
                timeGraphView.l0(motionEvent2);
            } else {
                timeGraphView.n((int) (-f11), (int) (-f12));
            }
            timeGraphView.f39549z0 = true;
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private PointF f39559a = new PointF();

        /* renamed from: b  reason: collision with root package name */
        private float f39560b;

        /* renamed from: c  reason: collision with root package name */
        private float f39561c;

        /* renamed from: d  reason: collision with root package name */
        private float f39562d;

        /* renamed from: e  reason: collision with root package name */
        private float f39563e;

        public e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            this.f39562d = scaleGestureDetector.getFocusX();
            this.f39563e = scaleGestureDetector.getFocusY();
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            TimeGraphView timeGraphView = TimeGraphView.this;
            float width = timeGraphView.f39511c.width() * (this.f39560b / currentSpan);
            float f11 = this.f39562d;
            float f12 = this.f39563e;
            PointF pointF = this.f39559a;
            timeGraphView.u(f11, f12, pointF);
            float f13 = pointF.x;
            float f14 = this.f39562d;
            Rect rect = timeGraphView.f39512d;
            float width2 = f13 - (((f14 - rect.left) * width) / rect.width());
            RectF rectF = timeGraphView.f39511c;
            rectF.set(width2, rectF.top, width + width2, rectF.bottom);
            this.f39560b = currentSpan;
            timeGraphView.l();
            timeGraphView.y();
            if (!timeGraphView.E0.isEmpty()) {
                timeGraphView.h0();
                float width3 = timeGraphView.f39511c.width();
                if (width3 > timeGraphView.J0) {
                    timeGraphView.i0(timeGraphView.F0.k());
                } else if (width3 < timeGraphView.J0) {
                    timeGraphView.i0(timeGraphView.F0.g());
                }
            }
            u0.T(timeGraphView);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            this.f39561c = currentSpan;
            this.f39560b = currentSpan;
            TimeGraphView timeGraphView = TimeGraphView.this;
            timeGraphView.I0 = timeGraphView.F0.d();
            timeGraphView.J0 = timeGraphView.f39511c.width();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            boolean z5;
            super.onScaleEnd(scaleGestureDetector);
            if (this.f39561c == this.f39560b) {
                return;
            }
            float f11 = this.f39562d;
            float f12 = this.f39563e;
            PointF pointF = this.f39559a;
            TimeGraphView timeGraphView = TimeGraphView.this;
            timeGraphView.u(f11, f12, pointF);
            if (this.f39561c < scaleGestureDetector.getCurrentSpan()) {
                z5 = true;
            } else {
                z5 = false;
            }
            TimeGraphView.V(timeGraphView, pointF, z5);
            timeGraphView.x();
        }
    }

    public TimeGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void V(TimeGraphView timeGraphView, PointF pointF, boolean z5) {
        int k11;
        float f11;
        timeGraphView.getClass();
        float f12 = pointF.x;
        bt.a aVar = timeGraphView.F0;
        if (z5) {
            if (aVar.d() == aVar.h()) {
                k11 = aVar.d();
            } else {
                k11 = aVar.g();
            }
        } else if (aVar.d() == aVar.f()) {
            k11 = aVar.d();
        } else {
            k11 = aVar.k();
        }
        RectF rectF = timeGraphView.G0;
        rectF.set(timeGraphView.e0(f12, k11));
        int i11 = timeGraphView.B0;
        if (i11 != 0 && i11 != 1) {
            f11 = (rectF.width() / 2.0f) + rectF.left;
        } else {
            f11 = f12;
        }
        if (!z5) {
            f12 = f11;
        }
        timeGraphView.setCurrentZoomGranularity(k11);
        timeGraphView.f39521l0.set(timeGraphView.f39511c);
        ss.b bVar = timeGraphView.S;
        bVar.b();
        bVar.f(-1.0f);
        timeGraphView.T.set(f12, pointF.y);
        timeGraphView.l();
        u0.T(timeGraphView);
    }

    static boolean Z(TimeGraphView timeGraphView, androidx.core.util.e eVar) {
        timeGraphView.getClass();
        boolean z5 = false;
        if (Float.isNaN(((Float) eVar.f12553a).floatValue())) {
            return false;
        }
        Float f11 = (Float) eVar.f12554b;
        if (Float.isNaN(f11.floatValue())) {
            return false;
        }
        boolean z11 = timeGraphView.f39509a;
        F f12 = eVar.f12553a;
        if (z11) {
            if (!timeGraphView.f39511c.equals(timeGraphView.G0)) {
                Float f13 = (Float) f12;
                float max = Math.max(f13.floatValue(), timeGraphView.f39510b.top);
                float min = Math.min(f11.floatValue(), timeGraphView.f39510b.bottom);
                RectF rectF = timeGraphView.f39511c;
                if (rectF.top == max && rectF.bottom == min && ((f11.floatValue() - f13.floatValue()) * 100.0f) / timeGraphView.f39511c.height() >= 50.0f) {
                    return false;
                }
            }
            return true;
        }
        androidx.core.util.e<Float, Float> k11 = timeGraphView.k(((Float) f12).floatValue(), f11.floatValue());
        if (timeGraphView.f39511c.top == k11.f12553a.floatValue() && timeGraphView.f39511c.bottom == k11.f12554b.floatValue()) {
            z5 = true;
        }
        return !z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(androidx.core.util.e<Float, Float> eVar) {
        if (!Float.isNaN(eVar.f12553a.floatValue())) {
            Float f11 = eVar.f12554b;
            if (!Float.isNaN(f11.floatValue())) {
                androidx.core.util.e<Float, Float> k11 = k(eVar.f12553a.floatValue(), f11.floatValue());
                this.G0.set(this.f39511c.left, k11.f12553a.floatValue(), this.f39511c.right, k11.f12554b.floatValue());
                this.f39521l0.set(this.f39511c);
                ss.b bVar = this.S;
                bVar.b();
                bVar.f(-1.0f);
                l();
                u0.T(this);
            }
        }
    }

    private RectF e0(float f11, int i11) {
        int i12 = this.B0;
        RectF rectF = this.H0;
        if (i12 == 2) {
            nm0.j f02 = f0(f11, i11);
            rectF.set(((Float) f02.c()).floatValue(), this.f39511c.top, ((Float) f02.d()).floatValue(), this.f39511c.bottom);
            return rectF;
        }
        float l5 = this.F0.l(i11) / 2.0f;
        float f12 = f11 + l5;
        float f13 = f11 - l5;
        RectF rectF2 = this.f39510b;
        float f14 = rectF2.right;
        if (f12 > f14) {
            float f15 = f12 - f14;
            f12 -= f15;
            f13 -= f15;
        }
        float f16 = rectF2.left;
        if (f13 < f16) {
            float f17 = f16 - f13;
            f12 += f17;
            f13 += f17;
        }
        RectF rectF3 = this.f39511c;
        rectF.set(f13, rectF3.top, f12, rectF3.bottom);
        return rectF;
    }

    private nm0.j f0(float f11, int i11) {
        nm0.j jVar = new nm0.j(Float.valueOf(this.f39510b.left), Float.valueOf(this.f39510b.right));
        if (i11 != 1) {
            if (i11 != 7) {
                if (i11 != 31) {
                    if (i11 != 92) {
                        if (i11 == 365) {
                            return ms.f.f82357a.a(bt.a.e(f11));
                        }
                        return jVar;
                    }
                    return ms.d.f82355a.a(bt.a.e(f11));
                }
                return ms.b.f82354a.a(bt.a.e(f11));
            }
            return ms.e.f82356a.a(bt.a.e(f11));
        }
        return ms.a.f82353a.a(bt.a.e(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.core.util.e<Float, Float> getDataToAdjustVerticalBounds() {
        boolean z5;
        List<ts.d> graphs = getGraphs();
        ArrayList arrayList = new ArrayList();
        for (ts.d dVar : graphs) {
            ts.d dVar2 = dVar;
            if (this.O0.contains(dVar2.g()) && (!this.P0 || dVar2.h())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                arrayList.add(dVar);
            }
        }
        if (arrayList.size() <= 0 && this.R0.isEmpty()) {
            return new androidx.core.util.e<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        Iterator it = arrayList.iterator();
        float f11 = Float.NEGATIVE_INFINITY;
        float f12 = Float.POSITIVE_INFINITY;
        while (it.hasNext()) {
            ts.d dVar3 = (ts.d) it.next();
            androidx.core.util.e<Float, Float> j5 = dVar3.c().j(this.f39511c);
            boolean equals = Objects.equals(dVar3.g(), "TAG_MAIN_GRAPH");
            Float f13 = j5.f12554b;
            Float f14 = j5.f12553a;
            if (equals) {
                f12 = Math.min(f12, f14.floatValue());
                f11 = Math.max(f11, f13.floatValue());
            }
            if (!Objects.equals(dVar3.g(), "TAG_MAIN_GRAPH")) {
                if (this.N0) {
                    f12 = Math.min(f12, f13.floatValue());
                    f11 = Math.max(f11, f13.floatValue());
                }
                if (this.M0) {
                    f12 = Math.min(f12, f14.floatValue());
                    f11 = Math.max(f11, f14.floatValue());
                }
            }
        }
        if (f12 == Float.POSITIVE_INFINITY || f11 == Float.NEGATIVE_INFINITY) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ts.d dVar4 = (ts.d) it2.next();
                androidx.core.util.e<Float, Float> f15 = dVar4.b().f();
                if (Objects.equals(dVar4.g(), "TAG_MAIN_GRAPH")) {
                    f12 = Math.min(f12, f15.f12553a.floatValue());
                    f11 = Math.max(f11, f15.f12554b.floatValue());
                }
                if (!Objects.equals(dVar4.g(), "TAG_MAIN_GRAPH")) {
                    if (this.N0) {
                        f12 = Math.min(f12, f15.f12554b.floatValue());
                        f11 = Math.max(f11, f15.f12554b.floatValue());
                    }
                    if (this.M0) {
                        float min = Math.min(f12, f15.f12553a.floatValue());
                        f11 = Math.max(f11, f15.f12553a.floatValue());
                        f12 = min;
                    }
                }
            }
        }
        if (!this.R0.isEmpty()) {
            for (List<Float> list : this.R0.values()) {
                for (Float f16 : list) {
                    float floatValue = f16.floatValue();
                    f11 = Math.max(f11, floatValue);
                    f12 = Math.min(f12, floatValue);
                }
            }
        }
        if (f12 == Float.POSITIVE_INFINITY) {
            f12 = this.f39510b.top;
        }
        Float valueOf = Float.valueOf(f12);
        if (f11 == Float.NEGATIVE_INFINITY) {
            f11 = this.f39510b.bottom;
        }
        return new androidx.core.util.e<>(valueOf, Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        bt.a aVar = this.F0;
        float l5 = aVar.l(1);
        Math.max(0.0f, Math.min(1.0f, (this.f39511c.width() - l5) / (aVar.l(365) - l5)));
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i11) {
        float width = this.f39511c.width();
        RectF rectF = this.G0;
        float max = Math.max(width, rectF.width());
        float min = Math.min(this.f39511c.width(), rectF.width());
        float f11 = this.J0;
        float max2 = Math.max(0.0f, Math.min(1.0f, (min - f11) / (max - f11)));
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(this, this.I0, i11, max2);
        }
    }

    public final void a0(b bVar) {
        this.E0.add(bVar);
    }

    public final void b0() {
        c0(getDataToAdjustVerticalBounds());
    }

    @Override // com.withings.graph.GraphView, android.view.View
    public final void computeScroll() {
        boolean z5;
        OverScroller overScroller = this.R;
        boolean z11 = true;
        if (overScroller.computeScrollOffset()) {
            g();
            z5 = true;
        } else {
            z5 = false;
        }
        ss.b bVar = this.S;
        if (bVar.a(this)) {
            RectF rectF = this.f39521l0;
            float f11 = rectF.left;
            float d11 = bVar.d();
            float f12 = rectF.left;
            RectF rectF2 = this.G0;
            float a11 = n3.a(f12, rectF2.left, d11, f11);
            float a12 = n3.a(rectF.right, rectF2.right, bVar.d(), rectF.right);
            this.f39511c.set(a11, n3.a(rectF.top, rectF2.top, bVar.d(), rectF.top), a12, n3.a(rectF.bottom, rectF2.bottom, bVar.d(), rectF.bottom));
            l();
            if (!this.E0.isEmpty()) {
                i0(this.F0.d());
                h0();
            }
        } else {
            z11 = z5;
        }
        if (this.K0) {
            Runnable runnable = this.S0;
            Handler handler = this.Q0;
            if (!z11 && this.f39549z0) {
                if (!this.L0) {
                    handler.postDelayed(runnable, 400L);
                }
            } else {
                this.L0 = false;
                handler.removeCallbacks(runnable);
            }
        }
        if (z11) {
            y();
            if (!overScroller.computeScrollOffset() && !bVar.a(this)) {
                x();
            }
            u0.T(this);
        }
    }

    public final void d0() {
        this.G0.set(this.f39511c);
        this.S.b();
        u0.T(this);
    }

    @Override // com.withings.graph.GraphView
    protected final boolean g() {
        boolean z5;
        Point point = this.W;
        j(point);
        OverScroller overScroller = this.R;
        int currX = overScroller.getCurrX();
        RectF rectF = this.f39511c;
        float f11 = rectF.left;
        RectF rectF2 = this.f39510b;
        if (f11 <= rectF2.left && rectF.right >= rectF2.right) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5 && currX < 0) {
            androidx.core.widget.d dVar = this.f39533r0;
            if (dVar.c() && !this.f39541v0) {
                dVar.d((int) overScroller.getCurrVelocity());
                this.f39541v0 = true;
                RectF rectF3 = this.f39510b;
                float f12 = rectF3.left;
                F((((rectF3.right - f12) * currX) / point.x) + f12, this.f39511c.bottom);
                return true;
            }
        }
        if (z5 && currX > point.x - this.f39512d.width()) {
            androidx.core.widget.d dVar2 = this.f39535s0;
            if (dVar2.c() && !this.f39543w0) {
                dVar2.d((int) overScroller.getCurrVelocity());
                this.f39543w0 = true;
            }
        }
        RectF rectF32 = this.f39510b;
        float f122 = rectF32.left;
        F((((rectF32.right - f122) * currX) / point.x) + f122, this.f39511c.bottom);
        return true;
    }

    public final void g0() {
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            bt.a aVar = this.F0;
            ((b) it.next()).c(this, aVar.d());
            this.I0 = aVar.d();
        }
    }

    public int getCurrentZoomGranularity() {
        return this.F0.d();
    }

    public int getGesturesMode() {
        return this.B0;
    }

    public List<String> getGraphTagsToAdjustVerticalBounds() {
        return this.O0;
    }

    public DateTime getMaxDate() {
        return bt.a.e(this.f39510b.right);
    }

    public DateTime getMinDate() {
        return bt.a.e(this.f39510b.left);
    }

    public c getOnZoomGranularityChangeListener() {
        return null;
    }

    public Map<String, List<Float>> getVisibleThresholds() {
        return this.R0;
    }

    public int[] getZoomGranularities() {
        return this.F0.m();
    }

    public final void j0(DateTime dateTime, int i11) {
        this.R.forceFinished(true);
        setCurrentZoomGranularity(i11);
        this.f39511c.set(e0(bt.a.i(dateTime), i11));
        this.G0.set(this.f39511c);
        g0();
        l();
        u0.T(this);
        Iterator it = this.f39518j.iterator();
        while (it.hasNext()) {
            ((ts.d) it.next()).b().a(this.f39511c, i11);
        }
    }

    public final void k0(DateTime dateTime, float f11, DateTime dateTime2, float f12) {
        E(bt.a.i(dateTime), f11, bt.a.i(dateTime2), f12);
    }

    @Override // com.withings.graph.GraphView
    protected final void l() {
        DateTime dateTime;
        DateTime withHourOfDay;
        DateTime withTimeAtStartOfDay;
        if (!this.f39509a && this.B0 == 2 && (dateTime = this.C0) != null && this.D0 != null) {
            bt.a aVar = this.F0;
            int d11 = aVar.d();
            if (d11 != 1) {
                if (d11 != 7) {
                    if (d11 != 31) {
                        if (d11 != 92) {
                            if (d11 != 365) {
                                withHourOfDay = dateTime.minusMonths(1);
                            } else {
                                withHourOfDay = dateTime.withDayOfYear(1).withTimeAtStartOfDay();
                            }
                        } else {
                            withHourOfDay = dateTime.withMonthOfYear((((dateTime.getMonthOfYear() - 1) / 3) * 3) + 1).withDayOfMonth(1).withTimeAtStartOfDay();
                        }
                    } else {
                        withHourOfDay = dateTime.withDayOfMonth(1).withTimeAtStartOfDay();
                    }
                } else {
                    withHourOfDay = dateTime.withDayOfWeek(1).withTimeAtStartOfDay();
                }
            } else {
                withHourOfDay = dateTime.withHourOfDay(0);
            }
            float i11 = bt.a.i(withHourOfDay);
            DateTime dateTime2 = this.D0;
            int d12 = aVar.d();
            if (d12 != 1) {
                if (d12 != 7) {
                    if (d12 != 31) {
                        if (d12 != 92) {
                            if (d12 != 365) {
                                withTimeAtStartOfDay = dateTime2.plusMonths(1);
                            } else {
                                withTimeAtStartOfDay = dateTime2.withDayOfYear(1).plusYears(1).withTimeAtStartOfDay();
                            }
                        } else {
                            withTimeAtStartOfDay = dateTime2.withMonthOfYear((((dateTime2.getMonthOfYear() - 1) / 3) * 3) + 1).plusMonths(3).withDayOfMonth(1).withTimeAtStartOfDay();
                        }
                    } else {
                        withTimeAtStartOfDay = dateTime2.withDayOfMonth(1).plusMonths(1).withTimeAtStartOfDay();
                    }
                } else {
                    withTimeAtStartOfDay = dateTime2.withDayOfWeek(1).plusWeeks(1).withTimeAtStartOfDay();
                }
            } else {
                withTimeAtStartOfDay = dateTime2.plusDays(1).withTimeAtStartOfDay();
            }
            float i12 = bt.a.i(withTimeAtStartOfDay);
            RectF rectF = this.f39510b;
            rectF.set(i11 - ((i12 - i11) * 0.01f), rectF.top, i12, rectF.bottom);
        }
        float min = Math.min(this.f39511c.width(), this.f39510b.width());
        RectF rectF2 = this.f39511c;
        float f11 = rectF2.left;
        RectF rectF3 = this.f39510b;
        float f12 = rectF3.left;
        if (f11 < f12) {
            rectF2.left = f12;
            rectF2.right = rectF3.left + min;
        } else {
            float f13 = rectF2.right;
            float f14 = rectF3.right;
            if (f13 > f14) {
                rectF2.right = f14;
                rectF2.left = rectF3.right - min;
            }
        }
        rectF2.top = Math.max(rectF3.top, rectF2.top);
        RectF rectF4 = this.f39511c;
        rectF4.bottom = Math.max(rectF4.top, Math.min(this.f39510b.bottom, rectF4.bottom));
        RectF rectF5 = this.f39511c;
        if (rectF5.bottom == rectF5.top) {
            rectF5.bottom = this.f39510b.bottom;
        }
    }

    public final void l0(MotionEvent motionEvent) {
        float f11;
        if (this.f39512d.width() * 0.5f > motionEvent.getX()) {
            f11 = 1.0f;
        } else {
            f11 = -1.0f;
        }
        RectF rectF = this.f39511c;
        nm0.j f02 = f0((((f11 * 0.2f) + 0.5f) * rectF.width()) + rectF.left, getCurrentZoomGranularity());
        if (((Float) f02.c()).floatValue() == this.f39511c.left && ((Float) f02.d()).floatValue() == this.f39511c.right) {
            return;
        }
        Point point = this.W;
        j(point);
        RectF rectF2 = this.f39521l0;
        rectF2.set(this.f39511c);
        float f12 = rectF2.left;
        RectF rectF3 = this.f39510b;
        int width = (int) (((f12 - rectF3.left) * point.x) / rectF3.width());
        RectF rectF4 = this.f39510b;
        int height = (int) (((rectF4.bottom - rectF2.bottom) * point.y) / rectF4.height());
        float floatValue = ((Float) f02.c()).floatValue();
        RectF rectF5 = this.f39510b;
        int width2 = (int) (((floatValue - rectF5.left) * point.x) / rectF5.width());
        OverScroller overScroller = this.R;
        overScroller.forceFinished(true);
        overScroller.springBack(width, height, width2, width2, height, height);
        u0.T(this);
    }

    public final void m0(RectF rectF) {
        RectF rectF2 = this.f39511c;
        rectF2.set(rectF.left, rectF2.top, rectF.right, rectF2.bottom);
        l();
        u0.T(this);
    }

    public final void n0(RectF rectF) {
        t();
        this.I0 = getCurrentZoomGranularity();
        this.G0.set(rectF);
        float f11 = rectF.left;
        this.f39521l0.set(this.f39511c);
        ss.b bVar = this.S;
        bVar.b();
        bVar.f(-1.0f);
        this.T.set((rectF.width() + f11) / 2.0f, 0.0f);
        l();
        u0.T(this);
    }

    @Override // com.withings.graph.GraphView
    protected final m o(Context context) {
        return new m(context, new d());
    }

    public final void o0(DateTime dateTime, int i11) {
        float i12 = bt.a.i(dateTime);
        t();
        this.I0 = getCurrentZoomGranularity();
        this.G0.set(e0(i12, i11));
        setCurrentZoomGranularity(i11);
        this.f39521l0.set(this.f39511c);
        ss.b bVar = this.S;
        bVar.b();
        bVar.f(-1.0f);
        this.T.set(i12, 0.0f);
        l();
        u0.T(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.graph.GraphView
    public final ScaleGestureDetector s(Context context) {
        return new ScaleGestureDetector(context, new e());
    }

    public void setCurrentZoomGranularity(int i11) {
        this.F0.o(i11);
    }

    public void setGesturesMode(int i11) {
        this.B0 = i11;
        if (i11 == 0) {
            this.M = super.s(getContext());
        }
    }

    public void setGraphTagsToAdjustVerticalBounds(List<String> list) {
        this.O0 = list;
    }

    public void setIgnoreInvisibleGraphsToAdjustVerticalBounds(boolean z5) {
        this.P0 = z5;
    }

    public void setInitialZoomGranularity(int i11) {
        this.F0.o(i11);
    }

    @Override // com.withings.graph.GraphView
    public void setLegacy(boolean z5) {
        super.setLegacy(z5);
        this.F0.p(z5);
    }

    public void setShouldDisplayMaxRange(boolean z5) {
        this.N0 = z5;
    }

    public void setShouldDisplayMinRange(boolean z5) {
        this.M0 = z5;
    }

    public void setTimeXAxis(com.withings.graph.axis.b bVar) {
        bVar.k(this.F0);
        super.setXAxis(bVar);
    }

    public void setVerticalBoundsAutoAdjustmentEnabled(boolean z5) {
        this.K0 = z5;
    }

    public void setVisibleThresholds(Map<String, List<Float>> map) {
        this.R0 = map;
    }

    @Override // com.withings.graph.GraphView
    public void setXAxis(HorizontalAxis horizontalAxis) {
        if (horizontalAxis instanceof com.withings.graph.axis.b) {
            setTimeXAxis((com.withings.graph.axis.b) horizontalAxis);
            return;
        }
        throw new IllegalArgumentException("Horizontal axis must be a TimeHorizontalAxis");
    }

    public void setZoomGranularities(int[] iArr) {
        this.F0.r(iArr);
    }

    @Override // com.withings.graph.GraphView
    protected final void w(MotionEvent motionEvent) {
        if (this.B0 == 2) {
            l0(motionEvent);
        } else {
            x();
        }
    }

    public TimeGraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.B0 = 1;
        this.E0 = new ArrayList();
        this.G0 = new RectF();
        this.H0 = new RectF();
        this.K0 = false;
        this.L0 = false;
        this.M0 = true;
        this.N0 = true;
        this.O0 = Collections.singletonList("TAG_MAIN_GRAPH");
        this.P0 = false;
        this.Q0 = new Handler();
        this.R0 = new HashMap();
        this.S0 = new a();
        bt.a aVar = new bt.a();
        this.F0 = aVar;
        k0(aVar.c(), 0.0f, aVar.b(), 100.0f);
    }

    public void setOnZoomGranularityChangeListener(c cVar) {
    }
}
