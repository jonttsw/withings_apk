package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
import org.jivesoftware.smackx.shim.packet.Header;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l1.a f52978a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f52979b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f52980c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Short> f52981d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<String> f52982e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m mVar, f1 f1Var, l1.a aVar, List list, List list2) {
        super(1);
        this.f52978a = aVar;
        this.f52979b = mVar;
        this.f52980c = f1Var;
        this.f52981d = list;
        this.f52982e = list2;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        h0 h0Var;
        k0 k0Var;
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        s0.i0.g(LazyColumn, Header.ELEMENT, c.f52840a, 2);
        l1.a aVar = this.f52978a;
        h1 d11 = aVar.d();
        kotlin.jvm.internal.u.j(d11, "<this>");
        boolean z5 = !kotlin.collections.x.q(Boolean.valueOf(d11.a()), Boolean.valueOf(d11.b()), Boolean.valueOf(d11.c())).isEmpty();
        m mVar = this.f52979b;
        if (z5) {
            s0.i0.g(LazyColumn, "health", new s1.a(true, -162109622, new y(mVar, aVar)), 2);
        }
        f1 f1Var = this.f52980c;
        s0.i0.g(LazyColumn, "global", new s1.a(true, -1673351442, new a0(mVar, f1Var, aVar)), 2);
        List<b> b10 = aVar.b();
        int size = b10.size();
        b0 b0Var = b0.f52837a;
        if (b0Var != null) {
            h0Var = new h0(b0Var, b10);
        } else {
            h0Var = null;
        }
        LazyColumn.c(size, h0Var, new i0(b10), new s1.a(true, -1091073711, new j0(this.f52979b, this.f52980c, this.f52978a, b10, this.f52981d)));
        s0.i0.f(LazyColumn, "androidAppSection", new s1.a(true, 1683693538, new e0(mVar, f1Var, aVar)), 2);
        List<a> a11 = aVar.a();
        int size2 = a11.size();
        f0 f0Var = f0.f52872a;
        if (f0Var != null) {
            k0Var = new k0(f0Var, a11);
        } else {
            k0Var = null;
        }
        LazyColumn.c(size2, k0Var, new l0(a11), new s1.a(true, -1091073711, new m0(this.f52979b, this.f52980c, this.f52978a, a11, this.f52982e)));
        return nm0.y.f85009a;
    }
}
