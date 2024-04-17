package com.withings.device.details.wsd.programs;

import android.content.Context;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdProgramActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.WsdProgramActivity$updateProgram$1$1", f = "WsdProgramActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f37169a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WsdProgramActivity f37170b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeviceAlarm f37171c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ short f37172d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WsdProgramActivity wsdProgramActivity, DeviceAlarm deviceAlarm, short s11, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f37170b = wsdProgramActivity;
        this.f37171c = deviceAlarm;
        this.f37172d = s11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        c cVar = new c(this.f37170b, this.f37171c, this.f37172d, dVar);
        cVar.f37169a = obj;
        return cVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        WsdSetProgramConversation U3;
        WsdSetProgramConversation U32;
        DeviceAlarm V3;
        WsdProgramActivity wsdProgramActivity = this.f37170b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f37169a;
        try {
            rg.b b10 = rg.b.b();
            U32 = wsdProgramActivity.U3();
            Context r7 = U32.r();
            V3 = wsdProgramActivity.V3();
            b10.k(r7, V3, WsdProgramActivity.G3(wsdProgramActivity));
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            U3 = wsdProgramActivity.U3();
            U3.d0(this.f37171c, this.f37172d);
        }
        return y.f85009a;
    }
}
