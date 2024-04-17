package com.withings.wiscale2.device.common.conversation;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.data.TargetRepository;
import com.withings.vasistas.model.Vasistas;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: VasistasSyncConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.VasistasSyncConversation$extractTemperatureTarget$1", f = "VasistasSyncConversation.kt", l = {ConstantsWs.WS_STATUS_TOOMANYASSOCIATIONS}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50847a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VasistasSyncConversation f50848b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Vasistas f50849c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(VasistasSyncConversation vasistasSyncConversation, Vasistas vasistas, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f50848b = vasistasSyncConversation;
        this.f50849c = vasistas;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new r(this.f50848b, this.f50849c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetRepository targetRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50847a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            VasistasSyncConversation vasistasSyncConversation = this.f50848b;
            targetRepository = vasistasSyncConversation.f50776n;
            this.f50847a = 1;
            if (targetRepository.saveTemperatureTarget(vasistasSyncConversation.W().q(), this.f50849c.getCoreTemperature(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
