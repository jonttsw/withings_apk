package com.withings.device.setup.android.setup;

import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: SetupConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.setup.android.setup.SetupConversation$checkBatteryState$1", f = "SetupConversation.kt", l = {225, 229}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37407a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SetupConversation f37408b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SetupConversation setupConversation, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f37408b = setupConversation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f37408b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (com.withings.device.setup.android.setup.SetupConversation.O(r4) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:23:0x005c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f37407a
            r2 = 2
            r3 = 1
            com.withings.device.setup.android.setup.SetupConversation r4 = r7.f37408b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            nm0.l.b(r8)
            goto L5c
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            nm0.l.b(r8)
            goto L3e
        L1e:
            nm0.l.b(r8)
            lo.b r8 = com.withings.device.setup.android.setup.SetupConversation.N(r4)
            xp.a r1 = com.withings.device.setup.android.setup.SetupConversation.M(r4)
            if (r1 == 0) goto L6d
            cj.b r5 = r4.x()
            com.withings.comm.wpp.generated.object.ProbeReply r5 = r5.i()
            long r5 = r5.softVersion
            r7.f37407a = r3
            java.lang.Object r8 = r8.a(r1, r5, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6a
            boolean r8 = com.withings.device.setup.android.setup.SetupConversation.O(r4)
            if (r8 == 0) goto L6a
            jo.h r8 = jo.h.f74693a
            com.withings.device.setup.android.setup.SetupConversation.P(r4, r4, r8)
        L51:
            r7.f37407a = r2
            r5 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            com.withings.comm.remote.conversation.WppDeviceConversation$State r8 = r4.w()
            com.withings.comm.remote.conversation.WppDeviceConversation$State r1 = com.withings.comm.remote.conversation.WppDeviceConversation.State.f33150b
            if (r8 != r1) goto L6a
            boolean r8 = com.withings.device.setup.android.setup.SetupConversation.O(r4)
            if (r8 != 0) goto L51
        L6a:
            nm0.y r8 = nm0.y.f85009a
            return r8
        L6d:
            java.lang.String r8 = "deviceSessionProvider"
            kotlin.jvm.internal.u.s(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.android.setup.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
