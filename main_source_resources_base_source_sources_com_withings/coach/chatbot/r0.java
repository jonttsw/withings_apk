package com.withings.coach.chatbot;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatbotViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$setInsightToReadIfEndIsReached$2$1", f = "ChatbotViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGENDMACADDRESS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class r0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33113a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0 f33114b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var, qm0.d<? super r0> dVar) {
        super(2, dVar);
        this.f33114b = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r0(this.f33114b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f33113a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ti.d dVar = this.f33114b.f33051d;
            this.f33113a = 1;
            if (dVar.a(true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
