package com.withings.library.authentication.di;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.login.Environment;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import uq0.a;
import v9.e;
/* compiled from: Koin.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a4\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\r\u0018\u0001*\u00020\u000e2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f\"\u0004\u0018\u00010\u0010H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Environment;", "environment", "Luq0/a;", "commonModule", "(Lym0/a;)Luq0/a;", "Lpq0/a;", "", RemoteMessageConst.Notification.TAG, "Lnm0/g;", "Lv9/e;", "injectLogger", "(Lpq0/a;Ljava/lang/String;)Lnm0/g;", "T", "Lyq0/a;", "", "", "params", "getWith", "(Lyq0/a;[Ljava/lang/Object;)Ljava/lang/Object;", "Authentication_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinKt {
    public static final a commonModule(ym0.a<? extends Environment> environment) {
        u.j(environment, "environment");
        KoinKt$commonModule$1 koinKt$commonModule$1 = new KoinKt$commonModule$1(environment);
        a aVar = new a(false);
        koinKt$commonModule$1.invoke((KoinKt$commonModule$1) aVar);
        return aVar;
    }

    public static final /* synthetic */ <T> T getWith(yq0.a aVar, Object... params) {
        u.j(aVar, "<this>");
        u.j(params, "params");
        new KoinKt$getWith$1(params);
        u.o();
        throw null;
    }

    public static final g<e> injectLogger(pq0.a aVar, String tag) {
        u.j(aVar, "<this>");
        u.j(tag, "tag");
        return h.a(LazyThreadSafetyMode.f76136a, new KoinKt$injectLogger$$inlined$inject$default$1(aVar, null, new KoinKt$injectLogger$1(tag)));
    }
}
