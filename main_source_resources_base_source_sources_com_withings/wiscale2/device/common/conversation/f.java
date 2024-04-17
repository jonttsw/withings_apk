package com.withings.wiscale2.device.common.conversation;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation$updateMeasureAndSignalOnApp$1$note$1", f = "GetHeartSignalMeasurementsConversation.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50813a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetHeartSignalMeasurementsConversation f50814b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f50815c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f50816d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f50817e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation, User user, String str, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f50814b = getHeartSignalMeasurementsConversation;
        this.f50815c = user;
        this.f50816d = str;
        this.f50817e = heartSignalMeasurement;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f50814b, this.f50815c, this.f50816d, this.f50817e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50813a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            dVar = this.f50814b.f50726o;
            long q11 = this.f50815c.q();
            DateTime timestamp = this.f50817e.getTimestamp();
            this.f50813a = 1;
            obj = dVar.c(q11, timestamp, this.f50816d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
