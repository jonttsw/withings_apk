package com.withings.wiscale2.healthsync.samsung;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ExportMeasureToSamsung.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/samsung/RemoveMeasureToSamsungWorker;", "Lcom/withings/wiscale2/healthsync/samsung/SHealthWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RemoveMeasureToSamsungWorker extends SHealthWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.RemoveMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {ConstantsWs.WS_STATUS_WRONGPUBLICKEY}, m = "doSHealthSync")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        long f56918a;

        /* renamed from: b  reason: collision with root package name */
        y10.a f56919b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56920c;

        /* renamed from: e  reason: collision with root package name */
        int f56922e;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56920c = obj;
            this.f56922e |= Integer.MIN_VALUE;
            return RemoveMeasureToSamsungWorker.this.v(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveMeasureToSamsungWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(8:23|24|(2:26|(2:28|(1:30)(1:37))(1:38))(1:39)|31|(2:33|(1:35)(1:36))|13|14|(1:19)(2:16|17))|12|13|14|(0)(0)))|42|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        r10 = nm0.l.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.wiscale2.healthsync.samsung.SHealthWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.withings.partner.model.Partner r10, qm0.d<? super androidx.work.o.a> r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.RemoveMeasureToSamsungWorker.v(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
