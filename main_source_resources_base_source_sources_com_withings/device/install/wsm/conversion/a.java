package com.withings.device.install.wsm.conversion;

import com.withings.user.User;
import u70.b;
/* compiled from: WsmAssignmentConversation.java */
/* loaded from: classes3.dex */
final class a implements b<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ User f37375a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(User user) {
        this.f37375a = user;
    }

    @Override // u70.b
    public final boolean isMatching(User user) {
        if (user.q() == this.f37375a.q()) {
            return true;
        }
        return false;
    }
}
