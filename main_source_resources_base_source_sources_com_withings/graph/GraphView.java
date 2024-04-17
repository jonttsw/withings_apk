package com.withings.graph;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Vibrator;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.compose.material.n3;
import androidx.core.os.n;
import androidx.core.view.m;
import androidx.core.view.u0;
import com.withings.features.TestSetting;
import com.withings.graph.GraphView;
import com.withings.graph.axis.HorizontalAxis;
import com.withings.graph.axis.VerticalAxis;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.filters.Filter;
import com.withings.graph.selection.SelectionMode;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import ks.s;
import rs.e;
import ss.a;
import ys.g;
/* loaded from: classes3.dex */
public class GraphView extends View {
    public static final /* synthetic */ int A0 = 0;
    protected g.a A;
    protected ys.g B;
    protected ArrayList F;
    protected boolean G;
    protected ScaleGestureDetector M;
    protected m P;
    protected ss.a Q;
    protected OverScroller R;
    protected ss.b S;
    protected PointF T;
    protected Point W;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f39509a;

    /* renamed from: b  reason: collision with root package name */
    protected RectF f39510b;

    /* renamed from: c  reason: collision with root package name */
    protected RectF f39511c;

    /* renamed from: d  reason: collision with root package name */
    protected Rect f39512d;

    /* renamed from: e  reason: collision with root package name */
    protected int f39513e;

    /* renamed from: f  reason: collision with root package name */
    protected int f39514f;

    /* renamed from: g  reason: collision with root package name */
    protected int f39515g;

    /* renamed from: h  reason: collision with root package name */
    protected int f39516h;

    /* renamed from: i  reason: collision with root package name */
    protected ArrayList f39517i;

    /* renamed from: j  reason: collision with root package name */
    protected ArrayList f39518j;

    /* renamed from: k  reason: collision with root package name */
    protected VerticalAxis f39519k;

    /* renamed from: l  reason: collision with root package name */
    protected Rect f39520l;

    /* renamed from: l0  reason: collision with root package name */
    protected RectF f39521l0;

    /* renamed from: m  reason: collision with root package name */
    protected HorizontalAxis f39522m;

    /* renamed from: m0  reason: collision with root package name */
    protected float f39523m0;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f39524n;

    /* renamed from: n0  reason: collision with root package name */
    protected xs.c f39525n0;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f39526o;

    /* renamed from: o0  reason: collision with root package name */
    private et.d f39527o0;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f39528p;

    /* renamed from: p0  reason: collision with root package name */
    protected androidx.core.widget.d f39529p0;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f39530q;

    /* renamed from: q0  reason: collision with root package name */
    protected androidx.core.widget.d f39531q0;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f39532r;

    /* renamed from: r0  reason: collision with root package name */
    protected androidx.core.widget.d f39533r0;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f39534s;

    /* renamed from: s0  reason: collision with root package name */
    protected androidx.core.widget.d f39535s0;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f39536t;

    /* renamed from: t0  reason: collision with root package name */
    protected boolean f39537t0;

    /* renamed from: u  reason: collision with root package name */
    protected SelectionMode f39538u;

    /* renamed from: u0  reason: collision with root package name */
    protected boolean f39539u0;

    /* renamed from: v  reason: collision with root package name */
    protected ah.k f39540v;

    /* renamed from: v0  reason: collision with root package name */
    protected boolean f39541v0;

    /* renamed from: w  reason: collision with root package name */
    protected e.c f39542w;

    /* renamed from: w0  reason: collision with root package name */
    protected boolean f39543w0;

    /* renamed from: x  reason: collision with root package name */
    protected ArrayList f39544x;

    /* renamed from: x0  reason: collision with root package name */
    private final TextPaint f39545x0;

    /* renamed from: y  reason: collision with root package name */
    protected g f39546y;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f39547y0;

    /* renamed from: z  reason: collision with root package name */
    protected e f39548z;

    /* renamed from: z0  reason: collision with root package name */
    protected boolean f39549z0;

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = androidx.core.os.m.a(new Object());

        /* renamed from: a  reason: collision with root package name */
        private RectF f39550a;

        /* loaded from: classes3.dex */
        final class a implements n<SavedState> {
            @Override // androidx.core.os.n
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // androidx.core.os.n
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f39550a = new RectF(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        public final String toString() {
            return "InteractiveLineGraphView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " viewport=" + this.f39550a.toString() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.f39550a.left);
            parcel.writeFloat(this.f39550a.top);
            parcel.writeFloat(this.f39550a.right);
            parcel.writeFloat(this.f39550a.bottom);
        }
    }

    /* loaded from: classes3.dex */
    final class a implements a.b {
        a() {
        }

        @Override // ss.a.b
        public final void a() {
            e eVar = GraphView.this.f39548z;
            if (eVar != null) {
                eVar.onScrubbingEnded();
            }
        }

