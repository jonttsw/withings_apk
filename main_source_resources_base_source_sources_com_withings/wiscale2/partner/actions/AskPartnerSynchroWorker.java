package com.withings.wiscale2.partner.actions;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.PartnerRemoteRepository;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.g;
import nm0.h;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: FetchRunkeeperActivities.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/partner/actions/AskPartnerSynchroWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lcom/withings/partner/ws/PartnerRemoteRepository;", "partnerRemoteRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/withings/partner/ws/PartnerRemoteRepository;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AskPartnerSynchroWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final PartnerRemoteRepository f58824a;

    /* renamed from: b  reason: collision with root package name */
    private final g f58825b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchRunkeeperActivities.kt */
    @e(c = "com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker", f = "FetchRunkeeperActivities.kt", l = {71}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f58826a;

        /* renamed from: c  reason: collision with root package name */
        int f58828c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58826a = obj;
            this.f58828c |= Integer.MIN_VALUE;
            return AskPartnerSynchroWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchRunkeeperActivities.kt */
    @e(c = "com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$doWork$2", f = "FetchRunkeeperActivities.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58829a;

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
            int i11 = this.f58829a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    AskPartnerSynchroWorker askPartnerSynchroWorker = AskPartnerSynchroWorker.this;
                    PartnerRemoteRepository partnerRemoteRepository = askPartnerSynchroWorker.f58824a;
                    long t11 = AskPartnerSynchroWorker.t(askPartnerSynchroWorker);
                    this.f58829a = 1;
                    if (partnerRemoteRepository.synchroRunkeeper(t11, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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

    /* compiled from: FetchRunkeeperActivities.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(AskPartnerSynchroWorker.this.getInputData().e(HealthUserProfile.USER_PROFILE_KEY_USER_ID, -1L));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskPartnerSynchroWorker(Context context, WorkerParameters params, PartnerRemoteRepository partnerRemoteRepository) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(partnerRemoteRepository, "partnerRemoteRepository");
        this.f58824a = partnerRemoteRepository.withSyncContext("AskPartnerSynchro");
        this.f58825b = h.b(new c());
    }

    public static final long t(AskPartnerSynchroWorker askPartnerSynchroWorker) {
        return ((Number) askPartnerSynchroWorker.f58825b.getValue()).longValue();
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
            boolean r0 = r6 instanceof com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$a r0 = (com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker.a) r0
            int r1 = r0.f58828c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58828c = r1
            goto L18
        L13:
            com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$a r0 = new com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58826a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f58828c
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
            com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$b r2 = new com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f58828c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker.doWork(qm0.d):java.lang.Object");
    }
}
