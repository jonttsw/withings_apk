package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import v10.c;
/* compiled from: SyncWorkoutsWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ImportWorkoutsFromFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImportWorkoutsFromFit extends FitSyncWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncWorkoutsWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportWorkoutsFromFit", f = "SyncWorkoutsWithFit.kt", l = {ConstantsWs.WS_STATUS_WRONGSESSIONTYPE, ConstantsWs.WS_STATUS_WRONGSESSIONDURATION, ConstantsWs.WS_STATUS_WRONGURL}, m = "importWorkouts")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56300a;

        /* renamed from: b  reason: collision with root package name */
        Object f56301b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56302c;

        /* renamed from: e  reason: collision with root package name */
        int f56304e;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56302c = obj;
            this.f56304e |= Integer.MIN_VALUE;
            return ImportWorkoutsFromFit.this.y(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportWorkoutsFromFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(1:(1:(4:11|12|13|14)(2:16|17))(11:18|19|20|21|22|(2:24|(5:26|(9:29|(1:31)(1:58)|32|(1:34)(5:49|(1:51)(1:57)|52|(1:54)(1:56)|55)|35|(4:38|(3:44|45|46)(3:40|41|42)|43|36)|47|48|27)|59|60|(2:62|(7:64|(4:65|(3:68|(1:1)|66)|71|70)|72|73|(3:75|(1:77)|12)|13|14)(2:78|79))(2:80|81)))|82|73|(0)|13|14))(1:86))(2:96|(2:98|(1:100)(1:101))(2:102|103))|87|88|89|(1:91)(9:92|21|22|(0)|82|73|(0)|13|14)))|104|6|(0)(0)|87|88|89|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
        r4 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(com.google.android.gms.auth.api.signin.GoogleSignInAccount r62, qm0.d<? super androidx.work.o.a> r63) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportWorkoutsFromFit.y(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        c.k kVar = c.k.f103138c;
        boolean i11 = kVar.i(partner);
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        GoogleSignInAccount a11 = kVar.a(applicationContext);
        if (!i11) {
            return new o.a.c();
        }
        if (a11 == null) {
            return new o.a.c();
        }
        return y(a11, dVar);
    }
}
