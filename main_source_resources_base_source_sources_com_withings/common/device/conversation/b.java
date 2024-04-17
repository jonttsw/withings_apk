package com.withings.common.device.conversation;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: GetMeasureAndRemoteSyncConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.conversation.GetMeasureAndRemoteSyncConversation$storeWppMeasuresGroups$1", f = "GetMeasureAndRemoteSyncConversation.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35165a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetMeasureAndRemoteSyncConversation f35166b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f35167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetMeasureAndRemoteSyncConversation getMeasureAndRemoteSyncConversation, List<ky.d> list, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f35166b = getMeasureAndRemoteSyncConversation;
        this.f35167c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f35166b, this.f35167c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35165a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            this.f35165a = 1;
            if (GetMeasureAndRemoteSyncConversation.O(this.f35166b, this.f35167c, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