        @Override // ss.a.b
        public final void b(float f11, float f12) {
            GraphView graphView = GraphView.this;
            SelectionMode selectionMode = graphView.f39538u;
            graphView.f39538u = SelectionMode.f39998b;
            GraphView.a(f11, f12, graphView);
            graphView.f39538u = selectionMode;
            e eVar = graphView.f39548z;
            if (eVar != null) {
                eVar.onScrubbingStarted();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GraphView graphView = GraphView.this;
            graphView.f39549z0 = true;
            if (!graphView.f39534s) {
                return super.onDoubleTap(motionEvent);
            }
            graphView.t();
            graphView.S.b();
            if (graphView.u(motionEvent.getX(), motionEvent.getY(), graphView.T)) {
                graphView.S.f(0.5f);
            }
            u0.T(graphView);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            GraphView graphView = GraphView.this;
            graphView.A();
            graphView.f39521l0.set(graphView.f39511c);
            graphView.R.forceFinished(true);
            u0.T(graphView);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            GraphView graphView = GraphView.this;
            if (!graphView.f39530q) {
                f11 = 0.0f;
            }
            if (!graphView.f39532r) {
                f12 = 0.0f;
            }
            graphView.n((int) (-f11), (int) (-f12));
            graphView.f39549z0 = true;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            float f13;
            boolean z5;
            GraphView graphView = GraphView.this;
            graphView.t();
            float f14 = 0.0f;
            if (graphView.f39530q) {
                f13 = (graphView.f39511c.width() * f11) / graphView.f39512d.width();
            } else {
                f13 = 0.0f;
            }
            if (graphView.f39532r) {
                f14 = (graphView.f39511c.height() * (-f12)) / graphView.f39512d.height();
            }
            graphView.j(graphView.W);
            Point point = graphView.W;
            RectF rectF = graphView.f39511c;
            float f15 = rectF.left;
            float f16 = f13 + f15;
            RectF rectF2 = graphView.f39510b;
            float f17 = rectF2.left;
            float f18 = rectF2.right;
            int i11 = (int) (((f16 - f17) * point.x) / (f18 - f17));
            float f19 = rectF2.bottom;
            float f21 = rectF.bottom;
            float f22 = ((f19 - f21) - f14) * point.y;
            float f23 = rectF2.top;
            int i12 = (int) (f22 / (f19 - f23));
            int i13 = (f15 > f17 ? 1 : (f15 == f17 ? 0 : -1));
            boolean z11 = false;
            if (i13 <= 0 && rectF.right >= f18) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (rectF.top > f23 || f21 < f19) {
                z11 = true;
            }
            graphView.F(f16, f21 + f14);
            if (z5 && i11 < 0) {
                graphView.f39533r0.e(i11 / graphView.f39512d.width());
                graphView.f39541v0 = true;
            }
            if (z11 && i12 < 0) {
                graphView.f39529p0.e(i12 / graphView.f39512d.height());
                graphView.f39537t0 = true;
            }
            if (z5 && i11 > graphView.W.x - graphView.f39512d.width()) {
                graphView.f39535s0.e((graphView.f39512d.width() + (i11 - graphView.W.x)) / graphView.f39512d.width());
                graphView.f39543w0 = true;
            }
            if (z11 && i12 > graphView.W.y - graphView.f39512d.height()) {
                graphView.f39531q0.e((graphView.f39512d.height() + (i12 - graphView.W.y)) / graphView.f39512d.height());
                graphView.f39539u0 = true;
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            GraphView graphView = GraphView.this;
            graphView.f39549z0 = true;
            if (GraphView.a(motionEvent.getX(), motionEvent.getY(), graphView)) {
                return true;
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private PointF f39553a = new PointF();

        /* renamed from: b  reason: collision with root package name */
        private float f39554b;

        /* renamed from: c  reason: collision with root package name */
        private float f39555c;

        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f11;
            float f12;
            float f13;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY();
            GraphView graphView = GraphView.this;
            float width = graphView.f39511c.width() * (this.f39554b / currentSpanX);
            float height = graphView.f39511c.height() * (this.f39555c / currentSpanY);
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            PointF pointF = this.f39553a;
            graphView.u(focusX, focusY, pointF);
            RectF rectF = graphView.f39511c;
            if (graphView.f39528p) {
                float f14 = pointF.x;
                Rect rect = graphView.f39512d;
                f11 = f14 - (((focusX - rect.left) * width) / rect.width());
            } else {
                f11 = rectF.left;
            }
            if (graphView.f39526o) {
                float f15 = pointF.y;
                Rect rect2 = graphView.f39512d;
                f12 = f15 - (((rect2.bottom - focusY) * height) / rect2.height());
            } else {
                f12 = graphView.f39511c.top;
            }
            float f16 = 0.0f;
            if (graphView.f39528p) {
                f13 = 0.0f;
            } else {
                f13 = graphView.f39511c.right;
            }
            if (!graphView.f39526o) {
                f16 = graphView.f39511c.bottom;
            }
            rectF.set(f11, f12, f13, f16);
            if (graphView.f39528p) {
                RectF rectF2 = graphView.f39511c;
                rectF2.right = rectF2.left + width;
                this.f39554b = currentSpanX;
            }
            if (graphView.f39526o) {
                RectF rectF3 = graphView.f39511c;
                rectF3.bottom = rectF3.top + height;
                this.f39555c = currentSpanY;
            }
            graphView.l();
            graphView.y();
            u0.T(graphView);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.f39554b = scaleGestureDetector.getCurrentSpanX();
            this.f39555c = scaleGestureDetector.getCurrentSpanY();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
    }

    /* loaded from: classes3.dex */
    public interface e {
        void onScrubbingEnded();

        void onScrubbingStarted();
    }

    /* loaded from: classes3.dex */
    public interface f {
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a();

        void b(float f11);

        void c();
    }

    /* loaded from: classes3.dex */
    public interface h {
        void a(GraphView graphView);

        void b(GraphView graphView);
    }

    static {
        new Rect(0, 0, 0, 0);
        new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        new PointF(0.0f, 0.0f);
    }

    public GraphView(Context context) {
        this(context, null, 0);
    }

    static boolean a(float f11, float f12, GraphView graphView) {
        graphView.H();
        ArrayList arrayList = graphView.F;
        ah.k kVar = graphView.f39540v;
        SelectionMode selectionMode = graphView.f39538u;
        kVar.getClass();
        arrayList.addAll(ah.k.f(f11, f12, selectionMode, graphView));
        if (!arrayList.isEmpty()) {
            Iterator it = graphView.F.iterator();
            while (it.hasNext()) {
                ((rs.e) it.next()).o(true);
            }
            e.c cVar = graphView.f39542w;
            if (cVar != null) {
                cVar.b(f11, f12, arrayList);
            }
            PointF pointF = new PointF(f11, f12);
            if (graphView.B != null && !arrayList.isEmpty()) {
                graphView.B.b(graphView, arrayList, pointF);
                g.a aVar = graphView.A;
                if (aVar != null) {
                    aVar.onPopupDisplayChanged(graphView, graphView.B, (rs.e) arrayList.get(0), pointF);
                }
            }
            u0.T(graphView);
            return true;
        }
        graphView.t();
        u0.T(graphView);
        return false;
    }

    private androidx.core.util.e<Float, Float> getZoomedHorizontalViewport() {
        if (this.f39528p) {
            RectF rectF = this.f39521l0;
            float width = rectF.width() * (1.0f - this.S.d());
            PointF pointF = this.T;
            float width2 = (pointF.x - rectF.left) / rectF.width();
            float f11 = pointF.x;
            return new androidx.core.util.e<>(Float.valueOf(f11 - (width * width2)), Float.valueOf(n3.a(1.0f, width2, width, f11)));
        }
        return new androidx.core.util.e<>(Float.valueOf(this.f39511c.left), Float.valueOf(this.f39511c.right));
    }

    private androidx.core.util.e<Float, Float> getZoomedVerticalViewport() {
        if (this.f39526o) {
            RectF rectF = this.f39521l0;
            float height = rectF.height() * (1.0f - this.S.d());
            PointF pointF = this.T;
            float height2 = (pointF.y - rectF.top) / rectF.height();
            float f11 = pointF.y;
            return new androidx.core.util.e<>(Float.valueOf(n3.a(1.0f, height2, height, f11)), Float.valueOf(f11 - (height * height2)));
        }
        return new androidx.core.util.e<>(Float.valueOf(this.f39511c.bottom), Float.valueOf(this.f39511c.top));
    }

    private void m(Canvas canvas, Decorator.DrawOrder drawOrder) {
        Iterator it = this.f39517i.iterator();
        while (it.hasNext()) {
            Decorator decorator = (Decorator) it.next();
            if (decorator.n() == drawOrder) {
                decorator.a(this, canvas);
            }
        }
        Iterator it2 = this.f39518j.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ts.d) it2.next()).f().iterator();
            while (it3.hasNext()) {
                Decorator decorator2 = (Decorator) it3.next();
                if (decorator2.n() == drawOrder) {
                    decorator2.a(this, canvas);
                }
            }
        }
    }

