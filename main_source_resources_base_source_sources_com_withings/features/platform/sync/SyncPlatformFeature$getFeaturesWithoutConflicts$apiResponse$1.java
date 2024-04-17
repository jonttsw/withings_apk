package com.withings.features.platform.sync;

import com.withings.feature.platform.model.PlatformFeatureListWS;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncPlatformFeature.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.features.platform.sync.SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1", f = "SyncPlatformFeature.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1 extends i implements p<CoroutineScope, qm0.d<? super PlatformFeatureListWS>, Object> {
    int label;
    final /* synthetic */ SyncPlatformFeature this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1(SyncPlatformFeature syncPlatformFeature, qm0.d<? super SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1> dVar) {
        super(2, dVar);
        this.this$0 = syncPlatformFeature;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        qr.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            aVar = this.this$0.platformFeatureApi;
            qr.a withSyncContext = aVar.withSyncContext(this.this$0.getSyncContext());
            this.label = 1;
            obj = withSyncContext.getPlatformFeatures(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super PlatformFeatureListWS> dVar) {
        return ((SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
