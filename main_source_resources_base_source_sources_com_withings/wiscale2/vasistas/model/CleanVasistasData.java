package com.withings.wiscale2.vasistas.model;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import lj0.h0;
import nm0.k;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: CleanVasistasData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/vasistas/model/CleanVasistasData;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CleanVasistasData extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f62579a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CleanVasistasData.kt */
    @e(c = "com.withings.wiscale2.vasistas.model.CleanVasistasData", f = "CleanVasistasData.kt", l = {35}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f62580a;

        /* renamed from: c  reason: collision with root package name */
        int f62582c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62580a = obj;
            this.f62582c |= Integer.MIN_VALUE;
            return CleanVasistasData.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CleanVasistasData.kt */
    @e(c = "com.withings.wiscale2.vasistas.model.CleanVasistasData$doWork$2", f = "CleanVasistasData.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {
        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            try {
                CleanVasistasData.this.f62579a.d(DateTime.now().withTimeAtStartOfDay().minusDays(14));
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (k.b(a11) == null) {
                y yVar = (y) a11;
                return new o.a.c();
            }
            return new o.a.C0176a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanVasistasData(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f62579a = h0.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.vasistas.model.CleanVasistasData.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.vasistas.model.CleanVasistasData$a r0 = (com.withings.wiscale2.vasistas.model.CleanVasistasData.a) r0
            int r1 = r0.f62582c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62582c = r1
            goto L18
        L13:
            com.withings.wiscale2.vasistas.model.CleanVasistasData$a r0 = new com.withings.wiscale2.vasistas.model.CleanVasistasData$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f62580a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f62582c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.vasistas.model.CleanVasistasData$b r2 = new com.withings.wiscale2.vasistas.model.CleanVasistasData$b
            r4 = 0
            r2.<init>(r4)
            r0.f62582c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vasistas.model.CleanVasistasData.doWork(qm0.d):java.lang.Object");
    }
}
