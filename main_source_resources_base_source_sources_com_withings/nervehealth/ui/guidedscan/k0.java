package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.nervehealth.ui.guidedscan.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$onLaunchScan$1", f = "NerveHealthGuidedScanViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class k0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42633a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42634b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f42635c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, Context context, qm0.d<? super k0> dVar) {
        super(2, dVar);
        this.f42634b = nerveHealthGuidedScanViewModel;
        this.f42635c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k0(this.f42634b, this.f42635c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeviceWithVideoMedia.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42633a;
        NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42634b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f42633a = 1;
            if (NerveHealthGuidedScanViewModel.A0(nerveHealthGuidedScanViewModel, this.f42635c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        DateTime now = DateTime.now();
        aVar = nerveHealthGuidedScanViewModel.f42551v;
        nerveHealthGuidedScanViewModel.a1(new d.b(now, aVar));
        return nm0.y.f85009a;
    }
}
