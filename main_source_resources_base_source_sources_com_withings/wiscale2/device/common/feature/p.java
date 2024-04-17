package com.withings.wiscale2.device.common.feature;

import ah.z;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.h1;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.wiscale2.HealthmateApplication;
import java.io.File;
import javax.inject.Inject;
/* compiled from: FeatureActivationDocumentFragment.kt */
/* loaded from: classes5.dex */
public final class p extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f52402a;

    /* renamed from: b  reason: collision with root package name */
    private final ch.d f52403b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.n<Intent> f52404c;

    /* renamed from: d  reason: collision with root package name */
    private final o f52405d;

    @Inject
    public p(Application application, String str, d dVar, ch.d dVar2) {
        super(application);
        this.f52402a = "feature_activation_doc.pdf";
        this.f52403b = dVar2;
        this.f52404c = new xw.n<>();
        this.f52405d = new o(dVar, h1.a(this), str);
    }

    public final o f0() {
        return this.f52405d;
    }

    public final xw.n<Intent> g0() {
        return this.f52404c;
    }

    public final void i0() {
        Context applicationContext = ((HealthmateApplication) getApplication()).getApplicationContext();
        File file = new File(applicationContext.getCacheDir(), "legal");
        file.mkdirs();
        File file2 = new File(file, this.f52402a);
        int i11 = WithingsFileProvider.f35394f;
        Uri a11 = WithingsFileProvider.a.a(applicationContext, file2);
        Intent addFlags = ((z) this.f52403b.m()).b(applicationContext, a11, false, new HMWebViewDelegate()).addFlags(1);
        kotlin.jvm.internal.u.i(addFlags, "addFlags(...)");
        this.f52404c.postValue(addFlags);
    }
}
