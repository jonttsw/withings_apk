package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HighLowHRSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel$onThresholdsAuto$1", f = "HighLowHRSettingsActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICESN, ConstantsWs.WS_STATUS_WRONGDEVICEBRANDING}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52253a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52254b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f52254b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f52254b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ng0.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52253a;
        a aVar = this.f52254b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    bVar = aVar.f52236i;
                    bVar.c(aVar.getUser().q(), true);
                    aVar.y0(true);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            this.f52253a = 1;
            if (a.r0(aVar, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f52253a = 2;
        if (a.t0(aVar, false, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        bVar = aVar.f52236i;
        bVar.c(aVar.getUser().q(), true);
        aVar.y0(true);
        return nm0.y.f85009a;
    }
}
