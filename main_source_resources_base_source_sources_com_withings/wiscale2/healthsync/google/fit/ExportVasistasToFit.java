package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u10.a0;
/* compiled from: ExportVasistasToFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ExportVasistasToFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExportVasistasToFit extends FitSyncWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportVasistasToFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit", f = "ExportVasistasToFit.kt", l = {58}, m = "doFitSync")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56206a;

        /* renamed from: c  reason: collision with root package name */
        int f56208c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56206a = obj;
            this.f56208c |= Integer.MIN_VALUE;
            return ExportVasistasToFit.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportVasistasToFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit", f = "ExportVasistasToFit.kt", l = {76}, m = "export")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExportVasistasToFit f56209a;

        /* renamed from: b  reason: collision with root package name */
        a0 f56210b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList f56211c;

        /* renamed from: d  reason: collision with root package name */
        int f56212d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f56213e;

        /* renamed from: g  reason: collision with root package name */
        int f56215g;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56213e = obj;
            this.f56215g |= Integer.MIN_VALUE;
            return ExportVasistasToFit.this.z(0, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportVasistasToFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:16|(9:19|20|21|(3:23|24|25)(2:37|(1:39)(2:40|(1:42)(2:43|(1:45))))|26|27|(2:29|30)(1:32)|31|17)|49|50|51|52|(1:54)(6:56|57|58|(1:60)|61|(7:63|(1:65)|11|12|13|14|(3:73|74|(3:76|14|(0)(0))(2:77|78))(0))(5:66|12|13|14|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0243, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0244, code lost:
        r14 = r13;
        r13 = r1;
        r22 = r12;
        r12 = r2;
        r2 = r10;
        r10 = r9;
        r9 = r11;
        r11 = r5;
        r5 = r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00db -> B:34:0x00f4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x028d -> B:82:0x0290). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x029f -> B:83:0x0293). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(v10.c r24, com.google.android.gms.auth.api.signin.GoogleSignInAccount r25, java.util.ArrayList r26, t10.e r27, qm0.d r28) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit.A(v10.c, com.google.android.gms.auth.api.signin.GoogleSignInAccount, java.util.ArrayList, t10.e, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r19, v10.c r20, com.google.android.gms.auth.api.signin.GoogleSignInAccount r21, qm0.d<? super nm0.y> r22) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit.z(int, v10.c, com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.withings.partner.model.Partner r7, qm0.d<? super androidx.work.o.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit.a
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit$a r0 = (com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit.a) r0
            int r1 = r0.f56208c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56208c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit$a r0 = new com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56206a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56208c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r8)
            goto L86
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            nm0.l.b(r8)
            androidx.work.f r8 = r6.getInputData()
            java.lang.String r2 = "type"
            r4 = -1
            int r8 = r8.c(r2, r4)
            java.util.List r2 = v10.d.b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L47:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r2.next()
            r5 = r4
            v10.c r5 = (v10.c) r5
            java.lang.Integer r5 = r5.w()
            if (r5 != 0) goto L5b
            goto L47
        L5b:
            int r5 = r5.intValue()
            if (r8 != r5) goto L47
            goto L63
        L62:
            r4 = 0
        L63:
            v10.c r4 = (v10.c) r4
            if (r4 == 0) goto L92
            boolean r7 = r4.i(r7)
            android.content.Context r2 = r6.getApplicationContext()
            java.lang.String r5 = "getApplicationContext(...)"
            kotlin.jvm.internal.u.i(r2, r5)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r4.a(r2)
            if (r7 == 0) goto L8c
            if (r2 != 0) goto L7d
            goto L8c
        L7d:
            r0.f56208c = r3
            java.lang.Object r7 = r6.z(r8, r4, r2, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            androidx.work.o$a$c r7 = new androidx.work.o$a$c
            r7.<init>()
            goto L91
        L8c:
            androidx.work.o$a$c r7 = new androidx.work.o$a$c
            r7.<init>()
        L91:
            return r7
        L92:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Measure type "
            java.lang.String r1 = " is not yet supported for export to Google Fit"
            java.lang.String r8 = androidx.camera.camera2.internal.o0.a(r0, r8, r1)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit.t(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
