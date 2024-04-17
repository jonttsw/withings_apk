package com.withings.wiscale2.device.common.conversation;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation$generateAndSaveMeasurement$1$1", f = "GetHeartSignalMeasurementsConversation.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super HeartSignalMeasurement>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50801a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sq.a f50802b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f50803c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HeartSignalMeasurement heartSignalMeasurement, sq.a aVar, qm0.d dVar) {
        super(2, dVar);
        this.f50802b = aVar;
        this.f50803c = heartSignalMeasurement;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f50803c, this.f50802b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super HeartSignalMeasurement> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50801a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f50801a = 1;
            obj = this.f50802b.h(this.f50803c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
