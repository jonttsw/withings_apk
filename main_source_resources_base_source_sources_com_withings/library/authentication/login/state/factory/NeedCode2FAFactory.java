package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.Sequence;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedCode2FAFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "", "buildNeedCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "sequence", "Lcom/withings/library/authentication/login/state/Sequence;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "", "buildNeedCode2FAMulti", "needCode2FA", "validSession", "", "buildNeedCode2FAWithRepo", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NeedCode2FAFactory {
    NeedCode2FA buildNeedCode2FA(Sequence sequence, com.withings.library.authentication.login.Session session, String str);

    NeedCode2FA buildNeedCode2FAMulti(NeedCode2FA needCode2FA, List<com.withings.library.authentication.login.Session> list);

    NeedCode2FA buildNeedCode2FAWithRepo(NeedCode2FA needCode2FA);
}
