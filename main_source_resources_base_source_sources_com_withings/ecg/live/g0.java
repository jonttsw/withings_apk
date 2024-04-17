package com.withings.ecg.live;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import androidx.core.view.u0;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: LiveEcgPlayer.kt */
/* loaded from: classes3.dex */
public final class g0 implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    private final EcgLineChart f38666a;

    /* renamed from: b  reason: collision with root package name */
    private ym0.l<? super Integer, nm0.y> f38667b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f38668c;

    /* renamed from: d  reason: collision with root package name */
    private final Choreographer f38669d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f38670e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f38671f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38672g;

    /* renamed from: h  reason: collision with root package name */
    private long f38673h;

    /* renamed from: i  reason: collision with root package name */
    private float f38674i;

    /* renamed from: j  reason: collision with root package name */
    private EcgEntry f38675j;

    /* renamed from: k  reason: collision with root package name */
    private float f38676k;

    /* renamed from: l  reason: collision with root package name */
    private long f38677l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f38678m;

    /* compiled from: LiveEcgPlayer.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f38679a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38680b;

        public a(long j5, int i11) {
            this.f38679a = j5;
            this.f38680b = i11;
        }

        public final int a() {
            return this.f38680b;
        }

        public final long b() {
            return this.f38679a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f38679a == aVar.f38679a && this.f38680b == aVar.f38680b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f38680b) + (Long.hashCode(this.f38679a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Frame(timestamp=");
            sb2.append(this.f38679a);
            sb2.append(", fps=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f38680b, ")");
        }
    }

    /* compiled from: LiveEcgPlayer.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f38681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f38681a = aVar;
        }

        @Override // ym0.l
        public final Boolean invoke(a aVar) {
            boolean z5;
            a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            if (this.f38681a.b() - it.b() > 5000) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            g0 g0Var = g0.this;
            g0Var.f38676k = (-wq.a.n(g0Var.f38666a.getMeasuredWidth(), g0Var.f38668c)) / 25.0f;
            g0Var.f38666a.getXAxis().E(g0Var.f38676k);
            g0Var.f38666a.setVerticalRange$ecg_release(view.getMeasuredHeight());
        }
    }

    public g0() {
        throw null;
    }

    public g0(EcgLineChart ecgLineChart) {
        this.f38666a = ecgLineChart;
        this.f38667b = null;
        Context context = ecgLineChart.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f38668c = context;
        this.f38669d = Choreographer.getInstance();
        Handler handler = new Handler();
        this.f38670e = handler;
        i0 i0Var = new i0(this);
        this.f38671f = i0Var;
        this.f38672g = nm0.h.b(h0.f38684a);
        this.f38677l = -1L;
        this.f38678m = new ArrayList();
        XAxis xAxis = ecgLineChart.getXAxis();
        xAxis.E(0.0f);
        xAxis.D(20.0f);
        xAxis.H(false);
        ecgLineChart.setTouchEnabled(false);
        ecgLineChart.setGridEnabled(true);
        ecgLineChart.setScaleXEnabled(true);
        handler.post(i0Var);
    }

    public static final void a(g0 g0Var, EcgEntry ecgEntry) {
        ((lb.i) g0Var.f38666a.getData()).b(ecgEntry, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        Entry entry;
        float f11;
        int i11 = (this.f38673h > 0L ? 1 : (this.f38673h == 0L ? 0 : -1));
        EcgLineChart ecgLineChart = this.f38666a;
        if (i11 != 0) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f38673h)) / 1000.0f;
            EcgEntry ecgEntry = this.f38675j;
            if (ecgEntry != null) {
                f11 = ecgEntry.b();
            } else {
                f11 = 0.0f;
            }
            ecgLineChart.H((currentTimeMillis - 0.5f) + this.f38676k, f11);
        }
        if (androidx.compose.foundation.lazy.layout.d.h()) {
            pb.f fVar = (pb.f) ((lb.i) ecgLineChart.getData()).g(0);
            if (fVar != null) {
                entry = fVar.V(ecgLineChart.getHighestVisibleX(), 0.0f);
            } else {
                entry = null;
            }
            if (entry != null) {
                pb.f fVar2 = (pb.f) ((lb.i) ecgLineChart.getData()).g(2);
                if (fVar2 != null) {
                    fVar2.clear();
                }
                ((lb.i) ecgLineChart.getData()).b(entry, 2);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f38677l;
        long j12 = j5 - j11;
        if (j11 > 0 && currentTimeMillis - ((Number) this.f38672g.getValue()).longValue() > 500 && j12 > 0) {
            int i11 = (int) (((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS) / j12);
            a aVar = new a(currentTimeMillis, i11);
            ArrayList arrayList = this.f38678m;
            arrayList.add(aVar);
            kotlin.collections.b0.j(arrayList, new b(aVar));
            ym0.l<? super Integer, nm0.y> lVar = this.f38667b;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i11));
            }
        } else {
            ym0.l<? super Integer, nm0.y> lVar2 = this.f38667b;
            if (lVar2 != null) {
                lVar2.invoke(0);
            }
        }
        this.f38677l = j5;
        k();
        this.f38669d.postFrameCallback(this);
    }

    public final int j() {
        ArrayList arrayList = this.f38678m;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((a) it.next()).a()));
        }
        return ah.l.r(arrayList2);
    }

    public final void l(List<EcgEntry> entries) {
        kotlin.jvm.internal.u.j(entries, "entries");
        boolean h11 = androidx.compose.foundation.lazy.layout.d.h();
        EcgLineChart ecgLineChart = this.f38666a;
        if (h11) {
            int color = androidx.core.content.a.getColor(this.f38668c, C1987R.color.datavizMonochromaticNeutral2);
            int i11 = EcgLineChart.f38387b1;
            ecgLineChart.V(color, 1.0f, true, LineDataSet.Mode.f24364c);
        }
        for (EcgEntry ecgEntry : entries) {
            ((lb.i) ecgLineChart.getData()).b(ecgEntry, 0);
        }
        this.f38675j = (EcgEntry) kotlin.collections.x.U(entries);
    }

    public final void m(ym0.l<? super Integer, nm0.y> lVar) {
        this.f38667b = lVar;
    }

    public final void n(long j5) {
        if (this.f38673h == 0) {
            this.f38673h = System.currentTimeMillis();
        }
        EcgLineChart ecgLineChart = this.f38666a;
        float f11 = (float) j5;
        ecgLineChart.getXAxis().D(f11);
        if (u0.L(ecgLineChart) && !ecgLineChart.isLayoutRequested()) {
            this.f38676k = (-wq.a.n(ecgLineChart.getMeasuredWidth(), this.f38668c)) / 25.0f;
            ecgLineChart.getXAxis().E(this.f38676k);
            ecgLineChart.setVerticalRange$ecg_release(ecgLineChart.getMeasuredHeight());
        } else {
            ecgLineChart.addOnLayoutChangeListener(new c());
        }
        int i11 = EcgLineChart.f38387b1;
        ecgLineChart.d0(0.0f, f11);
        this.f38669d.postFrameCallback(this);
        this.f38670e.removeCallbacks(this.f38671f);
    }

    public final void o() {
        this.f38673h = 0L;
        this.f38669d.removeFrameCallback(this);
    }
}
