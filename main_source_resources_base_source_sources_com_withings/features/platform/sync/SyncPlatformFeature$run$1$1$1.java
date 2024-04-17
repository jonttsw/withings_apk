package com.withings.features.platform.sync;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.Instant;
import ym0.p;
/* compiled from: SyncPlatformFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.features.platform.sync.SyncPlatformFeature$run$1$1$1", f = "SyncPlatformFeature.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SyncPlatformFeature$run$1$1$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ long $it;
    int label;
    final /* synthetic */ SyncPlatformFeature this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPlatformFeature$run$1$1$1(SyncPlatformFeature syncPlatformFeature, long j5, qm0.d<? super SyncPlatformFeature$run$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = syncPlatformFeature;
        this.$it = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new SyncPlatformFeature$run$1$1$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        vr.c cVar;
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
            cVar = this.this$0.featureTagsLastUpdateRepository;
            Instant ofEpochSecond = Instant.ofEpochSecond(this.$it);
            u.i(ofEpochSecond, "ofEpochSecond(...)");
            this.label = 1;
            if (cVar.a(ofEpochSecond, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((SyncPlatformFeature$run$1$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
