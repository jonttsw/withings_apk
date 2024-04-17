package com.withings.library.authentication.api.httpclient;

import co.touchlab.kermit.Severity;
import com.withings.library.authentication.api.Unwrapper;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.ServerKt;
import el0.f0;
import el0.j0;
import io.ktor.client.plugins.logging.LogLevel;
import io.ktor.client.plugins.p;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import qk0.b;
import qk0.c;
import v9.e;
import vk0.e;
import vk0.g;
import wk0.e;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpClientRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqk0/b;", "Lnm0/y;", "invoke", "(Lqk0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HttpClientRepository$getHttpClient$1$1 extends w implements l<b<?>, y> {
    final /* synthetic */ Server $server;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClientRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/plugins/p$a;", "Lnm0/y;", "invoke", "(Lio/ktor/client/plugins/p$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.api.httpclient.HttpClientRepository$getHttpClient$1$1$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends w implements l<p.a, y> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // ym0.l
        public /* bridge */ /* synthetic */ y invoke(p.a aVar) {
            invoke2(aVar);
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(p.a install) {
            u.j(install, "$this$install");
            install.f(30000L);
            install.g(30000L);
            install.h(30000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientRepository$getHttpClient$1$1(Server server) {
        super(1);
        this.$server = server;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(b<?> HttpClient) {
        u.j(HttpClient, "$this$HttpClient");
        g.b(HttpClient, new AnonymousClass1(this.$server));
        HttpClient.h(e.f105694e, AnonymousClass2.INSTANCE);
        HttpClient.h(p.f72770d, AnonymousClass3.INSTANCE);
        HttpClient.h(Unwrapper.Feature, c.f93271a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClientRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvk0/e$a;", "Lnm0/y;", "invoke", "(Lvk0/e$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.api.httpclient.HttpClientRepository$getHttpClient$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements l<e.a, y> {
        final /* synthetic */ Server $server;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Server server) {
            super(1);
            this.$server = server;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(e.a defaultRequest) {
            u.j(defaultRequest, "$this$defaultRequest");
            defaultRequest.d(ServerKt.getScalewsBaseUrl(this.$server));
            defaultRequest.e(C05471.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HttpClientRepository.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lel0/f0;", "Lnm0/y;", "invoke", "(Lel0/f0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.library.authentication.api.httpclient.HttpClientRepository$getHttpClient$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C05471 extends w implements l<f0, y> {
            public static final C05471 INSTANCE = new C05471();

            C05471() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(f0 url) {
                j0 j0Var;
                u.j(url, "$this$url");
                int i11 = j0.f65664f;
                j0Var = j0.f65662d;
                url.u(j0Var);
            }

            @Override // ym0.l
            public /* bridge */ /* synthetic */ y invoke(f0 f0Var) {
                invoke2(f0Var);
                return y.f85009a;
            }
        }

        @Override // ym0.l
        public /* bridge */ /* synthetic */ y invoke(e.a aVar) {
            invoke2(aVar);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClientRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwk0/e$b;", "Lnm0/y;", "invoke", "(Lwk0/e$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.library.authentication.api.httpclient.HttpClientRepository$getHttpClient$1$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends w implements l<e.b, y> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.library.authentication.api.httpclient.HttpClientRepository$getHttpClient$1$1$2$1] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(e.b install) {
            u.j(install, "$this$install");
            install.f(new wk0.c() { // from class: com.withings.library.authentication.api.httpclient.HttpClientRepository.getHttpClient.1.1.2.1
                @Override // wk0.c
                public void log(String message) {
                    u.j(message, "message");
                    e.a aVar = v9.e.f103480c;
                    Severity a11 = aVar.c().a();
                    Severity severity = Severity.f23168b;
                    if (a11.compareTo(severity) <= 0) {
                        aVar.f(severity, "Kermit", message, null);
                    }
                }
            });
            LogLevel logLevel = LogLevel.f72739d;
            install.e();
        }

        @Override // ym0.l
        public /* bridge */ /* synthetic */ y invoke(e.b bVar) {
            invoke2(bVar);
            return y.f85009a;
        }
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(b<?> bVar) {
        invoke2(bVar);
        return y.f85009a;
    }
}
