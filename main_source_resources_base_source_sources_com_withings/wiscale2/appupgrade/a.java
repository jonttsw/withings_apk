package com.withings.wiscale2.appupgrade;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnUpgradeReceiver.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver", f = "OnUpgradeReceiver.kt", l = {221, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS}, m = "deleteTutorialNotificationsWithoutDevice")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    OnUpgradeReceiver f50092a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f50093b;

    /* renamed from: c  reason: collision with root package name */
    long f50094c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f50095d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ OnUpgradeReceiver f50096e;

    /* renamed from: f  reason: collision with root package name */
    int f50097f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super a> dVar) {
        super(dVar);
        this.f50096e = onUpgradeReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f50095d = obj;
        this.f50097f |= Integer.MIN_VALUE;
        return OnUpgradeReceiver.a(this.f50096e, this);
    }
}
