package com.withings.wiscale2;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.network.core.LogLevel;
import javax.inject.Inject;
import javax.inject.Singleton;
import s00.d;
/* compiled from: DefaultWebServicesDelegate.kt */
@Singleton
/* loaded from: classes4.dex */
public final class g1 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final jg.c f56123a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56124b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56125c;

    /* renamed from: d  reason: collision with root package name */
    private final LogLevel f56126d;

    @Inject
    public g1(jg.a aVar, Context context) {
        this.f56123a = aVar;
        kotlin.jvm.internal.u.i(context.getString(C1987R.string._LANG_CODE_), "getString(...)");
        this.f56124b = ConstantsWs.APPNAME_WISCALENG;
        this.f56125c = 6040016;
        this.f56126d = LogLevel.f42817a;
    }

    public final String a() {
        return this.f56123a.c();
    }

    public final String b() {
        return this.f56123a.a();
    }

    @Override // s00.d.a
    public final String getAppName() {
        return this.f56124b;
    }

    @Override // s00.d.a
    public final int getAppVersion() {
        return this.f56125c;
    }

    @Override // s00.d.a
    public final d.b getDefaultWSHandlerDelegate() {
        return null;
    }

    @Override // s00.d.a
    public final LogLevel getLogLevel() {
        return this.f56126d;
    }

    @Override // s00.d.a
    public final String getMainRootUrl() {
        return this.f56123a.b();
    }
}
