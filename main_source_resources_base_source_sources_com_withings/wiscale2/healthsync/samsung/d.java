package com.withings.wiscale2.healthsync.samsung;

import com.samsung.android.sdk.healthdata.HealthDataResolver;
import com.withings.partner.model.Partner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: ExportMeasureToSamsung.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$insert$2", f = "ExportMeasureToSamsung.kt", l = {105, 108, 112}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    HealthDataResolver f56965a;

    /* renamed from: b  reason: collision with root package name */
    InsertMeasureToSamsungWorker f56966b;

    /* renamed from: c  reason: collision with root package name */
    y10.a f56967c;

    /* renamed from: d  reason: collision with root package name */
    Iterator f56968d;

    /* renamed from: e  reason: collision with root package name */
    int f56969e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToSamsungWorker f56970f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y10.a f56971g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Partner f56972h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ List<jg0.a> f56973i;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(Long.valueOf(((jg0.a) t12).b()), Long.valueOf(((jg0.a) t11).b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, y10.a aVar, Partner partner, List<jg0.a> list, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f56970f = insertMeasureToSamsungWorker;
        this.f56971g = aVar;
        this.f56972h = partner;
        this.f56973i = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f56970f, this.f56971g, this.f56972h, this.f56973i, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f56969e
            r2 = 3
            r3 = 2
            r4 = 1
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r5 = r12.f56970f
            y10.a r6 = r12.f56971g
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            java.util.Iterator r1 = r12.f56968d
            y10.a r3 = r12.f56967c
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r4 = r12.f56966b
            com.samsung.android.sdk.healthdata.HealthDataResolver r5 = r12.f56965a
            nm0.l.b(r13)
            r6 = r3
            r13 = r5
            r5 = r4
            goto Lae
        L23:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2b:
            com.samsung.android.sdk.healthdata.HealthDataResolver r1 = r12.f56965a
            nm0.l.b(r13)
            goto L6a
        L31:
            nm0.l.b(r13)
            goto L45
        L35:
            nm0.l.b(r13)
            android.content.Context r13 = r5.getContext()
            r12.f56969e = r4
            java.lang.Object r13 = y10.d.e(r13, r12)
            if (r13 != r0) goto L45
            return r0
        L45:
            com.samsung.android.sdk.healthdata.HealthDataStore r13 = (com.samsung.android.sdk.healthdata.HealthDataStore) r13
            java.util.List r1 = r6.q()
            boolean r1 = y10.d.d(r13, r1)
            if (r1 == 0) goto Lcb
            com.withings.partner.model.Partner r1 = r12.f56972h
            boolean r1 = r6.i(r1)
            if (r1 == 0) goto Lcb
            com.samsung.android.sdk.healthdata.HealthDataResolver r1 = new com.samsung.android.sdk.healthdata.HealthDataResolver
            r4 = 0
            r1.<init>(r13, r4)
            r12.f56965a = r1
            r12.f56969e = r3
            java.lang.Object r13 = com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.z(r5, r1, r6, r12)
            if (r13 != r0) goto L6a
            return r0
        L6a:
            java.lang.Number r13 = (java.lang.Number) r13
            long r3 = r13.longValue()
            java.util.List<jg0.a> r13 = r12.f56973i
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            com.withings.wiscale2.healthsync.samsung.d$a r7 = new com.withings.wiscale2.healthsync.samsung.d$a
            r7.<init>()
            java.util.List r13 = kotlin.collections.x.D0(r13, r7)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r13 = r13.iterator()
        L88:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto La1
            java.lang.Object r8 = r13.next()
            r9 = r8
            jg0.a r9 = (jg0.a) r9
            long r9 = r9.b()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto La1
            r7.add(r8)
            goto L88
        La1:
            r13 = 100
            java.util.ArrayList r13 = kotlin.collections.x.x(r7, r13)
            java.util.Iterator r13 = r13.iterator()
            r11 = r1
            r1 = r13
            r13 = r11
        Lae:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            r12.f56965a = r13
            r12.f56966b = r5
            r12.f56967c = r6
            r12.f56968d = r1
            r12.f56969e = r2
            java.lang.Object r3 = com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.B(r5, r6, r3, r13, r12)
            if (r3 != r0) goto Lae
            return r0
        Lcb:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
