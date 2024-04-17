package com.withings.wiscale2.appupgrade;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnUpgradeReceiver.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.WS_STATUS_WRONGMEASTYPE, ConstantsWs.WS_STATUS_WRONGUSERID, ConstantsWs.WS_STATUS_WRONGDEVICETYPE}, m = "migrateTabsIndicationStateRepository")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    OnUpgradeReceiver f50099a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f50100b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OnUpgradeReceiver f50101c;

    /* renamed from: d  reason: collision with root package name */
    int f50102d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super c> dVar) {
        super(dVar);
        this.f50101c = onUpgradeReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f50100b = obj;
        this.f50102d |= Integer.MIN_VALUE;
        return OnUpgradeReceiver.b(this.f50101c, this);
    }
}