    protected final void A() {
        this.f39539u0 = false;
        this.f39543w0 = false;
        this.f39537t0 = false;
        this.f39541v0 = false;
        this.f39533r0.g();
        this.f39529p0.g();
        this.f39535s0.g();
        this.f39531q0.g();
    }

    public final void B(int i11, int i12, int i13, int i14) {
        this.f39515g = i11;
        this.f39516h = i12;
        this.f39513e = i13;
        this.f39514f = i14;
    }

    public final void C(Filter filter, List<String> list) {
        Iterator it = this.f39518j.iterator();
        while (it.hasNext()) {
            ts.d dVar = (ts.d) it.next();
            if (list.contains(dVar.g())) {
                dVar.j(filter);
            }
        }
    }

    public final void D(float f11, float f12, float f13, float f14) {
        this.f39511c.set(f11, f12, f13, f14);
        l();
        u0.T(this);
        Iterator it = this.f39518j.iterator();
        while (it.hasNext()) {
            ((ts.d) it.next()).b().a(this.f39511c, 2);
        }
    }

    public final void E(float f11, float f12, float f13, float f14) {
        this.f39510b.set(f11, f12, f13, f14);
        l();
        u0.T(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(float f11, float f12) {
        float width = this.f39511c.width();
        float height = this.f39511c.height();
        RectF rectF = this.f39510b;
        float max = Math.max(rectF.left, Math.min(f11, rectF.right - width));
        RectF rectF2 = this.f39510b;
        float max2 = Math.max(rectF2.top + height, Math.min(f12, rectF2.bottom));
        this.f39511c.set(max, max2 - height, width + max, max2);
        y();
        u0.T(this);
    }

    public final void G(ys.g gVar, rs.e eVar, PointF pointF) {
        H();
        if (this.B == null) {
            return;
        }
        if (gVar.isVisible()) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            ArrayList arrayList = this.F;
            ah.k kVar = this.f39540v;
            SelectionMode selectionMode = this.f39538u;
            kVar.getClass();
            arrayList.addAll(ah.k.f(f11, f12, selectionMode, this));
            if (!arrayList.isEmpty() && Math.abs(((rs.e) arrayList.get(0)).f95616a - eVar.f95616a) < 31.0f) {
                this.B.b(this, arrayList, pointF);
                Iterator it = this.F.iterator();
                while (it.hasNext()) {
                    ((rs.e) it.next()).o(true);
                }
            } else {
                this.B.a();
            }
        } else {
            this.B.a();
        }
        u0.T(this);
    }

    protected final void H() {
        ArrayList arrayList = this.F;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rs.e) it.next()).o(false);
        }
        arrayList.clear();
    }

