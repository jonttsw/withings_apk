package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52987a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f52988b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l1.a f52989c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Short> f52990d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<String> f52991e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f52992f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m mVar, f1 f1Var, l1.a aVar, List<Short> list, List<String> list2, int i11) {
        super(2);
        this.f52987a = mVar;
        this.f52988b = f1Var;
        this.f52989c = aVar;
        this.f52990d = list;
        this.f52991e = list2;
        this.f52992f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52992f | 1);
        List<Short> list = this.f52990d;
        List<String> list2 = this.f52991e;
        m.A1(this.f52987a, this.f52988b, this.f52989c, list, list2, aVar, g11);
        return nm0.y.f85009a;
    }
}
