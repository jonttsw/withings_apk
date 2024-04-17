package com.withings.wiscale2.healthsync.samsung;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.samsung.android.sdk.healthdata.HealthDataResolver;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SyncVasistasWithSamsung.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/samsung/SyncVasistasWithSamsung;", "Lcom/withings/wiscale2/healthsync/samsung/SHealthWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SyncVasistasWithSamsung extends SHealthWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncVasistasWithSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung", f = "SyncVasistasWithSamsung.kt", l = {50}, m = "doSHealthSync")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56930a;

        /* renamed from: c  reason: collision with root package name */
        int f56932c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56930a = obj;
            this.f56932c |= Integer.MIN_VALUE;
            return SyncVasistasWithSamsung.this.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncVasistasWithSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung", f = "SyncVasistasWithSamsung.kt", l = {67, 68}, m = "export")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        SyncVasistasWithSamsung f56933a;

        /* renamed from: b  reason: collision with root package name */
        Object f56934b;

        /* renamed from: c  reason: collision with root package name */
        Object f56935c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList f56936d;

        /* renamed from: e  reason: collision with root package name */
        int f56937e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f56938f;

        /* renamed from: h  reason: collision with root package name */
        int f56940h;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56938f = obj;
            this.f56940h |= Integer.MIN_VALUE;
            return SyncVasistasWithSamsung.this.A(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncVasistasWithSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung", f = "SyncVasistasWithSamsung.kt", l = {86}, m = "insertChunk")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56941a;

        /* renamed from: c  reason: collision with root package name */
        int f56943c;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56941a = obj;
            this.f56943c |= Integer.MIN_VALUE;
            return SyncVasistasWithSamsung.this.B(null, null, null, this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((Vasistas) t12).getStartDate(), ((Vasistas) t11).getStartDate());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncVasistasWithSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung", f = "SyncVasistasWithSamsung.kt", l = {80}, m = "syncVasistas")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        SyncVasistasWithSamsung f56944a;

        /* renamed from: b  reason: collision with root package name */
        y10.a f56945b;

        /* renamed from: c  reason: collision with root package name */
        HealthDataResolver f56946c;

        /* renamed from: d  reason: collision with root package name */
        Iterator f56947d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f56948e;

        /* renamed from: g  reason: collision with root package name */
        int f56950g;

        e(qm0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56948e = obj;
            this.f56950g |= Integer.MIN_VALUE;
            return SyncVasistasWithSamsung.this.C(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncVasistasWithSamsung(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(int r20, y10.a r21, qm0.d<? super nm0.y> r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.A(int, y10.a, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        r8 = nm0.l.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(y10.a r5, java.util.List<com.samsung.android.sdk.healthdata.HealthData> r6, com.samsung.android.sdk.healthdata.HealthDataResolver r7, qm0.d<? super nm0.y> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.c
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$c r0 = (com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.c) r0
            int r1 = r0.f56943c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56943c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$c r0 = new com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56941a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56943c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r5 = move-exception
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            nm0.l.b(r8)
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder r8 = new com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder
            r8.<init>()
            java.lang.String r5 = r5.a()
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest$Builder r5 = r8.setDataType(r5)
            com.samsung.android.sdk.healthdata.HealthDataResolver$InsertRequest r5 = r5.build()
            r5.addHealthData(r6)
            r0.f56943c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = y10.d.a(r7, r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L51
            return r1
        L51:
            com.samsung.android.sdk.healthdata.HealthResultHolder$BaseResult r8 = (com.samsung.android.sdk.healthdata.HealthResultHolder.BaseResult) r8     // Catch: java.lang.Throwable -> L27
            goto L58
        L54:
            nm0.k$a r8 = nm0.l.a(r5)
        L58:
            java.lang.Throwable r5 = nm0.k.b(r8)
            if (r5 == 0) goto L61
            r5.printStackTrace()
        L61:
            nm0.y r5 = nm0.y.f85009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.B(y10.a, java.util.List, com.samsung.android.sdk.healthdata.HealthDataResolver, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(y10.a r12, com.samsung.android.sdk.healthdata.HealthDataStore r13, java.util.List<com.withings.vasistas.model.Vasistas> r14, qm0.d<? super nm0.y> r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.C(y10.a, com.samsung.android.sdk.healthdata.HealthDataStore, java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:18|19))(4:20|(2:21|(2:23|(1:25))(2:36|37))|26|(2:28|(3:30|12|(2:14|15)(1:17))(2:31|(1:33)))(2:34|35))|11|12|(0)(0)))|40|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        r7 = nm0.l.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.wiscale2.healthsync.samsung.SHealthWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.withings.partner.model.Partner r7, qm0.d<? super androidx.work.o.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.a
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$a r0 = (com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.a) r0
            int r1 = r0.f56932c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56932c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$a r0 = new com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56930a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56932c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L27
            goto L7b
        L27:
            r7 = move-exception
            goto L81
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            nm0.l.b(r8)
            androidx.work.f r8 = r6.getInputData()
            java.lang.String r2 = "type"
            r4 = -1
            int r8 = r8.c(r2, r4)
            java.util.List r2 = y10.b.b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L49:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r2.next()
            r5 = r4
            y10.a r5 = (y10.a) r5
            int[] r5 = r5.m()
            boolean r5 = kotlin.collections.l.l(r5, r8)
            if (r5 == 0) goto L49
            goto L62
        L61:
            r4 = 0
        L62:
            y10.a r4 = (y10.a) r4
            if (r4 == 0) goto L90
            boolean r7 = r4.i(r7)
            if (r7 != 0) goto L72
            androidx.work.o$a$c r7 = new androidx.work.o$a$c     // Catch: java.lang.Throwable -> L27
            r7.<init>()     // Catch: java.lang.Throwable -> L27
            goto L85
        L72:
            r0.f56932c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.A(r8, r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L7b
            return r1
        L7b:
            androidx.work.o$a$c r7 = new androidx.work.o$a$c     // Catch: java.lang.Throwable -> L27
            r7.<init>()     // Catch: java.lang.Throwable -> L27
            goto L85
        L81:
            nm0.k$a r7 = nm0.l.a(r7)
        L85:
            androidx.work.o$a$c r8 = new androidx.work.o$a$c
            r8.<init>()
            boolean r0 = r7 instanceof nm0.k.a
            if (r0 == 0) goto L8f
            r7 = r8
        L8f:
            return r7
        L90:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Measure type "
            java.lang.String r1 = " is not yet supported for export to Samsung Health"
            java.lang.String r8 = androidx.camera.camera2.internal.o0.a(r0, r8, r1)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.SyncVasistasWithSamsung.v(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
