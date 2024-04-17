package com.withings.wiscale2.device.wpm.ui;

import com.withings.device.DeviceModel;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.device.wpm.conversation.WpmMeasureConversation;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import ti0.a;
/* compiled from: Wpm0203Activity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$Wpm02ViewModel$addErrorTimelineItem$1$1", f = "Wpm0203Activity.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_INVALID_SOURCE_PATH, ConstantsWs.WS_STATUS_P4_ERROR_INVALID_CROP_ARGS}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55742a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WpmMeasureConversation f55743b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.d f55744c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f55745d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WpmMeasureConversation wpmMeasureConversation, Wpm0203Activity.d dVar, User user, qm0.d<? super h> dVar2) {
        super(2, dVar2);
        this.f55743b = wpmMeasureConversation;
        this.f55744c = dVar;
        this.f55745d = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f55743b, this.f55744c, this.f55745d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d10.a aVar;
        d10.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55742a;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            WpmMeasureConversation wpmMeasureConversation = this.f55743b;
            wpmMeasureConversation.getClass();
            fl.p a11 = fl.p.f67672b.a();
            cj.b wppDevice = wpmMeasureConversation.x();
            kotlin.jvm.internal.u.j(wppDevice, "wppDevice");
            int b10 = new DeviceModel(a11.f(wppDevice).a(), null).b();
            User user = this.f55745d;
            Wpm0203Activity.d dVar = this.f55744c;
            if (b10 == 42) {
                aVar = dVar.f55647f;
                long q11 = user.q();
                c10.c<?> a12 = a.C1674a.a();
                this.f55742a = 1;
                if (aVar.a(q11, a12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (b10 == 43 && wr.b.c(FeatureFlag.f39124p0)) {
                aVar2 = dVar.f55647f;
                long q12 = user.q();
                c10.c<?> b11 = a.C1674a.b();
                this.f55742a = 2;
                if (aVar2.a(q12, b11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
