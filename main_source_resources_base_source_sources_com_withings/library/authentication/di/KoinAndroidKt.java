package com.withings.library.authentication.di;

import com.withings.library.authentication.host.AuthenticationDependenciesBuilder;
import com.withings.library.authentication.login.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import oq0.b;
import ym0.a;
/* compiled from: KoinAndroid.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loq0/b;", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Environment;", "environment", "Lcom/withings/library/authentication/host/AuthenticationDependenciesBuilder;", "dependenciesBuilder", "Lnm0/y;", "initAuthentication", "(Loq0/b;Lym0/a;Lcom/withings/library/authentication/host/AuthenticationDependenciesBuilder;)V", "Authentication_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinAndroidKt {
    public static final void initAuthentication(b bVar, a<? extends Environment> environment, AuthenticationDependenciesBuilder dependenciesBuilder) {
        u.j(bVar, "<this>");
        u.j(environment, "environment");
        u.j(dependenciesBuilder, "dependenciesBuilder");
        KoinAndroidKt$initAuthentication$1 koinAndroidKt$initAuthentication$1 = new KoinAndroidKt$initAuthentication$1(dependenciesBuilder);
        uq0.a aVar = new uq0.a(false);
        koinAndroidKt$initAuthentication$1.invoke((KoinAndroidKt$initAuthentication$1) aVar);
        bVar.c(aVar, KoinKt.commonModule(environment));
        bVar.a();
    }
}