    public final void b(Decorator decorator) {
        this.f39517i.add(decorator);
    }

    public final void c(Decorator decorator, String str) {
        decorator.l(str);
        this.f39517i.add(decorator);
    }

    @Override // android.view.View
    public void computeScroll() {
        boolean z5;
        boolean z11 = false;
        if (this.R.computeScrollOffset()) {
            z5 = g();
        } else {
            z5 = false;
        }
        if (this.S.a(null)) {
            if (this.f39526o || this.f39528p) {
                androidx.core.util.e<Float, Float> zoomedVerticalViewport = getZoomedVerticalViewport();
                androidx.core.util.e<Float, Float> zoomedHorizontalViewport = getZoomedHorizontalViewport();
                this.f39511c.set(zoomedHorizontalViewport.f12553a.floatValue(), zoomedVerticalViewport.f12554b.floatValue(), zoomedHorizontalViewport.f12554b.floatValue(), zoomedVerticalViewport.f12553a.floatValue());
                z11 = true;
            }
            l();
            z5 = z11;
        }
        if (z5) {
            y();
            u0.T(this);
        }
    }

    public final void d(ts.d dVar) {
        this.f39518j.add(dVar);
    }

    public final void e(ts.a aVar, String str) {
        aVar.l(str);
        this.f39518j.add(aVar);
    }

    public final void f(h hVar) {
        this.f39544x.add(hVar);
    }

