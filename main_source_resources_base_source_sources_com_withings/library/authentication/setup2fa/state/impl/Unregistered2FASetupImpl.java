package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.setup2fa.state.Unregistered2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
/* compiled from: Unregistered2FASetupImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/Unregistered2FASetupImpl;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "startSetupSequence", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory$delegate", "Lnm0/g;", "getNeedPhoneNumber2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory", "<init>", "(Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Unregistered2FASetupImpl implements Unregistered2FASetup, a {
    private final g needPhoneNumber2FASetupFactory$delegate;
    private final com.withings.library.authentication.login.Session session;

    public Unregistered2FASetupImpl(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        this.session = session;
        this.needPhoneNumber2FASetupFactory$delegate = h.a(LazyThreadSafetyMode.f76136a, new Unregistered2FASetupImpl$special$$inlined$inject$default$1(this, null, null));
    }

    private final NeedPhoneNumber2FASetupFactory getNeedPhoneNumber2FASetupFactory() {
        return (NeedPhoneNumber2FASetupFactory) this.needPhoneNumber2FASetupFactory$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.setup2fa.state.Unregistered2FASetup
    public Object startSetupSequence(d<? super Unregistered2FASetup.StartSetup2FAOutputState> dVar) {
        return new Unregistered2FASetup.StartSetup2FAOutputState.SuccessNeedPhoneNumber2FA(getNeedPhoneNumber2FASetupFactory().build(this.session));
    }
}
