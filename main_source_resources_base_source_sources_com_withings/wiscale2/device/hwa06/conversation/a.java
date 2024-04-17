package com.withings.wiscale2.device.hwa06.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* compiled from: Hwa06SyncConversation.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa06SyncConversation f54308a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Hwa06SyncConversation hwa06SyncConversation) {
        super(0);
        this.f54308a = hwa06SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54308a.x().g());
    }
}
