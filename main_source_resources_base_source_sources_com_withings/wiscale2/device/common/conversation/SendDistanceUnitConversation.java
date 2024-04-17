package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.UserUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import l70.w;
import nm0.y;
/* compiled from: SendDistanceUnitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SendDistanceUnitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SendDistanceUnitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final w f50739f = w.a.a();

    /* compiled from: SendDistanceUnitConversation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.SendDistanceUnitConversation$run$distanceUnit$1", f = "SendDistanceUnitConversation.kt", l = {16}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super l70.v>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50740a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super l70.v> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50740a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                w wVar = SendDistanceUnitConversation.this.f50739f;
                this.f50740a = 1;
                obj = ah.g.q(wVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Object runBlocking$default;
        int i11;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
        int b10 = ((l70.v) runBlocking$default).b();
        nj.a aVar = new nj.a(x());
        UserUnit userUnit = new UserUnit();
        userUnit.cmd = (short) 0;
        userUnit.type = 2;
        if (b10 != 6) {
            i11 = 25;
        } else {
            i11 = 24;
        }
        userUnit.unit = i11;
        aVar.c((short) 274, userUnit);
        aVar.j();
    }
}
