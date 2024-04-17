package com.withings.wiscale2.device.hwa11.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* compiled from: Hwa11SyncConversation.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa11SyncConversation f54620a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Hwa11SyncConversation hwa11SyncConversation) {
        super(0);
        this.f54620a = hwa11SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54620a.x().g());
    }
}
