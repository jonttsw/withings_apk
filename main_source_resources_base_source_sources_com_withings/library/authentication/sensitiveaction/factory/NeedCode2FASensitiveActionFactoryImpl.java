package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl;
import com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.Sequence;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedCode2FASensitiveActionFactoryImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "()V", "build", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "phoneNumber", "", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "sequence", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "buildWithRepo", "needCode2FASensitiveAction", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionFactoryImpl implements NeedCode2FASensitiveActionFactory {
    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory
    public NeedCode2FASensitiveAction build(String phoneNumber, com.withings.library.authentication.login.Session session, Sequence sequence) {
        u.j(phoneNumber, "phoneNumber");
        u.j(session, "session");
        u.j(sequence, "sequence");
        return new NeedCode2FASensitiveActionImpl(sequence, session, phoneNumber);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory
    public NeedCode2FASensitiveAction buildWithRepo(String phoneNumber, com.withings.library.authentication.login.Session session, Sequence sequence) {
        u.j(phoneNumber, "phoneNumber");
        u.j(session, "session");
        u.j(sequence, "sequence");
        return buildWithRepo(build(phoneNumber, session, sequence));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory
    public NeedCode2FASensitiveAction buildWithRepo(NeedCode2FASensitiveAction needCode2FASensitiveAction) {
        u.j(needCode2FASensitiveAction, "needCode2FASensitiveAction");
        return new NeedCode2FASensitiveActionWithRepo(needCode2FASensitiveAction);
    }
}
