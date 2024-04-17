package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: RegisterCycleLogAnalytics.kt */
/* loaded from: classes4.dex */
public final class t4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegisterCycleLogAnalytics.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.e f41231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.navigation.e eVar, String str, int i11) {
            super(2);
            this.f41231a = eVar;
            this.f41232b = str;
            this.f41233c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41233c | 1);
            t4.a(this.f41231a, this.f41232b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (kotlin.jvm.internal.u.e(r1, com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40744c.a()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.navigation.e r4, java.lang.String r5, androidx.compose.runtime.a r6, int r7) {
        /*
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.u.j(r4, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.u.j(r5, r0)
            r1 = -380180710(0xffffffffe956e71a, float:-1.6237592E25)
            androidx.compose.runtime.b r6 = r6.g(r1)
            k1.r0 r1 = androidx.navigation.compose.r.b(r4, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.navigation.d r1 = (androidx.navigation.d) r1
            if (r1 == 0) goto L96
            androidx.navigation.t r1 = r1.d()
            java.lang.String r1 = r1.v()
            java.lang.String r2 = ""
            if (r1 != 0) goto L2a
            r1 = r2
        L2a:
            int r3 = v70.a.f103433b
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40745d
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.u.e(r1, r3)
            if (r3 == 0) goto L3b
            java.lang.String r2 = "_period"
            goto L83
        L3b:
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40746e
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.u.e(r1, r3)
            if (r3 == 0) goto L4a
            java.lang.String r2 = "_vaginal_discharge"
            goto L83
        L4a:
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40747f
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.u.e(r1, r3)
            if (r3 == 0) goto L59
            java.lang.String r2 = "_mood"
            goto L83
        L59:
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40749h
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.u.e(r1, r3)
            if (r3 == 0) goto L68
            java.lang.String r2 = "_symptoms"
            goto L83
        L68:
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40748g
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.u.e(r1, r3)
            if (r3 == 0) goto L77
            java.lang.String r2 = "_sexual_activity"
            goto L83
        L77:
            com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations r3 = com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations.f40744c
            java.lang.String r3 = r3.a()
            boolean r1 = kotlin.jvm.internal.u.e(r1, r3)
            if (r1 == 0) goto L96
        L83:
            java.lang.String r1 = "cycle_log_view"
            java.lang.String r1 = r1.concat(r2)
            nm0.j r2 = new nm0.j
            r2.<init>(r0, r5)
            java.util.Map r0 = kotlin.collections.s0.i(r2)
            r2 = 2
            v70.a.c(r1, r0, r2)
        L96:
            androidx.compose.runtime.v r6 = r6.o0()
            if (r6 == 0) goto La4
            com.withings.manualLogging.ui.feature.addNote.cycle.t4$a r0 = new com.withings.manualLogging.ui.feature.addNote.cycle.t4$a
            r0.<init>(r4, r5, r7)
            r6.G(r0)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.t4.a(androidx.navigation.e, java.lang.String, androidx.compose.runtime.a, int):void");
    }
}
