package com.withings.common.device;

import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BleOrBluetoothSetupDiscoverer.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.BleOrBluetoothSetupDiscoverer$launchRssiConstraintReduction$1", f = "BleOrBluetoothSetupDiscoverer.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35059a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f35060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f35060b = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f35060b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f35059a
            com.withings.common.device.b r2 = r6.f35060b
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            nm0.l.b(r7)
            goto L2b
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            nm0.l.b(r7)
        L1a:
            boolean r7 = com.withings.common.device.b.c(r2)
            if (r7 != 0) goto L3f
            r6.f35059a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
            if (r7 != r0) goto L2b
            return r0
        L2b:
            int r7 = com.withings.common.device.b.a(r2)
            int r7 = r7 + r3
            com.withings.common.device.b.h(r2, r7)
            int r7 = com.withings.common.device.b.a(r2)
            r1 = 10
            if (r7 < r1) goto L1a
            com.withings.common.device.b.i(r2)
            goto L1a
        L3f:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.device.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
