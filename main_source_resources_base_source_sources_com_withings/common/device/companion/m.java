package com.withings.common.device.companion;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompanionLinkActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.companion.CompanionLinkViewModel$success$1", f = "CompanionLinkActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f35121a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f35122b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, String str, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f35121a = gVar;
        this.f35122b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f35121a, this.f35122b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kn.e eVar;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        g gVar = this.f35121a;
        eVar = gVar.f35098b;
        device = gVar.f35101e;
        device.setCompanionMac(this.f35122b);
        eVar.t(device);
        return y.f85009a;
    }
}