    protected boolean g() {
        boolean z5;
        boolean z11;
        androidx.core.widget.d dVar;
        androidx.core.widget.d dVar2;
        Point point = this.W;
        j(point);
        OverScroller overScroller = this.R;
        int currX = overScroller.getCurrX();
        int currY = overScroller.getCurrY();
        RectF rectF = this.f39511c;
        float f11 = rectF.left;
        RectF rectF2 = this.f39510b;
        boolean z12 = true;
        boolean z13 = false;
        if (f11 <= rectF2.left && rectF.right >= rectF2.right) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (rectF.top <= rectF2.top && rectF.bottom >= rectF2.bottom) {
            z11 = false;
        } else {
            z11 = true;
        }
        Rect rect = this.f39512d;
        if (z5 && currX < 0) {
            androidx.core.widget.d dVar3 = this.f39533r0;
            if (dVar3.c() && !this.f39541v0) {
                dVar3.d((int) overScroller.getCurrVelocity());
                this.f39541v0 = true;
                z13 = true;
                if (z11 && currY < 0) {
                    dVar2 = this.f39529p0;
                    if (dVar2.c() && !this.f39537t0) {
                        dVar2.d((int) overScroller.getCurrVelocity());
                        this.f39537t0 = true;
                        RectF rectF3 = this.f39510b;
                        float f12 = rectF3.left;
                        float f13 = rectF3.bottom;
                        F((((rectF3.right - f12) * currX) / point.x) + f12, f13 - (((f13 - rectF3.top) * currY) / point.y));
                        return z12;
                    }
                }
                if (z11 && currY > point.y - rect.height()) {
                    dVar = this.f39531q0;
                    if (dVar.c() && !this.f39539u0) {
                        dVar.d((int) overScroller.getCurrVelocity());
                        this.f39539u0 = true;
                        RectF rectF32 = this.f39510b;
                        float f122 = rectF32.left;
                        float f132 = rectF32.bottom;
                        F((((rectF32.right - f122) * currX) / point.x) + f122, f132 - (((f132 - rectF32.top) * currY) / point.y));
                        return z12;
                    }
                }
                z12 = z13;
                RectF rectF322 = this.f39510b;
                float f1222 = rectF322.left;
                float f1322 = rectF322.bottom;
                F((((rectF322.right - f1222) * currX) / point.x) + f1222, f1322 - (((f1322 - rectF322.top) * currY) / point.y));
                return z12;
            }
        }
        if (z5 && currX > point.x - rect.width()) {
            androidx.core.widget.d dVar4 = this.f39535s0;
            if (dVar4.c() && !this.f39543w0) {
                dVar4.d((int) overScroller.getCurrVelocity());
                this.f39543w0 = true;
                z13 = true;
            }
        }
        if (z11) {
            dVar2 = this.f39529p0;
            if (dVar2.c()) {
                dVar2.d((int) overScroller.getCurrVelocity());
                this.f39537t0 = true;
                RectF rectF3222 = this.f39510b;
                float f12222 = rectF3222.left;
                float f13222 = rectF3222.bottom;
                F((((rectF3222.right - f12222) * currX) / point.x) + f12222, f13222 - (((f13222 - rectF3222.top) * currY) / point.y));
                return z12;
            }
        }
        if (z11) {
            dVar = this.f39531q0;
            if (dVar.c()) {
                dVar.d((int) overScroller.getCurrVelocity());
                this.f39539u0 = true;
                RectF rectF32222 = this.f39510b;
                float f122222 = rectF32222.left;
                float f132222 = rectF32222.bottom;
                F((((rectF32222.right - f122222) * currX) / point.x) + f122222, f132222 - (((f132222 - rectF32222.top) * currY) / point.y));
                return z12;
            }
        }
        z12 = z13;
        RectF rectF322222 = this.f39510b;
        float f1222222 = rectF322222.left;
        float f1322222 = rectF322222.bottom;
        F((((rectF322222.right - f1222222) * currX) / point.x) + f1222222, f1322222 - (((f1322222 - rectF322222.top) * currY) / point.y));
        return z12;
    }

