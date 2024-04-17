package com.withings.wiscale2.device.common.tutorial.navigation;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.device.common.feature.t;
import com.withings.wiscale2.device.common.feature.u;
import com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationTutorialActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity$NavigationTutorialViewModel$setFeatureFlowSeenAndLeave$1", f = "NavigationTutorialActivity.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53646a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NavigationTutorialActivity.a f53647b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NavigationTutorialActivity.a aVar, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f53647b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f53647b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PlatformFeatureRepository platformFeatureRepository;
        u uVar;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53646a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            NavigationTutorialActivity.a aVar = this.f53647b;
            platformFeatureRepository = aVar.f53636c;
            List<PlatformFeature> X = x.X(platformFeatureRepository.getFeature(18));
            uVar = aVar.f53637d;
            device = aVar.f53635b;
            t a11 = uVar.a(device, X, null);
            this.f53646a = 1;
            if (a11.e(18, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
