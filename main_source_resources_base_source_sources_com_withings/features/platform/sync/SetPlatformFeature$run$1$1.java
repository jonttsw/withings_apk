package com.withings.features.platform.sync;

import com.withings.features.platform.model.PlatformFeature;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetPlatformFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.features.platform.sync.SetPlatformFeature$run$1$1", f = "SetPlatformFeature.kt", l = {27, 29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SetPlatformFeature$run$1$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    int label;
    final /* synthetic */ SetPlatformFeature this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPlatformFeature$run$1$1(SetPlatformFeature setPlatformFeature, qm0.d<? super SetPlatformFeature$run$1$1> dVar) {
        super(2, dVar);
        this.this$0 = setPlatformFeature;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new SetPlatformFeature$run$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        qr.a aVar;
        PlatformFeature platformFeature;
        Long l5;
        Long l6;
        qr.a aVar2;
        PlatformFeature platformFeature2;
        Long l11;
        Long l12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            z5 = this.this$0.enabled;
            if (z5) {
                aVar2 = this.this$0.platformFeatureApi;
                platformFeature2 = this.this$0.platformFeature;
                int featureId = platformFeature2.getFeatureId();
                l11 = this.this$0.deviceId;
                l12 = this.this$0.accountId;
                this.label = 1;
                if (qr.a.b(aVar2, featureId, l11, l12, null, null, null, this, 56) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                aVar = this.this$0.platformFeatureApi;
                platformFeature = this.this$0.platformFeature;
                int featureId2 = platformFeature.getFeatureId();
                l5 = this.this$0.deviceId;
                l6 = this.this$0.accountId;
                this.label = 2;
                if (qr.a.a(aVar, featureId2, l5, l6, null, null, this, 24) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((SetPlatformFeature$run$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
