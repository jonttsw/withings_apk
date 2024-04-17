package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.login.Environment;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.impl.NeedMailSensitiveActionStateImpl;
import com.withings.library.authentication.sensitiveaction.impl.NeedMailSensitiveActionStateWithRepo;
import com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ym0.a;
/* compiled from: NeedMailSensitiveActionStateFactoryImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "build", "(Lym0/a;)Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "buildWithRepo", "", "serverId", "buildFromServerId", "(I)Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "needMailSensitiveActionState", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Lcom/withings/library/authentication/login/Environment;", "environment", "Lym0/a;", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailSensitiveActionStateFactoryImpl implements NeedMailSensitiveActionStateFactory {
    private final a<Environment> environment;

    /* JADX WARN: Multi-variable type inference failed */
    public NeedMailSensitiveActionStateFactoryImpl(a<? extends Environment> environment) {
        u.j(environment, "environment");
        this.environment = environment;
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory
    public NeedMailSensitiveActionState build(a<? extends Server> server) {
        u.j(server, "server");
        return new NeedMailSensitiveActionStateImpl(server);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory
    public NeedMailSensitiveActionState buildFromServerId(int i11) {
        return build(new NeedMailSensitiveActionStateFactoryImpl$buildFromServerId$1(this, i11));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory
    public NeedMailSensitiveActionState buildWithRepo(a<? extends Server> server) {
        u.j(server, "server");
        return buildWithRepo(build(server));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory
    public NeedMailSensitiveActionState buildWithRepo(NeedMailSensitiveActionState needMailSensitiveActionState) {
        u.j(needMailSensitiveActionState, "needMailSensitiveActionState");
        return new NeedMailSensitiveActionStateWithRepo(needMailSensitiveActionState);
    }
}
