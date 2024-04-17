package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.login.Environment;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl;
import com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ym0.a;
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateFactoryImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "build", "(Lym0/a;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "", "serverId", "buildFromServerId", "(I)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "buildWithRepo", "needGoogleSignInInfoSensitiveActionState", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lcom/withings/library/authentication/login/Environment;", "environment", "Lym0/a;", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateFactoryImpl implements NeedGoogleSignInInfoSensitiveActionStateFactory {
    private final a<Environment> environment;

    /* JADX WARN: Multi-variable type inference failed */
    public NeedGoogleSignInInfoSensitiveActionStateFactoryImpl(a<? extends Environment> environment) {
        u.j(environment, "environment");
        this.environment = environment;
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory
    public NeedGoogleSignInInfoSensitiveActionState build(a<? extends Server> server) {
        u.j(server, "server");
        return new NeedGoogleSignInInfoSensitiveActionStateImpl(server);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory
    public NeedGoogleSignInInfoSensitiveActionState buildFromServerId(int i11) {
        return build(new NeedGoogleSignInInfoSensitiveActionStateFactoryImpl$buildFromServerId$1(this, i11));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory
    public NeedGoogleSignInInfoSensitiveActionState buildWithRepo(a<? extends Server> server) {
        u.j(server, "server");
        return buildWithRepo(build(server));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory
    public NeedGoogleSignInInfoSensitiveActionState buildWithRepo(NeedGoogleSignInInfoSensitiveActionState needGoogleSignInInfoSensitiveActionState) {
        u.j(needGoogleSignInInfoSensitiveActionState, "needGoogleSignInInfoSensitiveActionState");
        return new NeedGoogleSignInInfoSensitiveActionStateWithRepo(needGoogleSignInInfoSensitiveActionState);
    }
}
