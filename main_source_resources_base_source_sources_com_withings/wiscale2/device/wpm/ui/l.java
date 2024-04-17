package com.withings.wiscale2.device.wpm.ui;

import com.withings.device.Device;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: Wpm0203Activity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$Wpm02ViewModel$updateLastUsedDevice$1", f = "Wpm0203Activity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.d f55773a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u70.i f55774b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DateTime f55775c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Wpm0203Activity.d dVar, u70.i iVar, DateTime dateTime, qm0.d<? super l> dVar2) {
        super(2, dVar2);
        this.f55773a = dVar;
        this.f55774b = iVar;
        this.f55775c = dateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l(this.f55773a, this.f55774b, this.f55775c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kn.e eVar;
        kn.e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Wpm0203Activity.d dVar = this.f55773a;
        eVar = dVar.f55646e;
        Device f11 = eVar.f(this.f55774b);
        if (f11 != null) {
            f11.setLastUseDate(this.f55775c);
            eVar2 = dVar.f55646e;
            eVar2.t(f11);
        }
        dVar.A0().postValue(null);
        return nm0.y.f85009a;
    }
}
