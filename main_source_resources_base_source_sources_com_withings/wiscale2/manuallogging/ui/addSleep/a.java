package com.withings.wiscale2.manuallogging.ui.addSleep;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import androidx.compose.material.t5;
import androidx.compose.material.v;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.google.protobuf.t;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.s1;
import com.withings.common.compose.component.v4;
import com.withings.features.FeatureFlag;
import com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import d2.h1;
import i6.a;
import java.util.List;
import k1.o1;
import k1.r0;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import n0.y0;
import nk.a0;
import nm0.y;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: AddLogSleepScreen.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddLogSleepScreen.kt */
    /* renamed from: com.withings.wiscale2.manuallogging.ui.addSleep.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0752a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f58032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0752a(ym0.a<y> aVar) {
            super(2);
            this.f58032a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.a(((i1) aVar2.D(j1.e())).O(), 0L, null, false, f1.b.a(), null, null, null, false, this.f58032a, aVar2, 0, 494);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddLogSleepScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<SaveManualLogButtonStatus> f58034b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddMoodViewModel f58035c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<Long, Long, y> f58036d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58037e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58038f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, o1<? extends SaveManualLogButtonStatus> o1Var, AddMoodViewModel addMoodViewModel, p<? super Long, ? super Long, y> pVar, r0<Long> r0Var, r0<Long> r0Var2) {
            super(2);
            this.f58033a = str;
            this.f58034b = o1Var;
            this.f58035c = addMoodViewModel;
            this.f58036d = pVar;
            this.f58037e = r0Var;
            this.f58038f = r0Var2;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            SaveManualLogButtonStatus value;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._SAVE_BUTTON_, aVar2);
                String str = this.f58033a;
                if (str != null && !dp0.j.D(str)) {
                    value = SaveManualLogButtonStatus.f41667a;
                } else {
                    value = this.f58034b.getValue();
                }
                wx.b.a(u11, new com.withings.wiscale2.manuallogging.ui.addSleep.b(this.f58035c, this.f58036d, this.f58037e, this.f58038f), value, aVar2, 0);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddLogSleepScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<Track> f58039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<Long, Long, y> f58042d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f58043e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AddMoodViewModel f58044f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r0<Integer> f58045g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Track, y> f58046h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<Track> list, r0<Long> r0Var, r0<Long> r0Var2, p<? super Long, ? super Long, y> pVar, String str, AddMoodViewModel addMoodViewModel, r0<Integer> r0Var3, ym0.l<? super Track, y> lVar) {
            super(3);
            this.f58039a = list;
            this.f58040b = r0Var;
            this.f58041c = r0Var2;
            this.f58042d = pVar;
            this.f58043e = str;
            this.f58044f = addMoodViewModel;
            this.f58045g = r0Var3;
            this.f58046h = lVar;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e b10;
            e.a aVar2;
            List<Track> list;
            boolean z5;
            int i11;
            r0.w innerPadding = wVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            u.j(innerPadding, "innerPadding");
            if ((intValue & 14) == 0) {
                if (aVar3.K(innerPadding)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar3.h()) {
                aVar3.C();
            } else {
                e.a aVar4 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e c11 = y0.c(x0.e(aVar4, innerPadding), y0.b(aVar3), false, 14);
                aVar3.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar3, -1323940314);
                int G = aVar3.G();
                v0 l5 = aVar3.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(c11);
                if (aVar3.i() instanceof k1.d) {
                    aVar3.A();
                    if (aVar3.e()) {
                        aVar3.F(a12);
                    } else {
                        aVar3.m();
                    }
                    p c13 = t.c(aVar3, a11, aVar3, l5);
                    if (aVar3.e() || !u.e(aVar3.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar3, G, c13);
                    }
                    r.c(0, c12, k1.j1.a(aVar3), aVar3, 2058660585);
                    r0.i iVar = r0.i.f94242a;
                    b10 = androidx.compose.foundation.c.b(e1.e(aVar4, 1.0f), ((i1) aVar3.D(j1.e())).O(), h1.a());
                    androidx.compose.ui.e j5 = x0.j(b10, 0.0f, 0.0f, 0.0f, yk.h.B(), 7);
                    l0 b11 = defpackage.c.b(aVar3, 733328855, false, aVar3, -1323940314);
                    int G2 = aVar3.G();
                    v0 l6 = aVar3.l();
                    ym0.a a13 = g.a.a();
                    s1.a c14 = androidx.compose.ui.layout.y.c(j5);
                    if (aVar3.i() instanceof k1.d) {
                        aVar3.A();
                        if (aVar3.e()) {
                            aVar3.F(a13);
                        } else {
                            aVar3.m();
                        }
                        p c15 = t.c(aVar3, b11, aVar3, l6);
                        if (aVar3.e() || !u.e(aVar3.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar3, G2, c15);
                        }
                        r.c(0, c14, k1.j1.a(aVar3), aVar3, 2058660585);
                        v4.a(null, ay.b.u(C1987R.string.manualLogging_sleepLogScreen_title, aVar3), null, null, null, 0.0f, 0.0f, 0, 0, 0, aVar3, 0, 1021);
                        defpackage.d.j(aVar3);
                        b2.a(0.0f, 0.0f, 0, 15, 0L, aVar3, null);
                        androidx.compose.ui.e h11 = x0.h(e1.e(aVar4, 1.0f), yk.h.o(), 0.0f, 2);
                        aVar3.s(-483455358);
                        l0 a14 = v.a(androidx.compose.foundation.layout.e.h(), aVar3, -1323940314);
                        int G3 = aVar3.G();
                        v0 l11 = aVar3.l();
                        ym0.a a15 = g.a.a();
                        s1.a c16 = androidx.compose.ui.layout.y.c(h11);
                        if (aVar3.i() instanceof k1.d) {
                            aVar3.A();
                            if (aVar3.e()) {
                                aVar3.F(a15);
                            } else {
                                aVar3.m();
                            }
                            p c17 = t.c(aVar3, a14, aVar3, l11);
                            if (aVar3.e() || !u.e(aVar3.t(), Integer.valueOf(G3))) {
                                l0.q.a(G3, aVar3, G3, c17);
                            }
                            r.c(0, c16, k1.j1.a(aVar3), aVar3, 2058660585);
                            a0.g(0, 0, 28, 0L, aVar3, x0.h(aVar4, 0.0f, yk.h.B(), 1), null, ay.b.u(C1987R.string._DURATION_, aVar3));
                            aVar3.s(-1362669022);
                            p<Long, Long, y> pVar = this.f58042d;
                            boolean K = aVar3.K(pVar);
                            Object t11 = aVar3.t();
                            if (K || t11 == a.C0060a.a()) {
                                t11 = new com.withings.wiscale2.manuallogging.ui.addSleep.c(pVar);
                                aVar3.n(t11);
                            }
                            aVar3.J();
                            r0<Long> r0Var = this.f58040b;
                            r0<Long> r0Var2 = this.f58041c;
                            String str = this.f58043e;
                            fk.u.a(r0Var, r0Var2, (p) t11, str, aVar3, 0);
                            aVar3.s(889227066);
                            if (wr.b.c(FeatureFlag.f39130s0)) {
                                aVar3.s(-483455358);
                                l0 a16 = v.a(androidx.compose.foundation.layout.e.h(), aVar3, -1323940314);
                                int G4 = aVar3.G();
                                v0 l12 = aVar3.l();
                                ym0.a a17 = g.a.a();
                                s1.a c18 = androidx.compose.ui.layout.y.c(aVar4);
                                if (aVar3.i() instanceof k1.d) {
                                    aVar3.A();
                                    if (aVar3.e()) {
                                        aVar3.F(a17);
                                    } else {
                                        aVar3.m();
                                    }
                                    p c19 = t.c(aVar3, a16, aVar3, l12);
                                    if (aVar3.e() || !u.e(aVar3.t(), Integer.valueOf(G4))) {
                                        l0.q.a(G4, aVar3, G4, c19);
                                    }
                                    r.c(0, c18, k1.j1.a(aVar3), aVar3, 2058660585);
                                    if (str != null && !dp0.j.D(str)) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    l0.g.c(iVar, z5, null, null, null, null, n.f58073a, aVar3, 1572870, 30);
                                    aVar3.s(-1362668349);
                                    if (str != null && !dp0.j.D(str)) {
                                        aVar2 = aVar4;
                                    } else {
                                        AddMoodViewModel addMoodViewModel = this.f58044f;
                                        addMoodViewModel.getClass();
                                        aVar2 = aVar4;
                                        s1.a(null, AddMoodViewModel.j0(), this.f58045g.getValue(), 0.0f, false, 0L, 0L, new com.withings.wiscale2.manuallogging.ui.addSleep.d(addMoodViewModel), aVar3, 64, 121);
                                    }
                                    v.b(aVar3);
                                } else {
                                    a3.g.s();
                                    throw null;
                                }
                            } else {
                                aVar2 = aVar4;
                            }
                            v.b(aVar3);
                            l0.g.c(iVar, !list.isEmpty(), null, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(null, 3), null, s1.b.b(aVar3, 1470949651, new e(this.f58039a, this.f58046h)), aVar3, 1600518, 18);
                            d0.a(x0.j(e1.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, yk.h.c(), 7), aVar3);
                            aVar3.J();
                            aVar3.o();
                            aVar3.J();
                            aVar3.J();
                        } else {
                            a3.g.s();
                            throw null;
                        }
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddLogSleepScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f58047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<Long, Long, y> f58048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<Track> f58050d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58051e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0<Long> f58052f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<Long, Long, y> f58053g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Track, y> f58054h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ AddMoodViewModel f58055i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58056j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f58057k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.a<y> aVar, p<? super Long, ? super Long, y> pVar, String str, List<Track> list, r0<Long> r0Var, r0<Long> r0Var2, p<? super Long, ? super Long, y> pVar2, ym0.l<? super Track, y> lVar, AddMoodViewModel addMoodViewModel, int i11, int i12) {
            super(2);
            this.f58047a = aVar;
            this.f58048b = pVar;
            this.f58049c = str;
            this.f58050d = list;
            this.f58051e = r0Var;
            this.f58052f = r0Var2;
            this.f58053g = pVar2;
            this.f58054h = lVar;
            this.f58055i = addMoodViewModel;
            this.f58056j = i11;
            this.f58057k = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f58056j | 1);
            ym0.l<Track, y> lVar = this.f58054h;
            AddMoodViewModel addMoodViewModel = this.f58055i;
            a.a(this.f58047a, this.f58048b, this.f58049c, this.f58050d, this.f58051e, this.f58052f, this.f58053g, lVar, addMoodViewModel, aVar, g11, this.f58057k);
            return y.f85009a;
        }
    }

    public static final void a(ym0.a<y> onBackClick, p<? super Long, ? super Long, y> onSaveClick, String str, List<Track> listExistingSleepTracks, r0<Long> startDate, r0<Long> endDate, p<? super Long, ? super Long, y> onIntervalChanged, ym0.l<? super Track, y> onSleepHistoryItemClick, AddMoodViewModel addMoodViewModel, androidx.compose.runtime.a aVar, int i11, int i12) {
        String str2;
        AddMoodViewModel addMoodViewModel2;
        i6.a aVar2;
        u.j(onBackClick, "onBackClick");
        u.j(onSaveClick, "onSaveClick");
        u.j(listExistingSleepTracks, "listExistingSleepTracks");
        u.j(startDate, "startDate");
        u.j(endDate, "endDate");
        u.j(onIntervalChanged, "onIntervalChanged");
        u.j(onSleepHistoryItemClick, "onSleepHistoryItemClick");
        androidx.compose.runtime.b g11 = aVar.g(-1038472441);
        if ((i12 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 256) != 0) {
            g11.s(1890788296);
            n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(AddMoodViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                addMoodViewModel2 = (AddMoodViewModel) a13;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            addMoodViewModel2 = addMoodViewModel;
        }
        g11.s(-772429066);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = addMoodViewModel2.m0();
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        Object a14 = com.huawei.hms.health.a.a(g11, -772428995);
        if (a14 == a.C0060a.a()) {
            a14 = addMoodViewModel2.k0();
            g11.n(a14);
        }
        g11.J();
        t5.b(null, null, s1.b.b(g11, -1375945204, new C0752a(onBackClick)), s1.b.b(g11, 770621261, new b(str2, (o1) a14, addMoodViewModel2, onSaveClick, startDate, endDate)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -96876219, new c(listExistingSleepTracks, startDate, endDate, onIntervalChanged, str2, addMoodViewModel2, r0Var, onSleepHistoryItemClick)), g11, 3456, 12582912, 131059);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(onBackClick, onSaveClick, str2, listExistingSleepTracks, startDate, endDate, onIntervalChanged, onSleepHistoryItemClick, addMoodViewModel2, i11, i12));
        }
    }
}
