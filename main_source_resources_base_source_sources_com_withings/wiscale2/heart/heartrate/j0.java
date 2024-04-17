package com.withings.wiscale2.heart.heartrate;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$highHREvents$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_INVITATION_ALRDY_ACCEPTED, ConstantsWs.WS_STATUS_INVITATION_ALRDY_ACCEPTED}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends ky.d>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57674a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57675b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PlatformFeature f57676c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e0 f57677d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(PlatformFeature platformFeature, e0 e0Var, qm0.d<? super j0> dVar) {
        super(2, dVar);
        this.f57676c = platformFeature;
        this.f57677d = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        j0 j0Var = new j0(this.f57676c, this.f57677d, dVar);
        j0Var.f57675b = obj;
        return j0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends ky.d>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((j0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.f57674a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            nm0.l.b(r11)
            goto L54
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            java.lang.Object r1 = r10.f57675b
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r11)
            goto L48
        L20:
            nm0.l.b(r11)
            java.lang.Object r11 = r10.f57675b
            r1 = r11
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            com.withings.features.platform.model.PlatformFeature r11 = r10.f57676c
            if (r11 == 0) goto L54
            com.withings.wiscale2.heart.heartrate.e0 r11 = r10.f57677d
            mg0.c r4 = com.withings.wiscale2.heart.heartrate.e0.q0(r11)
            com.withings.user.User r5 = com.withings.wiscale2.heart.heartrate.e0.z0(r11)
            org.joda.time.DateTime r8 = com.withings.wiscale2.heart.heartrate.e0.y0(r11)
            r10.f57675b = r1
            r10.f57674a = r3
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r9 = r10
            java.io.Serializable r11 = r4.c(r5, r6, r8, r9)
            if (r11 != r0) goto L48
            return r0
        L48:
            r3 = 0
            r10.f57675b = r3
            r10.f57674a = r2
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L54
            return r0
        L54:
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.heartrate.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
