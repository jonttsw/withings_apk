package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.device.Device;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$toggleAllAndroidApp$1", f = "DeviceNotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f52870a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f52871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, boolean z5, qm0.d<? super e1> dVar) {
        super(2, dVar);
        this.f52870a = f1Var;
        this.f52871b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e1(this.f52870a, this.f52871b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        gb0.c cVar;
        gb0.c cVar2;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f1 f1Var = this.f52870a;
        cVar = f1Var.f52875c;
        List<gb0.a> j5 = cVar.j();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(j5, 10));
        for (gb0.a aVar : j5) {
            arrayList.add(aVar.a().b());
        }
        cVar2 = f1Var.f52875c;
        device = f1Var.f52874b;
        u70.i macAddress = device.getMacAddress();
        kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
        cVar2.o(arrayList, this.f52871b, macAddress);
        return nm0.y.f85009a;
    }
}
