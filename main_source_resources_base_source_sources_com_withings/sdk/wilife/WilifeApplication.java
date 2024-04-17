package com.withings.sdk.wilife;

import android.app.Application;
import fn0.k;
import kotlin.Metadata;
/* compiled from: WilifeApplication.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/sdk/wilife/WilifeApplication;", "Landroid/app/Application;", "<init>", "()V", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class WilifeApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        k<Object>[] kVarArr = b.f43972a;
        new p40.d(this, new r40.a(this));
        new a(this);
    }
}
