package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f52855a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l1.a f52856b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f1 f1Var, l1.a aVar) {
        super(1);
        this.f52855a = f1Var;
        this.f52856b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        boolean c11 = this.f52856b.c();
        f1 f1Var = this.f52855a;
        f1Var.getClass();
        if (c11) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(f1Var), Dispatchers.getIO(), null, new e1(f1Var, booleanValue, null), 2, null);
        }
        return nm0.y.f85009a;
    }
}
