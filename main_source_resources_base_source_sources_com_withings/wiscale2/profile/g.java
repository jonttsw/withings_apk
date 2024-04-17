package com.withings.wiscale2.profile;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.List;
/* compiled from: AllTimeStats.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final User f59330a;

    /* renamed from: b  reason: collision with root package name */
    private final iy.e f59331b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityAggregateManager f59332c;

    /* renamed from: d  reason: collision with root package name */
    private List<ky.d> f59333d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends ActivityAggregate> f59334e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllTimeStats.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.DataBaseCache", f = "AllTimeStats.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT}, m = "init")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        g f59335a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59336b;

        /* renamed from: d  reason: collision with root package name */
        int f59338d;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59336b = obj;
            this.f59338d |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllTimeStats.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.DataBaseCache", f = "AllTimeStats.kt", l = {ConstantsWs.MEASURE_TYPE_HR_ECG}, m = "initAllWeightMeasures")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        g f59339a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59340b;

        /* renamed from: d  reason: collision with root package name */
        int f59342d;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59340b = obj;
            this.f59342d |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(User user, iy.e eVar, ActivityAggregateManager activityAggregateManager) {
        this.f59330a = user;
        this.f59331b = eVar;
        this.f59332c = activityAggregateManager;
        kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
        this.f59333d = i0Var;
        this.f59334e = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(qm0.d<? super nm0.y> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.withings.wiscale2.profile.g.b
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.wiscale2.profile.g$b r0 = (com.withings.wiscale2.profile.g.b) r0
            int r1 = r0.f59342d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f59342d = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            com.withings.wiscale2.profile.g$b r0 = new com.withings.wiscale2.profile.g$b
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r11.f59340b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r11.f59342d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.withings.wiscale2.profile.g r0 = r11.f59339a
            nm0.l.b(r14)
            goto L57
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L33:
            nm0.l.b(r14)
            iy.e r1 = r13.f59331b
            if (r1 == 0) goto L5a
            com.withings.user.User r14 = r13.f59330a
            long r3 = r14.q()
            r11.f59339a = r13
            r11.f59342d = r2
            r10 = 0
            r12 = 700(0x2bc, float:9.81E-43)
            r14 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r2 = r3
            r4 = r14
            java.lang.Object r14 = iy.e.b(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L56
            return r0
        L56:
            r0 = r13
        L57:
            java.util.List r14 = (java.util.List) r14
            goto L5c
        L5a:
            r14 = 0
            r0 = r13
        L5c:
            if (r14 != 0) goto L60
            kotlin.collections.i0 r14 = kotlin.collections.i0.f76187a
        L60:
            r0.f59333d = r14
            nm0.y r14 = nm0.y.f85009a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.profile.g.e(qm0.d):java.lang.Object");
    }

    public final List<ActivityAggregate> b() {
        return this.f59334e;
    }

    public final List<ky.d> c() {
        return this.f59333d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(qm0.d<? super nm0.y> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.wiscale2.profile.g.a
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.profile.g$a r0 = (com.withings.wiscale2.profile.g.a) r0
            int r1 = r0.f59338d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59338d = r1
            goto L18
        L13:
            com.withings.wiscale2.profile.g$a r0 = new com.withings.wiscale2.profile.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f59336b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f59338d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.wiscale2.profile.g r0 = r0.f59335a
            nm0.l.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            nm0.l.b(r7)
            r0.f59335a = r6
            r0.f59338d = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            r0 = r6
        L40:
            com.withings.core.data.aggregate.ActivityAggregateManager r7 = r0.f59332c
            if (r7 == 0) goto L61
            com.withings.user.User r1 = r0.f59330a
            long r2 = r1.q()
            org.joda.time.DateTime r1 = r1.h()
            java.lang.String r4 = "getCreationDate(...)"
            kotlin.jvm.internal.u.i(r1, r4)
            org.joda.time.DateTime r4 = org.joda.time.DateTime.now()
            java.lang.String r5 = "now(...)"
            kotlin.jvm.internal.u.i(r4, r5)
            java.util.List r7 = r7.getActivityAggregatesBetweenDays(r2, r1, r4)
            goto L62
        L61:
            r7 = 0
        L62:
            if (r7 != 0) goto L66
            kotlin.collections.i0 r7 = kotlin.collections.i0.f76187a
        L66:
            r0.f59334e = r7
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.profile.g.d(qm0.d):java.lang.Object");
    }
}
