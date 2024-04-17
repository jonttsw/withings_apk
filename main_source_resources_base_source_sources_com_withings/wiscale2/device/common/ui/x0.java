package com.withings.wiscale2.device.common.ui;

import com.withings.comm.wpp.generated.object.ShortcutAction;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.l<ShortcutAction, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceShortcutConversation f54119a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(DeviceShortcutConversation deviceShortcutConversation) {
        super(1);
        this.f54119a = deviceShortcutConversation;
    }

    @Override // ym0.l
    public final nm0.y invoke(ShortcutAction shortcutAction) {
        ShortcutAction it = shortcutAction;
        kotlin.jvm.internal.u.j(it, "it");
        this.f54119a.L().postValue(it);
        return nm0.y.f85009a;
    }
}
