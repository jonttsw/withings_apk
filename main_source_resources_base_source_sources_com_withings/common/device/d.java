package com.withings.common.device;

import com.withings.comm.remote.exception.RestartBluetoothException;
import com.withings.devicesetup.ui.SetupActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import nm0.y;
import xp.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BleOrBluetoothSetupDiscoverer.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.BleOrBluetoothSetupDiscoverer$postTimeout$1", f = "BleOrBluetoothSetupDiscoverer.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35184a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f35185b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f35186c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f35186c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        d dVar2 = new d(this.f35186c, dVar);
        dVar2.f35185b = obj;
        return dVar2;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        SetupActivity setupActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35184a;
        if (i11 != 0) {
            if (i11 == 1) {
                coroutineScope = (CoroutineScope) this.f35185b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f35185b;
            this.f35185b = coroutineScope2;
            this.f35184a = 1;
            if (DelayKt.delay(40000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            b bVar = this.f35186c;
            setupActivity = bVar.f35049b;
            if (!(setupActivity instanceof g.a)) {
                setupActivity = null;
            }
            if (setupActivity != null) {
                setupActivity.L1(new RestartBluetoothException());
            }
            bVar.stop();
        }
        return y.f85009a;
    }
}
