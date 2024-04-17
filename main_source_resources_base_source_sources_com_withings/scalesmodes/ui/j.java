package com.withings.scalesmodes.ui;

import ah.o;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.c0;
import androidx.compose.material3.d1;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.material3.ka;
import androidx.compose.material3.z4;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.scalesmodes.core.ScalesModes;
import com.withings.wiscale2.C1987R;
import d2.h1;
import dq.x;
import java.util.List;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.d0;
import ym0.p;
import ym0.q;
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
public final class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar) {
            super(2);
            this.f43939a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                z4.b(this.f43939a, null, false, null, null, com.withings.scalesmodes.ui.a.f43920a, aVar2, 196608, 30);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<com.withings.scalesmodes.ui.c> f43940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<ScalesModes, Boolean, y> f43941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar, List list) {
            super(3);
            this.f43940a = list;
            this.f43941b = pVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ScalesModesScaffold = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(ScalesModesScaffold, "$this$ScalesModesScaffold");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.modes_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                d0.a(e1.f(aVar3, 20), aVar2);
                List<com.withings.scalesmodes.ui.c> list = this.f43940a;
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    d1.a(e1.e(aVar3, 1.0f), null, null, null, null, s1.b.b(aVar2, -1085305089, new l(this.f43941b, list)), aVar2, 196614, 30);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<com.withings.scalesmodes.ui.c> f43943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<ScalesModes, Boolean, y> f43944c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.a<y> aVar, List<? extends com.withings.scalesmodes.ui.c> list, p<? super ScalesModes, ? super Boolean, y> pVar, int i11) {
            super(2);
            this.f43942a = aVar;
            this.f43943b = list;
            this.f43944c = pVar;
            this.f43945d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43945d | 1);
            List<com.withings.scalesmodes.ui.c> list = this.f43943b;
            p<ScalesModes, Boolean, y> pVar = this.f43944c;
            j.a(this.f43942a, list, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.a, Integer, y> f43946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.a, Integer, y> f43947b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<r0.h, androidx.compose.runtime.a, Integer, y> f43948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar2, q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, y> qVar, int i11) {
            super(2);
            this.f43946a = pVar;
            this.f43947b = pVar2;
            this.f43948c = qVar;
            this.f43949d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43949d | 1);
            p<androidx.compose.runtime.a, Integer, y> pVar = this.f43947b;
            q<r0.h, androidx.compose.runtime.a, Integer, y> qVar = this.f43948c;
            j.b(this.f43946a, pVar, qVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements p<ScalesModes, Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f43950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScalesModeViewModel f43951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, ScalesModeViewModel scalesModeViewModel) {
            super(2);
            this.f43950a = context;
            this.f43951b = scalesModeViewModel;
        }

        @Override // ym0.p
        public final y invoke(ScalesModes scalesModes, Boolean bool) {
            ScalesModes scaleModeSelected = scalesModes;
            boolean booleanValue = bool.booleanValue();
            u.j(scaleModeSelected, "scaleModeSelected");
            int ordinal = scaleModeSelected.ordinal();
            Context context = this.f43950a;
            ScalesModeViewModel scalesModeViewModel = this.f43951b;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            ch.e mode = scalesModeViewModel.g0().getMode();
                            long j02 = scalesModeViewModel.j0();
                            long id2 = scalesModeViewModel.f0().getId();
                            ((ah.u) mode).getClass();
                            u.j(context, "context");
                            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedModeActivity").putExtra("device_id", id2).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j02).putExtra("feature_activated", booleanValue);
                            u.i(putExtra, "putExtra(...)");
                            context.startActivity(putExtra);
                        }
                    } else {
                        ch.e mode2 = scalesModeViewModel.g0().getMode();
                        long j03 = scalesModeViewModel.j0();
                        long id3 = scalesModeViewModel.f0().getId();
                        ((ah.u) mode2).getClass();
                        u.j(context, "context");
                        Intent putExtra2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerModeActivity").putExtra("device_id", id3).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j03).putExtra("feature_activated", booleanValue);
                        u.i(putExtra2, "putExtra(...)");
                        context.startActivity(putExtra2);
                    }
                } else {
                    context.startActivity(ch.e.a(scalesModeViewModel.g0().getMode(), this.f43950a, scalesModeViewModel.j0(), Long.valueOf(scalesModeViewModel.f0().getId()), 8));
                }
            } else {
                ch.e mode3 = scalesModeViewModel.g0().getMode();
                long j04 = scalesModeViewModel.j0();
                long id4 = scalesModeViewModel.f0().getId();
                ((ah.u) mode3).getClass();
                u.j(context, "context");
                Intent putExtra3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.tutorials.ui.screens.modes.athlete.AthleteModeActivity").putExtra("device_id", id4).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j04).putExtra("feature_activated", booleanValue);
                u.i(putExtra3, "putExtra(...)");
                context.startActivity(putExtra3);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScalesModeViewModel f43953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar, ScalesModeViewModel scalesModeViewModel, int i11, int i12) {
            super(2);
            this.f43952a = aVar;
            this.f43953b = scalesModeViewModel;
            this.f43954c = i11;
            this.f43955d = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43954c | 1);
            j.c(this.f43952a, this.f43953b, aVar, g11, this.f43955d);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym0.a<y> aVar, List<? extends com.withings.scalesmodes.ui.c> list, p<? super ScalesModes, ? super Boolean, y> pVar, androidx.compose.runtime.a aVar2, int i11) {
        androidx.compose.runtime.b g11 = aVar2.g(-945839780);
        b(s1.b.b(g11, -1978413682, new a(aVar)), com.withings.scalesmodes.ui.a.f43921b, s1.b.b(g11, 437514812, new b(pVar, list)), g11, 438);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(aVar, list, pVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, p<? super androidx.compose.runtime.a, ? super Integer, y> pVar2, q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, y> qVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(1046895090);
        if ((i11 & 14) == 0) {
            if (g11.w(pVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(pVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            b10 = androidx.compose.foundation.c.b(e1.d(aVar2), ((i1) g11.D(j1.e())).a(), h1.a());
            g11.s(-483455358);
            l0 b11 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(b10);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b12 = com.withings.authentication.e.b(g11, b11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                c11.invoke(k1.j1.a(g11), g11, 0);
                g11.s(2058660585);
                bVar = g11;
                c0.b(pVar2, null, pVar, null, null, ka.b(((i1) g11.D(j1.e())).a(), 0L, ((i1) g11.D(j1.e())).w(), ((i1) g11.D(j1.e())).w(), g11, 18), ka.c(g11), g11, ((i16 >> 3) & 14) | ((i16 << 6) & ConstantsWs.HWFAILURE_ZERO), 26);
                com.withings.common.compose.component.v0.b(0.0f, bVar, 0, 1);
                androidx.compose.ui.e g12 = x0.g(e1.e(aVar2, 1.0f), yk.h.o(), yk.h.y());
                int i17 = (i16 << 3) & 7168;
                bVar.s(-483455358);
                l0 b13 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), bVar, -1323940314);
                int G2 = bVar.G();
                v0 l6 = bVar.l();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(g12);
                if (bVar.i() instanceof k1.d) {
                    bVar.A();
                    if (bVar.e()) {
                        bVar.F(a12);
                    } else {
                        bVar.m();
                    }
                    p b14 = com.withings.authentication.e.b(bVar, b13, bVar, l6);
                    if (bVar.e() || !u.e(bVar.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, bVar, G2, b14);
                    }
                    x.b(0, c12, k1.j1.a(bVar), bVar, 2058660585);
                    qVar.invoke(r0.i.f94242a, bVar, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    bVar.J();
                    bVar.o();
                    bVar.J();
                    bVar.J();
                    bVar.J();
                    bVar.o();
                    bVar.J();
                    bVar.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new d(pVar, pVar2, qVar, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(ym0.a<nm0.y> r7, com.withings.scalesmodes.ui.ScalesModeViewModel r8, androidx.compose.runtime.a r9, int r10, int r11) {
        /*
            java.lang.String r0 = "onBackClick"
            kotlin.jvm.internal.u.j(r7, r0)
            r0 = -1467401925(0xffffffffa889393b, float:-1.5234875E-14)
            androidx.compose.runtime.b r9 = r9.g(r0)
            r0 = r11 & 1
            r1 = 2
            if (r0 == 0) goto L14
            r0 = r10 | 6
            goto L24
        L14:
            r0 = r10 & 14
            if (r0 != 0) goto L23
            boolean r0 = r9.w(r7)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = r1
        L21:
            r0 = r0 | r10
            goto L24
        L23:
            r0 = r10
        L24:
            r2 = r11 & 2
            if (r2 == 0) goto L2a
            r0 = r0 | 16
        L2a:
            if (r2 != r1) goto L3e
            r1 = r0 & 91
            r3 = 18
            if (r1 != r3) goto L3e
            boolean r1 = r9.h()
            if (r1 != 0) goto L39
            goto L3e
        L39:
            r9.C()
            goto Lc0
        L3e:
            r9.M0()
            r1 = r10 & 1
            if (r1 == 0) goto L54
            boolean r1 = r9.v0()
            if (r1 == 0) goto L4c
            goto L54
        L4c:
            r9.C()
            if (r2 == 0) goto L99
        L51:
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            goto L99
        L54:
            if (r2 == 0) goto L99
            r8 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.s(r8)
            androidx.lifecycle.n1 r2 = j6.a.a(r9)
            if (r2 == 0) goto L8d
            fk0.c r4 = e6.a.a(r2, r9)
            r8 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.s(r8)
            boolean r8 = r2 instanceof androidx.lifecycle.u
            if (r8 == 0) goto L79
            r8 = r2
            androidx.lifecycle.u r8 = (androidx.lifecycle.u) r8
            i6.a r8 = r8.getDefaultViewModelCreationExtras()
        L77:
            r5 = r8
            goto L7c
        L79:
            i6.a$a r8 = i6.a.C1058a.f71431b
            goto L77
        L7c:
            java.lang.Class<com.withings.scalesmodes.ui.ScalesModeViewModel> r1 = com.withings.scalesmodes.ui.ScalesModeViewModel.class
            r3 = 0
            r6 = r9
            androidx.lifecycle.g1 r8 = j6.b.a(r1, r2, r3, r4, r5, r6)
            r9.J()
            r9.J()
            com.withings.scalesmodes.ui.ScalesModeViewModel r8 = (com.withings.scalesmodes.ui.ScalesModeViewModel) r8
            goto L51
        L8d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L99:
            r9.l0()
            k1.p1 r1 = androidx.compose.ui.platform.u0.d()
            java.lang.Object r1 = r9.D(r1)
            android.content.Context r1 = (android.content.Context) r1
            kotlinx.coroutines.flow.StateFlow r2 = r8.i0()
            k1.r0 r2 = h6.b.c(r2, r9)
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            com.withings.scalesmodes.ui.j$e r3 = new com.withings.scalesmodes.ui.j$e
            r3.<init>(r1, r8)
            r0 = r0 & 14
            r0 = r0 | 64
            a(r7, r2, r3, r9, r0)
        Lc0:
            androidx.compose.runtime.v r9 = r9.o0()
            if (r9 == 0) goto Lce
            com.withings.scalesmodes.ui.j$f r0 = new com.withings.scalesmodes.ui.j$f
            r0.<init>(r7, r8, r10, r11)
            r9.G(r0)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.scalesmodes.ui.j.c(ym0.a, com.withings.scalesmodes.ui.ScalesModeViewModel, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.withings.scalesmodes.ui.c r22, androidx.compose.ui.e r23, ym0.a r24, androidx.compose.runtime.a r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.scalesmodes.ui.j.d(com.withings.scalesmodes.ui.c, androidx.compose.ui.e, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}