    public List<ts.d> getAllMainGraphs() {
        return (List) this.f39518j.stream().filter(new Predicate() { // from class: ks.r

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f78295a = "TAG_MAIN_GRAPH";

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i11 = GraphView.A0;
                return Objects.equals(((ts.d) obj).g(), this.f78295a);
            }
        }).collect(Collectors.toList());
    }

    public Rect getContentRect() {
        return this.f39512d;
    }

    public RectF getCurrentViewport() {
        return this.f39511c;
    }

    public List<Decorator> getDecorators() {
        return this.f39517i;
    }

    public List<ts.d> getGraphs() {
        return this.f39518j;
    }

    public ts.d getMainGraph() {
        ArrayList arrayList = this.f39518j;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ts.d dVar = (ts.d) it.next();
            if ("TAG_MAIN_GRAPH".equals(dVar.g())) {
                return dVar;
            }
        }
        return (ts.d) arrayList.get(0);
    }

    public e.c getOnDatumClickListener() {
        return this.f39542w;
    }

    public d getOnErrorListener() {
        return null;
    }

    public f getOnSizeChangedListener() {
        return null;
    }

    public g getOnTouchListener() {
        return this.f39546y;
    }

    public ys.g getPopup() {
        return this.B;
    }

    public g.a getPopupListener() {
        return this.A;
    }

    public SelectionMode getSelectionMode() {
        return this.f39538u;
    }

    public et.d getVerticalGraphRangeCalculator() {
        return this.f39527o0;
    }

    public final void h() {
        this.f39517i.clear();
    }

    public final void i() {
        this.f39518j.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(Point point) {
        Rect rect = this.f39512d;
        RectF rectF = this.f39510b;
        int width = (int) (((rectF.right - rectF.left) * rect.width()) / this.f39511c.width());
        RectF rectF2 = this.f39510b;
        point.set(width, (int) (((rectF2.bottom - rectF2.top) * rect.height()) / this.f39511c.height()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final androidx.core.util.e<Float, Float> k(float f11, float f12) {
        et.d dVar = this.f39527o0;
        if (dVar != null) {
            return dVar.a(f11, f12, this.f39510b);
        }
        return new androidx.core.util.e<>(Float.valueOf(f11), Float.valueOf(f12));
    }

    protected void l() {
        RectF rectF = this.f39511c;
        rectF.left = Math.max(this.f39510b.left, rectF.left);
        RectF rectF2 = this.f39511c;
        rectF2.top = Math.max(this.f39510b.top, rectF2.top);
        RectF rectF3 = this.f39511c;
        rectF3.bottom = Math.max(rectF3.top, Math.min(this.f39510b.bottom, rectF3.bottom));
        RectF rectF4 = this.f39511c;
        if (rectF4.bottom == rectF4.top) {
            rectF4.bottom = this.f39510b.bottom;
        }
        rectF4.right = Math.max(rectF4.left, Math.min(this.f39510b.right, rectF4.right));
        RectF rectF5 = this.f39511c;
        if (rectF5.right == rectF5.left) {
            rectF5.right = this.f39510b.right;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i11, int i12) {
        A();
        Point point = this.W;
        j(point);
        RectF rectF = this.f39521l0;
        rectF.set(this.f39511c);
        float f11 = rectF.left;
        RectF rectF2 = this.f39510b;
        float f12 = rectF2.left;
        int i13 = (int) (((f11 - f12) * point.x) / (rectF2.right - f12));
        float f13 = rectF2.bottom;
        int i14 = (int) (((f13 - rectF.bottom) * point.y) / (f13 - rectF2.top));
        OverScroller overScroller = this.R;
        overScroller.forceFinished(true);
        int i15 = point.x;
        Rect rect = this.f39512d;
        overScroller.fling(i13, i14, i11, i12, 0, i15 - rect.width(), 0, point.y - rect.height(), rect.width() / 2, rect.height() / 2);
        u0.T(this);
    }

    protected m o(Context context) {
        return new m(context, new b());
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        boolean z5;
        boolean z11;
        super.onDraw(canvas);
        canvas.save();
        Rect rect = this.f39512d;
        canvas.clipRect(rect);
        m(canvas, Decorator.DrawOrder.f39679c);
        Iterator it = this.f39518j.iterator();
        while (it.hasNext()) {
            ts.d dVar = (ts.d) it.next();
            if (!dVar.m()) {
                dVar.a(this, canvas);
            }
        }
        canvas.restore();
        VerticalAxis verticalAxis = this.f39519k;
        if (verticalAxis != null) {
            verticalAxis.f(this);
            this.f39519k.i(this, canvas);
        }
        HorizontalAxis horizontalAxis = this.f39522m;
        if (horizontalAxis != null) {
            horizontalAxis.f(this);
            this.f39522m.h(this, canvas);
        }
        m(canvas, Decorator.DrawOrder.f39678b);
        canvas.save();
        canvas.clipRect(rect.left, rect.top - 18, rect.right, rect.bottom);
        Iterator it2 = this.f39518j.iterator();
        while (true) {
            z5 = true;
            if (!it2.hasNext()) {
                break;
            }
            ts.d dVar2 = (ts.d) it2.next();
            if (true == dVar2.m()) {
                dVar2.a(this, canvas);
            }
        }
        canvas.restore();
        m(canvas, Decorator.DrawOrder.f39677a);
        if (this.f39519k != null) {
            canvas.save();
            canvas.clipRect(this.f39520l);
            this.f39519k.h(this, canvas);
            canvas.restore();
            this.f39519k.g(this, canvas);
        }
        HorizontalAxis horizontalAxis2 = this.f39522m;
        if (horizontalAxis2 != null) {
            horizontalAxis2.g(this, canvas);
        }
        m(canvas, Decorator.DrawOrder.f39680d);
        this.f39525n0.b(this, canvas);
        if (this.f39547y0) {
            TextPaint textPaint = this.f39545x0;
            canvas.drawText("currentViewport | left: " + this.f39511c.left + " | right: " + this.f39511c.right + " | bottom: " + this.f39511c.bottom + " | top: " + this.f39511c.top, 5.0f, 20.0f, textPaint);
            canvas.drawText("maxViewport | left: " + this.f39510b.left + " | right: " + this.f39510b.right + " | bottom: " + this.f39510b.bottom + " | top: " + this.f39510b.top, 5.0f, 50.0f, textPaint);
        }
        androidx.core.widget.d dVar3 = this.f39529p0;
        if (!dVar3.c()) {
            int save = canvas.save();
            canvas.translate(rect.left, rect.top);
            dVar3.h(rect.width(), rect.height());
            z11 = dVar3.a(canvas);
            canvas.restoreToCount(save);
        } else {
            z11 = false;
        }
        androidx.core.widget.d dVar4 = this.f39531q0;
        if (!dVar4.c()) {
            int save2 = canvas.save();
            canvas.translate((rect.left * 2) - rect.right, rect.bottom);
            canvas.rotate(180.0f, rect.width(), 0.0f);
            dVar4.h(rect.width(), rect.height());
            if (dVar4.a(canvas)) {
                z11 = true;
            }
            canvas.restoreToCount(save2);
        }
        androidx.core.widget.d dVar5 = this.f39533r0;
        if (!dVar5.c()) {
            int save3 = canvas.save();
            canvas.translate(rect.left, rect.bottom);
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            dVar5.h(rect.height(), rect.width());
            if (dVar5.a(canvas)) {
                z11 = true;
            }
            canvas.restoreToCount(save3);
        }
        androidx.core.widget.d dVar6 = this.f39535s0;
        if (!dVar6.c()) {
            int save4 = canvas.save();
            canvas.translate(rect.right, rect.top);
            canvas.rotate(90.0f, 0.0f, 0.0f);
            dVar6.h(rect.height(), rect.width());
            if (!dVar6.a(canvas)) {
                z5 = z11;
            }
            canvas.restoreToCount(save4);
            z11 = z5;
        }
        if (z11) {
            u0.T(this);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        HorizontalAxis horizontalAxis = this.f39522m;
        int i14 = 0;
        if (horizontalAxis != null) {
            i13 = horizontalAxis.b();
        } else {
            i13 = 0;
        }
        VerticalAxis verticalAxis = this.f39519k;
        if (verticalAxis != null) {
            i14 = verticalAxis.d();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1987R.dimen.min_chart_size);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(getPaddingRight() + getPaddingLeft() + dimensionPixelSize + i14, i11)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(getPaddingBottom() + getPaddingTop() + dimensionPixelSize + i13, i12)));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f39511c.set(savedState.f39550a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.withings.graph.GraphView$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        ((SavedState) baseSavedState).f39550a = this.f39511c;
        return baseSavedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        z(i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(this.G);
        }
        if (!this.f39524n) {
            return false;
        }
        float x11 = motionEvent.getX();
        if (this.f39536t) {
            this.M.onTouchEvent(motionEvent);
        }
        if (this.f39546y != null) {
            if (motionEvent.getAction() == 0) {
                this.f39546y.c();
                this.f39523m0 = x11;
            } else if (motionEvent.getAction() == 1) {
                this.f39546y.a();
            } else if (motionEvent.getAction() == 2) {
                this.f39546y.b(x11 - this.f39523m0);
                this.f39523m0 = x11;
            }
        }
        if (this.Q.onTouch(this, motionEvent) || this.P.a(motionEvent)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.f39549z0) {
            if (!z5) {
                w(motionEvent);
            }
            this.f39549z0 = true;
        } else {
            if (motionEvent.getAction() == 0) {
                this.f39549z0 = false;
            }
            if (!z5 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public final ts.d p(String str) {
        Iterator it = this.f39518j.iterator();
        while (it.hasNext()) {
            ts.d dVar = (ts.d) it.next();
            if (str.equals(dVar.g())) {
                return dVar;
            }
        }
        return null;
    }

    public final float q(float f11) {
        Rect rect = this.f39512d;
        RectF rectF = this.f39511c;
        return (((f11 - rectF.left) * rect.width()) / rectF.width()) + rect.left;
    }

    public final float r(float f11) {
        Rect rect = this.f39512d;
        RectF rectF = this.f39511c;
        return rect.bottom - (((f11 - rectF.top) * rect.height()) / rectF.height());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScaleGestureDetector s(Context context) {
        return new ScaleGestureDetector(context, new c());
    }

    public void setDoubleTapToZoomEnabled(boolean z5) {
        this.f39534s = z5;
    }

    public void setLegacy(boolean z5) {
        this.f39509a = z5;
    }

    public void setMainGraph(ts.d dVar) {
        dVar.l("TAG_MAIN_GRAPH");
        this.f39518j.add(dVar);
    }

    public void setModifier(xs.c cVar) {
        cVar.a(this);
        this.f39525n0 = cVar;
        z(getWidth(), getHeight());
    }

    public void setOnDatumClickListener(e.c cVar) {
        this.f39542w = cVar;
    }

    public void setOnScrubbingListener(e eVar) {
        this.f39548z = eVar;
    }

    public void setOnTouchListener(g gVar) {
        this.f39546y = gVar;
    }

    public void setPopup(ys.g gVar) {
        this.B = gVar;
    }

    public void setPopupListener(g.a aVar) {
        this.A = aVar;
    }

    public void setRequestParentDisallowInterceptTouchEvent(boolean z5) {
        this.G = z5;
    }

    public void setScaleGestureEnabled(boolean z5) {
        this.f39536t = z5;
    }

    public void setScrollXEnabled(boolean z5) {
        this.f39530q = z5;
    }

    public void setScrollYEnabled(boolean z5) {
        this.f39532r = z5;
    }

    public void setScrubbingEnabled(boolean z5) {
        this.Q.f(z5);
    }

    public void setSelectionMode(SelectionMode selectionMode) {
        this.f39538u = selectionMode;
    }

    public void setTouchEnabled(boolean z5) {
        this.f39524n = z5;
    }

    public void setVerticalGraphRangeCalculator(et.d dVar) {
        this.f39527o0 = dVar;
    }

    public void setXAxis(HorizontalAxis horizontalAxis) {
        if (horizontalAxis != null) {
            if (horizontalAxis.b() > 0) {
                this.f39522m = horizontalAxis;
                z(getWidth(), getHeight());
                return;
            }
            throw new IllegalArgumentException("Horizontal axis's height cannot be < 0");
        }
        throw new NullPointerException("Horizontal axis is null");
    }

    public void setYAxis(VerticalAxis verticalAxis) {
        if (verticalAxis != null) {
            if (verticalAxis.d() == 0) {
                verticalAxis.m(this.f39510b.bottom);
            } else if (verticalAxis.d() < 0) {
                throw new IllegalArgumentException("Vertical axis's width cannot be < 0");
            }
            this.f39519k = verticalAxis;
            z(getWidth(), getHeight());
            return;
        }
        throw new NullPointerException("Vertical axis is null");
    }

    public void setZoomEnabled(boolean z5) {
        this.f39526o = z5;
        this.f39528p = z5;
    }

    public void setZoomXEnabled(boolean z5) {
        this.f39528p = z5;
    }

    public void setZoomYEnabled(boolean z5) {
        this.f39526o = z5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        ys.g gVar = this.B;
        if (gVar != null && gVar.isVisible()) {
            this.B.a();
            g.a aVar = this.A;
            if (aVar != null) {
                aVar.onPopupDisplayChanged(this, this.B, null, null);
            }
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u(float f11, float f12, PointF pointF) {
        Rect rect = this.f39512d;
        if (!rect.contains((int) f11, (int) f12)) {
            return false;
        }
        RectF rectF = this.f39511c;
        float width = (((f11 - rect.left) * rectF.width()) / rect.width()) + rectF.left;
        RectF rectF2 = this.f39511c;
        pointF.set(width, (((f12 - rect.bottom) * rectF2.height()) / (-rect.height())) + rectF2.top);
        return true;
    }

    public final boolean v() {
        return this.f39509a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        Iterator it = this.f39544x.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y() {
        Iterator it = this.f39544x.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(this);
        }
    }

    public final void z(int i11, int i12) {
        int i13 = this.f39514f;
        int i14 = this.f39513e;
        int i15 = this.f39515g;
        int i16 = this.f39516h;
        VerticalAxis verticalAxis = this.f39519k;
        if (verticalAxis != null && verticalAxis.k() == VerticalAxis.VerticalAxisPosition.f39601c) {
            i13 += this.f39519k.d();
        }
        VerticalAxis verticalAxis2 = this.f39519k;
        if (verticalAxis2 != null && verticalAxis2.k() == VerticalAxis.VerticalAxisPosition.f39600b) {
            i14 += this.f39519k.d();
        }
        HorizontalAxis horizontalAxis = this.f39522m;
        if (horizontalAxis != null && horizontalAxis.i() == HorizontalAxis.HorizontalAxisPosition.f39590b) {
            i15 += this.f39522m.b();
        }
        HorizontalAxis horizontalAxis2 = this.f39522m;
        if (horizontalAxis2 != null && horizontalAxis2.i() == HorizontalAxis.HorizontalAxisPosition.f39591c) {
            i16 += this.f39522m.b();
        }
        this.f39512d.set(getPaddingLeft() + i14, getPaddingTop() + i15, (i11 - getPaddingRight()) - i13, (i12 - getPaddingBottom()) - i16);
        if (this.f39519k != null) {
            this.f39520l.set(getPaddingLeft(), (getPaddingTop() + i15) - this.f39519k.c(), i11 - getPaddingRight(), this.f39519k.c() + ((i12 - getPaddingBottom()) - i16));
        }
    }

    public GraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ah.k, java.lang.Object] */
    public GraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f39509a = true;
        this.f39512d = new Rect();
        this.f39513e = 0;
        this.f39514f = 0;
        this.f39515g = 0;
        this.f39516h = 0;
        this.f39520l = new Rect();
        this.f39524n = true;
        this.f39526o = false;
        this.f39528p = true;
        this.f39530q = true;
        this.f39532r = true;
        this.f39534s = true;
        this.f39536t = true;
        this.f39538u = SelectionMode.f39997a;
        this.f39540v = new Object();
        this.f39544x = new ArrayList();
        this.F = new ArrayList();
        this.G = false;
        this.T = new PointF();
        this.W = new Point();
        this.f39521l0 = new RectF();
        this.f39523m0 = 0.0f;
        this.f39525n0 = xs.c.f107461a;
        this.f39527o0 = new et.b(0.1f, 0.1f, 10.0f);
        TextPaint textPaint = new TextPaint(new Paint());
        this.f39545x0 = textPaint;
        this.f39547y0 = wr.b.c(TestSetting.f39172g);
        a aVar = new a();
        this.f39549z0 = true;
        textPaint.setTextSize(20.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s.f78296a, i11, i11);
        try {
            this.f39524n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f39510b = new RectF(0.0f, 0.0f, 100.0f, 100.0f);
            this.f39511c = new RectF(0.0f, 0.0f, 100.0f, 100.0f);
            this.f39517i = new ArrayList();
            this.f39518j = new ArrayList();
            this.M = s(context);
            this.P = o(context);
            if (!isInEditMode()) {
                this.Q = new ss.a(aVar, ViewConfiguration.get(getContext()), (Vibrator) getContext().getSystemService("vibrator"));
            }
            this.R = new OverScroller(context);
            getContext();
            this.S = new ss.b();
            this.f39533r0 = new androidx.core.widget.d(context);
            this.f39529p0 = new androidx.core.widget.d(context);
            this.f39535s0 = new androidx.core.widget.d(context);
            this.f39531q0 = new androidx.core.widget.d(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setOnErrorListener(d dVar) {
    }

    public void setOnSizeChangedListener(f fVar) {
    }

    protected void w(MotionEvent motionEvent) {
    }
}
