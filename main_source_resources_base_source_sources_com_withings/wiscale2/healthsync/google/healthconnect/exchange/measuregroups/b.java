package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.DatePrecision;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import fy.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qm0.d;
import ym.g;
/* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
final class b implements zf0.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f56616a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56617b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f56618c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PartnerCapabilities> f56619d;

    /* renamed from: e  reason: collision with root package name */
    private final l f56620e;

    /* renamed from: f  reason: collision with root package name */
    private final g f56621f;

    /* renamed from: g  reason: collision with root package name */
    private final hx.b f56622g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
    @e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.HealthConnectCycleMeasureGroupResolver", f = "ExchangeMenstruationPeriodWithHealthConnectRequest.kt", l = {ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT, 186}, m = "resolveConflicts")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56623a;

        /* renamed from: b  reason: collision with root package name */
        List f56624b;

        /* renamed from: c  reason: collision with root package name */
        int f56625c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56626d;

        /* renamed from: f  reason: collision with root package name */
        int f56628f;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56626d = obj;
            this.f56628f |= Integer.MIN_VALUE;
            return b.this.d(0, null, this);
        }
    }

    public b(User user, String str, DateTime dateTime, List list, l getMeasureGroupWithAllTypesBetweenUseCase, g getCycleInitialisationUseCase, hx.b cycleMeasuresGroupFactory) {
        u.j(getMeasureGroupWithAllTypesBetweenUseCase, "getMeasureGroupWithAllTypesBetweenUseCase");
        u.j(getCycleInitialisationUseCase, "getCycleInitialisationUseCase");
        u.j(cycleMeasuresGroupFactory, "cycleMeasuresGroupFactory");
        this.f56616a = user;
        this.f56617b = str;
        this.f56618c = dateTime;
        this.f56619d = list;
        this.f56620e = getMeasureGroupWithAllTypesBetweenUseCase;
        this.f56621f = getCycleInitialisationUseCase;
        this.f56622g = cycleMeasuresGroupFactory;
    }

    @Override // gg0.d
    public final DateTime A() {
        return this.f56618c;
    }

    @Override // gg0.d
    public final l B() {
        return this.f56620e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[PHI: r11 
      PHI: (r11v21 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:43:0x00da, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // gg0.d, u10.h
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r9, java.util.List<ky.d> r10, qm0.d<? super java.util.List<ky.d>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b.a
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b$a r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b.a) r0
            int r1 = r0.f56628f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56628f = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b$a r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56626d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56628f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            nm0.l.b(r11)
            goto Ldd
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r9 = r0.f56625c
            java.util.List r10 = r0.f56624b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.f56623a
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b r2 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b) r2
            nm0.l.b(r11)
            goto L66
        L42:
            nm0.l.b(r11)
            if (r9 != r5) goto Lc2
            com.withings.user.User r11 = r8.f56616a
            long r6 = r11.q()
            ym.g r11 = r8.f56621f
            vm.m r11 = r11.b(r6, r3)
            r0.f56623a = r8
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            r0.f56624b = r2
            r0.f56625c = r9
            r0.f56628f = r5
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r11, r0)
            if (r11 != r1) goto L65
            return r1
        L65:
            r2 = r8
        L66:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L72
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L72
        L70:
            r11 = r3
            goto Lc4
        L72:
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            boolean r5 = r11.hasNext()
            if (r5 != 0) goto L81
            r5 = r3
            goto La3
        L81:
            java.lang.Object r5 = r11.next()
            ky.d r5 = (ky.d) r5
            org.joda.time.DateTime r5 = r5.c()
        L8b:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r11.next()
            ky.d r6 = (ky.d) r6
            org.joda.time.DateTime r6 = r6.c()
            int r7 = r5.compareTo(r6)
            if (r7 <= 0) goto L8b
            r5 = r6
            goto L8b
        La3:
            if (r5 == 0) goto Lab
            org.joda.time.LocalDate r11 = r5.toLocalDate()
            if (r11 != 0) goto Laf
        Lab:
            org.joda.time.LocalDate r11 = org.joda.time.LocalDate.now()
        Laf:
            hx.b r5 = r2.f56622g
            com.withings.user.User r6 = r2.f56616a
            long r6 = r6.q()
            kotlin.jvm.internal.u.g(r11)
            r5.getClass()
            ky.d r11 = hx.b.b(r6, r11)
            goto Lc4
        Lc2:
            r2 = r8
            goto L70
        Lc4:
            java.util.List r11 = kotlin.collections.x.X(r11)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r10 = kotlin.collections.x.l0(r10, r11)
            r0.f56623a = r3
            r0.f56624b = r3
            r0.f56628f = r4
            java.lang.Object r11 = super.d(r9, r10, r0)
            if (r11 != r1) goto Ldd
            return r1
        Ldd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b.d(int, java.util.List, qm0.d):java.lang.Object");
    }

    @Override // gg0.d
    public final DatePrecision G() {
        return DatePrecision.f43372a;
    }

    @Override // gg0.d
    public final String getPackageName() {
        return this.f56617b;
    }

    @Override // gg0.d
    public final User getUser() {
        return this.f56616a;
    }

    @Override // gg0.d
    public final List<PartnerCapabilities> u() {
        return this.f56619d;
    }
}
