package com.withings.ecg.live;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.l0;
import com.google.android.filament.gltfio.BuildConfig;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.model.LiveEcgData;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
import com.withings.ecg.model.SignalMeta;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import x.p0;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class c extends g1 {
    private int A;
    private long B;
    private long F;
    private long G;
    private final j M;

    /* renamed from: a  reason: collision with root package name */
    private final u70.i f38628a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38629b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f38630c;

    /* renamed from: d  reason: collision with root package name */
    private final jq.f f38631d;

    /* renamed from: e  reason: collision with root package name */
    private final pi.i f38632e;

    /* renamed from: f  reason: collision with root package name */
    private final vf.c f38633f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f38634g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f38635h;

    /* renamed from: i  reason: collision with root package name */
    private final s f38636i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveEcgMeasurementRepository f38637j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38638k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<Integer> f38639l;

    /* renamed from: m  reason: collision with root package name */
    private final xw.p<SignalMeta, LiveEcgData, k0> f38640m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38641n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f38642o;

    /* renamed from: p  reason: collision with root package name */
    private final xw.f f38643p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f38644q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.f f38645r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f38646s;

    /* renamed from: t  reason: collision with root package name */
    private final y.u f38647t;

    /* renamed from: u  reason: collision with root package name */
    private final p0 f38648u;

    /* renamed from: v  reason: collision with root package name */
    private final int f38649v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.k0<Long> f38650w;

    /* renamed from: x  reason: collision with root package name */
    private long f38651x;

    /* renamed from: y  reason: collision with root package name */
    private Long f38652y;

    /* renamed from: z  reason: collision with root package name */
    private int f38653z;

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f38654a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38655b;

        public a(long j5, float f11) {
            this.f38654a = f11;
            this.f38655b = j5;
        }

        public final long a() {
            return this.f38655b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f38654a, aVar.f38654a) == 0 && this.f38655b == aVar.f38655b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f38655b) + (Float.hashCode(this.f38654a) * 31);
        }

        public final String toString() {
            return "EcgSignalStartedData(gain=" + this.f38654a + ", duration=" + this.f38655b + ")";
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    /* synthetic */ class b extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
        b(Object obj) {
            super(1, obj, c.class, "onCountDownEnabled", "onCountDownEnabled(Ljava/lang/Boolean;)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            c.r0((c) this.receiver, bool);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* renamed from: com.withings.ecg.live.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class C0506c extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
        C0506c(Object obj) {
            super(1, obj, c.class, "onTimeOutEnabled", "onTimeOutEnabled(Ljava/lang/Boolean;)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            c.z0((c) this.receiver, bool);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class d implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f38656a;

        d(ym0.l lVar) {
            this.f38656a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f38656a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f38656a;
        }

        public final int hashCode() {
            return this.f38656a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38656a.invoke(obj);
        }
    }

    public c(u70.i macAddress, boolean z5, g0 liveEcgPlayer, jq.f ecgAnalytics, pi.i iVar, vf.c cVar) {
        int i11;
        ej.w w11 = ej.w.w();
        kotlin.jvm.internal.u.i(w11, "get(...)");
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        PlatformFeatureRepository platformFeatureRepository = RoomPlatformFeatureRepository.Companion.get();
        Handler handler = new Handler(Looper.getMainLooper());
        Handler handler2 = new Handler(Looper.getMainLooper());
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(macAddress, "macAddress");
        kotlin.jvm.internal.u.j(liveEcgPlayer, "liveEcgPlayer");
        kotlin.jvm.internal.u.j(ecgAnalytics, "ecgAnalytics");
        this.f38628a = macAddress;
        this.f38629b = z5;
        this.f38630c = liveEcgPlayer;
        this.f38631d = ecgAnalytics;
        this.f38632e = iVar;
        this.f38633f = cVar;
        this.f38634g = handler;
        this.f38635h = handler2;
        s sVar = new s();
        sVar.v(new lm.a(w11.E(macAddress)));
        this.f38636i = sVar;
        LiveEcgMeasurementRepository liveEcgMeasurementRepository = androidx.compose.foundation.lazy.layout.d.f4444c;
        if (liveEcgMeasurementRepository != null) {
            this.f38637j = liveEcgMeasurementRepository;
            nm0.g b10 = nm0.h.b(new l(this));
            nm0.g b11 = nm0.h.b(new m(this));
            androidx.lifecycle.j0 b12 = e1.b((LiveData) b11.getValue(), h.f38683a);
            this.f38638k = b12;
            this.f38639l = liveEcgMeasurementRepository.getLiveHRData();
            xw.p<SignalMeta, LiveEcgData, k0> pVar = new xw.p<>(liveEcgMeasurementRepository.getLiveSignalMeta(), liveEcgMeasurementRepository.getLiveData(), new g(this));
            this.f38640m = pVar;
            this.f38641n = e1.b(liveEcgMeasurementRepository.getLiveSignalMeta(), new i(this));
            Boolean bool = Boolean.FALSE;
            androidx.lifecycle.k0<Boolean> b13 = xw.d.b(bool);
            this.f38642o = b13;
            this.f38643p = xw.d.f(e1.b(xw.a.c(new nm0.o((LiveData) b10.getValue(), (LiveData) b11.getValue(), b12)), e.f38660a));
            this.f38644q = xw.d.b(bool);
            this.f38645r = androidx.lifecycle.h.a(Dispatchers.getIO(), new p(c11, this, platformFeatureRepository, null), 2);
            this.f38646s = xw.d.b(bool);
            this.f38647t = new y.u(this, 6);
            this.f38648u = new p0(this, 4);
            SignalMeta value = liveEcgMeasurementRepository.getLiveSignalMeta().getValue();
            if (value != null) {
                i11 = value.getTimeWindow();
            } else {
                i11 = 100;
            }
            this.f38649v = i11;
            Long l5 = (Long) b12.getValue();
            this.f38650w = xw.d.b(l5 != null ? Long.valueOf(l5.longValue() + 15) : null);
            j jVar = new j(this);
            this.M = jVar;
            pVar.observeForever(jVar);
            b13.observeForever(new d(new com.withings.ecg.live.a(this)));
            b13.observeForever(new d(new com.withings.ecg.live.b(this)));
            return;
        }
        kotlin.jvm.internal.u.s("liveEcgMeasurementRepository");
        throw null;
    }

    public static void f0(c cVar) {
        Long l5 = (Long) cVar.f38643p.getValue();
        if (l5 != null) {
            int i11 = (l5.longValue() > 0L ? 1 : (l5.longValue() == 0L ? 0 : -1));
            y.u uVar = cVar.f38647t;
            Handler handler = cVar.f38634g;
            if (i11 > 0) {
                handler.postDelayed(uVar, 1000L);
                return;
            }
            cVar.f38646s.setValue(Boolean.TRUE);
            handler.removeCallbacks(uVar);
        }
    }

    public static void g0(c cVar) {
        androidx.lifecycle.k0<Long> k0Var = cVar.f38650w;
        Long value = k0Var.getValue();
        if (value != null) {
            int i11 = (value.longValue() > 0L ? 1 : (value.longValue() == 0L ? 0 : -1));
            p0 p0Var = cVar.f38648u;
            Handler handler = cVar.f38635h;
            if (i11 > 0) {
                k0Var.setValue(Long.valueOf(value.longValue() - 1));
                handler.postDelayed(p0Var, 1000L);
                return;
            }
            cVar.f38637j.onTimeOut();
            handler.removeCallbacks(p0Var);
        }
    }

    public static final k0 i0(c cVar, LiveEcgData liveEcgData, SignalMeta signalMeta) {
        int[] filteredPayload;
        String str;
        cVar.getClass();
        int length = liveEcgData.getFilteredPayload().length;
        kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
        if (length == 0) {
            return new k0(i0Var);
        }
        Long l5 = cVar.f38652y;
        if (l5 != null) {
            long longValue = l5.longValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int index = liveEcgData.getIndex();
            int i11 = cVar.f38649v;
            float f11 = ((index * i11) + ((float) longValue)) / 1000.0f;
            float length2 = (i11 / liveEcgData.getFilteredPayload().length) / 1000.0f;
            int length3 = liveEcgData.getFilteredPayload().length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length3) {
                arrayList2.add(new EcgEntry(f11, filteredPayload[i12]));
                arrayList.add(new EcgEntry(f11, liveEcgData.getFilteredPayload()[i13]));
                f11 += length2;
                i12++;
                i13++;
            }
            cVar.f38653z = arrayList2.size() + cVar.f38653z;
            int totalSize = (((int) signalMeta.getTotalSize()) / signalMeta.getSize()) - cVar.f38653z;
            jq.f fVar = cVar.f38631d;
            fVar.d(totalSize);
            if (cVar.f38629b) {
                str = BuildConfig.FLAVOR;
            } else {
                str = "without_grid";
            }
            fVar.c(str);
            fVar.b(cVar.f38630c.j());
            return new k0(arrayList2);
        }
        return new k0(i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(com.withings.ecg.live.c r12, qm0.d r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.live.c.j0(com.withings.ecg.live.c, qm0.d):java.lang.Object");
    }

    public static final void r0(c cVar, Boolean bool) {
        cVar.getClass();
        boolean e11 = kotlin.jvm.internal.u.e(bool, Boolean.TRUE);
        y.u uVar = cVar.f38647t;
        Handler handler = cVar.f38634g;
        if (e11) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(cVar), null, null, new n(cVar, null), 3, null);
            handler.post(uVar);
            return;
        }
        handler.removeCallbacks(uVar);
    }

    public static final void t0(c cVar, xw.p pVar, SignalMeta signalMeta, LiveEcgData liveEcgData) {
        cVar.getClass();
        if (liveEcgData != null) {
            int index = liveEcgData.getIndex();
            Integer valueOf = Integer.valueOf(index);
            if (index <= cVar.A) {
                valueOf = null;
            }
            if (valueOf != null) {
                cVar.A = valueOf.intValue();
            }
        }
        pVar.setValue(cr.a.a(new nm0.j(liveEcgData, signalMeta), new o(cVar)));
    }

    public static final a y0(c cVar, SignalMeta signalMeta) {
        cVar.getClass();
        if (signalMeta != null) {
            cVar.f38651x = System.currentTimeMillis();
            return new a(signalMeta.getDuration() * 5, HeartSignalMeasurementKt.computedGain(signalMeta));
        }
        return null;
    }

    public static final void z0(c cVar, Boolean bool) {
        cVar.getClass();
        boolean e11 = kotlin.jvm.internal.u.e(bool, Boolean.TRUE);
        p0 p0Var = cVar.f38648u;
        Handler handler = cVar.f38635h;
        if (e11) {
            handler.post(p0Var);
        } else {
            handler.removeCallbacks(p0Var);
        }
    }

    public final xw.f F0() {
        return this.f38643p;
    }

    public final xw.p<SignalMeta, LiveEcgData, k0> G0() {
        return this.f38640m;
    }

    public final androidx.lifecycle.j0 K0() {
        return this.f38641n;
    }

    public final LiveData<Integer> M0() {
        return this.f38639l;
    }

    public final androidx.lifecycle.f O0() {
        return this.f38645r;
    }

    public final androidx.lifecycle.k0<Boolean> R0() {
        return this.f38642o;
    }

    public final androidx.lifecycle.k0<Boolean> T0() {
        return this.f38644q;
    }

    public final s U0() {
        return this.f38636i;
    }

    public final androidx.lifecycle.k0<Boolean> V0() {
        return this.f38646s;
    }

    public final void W0() {
        X0();
        Y0();
        xw.p<SignalMeta, LiveEcgData, k0> pVar = this.f38640m;
        Long l5 = null;
        pVar.setValue(null);
        pVar.observeForever(this.M);
        this.f38642o.setValue(Boolean.FALSE);
        androidx.lifecycle.j0 j0Var = this.f38638k;
        this.f38643p.setValue(j0Var.getValue());
        androidx.lifecycle.k0<Long> k0Var = this.f38650w;
        Long l6 = (Long) j0Var.getValue();
        if (l6 != null) {
            l5 = Long.valueOf(l6.longValue() + 15);
        }
        k0Var.setValue(l5);
    }

    public final void X0() {
        this.f38634g.removeCallbacks(this.f38647t);
    }

    public final void Y0() {
        this.f38635h.removeCallbacks(this.f38648u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f38640m.removeObserver(this.M);
        d dVar = new d(new b(this));
        androidx.lifecycle.k0<Boolean> k0Var = this.f38642o;
        k0Var.removeObserver(dVar);
        k0Var.removeObserver(new d(new C0506c(this)));
    }
}
