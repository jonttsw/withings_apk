package com.withings.device.details.wsd.programs;

import android.content.Context;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdProgramActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.WsdProgramActivity$handleWebRadioResult$2$1", f = "WsdProgramActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdProgramActivity f37120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WsdProgramActivity wsdProgramActivity, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f37120a = wsdProgramActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f37120a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WsdSetProgramConversation U3;
        DeviceAlarm V3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        rg.b b10 = rg.b.b();
        WsdProgramActivity wsdProgramActivity = this.f37120a;
        U3 = wsdProgramActivity.U3();
        Context r7 = U3.r();
        V3 = wsdProgramActivity.V3();
        b10.k(r7, V3, WsdProgramActivity.G3(wsdProgramActivity));
        return y.f85009a;
    }
}
