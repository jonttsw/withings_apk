package com.withings.library.authentication.api.account.partnersession;

import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.SessionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: PartnerSessionResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"toSessions", "", "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/api/account/partnersession/PartnerSessionResponse;", "server", "Lcom/withings/library/authentication/login/Server;", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PartnerSessionResponseKt {
    public static final List<Session> toSessions(PartnerSessionResponse partnerSessionResponse, Server server, LoginMethod loginMethod) {
        u.j(partnerSessionResponse, "<this>");
        u.j(server, "server");
        u.j(loginMethod, "loginMethod");
        List<PartnerSession> partnerSessions = partnerSessionResponse.getPartnerSessions();
        ArrayList arrayList = new ArrayList(x.y(partnerSessions, 10));
        Iterator it = partnerSessions.iterator();
        while (it.hasNext()) {
            PartnerSession partnerSession = (PartnerSession) it.next();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Session(partnerSession.getAccount().getAccountId(), partnerSession.getSessionId(), partnerSession.getProviderToken(), partnerSession.getAuthToken(), partnerSession.isSecured(), partnerSession.getRequireSecureSession(), partnerSession.getTimeToLive() + partnerSession.getCreationTime(), ProviderType.WITHINGS.INSTANCE, server, SessionType.PARTNER, loginMethod));
            it = it;
            arrayList = arrayList2;
        }
        return arrayList;
    }
}
