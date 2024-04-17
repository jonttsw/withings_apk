package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl;
import com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo;
import com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NeedMailResultSensitiveActionStateFactoryImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "()V", "build", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "email", "", "server", "Lcom/withings/library/authentication/login/Server;", "buildWithRepo", "needMailResultSensitiveActionState", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateFactoryImpl implements NeedMailResultSensitiveActionStateFactory {
    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory
    public NeedMailResultSensitiveActionState build(String email, Server server) {
        u.j(email, "email");
        u.j(server, "server");
        return new NeedMailResultSensitiveActionStateImpl(email, server);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory
    public NeedMailResultSensitiveActionState buildWithRepo(String email, Server server) {
        u.j(email, "email");
        u.j(server, "server");
        return buildWithRepo(build(email, server));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory
    public NeedMailResultSensitiveActionState buildWithRepo(NeedMailResultSensitiveActionState needMailResultSensitiveActionState) {
        u.j(needMailResultSensitiveActionState, "needMailResultSensitiveActionState");
        return new NeedMailResultSensitiveActionStateWithRepo(needMailResultSensitiveActionState);
    }
}
