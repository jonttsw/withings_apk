package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HighLowHRSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel$onThresholdsOff$1", f = "HighLowHRSettingsActivity.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT, ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52260a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f52261b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f52261b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52260a;
        a aVar = this.f52261b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    a.p0(aVar).b(aVar.getUser().q());
                    aVar.y0(false);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            this.f52260a = 1;
            if (a.r0(aVar, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f52260a = 2;
        if (a.t0(aVar, false, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        a.p0(aVar).b(aVar.getUser().q());
        aVar.y0(false);
        return nm0.y.f85009a;
    }
}
