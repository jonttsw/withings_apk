package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.impl.NeedAccountCreationImpl;
import com.withings.library.authentication.login.state.impl.NeedAccountCreationMulti;
import com.withings.library.authentication.login.state.impl.NeedAccountCreationWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NeedAccountCreationFactoryImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "()V", "buildNeedAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "email", "", "accountCreationToken", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "server", "Lcom/withings/library/authentication/login/Server;", "buildNeedAccountCreationMulti", "buildNeedAccountCreationWithRepo", "needAccountCreation", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedAccountCreationFactoryImpl implements NeedAccountCreationFactory {
    @Override // com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory
    public NeedAccountCreation buildNeedAccountCreation(String email, String accountCreationToken, ProviderType providerType, Server server) {
        u.j(email, "email");
        u.j(accountCreationToken, "accountCreationToken");
        u.j(providerType, "providerType");
        u.j(server, "server");
        return new NeedAccountCreationImpl(email, accountCreationToken, providerType, server);
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory
    public NeedAccountCreation buildNeedAccountCreationMulti(String email, String accountCreationToken, ProviderType providerType, Server server) {
        u.j(email, "email");
        u.j(accountCreationToken, "accountCreationToken");
        u.j(providerType, "providerType");
        u.j(server, "server");
        return new NeedAccountCreationMulti(buildNeedAccountCreation(email, accountCreationToken, providerType, server));
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory
    public NeedAccountCreation buildNeedAccountCreationWithRepo(NeedAccountCreation needAccountCreation) {
        u.j(needAccountCreation, "needAccountCreation");
        return new NeedAccountCreationWithRepo(needAccountCreation);
    }
}
