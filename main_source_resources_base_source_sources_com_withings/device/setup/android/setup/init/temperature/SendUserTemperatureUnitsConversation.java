package com.withings.device.setup.android.setup.init.temperature;

import ah.g;
import ah.t;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SendUserTemperatureUnitsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/temperature/SendUserTemperatureUnitsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendUserTemperatureUnitsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final w f37453f;

    /* compiled from: SendUserTemperatureUnitsConversation.kt */
    @e(c = "com.withings.device.setup.android.setup.init.temperature.SendUserTemperatureUnitsConversation$run$units$1", f = "SendUserTemperatureUnitsConversation.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super v>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37454a;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super v> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f37454a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                w wVar = SendUserTemperatureUnitsConversation.this.f37453f;
                this.f37454a = 1;
                obj = g.q(wVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    public SendUserTemperatureUnitsConversation(w unitPreferencesRepository) {
        u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f37453f = unitPreferencesRepository;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 274, t.q(((v) runBlocking$default).d()));
        aVar.j();
    }
}
