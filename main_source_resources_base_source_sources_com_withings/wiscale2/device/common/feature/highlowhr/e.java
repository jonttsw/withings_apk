package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HighLowHRSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel$selectCustomHRThreshold$1", f = "HighLowHRSettingsActivity.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGAPPROVAL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52264a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52265b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f52266c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f52267d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, int i11, int i12, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f52265b = aVar;
        this.f52266c = i11;
        this.f52267d = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f52265b, this.f52266c, this.f52267d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetRepository targetRepository;
        TargetRepository targetRepository2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52264a;
        a aVar = this.f52265b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            targetRepository = aVar.f52230c;
            List<Target> V = kotlin.collections.x.V(targetRepository.createHRTarget(aVar.getUser().q(), this.f52266c, this.f52267d, 2));
            targetRepository2 = aVar.f52230c;
            long q11 = aVar.getUser().q();
            this.f52264a = 1;
            if (targetRepository2.replaceHRThresholds(q11, V, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        a.p0(aVar).b(aVar.getUser().q());
        return nm0.y.f85009a;
    }
}
