package com.withings.wiscale2.device.wpm.ui;

import android.os.Bundle;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpm0203Activity.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.p<u70.i, MeasuresGroup, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity f55790a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f55791b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f55792c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Wpm0203Activity wpm0203Activity, User user, boolean z5) {
        super(2);
        this.f55790a = wpm0203Activity;
        this.f55791b = user;
        this.f55792c = z5;
    }

    @Override // ym0.p
    public final nm0.y invoke(u70.i iVar, MeasuresGroup measuresGroup) {
        u70.i macAddr = iVar;
        MeasuresGroup measGroup = measuresGroup;
        kotlin.jvm.internal.u.j(macAddr, "macAddr");
        kotlin.jvm.internal.u.j(measGroup, "measGroup");
        c0.f55708w.getClass();
        c0 c0Var = new c0();
        Bundle bundle = new Bundle();
        User user = this.f55791b;
        if (user != null) {
            bundle.putParcelable("extra_user", user);
        }
        bundle.putSerializable("extra_mac_address", macAddr);
        bundle.putSerializable("measureGroup", measGroup);
        bundle.putBoolean("is_triple_measure", this.f55792c);
        c0Var.setArguments(bundle);
        this.f55790a.f55625l = c0Var;
        return nm0.y.f85009a;
    }
}
