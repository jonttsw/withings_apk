package com.withings.wiscale2.healthsync.huawei.exchange.measuregroups;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.huawei.hms.hihealth.data.SampleSet;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.y;
import org.joda.time.DateTime;
import x10.a;
/* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/huawei/exchange/measuregroups/ExchangeMeasuresGroupWithHuaweiHealthWorker;", "Lcom/withings/wiscale2/healthsync/model/measuresgroup/ExchangeMeasuresGroupWorker;", "Lcom/huawei/hms/hihealth/data/SampleSet;", "Lx10/a$d;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeMeasuresGroupWithHuaweiHealthWorker extends ExchangeMeasuresGroupWorker<SampleSet, a.d> {

    /* renamed from: j  reason: collision with root package name */
    private final g f56801j;

    /* renamed from: k  reason: collision with root package name */
    private final g f56802k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
    @e(c = "com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker", f = "ExchangeMeasureGroupsWithHuaweiHealthRequest.kt", l = {45, 47}, m = "insertOrUpdate$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        int f56803a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f56804b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56805c;

        /* renamed from: e  reason: collision with root package name */
        int f56807e;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56805c = obj;
            this.f56807e |= Integer.MIN_VALUE;
            return ExchangeMeasuresGroupWithHuaweiHealthWorker.Y(ExchangeMeasuresGroupWithHuaweiHealthWorker.this, 0, null, this);
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<eg0.c> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f56809b = context;
        }

        @Override // ym0.a
        public final eg0.c invoke() {
            ExchangeMeasuresGroupWithHuaweiHealthWorker exchangeMeasuresGroupWithHuaweiHealthWorker = ExchangeMeasuresGroupWithHuaweiHealthWorker.this;
            User user = exchangeMeasuresGroupWithHuaweiHealthWorker.getUser();
            String packageName = this.f56809b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new eg0.c(user, packageName, exchangeMeasuresGroupWithHuaweiHealthWorker.x(), x.V(((ExchangeWeightWithHuaweiHealthWorker) exchangeMeasuresGroupWithHuaweiHealthWorker).m()), exchangeMeasuresGroupWithHuaweiHealthWorker.U().d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
    @e(c = "com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker", f = "ExchangeMeasureGroupsWithHuaweiHealthRequest.kt", l = {59}, m = "read$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56810a;

        /* renamed from: c  reason: collision with root package name */
        int f56812c;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56810a = obj;
            this.f56812c |= Integer.MIN_VALUE;
            return ExchangeMeasuresGroupWithHuaweiHealthWorker.Z(ExchangeMeasuresGroupWithHuaweiHealthWorker.this, null, null, null, this);
        }
    }

    /* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<String> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String lowerCase = ((ExchangeWeightWithHuaweiHealthWorker) ExchangeMeasuresGroupWithHuaweiHealthWorker.this).m().name().toLowerCase(Locale.ROOT);
            u.i(lowerCase, "toLowerCase(...)");
            return "add_" + lowerCase + "_from_huawei_health";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeMeasuresGroupWithHuaweiHealthWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        this.f56801j = h.b(new d());
        this.f56802k = h.b(new b(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object X(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker r4, x10.a.d r5, qm0.d r6) {
        /*
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.a r0 = (com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.a) r0
            int r1 = r0.f56821c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56821c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.a r0 = new com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f56819a
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f56821c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nm0.l.b(r4)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            nm0.l.b(r4)
            x10.a r4 = x10.a.f106384a
            com.huawei.hms.hihealth.data.DataType r5 = r5.c()
            r0.f56821c = r2
            java.lang.Object r4 = r4.i(r5, r0)
            if (r4 != r6) goto L41
            return r6
        L41:
            androidx.work.o$a$c r4 = new androidx.work.o$a$c
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.X(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker, x10.a$d, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object Y(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker r4, int r5, java.util.List<? extends com.huawei.hms.hihealth.data.SampleSet> r6, qm0.d<? super nm0.y> r7) {
        /*
            boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.a
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$a r0 = (com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.a) r0
            int r1 = r0.f56807e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56807e = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$a r0 = new com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$a
            r0.<init>(r7)
        L18:
            java.lang.Object r4 = r0.f56805c
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f56807e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            int r5 = r0.f56803a
            java.util.Iterator r6 = r0.f56804b
            nm0.l.b(r4)
            goto L41
        L37:
            nm0.l.b(r4)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
            r6 = r4
        L41:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r6.next()
            com.huawei.hms.hihealth.data.SampleSet r4 = (com.huawei.hms.hihealth.data.SampleSet) r4
            x10.a r1 = x10.a.f106384a
            if (r5 != r3) goto L5e
            r0.f56804b = r6
            r0.f56803a = r5
            r0.f56807e = r3
            java.lang.Object r4 = r1.l(r4, r0)
            if (r4 != r7) goto L41
            return r7
        L5e:
            r0.f56804b = r6
            r0.f56803a = r5
            r0.f56807e = r2
            java.lang.Object r4 = r1.q(r4, r0)
            if (r4 != r7) goto L41
            return r7
        L6b:
            nm0.y r4 = nm0.y.f85009a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.Y(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker, int, java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object Z(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker r4, x10.a.d r5, org.joda.time.DateTime r6, org.joda.time.DateTime r7, qm0.d<? super java.util.List<? extends com.huawei.hms.hihealth.data.SampleSet>> r8) {
        /*
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.c
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$c r0 = (com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.c) r0
            int r1 = r0.f56812c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56812c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$c r0 = new com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker$c
            r0.<init>(r8)
        L18:
            java.lang.Object r4 = r0.f56810a
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f56812c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nm0.l.b(r4)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            nm0.l.b(r4)
            x10.a r4 = x10.a.f106384a
            com.huawei.hms.hihealth.data.DataType r5 = r5.c()
            r0.f56812c = r2
            java.lang.Object r4 = r4.n(r5, r6, r7, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L47
            kotlin.collections.i0 r4 = kotlin.collections.i0.f76187a
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker.Z(com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker, x10.a$d, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object J(long j5, a.d dVar, qm0.d dVar2) {
        return X(this, dVar, dVar2);
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final u10.h M() {
        return (eg0.c) this.f56802k.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final boolean S() {
        return false;
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final String T() {
        return (String) this.f56801j.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object V(int i11, List<? extends SampleSet> list, qm0.d<? super y> dVar) {
        return Y(this, i11, list, dVar);
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final Object W(a.d dVar, DateTime dateTime, DateTime dateTime2, qm0.d<? super List<? extends SampleSet>> dVar2) {
        return Z(this, dVar, dateTime, dateTime2, dVar2);
    }
}
