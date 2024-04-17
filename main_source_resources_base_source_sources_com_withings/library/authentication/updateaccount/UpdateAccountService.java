package com.withings.library.authentication.updateaccount;

import com.withings.library.authentication.api.account.AccountContext;
import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: UpdateAccountService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "", "", "sessionId", "", "accountId", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountContext", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "accountContextRequest", "Lnm0/y;", "updateAccountContext", "(Lcom/withings/library/authentication/updateaccount/AccountContextRequest;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface UpdateAccountService {
    Object getAccountContext(String str, long j5, Server server, d<? super AccountContext> dVar);

    Object updateAccountContext(AccountContextRequest accountContextRequest, d<? super y> dVar);
}
