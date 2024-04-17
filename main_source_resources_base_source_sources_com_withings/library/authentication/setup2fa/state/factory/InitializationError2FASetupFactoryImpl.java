package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.InitializationError2FASetup;
import com.withings.library.authentication.setup2fa.state.impl.InitializationError2FASetupImpl;
import com.withings.library.authentication.setup2fa.state.impl.InitializationError2FASetupWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: InitializationError2FASetupFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactoryImpl;", "Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "()V", "build", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup;", "errorType", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$ErrorType;", "buildWithRepo", "initializationError2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationError2FASetupFactoryImpl implements InitializationError2FASetupFactory {
    @Override // com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory
    public InitializationError2FASetup build(InitializationError2FASetup.ErrorType errorType) {
        u.j(errorType, "errorType");
        return new InitializationError2FASetupImpl(errorType);
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory
    public InitializationError2FASetup buildWithRepo(InitializationError2FASetup.ErrorType errorType) {
        u.j(errorType, "errorType");
        return buildWithRepo(build(errorType));
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory
    public InitializationError2FASetup buildWithRepo(InitializationError2FASetup initializationError2FASetup) {
        u.j(initializationError2FASetup, "initializationError2FASetup");
        return new InitializationError2FASetupWithRepo(initializationError2FASetup);
    }
}
