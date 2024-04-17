package com.withings.wiscale2.device.common.feature.spo2;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpO2ActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.spo2.Spo2ActivationViewModel$activateFeature$1$1", f = "SpO2ActivationActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGURL, ConstantsWs.WS_STATUS_WRONGPUBLICKEY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    com.withings.wiscale2.device.common.feature.t f52535a;

    /* renamed from: b  reason: collision with root package name */
    int f52536b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f52537c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f52538d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<PlatformFeature> f52539e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, List<PlatformFeature> list, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f52538d = qVar;
        this.f52539e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        o oVar = new o(this.f52538d, this.f52539e, dVar);
        oVar.f52537c = obj;
        return oVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r9.f52536b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            nm0.l.b(r10)
            goto L86
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            com.withings.wiscale2.device.common.feature.t r1 = r9.f52535a
            java.lang.Object r5 = r9.f52537c
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            nm0.l.b(r10)
            goto L72
        L24:
            nm0.l.b(r10)
            java.lang.Object r10 = r9.f52537c
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            com.withings.wiscale2.device.common.feature.spo2.q r1 = r9.f52538d
            com.withings.wiscale2.device.common.feature.u r5 = com.withings.wiscale2.device.common.feature.spo2.q.i0(r1)
            com.withings.device.Device r1 = com.withings.wiscale2.device.common.feature.spo2.q.f0(r1)
            java.lang.String r6 = "$features"
            java.util.List<com.withings.features.platform.model.PlatformFeature> r7 = r9.f52539e
            kotlin.jvm.internal.u.i(r7, r6)
            com.withings.wiscale2.device.common.feature.t r1 = r5.a(r1, r7, r2)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r5 = r7.iterator()
        L46:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.withings.features.platform.model.PlatformFeature r7 = (com.withings.features.platform.model.PlatformFeature) r7
            int r7 = r7.getFeatureId()
            r8 = 15
            if (r7 != r8) goto L46
            goto L5d
        L5c:
            r6 = r2
        L5d:
            com.withings.features.platform.model.PlatformFeature r6 = (com.withings.features.platform.model.PlatformFeature) r6
            if (r6 == 0) goto L75
            int r5 = r6.getFeatureId()
            r9.f52537c = r10
            r9.f52535a = r1
            r9.f52536b = r4
            java.lang.Object r10 = r1.e(r5, r4, r9)
            if (r10 != r0) goto L72
            return r0
        L72:
            nm0.y r10 = nm0.y.f85009a
            goto L76
        L75:
            r10 = r2
        L76:
            if (r10 != 0) goto L86
            r9.f52537c = r2
            r9.f52535a = r2
            r9.f52536b = r3
            r10 = 3
            java.lang.Object r10 = r1.e(r10, r4, r9)
            if (r10 != r0) goto L86
            return r0
        L86:
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.spo2.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
