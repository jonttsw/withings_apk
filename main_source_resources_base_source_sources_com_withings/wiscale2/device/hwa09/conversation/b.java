package com.withings.wiscale2.device.hwa09.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* compiled from: Hwa0910SyncConversation.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa0910SyncConversation f54535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Hwa0910SyncConversation hwa0910SyncConversation) {
        super(0);
        this.f54535a = hwa0910SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54535a.x().g());
    }
}
