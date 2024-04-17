package com.withings.ecg;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: CleanDeletedSignals.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/ecg/CleanDeletedSignals;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CleanDeletedSignals extends CoroutineWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CleanDeletedSignals.kt */
    @e(c = "com.withings.ecg.CleanDeletedSignals", f = "CleanDeletedSignals.kt", l = {31}, m = "doWork")
    /* loaded from: classes3.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f37981a;

        /* renamed from: c  reason: collision with root package name */
        int f37983c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37981a = obj;
            this.f37983c |= Integer.MIN_VALUE;
            return CleanDeletedSignals.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CleanDeletedSignals.kt */
    @e(c = "com.withings.ecg.CleanDeletedSignals$doWork$2", f = "CleanDeletedSignals.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {
        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            HeartSignalRepository heartSignalRepository;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            try {
                heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (heartSignalRepository != null) {
                heartSignalRepository.deleteOldSignalButNotLatest();
                a11 = y.f85009a;
                if (k.b(a11) == null) {
                    y yVar = (y) a11;
                    return new o.a.c();
                }
                return new o.a.C0176a();
            }
            u.s("heartSignalRepository");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanDeletedSignals(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.ecg.CleanDeletedSignals.a
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.ecg.CleanDeletedSignals$a r0 = (com.withings.ecg.CleanDeletedSignals.a) r0
            int r1 = r0.f37983c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37983c = r1
            goto L18
        L13:
            com.withings.ecg.CleanDeletedSignals$a r0 = new com.withings.ecg.CleanDeletedSignals$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37981a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37983c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            nm0.l.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.ecg.CleanDeletedSignals$b r2 = new com.withings.ecg.CleanDeletedSignals$b
            r4 = 2
            r5 = 0
            r2.<init>(r4, r5)
            r0.f37983c = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.CleanDeletedSignals.doWork(qm0.d):java.lang.Object");
    }
}
