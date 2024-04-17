package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.device.Device;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$showSleepApneaOnboardingIfNecessary$apneaEligibleAndNotActivatedDevice$1", f = "SleepActivity.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Iterator f60897a;

    /* renamed from: b  reason: collision with root package name */
    Object f60898b;

    /* renamed from: c  reason: collision with root package name */
    int f60899c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SleepActivity f60900d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(SleepActivity sleepActivity, qm0.d<? super c0> dVar) {
        super(2, dVar);
        this.f60900d = sleepActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c0(this.f60900d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:14:0x0058). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f60899c
            com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity r2 = r7.f60900d
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L14
            java.lang.Object r1 = r7.f60898b
            java.util.Iterator r5 = r7.f60897a
            nm0.l.b(r8)
            goto L58
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            nm0.l.b(r8)
            kn.e r8 = kn.e.c()
            com.withings.user.core.models.User r1 = com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.E3(r2)
            long r5 = r1.getId()
            java.util.List r8 = r8.i(r5)
            java.lang.String r1 = "getByUserId(...)"
            kotlin.jvm.internal.u.i(r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
        L3b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L61
            java.lang.Object r1 = r5.next()
            r8 = r1
            com.withings.device.Device r8 = (com.withings.device.Device) r8
            kotlin.jvm.internal.u.g(r8)
            r7.f60897a = r5
            r7.f60898b = r1
            r7.f60899c = r4
            java.lang.Object r8 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.e.b(r8, r7)
            if (r8 != r0) goto L58
            return r0
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3b
            goto L62
        L61:
            r1 = r3
        L62:
            com.withings.device.Device r1 = (com.withings.device.Device) r1
            if (r1 == 0) goto L72
            com.withings.wiscale2.device.common.onboarding.k r8 = com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity.D3(r2)
            boolean r8 = r8.a(r1)
            r8 = r8 ^ r4
            if (r8 == 0) goto L72
            r3 = r1
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
