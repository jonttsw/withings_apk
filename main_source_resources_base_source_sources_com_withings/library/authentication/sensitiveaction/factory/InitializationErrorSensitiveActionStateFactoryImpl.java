package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl;
import com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo;
import com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: InitializationErrorSensitiveActionStateFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "()V", "build", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "errorType", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "buildWithRepo", "initializationErrorSensitiveActionState", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationErrorSensitiveActionStateFactoryImpl implements InitializationErrorSensitiveActionStateFactory {
    @Override // com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory
    public InitializationErrorSensitiveActionState build(InitializationErrorSensitiveActionState.ErrorType errorType) {
        u.j(errorType, "errorType");
        return new InitializationErrorSensitiveActionStateImpl(errorType);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory
    public InitializationErrorSensitiveActionState buildWithRepo(InitializationErrorSensitiveActionState.ErrorType errorType) {
        u.j(errorType, "errorType");
        return new InitializationErrorSensitiveActionStateWithRepo(build(errorType));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory
    public InitializationErrorSensitiveActionState buildWithRepo(InitializationErrorSensitiveActionState initializationErrorSensitiveActionState) {
        u.j(initializationErrorSensitiveActionState, "initializationErrorSensitiveActionState");
        return new InitializationErrorSensitiveActionStateWithRepo(initializationErrorSensitiveActionState);
    }
}
