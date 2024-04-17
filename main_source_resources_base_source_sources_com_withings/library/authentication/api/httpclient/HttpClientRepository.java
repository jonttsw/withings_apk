package com.withings.library.authentication.api.httpclient;

import com.withings.library.authentication.login.Server;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qk0.a;
import qk0.f;
/* compiled from: HttpClientRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R0\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "", "Lcom/withings/library/authentication/login/Server;", "server", "Lqk0/a;", "getHttpClient", "(Lcom/withings/library/authentication/login/Server;)Lqk0/a;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "httpClientMap", "Ljava/util/HashMap;", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HttpClientRepository {
    private final HashMap<Server, a> httpClientMap = new HashMap<>();

    public final a getHttpClient(Server server) {
        u.j(server, "server");
        HashMap<Server, a> hashMap = this.httpClientMap;
        a aVar = hashMap.get(server);
        if (aVar == null) {
            aVar = f.a(new HttpClientRepository$getHttpClient$1$1(server));
            hashMap.put(server, aVar);
        }
        return aVar;
    }
}
