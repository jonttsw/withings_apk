package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.tasks.Task;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;
import nm0.y;
import ym0.p;
/* compiled from: SyncMeasureWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/RemoveMeasureToFitWorker;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RemoveMeasureToFitWorker extends FitSyncWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker", f = "SyncMeasureWithFit.kt", l = {92}, m = "deleteDataSet")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56373a;

        /* renamed from: c  reason: collision with root package name */
        int f56375c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56373a = obj;
            this.f56375c |= Integer.MIN_VALUE;
            return RemoveMeasureToFitWorker.this.y(null, 0L, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$deleteDataSet$2", f = "SyncMeasureWithFit.kt", l = {95, 99}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56376a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f56377b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoveMeasureToFitWorker f56378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f56379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DataType f56380e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f56381f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t10.e f56382g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5, GoogleSignInAccount googleSignInAccount, DataType dataType, t10.e eVar, RemoveMeasureToFitWorker removeMeasureToFitWorker, qm0.d dVar) {
            super(2, dVar);
            this.f56378c = removeMeasureToFitWorker;
            this.f56379d = j5;
            this.f56380e = dataType;
            this.f56381f = googleSignInAccount;
            this.f56382g = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f56379d, this.f56381f, this.f56380e, this.f56382g, this.f56378c, dVar);
            bVar.f56377b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56376a;
            RemoveMeasureToFitWorker removeMeasureToFitWorker = this.f56378c;
            try {
            } catch (Exception e11) {
                Context context = removeMeasureToFitWorker.getContext();
                Partner partner = Partner.f43456n;
                this.f56377b = e11;
                this.f56376a = 2;
                if (this.f56382g.l(context, partner, this, false) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                exc = e11;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        exc = (Exception) this.f56377b;
                        nm0.l.b(obj);
                        x70.b.n(exc);
                        return new o.a.C0176a();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f56377b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                coroutineScope = (CoroutineScope) this.f56377b;
                removeMeasureToFitWorker.getClass();
                DataDeleteRequest.Builder addDataType = new DataDeleteRequest.Builder().addDataType(this.f56380e);
                long j5 = 1000;
                long j11 = this.f56379d;
                DataDeleteRequest build = addDataType.setTimeInterval(j11 - j5, j11 + j5, TimeUnit.MILLISECONDS).build();
                u.i(build, "build(...)");
                Task<Void> deleteData = Fitness.getHistoryClient(removeMeasureToFitWorker.getApplicationContext(), this.f56381f).deleteData(build);
                u.i(deleteData, "deleteData(...)");
                this.f56377b = coroutineScope;
                this.f56376a = 1;
                if (TasksKt.await(deleteData, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            x70.b.l(coroutineScope, "DataSet delete was successful!", new Object[0]);
            return new o.a.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveMeasureToFitWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(com.google.android.gms.auth.api.signin.GoogleSignInAccount r14, long r15, com.google.android.gms.fitness.data.DataType r17, t10.e r18, qm0.d<? super androidx.work.o.a> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker.a
            if (r1 == 0) goto L16
            r1 = r0
            com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$a r1 = (com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker.a) r1
            int r2 = r1.f56375c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f56375c = r2
            r10 = r13
            goto L1c
        L16:
            com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$a r1 = new com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$a
            r10 = r13
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f56373a
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r1.f56375c
            r12 = 1
            if (r2 == 0) goto L33
            if (r2 != r12) goto L2b
            nm0.l.b(r0)
            goto L4d
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            nm0.l.b(r0)
            com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$b r0 = new com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker$b
            r9 = 0
            r2 = r0
            r3 = r15
            r5 = r14
            r6 = r17
            r7 = r18
            r8 = r13
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r1.f56375c = r12
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            if (r0 != r11) goto L4d
            return r11
        L4d:
            java.lang.String r1 = "coroutineScope(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.RemoveMeasureToFitWorker.y(com.google.android.gms.auth.api.signin.GoogleSignInAccount, long, com.google.android.gms.fitness.data.DataType, t10.e, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        v10.c cVar;
        GoogleSignInAccount googleSignInAccount;
        t10.e eVar;
        Object obj;
        DataType b10 = a3.b.b(getInputData().c("measureDataType", Integer.MIN_VALUE));
        long e11 = getInputData().e("measureDeleteTimestamp", Long.MIN_VALUE);
        if (b10 != null) {
            Iterator<T> it = v10.d.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (u.e(b10, ((v10.c) obj).m())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cVar = (v10.c) obj;
            if (cVar == null) {
                throw new IllegalArgumentException("Fit dataType " + b10 + " is not yet supported for export to Google Fit");
            }
        } else {
            cVar = null;
        }
        boolean z5 = false;
        if (cVar != null && cVar.i(partner)) {
            z5 = true;
        }
        if (cVar != null) {
            Context applicationContext = getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            googleSignInAccount = cVar.a(applicationContext);
        } else {
            googleSignInAccount = null;
        }
        if (b10 == null) {
            return new o.a.c();
        }
        if (e11 == Long.MIN_VALUE) {
            return new o.a.c();
        }
        if (!z5) {
            return new o.a.c();
        }
        if (googleSignInAccount != null) {
            eVar = t10.e.f97966j;
            if (eVar != null) {
                return y(googleSignInAccount, e11, b10, eVar, dVar);
            }
            throw new IllegalArgumentException("you must call init before using get".toString());
        }
        return new o.a.c();
    }
}
