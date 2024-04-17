package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: InitializationErrorSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/library/authentication/login/Server;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InitializationErrorSensitiveActionStateImpl$retryInitialization$2 extends w implements a<Server> {
    final /* synthetic */ Session $authSession;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationErrorSensitiveActionStateImpl$retryInitialization$2(Session session) {
        super(0);
        this.$authSession = session;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Server invoke() {
        return this.$authSession.getServer();
    }
}
