package com.withings.wiscale2.device.hwa08.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* compiled from: Hwa08SyncConversation.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08SyncConversation f54399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Hwa08SyncConversation hwa08SyncConversation) {
        super(0);
        this.f54399a = hwa08SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54399a.x().g());
    }
}
