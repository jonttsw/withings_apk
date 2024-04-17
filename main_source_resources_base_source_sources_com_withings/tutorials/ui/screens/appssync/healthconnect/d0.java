package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.f5;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.g;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.o1;
import x1.b;
import x1.d;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f44916a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44917a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f44918a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f44919a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f44920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44922c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f44923d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44924e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f44925f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44926g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f44927h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q60.a f44928i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e.n<Intent, ActivityResult> f44929j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ch.d f44930k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, r8.n nVar, ym0.a<nm0.y> aVar3, Context context, ym0.a<nm0.y> aVar4, k1.r0<Boolean> r0Var, q60.a aVar5, e.n<Intent, ActivityResult> nVar2, ch.d dVar) {
            super(2);
            this.f44920a = z5;
            this.f44921b = aVar;
            this.f44922c = aVar2;
            this.f44923d = nVar;
            this.f44924e = aVar3;
            this.f44925f = context;
            this.f44926g = aVar4;
            this.f44927h = r0Var;
            this.f44928i = aVar5;
            this.f44929j = nVar2;
            this.f44930k = dVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "loading", null, null, null, null, null, null, com.withings.tutorials.ui.screens.appssync.healthconnect.a.f44886a, 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "intro", null, null, null, null, null, null, new s1.a(true, 483378437, new i0(this.f44923d, this.f44921b, this.f44922c, this.f44924e, this.f44920a)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "permissionsFromHealthConnect", null, null, null, null, null, null, new s1.a(true, 63259492, new n0(this.f44921b, this.f44925f, this.f44926g, this.f44927h, this.f44928i, this.f44929j, this.f44930k)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "permissionsFromWithings", null, null, null, null, null, null, new s1.a(true, -356859453, new s0(this.f44921b, this.f44925f, this.f44926g, this.f44927h, this.f44928i, this.f44929j, this.f44930k)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "complete", null, null, null, null, null, null, new s1.a(true, -776978398, new v0(this.f44921b, this.f44922c, this.f44928i, this.f44925f, this.f44929j)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f44931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f44932b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q60.a f44933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ch.d f44934d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44935e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44936f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44937g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44938h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f44939i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f44940j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r8.n nVar, boolean z5, q60.a aVar, ch.d dVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, int i11, int i12) {
            super(2);
            this.f44931a = nVar;
            this.f44932b = z5;
            this.f44933c = aVar;
            this.f44934d = dVar;
            this.f44935e = aVar2;
            this.f44936f = aVar3;
            this.f44937g = aVar4;
            this.f44938h = aVar5;
            this.f44939i = i11;
            this.f44940j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44939i | 1);
            ym0.a<nm0.y> aVar2 = this.f44937g;
            ym0.a<nm0.y> aVar3 = this.f44938h;
            d0.b(this.f44931a, this.f44932b, this.f44933c, this.f44934d, this.f44935e, this.f44936f, aVar2, aVar3, aVar, g11, this.f44940j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnectScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f44941a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(r8.n nVar) {
            super(1);
            this.f44941a = nVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            kotlin.jvm.internal.u.j(it, "it");
            androidx.navigation.e.L(this.f44941a, "complete", null, 6);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r18, int r19, androidx.compose.runtime.a r20, java.lang.String r21, ym0.a r22, ym0.a r23) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.appssync.healthconnect.d0.a(int, int, androidx.compose.runtime.a, java.lang.String, ym0.a, ym0.a):void");
    }

    public static final void b(r8.n navController, boolean z5, q60.a getHealthConnectPermissionsIntentUseCase, ch.d intentBuilder, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, androidx.compose.runtime.a aVar5, int i11, int i12) {
        a aVar6;
        b bVar;
        c cVar;
        d dVar;
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(getHealthConnectPermissionsIntentUseCase, "getHealthConnectPermissionsIntentUseCase");
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        androidx.compose.runtime.b g11 = aVar5.g(651747236);
        if ((i12 & 16) != 0) {
            aVar6 = a.f44916a;
        } else {
            aVar6 = aVar;
        }
        if ((i12 & 32) != 0) {
            bVar = b.f44917a;
        } else {
            bVar = aVar2;
        }
        if ((i12 & 64) != 0) {
            cVar = c.f44918a;
        } else {
            cVar = aVar3;
        }
        if ((i12 & 128) != 0) {
            dVar = d.f44919a;
        } else {
            dVar = aVar4;
        }
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        g11.s(764355263);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        g11.J();
        b70.t0.b(navController, "intro", new e(z5, bVar, cVar, navController, aVar6, context, dVar, (k1.r0) t11, getHealthConnectPermissionsIntentUseCase, e.d.a(new g.a(), new g(navController), g11, 8), intentBuilder), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(navController, z5, getHealthConnectPermissionsIntentUseCase, intentBuilder, aVar6, bVar, cVar, dVar, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r16, int r17, androidx.compose.runtime.a r18, ym0.a r19, ym0.p r20) {
        /*
            r0 = r16
            r1 = r17
            r13 = r20
            r2 = 695916732(0x297ad8bc, float:5.569914E-14)
            r3 = r18
            androidx.compose.runtime.b r14 = r3.g(r2)
            r2 = r1 & 1
            if (r2 == 0) goto L16
            r2 = r0 | 6
            goto L26
        L16:
            r2 = r0 & 14
            if (r2 != 0) goto L25
            boolean r2 = r14.w(r13)
            if (r2 == 0) goto L22
            r2 = 4
            goto L23
        L22:
            r2 = 2
        L23:
            r2 = r2 | r0
            goto L26
        L25:
            r2 = r0
        L26:
            r3 = r1 & 2
            if (r3 == 0) goto L2f
            r2 = r2 | 48
        L2c:
            r4 = r19
            goto L41
        L2f:
            r4 = r0 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L2c
            r4 = r19
            boolean r5 = r14.w(r4)
            if (r5 == 0) goto L3e
            r5 = 32
            goto L40
        L3e:
            r5 = 16
        L40:
            r2 = r2 | r5
        L41:
            r5 = r2 & 91
            r6 = 18
            if (r5 != r6) goto L53
            boolean r5 = r14.h()
            if (r5 != 0) goto L4e
            goto L53
        L4e:
            r14.C()
            r15 = r4
            goto L86
        L53:
            if (r3 == 0) goto L59
            com.withings.tutorials.ui.screens.appssync.healthconnect.q r3 = com.withings.tutorials.ui.screens.appssync.healthconnect.q.f45015a
            r15 = r3
            goto L5a
        L59:
            r15 = r4
        L5a:
            r3 = 2132019304(0x7f140868, float:1.967694E38)
            java.lang.String r3 = ay.b.u(r3, r14)
            r4 = 2131231468(0x7f0802ec, float:1.8079018E38)
            g2.c r4 = s2.d.a(r4, r14)
            s1.a r9 = com.withings.tutorials.ui.screens.appssync.healthconnect.a.f44889d
            int r5 = r2 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r6 = 12582976(0xc00040, float:1.7632505E-38)
            r5 = r5 | r6
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r11 = r5 | r2
            r6 = 0
            r12 = 112(0x70, float:1.57E-43)
            r7 = 0
            r8 = 0
            r2 = r3
            r3 = r4
            r4 = r15
            r5 = r20
            r10 = r14
            b70.t0.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L86:
            androidx.compose.runtime.v r2 = r14.o0()
            if (r2 == 0) goto L94
            com.withings.tutorials.ui.screens.appssync.healthconnect.r r3 = new com.withings.tutorials.ui.screens.appssync.healthconnect.r
            r3.<init>(r0, r1, r15, r13)
            r2.G(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.appssync.healthconnect.d0.d(int, int, androidx.compose.runtime.a, ym0.a, ym0.p):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r19, int r20, androidx.compose.runtime.a r21, ym0.a r22, ym0.a r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = -1836066225(0xffffffff928fda4f, float:-9.078386E-28)
            r3 = r21
            androidx.compose.runtime.b r2 = r3.g(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L17
            r4 = r0 | 6
            r5 = r4
            r4 = r22
            goto L2b
        L17:
            r4 = r0 & 14
            if (r4 != 0) goto L28
            r4 = r22
            boolean r5 = r2.w(r4)
            if (r5 == 0) goto L25
            r5 = 4
            goto L26
        L25:
            r5 = 2
        L26:
            r5 = r5 | r0
            goto L2b
        L28:
            r4 = r22
            r5 = r0
        L2b:
            r6 = r1 & 2
            if (r6 == 0) goto L35
            r5 = r5 | 48
        L31:
            r7 = r23
        L33:
            r14 = r5
            goto L48
        L35:
            r7 = r0 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L31
            r7 = r23
            boolean r8 = r2.w(r7)
            if (r8 == 0) goto L44
            r8 = 32
            goto L46
        L44:
            r8 = 16
        L46:
            r5 = r5 | r8
            goto L33
        L48:
            r5 = r14 & 91
            r15 = 18
            if (r5 != r15) goto L59
            boolean r5 = r2.h()
            if (r5 != 0) goto L55
            goto L59
        L55:
            r2.C()
            goto La1
        L59:
            if (r3 == 0) goto L60
            com.withings.tutorials.ui.screens.appssync.healthconnect.s r3 = com.withings.tutorials.ui.screens.appssync.healthconnect.s.f45028a
            r16 = r3
            goto L62
        L60:
            r16 = r4
        L62:
            if (r6 == 0) goto L69
            com.withings.tutorials.ui.screens.appssync.healthconnect.t r3 = com.withings.tutorials.ui.screens.appssync.healthconnect.t.f45036a
            r17 = r3
            goto L6b
        L69:
            r17 = r7
        L6b:
            r3 = 2132017639(0x7f1401e7, float:1.9673562E38)
            java.lang.String r4 = ay.b.u(r3, r2)
            com.withings.common.compose.component.ColorStyle r7 = com.withings.common.compose.component.ColorStyle.f33322a
            int r3 = r14 << 21
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r18
            r12 = r3 | 24576(0x6000, float:3.4438E-41)
            r6 = 0
            r13 = 109(0x6d, float:1.53E-43)
            r3 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = r16
            r11 = r2
            com.withings.common.compose.component.l.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 2132018686(0x7f1405fe, float:1.9675686E38)
            java.lang.String r4 = ay.b.u(r3, r2)
            int r3 = r14 << 18
            r12 = r3 & r18
            r7 = 0
            r13 = 125(0x7d, float:1.75E-43)
            r3 = 0
            r10 = r17
            com.withings.common.compose.component.l.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r16
            r7 = r17
        La1:
            androidx.compose.runtime.v r2 = r2.o0()
            if (r2 == 0) goto Laf
            com.withings.tutorials.ui.screens.appssync.healthconnect.u r3 = new com.withings.tutorials.ui.screens.appssync.healthconnect.u
            r3.<init>(r0, r1, r4, r7)
            r2.G(r3)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.appssync.healthconnect.d0.e(int, int, androidx.compose.runtime.a, ym0.a, ym0.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(ym0.p r17, ym0.a r18, ym0.a r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.appssync.healthconnect.d0.f(ym0.p, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(ym0.p r17, ym0.a r18, ym0.a r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.appssync.healthconnect.d0.g(ym0.p, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void h(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a aVar2, ym0.a aVar3) {
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(1880524238);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.w(aVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(aVar3)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            if (i16 != 0) {
                aVar2 = w0.f45055a;
            }
            if (i17 != 0) {
                aVar3 = x0.f45057a;
            }
            int i18 = i13 << 3;
            a((i18 & 112) | (i18 & ConstantsWs.HWFAILURE_ZERO), 0, g11, ay.b.u(C1987R.string._ACTIVATE_, g11), aVar2, aVar3);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new y0(i11, i12, aVar2, aVar3));
        }
    }

    public static final void i(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a aVar2, ym0.p pVar) {
        ym0.a aVar3;
        int i13;
        int i14;
        int i15;
        z0 z0Var;
        androidx.compose.runtime.b g11 = aVar.g(-1101082522);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            aVar3 = aVar2;
        } else if ((i11 & 14) == 0) {
            aVar3 = aVar2;
            if (g11.w(aVar3)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            aVar3 = aVar2;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
            z0Var = aVar3;
        } else {
            if (i16 != 0) {
                z0Var = z0.f45068a;
            } else {
                z0Var = aVar3;
            }
            int i17 = i13 << 6;
            b70.t0.c(ay.b.u(C1987R.string.healthConnect_signupPromptTitle, g11), s2.d.a(2131231541, g11), z0Var, pVar, null, 0.0f, null, com.withings.tutorials.ui.screens.appssync.healthconnect.a.f44887b, g11, (i17 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i17 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a1(i11, i12, z0Var, pVar));
        }
    }

    public static final void j(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a aVar2, ym0.a aVar3) {
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(1258729400);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.w(aVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(aVar3)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            if (i16 != 0) {
                aVar2 = b1.f44906a;
            }
            if (i17 != 0) {
                aVar3 = c1.f44913a;
            }
            int i18 = i13 << 3;
            a((i18 & 112) | (i18 & ConstantsWs.HWFAILURE_ZERO), 0, g11, ay.b.u(C1987R.string._WTA_AUTHORIZE_HEALTH_TITLE_UPDATE_, g11), aVar2, aVar3);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d1(i11, i12, aVar2, aVar3));
        }
    }

    public static final void k(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a aVar2, ym0.p pVar) {
        ym0.a aVar3;
        int i13;
        int i14;
        int i15;
        e1 e1Var;
        androidx.compose.runtime.b g11 = aVar.g(-1487955524);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            aVar3 = aVar2;
        } else if ((i11 & 14) == 0) {
            aVar3 = aVar2;
            if (g11.w(aVar3)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            aVar3 = aVar2;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
            e1Var = aVar3;
        } else {
            if (i16 != 0) {
                e1Var = e1.f44948a;
            } else {
                e1Var = aVar3;
            }
            int i17 = i13 << 6;
            b70.t0.c(ay.b.u(C1987R.string.googleHealthPlatform_description, g11), s2.d.a(2131231541, g11), e1Var, pVar, null, 0.0f, null, com.withings.tutorials.ui.screens.appssync.healthconnect.a.f44888c, g11, (i17 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i17 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f1(i11, i12, e1Var, pVar));
        }
    }

    public static final void l(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(677626043);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
            e.b b10 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(b10, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g1(i11));
        }
    }

    public static final void m(Context context, ym0.a aVar, o1 o1Var, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(-216152352);
        String str = context.getString(C1987R.string.not_available) + ": " + context.getString(C1987R.string._DOWNLOAD_APP_) + " " + context.getString(C1987R.string.googleHealthPlatform_title);
        if (((Boolean) o1Var.getValue()).booleanValue()) {
            wk.p.a(aVar2, null, str, ay.b.u(C1987R.string._OK_, g11), 0L, aVar, null, 0L, null, g11, ((i11 >> 9) & 14) | ((i11 << 12) & 458752), 466);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h1(context, aVar, o1Var, aVar2, i11));
        }
    }

    public static final void n(Context context, ch.d dVar) {
        ch.l t11 = dVar.t();
        String string = context.getString(C1987R.string.google_health_connect_disclosure_learn_more_url);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        context.startActivity(ch.l.a(t11, context, null, null, string, new HMWebViewDelegate(), 6));
    }
}
