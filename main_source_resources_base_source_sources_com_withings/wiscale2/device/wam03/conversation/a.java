package com.withings.wiscale2.device.wam03.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* compiled from: Wam03SyncConversation.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam03SyncConversation f54962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wam03SyncConversation wam03SyncConversation) {
        super(0);
        this.f54962a = wam03SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54962a.x().g());
    }
}
