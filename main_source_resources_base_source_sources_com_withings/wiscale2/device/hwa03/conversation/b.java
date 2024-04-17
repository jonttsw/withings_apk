package com.withings.wiscale2.device.hwa03.conversation;

import dj.t;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hwa03SyncConversation.kt */
/* loaded from: classes5.dex */
public final class b extends w implements ym0.a<t> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03SyncConversation f54231a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Hwa03SyncConversation hwa03SyncConversation) {
        super(0);
        this.f54231a = hwa03SyncConversation;
    }

    @Override // ym0.a
    public final t invoke() {
        return ej.w.w().E(this.f54231a.x().g());
    }
}
